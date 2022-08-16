package com.amap.api.mapcore2d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.amap.api.mapcore2d.C1671er;
import com.amap.api.mapcore2d.C1674et;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.eu */
/* loaded from: classes19.dex */
public class C1676eu {

    /* renamed from: a */
    public int f23545a;

    /* renamed from: b */
    public int f23546b;

    /* renamed from: c */
    public boolean f23547c;

    /* renamed from: d */
    public SSLContext f23548d;

    /* renamed from: e */
    public Proxy f23549e;

    /* renamed from: f */
    public volatile boolean f23550f;

    /* renamed from: g */
    public long f23551g;

    /* renamed from: h */
    public long f23552h;

    /* renamed from: i */
    public String f23553i;

    /* renamed from: j */
    public C1678a f23554j;

    /* renamed from: k */
    public C1671er.AbstractC1672a f23555k;

    /* renamed from: com.amap.api.mapcore2d.eu$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C16771 {
        static {
            Covode.recordClassIndex(5225);
        }
    }

    static {
        Covode.recordClassIndex(5224);
    }

    /* renamed from: com.amap.api.mapcore2d.eu$a */
    /* loaded from: classes19.dex */
    public static class C1678a {

        /* renamed from: a */
        public Vector<C1679b> f23556a;

        /* renamed from: b */
        public volatile C1679b f23557b;

        static {
            Covode.recordClassIndex(5226);
        }

        /* renamed from: a */
        public C1679b m17588a() {
            return this.f23557b;
        }

        public C1678a() {
            this.f23556a = new Vector<>();
            this.f23557b = new C1679b(null);
        }

        public /* synthetic */ C1678a(C16771 c16771) {
            this();
        }

        /* renamed from: b */
        public void m17586b(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f23557b.m17584a(str);
        }

