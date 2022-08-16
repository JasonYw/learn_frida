package com.alipay.sdk.p082m.p120t;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p109n.C1337e;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import java.util.Random;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.G4Y;

/* renamed from: com.alipay.sdk.m.t.a */
/* loaded from: classes2.dex */
public class C1379a {

    /* renamed from: g */
    public static final String f22378g = "alipay_tid_storage";

    /* renamed from: n */
    public static Context f22379n;

    /* renamed from: o */
    public static C1379a f22380o;

    /* renamed from: a */
    public String f22381a;

    /* renamed from: b */
    public String f22382b;

    /* renamed from: c */
    public long f22383c;

    /* renamed from: d */
    public String f22384d;

    /* renamed from: e */
    public String f22385e;

    /* renamed from: f */
    public boolean f22386f = false;

    static {
        Covode.recordClassIndex(4879);
    }

    /* renamed from: o */
    private void m18894o() {
    }

    /* renamed from: c */
    public String m18906c() {
        return this.f22382b;
    }

    /* renamed from: d */
    public String m18905d() {
        return this.f22381a;
    }

    /* renamed from: f */
    public String m18903f() {
        return this.f22384d;
    }

    /* renamed from: g */
    public String m18902g() {
        return this.f22385e;
    }

    /* renamed from: e */
    public Long m18904e() {
        return Long.valueOf(this.f22383c);
    }

    /* renamed from: h */
    public boolean m18901h() {
        return m18900i();
    }

    /* renamed from: a */
    public void m18913a() {
        C1385e.m18865b("mspl", "tid_str: del");
        m18896m();
    }

    /* renamed from: com.alipay.sdk.m.t.a$a */
    /* loaded from: classes2.dex */
    public static class C1380a {
        static {
            Covode.recordClassIndex(4880);
        }

        /* renamed from: a */
        public static String m18893a() {
            String str;
            try {
                str = C1379a.f22379n.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C1385e.m18866a(th);
                str = "";
            }
            new StringBuilder();
            return C0002O.m25086C(str, "0000000000000000000000000000").substring(0, 24);
        }

        /* renamed from: d */
        public static String m18886d(String str, String str2) {
            return m18889a(str, str2, true);
        }

        /* renamed from: a */
        public static boolean m18892a(String str, String str2) {
            if (C1379a.f22379n == null) {
                return false;
            }
            return G4Y.LIZ(C1379a.f22379n, str, 0).contains(str2);
        }

        /* renamed from: b */
        public static void m18888b(String str, String str2) {
            if (C1379a.f22379n == null) {
                return;
            }
            G4Y.LIZ(C1379a.f22379n, str, 0).edit().remove(str2).apply();
        }

        /* renamed from: c */
        public static boolean m18887c(String str, String str2) {
            if (C1379a.f22379n == null) {
                return false;
            }
            return G4Y.LIZ(C1379a.f22379n, str, 0).contains(str2);
        }

        /* renamed from: a */
        public static void m18891a(String str, String str2, String str3) {
            m18890a(str, str2, str3, true);
        }

        /* renamed from: a */
        public static String m18889a(String str, String str2, boolean z) {
            if (C1379a.f22379n == null) {
                return null;
            }
            String string = G4Y.LIZ(C1379a.f22379n, str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z) {
                string = C1337e.m19073a(m18893a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    C1385e.m18865b("mspl", "tid_str: pref failed");
                }
            }
            C1385e.m18865b("mspl", "tid_str: from local");
            return string;
        }

