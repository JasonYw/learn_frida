package com.alibaba.p052a.p053a.p057d;

import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.g */
/* loaded from: classes13.dex */
public class C0904g extends AbstractC0897a<JSONObject> {

    /* renamed from: b */
    public EnumC0877f f21212b;

    /* renamed from: d */
    public int f21214d = -1;

    /* renamed from: c */
    public Map<String, C0905h> f21213c = Collections.synchronizedMap(new HashMap());

    static {
        Covode.recordClassIndex(4214);
    }

    public C0904g(EnumC0877f enumC0877f, int i) {
        super(i);
        this.f21212b = enumC0877f;
    }

    /* renamed from: a */
    public boolean mo20401a(int i, String str, String str2, Map<String, String> map) {
        C0905h c0905h;
        Map<String, C0905h> map2 = this.f21213c;
        return (map2 == null || (c0905h = map2.get(str)) == null) ? i < this.f21198a : c0905h.mo20397a(i, str2, map);
    }

    /* renamed from: b */
    public void mo20400b(int i) {
        this.f21198a = i;
    }

    /* renamed from: b */
    public void mo20399b(JSONObject jSONObject) {
        mo20402a((C0904g) jSONObject);
        m20398c(jSONObject);
        this.f21213c.clear();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("metrics");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String optString = jSONObject2.optString("module");
                if (C0912b.m20337a(optString)) {
                    C0905h c0905h = this.f21213c.get(optString);
                    if (c0905h == null) {
                        c0905h = new C0905h(optString, this.f21198a);
                        this.f21213c.put(optString, c0905h);
                    }
                    c0905h.mo20396b(jSONObject2);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void m20398c(JSONObject jSONObject) {
        C0974i.m20098a("EventTypeSampling", "[updateEventTypeTriggerCount]", this, jSONObject);
        if (jSONObject == null) {
            return;
        }
        try {
            int optInt = jSONObject.optInt("cacheCount");
            if (optInt <= 0 || this.f21212b == null) {
                return;
            }
            this.f21212b.m20484a(optInt);
        } catch (Throwable th) {
            C0974i.m20099a("EventTypeSampling", "updateTriggerCount", th);
        }
    }
}
