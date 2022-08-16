package com.alibaba.p052a.p053a.p057d;

import android.content.Context;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.j */
/* loaded from: classes13.dex */
public class C0907j {

    /* renamed from: a */
    public static final String f21219a = null;

    /* renamed from: c */
    public static C0907j f21220c;

    /* renamed from: b */
    public Map<EnumC0877f, C0904g> f21221b = new HashMap();

    /* renamed from: d */
    public int f21222d;

    /* renamed from: e */
    public String f21223e;

    static {
        Covode.recordClassIndex(4217);
    }

    public C0907j() {
        EnumC0877f[] values;
        Map<EnumC0877f, C0904g> map;
        C0904g c0904g;
        for (EnumC0877f enumC0877f : EnumC0877f.values()) {
            if (enumC0877f == EnumC0877f.ALARM) {
                map = this.f21221b;
                c0904g = new C0903f(enumC0877f, enumC0877f.m20474g());
            } else {
                map = this.f21221b;
                c0904g = new C0904g(enumC0877f, enumC0877f.m20474g());
            }
            map.put(enumC0877f, c0904g);
        }
    }

    /* renamed from: a */
    public static C0907j m20393a() {
        if (f21220c == null) {
            synchronized (C0907j.class) {
                if (f21220c == null) {
                    f21220c = new C0907j();
                }
            }
        }
        return f21220c;
    }

    /* renamed from: a */
    public static boolean m20390a(EnumC0877f enumC0877f, String str, String str2) {
        return m20393a().m20385b(enumC0877f, str, str2, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static boolean m20389a(EnumC0877f enumC0877f, String str, String str2, Map<String, String> map) {
        return m20393a().m20385b(enumC0877f, str, str2, map);
    }

    /* renamed from: a */
    public static boolean m20387a(String str, String str2, Boolean bool, Map<String, String> map) {
        return m20393a().m20384b(str, str2, bool, map);
    }

    /* renamed from: a */
    public void m20392a(Context context) {
        m20386b();
    }

    /* renamed from: a */
    public void m20391a(EnumC0877f enumC0877f, int i) {
        C0904g c0904g = this.f21221b.get(enumC0877f);
        if (c0904g != null) {
            c0904g.mo20400b(i);
        }
    }

    /* renamed from: a */
    public void m20388a(String str) {
        EnumC0877f[] values;
        C0974i.m20098a("SampleRules", "config:", str);
        synchronized (this) {
            if (C0912b.m20336b(str) || (this.f21223e != null && this.f21223e.equals(str))) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (EnumC0877f enumC0877f : EnumC0877f.values()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(enumC0877f.toString());
                    C0904g c0904g = this.f21221b.get(enumC0877f);
                    if (optJSONObject != null && c0904g != null) {
                        C0974i.m20098a(f21219a, enumC0877f, optJSONObject);
                        c0904g.mo20399b(optJSONObject);
                    }
                }
                this.f21223e = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void m20386b() {
        this.f21222d = new Random(System.currentTimeMillis()).nextInt(10000);
    }

    /* renamed from: b */
    public boolean m20385b(EnumC0877f enumC0877f, String str, String str2, Map<String, String> map) {
        C0904g c0904g = this.f21221b.get(enumC0877f);
        if (c0904g != null) {
            return c0904g.mo20401a(this.f21222d, str, str2, map);
        }
        return false;
    }

    /* renamed from: b */
    public boolean m20384b(String str, String str2, Boolean bool, Map<String, String> map) {
        C0904g c0904g = this.f21221b.get(EnumC0877f.ALARM);
        if (c0904g == null || !(c0904g instanceof C0903f)) {
            return false;
        }
        return ((C0903f) c0904g).m20403a(this.f21222d, str, str2, bool, map);
    }
}
