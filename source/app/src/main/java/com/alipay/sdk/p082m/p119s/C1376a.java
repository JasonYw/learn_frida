package com.alipay.sdk.p082m.p119s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p099i.C1287a;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p103k.C1309b;
import com.alipay.sdk.p082m.p105l.C1313a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p121u.C1381a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.s.a */
/* loaded from: classes2.dex */
public class C1376a {

    /* renamed from: a */
    public String f22364a;

    /* renamed from: b */
    public String f22365b;

    /* renamed from: c */
    public Context f22366c;

    /* renamed from: d */
    public final String f22367d;

    /* renamed from: g */
    public final String f22370g;

    /* renamed from: i */
    public final ActivityInfo f22372i;

    /* renamed from: j */
    public final C1309b f22373j;

    /* renamed from: h */
    public boolean f22371h = false;

    /* renamed from: e */
    public final long f22368e = SystemClock.elapsedRealtime();

    /* renamed from: f */
    public final int f22369f = C1399n.m18767g();

    static {
        Covode.recordClassIndex(4876);
    }

    /* renamed from: f */
    public static C1376a m18925f() {
        return null;
    }

    /* renamed from: a */
    public Context m18942a() {
        return this.f22366c;
    }

    /* renamed from: b */
    public String m18935b() {
        return this.f22365b;
    }

    /* renamed from: c */
    public String m18931c() {
        return this.f22364a;
    }

    /* renamed from: d */
    public boolean m18929d() {
        return this.f22371h;
    }

    /* renamed from: e */
    private JSONObject m18927e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.f22367d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: com.alipay.sdk.m.s.a$a */
    /* loaded from: classes2.dex */
    public static final class C1377a {

        /* renamed from: a */
        public static final HashMap<UUID, C1376a> f22374a = new HashMap<>();

        /* renamed from: b */
        public static final HashMap<String, C1376a> f22375b = new HashMap<>();

        static {
            Covode.recordClassIndex(4877);
        }

        /* renamed from: a */
        public static C1376a m18923a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (!(serializableExtra instanceof UUID)) {
                return null;
            }
            return f22374a.remove(serializableExtra);
        }

