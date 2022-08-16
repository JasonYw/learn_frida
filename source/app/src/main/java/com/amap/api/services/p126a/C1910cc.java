package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amap.api.services.a.cc */
/* loaded from: classes19.dex */
public class C1910cc {

    /* renamed from: a */
    public static WeakReference<C1973dm> f24579a;

    /* renamed from: c */
    public static WeakReference<AbstractC1997ef> f24581c;

    /* renamed from: d */
    public static WeakReference<AbstractC1997ef> f24582d;

    /* renamed from: f */
    public static int f24584f;

    /* renamed from: g */
    public static boolean f24585g;

    /* renamed from: h */
    public static int f24586h;

    /* renamed from: i */
    public static C1889bo f24587i;

    /* renamed from: b */
    public static boolean f24580b = true;

    /* renamed from: e */
    public static String[] f24583e = new String[10];

    /* renamed from: a */
    public static boolean m16705a(C1889bo c1889bo) {
        return c1889bo != null && c1889bo.m16810e();
    }

    /* renamed from: a */
    public static void m16703a(String str) {
        try {
            if (f24584f > 9) {
                f24584f = 0;
            }
            f24583e[f24584f] = str;
            f24584f++;
        } catch (Throwable th) {
            C1906cb.m16716c(th, "alg", "aDa");
        }
    }

    static {
        Covode.recordClassIndex(5521);
    }

    /* renamed from: b */
    public static String m16700b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = f24584f; i < 10 && i <= 9; i++) {
                sb.append(f24583e[i]);
            }
            for (int i2 = 0; i2 < f24584f; i2++) {
                sb.append(f24583e[i2]);
            }
        } catch (Throwable th) {
            C1906cb.m16716c(th, "alg", "gLI");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m16702a(Throwable th) {
        return th.toString();
    }

    /* renamed from: b */
    public static void m16699b(Context context) {
        C1995ed c1995ed = new C1995ed(f24580b);
        f24580b = false;
        m16709a(context, c1995ed, C1902bz.f24558c);
    }

    /* renamed from: a */
    public static void m16711a(Context context) {
        String m16701a;
        C1889bo c1889bo;
        List<C1889bo> m16736b = C1902bz.m16736b(context);
        if (m16736b != null && m16736b.size() != 0 && (m16701a = m16701a(m16736b)) != null && !"".equals(m16701a) && (c1889bo = f24587i) != null) {
            m16710a(context, c1889bo, 2, "ANR", m16701a);
        }
    }

    /* renamed from: c */
    public static void m16698c(Context context) {
        WeakReference<AbstractC1997ef> weakReference = f24581c;
        if (weakReference == null || weakReference.get() == null) {
            f24581c = new WeakReference<>(new C1996ee(context, 3600000, "hKey", new C1998eg(context, false)));
        }
        m16709a(context, f24581c.get(), C1902bz.f24559d);
    }

    /* renamed from: d */
    public static void m16697d(Context context) {
        WeakReference<AbstractC1997ef> weakReference = f24582d;
        if (weakReference == null || weakReference.get() == null) {
            f24582d = new WeakReference<>(new C1996ee(context, 3600000, "gKey", new C1998eg(context, false)));
        }
        m16709a(context, f24582d.get(), C1902bz.f24557b);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00de -> B:28:0x00e1). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m16701a(java.util.List<com.amap.api.services.p126a.C1889bo> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1910cc.m16701a(java.util.List):java.lang.String");
    }

    /* renamed from: a */
    public static C1889bo m16708a(Context context, String str) {
        List<C1889bo> m16736b = C1902bz.m16736b(context);
        if (m16736b == null) {
            m16736b = new ArrayList();
        }
        if (str != null && !"".equals(str)) {
            for (C1889bo c1889bo : m16736b) {
                if (C1902bz.m16737a(c1889bo.m16809f(), str)) {
                    return c1889bo;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return C1892bp.m16796a();
                } catch (C1863be e) {
                    e.printStackTrace();
                }
            }
            if (str.contains("com.amap.co") || str.contains("com.amap.opensdk.co") || str.contains("com.amap.location")) {
                try {
                    C1889bo m16781b = C1892bp.m16781b();
                    m16781b.m16816a(true);
                    return m16781b;
                } catch (C1863be e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m16709a(final Context context, final AbstractC1997ef abstractC1997ef, final String str) {
        C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.cc.1
            static {
                Covode.recordClassIndex(5522);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    synchronized (C1910cc.class) {
                        C1973dm m16414a = C1983ds.m16414a(C1910cc.f24579a);
                        C1983ds.m16417a(context, m16414a, str, 1000, 40960, "1");
                        m16414a.f24768f = abstractC1997ef;
                        if (m16414a.f24769g == null) {
                            m16414a.f24769g = new C1987dw(new C1986dv(context, new C1992ea(), new C1894br(new C1896bt(new C1898bv())), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", C1864bf.m16960f(context), C1878bj.m16869w(context), C1864bf.m16963c(context), Build.MODEL, C1864bf.m16965b(context), C1864bf.m16962d(context), Build.VERSION.RELEASE));
                        }
                        m16414a.f24770h = 3600000;
                        C1974dn.m16437a(m16414a);
                    }
                } catch (Throwable th) {
                    C1906cb.m16716c(th, "lg", "pul");
                }
            }
        });
    }

    /* renamed from: a */
    public static void m16704a(C1889bo c1889bo, Context context, String str, String str2) {
        if (m16705a(c1889bo) && str != null && !"".equals(str)) {
            m16710a(context, c1889bo, 1, str, str2);
        }
    }

    /* renamed from: a */
    public static void m16707a(Context context, String str, String str2, String str3) {
        C1973dm m16414a = C1983ds.m16414a(f24579a);
        C1983ds.m16417a(context, m16414a, str2, 1000, 40960, "1");
        if (m16414a.f24767e == null) {
            m16414a.f24767e = new C1893bq(new C1894br(new C1896bt(new C1898bv())));
        }
        try {
            C1974dn.m16435a(str, C1892bp.m16786a(str3.replaceAll("\n", "<br/>")), m16414a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16710a(Context context, C1889bo c1889bo, int i, String str, String str2) {
        String str3;
        String m16419a = C1983ds.m16419a();
        String m16415a = C1983ds.m16415a(C1864bf.m16967a(context), C1983ds.m16418a(context, c1889bo), m16419a, i, str, str2);
        if (m16415a != null && !"".equals(m16415a)) {
            String m16830c = C1887bm.m16830c(str2);
            if (i == 1) {
                str3 = C1902bz.f24557b;
            } else if (i == 2) {
                str3 = C1902bz.f24559d;
            } else if (i != 0) {
                return;
            } else {
                str3 = C1902bz.f24558c;
            }
            m16707a(context, m16830c, str3, m16415a);
        }
    }

    /* renamed from: a */
    public static void m16706a(Context context, Throwable th, int i, String str, String str2) {
        String m16785a = C1892bp.m16785a(th);
        C1889bo m16708a = m16708a(context, m16785a);
        if (!m16705a(m16708a)) {
            return;
        }
        String replaceAll = m16785a.replaceAll("\n", "<br/>");
        String m16702a = m16702a(th);
        if (m16702a != null && !"".equals(m16702a)) {
            StringBuilder sb = new StringBuilder();
            if (str != null) {
                sb.append("class:");
                sb.append(str);
            }
            if (str2 != null) {
                sb.append(" method:");
                sb.append(str2);
                sb.append("$<br/>");
            }
            sb.append(replaceAll);
            m16710a(context, m16708a, i, m16702a, sb.toString());
        }
    }
}
