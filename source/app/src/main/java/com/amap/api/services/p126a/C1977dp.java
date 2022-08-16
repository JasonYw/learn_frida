package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.amap.api.services.a.dp */
/* loaded from: classes19.dex */
public class C1977dp {

    /* renamed from: b */
    public static boolean f24775b;

    /* renamed from: d */
    public static WeakReference<C1973dm> f24777d;

    /* renamed from: a */
    public static int f24774a = 1000;

    /* renamed from: c */
    public static int f24776c = 20;

    /* renamed from: e */
    public static int f24778e = 10;

    static {
        Covode.recordClassIndex(5588);
    }

    /* renamed from: a */
    public static void m16430a(final Context context) {
        C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.dp.1
            static {
                Covode.recordClassIndex(5589);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1973dm m16414a = C1983ds.m16414a(C1977dp.f24777d);
                    C1983ds.m16417a(context, m16414a, C1902bz.f24563h, C1977dp.f24774a, 2097152, "6");
                    m16414a.f24770h = 14400000;
                    if (m16414a.f24769g == null) {
                        m16414a.f24769g = new C1987dw(new C1986dv(context, new C1992ea(), new C1894br(new C1896bt(new C1898bv())), new String(C1899bw.m16762a(10)), C1864bf.m16960f(context), C1878bj.m16869w(context), C1878bj.m16878n(context), C1878bj.m16883i(context), C1878bj.m16914a(), Build.MANUFACTURER, Build.DEVICE, C1878bj.m16867y(context), C1864bf.m16963c(context), Build.MODEL, C1864bf.m16962d(context), C1864bf.m16965b(context)));
                    }
                    if (TextUtils.isEmpty(m16414a.f24771i)) {
                        m16414a.f24771i = "fKey";
                    }
                    m16414a.f24768f = new C1996ee(context, m16414a.f24770h, m16414a.f24771i, new C1994ec(context, C1977dp.f24775b, C1977dp.f24778e * AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END, C1977dp.f24776c * AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END));
                    C1974dn.m16437a(m16414a);
                } catch (Throwable th) {
                    C1906cb.m16716c(th, "ofm", "uold");
                }
            }
        });
    }
}
