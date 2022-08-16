package com.alibaba.p052a.p061b.p065d;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.alibaba.a.b.d.p */
/* loaded from: classes25.dex */
public class C0986p {
    static {
        Covode.recordClassIndex(4296);
    }

    /* renamed from: a */
    public static String m20069a(Context context, String str) {
        SharedPreferences LIZ;
        if (context == null || (LIZ = G4Y.LIZ(context, "ut_setting", 4)) == null) {
            return null;
        }
        return LIZ.getString(str, null);
    }

    /* renamed from: a */
    public static void m20068a(Context context, String str, String str2) {
        SharedPreferences LIZ;
        SharedPreferences.Editor edit;
        if (context == null || (LIZ = G4Y.LIZ(context, "ut_setting", 4)) == null || (edit = LIZ.edit()) == null) {
            return;
        }
        edit.putString(str, str2);
        edit.apply();
    }
}
