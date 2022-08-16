package com.alibaba.sdk.android.httpdns;

import android.text.Html;
import com.alibaba.sdk.android.httpdns.net64.C1084a;
import com.alibaba.sdk.android.httpdns.p071b.C1035b;
import com.alibaba.sdk.android.httpdns.p071b.C1036c;
import com.alibaba.sdk.android.httpdns.p071b.C1038e;
import com.alibaba.sdk.android.httpdns.p071b.C1040g;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.e */
/* loaded from: classes19.dex */
public class C1067e {

    /* renamed from: a */
    public String f21597a;

    /* renamed from: b */
    public long f21598b;

    /* renamed from: b */
    public String f21599b;

    /* renamed from: c */
    public long f21600c;
    public String hostName;
    public String[] ips;

    static {
        Covode.recordClassIndex(4473);
    }

    public C1067e(C1038e c1038e) {
        this.hostName = c1038e.host;
        this.f21600c = C1036c.m19968a(c1038e.f21545n);
        this.f21598b = -1000L;
        if (c1038e.f21540a != null && c1038e.f21540a.size() > 0) {
            int size = c1038e.f21540a.size();
            this.ips = new String[size];
            for (int i = 0; i < size; i++) {
                this.ips[i] = c1038e.f21540a.get(i).f21548o;
            }
        }
        if (C1084a.m19856a().m19855a()) {
            ArrayList arrayList = new ArrayList();
            if (c1038e.f21542b != null && c1038e.f21542b.size() > 0) {
                for (int i2 = 0; i2 < c1038e.f21542b.size(); i2++) {
                    arrayList.add(c1038e.f21542b.get(i2).f21548o);
                }
            }
            C1084a.m19856a().m19853a(this.hostName, arrayList);
        }
        this.f21597a = c1038e.f21539a;
        this.f21599b = c1038e.f21541b;
    }

    public C1067e(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject(str);
        this.hostName = jSONObject.getString(C1315c.f22208f);
        try {
            if (jSONObject.has("ips")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("ips");
                int length = jSONArray2.length();
                this.ips = new String[length];
                for (int i = 0; i < length; i++) {
                    this.ips[i] = jSONArray2.getString(i);
                }
            }
            if (C1084a.m19856a().m19855a() && jSONObject.has("ipsv6") && (jSONArray = jSONObject.getJSONArray("ipsv6")) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(jSONArray.getString(i2));
                }
                C1084a.m19856a().m19853a(this.hostName, arrayList);
            }
            if (jSONObject.has("extra")) {
                this.f21597a = jSONObject.getString("extra");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f21598b = jSONObject.getLong("ttl");
        this.f21600c = System.currentTimeMillis() / 1000;
    }

    public C1067e(String str, String[] strArr, long j, long j2, String str2, String str3) {
        this.hostName = str;
        this.ips = strArr;
        this.f21598b = j;
        this.f21600c = j2;
        this.f21597a = str2;
        this.f21599b = str3;
    }

    /* renamed from: a */
    public long m19898a() {
        return this.f21598b;
    }

    /* renamed from: a */
    public C1038e m19897a() {
        List<String> m19854a;
        String[] strArr;
        C1038e c1038e = new C1038e();
        c1038e.host = this.hostName;
        c1038e.f21545n = String.valueOf(this.f21600c);
        c1038e.f21544m = C1035b.m19969i();
        String[] strArr2 = this.ips;
        if (strArr2 != null && strArr2.length > 0) {
            c1038e.f21540a = new ArrayList<>();
            for (String str : this.ips) {
                C1040g c1040g = new C1040g();
                c1040g.f21548o = str;
                c1040g.f21549p = String.valueOf(this.f21598b);
                c1038e.f21540a.add(c1040g);
            }
        }
        if (C1084a.m19856a().m19855a() && (m19854a = C1084a.m19856a().m19854a(this.hostName)) != null && m19854a.size() > 0) {
            c1038e.f21542b = new ArrayList<>();
            for (String str2 : m19854a) {
                C1040g c1040g2 = new C1040g();
                c1040g2.f21548o = str2;
                c1040g2.f21549p = String.valueOf(this.f21598b);
                c1038e.f21542b.add(c1040g2);
            }
        }
        c1038e.f21539a = this.f21597a;
        c1038e.f21541b = this.f21599b;
        return c1038e;
    }

    /* renamed from: a */
    public String m19896a() {
        return this.f21597a;
    }

    /* renamed from: a */
    public Map<String, String> m19895a() {
        HashMap hashMap = new HashMap();
        String str = this.f21597a;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(Html.fromHtml(Html.fromHtml(str).toString()).toString());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.get(next) == null ? null : jSONObject.get(next).toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public long m19894b() {
        return this.f21600c;
    }

    /* renamed from: b */
    public boolean m19893b() {
        return m19894b() + m19898a() < System.currentTimeMillis() / 1000 || m19892c();
    }

    /* renamed from: c */
    public boolean m19892c() {
        return m19898a() == -1000;
    }

    public String getCacheKey() {
        return this.f21599b;
    }

    public String[] getIps() {
        return this.ips;
    }

    public void setCacheKey(String str) {
        this.f21599b = str;
    }

    public String toString() {
        String str = "host: " + this.hostName + " ip cnt: " + this.ips.length + " ttl: " + this.f21598b;
        for (int i = 0; i < this.ips.length; i++) {
            str = str + "\n ip: " + this.ips[i];
        }
        return str;
    }
}
