package com.amap.api.services.p126a;

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

/* renamed from: com.amap.api.services.a.bz */
/* loaded from: classes19.dex */
public class C1902bz {

    /* renamed from: a */
    public static final String f24556a = "/a/";

    /* renamed from: b */
    public static final String f24557b = "b";

    /* renamed from: c */
    public static final String f24558c = "c";

    /* renamed from: d */
    public static final String f24559d = "d";

    /* renamed from: g */
    public static final String f24562g = "e";

    /* renamed from: h */
    public static final String f24563h = "f";

    /* renamed from: e */
    public static final String f24560e = "g";

    /* renamed from: f */
    public static final String f24561f = "h";

    /* renamed from: i */
    public static final String f24564i = "j";

    static {
        Covode.recordClassIndex(5513);
    }

    /* renamed from: a */
    public static void m16741a(final Context context) {
        try {
            ExecutorService m16717c = C1906cb.m16717c();
            if (m16717c != null && !m16717c.isShutdown()) {
                m16717c.submit(new Runnable() { // from class: com.amap.api.services.a.bz.1
                    static {
                        Covode.recordClassIndex(5514);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C1975do.m16434a(context);
                            C1910cc.m16699b(context);
                            C1910cc.m16697d(context);
                            C1910cc.m16698c(context);
                            C1980dr.m16423a(context);
                            C1977dp.m16430a(context);
                        } catch (RejectedExecutionException unused) {
                        } catch (Throwable th) {
                            C1906cb.m16716c(th, "Lg", "proL");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C1906cb.m16716c(th, "Lg", "proL");
        }
    }

    /* renamed from: b */
    public static List<C1889bo> m16736b(Context context) {
        List<C1889bo> list = null;
        try {
            synchronized (Looper.getMainLooper()) {
                list = new C1919ck(context, false).m16671a();
            }
            return list;
        } catch (Throwable unused) {
            return list;
        }
    }

    /* renamed from: a */
    public static boolean m16738a(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("at ") || !str.contains("uncaughtException")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m16740a(Context context, String str) {
        return G4Y.LIZ(context, "AMSKLG_CFG", 0).getString(str, "");
    }

    /* renamed from: c */
    public static String m16733c(Context context, String str) {
        new StringBuilder();
        return C0002O.m25085C(C116971W2r.LIZJ(context).getAbsolutePath(), f24556a, str);
    }

    /* renamed from: b */
    public static void m16735b(Context context, String str) {
        SharedPreferences.Editor edit = G4Y.LIZ(context, "AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    /* renamed from: b */
    public static boolean m16734b(String[] strArr, String str) {
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
    public static boolean m16737a(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                String[] split = str.split("\n");
                for (String str2 : split) {
                    if (m16738a(str2)) {
                        return false;
                    }
                }
                for (String str3 : split) {
                    if (m16734b(strArr, str3.trim())) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m16739a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = G4Y.LIZ(context, "AMSKLG_CFG", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
