package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.amap.api.mapcore2d.bg */
/* loaded from: classes19.dex */
public class C1528bg {

    /* renamed from: a */
    public static C1528bg f23007a;

    /* renamed from: b */
    public static SharedPreferences f23008b;

    static {
        Covode.recordClassIndex(5076);
    }

    /* renamed from: a */
    public static C1528bg m18296a() {
        if (f23007a == null) {
            f23007a = new C1528bg();
        }
        return f23007a;
    }

    /* renamed from: a */
    public static String m18294a(String str) {
        return f23008b.getString(str, null);
    }

    /* renamed from: a */
    public static void m18295a(Context context) {
        f23007a = new C1528bg();
        f23008b = G4Y.LIZ(context, "amap_preferences", 0);
    }

    /* renamed from: b */
    public static void m18288b(String str, boolean z) {
        SharedPreferences sharedPreferences = f23008b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z).commit();
        }
    }

    /* renamed from: a */
    public static String m18292a(String str, String str2) {
        return f23008b.getString(str, str2);
    }

    /* renamed from: b */
    public void m18290b(String str, int i) {
        SharedPreferences.Editor edit = f23008b.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: b */
    public void m18289b(String str, String str2) {
        SharedPreferences.Editor edit = f23008b.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: a */
    public static boolean m18291a(String str, boolean z) {
        return f23008b.getBoolean(str, z);
    }

    /* renamed from: a */
    public int m18293a(String str, int i) {
        return f23008b.getInt(str, i);
    }
}
