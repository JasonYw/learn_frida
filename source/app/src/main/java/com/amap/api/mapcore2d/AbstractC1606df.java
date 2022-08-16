package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.df */
/* loaded from: classes19.dex */
public abstract class AbstractC1606df {

    /* renamed from: a */
    public AbstractC1606df f23338a;

    static {
        Covode.recordClassIndex(5154);
    }

    /* renamed from: a */
    public abstract byte[] mo17913a(byte[] bArr);

    public AbstractC1606df() {
    }

    public AbstractC1606df(AbstractC1606df abstractC1606df) {
        this.f23338a = abstractC1606df;
    }

    /* renamed from: c */
    private byte[] m17914c(byte[] bArr) {
        AbstractC1606df abstractC1606df = this.f23338a;
        if (abstractC1606df != null) {
            return abstractC1606df.m17915b(bArr);
        }
        return bArr;
    }

    /* renamed from: b */
    public byte[] m17915b(byte[] bArr) {
        return mo17913a(m17914c(bArr));
    }
}
