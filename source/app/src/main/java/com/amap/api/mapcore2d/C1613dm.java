package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.G4Y;

/* renamed from: com.amap.api.mapcore2d.dm */
/* loaded from: classes19.dex */
public class C1613dm {

    /* renamed from: a */
    public static final String f23349a = "/a/";

    /* renamed from: b */
    public static final String f23350b = "b";

    /* renamed from: c */
    public static final String f23351c = "c";

    /* renamed from: d */
    public static final String f23352d = "d";

    /* renamed from: h */
    public static final String f23356h = "e";

    /* renamed from: i */
    public static final String f23357i = "f";

    /* renamed from: f */
    public static final String f23354f = "g";

    /* renamed from: g */
    public static final String f23355g = "h";

    /* renamed from: e */
    public static final String f23353e = "i";

    /* renamed from: j */
    public static final String f23358j = "j";

    static {
        Covode.recordClassIndex(5161);
    }

    /* renamed from: a */
    public static String m17890a(Context context) {
        return m17881c(context, f23353e);
    }

    /* renamed from: b */
    public static void m17885b(final Context context) {
        try {
            ExecutorService m17865d = C1616do.m17865d();
            if (m17865d != null && !m17865d.isShutdown()) {
                m17865d.submit(new Runnable() { // from class: com.amap.api.mapcore2d.dm.1
                    static {
                        Covode.recordClassIndex(5162);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C1692fc.m17543a(context);
                            C1620dp.m17848b(context);
                            C1620dp.m17845d(context);
                            C1620dp.m17846c(context);
                            C1699fg.m17529a(context);
                            C1695fe.m17537a(context);
                        } catch (RejectedExecutionException unused) {
                        } catch (Throwable th) {
                            C1616do.m17866c(th, "Lg", "proL");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "Lg", "proL");
        }
    }

    /* renamed from: a */
    public static boolean m17887a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("uncaughtException")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static List<C1599da> m17882c(Context context) {
        List<C1599da> list = null;
        try {
            synchronized (Looper.getMainLooper()) {
                list = new C1632dy(context, false).m17800a();
            }
            return list;
        } catch (Throwable unused) {
            return list;
        }
    }

    /* renamed from: a */
    public static String m17889a(Context context, String str) {
        return G4Y.LIZ(context, "AMSKLG_CFG", 0).getString(str, "");
    }

    /* renamed from: c */
    public static String m17881c(Context context, String str) {
        new StringBuilder();
        return C0002O.m25085C(C116971W2r.LIZJ(context).getAbsolutePath(), f23349a, str);
    }

    /* renamed from: b */
    public static void m17884b(Context context, String str) {
        SharedPreferences.Editor edit = G4Y.LIZ(context, "AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    /* renamed from: a */
    public static boolean m17886a(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                for (String str2 : str.split("\n")) {
                    String trim = str2.trim();
                    if (m17887a(trim)) {
                        return false;
                    }
                    if (m17883b(strArr, trim)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m17883b(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                for (String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ")) {
                        new StringBuilder();
                        if (str.contains(C0002O.m25086C(str2, ".")) && str.endsWith(")") && !str.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m17888a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = G4Y.LIZ(context, "AMSKLG_CFG", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
