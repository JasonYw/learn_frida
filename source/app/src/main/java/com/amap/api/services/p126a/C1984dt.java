package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.amap.api.services.a.dt */
/* loaded from: classes19.dex */
public class C1984dt extends AbstractC1990dz {

    /* renamed from: a */
    public ByteArrayOutputStream f24789a = new ByteArrayOutputStream();

    static {
        Covode.recordClassIndex(5595);
    }

    public C1984dt() {
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: b */
    public void mo16409b(byte[] bArr) {
        try {
            this.f24789a.write(bArr);
        } catch (Throwable unused) {
        }
    }

    public C1984dt(AbstractC1990dz abstractC1990dz) {
        super(abstractC1990dz);
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: a */
    public byte[] mo16406a(byte[] bArr) {
        byte[] byteArray = this.f24789a.toByteArray();
        try {
            this.f24789a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f24789a = new ByteArrayOutputStream();
        return byteArray;
    }
}
