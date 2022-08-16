package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.amap.api.mapcore2d.fi */
/* loaded from: classes19.dex */
public class C1703fi extends AbstractC1709fo {

    /* renamed from: a */
    public ByteArrayOutputStream f23614a = new ByteArrayOutputStream();

    static {
        Covode.recordClassIndex(5251);
    }

    public C1703fi() {
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: b */
    public void mo17515b(byte[] bArr) {
        try {
            this.f23614a.write(bArr);
        } catch (Throwable unused) {
        }
    }

    public C1703fi(AbstractC1709fo abstractC1709fo) {
        super(abstractC1709fo);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: a */
    public byte[] mo17513a(byte[] bArr) {
        byte[] byteArray = this.f23614a.toByteArray();
        try {
            this.f23614a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f23614a = new ByteArrayOutputStream();
        return byteArray;
    }
}
