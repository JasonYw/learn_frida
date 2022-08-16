package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.amap.api.services.a.do */
/* loaded from: classes19.dex */
public class C1975do {

    /* renamed from: a */
    public static WeakReference<C1973dm> f24772a;

    static {
        Covode.recordClassIndex(5586);
    }

    /* renamed from: a */
    public static void m16434a(final Context context) {
        C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.do.1
            static {
                Covode.recordClassIndex(5587);
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1975do.class) {
                    C1973dm m16414a = C1983ds.m16414a(C1975do.f24772a);
                    C1983ds.m16417a(context, m16414a, C1902bz.f24564i, 50, 102400, "10");
                    if (m16414a.f24769g == null) {
                        m16414a.f24769g = new C1987dw(new C1986dv(context, new C1992ea(), new C1894br(new C1898bv(new C1896bt())), "WImFwcG5hbWUiOiIlcyIsInBrZyI6IiVzIiwiZGl1IjoiJXMi", C1864bf.m16965b(context), C1864bf.m16963c(context), C1975do.m16432c(context)));
                    }
                    m16414a.f24770h = 14400000;
                    if (TextUtils.isEmpty(m16414a.f24771i)) {
                        m16414a.f24771i = "eKey";
                    }
                    if (m16414a.f24768f == null) {
                        m16414a.f24768f = new C1996ee(context, m16414a.f24770h, m16414a.f24771i, new C1993eb(5, m16414a.f24763a, new C1998eg(context, false)));
                    }
                    C1974dn.m16437a(m16414a);
                }
            }
        });
    }

    /* renamed from: c */
    public static String m16432c(Context context) {
        String m16869w = C1878bj.m16869w(context);
        if (!TextUtils.isEmpty(m16869w)) {
            return m16869w;
        }
        String m16883i = C1878bj.m16883i(context);
        if (!TextUtils.isEmpty(m16883i)) {
            return m16883i;
        }
        String m16878n = C1878bj.m16878n(context);
        if (!TextUtils.isEmpty(m16878n)) {
            return m16878n;
        }
        return C1878bj.m16906b(context);
    }
}
