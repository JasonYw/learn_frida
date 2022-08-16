package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0470a;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.C0588a;
import anet.channel.util.C0589b;
import anet.channel.util.C0594g;
import anet.channel.util.ErrorConstant;
import anet.channel.util.StringUtils;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import p003X.C116971W2r;

/* renamed from: anet.channel.session.b */
/* loaded from: classes20.dex */
public class C0534b {

    /* renamed from: anet.channel.session.b$a */
    /* loaded from: classes20.dex */
    public static class C0535a {

        /* renamed from: a */
        public int f20643a;

        /* renamed from: b */
        public byte[] f20644b;

        /* renamed from: c */
        public Map<String, List<String>> f20645c;

        /* renamed from: d */
        public int f20646d;

        /* renamed from: e */
        public boolean f20647e;

        static {
            Covode.recordClassIndex(2252);
        }
    }

    static {
        Covode.recordClassIndex(2251);
    }

    /* renamed from: a */
    public static void m20897a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.m20786e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else if (C0589b.f20827a != null) {
            httpsURLConnection.setSSLSocketFactory(C0589b.f20827a);
            if (ALog.isPrintLog(2)) {
                ALog.m20785i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "SslSocketFactory", C0589b.f20827a);
            }
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
        } else if (C0589b.f20828b != null) {
            httpsURLConnection.setHostnameVerifier(C0589b.f20828b);
            if (!ALog.isPrintLog(2)) {
                return;
            }
            ALog.m20785i("awcn.HttpConnector", "HttpSslUtil", request.getSeq(), "HostnameVerifier", C0589b.f20828b);
        } else {
            httpsURLConnection.setHostnameVerifier(new C0536c(str));
        }
    }

    /* renamed from: a */
    public static HttpURLConnection m20902a(Request request) {
        Proxy proxy;
        HttpURLConnection httpURLConnection;
        String str;
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        if (wifiProxy != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue()));
        } else {
            proxy = null;
        }
        C0594g m20758a = C0594g.m20758a();
        if (NetworkStatusHelper.getStatus().isMobile() && m20758a != null) {
            proxy = m20758a.m20757b();
        }
        URL url = request.getUrl();
        if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) C116971W2r.LIZ(url);
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            C116971W2r.LIZIZ(httpURLConnection, entry.getKey(), entry.getValue());
        }
        String str2 = headers.get("Host");
        if (str2 == null) {
            str2 = request.getHost();
        }
        if (request.getHttpUrl().containsNonDefaultPort()) {
            str = StringUtils.concatString(str2, Constants.COLON_SEPARATOR, String.valueOf(request.getHttpUrl().getPort()));
        } else {
            str = str2;
        }
        C116971W2r.LIZ(httpURLConnection, "Host", str);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            C116971W2r.LIZ(httpURLConnection, "x-online-host", str);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            C116971W2r.LIZ(httpURLConnection, "Accept-Encoding", "gzip");
        }
        if (m20758a != null) {
            C116971W2r.LIZ(httpURLConnection, "Authorization", m20758a.m20756c());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            m20897a(httpURLConnection, request, str2);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* renamed from: a */
    public static int m20899a(HttpURLConnection httpURLConnection, Request request) {
        int i = 0;
        if (request.containsBody()) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    int postBody = request.postBody(outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e) {
                            ALog.m20787e("awcn.HttpConnector", "postData", request.getSeq(), e, new Object[0]);
                        }
                    }
                    i = postBody;
                } catch (Exception e2) {
                    ALog.m20787e("awcn.HttpConnector", "postData error", request.getSeq(), e2, new Object[0]);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e3) {
                            ALog.m20787e("awcn.HttpConnector", "postData", request.getSeq(), e3, new Object[0]);
                        }
                    }
                }
                long j = i;
                request.f20578a.reqBodyInflateSize = j;
                request.f20578a.reqBodyDeflateSize = j;
                request.f20578a.sendDataSize = j;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                        throw th;
                    } catch (IOException e4) {
                        ALog.m20787e("awcn.HttpConnector", "postData", request.getSeq(), e4, new Object[0]);
                        throw th;
                    }
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ef, code lost:
        r18.onResponseCode(r3.f20643a, r3.f20645c);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0215 A[Catch: SSLException -> 0x023b, SSLHandshakeException -> 0x023d, Exception -> 0x0245, IOException -> 0x027d, CancellationException -> 0x02a3, ConnectException -> 0x0361, ConnectTimeoutException -> 0x037a, SocketTimeoutException -> 0x0393, UnknownHostException -> 0x03ac, all -> 0x045b, TryCatch #23 {Exception -> 0x0245, blocks: (B:10:0x002f, B:12:0x0039, B:13:0x007d, B:15:0x008d, B:18:0x00a8, B:20:0x00f1, B:22:0x00fb, B:24:0x0101, B:34:0x015a, B:35:0x016e, B:37:0x0192, B:39:0x0198, B:41:0x019e, B:43:0x01a4, B:46:0x01ab, B:48:0x01ca, B:50:0x01da, B:51:0x01e1, B:52:0x01fe, B:54:0x0215, B:56:0x0230, B:67:0x01ef, B:68:0x01f6), top: B:9:0x002f, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0230 A[Catch: SSLException -> 0x023b, SSLHandshakeException -> 0x023d, Exception -> 0x0245, IOException -> 0x027d, CancellationException -> 0x02a3, ConnectException -> 0x0361, ConnectTimeoutException -> 0x037a, SocketTimeoutException -> 0x0393, UnknownHostException -> 0x03ac, all -> 0x045b, TRY_LEAVE, TryCatch #23 {Exception -> 0x0245, blocks: (B:10:0x002f, B:12:0x0039, B:13:0x007d, B:15:0x008d, B:18:0x00a8, B:20:0x00f1, B:22:0x00fb, B:24:0x0101, B:34:0x015a, B:35:0x016e, B:37:0x0192, B:39:0x0198, B:41:0x019e, B:43:0x01a4, B:46:0x01ab, B:48:0x01ca, B:50:0x01da, B:51:0x01e1, B:52:0x01fe, B:54:0x0215, B:56:0x0230, B:67:0x01ef, B:68:0x01f6), top: B:9:0x002f, outer: #22 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static anet.channel.session.C0534b.C0535a m20901a(anet.channel.request.Request r17, anet.channel.RequestCb r18) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C0534b.m20901a(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.session.b$a");
    }

    /* renamed from: a */
    public static void m20898a(HttpURLConnection httpURLConnection, Request request, C0535a c0535a, RequestCb requestCb) {
        InputStream LIZIZ;
        ByteArrayOutputStream byteArrayOutputStream;
        C0588a c0588a;
        InputStream inputStream;
        int i;
        MethodCollector.m14708i(47);
        httpURLConnection.getURL();
        boolean z = false;
        ByteArray byteArray = null;
        try {
            LIZIZ = C116971W2r.LIZJ(httpURLConnection);
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                ALog.m20783w("awcn.HttpConnector", "File not found", request.getSeq(), PushConstants.WEB_URL, request.getUrlString());
            }
            try {
                LIZIZ = C116971W2r.LIZIZ(httpURLConnection);
            } catch (Exception e2) {
                ALog.m20787e("awcn.HttpConnector", "get error stream failed.", request.getSeq(), e2, new Object[0]);
            }
        }
        if (LIZIZ != null) {
            if (requestCb == null) {
                if (c0535a.f20646d <= 0) {
                    i = AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END;
                } else if (c0535a.f20647e) {
                    i = c0535a.f20646d * 2;
                } else {
                    i = c0535a.f20646d;
                }
                byteArrayOutputStream = new ByteArrayOutputStream(i);
            } else {
                byteArrayOutputStream = null;
            }
            try {
                c0588a = new C0588a(LIZIZ);
            } catch (Throwable th) {
                th = th;
                c0588a = null;
            }
            try {
                if (c0535a.f20647e) {
                    inputStream = new GZIPInputStream(c0588a);
                } else {
                    inputStream = c0588a;
                }
                ByteArray byteArray2 = null;
                while (!Thread.currentThread().isInterrupted()) {
                    if (byteArray2 == null) {
                        byteArray2 = C0470a.C0471a.f20427a.m21051a(AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED);
                    }
                    int readFrom = byteArray2.readFrom(inputStream);
                    if (readFrom != -1) {
                        if (byteArrayOutputStream == null) {
                            requestCb.onDataReceive(byteArray2, z);
                            byteArray2 = byteArray;
                        } else {
                            byteArray2.writeTo(byteArrayOutputStream);
                        }
                        long j = readFrom;
                        request.f20578a.recDataSize += j;
                        request.f20578a.rspBodyInflateSize += j;
                        z = false;
                        byteArray = null;
                    } else {
                        if (byteArrayOutputStream != null) {
                            byteArray2.recycle();
                            c0535a.f20644b = byteArrayOutputStream.toByteArray();
                        } else {
                            requestCb.onDataReceive(byteArray2, true);
                        }
                        request.f20578a.recDataTime = System.currentTimeMillis() - request.f20578a.rspStart;
                        request.f20578a.rspBodyDeflateSize = c0588a.m20776a();
                        try {
                            inputStream.close();
                            MethodCollector.m14707o(47);
                            return;
                        } catch (IOException unused) {
                            MethodCollector.m14707o(47);
                            return;
                        }
                    }
                }
                CancellationException cancellationException = new CancellationException("task cancelled");
                MethodCollector.m14707o(47);
                throw cancellationException;
            } catch (Throwable th2) {
                th = th2;
                request.f20578a.recDataTime = System.currentTimeMillis() - request.f20578a.rspStart;
                request.f20578a.rspBodyDeflateSize = c0588a.m20776a();
                try {
                    LIZIZ.close();
                } catch (IOException unused2) {
                }
                MethodCollector.m14707o(47);
                throw th;
            }
        }
        m20900a(request, c0535a, requestCb, -404, null);
        MethodCollector.m14707o(47);
    }

    /* renamed from: a */
    public static void m20900a(Request request, C0535a c0535a, RequestCb requestCb, int i, Throwable th) {
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.m20786e("awcn.HttpConnector", "onException", request.getSeq(), "errorCode", Integer.valueOf(i), "errMsg", errMsg, PushConstants.WEB_URL, request.getUrlString(), C1315c.f22208f, request.getHost());
        if (c0535a != null) {
            c0535a.f20643a = i;
        }
        if (!request.f20578a.isDone.get()) {
            request.f20578a.statusCode = i;
            request.f20578a.msg = errMsg;
            request.f20578a.rspEnd = System.currentTimeMillis();
            if (i != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i, errMsg, request.f20578a, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i, errMsg, request.f20578a);
        }
    }
}
