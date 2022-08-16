package anet.channel.util;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.util.e */
/* loaded from: classes2.dex */
public class RunnableC0592e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC0591d f20836a;

    static {
        Covode.recordClassIndex(2376);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        r2 = anet.channel.util.C0590c.m20759k();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            anet.channel.status.NetworkStatusHelper$NetworkStatus r0 = anet.channel.status.NetworkStatusHelper.getStatus()     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = anet.channel.util.C0590c.m20774a(r0)     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r0.f20834a     // Catch: java.lang.Exception -> L79
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L79
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r3 = "awcn.Inet64Util"
            java.lang.String r2 = "startIpStackDetect double check"
            r1 = 0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L79
            anet.channel.util.ALog.m20786e(r3, r2, r1, r0)     // Catch: java.lang.Exception -> L79
            int r3 = anet.channel.util.C0590c.m20764f()     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            anet.channel.statist.NetTypeStat r0 = r0.f20835b     // Catch: java.lang.Exception -> L79
            int r0 = r0.ipStackType     // Catch: java.lang.Exception -> L79
            if (r0 == r3) goto L49
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r2 = anet.channel.util.C0590c.f20833e     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = r0.f20834a     // Catch: java.lang.Exception -> L79
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L79
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            anet.channel.statist.NetTypeStat r1 = r0.f20835b     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            anet.channel.statist.NetTypeStat r0 = r0.f20835b     // Catch: java.lang.Exception -> L79
            int r0 = r0.ipStackType     // Catch: java.lang.Exception -> L79
            r1.lastIpStackType = r0     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            anet.channel.statist.NetTypeStat r0 = r0.f20835b     // Catch: java.lang.Exception -> L79
            r0.ipStackType = r3     // Catch: java.lang.Exception -> L79
        L49:
            r0 = 2
            if (r3 == r0) goto L4f
            r0 = 3
            if (r3 != r0) goto L68
        L4f:
            anet.channel.util.f r2 = anet.channel.util.C0590c.m20763g()     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L68
            java.util.concurrent.ConcurrentHashMap<java.lang.String, anet.channel.util.f> r1 = anet.channel.util.C0590c.f20832d     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r0.f20834a     // Catch: java.lang.Exception -> L79
            r1.put(r0, r2)     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            anet.channel.statist.NetTypeStat r1 = r0.f20835b     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L79
            r1.nat64Prefix = r0     // Catch: java.lang.Exception -> L79
        L68:
            boolean r0 = anet.channel.GlobalAppRuntimeInfo.isTargetProcess()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L79
            anet.channel.appmonitor.IAppMonitor r1 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch: java.lang.Exception -> L79
            anet.channel.util.d r0 = r4.f20836a     // Catch: java.lang.Exception -> L79
            anet.channel.statist.NetTypeStat r0 = r0.f20835b     // Catch: java.lang.Exception -> L79
            r1.commitStat(r0)     // Catch: java.lang.Exception -> L79
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.RunnableC0592e.run():void");
    }

    public RunnableC0592e(RunnableC0591d runnableC0591d) {
        this.f20836a = runnableC0591d;
    }
}
