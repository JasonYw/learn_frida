package com.alibaba.p052a.p053a.p060g;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.a.a.g.j */
/* loaded from: classes13.dex */
public class C0932j {

    /* renamed from: b */
    public static C0932j f21255b;

    /* renamed from: a */
    public List<C0931i> f21256a;

    static {
        Covode.recordClassIndex(4242);
    }

    public C0932j(int i) {
        this.f21256a = new ArrayList(i);
    }

    /* renamed from: a */
    public static C0932j m20260a() {
        if (f21255b == null) {
            f21255b = new C0932j(3);
        }
        return f21255b;
    }

    /* renamed from: a */
    public C0931i m20258a(String str, String str2) {
        List<C0931i> list;
        if (str != null && str2 != null && (list = this.f21256a) != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0931i c0931i = this.f21256a.get(i);
                if (c0931i != null && c0931i.m20265c().equals(str) && c0931i.m20264e().equals(str2)) {
                    return c0931i;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m20259a(C0931i c0931i) {
        if (!this.f21256a.contains(c0931i)) {
            this.f21256a.add(c0931i);
        }
    }

    /* renamed from: b */
    public boolean m20257b(C0931i c0931i) {
        if (this.f21256a.contains(c0931i)) {
            return this.f21256a.remove(c0931i);
        }
        return true;
    }
}
