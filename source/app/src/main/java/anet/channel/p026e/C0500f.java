package anet.channel.p026e;

import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0503b;
import anet.channel.entity.EventCb;
import anet.channel.p026e.C0493a;
import anet.channel.statist.Http3DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.e.f */
/* loaded from: classes2.dex */
public class C0500f implements EventCb {

    /* renamed from: a */
    public final /* synthetic */ IConnStrategy f20494a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC0499e f20495b;

    static {
        Covode.recordClassIndex(2194);
    }

    public C0500f(RunnableC0499e runnableC0499e, IConnStrategy iConnStrategy) {
        this.f20495b = runnableC0499e;
        this.f20494a = iConnStrategy;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i, C0503b c0503b) {
        C0493a.C0495b c0495b;
        String str;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c0495b = C0493a.f20479a;
        c0495b.m20997a(NetworkStatusHelper.getUniqueId(this.f20495b.f20493b), z);
        session.close(false);
        str = C0493a.f20480b;
        Http3DetectStat http3DetectStat = new Http3DetectStat(str, this.f20494a);
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        http3DetectStat.ret = i2;
        AppMonitor.getInstance().commitStat(http3DetectStat);
    }
}
