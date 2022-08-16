package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p056c.C0892d;
import com.alibaba.p052a.p053a.p056c.C0893e;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.alibaba.p052a.p053a.p060g.C0923e;
import com.alibaba.p052a.p053a.p060g.C0927g;
import com.alibaba.p052a.p053a.p060g.C0929h;
import com.alibaba.p052a.p053a.p060g.C0931i;
import com.alibaba.p052a.p053a.p060g.C0932j;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.a.g */
/* loaded from: classes13.dex */
public class C0878g extends AbstractC0874d {

    /* renamed from: a */
    public C0931i f21171a;

    /* renamed from: b */
    public Map<C0921d, C0879a> f21172b;

    /* renamed from: com.alibaba.a.a.a.g$a */
    /* loaded from: classes13.dex */
    public class C0879a {

        /* renamed from: b */
        public int f21174b;

        /* renamed from: c */
        public int f21175c;

        /* renamed from: d */
        public List<C0929h> f21176d = new ArrayList();

        static {
            Covode.recordClassIndex(4189);
        }

        public C0879a() {
        }

        /* renamed from: b */
        private C0929h m20465b(C0929h c0929h) {
            List<C0923e> m20295b;
            C0929h c0929h2 = (C0929h) C0889a.m20418a().m20415a(C0929h.class, new Object[0]);
            if (C0878g.this.f21171a != null && C0878g.this.f21171a.m20262g() != null && (m20295b = C0878g.this.f21171a.m20262g().m20295b()) != null) {
                int size = m20295b.size();
                for (int i = 0; i < size; i++) {
                    C0923e c0923e = m20295b.get(i);
                    if (c0923e != null) {
                        C0927g c0927g = (C0927g) C0889a.m20418a().m20415a(C0927g.class, new Object[0]);
                        C0927g m20277a = c0929h.m20277a(c0923e.m20304b());
                        if (m20277a.m20286b() != null) {
                            c0927g.m20290a(m20277a.m20286b().doubleValue());
                        }
                        c0927g.m20285b(m20277a.m20283e());
                        c0929h2.m20275a(c0923e.m20304b(), c0927g);
                    }
                }
            }
            return c0929h2;
        }

        /* renamed from: a */
        public List<Map<String, Map<String, Double>>> m20470a() {
            Map<String, C0927g> m20274b;
            List<C0929h> list = this.f21176d;
            if (list == null || list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = this.f21176d.size();
            for (int i = 0; i < size; i++) {
                C0929h c0929h = this.f21176d.get(i);
                if (c0929h != null && (m20274b = c0929h.m20274b()) != null && !m20274b.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, C0927g> entry : m20274b.entrySet()) {
                        HashMap hashMap2 = new HashMap();
                        String key = entry.getKey();
                        C0927g value = entry.getValue();
                        hashMap2.put("value", Double.valueOf(value.m20283e()));
                        if (value.m20286b() != null) {
                            hashMap2.put("offset", value.m20286b());
                        }
                        hashMap.put(key, hashMap2);
                    }
                    arrayList.add(hashMap);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public void m20468a(C0929h c0929h) {
            if (c0929h != null) {
                if ((C0878g.this.f21171a == null || !C0878g.this.f21171a.m20261h()) && !this.f21176d.isEmpty()) {
                    this.f21176d.get(0).m20278a(c0929h);
                } else {
                    this.f21176d.add(m20465b(c0929h));
                }
            }
        }

        /* renamed from: b */
        public void m20467b() {
            this.f21174b++;
        }

        /* renamed from: c */
        public void m20464c() {
            this.f21175c++;
        }
    }

    static {
        Covode.recordClassIndex(4188);
    }

    /* renamed from: a */
    public synchronized void m20472a(C0921d c0921d, C0929h c0929h) {
        C0879a c0879a;
        if (c0921d == null) {
            C0921d c0921d2 = (C0921d) C0889a.m20418a().m20415a(C0921d.class, new Object[0]);
            c0921d2.m20315a(c0921d);
            c0921d = c0921d2;
        }
        if (this.f21172b.containsKey(c0921d)) {
            c0879a = this.f21172b.get(c0921d);
        } else {
            C0921d c0921d3 = (C0921d) C0889a.m20418a().m20415a(C0921d.class, new Object[0]);
            c0921d3.m20315a(c0921d);
            c0879a = new C0879a();
            this.f21172b.put(c0921d3, c0879a);
        }
        if (this.f21171a == null || !this.f21171a.m20269a(c0921d, c0929h)) {
            c0879a.m20464c();
            if (this.f21171a.m20261h()) {
            }
            C0974i.m20098a("StatEvent", "entity  count:", Integer.valueOf(c0879a.f21174b), " noise:", Integer.valueOf(c0879a.f21175c));
        } else {
            c0879a.m20467b();
        }
        c0879a.m20468a(c0929h);
        C0974i.m20098a("StatEvent", "entity  count:", Integer.valueOf(c0879a.f21174b), " noise:", Integer.valueOf(c0879a.f21175c));
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        super.mo20254a(objArr);
        if (this.f21172b == null) {
            this.f21172b = new HashMap();
        }
        this.f21171a = C0932j.m20260a().m20258a(this.f21146e, this.f21147f);
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d
    /* renamed from: c */
    public synchronized JSONObject mo20471c() {
        JSONObject mo20471c;
        Set<String> keySet;
        mo20471c = super.mo20471c();
        try {
            if (this.f21171a != null) {
                mo20471c.put("isCommitDetail", String.valueOf(this.f21171a.m20261h()));
            }
            JSONArray jSONArray = (JSONArray) C0889a.m20418a().m20415a(C0892d.class, new Object[0]);
            if (this.f21172b != null) {
                for (Map.Entry<C0921d, C0879a> entry : this.f21172b.entrySet()) {
                    JSONObject jSONObject = (JSONObject) C0889a.m20418a().m20415a(C0893e.class, new Object[0]);
                    C0921d key = entry.getKey();
                    C0879a value = entry.getValue();
                    Object valueOf = Integer.valueOf(value.f21174b);
                    Object valueOf2 = Integer.valueOf(value.f21175c);
                    jSONObject.put("count", valueOf);
                    jSONObject.put("noise", valueOf2);
                    jSONObject.put("dimensions", key != null ? new JSONObject(key.m20311b()) : "");
                    List<Map<String, Map<String, Double>>> m20470a = value.m20470a();
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < m20470a.size(); i++) {
                        JSONObject jSONObject2 = new JSONObject();
                        Map<String, Map<String, Double>> map = m20470a.get(i);
                        if (map != null && (keySet = map.keySet()) != null) {
                            for (String str : keySet) {
                                jSONObject2.put(str, map.get(str) != null ? new JSONObject(map.get(str)) : "");
                            }
                        }
                        jSONArray2.put(jSONObject2);
                    }
                    jSONObject.put("measures", jSONArray2);
                    jSONArray.put(jSONObject);
                }
            }
            mo20471c.put("values", jSONArray);
        } catch (Exception unused) {
        }
        return mo20471c;
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public synchronized void mo20252d() {
        super.mo20252d();
        this.f21171a = null;
        for (C0921d c0921d : this.f21172b.keySet()) {
            C0889a.m20418a().m20417a((C0889a) c0921d);
        }
        this.f21172b.clear();
    }
}
