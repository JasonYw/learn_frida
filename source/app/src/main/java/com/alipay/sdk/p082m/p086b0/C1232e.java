package com.alipay.sdk.p082m.p086b0;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p003X.G4Y;

/* renamed from: com.alipay.sdk.m.b0.e */
/* loaded from: classes23.dex */
public final class C1232e {
    static {
        Covode.recordClassIndex(4732);
    }

    /* renamed from: a */
    public static String m19348a(Context context, String str, String str2, String str3) {
        return G4Y.LIZ(context, str, 0).getString(str2, str3);
    }

    /* renamed from: a */
    public static void m19347a(Context context, String str, Map<String, String> map) {
        SharedPreferences.Editor edit = G4Y.LIZ(context, str, 0).edit();
        if (edit != null) {
            for (String str2 : map.keySet()) {
                edit.putString(str2, map.get(str2));
            }
            edit.commit();
        }
    }
}
