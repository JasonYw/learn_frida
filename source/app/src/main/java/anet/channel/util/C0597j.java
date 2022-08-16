package anet.channel.util;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.util.j */
/* loaded from: classes2.dex */
public class C0597j extends SSLSocketFactory {

    /* renamed from: a */
    public final String f20845a = "awcn.TlsSniSocketFactory";

    /* renamed from: b */
    public Method f20846b;

    /* renamed from: c */
    public String f20847c;

    static {
        Covode.recordClassIndex(2381);
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
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    public C0597j(String str) {
        this.f20847c = str;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        if (this.f20847c == null) {
            this.f20847c = str;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m20785i("awcn.TlsSniSocketFactory", "customized createSocket", null, C1315c.f22208f, this.f20847c);
        }
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        int i2 = Build.VERSION.SDK_INT;
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f20847c);
        SSLSession session = sSLSocket.getSession();
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.TlsSniSocketFactory", null, null, "SSLSession PeerHost", session.getPeerHost());
        }
        return sSLSocket;
    }
}
