package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* renamed from: com.amap.api.services.a.dy */
/* loaded from: classes19.dex */
public class C1989dy extends AbstractC1990dz {
    static {
        Covode.recordClassIndex(5600);
    }

    public C1989dy() {
    }

    public C1989dy(AbstractC1990dz abstractC1990dz) {
        super(abstractC1990dz);
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: a */
    public byte[] mo16406a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
        stringBuffer.append(" ");
        stringBuffer.append(UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] m16786a = C1892bp.m16786a(stringBuffer.toString());
        byte[] bArr2 = new byte[m16786a.length + bArr.length];
        System.arraycopy(m16786a, 0, bArr2, 0, m16786a.length);
        System.arraycopy(bArr, 0, bArr2, m16786a.length, bArr.length);
        return bArr2;
    }
}
