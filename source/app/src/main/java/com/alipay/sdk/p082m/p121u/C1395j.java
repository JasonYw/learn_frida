package com.alipay.sdk.p082m.p121u;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p109n.C1337e;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.u.j */
/* loaded from: classes2.dex */
public class C1395j {

    /* renamed from: a */
    public static String f22428a;

    static {
        Covode.recordClassIndex(4895);
    }

    /* renamed from: a */
    public static String m18833a(Context context) {
        String str;
        if (TextUtils.isEmpty(f22428a)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C1385e.m18866a(th);
                str = "";
            }
            new StringBuilder();
            f22428a = C0002O.m25086C(str, "0000000000000000000000000000").substring(0, 24);
        }
        return f22428a;
    }

    /* renamed from: a */
    public static synchronized boolean m18832a(Context context, String str) {
        boolean z;
        synchronized (C1395j.class) {
            z = false;
            try {
                z = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m18830b(Context context, String str) {
        synchronized (C1395j.class) {
            try {
                PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }
    }

    /* renamed from: a */
    public static synchronized String m18831a(C1376a c1376a, Context context, String str, String str2) {
        String str3;
        synchronized (C1395j.class) {
            str3 = null;
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                if (!TextUtils.isEmpty(string)) {
                    str3 = C1337e.m19073a(m18833a(context), string, str);
                }
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                    C1301a.m19211b(c1376a, "cp", "TriDesEncryptError", String.format("%s,%s", str, string));
                }
            } catch (Exception e) {
                C1385e.m18866a(e);
            }
        }
        return str3;
    }

    /* renamed from: b */
    public static synchronized void m18829b(C1376a c1376a, Context context, String str, String str2) {
        synchronized (C1395j.class) {
            try {
                String m19071b = C1337e.m19071b(m18833a(context), str2, str);
                if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(m19071b)) {
                    C1301a.m19211b(c1376a, "cp", "TriDesDecryptError", String.format("%s,%s", str, str2));
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, m19071b).apply();
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }
    }
}
