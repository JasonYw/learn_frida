package com.alibaba.p052a.p053a.p057d;

import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.d */
/* loaded from: classes13.dex */
public class C0901d extends C0905h {

    /* renamed from: c */
    public int f21205c = this.f21198a;

    /* renamed from: d */
    public int f21206d = this.f21198a;

    static {
        Covode.recordClassIndex(4211);
    }

    public C0901d(String str, int i, int i2) {
        super(str, 0);
    }

    @Override // com.alibaba.p052a.p053a.p057d.AbstractC0897a
    /* renamed from: a */
    public void mo20402a(JSONObject jSONObject) {
        super.mo20402a((C0901d) jSONObject);
        this.f21205c = this.f21198a;
        this.f21206d = this.f21198a;
        try {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("successSampling"));
            if (valueOf != null) {
                this.f21205c = valueOf.intValue();
            }
            Integer valueOf2 = Integer.valueOf(jSONObject.getInt("failSampling"));
            if (valueOf2 != null) {
                this.f21206d = valueOf2.intValue();
            }
            C0974i.m20098a("AlarmModuleSampling", "[updateSelfSampling]", jSONObject, "successSampling:", valueOf, "failSampling");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public boolean m20407a(int i, String str, Boolean bool, Map<String, String> map) {
        C0906i c0906i;
        C0974i.m20098a("AlarmModuleSampling", "samplingSeed:", Integer.valueOf(i), "isSuccess:", bool, "successSampling:", Integer.valueOf(this.f21205c), "failSampling:", Integer.valueOf(this.f21206d));
        return (this.f21215b == null || (c0906i = this.f21215b.get(str)) == null || !(c0906i instanceof C0902e)) ? m20406a(i, bool.booleanValue()) : ((C0902e) c0906i).m20405a(i, bool, map);
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0905h
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo20397a(int i, String str, Map map) {
        return super.mo20397a(i, str, map);
    }

    /* renamed from: a */
    public boolean m20406a(int i, boolean z) {
        return z ? i < this.f21205c : i < this.f21206d;
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0905h
    /* renamed from: b */
    public void mo20396b(JSONObject jSONObject) {
        mo20402a((C0901d) jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("monitorPoints");
            if (jSONArray == null) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("monitorPoint");
                if (C0912b.m20337a(string)) {
                    C0906i c0906i = this.f21215b.get(string);
                    if (c0906i == null) {
                        c0906i = new C0902e(string, this.f21205c, this.f21206d);
                        this.f21215b.put(string, c0906i);
                    }
                    c0906i.mo20394b(jSONObject2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
