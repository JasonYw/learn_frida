package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.ef */
/* loaded from: classes19.dex */
public abstract class AbstractC1997ef {

    /* renamed from: a */
    public AbstractC1997ef f24813a;

    static {
        Covode.recordClassIndex(5608);
    }

    /* renamed from: a */
    public abstract boolean mo16397a();

    public AbstractC1997ef() {
    }

    /* renamed from: d */
    private boolean m16398d() {
        AbstractC1997ef abstractC1997ef = this.f24813a;
        if (abstractC1997ef != null) {
            return abstractC1997ef.m16399c();
        }
        return true;
    }

    /* renamed from: c */
    public boolean m16399c() {
        if (!m16398d()) {
            return false;
        }
        return mo16397a();
    }

    /* renamed from: b */
    public int mo16400b() {
        int i;
        AbstractC1997ef abstractC1997ef = this.f24813a;
        if (abstractC1997ef != null) {
            i = abstractC1997ef.mo16400b();
        } else {
            i = Integer.MAX_VALUE;
        }
        return Math.min(Integer.MAX_VALUE, i);
    }

    public AbstractC1997ef(AbstractC1997ef abstractC1997ef) {
        this.f24813a = abstractC1997ef;
    }

    /* renamed from: a */
    public void mo16402a(int i) {
        AbstractC1997ef abstractC1997ef = this.f24813a;
        if (abstractC1997ef != null) {
            abstractC1997ef.mo16402a(i);
        }
    }

    /* renamed from: a */
    public void mo16401a(boolean z) {
        AbstractC1997ef abstractC1997ef = this.f24813a;
        if (abstractC1997ef != null) {
            abstractC1997ef.mo16401a(z);
        }
    }
}
