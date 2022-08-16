package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.api.mapcore2d.dn */
/* loaded from: classes19.dex */
public class C1615dn extends AbstractC1683ew {

    /* renamed from: a */
    public byte[] f23360a;

    /* renamed from: b */
    public String f23361b;

    static {
        Covode.recordClassIndex(5163);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: g */
    public Map<String, String> mo17321g() {
        return null;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: a_ */
    public byte[] mo17570a_() {
        return this.f23360a;
    }

    /* renamed from: b */
    private String m17880b() {
        byte[] m17940a = C1602db.m17940a(C1610dj.f23340b);
        byte[] bArr = new byte[m17940a.length + 50];
        System.arraycopy(this.f23360a, 0, bArr, 0, 50);
        System.arraycopy(m17940a, 0, bArr, 50, m17940a.length);
        return C1594cx.m17992a(bArr);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: f */
    public Map<String, String> mo17322f() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put("Content-Length", String.valueOf(this.f23360a.length));
        return hashMap;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: h */
    public String mo17320h() {
        return String.format(C1602db.m17930c(C1610dj.f23341c), "1", this.f23361b, "1", "open", m17880b());
    }

    public C1615dn(byte[] bArr, String str) {
        this.f23361b = "1";
        this.f23360a = (byte[]) bArr.clone();
        this.f23361b = str;
    }
}
