package com.alibaba.p052a.p061b.p065d;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.p052a.p061b.C0941a;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.alibaba.a.b.d.x */
/* loaded from: classes2.dex */
public class C0996x extends SSLSocketFactory {

    /* renamed from: a */
    public Method f21435a;

    /* renamed from: b */
    public String f21436b;

    static {
        Covode.recordClassIndex(4306);
    }

    public C0996x(String str) {
        this.f21436b = str;
    }

    /* renamed from: a */
    public String m20047a() {
        return this.f21436b;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        C0974i.m20098a("UtSslSocketFactory", "bizHost", this.f21436b, C1315c.f22208f, str, "port", Integer.valueOf(i), "autoClose", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(this.f21436b)) {
            C0974i.m20098a("UtSslSocketFactory", "customized createSocket. host: " + this.f21436b);
            try {
                SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(10000, new SSLSessionCache(C0941a.m20233c()));
                if (Build.VERSION.SDK_INT < 24) {
                    sSLCertificateSocketFactory.setTrustManagers(C0997y.m20046a());
                } else {
                    sSLCertificateSocketFactory.setTrustManagers(C0994v.m20049a());
                }
                SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.f21436b, i, z);
                sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
                int i2 = Build.VERSION.SDK_INT;
                sSLCertificateSocketFactory.setUseSessionTickets(sSLSocket, true);
                sSLCertificateSocketFactory.setHostname(sSLSocket, this.f21436b);
                sSLSocket.startHandshake();
                return sSLSocket;
            } catch (Throwable th) {
                throw new IOException("createSocket exception: " + th);
            }
        }
        throw new IOException("SDK set empty bizHost");
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f21436b) || !(obj instanceof C0996x)) {
            return false;
        }
        String str = ((C0996x) obj).f21436b;
        if (!TextUtils.isEmpty(str)) {
            return this.f21436b.equals(str);
        }
        return false;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
