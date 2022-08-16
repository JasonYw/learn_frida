package cn.com.chinatelecom.account.api.p038e;

import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.C0665e;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p037d.C0657b;
import cn.com.chinatelecom.account.api.p037d.C0663h;
import cn.com.chinatelecom.account.api.p037d.C0664i;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: cn.com.chinatelecom.account.api.e.a */
/* loaded from: classes2.dex */
public final class C0666a {

    /* renamed from: a */
    public static final String f20989a = C0666a.class.getSimpleName();

    static {
        Covode.recordClassIndex(2717);
        new HashMap();
    }

    /* renamed from: a */
    public static long m20656a(Context context) {
        return C0668c.m20641b(context, "key_difference_time", 0L);
    }

    /* renamed from: a */
    public static C0668c m20653a(Context context, HttpURLConnection httpURLConnection, boolean z) {
        C0668c c0668c = new C0668c();
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List<String> list = headerFields.get("p");
            if (list != null && list.size() > 0) {
                CtAuth.info(f20989a, "request protocol : ".concat(String.valueOf(list.get(0))));
                c0668c.f20994b = false;
            }
            List<String> list2 = headerFields.get("Set-Cookie");
            if (list2 != null && list2.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= list2.size()) {
                        break;
                    }
                    String str = list2.get(0);
                    if (!TextUtils.isEmpty(str) && str.contains("gw_auth")) {
                        c0668c.f20993a = m20651a(str, "gw_auth");
                        break;
                    }
                    i++;
                }
            }
            List<String> list3 = headerFields.get("Log-Level");
            if (list3 != null && !list3.isEmpty()) {
                for (int i2 = 0; i2 < list3.size(); i2++) {
                    String str2 = list3.get(0);
                    if (!TextUtils.isEmpty(str2)) {
                        C0671f.m20604a(context, str2);
                    }
                }
            }
            List<String> list4 = headerFields.get("p-reset");
            if (list4 != null && !list4.isEmpty()) {
                String str3 = list4.get(0);
                if (!TextUtils.isEmpty(str3)) {
                    C0668c.m20645a(context, "key_p_rset_v3.8.7", str3);
                }
            }
            List<String> list5 = headerFields.get("p-ikgx");
            if (list5 != null && !list5.isEmpty()) {
                String str4 = list5.get(0);
                if (!TextUtils.isEmpty(str4)) {
                    c0668c.f20995c = str4;
                    C0673h.f21029d = str4;
                    return c0668c;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return c0668c;
    }

    /* renamed from: a */
    public static C0668c m20650a(HttpURLConnection httpURLConnection) {
        C0668c c0668c = new C0668c();
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List<String> list = headerFields.get("rdt_allow");
            if (list != null && list.size() > 0) {
                c0668c.f20996d = list.get(0);
                CtAuth.info(f20989a, C0002O.m25086C("request method : ", c0668c.f20996d));
            }
            List<String> list2 = headerFields.get("p-ikgx");
            if (list2 != null && !list2.isEmpty()) {
                String str = list2.get(0);
                if (!TextUtils.isEmpty(str)) {
                    c0668c.f20995c = str;
                    return c0668c;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return c0668c;
    }

    /* renamed from: a */
    public static synchronized String m20657a(int i) {
        synchronized (C0666a.class) {
            MethodCollector.m14708i(183);
            if (i == C0665e.f20988a) {
                MethodCollector.m14707o(183);
                return "presdk";
            }
            MethodCollector.m14707o(183);
            return "preauthIfaa";
        }
    }

    /* renamed from: a */
    public static String m20651a(String str, String str2) {
        try {
            String[] split = str.split(";");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(str2)) {
                    return split[i].split("=")[1];
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static JSONObject m20654a(Context context, C0664i c0664i, String str, Network network, boolean z, String str2) {
        if (c0664i == null || c0664i.f20985b == null) {
            return C0676k.m20575b();
        }
        JSONObject jSONObject = c0664i.f20985b;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (c0664i.f20984a == -1 || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        int optInt = jSONObject.optInt("result");
        String optString = jSONObject.optString(C2521l.LJIIL);
        if (!TextUtils.isEmpty(optString)) {
            JSONObject jSONObject2 = new JSONObject(C0674i.m20581a(optString, str));
            if (optInt == 0) {
                jSONObject2.put("gwAuth", c0664i.f20986c);
            }
            if (optInt == -10020) {
                jSONObject.put("taskId", str);
            }
            jSONObject.put(C2521l.LJIIL, jSONObject2);
        }
        if (optInt == 30002 && z) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = ((JSONObject) jSONObject.opt(C2521l.LJIIL)).optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            if (!arrayList.isEmpty()) {
                return m20652a(context, arrayList, str, network, str2);
            }
            return null;
        }
        if (optInt == -10009 || optInt == -30001) {
            long optLong = jSONObject.optLong("timeStamp", -1L);
            if (optLong != -1) {
                m20655a(context, optLong);
                return jSONObject;
            }
            String m20638a = C0669d.m20638a();
            C0663h c0663h = new C0663h();
            c0663h.m20671a("reqTimestamp");
            c0663h.m20666b(m20638a);
            JSONObject jSONObject3 = new C0657b(context).mo20682a(C0673h.m20595b(), "", 1, c0663h.m20675a()).f20985b;
            if (jSONObject3 != null) {
                m20655a(context, jSONObject3.optLong("msg", -1L));
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m20652a(Context context, List list, String str, Network network, String str2) {
        for (int i = 0; i < list.size(); i++) {
            try {
                String str3 = (String) list.get(i);
                if (!TextUtils.isEmpty(str3)) {
                    C0673h.m20594b(context);
                    C0663h c0663h = new C0663h();
                    try {
                        c0663h.m20666b(str2);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        c0663h.m20673a(network);
                        JSONObject m20654a = m20654a(context, new C0657b(context).mo20682a(str3, "", 0, c0663h.m20675a()), str, network, false, str2);
                        if (m20654a != null && m20654a.optInt("result") == 0) {
                            return m20654a;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                } else {
                    continue;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        new StringBuilder();
        return C0676k.m20577a(80001, C0002O.m25086C(C0632d.m20735a(C0676k.f21035b), "- redirect 30002 "));
    }

    /* renamed from: a */
    public static void m20655a(Context context, long j) {
        if (j > 0) {
            C0668c.m20646a(context, "key_difference_time", j - System.currentTimeMillis());
        }
    }
}
