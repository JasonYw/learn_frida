package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.mapcore2d.C1638eb;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.eh */
/* loaded from: classes19.dex */
public class C1650eh {
    static {
        Covode.recordClassIndex(5198);
    }

    /* renamed from: a */
    public static boolean m17699a(C1627dt c1627dt, C1637ea c1637ea) {
        try {
            List<C1643ee> m17749a = C1638eb.C1640a.m17749a(c1627dt, c1637ea.f23428c, "used");
            if (m17749a != null && m17749a.size() > 0) {
                if (m17695a(m17749a.get(0).m17731e(), c1637ea.f23430e) > 0) {
                    return true;
                }
            }
        } catch (Throwable th) {
            m17694a(th, "dDownLoad", "isUsed");
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m17702a(Context context, C1637ea c1637ea, C1599da c1599da) {
        C1627dt c1627dt = new C1627dt(context, C1642ed.m17742c());
        if (m17699a(c1627dt, c1637ea)) {
            return true;
        }
        C1643ee m17750a = C1638eb.C1640a.m17750a(c1627dt, c1637ea.f23427b);
        if (m17750a == null) {
            return false;
        }
        return m17704a(context, c1627dt, m17750a, c1637ea, c1599da);
    }

    /* renamed from: a */
    public static boolean m17701a(Context context, boolean z) {
        return z || m17707a(context);
    }

    /* renamed from: a */
    public static boolean m17697a(C1637ea c1637ea) {
        return Build.VERSION.SDK_INT >= c1637ea.f23432g && Build.VERSION.SDK_INT <= c1637ea.f23431f;
    }

    /* renamed from: a */
    public static boolean m17700a(C1599da c1599da, C1637ea c1637ea) {
        return c1599da != null && c1599da.m17972a().equals(c1637ea.f23428c) && c1599da.m17968b().equals(c1637ea.f23429d);
    }

    /* renamed from: a */
    public static boolean m17698a(C1627dt c1627dt, String str, String str2, C1599da c1599da) {
        C1643ee m17750a = C1638eb.C1640a.m17750a(c1627dt, str);
        return m17750a != null && c1599da.m17968b().equals(m17750a.m17732d()) && m17692b(str2, m17750a.m17737b());
    }

    /* renamed from: a */
    public static PublicKey m17708a() {
        ByteArrayInputStream byteArrayInputStream;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byteArrayInputStream = new ByteArrayInputStream(C1589cv.m18021b("MIIDRzCCAi+gAwIBAgIEeuDbsDANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJjbjELMAkGA1UECBMCYmoxCzAJBgNVBAcTAmJqMQ0wCwYDVQQKEwRvcGVuMQ4wDAYDVQQLEwVnYW9kZTELMAkGA1UEAxMCUWkwIBcNMTYwODAxMDE0ODMwWhgPMjA3MTA1MDUwMTQ4MzBaMFMxCzAJBgNVBAYTAmNuMQswCQYDVQQIEwJiajELMAkGA1UEBxMCYmoxDTALBgNVBAoTBG9wZW4xDjAMBgNVBAsTBWdhb2RlMQswCQYDVQQDEwJRaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKpL13mZm4q6AFP5csQE7130Lwq8m+HICy3rBARd9vbw5Cb1wFF96KdhC5P/aASlrPb+6MSyP1nE97p3ygKJWsgxExyvVuOvh1KUqOFuK15oY7JKTk6L4eLCbkBJZV2DLffpW0HGiRpmFG8LJR0sjNOoubSd5R/6XoBwyRglsyVHprjrK2qDRvT3Edgtfvxp4HnUzMsDD3CJRtgsaDw6ECyF7fhYKEz9I6OEEVsPlpbgzRmhSeFDL77/k1mhPve1ZyKGlPcxvSSdLSAlV0hzr5NKlujHll7BbouwDnr6l/0O44AzZ0V/ieft1iBkSLirnlm56uI/8jdh8ANrD1fW4ZUCAwEAAaMhMB8wHQYDVR0OBBYEFBzudtI5UKRvHGDV+VQRzItIj3PqMA0GCSqGSIb3DQEBCwUAA4IBAQBS2EGndgvIBnf7Ce4IhDbm7F5h4L+6TYGmT9acnQbEFY8oUoFblMDgg+cETT44jU/elwbJJVmKhj/WRQl+AdSALBAgDvxq1AcjlGg+c8H3pa2BWlrxNJP9MFLIEI5bA8m5og/Epjut50uemZ9ggoNmJeW0N/a6D8euhYJKOYngUQqDu6cwLj1Ec0ptwrNRbvRXXgzjfJMPE/ii4K/b8JZ+QN2d/bl7QEvKWBSzVueZifV659qAbMh6C9TCVstWWfV53Z3Vyt+duDNU5ed7aWao42Ppw4VHslrJW0V6BXDUhhzgXx28UWY78W7LmYGCtC8PfDId2+k4tPoTNPM6HHP5"));
            try {
                return ((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getPublicKey();
            } catch (Throwable th) {
                th = th;
                try {
                    m17694a(th, "DyLoader", "init");
                    try {
                        m17696a(byteArrayInputStream);
                    } catch (Throwable unused) {
                    }
                    return null;
                } finally {
                    try {
                        m17696a(byteArrayInputStream);
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
    public static void m17696a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m17707a(Context context) {
        if (C1587cu.m18035r(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m17693a(List<C1643ee> list) {
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                C1643ee c1643ee = list.get(i);
                C1643ee c1643ee2 = list.get(i3);
                if (m17695a(c1643ee2.m17731e(), c1643ee.m17731e()) > 0) {
                    list.set(i, c1643ee2);
                    list.set(i3, c1643ee);
                }
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static boolean m17692b(String str, String str2) {
        String m17993a = C1594cx.m17993a(str);
        if (m17993a != null && m17993a.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m17695a(String str, String str2) {
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
            C1612dl.m17891a(e, "Utils", "compareVersion");
            return -1;
        }
    }

    /* renamed from: a */
    public static void m17694a(Throwable th, String str, String str2) {
        C1612dl.m17891a(th, str, str2);
    }

    /* renamed from: a */
    public static boolean m17706a(Context context, C1599da c1599da, C1637ea c1637ea) {
        if (c1637ea.m17769e() || !C1602db.m17944a(context, c1637ea.m17768f())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m17705a(final Context context, C1627dt c1627dt, final C1599da c1599da) {
        try {
            if (new File(C1638eb.m17754b(context, c1599da.m17972a(), c1599da.m17968b())).exists() || TextUtils.isEmpty(C1638eb.m17765a(context, c1627dt, c1599da))) {
                return;
            }
            C1647eg.m17710b().m17713a().submit(new Runnable() { // from class: com.amap.api.mapcore2d.eh.2
                static {
                    Covode.recordClassIndex(5200);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1638eb.m17766a(context, c1599da);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m17703a(Context context, C1627dt c1627dt, String str, C1599da c1599da) {
        return m17698a(c1627dt, str, C1638eb.m17760a(context, str), c1599da);
    }

    /* renamed from: a */
    public static boolean m17704a(final Context context, final C1627dt c1627dt, C1643ee c1643ee, C1637ea c1637ea, final C1599da c1599da) {
        String str = c1637ea.f23428c;
        String str2 = c1637ea.f23429d;
        final String str3 = c1637ea.f23430e;
        if ("errorstatus".equals(c1643ee.m17730f())) {
            m17705a(context, c1627dt, c1599da);
            return true;
        }
        final String m17760a = C1638eb.m17760a(context, c1637ea.f23427b);
        if (!new File(m17760a).exists()) {
            return false;
        }
        List m17806b = c1627dt.m17806b(C1643ee.m17738a(C1638eb.m17759a(context, str, str2), str, str2, str3), C1643ee.class);
        if (m17806b != null && m17806b.size() > 0) {
            return true;
        }
        C1638eb.m17759a(context, str, c1599da.m17968b());
        try {
            C1647eg.m17710b().m17713a().submit(new Runnable() { // from class: com.amap.api.mapcore2d.eh.1
                static {
                    Covode.recordClassIndex(5199);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1638eb.m17764a(context, c1627dt, c1599da, m17760a, str3);
                        C1638eb.m17766a(context, c1599da);
                    } catch (Throwable th) {
                        C1650eh.m17694a(th, "dDownLoad", "processDownloadedFile()");
                    }
                }
            });
        } catch (Throwable unused) {
        }
        return true;
    }
}
