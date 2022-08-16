package com.alibaba.p052a.p061b;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.p052a.p061b.p063b.C0949a;
import com.alibaba.p052a.p061b.p064c.C0954c;
import com.alibaba.p052a.p061b.p065d.C0960b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0977l;
import com.alibaba.p052a.p061b.p066e.C0999b;
import com.alibaba.p052a.p061b.p067f.AbstractC1001b;
import com.alibaba.p052a.p061b.p068g.C1003a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alibaba.a.b.a */
/* loaded from: classes13.dex */
public class C0941a {

    /* renamed from: a */
    public static boolean f21273a;

    /* renamed from: c */
    public static int f21275c;

    /* renamed from: e */
    public static boolean f21277e;

    /* renamed from: f */
    public static String f21278f;

    /* renamed from: g */
    public static final AtomicInteger f21279g;

    /* renamed from: h */
    public static boolean f21280h;

    /* renamed from: i */
    public static AbstractC1001b f21281i;

    /* renamed from: j */
    public static boolean f21282j;

    /* renamed from: k */
    public static Context f21283k;

    /* renamed from: l */
    public static boolean f21284l;

    /* renamed from: m */
    public static boolean f21285m;

    /* renamed from: b */
    public static int f21274b = 10000;

    /* renamed from: d */
    public static long f21276d = -1;

    static {
        Covode.recordClassIndex(4251);
        f21285m = f21275c <= f21274b;
        f21278f = String.valueOf(System.currentTimeMillis());
        f21279g = new AtomicInteger(0);
        f21280h = true;
        f21281i = null;
        f21282j = true;
    }

    /* renamed from: a */
    public static void m20239a() {
        C0974i.m20098a("UTDC", "[onBackground]");
        f21273a = true;
        C0949a.m20174k();
    }

    /* renamed from: a */
    public static synchronized void m20238a(Context context) {
        synchronized (C0941a.class) {
            if (context == null) {
                C0974i.m20100a("UTDC", "UTDC init failed ,context:" + context);
                return;
            }
            if (!f21284l) {
                f21284l = true;
                f21283k = context.getApplicationContext();
                C1003a.m20036a().m20034b();
            }
        }
    }

    /* renamed from: a */
    public static void m20237a(AbstractC1001b abstractC1001b) {
        f21281i = abstractC1001b;
        if (abstractC1001b != null) {
            C0960b.m20137b(f21281i.mo20039a());
        }
    }

    /* renamed from: a */
    public static void m20236a(String str) {
        C0960b.m20140a(str);
    }

    /* renamed from: a */
    public static void m20235a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (f21283k == null) {
            C0974i.m20100a("UTDC", "please call UTDC.init(context) before commit log,and this log will be discarded");
        } else if (f21281i == null) {
            C0974i.m20100a("UTDC", "please call UTDC.setRequestAuthentication(auth) before commit log,and this log will be discarded");
        } else {
            C0974i.m20098a("UTDC", "[commit] page:", str, "eventId:", str2, "arg1:", str3, "arg2:", str4, "arg3:", str5, "args:", map);
            C0949a.m20188a(str2);
            C0954c.m20156a().m20152a(new C0999b(str, str2, str3, str4, str5, map));
        }
    }

    /* renamed from: b */
    public static void m20234b() {
        C0974i.m20098a("UTDC", "[onForeground]");
        f21273a = false;
        C1003a.m20036a().m20034b();
    }

    /* renamed from: c */
    public static Context m20233c() {
        return f21283k;
    }

    /* renamed from: d */
    public static AbstractC1001b m20232d() {
        AbstractC1001b abstractC1001b = f21281i;
        if ((abstractC1001b == null || TextUtils.isEmpty(abstractC1001b.mo20039a())) && C0974i.m20095b()) {
            throw new RuntimeException("please Set <meta-data android:value=\"YOU KEY\" android:name=\"com.alibaba.apmplus.app_key\"></meta-data> in app AndroidManifest.xml ");
        }
        return f21281i;
    }

    /* renamed from: e */
    public static String m20231e() {
        try {
            return C0977l.m20087a(m20233c())[0];
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: f */
    public static String m20230f() {
        try {
            String[] m20087a = C0977l.m20087a(m20233c());
            return m20087a[0].equals("2G/3G") ? m20087a[1] : "Unknown";
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: g */
    public static String m20229g() {
        return "";
    }

    /* renamed from: h */
    public static String m20228h() {
        return "";
    }

    /* renamed from: i */
    public static void m20227i() {
        C1003a.m20036a().m20034b();
    }
}
