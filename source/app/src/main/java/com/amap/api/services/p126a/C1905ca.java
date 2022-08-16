package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.api.services.a.ca */
/* loaded from: classes19.dex */
public class C1905ca extends AbstractC1969di {

    /* renamed from: a */
    public byte[] f24566a;

    /* renamed from: b */
    public String f24567b;

    static {
        Covode.recordClassIndex(5516);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: d */
    public Map<String, String> mo16450d() {
        return null;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: h */
    public byte[] mo16449h() {
        return this.f24566a;
    }

    /* renamed from: a */
    private String m16731a() {
        byte[] m16786a = C1892bp.m16786a(C1899bw.f24545b);
        byte[] bArr = new byte[m16786a.length + 50];
        System.arraycopy(this.f24566a, 0, bArr, 0, 50);
        System.arraycopy(m16786a, 0, bArr, 50, m16786a.length);
        return C1887bm.m16834a(bArr);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: e */
    public Map<String, String> mo16388e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put("Content-Length", String.valueOf(this.f24566a.length));
        return hashMap;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        return String.format(C1892bp.m16776c(C1899bw.f24546c), "1", this.f24567b, "1", "open", m16731a());
    }

    public C1905ca(byte[] bArr, String str) {
        this.f24567b = "1";
        this.f24566a = (byte[]) bArr.clone();
        this.f24567b = str;
    }
}
