package com.alibaba.p052a.p053a.p056c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.a.a.c.a */
/* loaded from: classes10.dex */
public class C0889a {

    /* renamed from: b */
    public static C0889a f21187b = new C0889a();

    /* renamed from: a */
    public Map<Class<? extends AbstractC0890b>, C0891c<? extends AbstractC0890b>> f21188a = new HashMap();

    static {
        Covode.recordClassIndex(4199);
    }

    /* renamed from: a */
    public static C0889a m20418a() {
        return f21187b;
    }

    /* renamed from: a */
    private synchronized <T extends AbstractC0890b> C0891c<T> m20416a(Class<T> cls) {
        C0891c<T> c0891c;
        c0891c = (C0891c<T>) this.f21188a.get(cls);
        if (c0891c == null) {
            c0891c = new C0891c<>();
            this.f21188a.put(cls, c0891c);
        }
        return c0891c;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends com.alibaba.p052a.p053a.p056c.AbstractC0890b> T m20415a(java.lang.Class<T> r3, java.lang.Object... r4) {
        /*
            r2 = this;
            com.alibaba.a.a.c.c r0 = r2.m20416a(r3)
            com.alibaba.a.a.c.b r1 = r0.m20414a()
            if (r1 != 0) goto L15
            java.lang.Object r0 = r3.newInstance()     // Catch: java.lang.Exception -> L11
            com.alibaba.a.a.c.b r0 = (com.alibaba.p052a.p053a.p056c.AbstractC0890b) r0     // Catch: java.lang.Exception -> L11
            goto L16
        L11:
            r0 = move-exception
            com.alibaba.p052a.p053a.p055b.C0887b.m20436a(r0)
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L1b
            r0.mo20254a(r4)
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p053a.p056c.C0889a.m20415a(java.lang.Class, java.lang.Object[]):com.alibaba.a.a.c.b");
    }

    /* renamed from: a */
    public <T extends AbstractC0890b> void m20417a(T t) {
        if (t == null || (t instanceof C0893e) || (t instanceof C0892d)) {
            return;
        }
        m20416a(t.getClass()).m20413a(t);
    }
}