        /* renamed from: a */
        public static C1376a m18920a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f22375b.remove(str);
        }

        /* renamed from: a */
        public static void m18921a(C1376a c1376a, String str) {
            if (c1376a != null && !TextUtils.isEmpty(str)) {
                f22375b.put(str, c1376a);
            }
        }

        /* renamed from: a */
        public static void m18922a(C1376a c1376a, Intent intent) {
            if (c1376a != null && intent != null) {
                UUID randomUUID = UUID.randomUUID();
                f22374a.put(randomUUID, c1376a);
                intent.putExtra("i_uuid_b_c", randomUUID);
            }
        }
    }

    /* renamed from: a */
    public void m18936a(boolean z) {
        this.f22371h = z;
    }

    /* renamed from: b */
    private String m18934b(String str) {
        return m18937a(new JSONObject(str));
    }

    /* renamed from: f */
    private boolean m18924f(String str) {
        return !str.contains("\"&");
    }

    /* renamed from: d */
    private String m18928d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", m18934b(jSONObject.optString("bizcontext")));
            return C0002O.m25086C("new_external_info==", jSONObject.toString());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m18941a(C1376a c1376a) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (c1376a != null) {
            hashMap.put("sdk_ver", C1287a.f22143g);
            hashMap.put("app_name", c1376a.f22365b);
            hashMap.put("token", c1376a.f22367d);
            hashMap.put("call_type", c1376a.f22370g);
            hashMap.put("ts_api_invoke", String.valueOf(c1376a.f22368e));
            C1381a.m18883a(c1376a, hashMap);
        }
        return hashMap;
    }

    /* renamed from: c */
    private String m18930c(String str) {
        try {
            String m18938a = m18938a(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(m18938a)) {
                new StringBuilder();
                return C0002O.m25085C(str, "&", m18939a("bizcontext=", ""));
            }
            int indexOf = str.indexOf(m18938a);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + m18938a.length());
            new StringBuilder();
            return C0002O.m25085C(substring, m18932b(m18938a, "bizcontext=", ""), substring2);
        } catch (Throwable th) {
            C1301a.m19214a(this, "biz", "fmt1", th, str);
            return str;
        }
    }

    /* renamed from: e */
    private String m18926e(String str) {
        try {
            String m18938a = m18938a(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(m18938a)) {
                new StringBuilder();
                return C0002O.m25085C(str, "&", m18939a("bizcontext=\"", C1394i.f22426f));
            }
            if (!m18938a.endsWith(C1394i.f22426f)) {
                new StringBuilder();
                m18938a = C0002O.m25086C(m18938a, C1394i.f22426f);
            }
            int indexOf = str.indexOf(m18938a);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + m18938a.length());
            new StringBuilder();
            return C0002O.m25085C(substring, m18932b(m18938a, "bizcontext=\"", C1394i.f22426f), substring2);
        } catch (Throwable th) {
            C1301a.m19214a(this, "biz", "fmt2", th, str);
            return str;
        }
    }

    /* renamed from: a */
    public String m18940a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("new_external_info==")) {
            return m18928d(str);
        }
        if (m18924f(str)) {
            return m18930c(str);
        }
        return m18926e(str);
    }

    /* renamed from: a */
    public String m18937a(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", C1313a.f22203f);
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has("sv")) {
                jSONObject.put("sv", "h.a.3.8.10");
            }
            if (!jSONObject.has("an")) {
                jSONObject.put("an", this.f22365b);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f22364a);
            }
            if (!jSONObject.has("sdk_start_time")) {
                jSONObject.put("sdk_start_time", System.currentTimeMillis());
            }
            if (!jSONObject.has("extInfo")) {
                jSONObject.put("extInfo", m18927e());
            }
            if (!jSONObject.has("act_info")) {
                if (this.f22372i != null) {
                    str = this.f22372i.name + "|" + this.f22372i.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put("act_info", str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            C1301a.m19214a(this, "biz", "fmt3", th, String.valueOf(jSONObject));
            C1385e.m18866a(th);
            if (jSONObject != null) {
                return jSONObject.toString();
            }
            return "{}";
        }
    }

    /* renamed from: a */
    private String m18939a(String str, String str2) {
        new StringBuilder();
        return C0002O.m25085C(str, m18937a(new JSONObject()), str2);
    }

    /* renamed from: b */
    public static String m18933b(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", C1399n.m18765g(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    /* renamed from: a */
    private String m18938a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    public C1376a(Context context, String str, String str2) {
        String str3;
        this.f22364a = "";
        this.f22365b = "";
        this.f22366c = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.f22373j = new C1309b(context, isEmpty);
        this.f22367d = m18933b(str, this.f22365b);
        this.f22372i = C1399n.m18815a(context);
        this.f22370g = str2;
        if (!isEmpty) {
            C1301a.m19216a(this, "biz", "eptyp", str2 + "|" + this.f22367d);
            if (this.f22372i != null) {
                str3 = this.f22372i.name + "|" + this.f22372i.launchMode;
            } else {
                str3 = "null";
            }
            C1301a.m19216a(this, "biz", "actInfo", str3);
            C1301a.m19216a(this, "biz", "sys", C1399n.m18810a(this));
            C1301a.m19216a(this, "biz", "sdkv", "ef70839-clean");
        }
        try {
            this.f22366c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f22364a = packageInfo.versionName;
            this.f22365b = packageInfo.packageName;
        } catch (Exception e) {
            C1385e.m18866a(e);
        }
        if (!isEmpty) {
            C1301a.m19217a(this, "biz", "u" + C1399n.m18767g());
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            C1301a.m19216a(this, "biz", "PgApiInvoke", sb.toString());
            C1301a.m19218a(context, this, str, this.f22367d);
            if (C1328a.m19107z().m19115r()) {
                C1328a.m19107z().m19136a(this, this.f22366c, true, 2);
            }
        }
    }

    /* renamed from: b */
    private String m18932b(String str, String str2, String str3) {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith(C1394i.f22426f) && substring2.endsWith(C1394i.f22426f)) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        String m18937a = m18937a(jSONObject);
        if (z) {
            m18937a = C0002O.m25085C(C1394i.f22426f, m18937a, C1394i.f22426f);
        }
        new StringBuilder();
        return C0002O.m25085C(str2, m18937a, str3);
    }
}
