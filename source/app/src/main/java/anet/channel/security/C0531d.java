package anet.channel.security;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.security.d */
/* loaded from: classes2.dex */
public final class C0531d implements ISecurityFactory {
    static {
        Covode.recordClassIndex(2247);
    }

    @Override // anet.channel.security.ISecurityFactory
    public final ISecurity createNonSecurity(String str) {
        return new C0528a(str);
    }

    @Override // anet.channel.security.ISecurityFactory
    public final ISecurity createSecurity(String str) {
        return new C0529b(str);
    }
}
