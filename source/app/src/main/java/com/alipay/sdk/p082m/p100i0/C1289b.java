package com.alipay.sdk.p082m.p100i0;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.i0.b */
/* loaded from: classes18.dex */
public class C1289b {

    /* renamed from: b */
    public static Method f22148b;

    static {
        Covode.recordClassIndex(4789);
    }

    /* renamed from: a */
    public static String m19266a(Context context) {
        C1293f m19255a = C1293f.m19255a();
        return m19255a.m19253a(context.getApplicationContext(), m19255a.f22158c);
    }

    /* renamed from: a */
    public static void m19265a(boolean z) {
        C1293f.m19255a();
        C1293f.m19248a(z);
    }

    /* renamed from: a */
    public static final boolean m19267a() {
        Context context = null;
        try {
            if (f22148b == null) {
                Method method = C116971W2r.LIZ("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f22148b = method;
                method.setAccessible(true);
            }
            context = (Context) f22148b.invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        if (context == null) {
            return false;
        }
        return C1293f.m19255a().m19252a(context, false);
    }

    /* renamed from: b */
    public static String m19264b(Context context) {
        C1293f m19255a = C1293f.m19255a();
        return m19255a.m19253a(context.getApplicationContext(), m19255a.f22157b);
    }

    /* renamed from: c */
    public static String m19263c(Context context) {
        C1293f m19255a = C1293f.m19255a();
        return m19255a.m19253a(context.getApplicationContext(), m19255a.f22156a);
    }

    /* renamed from: d */
    public static String m19262d(Context context) {
        C1293f m19255a = C1293f.m19255a();
        return m19255a.m19253a(context.getApplicationContext(), m19255a.f22159d);
    }
}
