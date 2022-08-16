package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.internal.C33838c;
import com.umeng.message.proguard.C34037f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.cs */
/* loaded from: classes19.dex */
public class C1583cs {

    /* renamed from: c */
    public static C1599da f23240c;

    /* renamed from: e */
    public static String f23242e;

    /* renamed from: a */
    public static int f23238a = -1;

    /* renamed from: b */
    public static String f23239b = "";

    /* renamed from: d */
    public static String f23241d = "http://apiinit.amap.com/v3/log/init";

    /* renamed from: a */
    public static String m18099a() {
        return f23241d;
    }

    static {
        Covode.recordClassIndex(5131);
    }

    /* renamed from: a */
    public static void m18095a(String str) {
        C1573cq.m18124a(str);
    }

    /* renamed from: a */
    public static Map<String, String> m18098a(Context context) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("resType", "json");
            hashMap.put("encode", C34037f.f43302f);
            String m18093a = C1584ct.m18093a();
            hashMap.put("ts", m18093a);
            hashMap.put("key", C1573cq.m18118f(context));
            hashMap.put("scode", C1584ct.m18089a(context, m18093a, C1602db.m17927d(C0002O.m25086C("resType=json&encode=UTF-8&key=", C1573cq.m18118f(context)))));
            return hashMap;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "Auth", "gParams");
            return hashMap;
        }
    }

    /* renamed from: a */
    public static boolean m18094a(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(C1602db.m17936a(bArr));
            if (jSONObject.has("status")) {
                int i = jSONObject.getInt("status");
                if (i == 1) {
                    f23238a = 1;
                } else if (i == 0) {
                    f23238a = 0;
                }
            }
            if (jSONObject.has(C33838c.f42636f)) {
                f23239b = jSONObject.getString(C33838c.f42636f);
            }
            if (f23238a == 1) {
                return true;
            }
            return false;
        } catch (JSONException e) {
            C1612dl.m17891a(e, "Auth", "lData");
            return false;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "Auth", "lData");
            return false;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m18097a(Context context, C1599da c1599da) {
        boolean m18096a;
        synchronized (C1583cs.class) {
            m18096a = m18096a(context, c1599da, false);
        }
        return m18096a;
    }

    /* renamed from: a */
    public static boolean m18096a(Context context, C1599da c1599da, boolean z) {
        f23240c = c1599da;
        boolean z2 = true;
        try {
            String m18099a = m18099a();
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("Accept-Encoding", "gzip");
            hashMap.put("Connection", "Keep-Alive");
            hashMap.put("User-Agent", f23240c.m17965d());
            hashMap.put("X-INFO", C1584ct.m18085b(context));
            hashMap.put("logversion", "2.1");
            hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", f23240c.m17968b(), f23240c.m17972a()));
            C1671er m17615a = C1671er.m17615a();
            C1603dc c1603dc = new C1603dc();
            c1603dc.m17571a(C1595cy.m17983a(context));
            c1603dc.m17917a(hashMap);
            c1603dc.m17916b(m18098a(context));
            c1603dc.m17918a(m18099a);
            z2 = m18094a(m17615a.mo17576b(c1603dc));
            return z2;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "Auth", "getAuth");
            return z2;
        }
    }
}
