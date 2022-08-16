package com.alipay.apmobilesecuritysdk.p079d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p078c.C1182a;
import com.alipay.apmobilesecuritysdk.p080e.C1194e;
import com.alipay.apmobilesecuritysdk.p080e.C1195f;
import com.alipay.apmobilesecuritysdk.p081f.C1199a;
import com.alipay.sdk.p082m.p084a0.C1222b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.d.c */
/* loaded from: classes2.dex */
public final class C1187c {
    static {
        Covode.recordClassIndex(4659);
    }

    /* renamed from: a */
    public static Map<String, String> m19569a(Context context) {
        C1222b m19418b = C1222b.m19418b();
        HashMap hashMap = new HashMap();
        C1195f m19547a = C1194e.m19547a(context);
        String m19420a = m19418b.m19420a(context);
        String m19417b = m19418b.m19417b(context);
        String m19392l = C1222b.m19392l(context);
        if (m19547a != null) {
            if (C1448a.m18665a(m19420a)) {
                m19420a = m19547a.m19546a();
            }
            if (C1448a.m18665a(m19417b)) {
                m19417b = m19547a.m19544b();
            }
            if (C1448a.m18665a(m19392l)) {
                m19392l = m19547a.m19538e();
            }
        }
        C1195f c1195f = new C1195f(m19420a, m19417b, "", "", m19392l);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", c1195f.m19546a());
                jSONObject.put("imsi", c1195f.m19544b());
                jSONObject.put("mac", c1195f.m19542c());
                jSONObject.put("bluetoothmac", c1195f.m19540d());
                jSONObject.put("gsi", c1195f.m19538e());
                String jSONObject2 = jSONObject.toString();
                C1199a.m19494a("device_feature_file_name", "device_feature_file_key", jSONObject2);
                C1199a.m19496a(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject2);
            } catch (Exception e) {
                C1182a.m19575a(e);
            }
        }
        hashMap.put("AD1", m19420a);
        hashMap.put("AD2", m19417b);
        hashMap.put("AD3", C1222b.m19402g(context));
        hashMap.put("AD5", C1222b.m19398i(context));
        hashMap.put("AD6", C1222b.m19396j(context));
        hashMap.put("AD7", C1222b.m19394k(context));
        hashMap.put("AD9", m19418b.m19415c(context));
        hashMap.put("AD10", m19392l);
        hashMap.put("AD11", C1222b.m19407e());
        hashMap.put("AD12", m19418b.m19422a());
        hashMap.put("AD13", C1222b.m19405f());
        hashMap.put("AD14", C1222b.m19401h());
        hashMap.put("AD15", C1222b.m19399i());
        hashMap.put("AD16", C1222b.m19397j());
        hashMap.put("AD17", "");
        hashMap.put("AD19", C1222b.m19390m(context));
        hashMap.put("AD20", C1222b.m19395k());
        hashMap.put("AD22", "");
        hashMap.put("AD23", C1222b.m19388n(context));
        hashMap.put("AD24", C1448a.m18655g(C1222b.m19400h(context)));
        hashMap.put("AD26", C1222b.m19404f(context));
        hashMap.put("AD27", C1222b.m19385p());
        hashMap.put("AD28", C1222b.m19381r());
        hashMap.put("AD29", C1222b.m19378t());
        hashMap.put("AD30", C1222b.m19383q());
        hashMap.put("AD31", C1222b.m19379s());
        hashMap.put("AD32", C1222b.m19389n());
        hashMap.put("AD33", C1222b.m19387o());
        hashMap.put("AD34", C1222b.m19384p(context));
        hashMap.put("AD35", C1222b.m19382q(context));
        hashMap.put("AD36", C1222b.m19386o(context));
        hashMap.put("AD37", C1222b.m19391m());
        hashMap.put("AD38", C1222b.m19393l());
        hashMap.put("AD39", C1222b.m19408d(context));
        hashMap.put("AD40", C1222b.m19406e(context));
        hashMap.put("AD41", C1222b.m19416c());
        hashMap.put("AD42", C1222b.m19409d());
        return hashMap;
    }
}
