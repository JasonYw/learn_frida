package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fo */
/* loaded from: classes19.dex */
public abstract class AbstractC1709fo {

    /* renamed from: c */
    public AbstractC1709fo f23625c;

    /* renamed from: d */
    public byte[] f23626d;

    static {
        Covode.recordClassIndex(5257);
    }

    /* renamed from: a */
    public abstract byte[] mo17513a(byte[] bArr);

    /* renamed from: b */
    public void mo17515b(byte[] bArr) {
    }

    public AbstractC1709fo() {
    }

    /* renamed from: a */
    public byte[] m17516a() {
        byte[] mo17513a = mo17513a(this.f23626d);
        AbstractC1709fo abstractC1709fo = this.f23625c;
        if (abstractC1709fo != null) {
            abstractC1709fo.m17514c(mo17513a);
            return this.f23625c.m17516a();
        }
        return mo17513a;
    }

    /* renamed from: c */
    public void m17514c(byte[] bArr) {
        this.f23626d = bArr;
    }

    public AbstractC1709fo(AbstractC1709fo abstractC1709fo) {
        this.f23625c = abstractC1709fo;
    }
}
