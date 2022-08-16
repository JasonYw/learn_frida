package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.api.mapcore2d.dc */
/* loaded from: classes19.dex */
public class C1603dc extends AbstractC1683ew {

    /* renamed from: b */
    public String f23336b;

    /* renamed from: a */
    public Map<String, String> f23335a = new HashMap();

    /* renamed from: f */
    public Map<String, String> f23337f = new HashMap();

    static {
        Covode.recordClassIndex(5151);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: f */
    public Map<String, String> mo17322f() {
        return this.f23335a;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: g */
    public Map<String, String> mo17321g() {
        return this.f23337f;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: h */
    public String mo17320h() {
        return this.f23336b;
    }

    /* renamed from: a */
    public void m17918a(String str) {
        this.f23336b = str;
    }

    /* renamed from: a */
    public void m17917a(Map<String, String> map) {
        this.f23335a.clear();
        this.f23335a.putAll(map);
    }

    /* renamed from: b */
    public void m17916b(Map<String, String> map) {
        this.f23337f.clear();
        this.f23337f.putAll(map);
    }
}
