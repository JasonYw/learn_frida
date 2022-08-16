package com.alibaba.p052a.p053a.p057d;

import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p053a.p060g.C0916a;
import com.alibaba.p052a.p053a.p060g.C0923e;
import com.alibaba.p052a.p053a.p060g.C0925f;
import com.alibaba.p052a.p053a.p060g.C0931i;
import com.alibaba.p052a.p053a.p060g.C0932j;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.alibaba.a.a.d.h */
/* loaded from: classes13.dex */
public class C0905h extends AbstractC0897a<JSONObject> {

    /* renamed from: b */
    public Map<String, C0906i> f21215b = new HashMap();

    /* renamed from: c */
    public String f21216c;

    static {
        Covode.recordClassIndex(4215);
    }

    public C0905h(String str, int i) {
        super(i);
        this.f21216c = str;
    }

    /* renamed from: a */
    public boolean mo20397a(int i, String str, Map<String, String> map) {
        C0906i c0906i;
        Map<String, C0906i> map2 = this.f21215b;
        return (map2 == null || (c0906i = map2.get(str)) == null) ? m20412a(i) : c0906i.mo20395a(i, map);
    }

    /* renamed from: b */
    public void mo20396b(JSONObject jSONObject) {
        mo20402a((C0905h) jSONObject);
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("monitorPoints");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String optString = jSONObject2.optString("monitorPoint");
                String optString2 = jSONObject2.optString("metric_comment_detail");
                if (C0912b.m20337a(optString)) {
                    C0906i c0906i = this.f21215b.get(optString);
                    if (c0906i == null) {
                        c0906i = new C0906i(optString, this.f21198a);
                        this.f21215b.put(optString, c0906i);
                    }
                    c0906i.mo20394b(jSONObject2);
                    C0931i m20258a = C0932j.m20260a().m20258a(this.f21216c, optString);
                    if (m20258a != null) {
                        m20258a.m20268a(optString2);
                    }
                    Object opt = jSONObject2.opt("measures");
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        C0925f m20300a = C0925f.m20300a();
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                            if (jSONObject3 != null) {
                                String optString3 = jSONObject3.optString("name");
                                Double valueOf = Double.valueOf(jSONObject3.optDouble("min"));
                                Double valueOf2 = Double.valueOf(jSONObject3.optDouble("max"));
                                if (optString3 != null && valueOf != null && valueOf2 != null) {
                                    m20300a.m20298a(new C0923e(optString3, Double.valueOf(0.0d), valueOf, valueOf2));
                                }
                            }
                        }
                        C0931i m20258a2 = C0932j.m20260a().m20258a(C0002O.m25086C("config_prefix", this.f21216c), C0002O.m25086C("config_prefix", optString));
                        if (m20258a2 != null) {
                            C0932j.m20260a().m20257b(m20258a2);
                        }
                        C0932j.m20260a().m20259a(new C0916a(C0002O.m25086C("config_prefix", this.f21216c), C0002O.m25086C("config_prefix", optString), m20300a));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
