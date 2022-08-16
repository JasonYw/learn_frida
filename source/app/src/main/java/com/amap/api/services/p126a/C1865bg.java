package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.amap.api.services.a.bg */
/* loaded from: classes19.dex */
public class C1865bg {

    /* renamed from: a */
    public static int f24398a = -1;

    /* renamed from: b */
    public static String f24399b = "";

    /* renamed from: com.amap.api.services.a.bg$b */
    /* loaded from: classes19.dex */
    public static class C1873b extends AbstractC1959de {

        /* renamed from: c */
        public String f24454c;

        /* renamed from: d */
        public Map<String, String> f24455d;

        /* renamed from: e */
        public boolean f24456e;

        static {
            Covode.recordClassIndex(5484);
        }

        @Override // com.amap.api.services.p126a.AbstractC1959de
        /* renamed from: b */
        public byte[] mo16496b() {
            return null;
        }

        @Override // com.amap.api.services.p126a.AbstractC1969di
        /* renamed from: e */
        public Map<String, String> mo16388e() {
            return null;
        }

        @Override // com.amap.api.services.p126a.AbstractC1959de
        /* renamed from: f */
        public String mo16494f() {
            return "3.0";
        }

        /* renamed from: a */
        public boolean m16940a() {
            return this.f24456e;
        }

        @Override // com.amap.api.services.p126a.AbstractC1959de
        /* renamed from: c */
        public byte[] mo16495c() {
            return C1892bp.m16786a(C1892bp.m16784a(m16939r()));
        }

        @Override // com.amap.api.services.p126a.AbstractC1969di
        /* renamed from: i */
        public String mo16250i() {
            if (this.f24456e) {
                return "https://restapi.amap.com/v3/iasdkauth";
            }
            return "http://restapi.amap.com/v3/iasdkauth";
        }

        /* renamed from: r */
        private Map<String, String> m16939r() {
            String m16869w = C1878bj.m16869w(this.f24729a);
            if (TextUtils.isEmpty(m16869w)) {
                m16869w = C1878bj.m16882j(this.f24729a);
            }
            if (!TextUtils.isEmpty(m16869w)) {
                StringBuilder sb = new StringBuilder(m16869w);
                sb.reverse();
                m16869w = C1887bm.m16832b(sb.toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", this.f24454c);
            hashMap.put("plattype", "android");
            hashMap.put("product", this.f24730b.m16818a());
            hashMap.put("version", this.f24730b.m16814b());
            hashMap.put("output", "json");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.VERSION.SDK_INT);
            hashMap.put("androidversion", sb2.toString());
            hashMap.put("deviceId", m16869w);
            hashMap.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map = this.f24455d;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(this.f24455d);
            }
            hashMap.put("abitype", C1892bp.m16793a(this.f24729a));
            hashMap.put("ext", this.f24730b.m16811d());
            return hashMap;
        }

        public C1873b(Context context, C1889bo c1889bo, String str, Map<String, String> map) {
            super(context, c1889bo);
            boolean z;
            this.f24454c = str;
            this.f24455d = map;
            if (Build.VERSION.SDK_INT != 19) {
                z = true;
            } else {
                z = false;
            }
            this.f24456e = z;
        }
    }

