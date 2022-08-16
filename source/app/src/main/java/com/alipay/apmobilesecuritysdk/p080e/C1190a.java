package com.alipay.apmobilesecuritysdk.p080e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p078c.C1182a;
import com.alipay.apmobilesecuritysdk.p081f.C1199a;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.e.a */
/* loaded from: classes2.dex */
public final class C1190a {
    static {
        Covode.recordClassIndex(4662);
    }

    /* renamed from: a */
    public static C1191b m19558a(String str) {
        try {
            if (C1448a.m18665a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C1191b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            C1182a.m19575a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m19561a() {
        synchronized (C1190a.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m19560a(Context context) {
        synchronized (C1190a.class) {
            C1199a.m19496a(context, "vkeyid_profiles_v3", "deviceid", "");
            C1199a.m19494a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    /* renamed from: a */
    public static synchronized void m19559a(Context context, C1191b c1191b) {
        synchronized (C1190a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", c1191b.f21956a);
                jSONObject.put("deviceInfoHash", c1191b.f21957b);
                jSONObject.put("timestamp", c1191b.f21958c);
                String jSONObject2 = jSONObject.toString();
                C1199a.m19496a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                C1199a.m19494a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e) {
                C1182a.m19575a(e);
            }
        }
    }

    /* renamed from: b */
    public static synchronized C1191b m19557b() {
        synchronized (C1190a.class) {
            String m19495a = C1199a.m19495a("wxcasxx_v3", "wxcasxx");
            if (C1448a.m18665a(m19495a)) {
                return null;
            }
            return m19558a(m19495a);
        }
    }

    /* renamed from: b */
    public static synchronized C1191b m19556b(Context context) {
        C1191b m19558a;
        synchronized (C1190a.class) {
            String m19497a = C1199a.m19497a(context, "vkeyid_profiles_v3", "deviceid");
            if (C1448a.m18665a(m19497a)) {
                m19497a = C1199a.m19495a("wxcasxx_v3", "wxcasxx");
            }
            m19558a = m19558a(m19497a);
        }
        return m19558a;
    }

    /* renamed from: c */
    public static synchronized C1191b m19555c(Context context) {
        synchronized (C1190a.class) {
            String m19497a = C1199a.m19497a(context, "vkeyid_profiles_v3", "deviceid");
            if (C1448a.m18665a(m19497a)) {
                return null;
            }
            return m19558a(m19497a);
        }
    }
}
