package anet.channel.security;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.security.c */
/* loaded from: classes2.dex */
public class C0530c {

    /* renamed from: a */
    public static volatile ISecurityFactory f20624a;

    static {
        Covode.recordClassIndex(2246);
    }

    /* renamed from: a */
    public static ISecurityFactory m20922a() {
        if (f20624a == null) {
            f20624a = new C0531d();
        }
        return f20624a;
    }
}
