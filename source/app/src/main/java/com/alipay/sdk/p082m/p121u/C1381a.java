package com.alipay.sdk.p082m.p121u;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p095g.C1275a;
import com.alipay.sdk.p082m.p097h.C1280a;
import com.alipay.sdk.p082m.p097h.C1282c;
import com.alipay.sdk.p082m.p097h.C1285f;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p122w.C1405b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.u.a */
/* loaded from: classes2.dex */
public class C1381a {
    static {
        Covode.recordClassIndex(4881);
    }

    /* renamed from: a */
    public static C1275a m18885a() {
        try {
            try {
                return C1280a.m19282a("NP", System.currentTimeMillis(), new C1282c(C1378b.m18915d().m18916c()), (short) C1301a.C1306c.m19199a(C1378b.m18915d().m18917b()), new C1285f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return C1280a.m19281c();
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m18884a(C1376a c1376a) {
        Context context;
        String m19298a;
        String str;
        String str2;
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            C1275a m18885a = m18885a();
            JSONObject jSONObject = new JSONObject();
            if (c1376a != null) {
                context = c1376a.m18942a();
            } else {
                context = null;
            }
            if (context == null) {
                context = C1378b.m18915d().m18917b().getApplicationContext();
            }
            String m18809a = C1399n.m18809a(c1376a, context);
            String m18750b = C1405b.m18750b(c1376a, context);
            String str3 = "";
            if (m18885a == null) {
                m19298a = str3;
            } else {
                m19298a = m18885a.m19298a();
            }
            jSONObject.put("ap_q", m19298a);
            if (c1376a == null) {
                str = str3;
            } else {
                str = c1376a.f22367d;
            }
            jSONObject.put("ap_link_token", str);
            jSONObject.put("u_pd", String.valueOf(C1399n.m18767g()));
            jSONObject.put("u_lk", String.valueOf(C1399n.m18771e(C1399n.m18790b())));
            if (c1376a == null) {
                str2 = "_";
            } else {
                str2 = c1376a.f22370g;
            }
            jSONObject.put("u_pi", String.valueOf(str2));
            jSONObject.put("u_fu", m18809a);
            jSONObject.put("u_oi", m18750b);
            hashMap.put("ap_req", jSONObject.toString());
            new StringBuilder();
            if (m18885a != null) {
                str3 = m18885a.m19298a();
            }
            C1301a.m19216a(c1376a, "biz", "ap_q", C0002O.m25085C(str3, "|", m18809a));
            return hashMap;
        } catch (Exception e) {
            C1301a.m19215a(c1376a, "biz", "APMEx1", e);
            return hashMap;
        }
    }

    /* renamed from: a */
    public static JSONObject m18882a(C1376a c1376a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("ap_resp");
        try {
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            return new JSONObject(optString);
        } catch (JSONException e) {
            C1301a.m19215a(c1376a, "biz", "APMEx2", e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m18883a(C1376a c1376a, HashMap<String, String> hashMap) {
        JSONObject m19141a = C1328a.m19107z().m19141a();
        if (hashMap != null && m19141a != null) {
            C1301a.m19216a(c1376a, "biz", "ap_r", m19141a.optString("ap_r"));
            hashMap.putAll(C1399n.m18792a(m19141a));
        }
    }

    /* renamed from: a */
    public static void m18881a(C1376a c1376a, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                jSONObject.putOpt("ap_args", jSONObject2);
            } catch (JSONException e) {
                C1301a.m19215a(c1376a, "biz", "APMEx2", e);
            }
        }
    }
}
