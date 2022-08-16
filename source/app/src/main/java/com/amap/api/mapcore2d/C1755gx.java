package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.amap.api.mapcore2d.gx */
/* loaded from: classes17.dex */
public final class C1755gx {
    static {
        Covode.recordClassIndex(5303);
    }

    /* renamed from: a */
    public static int m17286a(Context context, String str, String str2) {
        int i = 200;
        try {
            i = G4Y.LIZ(context, str, 0).getInt(str2, 200);
            return i;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "SpUtil", "getPrefsInt");
            return i;
        }
    }

    /* renamed from: a */
    public static String m17288a(Context context) {
        return context == null ? "00:00:00:00:00:00" : m17282b(context, "pref", "smac", "00:00:00:00:00:00");
    }

    /* renamed from: a */
    public static void m17287a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            m17285a(context, "pref", "smac", str);
        }
    }

    /* renamed from: a */
    public static void m17285a(Context context, String str, String str2, String str3) {
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, str, 0).edit();
            edit.putString(str2, str3);
            m17284a(edit);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "SpUtil", "setPrefsStr");
        }
    }

    /* renamed from: a */
    public static void m17284a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        editor.apply();
    }

    /* renamed from: b */
    public static String m17282b(Context context, String str, String str2, String str3) {
        try {
            str3 = G4Y.LIZ(context, str, 0).getString(str2, str3);
            return str3;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "SpUtil", "getPrefsInt");
            return str3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.amap.api.mapcore2d.gx$1] */
    /* renamed from: b */
    public static void m17281b(final SharedPreferences.Editor editor) {
        try {
            new AsyncTask<Void, Void, Void>() { // from class: com.amap.api.mapcore2d.gx.1
                static {
                    Covode.recordClassIndex(5304);
                }

                /* renamed from: a */
                private Void m17280a() {
                    try {
                        if (editor == null) {
                            return null;
                        }
                        editor.commit();
                        return null;
                    } catch (Throwable th) {
                        C1752gu.m17302a(th, "SpUtil", "commit");
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public final /* synthetic */ Void doInBackground(Void[] voidArr) {
                    return m17280a();
                }
            }.execute(null, null, null);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "SpUtil", "commit1");
        }
    }

    /* renamed from: b */
    public static boolean m17283b(Context context, String str, String str2) {
        boolean z = true;
        try {
            z = G4Y.LIZ(context, str, 0).getBoolean(str2, true);
            return z;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "SpUtil", "getPrefsBoolean");
            return z;
        }
    }
}
