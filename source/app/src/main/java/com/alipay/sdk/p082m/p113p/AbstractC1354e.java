package com.alipay.sdk.p082m.p113p;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p105l.C1313a;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p107m.C1331b;
import com.alipay.sdk.p082m.p111o.C1344a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p120t.C1379a;
import com.alipay.sdk.p082m.p121u.C1384d;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1398m;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.p.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1354e {

    /* renamed from: f */
    public static final String f22314f = "content-type";

    /* renamed from: g */
    public static final String f22315g = "Version";

    /* renamed from: a */
    public boolean f22316a = true;

    /* renamed from: b */
    public boolean f22317b = true;

    static {
        Covode.recordClassIndex(4854);
    }

    /* renamed from: a */
    public Map<String, String> mo18975a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("msp-gzip", String.valueOf(z));
        hashMap.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        hashMap.put(f22314f, "application/octet-stream");
        hashMap.put(f22315g, "2.0");
        hashMap.put("AppId", "TAOBAO");
        hashMap.put("Msp-Param", C1350a.m19027a(str));
        hashMap.put("des-mode", "CBC");
        return hashMap;
    }

    /* renamed from: a */
    public abstract JSONObject mo18974a();

    /* renamed from: b */
    public String mo18979b() {
        return "4.9.0";
    }

    /* renamed from: c */
    public abstract boolean mo18973c();

    /* renamed from: a */
    public String mo18976a(C1376a c1376a, String str, JSONObject jSONObject) {
        C1378b m18915d = C1378b.m18915d();
        C1379a m18912a = C1379a.m18912a(m18915d.m18917b());
        JSONObject m18871a = C1384d.m18871a(new JSONObject(), jSONObject);
        try {
            m18871a.put("external_info", str);
            m18871a.put("tid", m18912a.m18905d());
            m18871a.put("user_agent", m18915d.m18919a().m19099a(c1376a, m18912a, mo18973c()));
            m18871a.put("has_alipay", C1399n.m18805a(c1376a, m18915d.m18917b(), C1294a.f22165d, false));
            m18871a.put(C1314b.f22206f, C1399n.m18763h(m18915d.m18917b()));
            m18871a.put("app_key", C1313a.f22203f);
            m18871a.put(C1314b.f22207g, m18915d.m18916c());
            m18871a.put("new_client_key", m18912a.m18906c());
            m18871a.put("pa", C1331b.m19096b(m18915d.m18917b()));
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "BodyErr", th);
            C1385e.m18866a(th);
        }
        return m18871a.toString();
    }

    /* renamed from: a */
    public String mo18980a(C1376a c1376a, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put(C2521l.LJIIL, jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static boolean m19008a(C1344a.C1346b c1346b) {
        return Boolean.valueOf(m19007a(c1346b, "msp-gzip")).booleanValue();
    }

    /* renamed from: a */
    public static boolean m19003a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(C2521l.LJIIL);
            if (!jSONObject.has("params")) {
                return false;
            }
            String optString = jSONObject.getJSONObject("params").optString("public_key", null);
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            C1331b.m19098a(optString);
            z = true;
            return true;
        } catch (JSONException e) {
            C1385e.m18866a(e);
            return z;
        }
    }

    /* renamed from: a */
    public String mo18978a(C1376a c1376a) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put("api_version", mo18979b());
        return mo18980a(c1376a, hashMap, new HashMap<>());
    }

    /* renamed from: a */
    public C1351b m19006a(C1376a c1376a, Context context) {
        return mo18977a(c1376a, context, "");
    }

    /* renamed from: a */
    public static String m19007a(C1344a.C1346b c1346b, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (c1346b == null || str == null || (map = c1346b.f22305a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
    }

    /* renamed from: a */
    public static JSONObject m19002a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    /* renamed from: a */
    public C1351b mo18977a(C1376a c1376a, Context context, String str) {
        return m19005a(c1376a, context, str, C1398m.m18819b(context));
    }

    /* renamed from: a */
    public C1351b m19005a(C1376a c1376a, Context context, String str, String str2) {
        return m19004a(c1376a, context, str, str2, true);
    }

    /* renamed from: a */
    public C1351b m19004a(C1376a c1376a, Context context, String str, String str2, boolean z) {
        C1385e.m18865b("mspl", C0002O.m25086C("Packet: ", str2));
        C1352c c1352c = new C1352c(this.f22317b);
        C1351b c1351b = new C1351b(mo18978a(c1376a), mo18976a(c1376a, str, mo18974a()));
        Map<String, String> mo18975a = mo18975a(false, str);
        C1353d m19017a = c1352c.m19017a(c1351b, this.f22316a, mo18975a.get("iSr"));
        C1344a.C1346b m19035a = C1344a.m19035a(context, new C1344a.C1345a(str2, mo18975a(m19017a.m19009b(), str), m19017a.m19010a()));
        if (m19035a != null) {
            C1351b m19016a = c1352c.m19016a(new C1353d(m19008a(m19035a), m19035a.f22307c), mo18975a.get("iSr"));
            if (m19016a != null && m19003a(m19016a.m19020b()) && z) {
                return m19004a(c1376a, context, str, str2, false);
            }
            return m19016a;
        }
        throw new RuntimeException("Response is null.");
    }
}
