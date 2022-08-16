package com.amap.api.services.p126a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.amap.api.services.a.cx */
/* loaded from: classes19.dex */
public class C1942cx {

    /* renamed from: a */
    public String f24674a;

    static {
        Covode.recordClassIndex(5553);
    }

    /* renamed from: a */
    private void m16563a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        editor.apply();
    }

    public C1942cx(String str) {
        this.f24674a = C1887bm.m16832b(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    /* renamed from: b */
    public boolean m16562b(Context context, String str, boolean z) {
        if (context == null) {
            return z;
        }
        try {
            return G4Y.LIZ(context, this.f24674a, 0).getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public void m16564a(Context context, String str, boolean z) {
        try {
            SharedPreferences.Editor edit = G4Y.LIZ(context, this.f24674a, 0).edit();
            edit.putBoolean(str, z);
            m16563a(edit);
        } catch (Throwable unused) {
        }
    }
}
