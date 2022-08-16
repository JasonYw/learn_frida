package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.alibaba.sdk.android.httpdns.b */
/* loaded from: classes19.dex */
public class C1033b {

    /* renamed from: a */
    public static SharedPreferences f21529a;

    /* renamed from: a */
    public static boolean f21530a = true;

    /* renamed from: b */
    public static boolean f21531b = true;

    static {
        Covode.recordClassIndex(4439);
    }

    /* renamed from: a */
    public static void m19981a(Context context) {
        if (context != null) {
            SharedPreferences LIZ = G4Y.LIZ(context, "httpdns_config_enable", 0);
            f21529a = LIZ;
            if (LIZ == null) {
                return;
            }
            f21530a = f21529a.getBoolean("key_enable", true);
        }
    }

    /* renamed from: a */
    public static void m19980a(boolean z) {
        f21530a = z;
        SharedPreferences sharedPreferences = f21529a;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("key_enable", z);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static boolean m19982a() {
        return f21530a && f21531b;
    }

    /* renamed from: b */
    public static void m19979b(boolean z) {
        f21531b = z;
    }
}
