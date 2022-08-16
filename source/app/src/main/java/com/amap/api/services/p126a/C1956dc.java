package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.amap.api.services.a.dc */
/* loaded from: classes19.dex */
public class C1956dc extends AbstractC1969di {

    /* renamed from: a */
    public byte[] f24724a;

    /* renamed from: b */
    public Map<String, String> f24725b;

    static {
        Covode.recordClassIndex(5567);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: e */
    public Map<String, String> mo16388e() {
        return null;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        return "https://adiu.amap.com/ws/device/adius";
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: d */
    public Map<String, String> mo16450d() {
        return this.f24725b;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: h */
    public byte[] mo16449h() {
        return this.f24724a;
    }

    public C1956dc(byte[] bArr, Map<String, String> map) {
        this.f24724a = bArr;
        this.f24725b = map;
    }
}
