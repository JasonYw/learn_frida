package com.alibaba.p052a.p053a.p057d;

import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.e */
/* loaded from: classes13.dex */
public class C0902e extends C0906i {

    /* renamed from: c */
    public int f21207c;

    /* renamed from: d */
    public int f21208d;

    static {
        Covode.recordClassIndex(4212);
    }

    public C0902e(String str, int i, int i2) {
        super(str, 0);
        this.f21207c = i;
        this.f21208d = i2;
    }

    /* renamed from: a */
    public boolean m20405a(int i, Boolean bool, Map<String, String> map) {
        C0974i.m20098a("AlarmMonitorPointSampling", "samplingSeed:", Integer.valueOf(i), "isSuccess:", bool, "successSampling:", Integer.valueOf(this.f21207c), "failSampling:", Integer.valueOf(this.f21208d));
        if (this.f21217b != null && map != null) {
            for (C0900c c0900c : this.f21217b) {
                Boolean m20409a = c0900c.m20409a(i, map);
                if (m20409a != null) {
                    return m20409a.booleanValue();
                }
            }
        }
        return m20404a(i, bool.booleanValue());
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0906i
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo20395a(int i, Map map) {
        return super.mo20395a(i, map);
    }

    /* renamed from: a */
    public boolean m20404a(int i, boolean z) {
        return z ? i < this.f21207c : i < this.f21208d;
    }

    @Override // com.alibaba.p052a.p053a.p057d.C0906i
    /* renamed from: b */
    public void mo20394b(JSONObject jSONObject) {
        super.mo20394b(jSONObject);
        this.f21207c = this.f21198a;
        this.f21208d = this.f21198a;
        try {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("successSampling"));
            if (valueOf != null) {
                this.f21207c = valueOf.intValue();
            }
            Integer valueOf2 = Integer.valueOf(jSONObject.getInt("failSampling"));
            if (valueOf2 != null) {
                this.f21208d = valueOf2.intValue();
            }
            C0974i.m20098a("AlarmMonitorPointSampling", "[updateSelfSampling]", jSONObject, "successSampling:", valueOf, "failSampling", valueOf2);
        } catch (Exception unused) {
        }
    }
}
