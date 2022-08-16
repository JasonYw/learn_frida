package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.amap.api.mapcore2d.cr */
/* loaded from: classes19.dex */
public class C1574cr {

    /* renamed from: a */
    public static int f23179a = -1;

    /* renamed from: b */
    public static String f23180b = "";

    /* renamed from: com.amap.api.mapcore2d.cr$b */
    /* loaded from: classes19.dex */
    public static class C1582b extends AbstractC1673es {

        /* renamed from: f */
        public String f23235f;

        /* renamed from: g */
        public Map<String, String> f23236g;

        /* renamed from: h */
        public boolean f23237h;

        static {
            Covode.recordClassIndex(5130);
        }

        @Override // com.amap.api.mapcore2d.AbstractC1673es
        /* renamed from: b */
        public byte[] mo17328b() {
            return null;
        }

        @Override // com.amap.api.mapcore2d.AbstractC1673es
        /* renamed from: d */
        public String mo17609d() {
            return "3.0";
        }

        @Override // com.amap.api.mapcore2d.AbstractC1683ew
        /* renamed from: f */
        public Map<String, String> mo17322f() {
            return null;
        }

        /* renamed from: a */
        public boolean m18101a() {
            return this.f23237h;
        }

        @Override // com.amap.api.mapcore2d.AbstractC1673es
        /* renamed from: c */
        public byte[] mo17324c() {
            return C1602db.m17940a(C1602db.m17938a(m18100q()));
        }

        @Override // com.amap.api.mapcore2d.AbstractC1683ew
        /* renamed from: h */
        public String mo17320h() {
            if (this.f23237h) {
                return "https://restapi.amap.com/v3/iasdkauth";
            }
            return "http://restapi.amap.com/v3/iasdkauth";
        }

        /* renamed from: q */
        private Map<String, String> m18100q() {
            String m18031v = C1587cu.m18031v(this.f23541a);
            if (TextUtils.isEmpty(m18031v)) {
                m18031v = C1587cu.m18044i(this.f23541a);
            }
            if (!TextUtils.isEmpty(m18031v)) {
                StringBuilder sb = new StringBuilder(m18031v);
                sb.reverse();
                m18031v = C1594cx.m17990b(sb.toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", this.f23235f);
            hashMap.put("plattype", "android");
            hashMap.put("product", this.f23542b.m17972a());
            hashMap.put("version", this.f23542b.m17968b());
            hashMap.put("output", "json");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.VERSION.SDK_INT);
            hashMap.put("androidversion", sb2.toString());
            hashMap.put("deviceId", m18031v);
            hashMap.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map = this.f23236g;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(this.f23236g);
            }
            hashMap.put("abitype", C1602db.m17947a(this.f23541a));
            hashMap.put("ext", this.f23542b.m17964e());
            return hashMap;
        }

        public C1582b(Context context, C1599da c1599da, String str, Map<String, String> map) {
            super(context, c1599da);
            boolean z;
            this.f23235f = str;
            this.f23236g = map;
            if (Build.VERSION.SDK_INT != 19) {
                z = true;
            } else {
                z = false;
            }
            this.f23237h = z;
        }
    }

