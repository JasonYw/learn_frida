package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Random;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.dr */
/* loaded from: classes19.dex */
public class C1980dr {

    /* renamed from: a */
    public static WeakReference<C1973dm> f24785a;

    static {
        Covode.recordClassIndex(5591);
    }

    /* renamed from: a */
    public static void m16423a(final Context context) {
        C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.dr.2
            static {
                Covode.recordClassIndex(5593);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1973dm m16414a = C1983ds.m16414a(C1980dr.f24785a);
                    C1983ds.m16417a(context, m16414a, C1902bz.f24562g, 1000, 307200, "2");
                    if (m16414a.f24769g == null) {
                        m16414a.f24769g = new C1984dt(new C1988dx(context, new C1985du(new C1989dy(new C1992ea()))));
                    }
                    m16414a.f24770h = 3600000;
                    if (TextUtils.isEmpty(m16414a.f24771i)) {
                        m16414a.f24771i = "cKey";
                    }
                    if (m16414a.f24768f == null) {
                        m16414a.f24768f = new C1996ee(context, m16414a.f24770h, m16414a.f24771i, new C1993eb(30, m16414a.f24763a, new C1998eg(context, false)));
                    }
                    C1974dn.m16437a(m16414a);
                } catch (Throwable th) {
                    C1906cb.m16716c(th, "stm", "usd");
                }
            }
        });
    }

    /* renamed from: a */
    public static synchronized void m16421a(final C1979dq c1979dq, final Context context) {
        synchronized (C1980dr.class) {
            C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.dr.1
                static {
                    Covode.recordClassIndex(5592);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        synchronized (C1980dr.class) {
                            C1980dr.m16420b(context, c1979dq.m16428a());
                        }
                    } catch (Throwable th) {
                        C1906cb.m16716c(th, "stm", "as");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m16420b(Context context, byte[] bArr) {
        C1973dm m16414a = C1983ds.m16414a(f24785a);
        C1983ds.m16417a(context, m16414a, C1902bz.f24562g, 1000, 307200, "2");
        if (m16414a.f24767e == null) {
            m16414a.f24767e = new C1897bu();
        }
        Random random = new Random();
        new StringBuilder();
        try {
            C1974dn.m16435a(C0002O.m25086C(Integer.toString(random.nextInt(100)), Long.toString(System.nanoTime())), bArr, m16414a);
        } catch (Throwable th) {
            C1906cb.m16716c(th, "stm", "wts");
        }
    }
}
