package com.alipay.apmobilesecuritysdk.p080e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p078c.C1182a;
import com.alipay.apmobilesecuritysdk.p081f.C1199a;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.e.d */
/* loaded from: classes2.dex */
public final class C1193d {
    static {
        Covode.recordClassIndex(4665);
    }

    /* renamed from: a */
    public static C1192c m19551a(String str) {
        try {
            if (C1448a.m18665a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C1192c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString(C1314b.f22207g));
        } catch (Exception e) {
            C1182a.m19575a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m19554a() {
        synchronized (C1193d.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m19553a(Context context) {
        synchronized (C1193d.class) {
            C1199a.m19496a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            C1199a.m19494a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    /* renamed from: a */
    public static synchronized void m19552a(Context context, C1192c c1192c) {
        synchronized (C1193d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", c1192c.f21959a);
                jSONObject.put("deviceInfoHash", c1192c.f21960b);
                jSONObject.put("timestamp", c1192c.f21961c);
                jSONObject.put("tid", c1192c.f21962d);
                jSONObject.put(C1314b.f22207g, c1192c.f21963e);
                String jSONObject2 = jSONObject.toString();
                C1199a.m19496a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                C1199a.m19494a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e) {
                C1182a.m19575a(e);
            }
        }
    }

    /* renamed from: b */
    public static synchronized C1192c m19550b() {
        synchronized (C1193d.class) {
            String m19495a = C1199a.m19495a("wxcasxx_v4", "key_wxcasxx_v4");
            if (C1448a.m18665a(m19495a)) {
                return null;
            }
            return m19551a(m19495a);
        }
    }

    /* renamed from: b */
    public static synchronized C1192c m19549b(Context context) {
        C1192c m19551a;
        synchronized (C1193d.class) {
            String m19497a = C1199a.m19497a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (C1448a.m18665a(m19497a)) {
                m19497a = C1199a.m19495a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            m19551a = m19551a(m19497a);
        }
        return m19551a;
    }

    /* renamed from: c */
    public static synchronized C1192c m19548c(Context context) {
        synchronized (C1193d.class) {
            String m19497a = C1199a.m19497a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (C1448a.m18665a(m19497a)) {
                return null;
            }
            return m19551a(m19497a);
        }
    }
}
