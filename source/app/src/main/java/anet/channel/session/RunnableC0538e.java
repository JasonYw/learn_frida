package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.entity.C0503b;
import anet.channel.request.Request;
import anet.channel.session.C0534b;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.session.e */
/* loaded from: classes20.dex */
public class RunnableC0538e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Request f20650a;

    /* renamed from: b */
    public final /* synthetic */ C0537d f20651b;

    static {
        Covode.recordClassIndex(2255);
    }

    @Override // java.lang.Runnable
    public void run() {
        C0534b.C0535a m20901a = C0534b.m20901a(this.f20650a, (RequestCb) null);
        if (m20901a.f20643a > 0) {
            this.f20651b.notifyStatus(4, new C0503b(1));
        } else {
            this.f20651b.handleCallbacks(256, new C0503b(256, m20901a.f20643a, "Http connect fail"));
        }
    }

    public RunnableC0538e(C0537d c0537d, Request request) {
        this.f20651b = c0537d;
        this.f20650a = request;
    }
}
