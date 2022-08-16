package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import p002O.C0002O;

/* renamed from: com.alipay.android.phone.mrpc.core.q */
/* loaded from: classes2.dex */
public final class CallableC1170q implements Callable<C1174u> {

    /* renamed from: e */
    public static final HttpRequestRetryHandler f21917e = new C1151ad();

    /* renamed from: a */
    public C1165l f21918a;

    /* renamed from: b */
    public Context f21919b;

    /* renamed from: c */
    public C1168o f21920c;

    /* renamed from: d */
    public String f21921d;

    /* renamed from: f */
    public HttpUriRequest f21922f;

    /* renamed from: i */
    public CookieManager f21925i;

    /* renamed from: j */
    public AbstractHttpEntity f21926j;

    /* renamed from: k */
    public HttpHost f21927k;

    /* renamed from: l */
    public URL f21928l;

    /* renamed from: q */
    public String f21933q;

    /* renamed from: g */
    public HttpContext f21923g = new BasicHttpContext();

    /* renamed from: h */
    public CookieStore f21924h = new BasicCookieStore();

    /* renamed from: m */
    public int f21929m = 0;

    /* renamed from: n */
    public boolean f21930n = false;

    /* renamed from: o */
    public boolean f21931o = false;

    /* renamed from: p */
    public String f21932p = null;

    static {
        Covode.recordClassIndex(4641);
    }

    public CallableC1170q(C1165l c1165l, C1168o c1168o) {
        this.f21918a = c1165l;
        this.f21919b = c1165l.f21895a;
        this.f21920c = c1168o;
    }

