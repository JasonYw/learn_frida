package com.alibaba.p052a.p053a.p057d;

import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.f */
/* loaded from: classes13.dex */
public class C0903f extends C0904g {

    /* renamed from: b */
    public String f21209b = "AlarmSampling";

    /* renamed from: e */
    public int f21210e;

    /* renamed from: f */
    public int f21211f;

    static {
        Covode.recordClassIndex(4213);
    }

    public C0903f(EnumC0877f enumC0877f, int i) {
        super(enumC0877f, i);
        this.f21210e = i;
        this.f21211f = i;
    }

    @Override // com.alibaba.p052a.p053a.p057d.AbstractC0897a
    /* renamed from: a */
    public void mo20402a(JSONObject jSONObject) {
        super.mo20402a((C0903f) jSONObject);
        this.f21210e = this.f21198a;
        this.f21211f = this.f21198a;
        try {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("successSampling"));
            if (valueOf != null) {
                this.f21210e = valueOf.intValue();
            }
            Integer valueOf2 = Integer.valueOf(jSONObject.getInt("failSampling"));
            if (valueOf2 == null) {
                return;
            }
            this.f21211f = valueOf2.intValue();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public boolean m20403a(int i, String str, String str2, Boolean bool, Map<String, String> map) {
        C0905h c0905h;
        String str3 = this.f21209b;
        C0974i.m20098a(str3, "samplingSeed:", Integer.valueOf(i), "isSuccess:", bool, "successSampling:", Integer.valueOf(this.f21210e), "failSampling:" + this.f21211f);
        return (this.f21213c == null || (c0905h = this.f21213c.get(str)) == null || !(c0905h instanceof C0901d)) ? bool.booleanValue() ? i < this.f21210e : i < this.f21211f : ((C0901d) c0905h).m20407a(i, str2, bool, map);
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0904g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo20401a(int i, String str, String str2, Map map) {
        return super.mo20401a(i, str, str2, map);
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0904g
    /* renamed from: b */
    public void mo20400b(int i) {
        super.mo20400b(i);
        this.f21210e = i;
        this.f21211f = i;
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0904g
    /* renamed from: b */
    public void mo20399b(JSONObject jSONObject) {
        mo20402a((C0903f) jSONObject);
        m20398c(jSONObject);
        this.f21213c.clear();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("metrics");
            if (jSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("module");
                if (C0912b.m20337a(string)) {
                    C0905h c0905h = this.f21213c.get(string);
                    if (c0905h == null) {
                        c0905h = new C0901d(string, this.f21210e, this.f21211f);
                        this.f21213c.put(string, c0905h);
                    }
                    c0905h.mo20396b(jSONObject2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
