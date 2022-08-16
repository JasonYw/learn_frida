package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.alibaba.a.b.d.t */
/* loaded from: classes26.dex */
public class C0992t {
    static {
        Covode.recordClassIndex(4302);
    }

    /* renamed from: a */
    public static void m20053a(Map<String, String> map) {
        Object m20072a;
        try {
            Object m20070a = C0985o.m20070a("com.ut.mini.UTAnalytics", "getInstance");
            if (m20070a == null || (m20072a = C0985o.m20072a(m20070a, "getDefaultTracker")) == null) {
                return;
            }
            C0985o.m20071a(m20072a, "send", new Object[]{map}, Map.class);
        } catch (Exception unused) {
        }
    }
}
