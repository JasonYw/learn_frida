package com.alipay.sdk.p082m.p086b0;

import android.content.Context;
import com.alipay.sdk.p082m.p124y.C1447c;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.alipay.sdk.m.b0.a */
/* loaded from: classes2.dex */
public class C1228a {
    static {
        Covode.recordClassIndex(4728);
    }

    /* renamed from: a */
    public static String m19354a(Context context, String str, String str2) {
        String m19348a;
        synchronized (C1228a.class) {
            String str3 = null;
            if (context != null) {
                if (!C1448a.m18665a(str) && !C1448a.m18665a(str2)) {
                    try {
                        m19348a = C1232e.m19348a(context, str, str2, "");
                    } catch (Throwable unused) {
                    }
                    if (C1448a.m18665a(m19348a)) {
                        return null;
                    }
                    str3 = C1447c.m18666b(C1447c.m18671a(), m19348a);
                    return str3;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m19353a(Context context, String str, String str2, String str3) {
        synchronized (C1228a.class) {
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
    }
}
