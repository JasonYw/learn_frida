package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* renamed from: com.amap.api.mapcore2d.fn */
/* loaded from: classes19.dex */
public class C1708fn extends AbstractC1709fo {
    static {
        Covode.recordClassIndex(5256);
    }

    public C1708fn() {
    }

    public C1708fn(AbstractC1709fo abstractC1709fo) {
        super(abstractC1709fo);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: a */
    public byte[] mo17513a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
        stringBuffer.append(" ");
        stringBuffer.append(UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] m17940a = C1602db.m17940a(stringBuffer.toString());
        byte[] bArr2 = new byte[m17940a.length + bArr.length];
        System.arraycopy(m17940a, 0, bArr2, 0, m17940a.length);
        System.arraycopy(bArr, 0, bArr2, m17940a.length, bArr.length);
        return bArr2;
    }
}
