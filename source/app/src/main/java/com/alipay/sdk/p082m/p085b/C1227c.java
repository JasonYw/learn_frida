package com.alipay.sdk.p082m.p085b;

import android.content.Context;
import android.os.Looper;
import com.alipay.sdk.p082m.p087c.C1234a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.b.c */
/* loaded from: classes2.dex */
public class C1227c {

    /* renamed from: a */
    public static AbstractC1226b f22074a;

    /* renamed from: b */
    public static boolean f22075b;

    static {
        Covode.recordClassIndex(4727);
    }

    /* renamed from: a */
    public static synchronized String m19356a(Context context) {
        synchronized (C1227c.class) {
            if (context != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    m19355b(context);
                    AbstractC1226b abstractC1226b = f22074a;
                    if (abstractC1226b != null) {
                        try {
                            return abstractC1226b.mo19338a(context);
                        } catch (Exception unused) {
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            throw new RuntimeException("Context is null");
        }
    }

    /* renamed from: b */
    public static void m19355b(Context context) {
        if (f22074a == null && !f22075b) {
            synchronized (C1227c.class) {
                if (f22074a == null && !f22075b) {
                    f22074a = C1234a.m19344a(context);
                    f22075b = true;
                }
            }
        }
    }
}
