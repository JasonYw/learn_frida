package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.services.p126a.C1923cn;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: com.amap.api.services.a.ct */
/* loaded from: classes19.dex */
public class C1935ct {
    static {
        Covode.recordClassIndex(5546);
    }

    /* renamed from: a */
    public static boolean m16586a(C1914cf c1914cf, C1922cm c1922cm) {
        try {
            List<C1928cq> m16636a = C1923cn.C1925a.m16636a(c1914cf, c1922cm.f24613c, "used");
            if (m16636a != null && m16636a.size() > 0) {
                if (m16582a(m16636a.get(0).m16618e(), c1922cm.f24615e) > 0) {
                    return true;
                }
            }
        } catch (Throwable th) {
            m16581a(th, "dDownLoad", "isUsed");
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m16589a(Context context, C1922cm c1922cm, C1889bo c1889bo) {
        C1914cf c1914cf = new C1914cf(context, C1927cp.m16629c());
        if (m16586a(c1914cf, c1922cm)) {
            return true;
        }
        C1928cq m16637a = C1923cn.C1925a.m16637a(c1914cf, c1922cm.f24612b);
        if (m16637a == null) {
            return false;
        }
        return m16591a(context, c1914cf, m16637a, c1922cm, c1889bo);
    }

    /* renamed from: a */
    public static boolean m16588a(Context context, boolean z) {
        return z || m16594a(context);
    }

    /* renamed from: a */
    public static boolean m16584a(C1922cm c1922cm) {
        return Build.VERSION.SDK_INT >= c1922cm.f24617g && Build.VERSION.SDK_INT <= c1922cm.f24616f;
    }

    /* renamed from: a */
    public static boolean m16587a(C1889bo c1889bo, C1922cm c1922cm) {
        return c1889bo != null && c1889bo.m16818a().equals(c1922cm.f24613c) && c1889bo.m16814b().equals(c1922cm.f24614d);
    }

    /* renamed from: a */
    public static boolean m16585a(C1914cf c1914cf, String str, String str2, C1889bo c1889bo) {
        C1928cq m16637a = C1923cn.C1925a.m16637a(c1914cf, str);
        return m16637a != null && c1889bo.m16814b().equals(m16637a.m16619d()) && m16579b(str2, m16637a.m16624b());
    }

    /* renamed from: a */
    public static PublicKey m16595a() {
        ByteArrayInputStream byteArrayInputStream;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byteArrayInputStream = new ByteArrayInputStream(C1882bk.m16860b("MIIDRzCCAi+gAwIBAgIEeuDbsDANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJjbjELMAkGA1UECBMCYmoxCzAJBgNVBAcTAmJqMQ0wCwYDVQQKEwRvcGVuMQ4wDAYDVQQLEwVnYW9kZTELMAkGA1UEAxMCUWkwIBcNMTYwODAxMDE0ODMwWhgPMjA3MTA1MDUwMTQ4MzBaMFMxCzAJBgNVBAYTAmNuMQswCQYDVQQIEwJiajELMAkGA1UEBxMCYmoxDTALBgNVBAoTBG9wZW4xDjAMBgNVBAsTBWdhb2RlMQswCQYDVQQDEwJRaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKpL13mZm4q6AFP5csQE7130Lwq8m+HICy3rBARd9vbw5Cb1wFF96KdhC5P/aASlrPb+6MSyP1nE97p3ygKJWsgxExyvVuOvh1KUqOFuK15oY7JKTk6L4eLCbkBJZV2DLffpW0HGiRpmFG8LJR0sjNOoubSd5R/6XoBwyRglsyVHprjrK2qDRvT3Edgtfvxp4HnUzMsDD3CJRtgsaDw6ECyF7fhYKEz9I6OEEVsPlpbgzRmhSeFDL77/k1mhPve1ZyKGlPcxvSSdLSAlV0hzr5NKlujHll7BbouwDnr6l/0O44AzZ0V/ieft1iBkSLirnlm56uI/8jdh8ANrD1fW4ZUCAwEAAaMhMB8wHQYDVR0OBBYEFBzudtI5UKRvHGDV+VQRzItIj3PqMA0GCSqGSIb3DQEBCwUAA4IBAQBS2EGndgvIBnf7Ce4IhDbm7F5h4L+6TYGmT9acnQbEFY8oUoFblMDgg+cETT44jU/elwbJJVmKhj/WRQl+AdSALBAgDvxq1AcjlGg+c8H3pa2BWlrxNJP9MFLIEI5bA8m5og/Epjut50uemZ9ggoNmJeW0N/a6D8euhYJKOYngUQqDu6cwLj1Ec0ptwrNRbvRXXgzjfJMPE/ii4K/b8JZ+QN2d/bl7QEvKWBSzVueZifV659qAbMh6C9TCVstWWfV53Z3Vyt+duDNU5ed7aWao42Ppw4VHslrJW0V6BXDUhhzgXx28UWY78W7LmYGCtC8PfDId2+k4tPoTNPM6HHP5"));
            try {
                return ((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getPublicKey();
            } catch (Throwable th) {
                th = th;
                try {
                    m16581a(th, "DyLoader", "init");
                    try {
                        m16583a(byteArrayInputStream);
                    } catch (Throwable unused) {
                    }
                    return null;
                } finally {
                    try {
                        m16583a(byteArrayInputStream);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
        }
    }

    /* renamed from: a */
    public static void m16583a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m16594a(Context context) {
        if (C1878bj.m16873s(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m16580a(List<C1928cq> list) {
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                C1928cq c1928cq = list.get(i);
                C1928cq c1928cq2 = list.get(i3);
                if (m16582a(c1928cq2.m16618e(), c1928cq.m16618e()) > 0) {
                    list.set(i, c1928cq2);
                    list.set(i3, c1928cq);
                }
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static boolean m16579b(String str, String str2) {
        String m16835a = C1887bm.m16835a(str);
        if (m16835a != null && m16835a.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m16582a(String str, String str2) {
        try {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int min = Math.min(split.length, split2.length);
            for (int i = 0; i < min; i++) {
                int length = split[i].length() - split2[i].length();
                if (length == 0) {
                    int compareTo = split[i].compareTo(split2[i]);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                } else {
                    return length;
                }
            }
            return split.length - split2.length;
        } catch (Exception e) {
            C1901by.m16742a(e, "Utils", "compareVersion");
            return -1;
        }
    }

    /* renamed from: a */
    public static void m16581a(Throwable th, String str, String str2) {
        C1901by.m16742a(th, str, str2);
    }

    /* renamed from: a */
    public static boolean m16593a(Context context, C1889bo c1889bo, C1922cm c1922cm) {
        if (c1922cm.m16656e() || !C1892bp.m16790a(context, c1922cm.m16655f())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m16592a(final Context context, C1914cf c1914cf, final C1889bo c1889bo) {
        try {
            if (new File(C1923cn.m16641b(context, c1889bo.m16818a(), c1889bo.m16814b())).exists() || TextUtils.isEmpty(C1923cn.m16652a(context, c1914cf, c1889bo))) {
                return;
            }
            C1932cs.m16597b().m16600a().submit(new Runnable() { // from class: com.amap.api.services.a.ct.2
                static {
                    Covode.recordClassIndex(5548);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1923cn.m16653a(context, c1889bo);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m16590a(Context context, C1914cf c1914cf, String str, C1889bo c1889bo) {
        return m16585a(c1914cf, str, C1923cn.m16647a(context, str), c1889bo);
    }

    /* renamed from: a */
    public static boolean m16591a(final Context context, final C1914cf c1914cf, C1928cq c1928cq, C1922cm c1922cm, final C1889bo c1889bo) {
        String str = c1922cm.f24613c;
        String str2 = c1922cm.f24614d;
        final String str3 = c1922cm.f24615e;
        if ("errorstatus".equals(c1928cq.m16617f())) {
            m16592a(context, c1914cf, c1889bo);
            return true;
        }
        final String m16647a = C1923cn.m16647a(context, c1922cm.f24612b);
        if (!new File(m16647a).exists()) {
            return false;
        }
        List m16677b = c1914cf.m16677b(C1928cq.m16625a(C1923cn.m16646a(context, str, str2), str, str2, str3), C1928cq.class);
        if (m16677b != null && m16677b.size() > 0) {
            return true;
        }
        C1923cn.m16646a(context, str, c1889bo.m16814b());
        try {
            C1932cs.m16597b().m16600a().submit(new Runnable() { // from class: com.amap.api.services.a.ct.1
                static {
                    Covode.recordClassIndex(5547);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1923cn.m16651a(context, c1914cf, c1889bo, m16647a, str3);
                        C1923cn.m16653a(context, c1889bo);
                    } catch (Throwable th) {
                        C1935ct.m16581a(th, "dDownLoad", "processDownloadedFile()");
                    }
                }
            });
        } catch (Throwable unused) {
        }
        return true;
    }
}
