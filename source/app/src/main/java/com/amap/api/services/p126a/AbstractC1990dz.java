package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.dz */
/* loaded from: classes19.dex */
public abstract class AbstractC1990dz {

    /* renamed from: c */
    public AbstractC1990dz f24800c;

    /* renamed from: d */
    public byte[] f24801d;

    static {
        Covode.recordClassIndex(5601);
    }

    /* renamed from: a */
    public abstract byte[] mo16406a(byte[] bArr);

    /* renamed from: b */
    public void mo16409b(byte[] bArr) {
    }

    public AbstractC1990dz() {
    }

    /* renamed from: a */
    public byte[] m16410a() {
        byte[] mo16406a = mo16406a(this.f24801d);
        AbstractC1990dz abstractC1990dz = this.f24800c;
        if (abstractC1990dz != null) {
            abstractC1990dz.m16408c(mo16406a);
            return this.f24800c.m16410a();
        }
        return mo16406a;
    }

    /* renamed from: c */
    public void m16408c(byte[] bArr) {
        this.f24801d = bArr;
    }

    public AbstractC1990dz(AbstractC1990dz abstractC1990dz) {
        this.f24800c = abstractC1990dz;
    }
}
