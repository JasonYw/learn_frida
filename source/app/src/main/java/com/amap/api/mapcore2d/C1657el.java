package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.amap.api.mapcore2d.el */
/* loaded from: classes19.dex */
public class C1657el {

    /* renamed from: a */
    public String f23489a;

    static {
        Covode.recordClassIndex(5205);
    }

    /* renamed from: a */
    private void m17676a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        editor.apply();
    }

    public C1657el(String str) {
        this.f23489a = C1594cx.m17990b(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    /* renamed from: b */
    public boolean m17675b(Context context, String str, boolean z) {
        if (context == null) {
            return z;
        }
        try {
            return G4Y.LIZ(context, this.f23489a, 0).getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public void m17677a(Context context, String str, boolean z) {
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, this.f23489a, 0).edit();
            edit.putBoolean(str, z);
            m17676a(edit);
        } catch (Throwable unused) {
        }
    }
}
