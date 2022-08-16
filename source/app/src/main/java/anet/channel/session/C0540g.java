package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C0503b;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.session.g */
/* loaded from: classes20.dex */
public class C0540g implements RequestCb {

    /* renamed from: a */
    public final /* synthetic */ RunnableC0539f f20656a;

    static {
        Covode.recordClassIndex(2257);
    }

    public C0540g(RunnableC0539f runnableC0539f) {
        this.f20656a = runnableC0539f;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
        this.f20656a.f20653b.onDataReceive(byteArray, z);
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        ALog.m20785i("awcn.HttpSession", "", this.f20656a.f20652a.getSeq(), "httpStatusCode", Integer.valueOf(i));
        ALog.m20785i("awcn.HttpSession", "", this.f20656a.f20652a.getSeq(), "response headers", map);
        this.f20656a.f20653b.onResponseCode(i, map);
        this.f20656a.f20654c.serverRT = HttpHelper.parseServerRT(map);
        this.f20656a.f20655d.handleResponseCode(this.f20656a.f20652a, i);
        this.f20656a.f20655d.handleResponseHeaders(this.f20656a.f20652a, map);
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (i <= 0 && i != -204) {
            this.f20656a.f20655d.handleCallbacks(2, new C0503b(2, 0, "Http connect fail"));
        }
        this.f20656a.f20653b.onFinish(i, str, requestStatistic);
    }
}