    /* renamed from: a */
    public static boolean m18111a(String str, boolean z) {
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
    public static void m18106a(JSONObject jSONObject, C1575a.C1581f c1581f) {
        if (c1581f != null) {
            try {
                String m18105a = m18105a(jSONObject, "md5");
                String m18105a2 = m18105a(jSONObject, "md5info");
                String m18105a3 = m18105a(jSONObject, PushConstants.WEB_URL);
                String m18105a4 = m18105a(jSONObject, "able");
                String m18105a5 = m18105a(jSONObject, "on");
                String m18105a6 = m18105a(jSONObject, "mobileable");
                c1581f.f23233e = m18105a;
                c1581f.f23234f = m18105a2;
                c1581f.f23232d = m18105a3;
                c1581f.f23229a = m18111a(m18105a4, false);
                c1581f.f23230b = m18111a(m18105a5, false);
                c1581f.f23231c = m18111a(m18105a6, false);
            } catch (Throwable th) {
                C1612dl.m17891a(th, "at", "pes");
            }
        }
    }

    /* renamed from: a */
    public static void m18107a(JSONObject jSONObject, C1575a.C1580e c1580e) {
        if (c1580e == null || jSONObject == null) {
            return;
        }
        c1580e.f23228a = m18111a(jSONObject.optString("able"), false);
    }

    /* renamed from: com.amap.api.mapcore2d.cr$a */
    /* loaded from: classes19.dex */
    public static class C1575a {

        /* renamed from: A */
        public C1578c f23181A;

        /* renamed from: B */
        public C1578c f23182B;

        /* renamed from: C */
        public C1577b f23183C;

        /* renamed from: D */
        public C1577b f23184D;

        /* renamed from: E */
        public C1577b f23185E;

        /* renamed from: F */
        public C1577b f23186F;

        /* renamed from: G */
        public C1581f f23187G;

        /* renamed from: H */
        public boolean f23188H;

        /* renamed from: a */
        public String f23189a;

        /* renamed from: b */
        public int f23190b = -1;

        /* renamed from: c */
        public JSONObject f23191c;

        /* renamed from: d */
        public JSONObject f23192d;

        /* renamed from: e */
        public JSONObject f23193e;

        /* renamed from: f */
        public JSONObject f23194f;

        /* renamed from: g */
        public JSONObject f23195g;

        /* renamed from: h */
        public JSONObject f23196h;

        /* renamed from: i */
        public JSONObject f23197i;

        /* renamed from: j */
        public JSONObject f23198j;

        /* renamed from: k */
        public JSONObject f23199k;

        /* renamed from: l */
        public JSONObject f23200l;

        /* renamed from: m */
        public JSONObject f23201m;

        /* renamed from: n */
        public JSONObject f23202n;

        /* renamed from: o */
        public JSONObject f23203o;

        /* renamed from: p */
        public JSONObject f23204p;

        /* renamed from: q */
        public JSONObject f23205q;

        /* renamed from: r */
        public JSONObject f23206r;

        /* renamed from: s */
        public JSONObject f23207s;

        /* renamed from: t */
        public JSONObject f23208t;

        /* renamed from: u */
        public JSONObject f23209u;

        /* renamed from: v */
        public JSONObject f23210v;

        /* renamed from: w */
        public JSONObject f23211w;

        /* renamed from: x */
        public C1576a f23212x;

        /* renamed from: y */
        public C1579d f23213y;

        /* renamed from: z */
        public C1580e f23214z;

        /* renamed from: com.amap.api.mapcore2d.cr$a$a */
        /* loaded from: classes19.dex */
        public static class C1576a {

            /* renamed from: a */
            public boolean f23215a;

            /* renamed from: b */
            public boolean f23216b;

            /* renamed from: c */
            public JSONObject f23217c;

            static {
                Covode.recordClassIndex(5124);
            }
        }

        /* renamed from: com.amap.api.mapcore2d.cr$a$b */
        /* loaded from: classes19.dex */
        public static class C1577b {

            /* renamed from: a */
            public boolean f23218a;

            /* renamed from: b */
            public String f23219b;

            /* renamed from: c */
            public String f23220c;

            /* renamed from: d */
            public String f23221d;

            /* renamed from: e */
            public boolean f23222e;

            static {
                Covode.recordClassIndex(5125);
            }
        }

        /* renamed from: com.amap.api.mapcore2d.cr$a$c */
        /* loaded from: classes19.dex */
        public static class C1578c {

            /* renamed from: a */
            public String f23223a;

            /* renamed from: b */
            public String f23224b;

            static {
                Covode.recordClassIndex(5126);
            }
        }

        /* renamed from: com.amap.api.mapcore2d.cr$a$d */
        /* loaded from: classes19.dex */
        public static class C1579d {

            /* renamed from: a */
            public String f23225a;

            /* renamed from: b */
            public String f23226b;

            /* renamed from: c */
            public String f23227c;

            static {
                Covode.recordClassIndex(5127);
            }
        }

        /* renamed from: com.amap.api.mapcore2d.cr$a$e */
        /* loaded from: classes19.dex */
        public static class C1580e {

            /* renamed from: a */
            public boolean f23228a;

            static {
                Covode.recordClassIndex(5128);
            }
        }

        /* renamed from: com.amap.api.mapcore2d.cr$a$f */
        /* loaded from: classes19.dex */
        public static class C1581f {

            /* renamed from: a */
            public boolean f23229a;

            /* renamed from: b */
            public boolean f23230b;

            /* renamed from: c */
            public boolean f23231c;

            /* renamed from: d */
            public String f23232d;

            /* renamed from: e */
            public String f23233e;

            /* renamed from: f */
            public String f23234f;

            static {
                Covode.recordClassIndex(5129);
            }
        }

        static {
            Covode.recordClassIndex(5123);
        }

        /* renamed from: a */
        public boolean m18104a() {
            return this.f23188H;
        }
    }

    static {
        Covode.recordClassIndex(5122);
    }

    /* renamed from: a */
    public static String m18105a(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str) || jSONObject.getString(str).equals("[]")) {
            return "";
        }
        return jSONObject.optString(str);
    }

    /* renamed from: a */
    public static void m18113a(Context context, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("15K");
            boolean m18111a = m18111a(jSONObject2.optString("isTargetAble"), false);
            if (!m18111a(jSONObject2.optString("able"), false)) {
                C1590cw.m18013a().m18007b(context);
            } else {
                C1590cw.m18013a().m18011a(context, m18111a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m18110a(JSONObject jSONObject, C1575a.C1577b c1577b) {
        if (c1577b != null) {
            try {
                String m18105a = m18105a(jSONObject, "m");
                String m18105a2 = m18105a(jSONObject, "u");
                String m18105a3 = m18105a(jSONObject, "v");
                String m18105a4 = m18105a(jSONObject, "able");
                String m18105a5 = m18105a(jSONObject, "on");
                c1577b.f23220c = m18105a;
                c1577b.f23219b = m18105a2;
                c1577b.f23221d = m18105a3;
                c1577b.f23218a = m18111a(m18105a4, false);
                c1577b.f23222e = m18111a(m18105a5, true);
            } catch (Throwable th) {
                C1612dl.m17891a(th, "at", "pe");
            }
        }
    }

    /* renamed from: a */
    public static void m18109a(JSONObject jSONObject, C1575a.C1578c c1578c) {
        if (jSONObject != null) {
            try {
                String m18105a = m18105a(jSONObject, "md5");
                String m18105a2 = m18105a(jSONObject, PushConstants.WEB_URL);
                c1578c.f23224b = m18105a;
                c1578c.f23223a = m18105a2;
            } catch (Throwable th) {
                C1612dl.m17891a(th, "at", "psc");
            }
        }
    }

    /* renamed from: a */
    public static void m18112a(C1575a c1575a, JSONObject jSONObject) {
        try {
            if (C1602db.m17937a(jSONObject, "11B")) {
                c1575a.f23196h = jSONObject.getJSONObject("11B");
            }
            if (C1602db.m17937a(jSONObject, "11C")) {
                c1575a.f23199k = jSONObject.getJSONObject("11C");
            }
            if (C1602db.m17937a(jSONObject, "11I")) {
                c1575a.f23200l = jSONObject.getJSONObject("11I");
            }
            if (C1602db.m17937a(jSONObject, "11H")) {
                c1575a.f23201m = jSONObject.getJSONObject("11H");
            }
            if (C1602db.m17937a(jSONObject, "11E")) {
                c1575a.f23202n = jSONObject.getJSONObject("11E");
            }
            if (C1602db.m17937a(jSONObject, "11F")) {
                c1575a.f23203o = jSONObject.getJSONObject("11F");
            }
            if (C1602db.m17937a(jSONObject, "13A")) {
                c1575a.f23205q = jSONObject.getJSONObject("13A");
            }
            if (C1602db.m17937a(jSONObject, "13J")) {
                c1575a.f23197i = jSONObject.getJSONObject("13J");
            }
            if (C1602db.m17937a(jSONObject, "11G")) {
                c1575a.f23204p = jSONObject.getJSONObject("11G");
            }
            if (C1602db.m17937a(jSONObject, "006")) {
                c1575a.f23206r = jSONObject.getJSONObject("006");
            }
            if (C1602db.m17937a(jSONObject, "010")) {
                c1575a.f23207s = jSONObject.getJSONObject("010");
            }
            if (C1602db.m17937a(jSONObject, "11Z")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("11Z");
                C1575a.C1577b c1577b = new C1575a.C1577b();
                m18110a(jSONObject2, c1577b);
                c1575a.f23183C = c1577b;
            }
            if (C1602db.m17937a(jSONObject, "135")) {
                c1575a.f23198j = jSONObject.getJSONObject("135");
            }
            if (C1602db.m17937a(jSONObject, "13S")) {
                c1575a.f23195g = jSONObject.getJSONObject("13S");
            }
            if (C1602db.m17937a(jSONObject, "121")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("121");
                C1575a.C1577b c1577b2 = new C1575a.C1577b();
                m18110a(jSONObject3, c1577b2);
                c1575a.f23184D = c1577b2;
            }
            if (C1602db.m17937a(jSONObject, "122")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("122");
                C1575a.C1577b c1577b3 = new C1575a.C1577b();
                m18110a(jSONObject4, c1577b3);
                c1575a.f23185E = c1577b3;
            }
            if (C1602db.m17937a(jSONObject, "123")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("123");
                C1575a.C1577b c1577b4 = new C1575a.C1577b();
                m18110a(jSONObject5, c1577b4);
                c1575a.f23186F = c1577b4;
            }
            if (C1602db.m17937a(jSONObject, "011")) {
                c1575a.f23191c = jSONObject.getJSONObject("011");
            }
            if (C1602db.m17937a(jSONObject, "012")) {
                c1575a.f23192d = jSONObject.getJSONObject("012");
            }
            if (C1602db.m17937a(jSONObject, "013")) {
                c1575a.f23193e = jSONObject.getJSONObject("013");
            }
            if (C1602db.m17937a(jSONObject, "014")) {
                c1575a.f23194f = jSONObject.getJSONObject("014");
            }
            if (C1602db.m17937a(jSONObject, "145")) {
                c1575a.f23208t = jSONObject.getJSONObject("145");
            }
            if (C1602db.m17937a(jSONObject, "14B")) {
                c1575a.f23209u = jSONObject.getJSONObject("14B");
            }
            if (C1602db.m17937a(jSONObject, "14D")) {
                c1575a.f23210v = jSONObject.getJSONObject("14D");
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "at", "pe");
        }
    }

    /* renamed from: a */
    public static void m18108a(JSONObject jSONObject, C1575a.C1579d c1579d) {
        if (jSONObject != null) {
            try {
                String m18105a = m18105a(jSONObject, "md5");
                String m18105a2 = m18105a(jSONObject, PushConstants.WEB_URL);
                String m18105a3 = m18105a(jSONObject, "sdkversion");
                if (!TextUtils.isEmpty(m18105a) && !TextUtils.isEmpty(m18105a2) && !TextUtils.isEmpty(m18105a3)) {
                    c1579d.f23225a = m18105a2;
                    c1579d.f23226b = m18105a;
                    c1579d.f23227c = m18105a3;
                }
            } catch (Throwable th) {
                C1612dl.m17891a(th, "at", "psu");
            }
        }
    }

    /* renamed from: a */
    public static C1575a m18115a(Context context, C1599da c1599da, String str, Map<String, String> map) {
        return m18114a(context, c1599da, str, map, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00dc, code lost:
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v11, types: [com.amap.api.mapcore2d.da] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.amap.api.mapcore2d.C1574cr.C1575a m18114a(android.content.Context r22, com.amap.api.mapcore2d.C1599da r23, java.lang.String r24, java.util.Map<java.lang.String, java.lang.String> r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1574cr.m18114a(android.content.Context, com.amap.api.mapcore2d.da, java.lang.String, java.util.Map, boolean):com.amap.api.mapcore2d.cr$a");
    }
}