    /* renamed from: a */
    public static long m19611a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i])) {
                int i2 = i + 1;
                if (strArr[i2] != null) {
                    try {
                        return Long.parseLong(strArr[i2]);
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0L;
    }

    /* renamed from: a */
    public static HttpUrlHeader m19613a(HttpResponse httpResponse) {
        Header[] allHeaders;
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    /* renamed from: a */
    private C1174u m19612a(HttpResponse httpResponse, int i, String str) {
        String str2;
        new StringBuilder("开始handle，handleResponse-1,").append(Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        String str3 = null;
        if (entity == null) {
            httpResponse.getStatusLine().getStatusCode();
            return null;
        } else if (httpResponse.getStatusLine().getStatusCode() != 200) {
            return null;
        } else {
            new StringBuilder("200，开始处理，handleResponse-2,threadid = ").append(Thread.currentThread().getId());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                m19614a(entity, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f21931o = false;
                this.f21918a.m19632c(System.currentTimeMillis() - currentTimeMillis);
                this.f21918a.m19637a(byteArray.length);
                new StringBuilder("res:").append(byteArray.length);
                C1169p c1169p = new C1169p(m19613a(httpResponse), i, str, byteArray);
                long m19609b = m19609b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> m19615a = m19615a(contentType.getValue());
                    str3 = m19615a.get("charset");
                    str2 = m19615a.get("Content-Type");
                } else {
                    str2 = null;
                }
                c1169p.m19595b(str2);
                c1169p.m19618a(str3);
                c1169p.m19619a(System.currentTimeMillis());
                c1169p.m19617b(m19609b);
                try {
                    byteArrayOutputStream.close();
                    return c1169p;
                } catch (IOException e) {
                    throw new RuntimeException("ArrayOutputStream close error!", e.getCause());
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            }
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m19615a(String str) {
        String[] split;
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m19614a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream m19658a = C1152b.m19658a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED];
                while (true) {
                    int read = m19658a.read(bArr);
                    if (read == -1 || this.f21920c.m19597h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    this.f21920c.m19599f();
                }
                outputStream.flush();
            } catch (Exception e) {
                e.getCause();
                throw new IOException(C0002O.m25086C("HttpWorker Request Error!", e.getLocalizedMessage()));
            }
        } finally {
            C1171r.m19601a(m19658a);
        }
    }

    /* renamed from: b */
    public static long m19609b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return m19611a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return C1152b.m19653b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    /* renamed from: b */
    private URI m19610b() {
        String m19631a = this.f21920c.m19631a();
        String str = this.f21921d;
        if (str != null) {
            m19631a = str;
        } else if (m19631a == null) {
            throw new RuntimeException("url should not be null");
        }
        return new URI(m19631a);
    }

    /* renamed from: c */
    private HttpUriRequest m19608c() {
        HttpUriRequest httpUriRequest = this.f21922f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f21926j == null) {
            byte[] m19625b = this.f21920c.m19625b();
            String m19624b = this.f21920c.m19624b("gzip");
            if (m19625b != null) {
                if (TextUtils.equals(m19624b, "true")) {
                    this.f21926j = C1152b.m19654a(m19625b);
                } else {
                    this.f21926j = new ByteArrayEntity(m19625b);
                }
                this.f21926j.setContentType(this.f21920c.m19623c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f21926j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(m19610b());
            httpPost.setEntity(abstractHttpEntity);
            this.f21922f = httpPost;
        } else {
            this.f21922f = new HttpGet(m19610b());
        }
        return this.f21922f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(32:14|15|(3:19|(2:22|20)|23)|24|25|26|27|28|29|30|(2:34|(13:36|(1:38)|94|40|(1:42)(1:93)|43|(1:45)|46|(1:48)|49|(3:51|(4:54|(5:56|57|(1:59)(1:63)|60|61)(1:64)|62|52)|65)|66|(4:73|(3:88|89|90)|79|(1:85)(2:83|84))(2:70|71)))|95|94|40|(0)(0)|43|(0)|46|(0)|49|(0)|66|(1:68)|73|(1:75)|86|88|89|90|79|(1:81)|85) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
        if (r2.getPort() == 8087) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: NullPointerException -> 0x0253, Exception -> 0x0263, IOException -> 0x029b, UnknownHostException -> 0x02c5, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, SocketTimeoutException -> 0x0340, ConnectTimeoutException -> 0x036b, ConnectionPoolTimeoutException -> 0x0395, SSLException -> 0x03bf, SSLPeerUnverifiedException -> 0x03e9, SSLHandshakeException -> 0x0413, URISyntaxException -> 0x043d, HttpException -> 0x044a, TryCatch #3 {HttpException -> 0x044a, NullPointerException -> 0x0253, SocketTimeoutException -> 0x0340, URISyntaxException -> 0x043d, UnknownHostException -> 0x02c5, SSLHandshakeException -> 0x0413, SSLPeerUnverifiedException -> 0x03e9, SSLException -> 0x03bf, ConnectTimeoutException -> 0x036b, IOException -> 0x029b, ConnectionPoolTimeoutException -> 0x0395, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, Exception -> 0x0263, blocks: (B:4:0x0006, B:6:0x0015, B:8:0x0019, B:10:0x001d, B:12:0x0023, B:15:0x0029, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0041, B:24:0x0052, B:26:0x0066, B:28:0x007b, B:30:0x00bb, B:32:0x00ca, B:34:0x00d0, B:36:0x00da, B:38:0x00eb, B:40:0x00f3, B:42:0x00fa, B:43:0x00fc, B:45:0x0104, B:46:0x0111, B:48:0x0137, B:49:0x013e, B:51:0x0144, B:52:0x0148, B:54:0x014e, B:57:0x015a, B:60:0x0189, B:66:0x01c2, B:70:0x01da, B:71:0x01f3, B:73:0x01f4, B:75:0x01fc, B:77:0x0202, B:79:0x0220, B:81:0x0228, B:83:0x0232, B:88:0x0210, B:93:0x01a5, B:97:0x004f, B:101:0x0247, B:102:0x0252), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104 A[Catch: NullPointerException -> 0x0253, Exception -> 0x0263, IOException -> 0x029b, UnknownHostException -> 0x02c5, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, SocketTimeoutException -> 0x0340, ConnectTimeoutException -> 0x036b, ConnectionPoolTimeoutException -> 0x0395, SSLException -> 0x03bf, SSLPeerUnverifiedException -> 0x03e9, SSLHandshakeException -> 0x0413, URISyntaxException -> 0x043d, HttpException -> 0x044a, TryCatch #3 {HttpException -> 0x044a, NullPointerException -> 0x0253, SocketTimeoutException -> 0x0340, URISyntaxException -> 0x043d, UnknownHostException -> 0x02c5, SSLHandshakeException -> 0x0413, SSLPeerUnverifiedException -> 0x03e9, SSLException -> 0x03bf, ConnectTimeoutException -> 0x036b, IOException -> 0x029b, ConnectionPoolTimeoutException -> 0x0395, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, Exception -> 0x0263, blocks: (B:4:0x0006, B:6:0x0015, B:8:0x0019, B:10:0x001d, B:12:0x0023, B:15:0x0029, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0041, B:24:0x0052, B:26:0x0066, B:28:0x007b, B:30:0x00bb, B:32:0x00ca, B:34:0x00d0, B:36:0x00da, B:38:0x00eb, B:40:0x00f3, B:42:0x00fa, B:43:0x00fc, B:45:0x0104, B:46:0x0111, B:48:0x0137, B:49:0x013e, B:51:0x0144, B:52:0x0148, B:54:0x014e, B:57:0x015a, B:60:0x0189, B:66:0x01c2, B:70:0x01da, B:71:0x01f3, B:73:0x01f4, B:75:0x01fc, B:77:0x0202, B:79:0x0220, B:81:0x0228, B:83:0x0232, B:88:0x0210, B:93:0x01a5, B:97:0x004f, B:101:0x0247, B:102:0x0252), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137 A[Catch: NullPointerException -> 0x0253, Exception -> 0x0263, IOException -> 0x029b, UnknownHostException -> 0x02c5, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, SocketTimeoutException -> 0x0340, ConnectTimeoutException -> 0x036b, ConnectionPoolTimeoutException -> 0x0395, SSLException -> 0x03bf, SSLPeerUnverifiedException -> 0x03e9, SSLHandshakeException -> 0x0413, URISyntaxException -> 0x043d, HttpException -> 0x044a, TryCatch #3 {HttpException -> 0x044a, NullPointerException -> 0x0253, SocketTimeoutException -> 0x0340, URISyntaxException -> 0x043d, UnknownHostException -> 0x02c5, SSLHandshakeException -> 0x0413, SSLPeerUnverifiedException -> 0x03e9, SSLException -> 0x03bf, ConnectTimeoutException -> 0x036b, IOException -> 0x029b, ConnectionPoolTimeoutException -> 0x0395, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, Exception -> 0x0263, blocks: (B:4:0x0006, B:6:0x0015, B:8:0x0019, B:10:0x001d, B:12:0x0023, B:15:0x0029, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0041, B:24:0x0052, B:26:0x0066, B:28:0x007b, B:30:0x00bb, B:32:0x00ca, B:34:0x00d0, B:36:0x00da, B:38:0x00eb, B:40:0x00f3, B:42:0x00fa, B:43:0x00fc, B:45:0x0104, B:46:0x0111, B:48:0x0137, B:49:0x013e, B:51:0x0144, B:52:0x0148, B:54:0x014e, B:57:0x015a, B:60:0x0189, B:66:0x01c2, B:70:0x01da, B:71:0x01f3, B:73:0x01f4, B:75:0x01fc, B:77:0x0202, B:79:0x0220, B:81:0x0228, B:83:0x0232, B:88:0x0210, B:93:0x01a5, B:97:0x004f, B:101:0x0247, B:102:0x0252), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144 A[Catch: NullPointerException -> 0x0253, Exception -> 0x0263, IOException -> 0x029b, UnknownHostException -> 0x02c5, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, SocketTimeoutException -> 0x0340, ConnectTimeoutException -> 0x036b, ConnectionPoolTimeoutException -> 0x0395, SSLException -> 0x03bf, SSLPeerUnverifiedException -> 0x03e9, SSLHandshakeException -> 0x0413, URISyntaxException -> 0x043d, HttpException -> 0x044a, TryCatch #3 {HttpException -> 0x044a, NullPointerException -> 0x0253, SocketTimeoutException -> 0x0340, URISyntaxException -> 0x043d, UnknownHostException -> 0x02c5, SSLHandshakeException -> 0x0413, SSLPeerUnverifiedException -> 0x03e9, SSLException -> 0x03bf, ConnectTimeoutException -> 0x036b, IOException -> 0x029b, ConnectionPoolTimeoutException -> 0x0395, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, Exception -> 0x0263, blocks: (B:4:0x0006, B:6:0x0015, B:8:0x0019, B:10:0x001d, B:12:0x0023, B:15:0x0029, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0041, B:24:0x0052, B:26:0x0066, B:28:0x007b, B:30:0x00bb, B:32:0x00ca, B:34:0x00d0, B:36:0x00da, B:38:0x00eb, B:40:0x00f3, B:42:0x00fa, B:43:0x00fc, B:45:0x0104, B:46:0x0111, B:48:0x0137, B:49:0x013e, B:51:0x0144, B:52:0x0148, B:54:0x014e, B:57:0x015a, B:60:0x0189, B:66:0x01c2, B:70:0x01da, B:71:0x01f3, B:73:0x01f4, B:75:0x01fc, B:77:0x0202, B:79:0x0220, B:81:0x0228, B:83:0x0232, B:88:0x0210, B:93:0x01a5, B:97:0x004f, B:101:0x0247, B:102:0x0252), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a5 A[Catch: NullPointerException -> 0x0253, Exception -> 0x0263, IOException -> 0x029b, UnknownHostException -> 0x02c5, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, SocketTimeoutException -> 0x0340, ConnectTimeoutException -> 0x036b, ConnectionPoolTimeoutException -> 0x0395, SSLException -> 0x03bf, SSLPeerUnverifiedException -> 0x03e9, SSLHandshakeException -> 0x0413, URISyntaxException -> 0x043d, HttpException -> 0x044a, TryCatch #3 {HttpException -> 0x044a, NullPointerException -> 0x0253, SocketTimeoutException -> 0x0340, URISyntaxException -> 0x043d, UnknownHostException -> 0x02c5, SSLHandshakeException -> 0x0413, SSLPeerUnverifiedException -> 0x03e9, SSLException -> 0x03bf, ConnectTimeoutException -> 0x036b, IOException -> 0x029b, ConnectionPoolTimeoutException -> 0x0395, HttpHostConnectException -> 0x02f1, NoHttpResponseException -> 0x0315, Exception -> 0x0263, blocks: (B:4:0x0006, B:6:0x0015, B:8:0x0019, B:10:0x001d, B:12:0x0023, B:15:0x0029, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0041, B:24:0x0052, B:26:0x0066, B:28:0x007b, B:30:0x00bb, B:32:0x00ca, B:34:0x00d0, B:36:0x00da, B:38:0x00eb, B:40:0x00f3, B:42:0x00fa, B:43:0x00fc, B:45:0x0104, B:46:0x0111, B:48:0x0137, B:49:0x013e, B:51:0x0144, B:52:0x0148, B:54:0x014e, B:57:0x015a, B:60:0x0189, B:66:0x01c2, B:70:0x01da, B:71:0x01f3, B:73:0x01f4, B:75:0x01fc, B:77:0x0202, B:79:0x0220, B:81:0x0228, B:83:0x0232, B:88:0x0210, B:93:0x01a5, B:97:0x004f, B:101:0x0247, B:102:0x0252), top: B:3:0x0006 }] */
    @Override // java.util.concurrent.Callable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.phone.mrpc.core.C1174u call() {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.CallableC1170q.call():com.alipay.android.phone.mrpc.core.u");
    }

    /* renamed from: e */
    private void m19606e() {
        HttpUriRequest httpUriRequest = this.f21922f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    /* renamed from: f */
    private String m19605f() {
        if (!TextUtils.isEmpty(this.f21933q)) {
            return this.f21933q;
        }
        String m19624b = this.f21920c.m19624b("operationType");
        this.f21933q = m19624b;
        return m19624b;
    }

    /* renamed from: g */
    private int m19604g() {
        URL m19603h = m19603h();
        return m19603h.getPort() == -1 ? m19603h.getDefaultPort() : m19603h.getPort();
    }

    /* renamed from: h */
    private URL m19603h() {
        URL url = this.f21928l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f21920c.m19631a());
        this.f21928l = url2;
        return url2;
    }

    /* renamed from: i */
    private CookieManager m19602i() {
        CookieManager cookieManager = this.f21925i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f21925i = cookieManager2;
        return cookieManager2;
    }

    /* renamed from: a */
    public final C1168o m19616a() {
        return this.f21920c;
    }
}
