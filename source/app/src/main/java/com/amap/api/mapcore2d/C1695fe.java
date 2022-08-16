package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.amap.api.mapcore2d.fe */
/* loaded from: classes19.dex */
public class C1695fe {

    /* renamed from: b */
    public static boolean f23598b;

    /* renamed from: d */
    public static WeakReference<C1690fa> f23600d;

    /* renamed from: a */
    public static int f23597a = 1000;

    /* renamed from: c */
    public static int f23599c = 20;

    /* renamed from: e */
    public static int f23601e = 10;

    static {
        Covode.recordClassIndex(5243);
    }

    /* renamed from: a */
    public static void m17537a(final Context context) {
        C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.fe.2
            static {
                Covode.recordClassIndex(5245);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1690fa m17520a = C1702fh.m17520a(C1695fe.f23600d);
                    C1702fh.m17523a(context, m17520a, C1613dm.f23357i, C1695fe.f23597a, 2097152, "6");
                    m17520a.f23590h = 14400000;
                    if (m17520a.f23589g == null) {
                        m17520a.f23589g = new C1706fl(new C1705fk(context, new C1710fp(), new C1605de(new C1607dg(new C1609di())), new String(C1610dj.m17911a(10)), C1573cq.m18118f(context), C1587cu.m18031v(context), C1587cu.m18040m(context), C1587cu.m18045h(context), C1587cu.m18073a(), Build.MANUFACTURER, Build.DEVICE, C1587cu.m18029x(context), C1573cq.m18121c(context), Build.MODEL, C1573cq.m18120d(context), C1573cq.m18123b(context)));
                    }
                    if (TextUtils.isEmpty(m17520a.f23591i)) {
                        m17520a.f23591i = "fKey";
                    }
                    m17520a.f23588f = new C1714ft(context, m17520a.f23590h, m17520a.f23591i, new C1712fr(context, C1695fe.f23598b, C1695fe.f23601e * AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END, C1695fe.f23599c * AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END));
                    C1691fb.m17546a(m17520a);
                } catch (Throwable th) {
                    C1616do.m17866c(th, "ofm", "uold");
                }
            }
        });
    }

    /* renamed from: a */
    public static synchronized void m17536a(final C1694fd c1694fd, final Context context) {
        synchronized (C1695fe.class) {
            C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.fe.1
                static {
                    Covode.recordClassIndex(5244);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        synchronized (C1695fe.class) {
                            String l = Long.toString(System.currentTimeMillis());
                            C1690fa m17520a = C1702fh.m17520a(C1695fe.f23600d);
                            C1702fh.m17523a(context, m17520a, C1613dm.f23357i, C1695fe.f23597a, 2097152, "6");
                            if (m17520a.f23587e == null) {
                                m17520a.f23587e = new C1605de(new C1607dg(new C1609di(new C1607dg())));
                            }
                            C1691fb.m17544a(l, c1694fd.m17540a(), m17520a);
                        }
                    } catch (Throwable th) {
                        C1616do.m17866c(th, "ofm", "aple");
                    }
                }
            });
        }
    }
}