    /* renamed from: a */
    public static boolean m16950a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            String[] split = URLDecoder.decode(str).split("/");
            return split[split.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public static void m16945a(JSONObject jSONObject, C1866a.C1872f c1872f) {
        if (c1872f != null) {
            try {
                String m16944a = m16944a(jSONObject, "md5");
                String m16944a2 = m16944a(jSONObject, "md5info");
                String m16944a3 = m16944a(jSONObject, PushConstants.WEB_URL);
                String m16944a4 = m16944a(jSONObject, "able");
                String m16944a5 = m16944a(jSONObject, "on");
                String m16944a6 = m16944a(jSONObject, "mobileable");
                c1872f.f24452e = m16944a;
                c1872f.f24453f = m16944a2;
                c1872f.f24451d = m16944a3;
                c1872f.f24448a = m16950a(m16944a4, false);
                c1872f.f24449b = m16950a(m16944a5, false);
                c1872f.f24450c = m16950a(m16944a6, false);
            } catch (Throwable th) {
                C1901by.m16742a(th, "at", "pes");
            }
        }
    }

    /* renamed from: a */
    public static void m16948a(JSONObject jSONObject, C1866a.C1869c c1869c) {
        if (jSONObject != null) {
            try {
                String m16944a = m16944a(jSONObject, "md5");
                String m16944a2 = m16944a(jSONObject, PushConstants.WEB_URL);
                c1869c.f24443b = m16944a;
                c1869c.f24442a = m16944a2;
            } catch (Throwable th) {
                C1901by.m16742a(th, "at", "psc");
            }
        }
    }

    /* renamed from: a */
    public static void m16947a(JSONObject jSONObject, C1866a.C1870d c1870d) {
        if (jSONObject != null) {
            try {
                String m16944a = m16944a(jSONObject, "md5");
                String m16944a2 = m16944a(jSONObject, PushConstants.WEB_URL);
                String m16944a3 = m16944a(jSONObject, "sdkversion");
                if (TextUtils.isEmpty(m16944a) || TextUtils.isEmpty(m16944a2) || TextUtils.isEmpty(m16944a3)) {
                    return;
                }
                c1870d.f24444a = m16944a2;
                c1870d.f24445b = m16944a;
                c1870d.f24446c = m16944a3;
            } catch (Throwable th) {
                C1901by.m16742a(th, "at", "psu");
            }
        }
    }

    /* renamed from: a */
    public static void m16946a(JSONObject jSONObject, C1866a.C1871e c1871e) {
        if (c1871e == null || jSONObject == null) {
            return;
        }
        c1871e.f24447a = m16950a(jSONObject.optString("able"), false);
    }

    /* renamed from: com.amap.api.services.a.bg$a */
    /* loaded from: classes19.dex */
    public static class C1866a {

        /* renamed from: A */
        public C1869c f24400A;

        /* renamed from: B */
        public C1869c f24401B;

        /* renamed from: C */
        public C1868b f24402C;

        /* renamed from: D */
        public C1868b f24403D;

        /* renamed from: E */
        public C1868b f24404E;

        /* renamed from: F */
        public C1868b f24405F;

        /* renamed from: G */
        public C1872f f24406G;

        /* renamed from: H */
        public boolean f24407H;

        /* renamed from: a */
        public String f24408a;

        /* renamed from: b */
        public int f24409b = -1;

        /* renamed from: c */
        public JSONObject f24410c;

        /* renamed from: d */
        public JSONObject f24411d;

        /* renamed from: e */
        public JSONObject f24412e;

        /* renamed from: f */
        public JSONObject f24413f;

        /* renamed from: g */
        public JSONObject f24414g;

        /* renamed from: h */
        public JSONObject f24415h;

        /* renamed from: i */
        public JSONObject f24416i;

        /* renamed from: j */
        public JSONObject f24417j;

        /* renamed from: k */
        public JSONObject f24418k;

        /* renamed from: l */
        public JSONObject f24419l;

        /* renamed from: m */
        public JSONObject f24420m;

        /* renamed from: n */
        public JSONObject f24421n;

        /* renamed from: o */
        public JSONObject f24422o;

        /* renamed from: p */
        public JSONObject f24423p;

        /* renamed from: q */
        public JSONObject f24424q;

        /* renamed from: r */
        public JSONObject f24425r;

        /* renamed from: s */
        public JSONObject f24426s;

        /* renamed from: t */
        public JSONObject f24427t;

        /* renamed from: u */
        public JSONObject f24428u;

        /* renamed from: v */
        public JSONObject f24429v;

        /* renamed from: w */
        public JSONObject f24430w;

        /* renamed from: x */
        public C1867a f24431x;

        /* renamed from: y */
        public C1870d f24432y;

        /* renamed from: z */
        public C1871e f24433z;

        /* renamed from: com.amap.api.services.a.bg$a$a */
        /* loaded from: classes19.dex */
        public static class C1867a {

            /* renamed from: a */
            public boolean f24434a;

            /* renamed from: b */
            public boolean f24435b;

            /* renamed from: c */
            public JSONObject f24436c;

            static {
                Covode.recordClassIndex(5478);
            }
        }

        /* renamed from: com.amap.api.services.a.bg$a$b */
        /* loaded from: classes19.dex */
        public static class C1868b {

            /* renamed from: a */
            public boolean f24437a;

            /* renamed from: b */
            public String f24438b;

            /* renamed from: c */
            public String f24439c;

            /* renamed from: d */
            public String f24440d;

            /* renamed from: e */
            public boolean f24441e;

            static {
                Covode.recordClassIndex(5479);
            }
        }

        /* renamed from: com.amap.api.services.a.bg$a$c */
        /* loaded from: classes19.dex */
        public static class C1869c {

            /* renamed from: a */
            public String f24442a;

            /* renamed from: b */
            public String f24443b;

            static {
                Covode.recordClassIndex(5480);
            }
        }

        /* renamed from: com.amap.api.services.a.bg$a$d */
        /* loaded from: classes19.dex */
        public static class C1870d {

            /* renamed from: a */
            public String f24444a;

            /* renamed from: b */
            public String f24445b;

            /* renamed from: c */
            public String f24446c;

            static {
                Covode.recordClassIndex(5481);
            }
        }

        /* renamed from: com.amap.api.services.a.bg$a$e */
        /* loaded from: classes19.dex */
        public static class C1871e {

            /* renamed from: a */
            public boolean f24447a;

            static {
                Covode.recordClassIndex(5482);
            }
        }

        /* renamed from: com.amap.api.services.a.bg$a$f */
        /* loaded from: classes19.dex */
        public static class C1872f {

            /* renamed from: a */
            public boolean f24448a;

            /* renamed from: b */
            public boolean f24449b;

            /* renamed from: c */
            public boolean f24450c;

            /* renamed from: d */
            public String f24451d;

            /* renamed from: e */
            public String f24452e;

            /* renamed from: f */
            public String f24453f;

            static {
                Covode.recordClassIndex(5483);
            }
        }

        static {
            Covode.recordClassIndex(5477);
        }

        /* renamed from: a */
        public boolean m16943a() {
            return this.f24407H;
        }
    }

    static {
        Covode.recordClassIndex(5476);
    }

    /* renamed from: a */
    public static String m16944a(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str) || jSONObject.getString(str).equals("[]")) {
            return "";
        }
        return jSONObject.optString(str);
    }

    /* renamed from: a */
    public static void m16952a(Context context, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("15K");
            boolean m16950a = m16950a(jSONObject2.optString("isTargetAble"), false);
            if (!m16950a(jSONObject2.optString("able"), false)) {
                C1883bl.m16855a().m16849b(context);
            } else {
                C1883bl.m16855a().m16853a(context, m16950a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16951a(C1866a c1866a, JSONObject jSONObject) {
        try {
            if (C1892bp.m16783a(jSONObject, "11B")) {
                c1866a.f24415h = jSONObject.getJSONObject("11B");
            }
            if (C1892bp.m16783a(jSONObject, "11C")) {
                c1866a.f24418k = jSONObject.getJSONObject("11C");
            }
            if (C1892bp.m16783a(jSONObject, "11I")) {
                c1866a.f24419l = jSONObject.getJSONObject("11I");
            }
            if (C1892bp.m16783a(jSONObject, "11H")) {
                c1866a.f24420m = jSONObject.getJSONObject("11H");
            }
            if (C1892bp.m16783a(jSONObject, "11E")) {
                c1866a.f24421n = jSONObject.getJSONObject("11E");
            }
            if (C1892bp.m16783a(jSONObject, "11F")) {
                c1866a.f24422o = jSONObject.getJSONObject("11F");
            }
            if (C1892bp.m16783a(jSONObject, "13A")) {
                c1866a.f24424q = jSONObject.getJSONObject("13A");
            }
            if (C1892bp.m16783a(jSONObject, "13J")) {
                c1866a.f24416i = jSONObject.getJSONObject("13J");
            }
            if (C1892bp.m16783a(jSONObject, "11G")) {
                c1866a.f24423p = jSONObject.getJSONObject("11G");
            }
            if (C1892bp.m16783a(jSONObject, "006")) {
                c1866a.f24425r = jSONObject.getJSONObject("006");
            }
            if (C1892bp.m16783a(jSONObject, "010")) {
                c1866a.f24426s = jSONObject.getJSONObject("010");
            }
            if (C1892bp.m16783a(jSONObject, "11Z")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("11Z");
                C1866a.C1868b c1868b = new C1866a.C1868b();
                m16949a(jSONObject2, c1868b);
                c1866a.f24402C = c1868b;
            }
            if (C1892bp.m16783a(jSONObject, "135")) {
                c1866a.f24417j = jSONObject.getJSONObject("135");
            }
            if (C1892bp.m16783a(jSONObject, "13S")) {
                c1866a.f24414g = jSONObject.getJSONObject("13S");
            }
            if (C1892bp.m16783a(jSONObject, "121")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("121");
                C1866a.C1868b c1868b2 = new C1866a.C1868b();
                m16949a(jSONObject3, c1868b2);
                c1866a.f24403D = c1868b2;
            }
            if (C1892bp.m16783a(jSONObject, "122")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("122");
                C1866a.C1868b c1868b3 = new C1866a.C1868b();
                m16949a(jSONObject4, c1868b3);
                c1866a.f24404E = c1868b3;
            }
            if (C1892bp.m16783a(jSONObject, "123")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("123");
                C1866a.C1868b c1868b4 = new C1866a.C1868b();
                m16949a(jSONObject5, c1868b4);
                c1866a.f24405F = c1868b4;
            }
            if (C1892bp.m16783a(jSONObject, "011")) {
                c1866a.f24410c = jSONObject.getJSONObject("011");
            }
            if (C1892bp.m16783a(jSONObject, "012")) {
                c1866a.f24411d = jSONObject.getJSONObject("012");
            }
            if (C1892bp.m16783a(jSONObject, "013")) {
                c1866a.f24412e = jSONObject.getJSONObject("013");
            }
            if (C1892bp.m16783a(jSONObject, "014")) {
                c1866a.f24413f = jSONObject.getJSONObject("014");
            }
            if (C1892bp.m16783a(jSONObject, "145")) {
                c1866a.f24427t = jSONObject.getJSONObject("145");
            }
            if (C1892bp.m16783a(jSONObject, "14B")) {
                c1866a.f24428u = jSONObject.getJSONObject("14B");
            }
            if (C1892bp.m16783a(jSONObject, "14D")) {
                c1866a.f24429v = jSONObject.getJSONObject("14D");
            }
        } catch (Throwable th) {
            C1906cb.m16716c(th, "at", "pe");
        }
    }

    /* renamed from: a */
    public static void m16949a(JSONObject jSONObject, C1866a.C1868b c1868b) {
        if (c1868b != null) {
            try {
                String m16944a = m16944a(jSONObject, "m");
                String m16944a2 = m16944a(jSONObject, "u");
                String m16944a3 = m16944a(jSONObject, "v");
                String m16944a4 = m16944a(jSONObject, "able");
                String m16944a5 = m16944a(jSONObject, "on");
                c1868b.f24439c = m16944a;
                c1868b.f24438b = m16944a2;
                c1868b.f24440d = m16944a3;
                c1868b.f24437a = m16950a(m16944a4, false);
                c1868b.f24441e = m16950a(m16944a5, true);
            } catch (Throwable th) {
                C1901by.m16742a(th, "at", "pe");
            }
        }
    }

    /* renamed from: a */
    public static void m16953a(Context context, C1889bo c1889bo, Throwable th) {
        String str;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "on exception";
        }
        m16957a(context, c1889bo, str);
    }

    /* renamed from: a */
    public static void m16957a(Context context, C1889bo c1889bo, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("amap_sdk_auth_fail", "1");
        hashMap.put("amap_sdk_auth_fail_type", str);
        hashMap.put("amap_sdk_name", c1889bo.m16818a());
        hashMap.put("amap_sdk_version", c1889bo.m16812c());
        String jSONObject = new JSONObject(hashMap).toString();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            C1979dq c1979dq = new C1979dq(context, c1889bo.m16818a(), c1889bo.m16812c(), "O016");
            c1979dq.m16426a(jSONObject);
            C1980dr.m16421a(c1979dq, context);
        } catch (C1863be unused) {
        }
    }

    /* renamed from: a */
    public static C1866a m16956a(Context context, C1889bo c1889bo, String str, Map<String, String> map) {
        return m16955a(context, c1889bo, str, map, false);
    }

    /* renamed from: a */
    public static C1866a m16955a(Context context, C1889bo c1889bo, String str, Map<String, String> map, boolean z) {
        return m16954a(context, c1889bo, str, map, z, "DEF_ID");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[Catch: all -> 0x02f7, TRY_LEAVE, TryCatch #10 {all -> 0x02f7, blocks: (B:30:0x00fa, B:32:0x0105, B:35:0x010e, B:39:0x0164, B:41:0x016c, B:55:0x01a7, B:58:0x01b1, B:59:0x01c3, B:64:0x01f5, B:66:0x01fd, B:67:0x020d, B:69:0x0215, B:70:0x0225, B:72:0x022d, B:73:0x023d, B:75:0x0248, B:76:0x0258, B:78:0x0260, B:79:0x0270, B:81:0x027b, B:83:0x02a5, B:85:0x02ab, B:86:0x02f0, B:87:0x02c5, B:89:0x02cd, B:90:0x02ec, B:96:0x0119, B:97:0x011d, B:99:0x0129, B:100:0x012f, B:102:0x0135, B:103:0x0139, B:105:0x0147, B:36:0x014f, B:38:0x0157, B:42:0x017e, B:44:0x0186, B:46:0x0189, B:48:0x018d, B:50:0x0195, B:52:0x019e, B:61:0x01cb, B:63:0x01e4), top: B:29:0x00fa }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.amap.api.services.p126a.C1865bg.C1866a m16954a(android.content.Context r20, com.amap.api.services.p126a.C1889bo r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, boolean r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1865bg.m16954a(android.content.Context, com.amap.api.services.a.bo, java.lang.String, java.util.Map, boolean, java.lang.String):com.amap.api.services.a.bg$a");
    }
}
