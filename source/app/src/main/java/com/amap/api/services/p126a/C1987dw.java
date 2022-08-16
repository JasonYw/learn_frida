package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.amap.api.services.a.dw */
/* loaded from: classes19.dex */
public class C1987dw extends AbstractC1990dz {

    /* renamed from: a */
    public StringBuilder f24795a = new StringBuilder();

    /* renamed from: b */
    public boolean f24796b = true;

    static {
        Covode.recordClassIndex(5598);
    }

    public C1987dw() {
    }

    public C1987dw(AbstractC1990dz abstractC1990dz) {
        super(abstractC1990dz);
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: a */
    public byte[] mo16406a(byte[] bArr) {
        byte[] m16786a = C1892bp.m16786a(this.f24795a.toString());
        m16408c(m16786a);
        this.f24796b = true;
        StringBuilder sb = this.f24795a;
        sb.delete(0, sb.length());
        return m16786a;
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: b */
    public void mo16409b(byte[] bArr) {
        String m16782a = C1892bp.m16782a(bArr);
        if (this.f24796b) {
            this.f24796b = false;
        } else {
            this.f24795a.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        StringBuilder sb = this.f24795a;
        sb.append("{\"log\":\"");
        sb.append(m16782a);
        sb.append("\"}");
    }
}
