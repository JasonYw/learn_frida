package com.alibaba.p052a.p053a.p060g;

import android.text.TextUtils;
import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.UUID;
import p002O.C0002O;

/* renamed from: com.alibaba.a.a.g.i */
/* loaded from: classes13.dex */
public class C0931i implements AbstractC0890b {

    /* renamed from: a */
    public String f21247a;

    /* renamed from: b */
    public String f21248b;

    /* renamed from: c */
    public String f21249c;

    /* renamed from: d */
    public boolean f21250d;

    /* renamed from: e */
    public String f21251e;

    /* renamed from: f */
    public C0919c f21252f;

    /* renamed from: g */
    public C0925f f21253g;

    /* renamed from: h */
    public String f21254h;

    static {
        Covode.recordClassIndex(4241);
    }

    public C0931i() {
    }

    public C0931i(String str, String str2, C0925f c0925f, C0919c c0919c, boolean z) {
        this.f21247a = str;
        this.f21248b = str2;
        this.f21252f = c0919c;
        this.f21253g = c0925f;
        this.f21250d = z;
    }

    /* renamed from: a */
    private C0923e m20267a(String str, List<C0923e> list) {
        if (list != null) {
            for (C0923e c0923e : list) {
                if (TextUtils.equals(str, c0923e.f21240c)) {
                    return c0923e;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public synchronized String m20270a() {
        if (this.f21254h == null) {
            new StringBuilder();
            this.f21254h = C0002O.m25083C(UUID.randomUUID().toString(), "$", this.f21247a, "$", this.f21248b);
        }
        return this.f21254h;
    }

    /* renamed from: a */
    public synchronized void m20268a(String str) {
        this.f21251e = str;
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        this.f21247a = (String) objArr[0];
        this.f21248b = (String) objArr[1];
        if (objArr.length > 2) {
            this.f21249c = (String) objArr[2];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m20269a(com.alibaba.p052a.p053a.p060g.C0921d r8, com.alibaba.p052a.p053a.p060g.C0929h r9) {
        /*
            r7 = this;
            com.alibaba.a.a.g.c r0 = r7.f21252f
            if (r0 == 0) goto L70
            boolean r6 = r0.m20321a(r8)
        L8:
            com.alibaba.a.a.g.j r3 = com.alibaba.p052a.p053a.p060g.C0932j.m20260a()
            java.lang.String r2 = "config_prefix"
            java.lang.String r0 = r7.f21247a
            java.lang.String r1 = p002O.C0002O.m25086C(r2, r0)
            java.lang.String r0 = r7.f21248b
            java.lang.String r0 = p002O.C0002O.m25086C(r2, r0)
            com.alibaba.a.a.g.i r1 = r3.m20258a(r1, r0)
            r5 = 0
            if (r1 == 0) goto L73
            com.alibaba.a.a.g.f r0 = r1.m20262g()
            if (r0 == 0) goto L73
            if (r9 == 0) goto L73
            java.util.Map r0 = r9.m20274b()
            if (r0 == 0) goto L73
            com.alibaba.a.a.g.f r0 = r7.f21253g
            if (r0 == 0) goto L73
            com.alibaba.a.a.g.f r0 = r1.m20262g()
            java.util.List r4 = r0.m20295b()
            java.util.Map r0 = r9.m20274b()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L47:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            com.alibaba.a.a.g.e r1 = r7.m20267a(r2, r4)
            if (r1 != 0) goto L65
            com.alibaba.a.a.g.f r0 = r7.f21253g
            java.util.List r0 = r0.m20295b()
            com.alibaba.a.a.g.e r1 = r7.m20267a(r2, r0)
            if (r1 == 0) goto L6f
        L65:
            com.alibaba.a.a.g.g r0 = r9.m20277a(r2)
            boolean r0 = r1.m20305a(r0)
            if (r0 != 0) goto L47
        L6f:
            return r5
        L70:
            r6 = 1
            goto L8
        L72:
            return r6
        L73:
            com.alibaba.a.a.g.f r0 = r7.f21253g
            if (r0 == 0) goto L80
            if (r6 == 0) goto L81
            boolean r0 = r0.m20297a(r9)
            if (r0 == 0) goto L81
            r6 = 1
        L80:
            return r6
        L81:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p053a.p060g.C0931i.m20269a(com.alibaba.a.a.g.d, com.alibaba.a.a.g.h):boolean");
    }

    /* renamed from: b */
    public void m20266b() {
        this.f21254h = null;
    }

    /* renamed from: c */
    public String m20265c() {
        return this.f21247a;
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        this.f21247a = null;
        this.f21248b = null;
        this.f21249c = null;
        this.f21250d = false;
        this.f21252f = null;
        this.f21253g = null;
        this.f21254h = null;
    }

    /* renamed from: e */
    public String m20264e() {
        return this.f21248b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0931i c0931i = (C0931i) obj;
        String str = this.f21249c;
        if (str == null) {
            if (c0931i.f21249c != null) {
                return false;
            }
        } else if (!str.equals(c0931i.f21249c)) {
            return false;
        }
        String str2 = this.f21247a;
        if (str2 == null) {
            if (c0931i.f21247a != null) {
                return false;
            }
        } else if (!str2.equals(c0931i.f21247a)) {
            return false;
        }
        String str3 = this.f21248b;
        String str4 = c0931i.f21248b;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C0919c m20263f() {
        return this.f21252f;
    }

    /* renamed from: g */
    public C0925f m20262g() {
        return this.f21253g;
    }

    /* renamed from: h */
    public synchronized boolean m20261h() {
        boolean z;
        if ("1".equalsIgnoreCase(this.f21251e)) {
            z = true;
        } else if (!"0".equalsIgnoreCase(this.f21251e)) {
            return this.f21250d;
        } else {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f21249c;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f21247a;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21248b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