        /* renamed from: a */
        public C1679b m17587a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.f23557b;
            }
            for (int i = 0; i < this.f23556a.size(); i++) {
                C1679b c1679b = this.f23556a.get(i);
                if (c1679b != null && c1679b.m17585a().equals(str)) {
                    return c1679b;
                }
            }
            C1679b c1679b2 = new C1679b(null);
            c1679b2.m17583b(str);
            this.f23556a.add(c1679b2);
            return c1679b2;
        }
    }

    /* renamed from: com.amap.api.mapcore2d.eu$b */
    /* loaded from: classes19.dex */
    public static class C1679b implements HostnameVerifier {

        /* renamed from: a */
        public String f23558a;

        /* renamed from: b */
        public String f23559b;

        static {
            Covode.recordClassIndex(5227);
        }

        public C1679b() {
        }

        /* renamed from: a */
        public String m17585a() {
            return this.f23559b;
        }

        /* renamed from: b */
        public void m17583b(String str) {
            this.f23559b = str;
        }

        public /* synthetic */ C1679b(C16771 c16771) {
            this();
        }

        /* renamed from: a */
        public void m17584a(String str) {
            this.f23558a = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (!TextUtils.isEmpty(this.f23558a)) {
                return this.f23558a.equals(str);
            }
            if (!TextUtils.isEmpty(this.f23559b)) {
                return defaultHostnameVerifier.verify(this.f23559b, sSLSession);
            }
            return defaultHostnameVerifier.verify(str, sSLSession);
        }
    }

    /* renamed from: a */
    public void m17595a(String str, boolean z, String str2, Map<String, String> map, Map<String, String> map2, byte[] bArr, C1674et.AbstractC1675a abstractC1675a) {
        HttpURLConnection httpURLConnection;
        int read;
        if (abstractC1675a == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            String m17591a = m17591a(map2);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            if (m17591a != null) {
                stringBuffer.append("?");
                stringBuffer.append(m17591a);
            }
            boolean z2 = true;
            boolean z3 = bArr != null && bArr.length > 0;
            httpURLConnection = m17594a(stringBuffer.toString(), z, str2, map, z3);
            try {
                C116971W2r.LIZ(httpURLConnection, "RANGE", "bytes=" + this.f23552h + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (z3) {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.close();
                }
                httpURLConnection.connect();
                int LIZ = C116971W2r.LIZ(httpURLConnection);
                if (LIZ != 200) {
                    if (LIZ == 206) {
                        z2 = false;
                    }
                    if (true & z2) {
                        abstractC1675a.mo17603a(new C1572cp("网络异常原因：" + httpURLConnection.getResponseMessage() + " 网络异常状态码：" + LIZ));
                    }
                }
                InputStream LIZJ = C116971W2r.LIZJ(httpURLConnection);
                byte[] bArr2 = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
                while (!Thread.interrupted() && !this.f23550f && (read = LIZJ.read(bArr2, 0, AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END)) > 0 && (this.f23551g == -1 || this.f23552h < this.f23551g)) {
                    if (read == 1024) {
                        abstractC1675a.mo17602a(bArr2, this.f23552h);
                    } else {
                        byte[] bArr3 = new byte[read];
                        System.arraycopy(bArr2, 0, bArr3, 0, read);
                        abstractC1675a.mo17602a(bArr3, this.f23552h);
                    }
                    this.f23552h += read;
                }
                if (this.f23550f) {
                    abstractC1675a.mo17601b();
                } else {
                    abstractC1675a.mo17600c();
                }
                if (LIZJ != null) {
                    try {
                        LIZJ.close();
                    } catch (IOException e) {
                        C1612dl.m17891a(e, "ht", "mdr");
                    } catch (Throwable th) {
                        C1612dl.m17891a(th, "ht", "mdr");
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th2) {
                    C1612dl.m17891a(th2, "ht", "mdr");
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    abstractC1675a.mo17603a(th);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            C1612dl.m17891a(e2, "ht", "mdr");
                        } catch (Throwable th4) {
                            C1612dl.m17891a(th4, "ht", "mdr");
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th5) {
                        C1612dl.m17891a(th5, "ht", "mdr");
                    }
                } catch (Throwable th6) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            C1612dl.m17891a(e3, "ht", "mdr");
                        } catch (Throwable th7) {
                            C1612dl.m17891a(th7, "ht", "mdr");
                        }
                    }
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                            throw th6;
                        } catch (Throwable th8) {
                            C1612dl.m17891a(th8, "ht", "mdr");
                            throw th6;
                        }
                    }
                    throw th6;
                }
            }
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
        }
    }

    /* renamed from: a */
    public HttpURLConnection m17594a(String str, boolean z, String str2, Map<String, String> map, boolean z2) {
        URLConnection LIZ;
        HttpsURLConnection httpsURLConnection;
        C1587cu.m18068b();
        if (map == null) {
            map = new HashMap<>();
        }
        C1679b m17588a = this.f23554j.m17588a();
        if (z && !TextUtils.isEmpty(str2)) {
            m17588a = this.f23554j.m17587a(str2);
        }
        String m17598a = m17598a(C1671er.f23538a, str, map);
        if (this.f23547c) {
            m17598a = C1590cw.m18010a(m17598a);
        }
        URL url = new URL(m17598a);
        C1671er.AbstractC1672a abstractC1672a = this.f23555k;
        if (abstractC1672a == null || (LIZ = abstractC1672a.m17611a(this.f23549e, url)) == null) {
            Proxy proxy = this.f23549e;
            if (proxy != null) {
                LIZ = url.openConnection(proxy);
            } else {
                LIZ = C116971W2r.LIZ(url);
            }
        }
        if (this.f23547c) {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) LIZ;
            httpsURLConnection2.setSSLSocketFactory(this.f23548d.getSocketFactory());
            httpsURLConnection2.setHostnameVerifier(m17588a);
            httpsURLConnection = httpsURLConnection2;
        } else {
            httpsURLConnection = (HttpURLConnection) LIZ;
        }
        if (Build.VERSION.SDK != null) {
            int i = Build.VERSION.SDK_INT;
            C116971W2r.LIZ(httpsURLConnection, "Connection", "close");
        }
        m17590a(map, httpsURLConnection);
        if (z2) {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            return httpsURLConnection;
        }
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setDoInput(true);
        return httpsURLConnection;
    }

    /* renamed from: a */
    private void m17599a() {
        try {
            this.f23553i = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase();
        } catch (Throwable th) {
            C1612dl.m17891a(th, "ht", "ic");
        }
    }

    /* renamed from: a */
    public void m17597a(long j) {
        this.f23552h = j;
    }

    /* renamed from: b */
    public void m17589b(long j) {
        this.f23551g = j;
    }

    /* renamed from: a */
    public static String m17591a(Map<String, String> map) {
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(key));
                sb.append("=");
                sb.append(URLEncoder.encode(value));
            }
            return sb.toString();
        }
        return null;
    }

    /* renamed from: a */
    private void m17590a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                C116971W2r.LIZIZ(httpURLConnection, str, map.get(str));
            }
        }
        try {
            C116971W2r.LIZIZ(httpURLConnection, "csid", this.f23553i);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "ht", "adh");
        }
        httpURLConnection.setConnectTimeout(this.f23545a);
        httpURLConnection.setReadTimeout(this.f23546b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
        if (r5 == null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.zip.GZIPInputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.amap.api.mapcore2d.C1685ey m17592a(java.net.HttpURLConnection r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1676eu.m17592a(java.net.HttpURLConnection, boolean):com.amap.api.mapcore2d.ey");
    }

    /* renamed from: a */
    private String m17598a(int i, String str, Map<String, String> map) {
        String str2;
        if (i != 1) {
            str2 = "";
        } else {
            str2 = C1671er.f23539b;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String uri = parse.buildUpon().encodedAuthority(str2).build().toString();
        if (map != null) {
            map.put("targetHost", host);
        }
        if (this.f23547c) {
            this.f23554j.m17586b(str2);
        }
        return uri;
    }

    public C1676eu(int i, int i2, Proxy proxy, boolean z) {
        this(i, i2, proxy, z, null);
    }

    public C1676eu(int i, int i2, Proxy proxy, boolean z, C1671er.AbstractC1672a abstractC1672a) {
        this.f23551g = -1L;
        this.f23545a = i;
        this.f23546b = i2;
        this.f23549e = proxy;
        this.f23547c = C1590cw.m18013a().m18005b(z);
        if (C1590cw.m18004c()) {
            this.f23547c = false;
        }
        this.f23555k = abstractC1672a;
        m17599a();
        if (this.f23547c) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.f23548d = sSLContext;
            } catch (Throwable th) {
                C1612dl.m17891a(th, "ht", "ne");
            }
        }
        this.f23554j = new C1678a(null);
    }

    /* renamed from: a */
    public C1685ey m17596a(String str, boolean z, String str2, Map<String, String> map, Map<String, String> map2, boolean z2) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                String m17591a = m17591a(map2);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                if (m17591a != null) {
                    stringBuffer.append("?");
                    stringBuffer.append(m17591a);
                }
                HttpURLConnection m17594a = m17594a(stringBuffer.toString(), z, str2, map, false);
                try {
                    C1685ey m17592a = m17592a(m17594a, z2);
                    if (m17594a != null) {
                        try {
                            m17594a.disconnect();
                            return m17592a;
                        } catch (Throwable th) {
                            C1612dl.m17891a(th, "ht", "mgr");
                        }
                    }
                    return m17592a;
                } catch (C1572cp e) {
                    throw e;
                } catch (InterruptedIOException unused) {
                    throw new C1572cp("未知的错误");
                } catch (ConnectException unused2) {
                    throw new C1572cp("http连接失败 - ConnectionException");
                } catch (MalformedURLException unused3) {
                    throw new C1572cp("url异常 - MalformedURLException");
                } catch (SocketException unused4) {
                    throw new C1572cp("socket 连接异常 - SocketException");
                } catch (SocketTimeoutException unused5) {
                    throw new C1572cp("socket 连接超时 - SocketTimeoutException");
                } catch (UnknownHostException unused6) {
                    throw new C1572cp("未知主机 - UnKnowHostException");
                } catch (IOException unused7) {
                    throw new C1572cp("IO 操作异常 - IOException");
                } catch (Throwable unused8) {
                    throw new C1572cp("未知的错误");
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                        throw th2;
                    } catch (Throwable th3) {
                        C1612dl.m17891a(th3, "ht", "mgr");
                        throw th2;
                    }
                }
                throw th2;
            }
        } catch (C1572cp e2) {
            throw e2;
        } catch (InterruptedIOException unused9) {
        } catch (ConnectException unused10) {
        } catch (MalformedURLException unused11) {
        } catch (SocketException unused12) {
        } catch (SocketTimeoutException unused13) {
        } catch (UnknownHostException unused14) {
        } catch (IOException unused15) {
        } catch (Throwable unused16) {
        }
    }

    /* renamed from: a */
    public C1685ey m17593a(String str, boolean z, String str2, Map<String, String> map, byte[] bArr, boolean z2) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection m17594a = m17594a(str, z, str2, map, true);
                if (bArr != null && bArr.length > 0) {
                    DataOutputStream dataOutputStream = new DataOutputStream(m17594a.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.close();
                }
                try {
                    C1685ey m17592a = m17592a(m17594a, z2);
                    if (m17594a != null) {
                        try {
                            m17594a.disconnect();
                            return m17592a;
                        } catch (Throwable th) {
                            C1612dl.m17891a(th, "ht", "mPt");
                        }
                    }
                    return m17592a;
                } catch (C1572cp e) {
                    e = e;
                    C1612dl.m17891a(e, "ht", "mPt");
                    throw e;
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    e.printStackTrace();
                    throw new C1572cp("socket 连接超时 - SocketTimeoutException");
                } catch (InterruptedIOException unused) {
                    throw new C1572cp("未知的错误");
                } catch (ConnectException e3) {
                    e = e3;
                    e.printStackTrace();
                    throw new C1572cp("http连接失败 - ConnectionException");
                } catch (MalformedURLException e4) {
                    e = e4;
                    e.printStackTrace();
                    throw new C1572cp("url异常 - MalformedURLException");
                } catch (SocketException e5) {
                    e = e5;
                    e.printStackTrace();
                    throw new C1572cp("socket 连接异常 - SocketException");
                } catch (UnknownHostException e6) {
                    e = e6;
                    e.printStackTrace();
                    throw new C1572cp("未知主机 - UnKnowHostException");
                } catch (IOException e7) {
                    e = e7;
                    e.printStackTrace();
                    throw new C1572cp("IO 操作异常 - IOException");
                } catch (Throwable th2) {
                    th = th2;
                    C1612dl.m17891a(th, "ht", "mPt");
                    throw new C1572cp("未知的错误");
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                        throw th3;
                    } catch (Throwable th4) {
                        C1612dl.m17891a(th4, "ht", "mPt");
                        throw th3;
                    }
                }
                throw th3;
            }
        } catch (C1572cp e8) {
            e = e8;
        } catch (ConnectException e9) {
            e = e9;
        } catch (MalformedURLException e10) {
            e = e10;
        } catch (SocketException e11) {
            e = e11;
        } catch (SocketTimeoutException e12) {
            e = e12;
        } catch (InterruptedIOException unused2) {
        } catch (UnknownHostException e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
