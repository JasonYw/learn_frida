package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.d */
/* loaded from: classes20.dex */
public class C0475d implements IAmdcSign {

    /* renamed from: a */
    public final /* synthetic */ String f20432a;

    /* renamed from: b */
    public final /* synthetic */ ISecurity f20433b;

    /* renamed from: c */
    public final /* synthetic */ SessionCenter f20434c;

    static {
        Covode.recordClassIndex(2167);
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String getAppkey() {
        return this.f20432a;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public boolean useSecurityGuard() {
        if (!this.f20433b.isSecOff()) {
            return true;
        }
        return false;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String sign(String str) {
        return this.f20433b.sign(this.f20434c.f20373b, "HMAC_SHA1", getAppkey(), str);
    }

    public C0475d(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f20434c = sessionCenter;
        this.f20432a = str;
        this.f20433b = iSecurity;
    }
}
