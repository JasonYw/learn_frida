package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fu */
/* loaded from: classes19.dex */
public abstract class AbstractC1715fu {

    /* renamed from: a */
    public AbstractC1715fu f23638a;

    static {
        Covode.recordClassIndex(5263);
    }

    /* renamed from: a */
    public abstract boolean mo17504a();

    public AbstractC1715fu() {
    }

    /* renamed from: d */
    private boolean m17505d() {
        AbstractC1715fu abstractC1715fu = this.f23638a;
        if (abstractC1715fu != null) {
            return abstractC1715fu.m17506c();
        }
        return true;
    }

    /* renamed from: c */
    public boolean m17506c() {
        if (!m17505d()) {
            return false;
        }
        return mo17504a();
    }

    /* renamed from: b */
    public int mo17507b() {
        int i;
        AbstractC1715fu abstractC1715fu = this.f23638a;
        if (abstractC1715fu != null) {
            i = abstractC1715fu.mo17507b();
        } else {
            i = Integer.MAX_VALUE;
        }
        return Math.min(Integer.MAX_VALUE, i);
    }

    public AbstractC1715fu(AbstractC1715fu abstractC1715fu) {
        this.f23638a = abstractC1715fu;
    }

    /* renamed from: a */
    public void mo17509a(int i) {
        AbstractC1715fu abstractC1715fu = this.f23638a;
        if (abstractC1715fu != null) {
            abstractC1715fu.mo17509a(i);
        }
    }

    /* renamed from: a */
    public void mo17508a(boolean z) {
        AbstractC1715fu abstractC1715fu = this.f23638a;
        if (abstractC1715fu != null) {
            abstractC1715fu.mo17508a(z);
        }
    }
}
