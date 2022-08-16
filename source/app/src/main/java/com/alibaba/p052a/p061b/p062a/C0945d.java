package com.alibaba.p052a.p061b.p062a;

import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.b.a.d */
/* loaded from: classes10.dex */
public class C0945d {

    /* renamed from: a */
    public static C0945d f21307a = new C0945d();

    /* renamed from: b */
    public Map<String, C0944c> f21308b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public String f21309c;

    static {
        Covode.recordClassIndex(4255);
    }

    /* renamed from: a */
    public static C0945d m20207a() {
        return f21307a;
    }

    /* renamed from: a */
    public void m20206a(String str) {
        JSONObject jSONObject;
        C0974i.m20098a("HostConfigMgr", "host config:" + str);
        if (str != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("content");
                if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("hosts")) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null) {
                            C0944c c0944c = new C0944c();
                            JSONObject jSONObject4 = jSONObject.getJSONObject(next);
                            if (jSONObject4 != null) {
                                c0944c.f21306c = next.substring(1);
                                c0944c.f21304a = jSONObject4.getString(C1315c.f22208f);
                                JSONArray jSONArray = jSONObject4.getJSONArray("eids");
                                if (jSONArray != null) {
                                    c0944c.f21305b = new ArrayList<>();
                                    for (int i = 0; i < jSONArray.length(); i++) {
                                        c0944c.f21305b.add(jSONArray.getString(i));
                                    }
                                }
                            }
                            Map<String, C0944c> map = this.f21308b;
                            map.put(c0944c.f21306c, c0944c);
                        }
                    }
                }
                this.f21309c = jSONObject2.getString("timestamp");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public Map<String, C0944c> m20205b() {
        return this.f21308b;
    }
}
