package com.alibaba.p052a.p053a;

import com.alibaba.p052a.p053a.p054a.C0875e;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p055b.C0887b;
import com.alibaba.p052a.p053a.p057d.C0907j;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.a.h */
/* loaded from: classes13.dex */
public class C0936h {
    static {
        Covode.recordClassIndex(4246);
    }

    /* renamed from: a */
    public static void m20251a(C0914g c0914g) {
        if (c0914g == null || c0914g.f21231d == null) {
            return;
        }
        C0875e m20503a = C0875e.m20503a();
        String str = c0914g.f21232e;
        Integer num = c0914g.f21228a;
        String str2 = c0914g.f21229b;
        String str3 = c0914g.f21230c;
        C0921d m20317a = C0921d.m20317a();
        m20317a.m20315a(c0914g.f21231d);
        m20503a.m20493a(str, num, str2, str3, m20317a);
    }

    /* renamed from: a */
    public static void m20250a(C0914g c0914g, String str) {
        try {
            if (!C0881b.f21184b || c0914g == null) {
                return;
            }
            C0974i.m20098a("TransactionDelegate", "statEvent begin. module: ", c0914g.f21229b, " monitorPoint: ", c0914g.f21230c, " measureName: ", str);
            if (!EnumC0877f.STAT.m20482b() || (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.STAT, c0914g.f21229b, c0914g.f21230c))) {
                C0974i.m20098a("TransactionDelegate", "log discard", c0914g.f21229b, " monitorPoint: ", c0914g.f21230c, " measureName: ", str);
                return;
            }
            C0875e.m20503a().m20492a(c0914g.f21232e, c0914g.f21228a, c0914g.f21229b, c0914g.f21230c, str);
            m20251a(c0914g);
        } catch (Throwable th) {
            C0887b.m20436a(th);
        }
    }

    /* renamed from: b */
    public static void m20249b(C0914g c0914g, String str) {
        try {
            if (!C0881b.f21184b || c0914g == null) {
                return;
            }
            C0974i.m20098a("TransactionDelegate", "statEvent end. module: ", c0914g.f21229b, " monitorPoint: ", c0914g.f21230c, " measureName: ", str);
            if (!EnumC0877f.STAT.m20482b() || (!C0881b.f21183a && !C0907j.m20390a(EnumC0877f.STAT, c0914g.f21229b, c0914g.f21230c))) {
                C0974i.m20098a("TransactionDelegate", "log discard", c0914g.f21229b, " monitorPoint: ", c0914g.f21230c, " measureName: ", str);
                return;
            }
            m20251a(c0914g);
            C0875e.m20503a().m20489a(c0914g.f21232e, str, false, c0914g.f21233f);
        } catch (Throwable th) {
            C0887b.m20436a(th);
        }
    }
}
