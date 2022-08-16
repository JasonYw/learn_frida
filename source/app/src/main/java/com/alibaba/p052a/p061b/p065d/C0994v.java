package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.alibaba.a.b.d.v */
/* loaded from: classes2.dex */
public class C0994v extends X509ExtendedTrustManager {

    /* renamed from: a */
    public static TrustManager[] f21433a;

    static {
        Covode.recordClassIndex(4304);
    }

    /* renamed from: a */
    public static synchronized TrustManager[] m20049a() {
        TrustManager[] trustManagerArr;
        synchronized (C0994v.class) {
            if (f21433a == null) {
                f21433a = new TrustManager[]{new C0994v()};
            }
            trustManagerArr = f21433a;
        }
        return trustManagerArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        C0974i.m20098a("UtExtendTrustManager", "checkClientTrusted1");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C0974i.m20098a("UtExtendTrustManager", "checkClientTrusted2");
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        try {
            x509CertificateArr[0].checkValidity();
        } catch (Exception unused) {
            throw new CertificateException("Certificate not valid or trusted.");
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C0974i.m20098a("UtExtendTrustManager", "checkClientTrusted3");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        C0974i.m20098a("UtExtendTrustManager", "checkServerTrusted1");
        if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            if (trustManagerFactory.getTrustManagers() == null) {
                return;
            }
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                try {
                    ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                } catch (CertificateException e) {
                    Throwable th = e;
                    while (!(th instanceof CertificateExpiredException) && !(th instanceof CertificateNotYetValidException)) {
                        th = th.getCause();
                        if (th == null) {
                            throw e;
                        }
                    }
                    return;
                }
            }
        } catch (KeyStoreException e2) {
            throw new CertificateException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new CertificateException(e3);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C0974i.m20098a("UtExtendTrustManager", "checkServerTrusted2");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C0974i.m20098a("UtExtendTrustManager", "checkServerTrusted3");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
