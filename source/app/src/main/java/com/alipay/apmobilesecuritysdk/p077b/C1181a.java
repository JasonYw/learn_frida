package com.alipay.apmobilesecuritysdk.p077b;

import com.alipay.sdk.p082m.p090d0.C1256d;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.alipay.apmobilesecuritysdk.b.a */
/* loaded from: classes2.dex */
public final class C1181a {

    /* renamed from: b */
    public static C1181a f21952b = new C1181a();

    /* renamed from: a */
    public int f21953a = 0;

    static {
        Covode.recordClassIndex(4652);
    }

    /* renamed from: a */
    public static C1181a m19582a() {
        return f21952b;
    }

    /* renamed from: a */
    public static String m19580a(String str, String str2) {
        new StringBuilder();
        return C0002O.m25086C(str, str2);
    }

    /* renamed from: a */
    public final void m19581a(int i) {
        this.f21953a = i;
    }

    /* renamed from: b */
    public final int m19579b() {
        return this.f21953a;
    }

    /* renamed from: c */
    public final String m19578c() {
        String str;
        String m19317a = C1256d.m19317a();
        if (C1448a.m18661b(m19317a)) {
            return m19317a;
        }
        int i = this.f21953a;
        if (i == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else if (i == 2) {
            return "https://mobilegwpre.alipay.com/mgw.htm";
        } else {
            if (i == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else if (i != 4) {
                return "https://mobilegw.alipay.com/mgw.htm";
            } else {
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return m19580a("http", str);
    }
}
