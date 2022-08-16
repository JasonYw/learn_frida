package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.dp */
/* loaded from: classes19.dex */
public class C1620dp {

    /* renamed from: a */
    public static WeakReference<C1690fa> f23373a;

    /* renamed from: c */
    public static WeakReference<AbstractC1715fu> f23375c;

    /* renamed from: d */
    public static WeakReference<AbstractC1715fu> f23376d;

    /* renamed from: f */
    public static int f23378f;

    /* renamed from: g */
    public static boolean f23379g;

    /* renamed from: h */
    public static int f23380h;

    /* renamed from: i */
    public static C1599da f23381i;

    /* renamed from: b */
    public static boolean f23374b = true;

    /* renamed from: e */
    public static String[] f23377e = new String[10];

    /* renamed from: a */
    public static boolean m17854a(C1599da c1599da) {
        return c1599da != null && c1599da.m17963f();
    }

    /* renamed from: a */
    public static void m17852a(String str) {
        try {
            if (f23378f > 9) {
                f23378f = 0;
            }
            f23377e[f23378f] = str;
            f23378f++;
        } catch (Throwable th) {
            C1616do.m17866c(th, "alg", "aDa");
        }
    }

    static {
        Covode.recordClassIndex(5168);
    }

    /* renamed from: b */
    public static String m17849b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = f23378f; i < 10 && i <= 9; i++) {
                sb.append(f23377e[i]);
            }
            for (int i2 = 0; i2 < f23378f; i2++) {
                sb.append(f23377e[i2]);
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "alg", "gLI");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m17851a(Throwable th) {
        return th.toString();
    }

    /* renamed from: b */
    public static void m17848b(Context context) {
        C1713fs c1713fs = new C1713fs(f23374b);
        f23374b = false;
        m17858a(context, c1713fs, C1613dm.f23351c);
    }

    /* renamed from: a */
    public static void m17860a(Context context) {
        String m17850a;
        C1599da c1599da;
        List<C1599da> m17882c = C1613dm.m17882c(context);
        if (m17882c != null && m17882c.size() != 0 && (m17850a = m17850a(m17882c)) != null && !"".equals(m17850a) && (c1599da = f23381i) != null) {
            m17859a(context, c1599da, 2, "ANR", m17850a);
        }
    }

    /* renamed from: c */
    public static void m17846c(Context context) {
        WeakReference<AbstractC1715fu> weakReference = f23375c;
        if (weakReference == null || weakReference.get() == null) {
            f23375c = new WeakReference<>(new C1714ft(context, 3600000, "hKey", new C1716fv(context, false)));
        }
        m17858a(context, f23375c.get(), C1613dm.f23352d);
    }

    /* renamed from: d */
    public static void m17845d(Context context) {
        WeakReference<AbstractC1715fu> weakReference = f23376d;
        if (weakReference == null || weakReference.get() == null) {
            f23376d = new WeakReference<>(new C1714ft(context, 3600000, "gKey", new C1716fv(context, false)));
        }
        m17858a(context, f23376d.get(), C1613dm.f23350b);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00de -> B:28:0x00e1). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m17850a(java.util.List<com.amap.api.mapcore2d.C1599da> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1620dp.m17850a(java.util.List):java.lang.String");
    }

    /* renamed from: a */
    public static C1599da m17857a(Context context, String str) {
        List<C1599da> m17882c = C1613dm.m17882c(context);
        if (m17882c == null) {
            m17882c = new ArrayList();
        }
        if (str != null && !"".equals(str)) {
            for (C1599da c1599da : m17882c) {
                if (C1613dm.m17886a(c1599da.m17962g(), str)) {
                    return c1599da;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return C1602db.m17950a();
                } catch (C1572cp e) {
                    e.printStackTrace();
                }
            }
            if (str.contains("com.amap.co") || str.contains("com.amap.opensdk.co") || str.contains("com.amap.location")) {
                try {
                    C1599da m17935b = C1602db.m17935b();
                    m17935b.m17970a(true);
                    return m17935b;
                } catch (C1572cp e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m17858a(final Context context, final AbstractC1715fu abstractC1715fu, final String str) {
        C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.dp.1
            static {
                Covode.recordClassIndex(5169);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    synchronized (C1620dp.class) {
                        C1690fa m17520a = C1702fh.m17520a(C1620dp.f23373a);
                        C1702fh.m17523a(context, m17520a, str, 1000, 40960, "1");
                        m17520a.f23588f = abstractC1715fu;
                        if (m17520a.f23589g == null) {
                            m17520a.f23589g = new C1706fl(new C1705fk(context, new C1710fp(), new C1605de(new C1607dg(new C1609di())), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", C1573cq.m18118f(context), C1587cu.m18031v(context), C1573cq.m18121c(context), Build.MODEL, C1573cq.m18123b(context), C1573cq.m18120d(context), Build.VERSION.RELEASE));
                        }
                        m17520a.f23590h = 3600000;
                        C1691fb.m17546a(m17520a);
                    }
                } catch (Throwable th) {
                    C1616do.m17866c(th, "lg", "pul");
                }
            }
        });
    }

    /* renamed from: a */
    public static void m17853a(C1599da c1599da, Context context, String str, String str2) {
        if (m17854a(c1599da) && str != null && !"".equals(str)) {
            m17859a(context, c1599da, 0, str, str2);
        }
    }

    /* renamed from: b */
    public static void m17847b(C1599da c1599da, Context context, String str, String str2) {
        if (m17854a(c1599da) && str != null && !"".equals(str)) {
            m17859a(context, c1599da, 1, str, str2);
        }
    }

    /* renamed from: a */
    public static void m17856a(Context context, String str, String str2, String str3) {
        C1690fa m17520a = C1702fh.m17520a(f23373a);
        C1702fh.m17523a(context, m17520a, str2, 1000, 40960, "1");
        if (m17520a.f23587e == null) {
            m17520a.f23587e = new C1604dd(new C1605de(new C1607dg(new C1609di())));
        }
        try {
            C1691fb.m17544a(str, C1602db.m17940a(str3.replaceAll("\n", "<br/>")), m17520a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m17859a(Context context, C1599da c1599da, int i, String str, String str2) {
        String str3;
        String m17525a = C1702fh.m17525a();
        String m17521a = C1702fh.m17521a(C1573cq.m18125a(context), C1702fh.m17524a(context, c1599da), m17525a, i, str, str2);
        if (m17521a != null && !"".equals(m17521a)) {
            String m17988c = C1594cx.m17988c(str2);
            if (i == 1) {
                str3 = C1613dm.f23350b;
            } else if (i == 2) {
                str3 = C1613dm.f23352d;
            } else if (i != 0) {
                return;
            } else {
                str3 = C1613dm.f23351c;
            }
            m17856a(context, m17988c, str3, m17521a);
        }
    }

    /* renamed from: a */
    public static void m17855a(Context context, Throwable th, int i, String str, String str2) {
        String m17939a = C1602db.m17939a(th);
        C1599da m17857a = m17857a(context, m17939a);
        if (!m17854a(m17857a)) {
            return;
        }
        String replaceAll = m17939a.replaceAll("\n", "<br/>");
        String m17851a = m17851a(th);
        if (m17851a != null && !"".equals(m17851a)) {
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
            m17859a(context, m17857a, i, m17851a, sb.toString());
        }
    }
}
