package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.alibaba.a.b.d.y */
/* loaded from: classes2.dex */
public class C0997y implements X509TrustManager {

    /* renamed from: a */
    public static TrustManager[] f21437a;

    static {
        Covode.recordClassIndex(4307);
    }

    /* renamed from: a */
    public static synchronized TrustManager[] m20046a() {
        TrustManager[] trustManagerArr;
        synchronized (C0997y.class) {
            if (f21437a == null) {
                f21437a = new TrustManager[]{new C0997y()};
            }
            trustManagerArr = f21437a;
        }
        return trustManagerArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
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

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
