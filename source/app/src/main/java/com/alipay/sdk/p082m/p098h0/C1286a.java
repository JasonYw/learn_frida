package com.alipay.sdk.p082m.p098h0;

import android.content.Context;
import com.alipay.sdk.p082m.p083a.AbstractC1214a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.h0.a */
/* loaded from: classes2.dex */
public class C1286a {
    static {
        Covode.recordClassIndex(4786);
    }

    /* renamed from: a */
    public static boolean m19278a() {
        if (AbstractC1214a.C1217b.f22053a) {
            return AbstractC1214a.C1217b.f22054b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: e */
    public static void m19273e(Context context) {
        AbstractC1214a.C1217b.f22054b = AbstractC1214a.C1218c.C1220b.f22061a.m19427a(context.getApplicationContext());
        AbstractC1214a.C1217b.f22053a = true;
    }

    /* renamed from: a */
    public static String m19277a(Context context) {
        if (AbstractC1214a.C1217b.f22053a) {
            return AbstractC1214a.C1218c.C1220b.f22061a.m19426a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: b */
    public static String m19276b(Context context) {
        if (AbstractC1214a.C1217b.f22053a) {
            return AbstractC1214a.C1218c.C1220b.f22061a.m19426a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static String m19275c(Context context) {
        if (AbstractC1214a.C1217b.f22053a) {
            return AbstractC1214a.C1218c.C1220b.f22061a.m19426a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: d */
    public static String m19274d(Context context) {
        if (AbstractC1214a.C1217b.f22053a) {
            return AbstractC1214a.C1218c.C1220b.f22061a.m19426a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
