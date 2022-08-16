package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bs */
/* loaded from: classes19.dex */
public abstract class AbstractC1895bs {

    /* renamed from: a */
    public AbstractC1895bs f24543a;

    static {
        Covode.recordClassIndex(5506);
    }

    /* renamed from: a */
    public abstract byte[] mo16764a(byte[] bArr);

    public AbstractC1895bs() {
    }

    public AbstractC1895bs(AbstractC1895bs abstractC1895bs) {
        this.f24543a = abstractC1895bs;
    }

    /* renamed from: c */
    private byte[] m16765c(byte[] bArr) {
        AbstractC1895bs abstractC1895bs = this.f24543a;
        if (abstractC1895bs != null) {
            return abstractC1895bs.m16766b(bArr);
        }
        return bArr;
    }

    /* renamed from: b */
    public byte[] m16766b(byte[] bArr) {
        return mo16764a(m16765c(bArr));
    }
}