        /* renamed from: a */
        public static void m18890a(String str, String str2, String str3, boolean z) {
            if (C1379a.f22379n == null) {
                return;
            }
            SharedPreferences LIZ = G4Y.LIZ(C1379a.f22379n, str, 0);
            if (z) {
                String m18893a = m18893a();
                String m19071b = C1337e.m19071b(m18893a, str3, str3);
                if (TextUtils.isEmpty(m19071b)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, m18893a);
                }
                str3 = m19071b;
            }
            LIZ.edit().putString(str2, str3).apply();
        }
    }

    /* renamed from: k */
    private String m18898k() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    /* renamed from: m */
    private void m18896m() {
        this.f22381a = "";
        this.f22382b = m18908b();
        this.f22383c = System.currentTimeMillis();
        this.f22384d = m18898k();
        this.f22385e = m18898k();
        C1380a.m18888b(f22378g, "tidinfo");
    }

    /* renamed from: n */
    private void m18895n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f22381a);
            jSONObject.put("client_key", this.f22382b);
            jSONObject.put("timestamp", this.f22383c);
            jSONObject.put("vimei", this.f22384d);
            jSONObject.put("vimsi", this.f22385e);
            C1380a.m18890a(f22378g, "tidinfo", jSONObject.toString(), true);
        } catch (Exception e) {
            C1385e.m18866a(e);
        }
    }

    /* renamed from: b */
    public String m18908b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        if (hexString.length() > 10) {
            return hexString.substring(hexString.length() - 10);
        }
        return hexString;
    }

    /* renamed from: i */
    public boolean m18900i() {
        if (!TextUtils.isEmpty(this.f22381a) && !TextUtils.isEmpty(this.f22382b) && !TextUtils.isEmpty(this.f22384d) && !TextUtils.isEmpty(this.f22385e)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m18897l() {
        /*
            r9 = this;
            java.lang.String r7 = ""
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r3 = 0
            java.lang.String r2 = "alipay_tid_storage"
            java.lang.String r1 = "tidinfo"
            r0 = 1
            java.lang.String r1 = com.alipay.sdk.p082m.p120t.C1379a.C1380a.m18889a(r2, r1, r0)     // Catch: java.lang.Exception -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L49
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4d
            r6.<init>(r1)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "tid"
            java.lang.String r5 = r6.optString(r0, r7)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "client_key"
            java.lang.String r4 = r6.optString(r0, r7)     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = "timestamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L46
            long r0 = r6.optLong(r2, r0)     // Catch: java.lang.Exception -> L46
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "vimei"
            java.lang.String r2 = r6.optString(r0, r7)     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "vimsi"
            java.lang.String r3 = r6.optString(r0, r7)     // Catch: java.lang.Exception -> L55
            goto L59
        L46:
            r0 = move-exception
            r2 = r3
            goto L56
        L49:
            r5 = r3
            r4 = r5
            r2 = r4
            goto L59
        L4d:
            r0 = move-exception
            r5 = r3
            r4 = r5
            goto L53
        L51:
            r0 = move-exception
            r4 = r3
        L53:
            r2 = r4
            goto L56
        L55:
            r0 = move-exception
        L56:
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)
        L59:
            java.lang.String r1 = "mspl"
            java.lang.String r0 = "tid_str: load"
            com.alipay.sdk.p082m.p121u.C1385e.m18865b(r1, r0)
            boolean r0 = r9.m18910a(r5, r4, r2, r3)
            if (r0 == 0) goto L6a
            r9.m18896m()
            return
        L6a:
            r9.f22381a = r5
            r9.f22382b = r4
            long r0 = r8.longValue()
            r9.f22383c = r0
            r9.f22384d = r2
            r9.f22385e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p120t.C1379a.m18897l():void");
    }

    /* renamed from: a */
    public static synchronized C1379a m18912a(Context context) {
        C1379a c1379a;
        synchronized (C1379a.class) {
            if (f22380o == null) {
                f22380o = new C1379a();
            }
            if (f22379n == null) {
                f22380o.m18907b(context);
            }
            c1379a = f22380o;
        }
        return c1379a;
    }

    /* renamed from: b */
    private void m18907b(Context context) {
        if (context != null) {
            f22379n = context.getApplicationContext();
        }
        if (this.f22386f) {
            return;
        }
        this.f22386f = true;
        m18897l();
    }

    /* renamed from: a */
    public void m18911a(String str, String str2) {
        C1385e.m18865b("mspl", "tid_str: save");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f22381a = str;
            this.f22382b = str2;
            this.f22383c = System.currentTimeMillis();
            m18895n();
            m18894o();
        }
    }

    /* renamed from: a */
    private boolean m18910a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m18909a(String str, String str2, String str3, String str4, Long l) {
        if (m18910a(str, str2, str3, str4)) {
            return;
        }
        this.f22381a = str;
        this.f22382b = str2;
        this.f22384d = str3;
        this.f22385e = str4;
        if (l == null) {
            this.f22383c = System.currentTimeMillis();
        } else {
            this.f22383c = l.longValue();
        }
        m18895n();
    }
}
