package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p056c.C0892d;
import com.alibaba.p052a.p053a.p056c.C0893e;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.a.a */
/* loaded from: classes13.dex */
public class C0871a extends AbstractC0874d {

    /* renamed from: a */
    public int f21134a;

    /* renamed from: b */
    public int f21135b;

    /* renamed from: c */
    public Map<String, String> f21136c;

    /* renamed from: d */
    public Map<String, Integer> f21137d;

    static {
        Covode.recordClassIndex(4181);
    }

    /* renamed from: a */
    public synchronized void m20516a() {
        this.f21134a++;
    }

    /* renamed from: a */
    public synchronized void m20514a(String str, String str2) {
        if (C0912b.m20336b(str)) {
            return;
        }
        if (this.f21136c == null) {
            this.f21136c = new HashMap();
        }
        if (this.f21137d == null) {
            this.f21137d = new HashMap();
        }
        if (C0912b.m20337a(str2)) {
            int i = 100;
            if (str2.length() <= 100) {
                i = str2.length();
            }
            this.f21136c.put(str, str2.substring(0, i));
        }
        if (!this.f21137d.containsKey(str)) {
            this.f21137d.put(str, 1);
        } else {
            this.f21137d.put(str, Integer.valueOf(this.f21137d.get(str).intValue() + 1));
        }
    }

    /* renamed from: b */
    public synchronized void m20513b() {
        this.f21135b++;
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d
    /* renamed from: c */
    public synchronized JSONObject mo20471c() {
        JSONObject mo20471c;
        mo20471c = super.mo20471c();
        try {
            mo20471c.put("successCount", this.f21134a);
            mo20471c.put("failCount", this.f21135b);
            if (this.f21137d != null) {
                JSONArray jSONArray = (JSONArray) C0889a.m20418a().m20415a(C0892d.class, new Object[0]);
                for (Map.Entry<String, Integer> entry : this.f21137d.entrySet()) {
                    JSONObject jSONObject = (JSONObject) C0889a.m20418a().m20415a(C0893e.class, new Object[0]);
                    String key = entry.getKey();
                    jSONObject.put("errorCode", key);
                    jSONObject.put("errorCount", entry.getValue());
                    if (this.f21136c.containsKey(key)) {
                        jSONObject.put("errorMsg", this.f21136c.get(key));
                    }
                    jSONArray.put(jSONObject);
                }
                mo20471c.put("errors", jSONArray);
            }
        } catch (Exception unused) {
        }
        return mo20471c;
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public synchronized void mo20252d() {
        super.mo20252d();
        this.f21134a = 0;
        this.f21135b = 0;
        if (this.f21136c != null) {
            this.f21136c.clear();
        }
        if (this.f21137d != null) {
            this.f21137d.clear();
        }
    }
}
