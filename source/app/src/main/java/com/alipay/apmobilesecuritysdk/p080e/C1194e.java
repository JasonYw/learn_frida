package com.alipay.apmobilesecuritysdk.p080e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p078c.C1182a;
import com.alipay.apmobilesecuritysdk.p081f.C1199a;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.e.e */
/* loaded from: classes2.dex */
public final class C1194e {
    static {
        Covode.recordClassIndex(4666);
    }

    /* renamed from: a */
    public static C1195f m19547a(Context context) {
        if (context == null) {
            return null;
        }
        String m19497a = C1199a.m19497a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (C1448a.m18665a(m19497a)) {
            m19497a = C1199a.m19495a("device_feature_file_name", "device_feature_file_key");
        }
        if (C1448a.m18665a(m19497a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(m19497a);
            C1195f c1195f = new C1195f();
            c1195f.m19545a(jSONObject.getString("imei"));
            c1195f.m19543b(jSONObject.getString("imsi"));
            c1195f.m19541c(jSONObject.getString("mac"));
            c1195f.m19539d(jSONObject.getString("bluetoothmac"));
            c1195f.m19537e(jSONObject.getString("gsi"));
            return c1195f;
        } catch (Exception e) {
            C1182a.m19575a(e);
            return null;
        }
    }
}
