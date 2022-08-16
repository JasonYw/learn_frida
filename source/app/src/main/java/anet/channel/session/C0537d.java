package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.Session;
import anet.channel.entity.C0502a;
import anet.channel.entity.C0503b;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.strategy.utils.C0579c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0587Utils;
import anet.channel.util.C0590c;
import anet.channel.util.C0597j;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.session.d */
/* loaded from: classes2.dex */
public class C0537d extends Session {

    /* renamed from: w */
    public SSLSocketFactory f20649w;

    static {
        Covode.recordClassIndex(2254);
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    @Override // anet.channel.Session
    public void close() {
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        if (this.f20358n == 4) {
            return true;
        }
        return false;
    }

    @Override // anet.channel.Session
    public void connect() {
        try {
            if (this.f20355k != null && this.f20355k.getIpSource() == 1) {
                notifyStatus(4, new C0503b(1));
                return;
            }
            Request.Builder builder = new Request.Builder();
            builder.setUrl(this.f20347c);
            builder.setSeq(this.f20360p);
            builder.setConnectTimeout((int) (this.f20362r * C0587Utils.getNetworkTimeFactor()));
            builder.setReadTimeout((int) (this.f20363s * C0587Utils.getNetworkTimeFactor()));
            builder.setRedirectEnable(false);
            if (this.f20649w != null) {
                builder.setSslSocketFactory(this.f20649w);
            }
            if (this.f20357m) {
                builder.addHeader("Host", this.f20349e);
            }
            if (C0590c.m20775a() && C0579c.m20795a(this.f20349e)) {
                try {
                    this.f20350f = C0590c.m20773a(this.f20349e);
                } catch (Exception unused) {
                }
            }
            ALog.m20785i("awcn.HttpSession", "HttpSession connect", null, C1315c.f22208f, this.f20347c, "ip", this.f20350f, "port", Integer.valueOf(this.f20351g));
            Request build = builder.build();
            build.setDnsOptimize(this.f20350f, this.f20351g);
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0538e(this, build), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th) {
            ALog.m20787e("awcn.HttpSession", "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public void close(boolean z) {
        this.f20364t = false;
        close();
    }

    public C0537d(Context context, C0502a c0502a) {
        super(context, c0502a);
        ConnType connType;
        if (this.f20355k == null) {
            if (this.f20347c != null && this.f20347c.startsWith("https")) {
                connType = ConnType.HTTPS;
            } else {
                connType = ConnType.HTTP;
            }
            this.f20354j = connType;
        } else if (AwcnConfig.isHttpsSniEnable() && this.f20354j.equals(ConnType.HTTPS)) {
            this.f20649w = new C0597j(this.f20348d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:12:0x0029, B:14:0x002f, B:16:0x0033, B:17:0x003c, B:21:0x0046, B:22:0x004a, B:23:0x0051, B:24:0x0055, B:26:0x0059, B:28:0x0067, B:31:0x006d, B:34:0x0073, B:36:0x0087, B:37:0x0098, B:40:0x00b5), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:12:0x0029, B:14:0x002f, B:16:0x0033, B:17:0x003c, B:21:0x0046, B:22:0x004a, B:23:0x0051, B:24:0x0055, B:26:0x0059, B:28:0x0067, B:31:0x006d, B:34:0x0073, B:36:0x0087, B:37:0x0098, B:40:0x00b5), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:12:0x0029, B:14:0x002f, B:16:0x0033, B:17:0x003c, B:21:0x0046, B:22:0x004a, B:23:0x0051, B:24:0x0055, B:26:0x0059, B:28:0x0067, B:31:0x006d, B:34:0x0073, B:36:0x0087, B:37:0x0098, B:40:0x00b5), top: B:11:0x0029 }] */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.request.Cancelable request(anet.channel.request.Request r9, anet.channel.RequestCb r10) {
        /*
            r8 = this;
            anet.channel.request.b r7 = anet.channel.request.C0526b.NULL
            r2 = 0
            if (r9 == 0) goto L21
            anet.channel.statist.RequestStatistic r3 = r9.f20578a
        L7:
            anet.channel.entity.ConnType r0 = r8.f20354j
            r3.setConnType(r0)
            long r0 = r3.start
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L1c
            long r0 = java.lang.System.currentTimeMillis()
            r3.reqStart = r0
            r3.start = r0
        L1c:
            if (r9 == 0) goto Lcc
            if (r10 == 0) goto Ld7
            goto L29
        L21:
            anet.channel.statist.RequestStatistic r3 = new anet.channel.statist.RequestStatistic
            java.lang.String r0 = r8.f20348d
            r3.<init>(r0, r2)
            goto L7
        L29:
            javax.net.ssl.SSLSocketFactory r0 = r9.getSslSocketFactory()     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L3c
            javax.net.ssl.SSLSocketFactory r0 = r8.f20649w     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L3c
            anet.channel.request.Request$Builder r2 = r9.newBuilder()     // Catch: java.lang.Throwable -> Lbd
            javax.net.ssl.SSLSocketFactory r0 = r8.f20649w     // Catch: java.lang.Throwable -> Lbd
            r2.setSslSocketFactory(r0)     // Catch: java.lang.Throwable -> Lbd
        L3c:
            boolean r0 = r8.f20357m     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L43
            if (r2 != 0) goto L4a
            goto L46
        L43:
            if (r2 == 0) goto L55
            goto L51
        L46:
            anet.channel.request.Request$Builder r2 = r9.newBuilder()     // Catch: java.lang.Throwable -> Lbd
        L4a:
            java.lang.String r1 = "Host"
            java.lang.String r0 = r8.f20349e     // Catch: java.lang.Throwable -> Lbd
            r2.addHeader(r1, r0)     // Catch: java.lang.Throwable -> Lbd
        L51:
            anet.channel.request.Request r9 = r2.build()     // Catch: java.lang.Throwable -> Lbd
        L55:
            java.lang.String r0 = r8.f20350f     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L73
            anet.channel.util.HttpUrl r0 = r9.getHttpUrl()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = r0.host()     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = anet.channel.util.C0590c.m20775a()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L73
            boolean r0 = anet.channel.strategy.utils.C0579c.m20795a(r1)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L73
            java.lang.String r0 = anet.channel.util.C0590c.m20773a(r1)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> Lbd
            r8.f20350f = r0     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> Lbd
        L73:
            java.lang.String r1 = r8.f20350f     // Catch: java.lang.Throwable -> Lbd
            int r0 = r8.f20351g     // Catch: java.lang.Throwable -> Lbd
            r9.setDnsOptimize(r1, r0)     // Catch: java.lang.Throwable -> Lbd
            anet.channel.entity.ConnType r0 = r8.f20354j     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.isSSL()     // Catch: java.lang.Throwable -> Lbd
            r9.setUrlScheme(r0)     // Catch: java.lang.Throwable -> Lbd
            anet.channel.strategy.IConnStrategy r0 = r8.f20355k     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb5
            anet.channel.statist.RequestStatistic r2 = r9.f20578a     // Catch: java.lang.Throwable -> Lbd
            anet.channel.strategy.IConnStrategy r0 = r8.f20355k     // Catch: java.lang.Throwable -> Lbd
            int r1 = r0.getIpSource()     // Catch: java.lang.Throwable -> Lbd
            anet.channel.strategy.IConnStrategy r0 = r8.f20355k     // Catch: java.lang.Throwable -> Lbd
            int r0 = r0.getIpType()     // Catch: java.lang.Throwable -> Lbd
            r2.setIpInfo(r1, r0)     // Catch: java.lang.Throwable -> Lbd
        L98:
            anet.channel.statist.RequestStatistic r1 = r9.f20578a     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r0 = r8.f20356l     // Catch: java.lang.Throwable -> Lbd
            r1.unit = r0     // Catch: java.lang.Throwable -> Lbd
            anet.channel.request.b r2 = new anet.channel.request.b     // Catch: java.lang.Throwable -> Lbd
            anet.channel.session.f r1 = new anet.channel.session.f     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> Lbd
            int r0 = anet.channel.util.C0595h.m20755a(r9)     // Catch: java.lang.Throwable -> Lbd
            java.util.concurrent.Future r1 = anet.channel.thread.ThreadPoolExecutorFactory.submitPriorityTask(r1, r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r0 = r9.getSeq()     // Catch: java.lang.Throwable -> Lbd
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lbc
        Lb5:
            anet.channel.statist.RequestStatistic r1 = r9.f20578a     // Catch: java.lang.Throwable -> Lbd
            r0 = 1
            r1.setIpInfo(r0, r0)     // Catch: java.lang.Throwable -> Lbd
            goto L98
        Lbc:
            return r2
        Lbd:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r1 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r0 = anet.channel.util.ErrorConstant.formatMsg(r1, r0)
            r10.onFinish(r1, r0, r3)
            return r7
        Lcc:
            if (r10 == 0) goto Ld7
            r1 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r0 = anet.channel.util.ErrorConstant.getErrMsg(r1)
            r10.onFinish(r1, r0, r3)
        Ld7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C0537d.request(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.request.Cancelable");
    }
}
