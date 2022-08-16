package com.alipay.sdk.p082m.p101j;

import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.j.b */
/* loaded from: classes2.dex */
public class C1295b {

    /* renamed from: a */
    public static boolean f22166a;

    /* renamed from: b */
    public static String f22167b;

    static {
        Covode.recordClassIndex(4795);
    }

    /* renamed from: c */
    public static boolean m19236c() {
        return f22166a;
    }

    /* renamed from: d */
    public static String m19235d() {
        return f22167b;
    }

    /* renamed from: a */
    public static String m19241a() {
        EnumC1296c m19229b = EnumC1296c.m19229b(EnumC1296c.CANCELED.m19230b());
        return m19240a(m19229b.m19230b(), m19229b.m19233a(), "");
    }

    /* renamed from: b */
    public static String m19237b() {
        EnumC1296c m19229b = EnumC1296c.m19229b(EnumC1296c.DOUBLE_REQUEST.m19230b());
        return m19240a(m19229b.m19230b(), m19229b.m19233a(), "");
    }

    /* renamed from: e */
    public static String m19234e() {
        EnumC1296c m19229b = EnumC1296c.m19229b(EnumC1296c.PARAMS_ERROR.m19230b());
        return m19240a(m19229b.m19230b(), m19229b.m19233a(), "");
    }

    /* renamed from: a */
    public static void m19239a(String str) {
        f22167b = str;
    }

    /* renamed from: a */
    public static void m19238a(boolean z) {
        f22166a = z;
    }

    /* renamed from: a */
    public static String m19240a(int i, String str, String str2) {
        return C0002O.m25081C("resultStatus={", Integer.valueOf(i), "};memo={", str, "};result={", str2, "}");
    }
}
