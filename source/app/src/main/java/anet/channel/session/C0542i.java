package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.session.i */
/* loaded from: classes2.dex */
public class C0542i implements IAuth.AuthCallback {

    /* renamed from: a */
    public final /* synthetic */ TnetSpdySession f20658a;

    static {
        Covode.recordClassIndex(2259);
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthSuccess() {
        this.f20658a.notifyStatus(4, null);
        this.f20658a.f20637z = System.currentTimeMillis();
        if (this.f20658a.f20628D != null) {
            this.f20658a.f20628D.start(this.f20658a);
        }
        this.f20658a.f20361q.ret = 1;
        ALog.m20788d("awcn.TnetSpdySession", "spdyOnStreamResponse", this.f20658a.f20360p, "authTime", Long.valueOf(this.f20658a.f20361q.authTime));
        if (this.f20658a.f20625A > 0) {
            this.f20658a.f20361q.authTime = System.currentTimeMillis() - this.f20658a.f20625A;
        }
    }

    public C0542i(TnetSpdySession tnetSpdySession) {
        this.f20658a = tnetSpdySession;
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthFail(int i, String str) {
        this.f20658a.notifyStatus(5, null);
        if (this.f20658a.f20361q != null) {
            SessionStatistic sessionStatistic = this.f20658a.f20361q;
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i;
            this.f20658a.f20361q.errorCode = (long) i;
        }
        this.f20658a.close();
    }
}
