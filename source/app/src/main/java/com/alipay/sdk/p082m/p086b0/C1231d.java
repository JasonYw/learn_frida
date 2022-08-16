package com.alipay.sdk.p082m.p086b0;

import android.content.Context;
import com.alipay.sdk.p082m.p124y.C1447c;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.alipay.sdk.m.b0.d */
/* loaded from: classes2.dex */
public final class C1231d {
    static {
        Covode.recordClassIndex(4731);
    }

    /* renamed from: a */
    public static synchronized void m19349a(Context context, String str, String str2, String str3) {
        synchronized (C1231d.class) {
            if (!C1448a.m18665a(str)) {
                if (!C1448a.m18665a(str2) && context != null) {
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
    }
}
