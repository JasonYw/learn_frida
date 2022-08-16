package com.alipay.apmobilesecuritysdk.p081f;

import android.content.Context;
import com.alipay.sdk.p082m.p086b0.C1229b;
import com.alipay.sdk.p082m.p086b0.C1230c;
import com.alipay.sdk.p082m.p086b0.C1232e;
import com.alipay.sdk.p082m.p124y.C1447c;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.apmobilesecuritysdk.f.a */
/* loaded from: classes2.dex */
public class C1199a {
    static {
        Covode.recordClassIndex(4671);
    }

    /* renamed from: a */
    public static String m19497a(Context context, String str, String str2) {
        if (context == null || C1448a.m18665a(str) || C1448a.m18665a(str2)) {
            return null;
        }
        try {
            String m19348a = C1232e.m19348a(context, str, str2, "");
            if (!C1448a.m18665a(m19348a)) {
                return C1447c.m18666b(C1447c.m18671a(), m19348a);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m19495a(String str, String str2) {
        synchronized (C1199a.class) {
            if (C1448a.m18665a(str) || C1448a.m18665a(str2)) {
                return null;
            }
            String m19352a = C1229b.m19352a(str);
            if (C1448a.m18665a(m19352a)) {
                return null;
            }
            String string = new JSONObject(m19352a).getString(str2);
            if (C1448a.m18665a(string)) {
                return null;
            }
            return C1447c.m18666b(C1447c.m18671a(), string);
        }
    }

    /* renamed from: a */
    public static void m19496a(Context context, String str, String str2, String str3) {
        if (C1448a.m18665a(str) || C1448a.m18665a(str2) || context == null) {
            return;
        }
        try {
            String m18669a = C1447c.m18669a(C1447c.m18671a(), str3);
            HashMap hashMap = new HashMap();
            hashMap.put(str2, m18669a);
            C1232e.m19347a(context, str, hashMap);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19494a(String str, String str2, String str3) {
        synchronized (C1199a.class) {
            if (C1448a.m18665a(str) || C1448a.m18665a(str2)) {
                return;
            }
            try {
                String m19352a = C1229b.m19352a(str);
                JSONObject jSONObject = new JSONObject();
                if (C1448a.m18661b(m19352a)) {
                    try {
                        jSONObject = new JSONObject(m19352a);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, C1447c.m18669a(C1447c.m18671a(), str3));
                try {
                    System.clearProperty(str);
                } catch (Throwable unused2) {
                }
                if (C1230c.m19351a()) {
                    String m25085C = C0002O.m25085C(".SystemConfig", File.separator, str);
                    if (C1230c.m19351a()) {
                        File file = new File(C116971W2r.LIZIZ(), m25085C);
                        if (file.exists() && file.isFile()) {
                            C116971W2r.LIZ(file);
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
