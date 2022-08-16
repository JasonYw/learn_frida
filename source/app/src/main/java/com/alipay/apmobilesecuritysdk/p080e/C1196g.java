package com.alipay.apmobilesecuritysdk.p080e;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.p082m.p086b0.C1232e;
import com.alipay.sdk.p082m.p124y.C1447c;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.G4Y;

/* renamed from: com.alipay.apmobilesecuritysdk.e.g */
/* loaded from: classes2.dex */
public final class C1196g {
    static {
        Covode.recordClassIndex(4668);
    }

    /* renamed from: a */
    public static synchronized String m19534a(Context context, String str) {
        synchronized (C1196g.class) {
            String m19348a = C1232e.m19348a(context, "openapi_file_pri", C0002O.m25086C("openApi", str), "");
            if (C1448a.m18665a(m19348a)) {
                return "";
            }
            String m18666b = C1447c.m18666b(C1447c.m18671a(), m19348a);
            return C1448a.m18665a(m18666b) ? "" : m18666b;
        }
    }

    /* renamed from: a */
    public static synchronized void m19536a() {
        synchronized (C1196g.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m19535a(Context context) {
        synchronized (C1196g.class) {
            SharedPreferences.Editor edit = G4Y.LIZ(context, "openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m19533a(Context context, String str, String str2) {
        synchronized (C1196g.class) {
            try {
                SharedPreferences.Editor edit = G4Y.LIZ(context, "openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString(C0002O.m25086C("openApi", str), C1447c.m18669a(C1447c.m18671a(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
