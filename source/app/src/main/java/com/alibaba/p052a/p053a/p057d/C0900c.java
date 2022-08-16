package com.alibaba.p052a.p053a.p057d;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.c */
/* loaded from: classes13.dex */
public class C0900c extends AbstractC0897a<JSONObject> {

    /* renamed from: b */
    public Map<String, C0898b> f21204b = new HashMap();

    static {
        Covode.recordClassIndex(4210);
    }

    public C0900c(int i) {
        super(i);
    }

    /* renamed from: a */
    public Boolean m20409a(int i, Map<String, String> map) {
        Map<String, C0898b> map2;
        if (map == null || (map2 = this.f21204b) == null) {
            return null;
        }
        for (String str : map2.keySet()) {
            if (!this.f21204b.get(str).m20410a(map.get(str))) {
                return null;
            }
        }
        return Boolean.valueOf(m20412a(i));
    }

    /* renamed from: b */
    public void m20408b(JSONObject jSONObject) {
        mo20402a((C0900c) jSONObject);
    }
}
