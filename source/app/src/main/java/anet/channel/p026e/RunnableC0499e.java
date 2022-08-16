package anet.channel.p026e;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.C0502a;
import anet.channel.session.TnetSpdySession;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.e.e */
/* loaded from: classes2.dex */
public final class RunnableC0499e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f20492a;

    /* renamed from: b */
    public final /* synthetic */ NetworkStatusHelper.NetworkStatus f20493b;

    static {
        Covode.recordClassIndex(2193);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AtomicInteger atomicInteger;
        IConnStrategy m21006b;
        IConnStrategy iConnStrategy = (IConnStrategy) this.f20492a.get(0);
        StringBuilder sb = new StringBuilder("https://");
        str = C0493a.f20480b;
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Http3Detect");
        atomicInteger = C0493a.f20486h;
        sb3.append(atomicInteger.getAndIncrement());
        String sb4 = sb3.toString();
        m21006b = C0493a.m21006b(iConnStrategy);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new C0502a(sb2, sb4, m21006b));
        tnetSpdySession.registerEventcb(257, new C0500f(this, iConnStrategy));
        tnetSpdySession.f20361q.isCommitted = true;
        tnetSpdySession.connect();
    }

    public RunnableC0499e(List list, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f20492a = list;
        this.f20493b = networkStatus;
    }
}
