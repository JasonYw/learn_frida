package com.alibaba.p052a.p053a.p057d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.i */
/* loaded from: classes13.dex */
public class C0906i extends AbstractC0897a<JSONObject> {

    /* renamed from: b */
    public List<C0900c> f21217b;

    /* renamed from: c */
    public String f21218c;

    static {
        Covode.recordClassIndex(4216);
    }

    public C0906i(String str, int i) {
        super(i);
        this.f21218c = str;
    }

    /* renamed from: a */
    public boolean mo20395a(int i, Map<String, String> map) {
        List<C0900c> list = this.f21217b;
        if (list != null && map != null) {
            for (C0900c c0900c : list) {
                Boolean m20409a = c0900c.m20409a(i, map);
                if (m20409a != null) {
                    return m20409a.booleanValue();
                }
            }
        }
        return m20412a(i);
    }

    /* renamed from: b */
    public void mo20394b(JSONObject jSONObject) {
        mo20402a((C0906i) jSONObject);
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("extra");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C0900c c0900c = new C0900c(this.f21198a);
                if (this.f21217b == null) {
                    this.f21217b = new ArrayList();
                }
                this.f21217b.add(c0900c);
                c0900c.m20408b(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }
}
