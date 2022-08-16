package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.amap.api.mapcore2d.eq */
/* loaded from: classes19.dex */
public class C1670eq extends AbstractC1683ew {

    /* renamed from: a */
    public byte[] f23536a;

    /* renamed from: b */
    public Map<String, String> f23537b;

    static {
        Covode.recordClassIndex(5218);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: f */
    public Map<String, String> mo17322f() {
        return null;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: h */
    public String mo17320h() {
        return "https://adiu.amap.com/ws/device/adius";
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: a_ */
    public byte[] mo17570a_() {
        return this.f23536a;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: g */
    public Map<String, String> mo17321g() {
        return this.f23537b;
    }

    public C1670eq(byte[] bArr, Map<String, String> map) {
        this.f23536a = bArr;
        this.f23537b = map;
    }
}
