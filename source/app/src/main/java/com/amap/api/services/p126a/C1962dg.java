package com.amap.api.services.p126a;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.amap.api.services.p126a.C1957dd;
import com.amap.api.services.p126a.C1960df;
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
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import p003X.C116971W2r;

/* renamed from: com.amap.api.services.a.dg */
/* loaded from: classes19.dex */
public class C1962dg {

    /* renamed from: a */
    public int f24733a;

    /* renamed from: b */
    public int f24734b;

    /* renamed from: c */
    public boolean f24735c;

    /* renamed from: d */
    public SSLContext f24736d;

    /* renamed from: e */
    public Proxy f24737e;

    /* renamed from: f */
    public volatile boolean f24738f;

    /* renamed from: g */
    public long f24739g;

    /* renamed from: h */
    public long f24740h;

    /* renamed from: i */
    public String f24741i;

    /* renamed from: j */
    public C1964a f24742j;

    /* renamed from: k */
    public C1957dd.AbstractC1958a f24743k;

    /* renamed from: com.amap.api.services.a.dg$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C19631 {
        static {
            Covode.recordClassIndex(5574);
        }
    }

    static {
        Covode.recordClassIndex(5573);
    }

    /* renamed from: com.amap.api.services.a.dg$a */
    /* loaded from: classes19.dex */
    public static class C1964a {

        /* renamed from: a */
        public Vector<C1965b> f24744a;

        /* renamed from: b */
        public volatile C1965b f24745b;

        static {
            Covode.recordClassIndex(5575);
        }

        /* renamed from: a */
        public C1965b m16469a() {
            return this.f24745b;
        }

        public C1964a() {
            this.f24744a = new Vector<>();
            this.f24745b = new C1965b(null);
        }

        public /* synthetic */ C1964a(C19631 c19631) {
            this();
        }

        /* renamed from: b */
        public void m16467b(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f24745b.m16465a(str);
        }

        /* renamed from: a */
        public C1965b m16468a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.f24745b;
            }
            for (int i = 0; i < this.f24744a.size(); i++) {
                C1965b c1965b = this.f24744a.get(i);
                if (c1965b != null && c1965b.m16466a().equals(str)) {
                    return c1965b;
                }
            }
            C1965b c1965b2 = new C1965b(null);
            c1965b2.m16464b(str);
            this.f24744a.add(c1965b2);
            return c1965b2;
        }
    }

    /* renamed from: com.amap.api.services.a.dg$b */
    /* loaded from: classes19.dex */
    public static class C1965b implements HostnameVerifier {

        /* renamed from: a */
        public String f24746a;

        /* renamed from: b */
        public String f24747b;

        static {
            Covode.recordClassIndex(5576);
        }

        public C1965b() {
        }

        /* renamed from: a */
        public String m16466a() {
            return this.f24747b;
        }

        /* renamed from: b */
        public void m16464b(String str) {
            this.f24747b = str;
        }

        public /* synthetic */ C1965b(C19631 c19631) {
            this();
        }

        /* renamed from: a */
        public void m16465a(String str) {
            this.f24746a = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (!TextUtils.isEmpty(this.f24746a)) {
                return this.f24746a.equals(str);
            }
            if (!TextUtils.isEmpty(this.f24747b)) {
                return defaultHostnameVerifier.verify(this.f24747b, sSLSession);
            }
            return defaultHostnameVerifier.verify(str, sSLSession);
        }
    }

    /* renamed from: a */
    public void m16477a(String str, boolean z, String str2, Map<String, String> map, Map<String, String> map2, byte[] bArr, C1960df.AbstractC1961a abstractC1961a) {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        int read;
        if (abstractC1961a == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            String m16472a = m16472a(map2);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            if (m16472a != null) {
                stringBuffer.append("?");
                stringBuffer.append(m16472a);
            }
            boolean z2 = true;
            boolean z3 = bArr != null && bArr.length > 0;
            httpURLConnection = m16476a(stringBuffer.toString(), z, str2, map, z3);
            try {
                C116971W2r.LIZ(httpURLConnection, "RANGE", "bytes=" + this.f24740h + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (z3) {
                    dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        dataOutputStream.write(bArr);
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            abstractC1961a.mo16485a(th);
                            if (0 != 0) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    C1901by.m16742a(e, "ht", "mdr");
                                } catch (Throwable th2) {
                                    C1901by.m16742a(th2, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th3) {
                                    C1901by.m16742a(th3, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream == null) {
                                return;
                            }
                            try {
                                dataOutputStream.close();
                                return;
                            } catch (Throwable th4) {
                                C1901by.m16742a(th4, "ht", "mdr");
                                return;
                            }
                        } catch (Throwable th5) {
                            if (0 != 0) {
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    C1901by.m16742a(e2, "ht", "mdr");
                                } catch (Throwable th6) {
                                    C1901by.m16742a(th6, "ht", "mdr");
                                }
                            }
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th7) {
                                    C1901by.m16742a(th7, "ht", "mdr");
                                }
                            }
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                    throw th5;
                                } catch (Throwable th8) {
                                    C1901by.m16742a(th8, "ht", "mdr");
                                    throw th5;
                                }
                            }
                            throw th5;
                        }
                    }
                } else {
                    dataOutputStream = null;
                }
                httpURLConnection.connect();
                String m16474a = m16474a(httpURLConnection);
                int LIZ = C116971W2r.LIZ(httpURLConnection);
                if (LIZ != 200) {
                    if (LIZ == 206) {
                        z2 = false;
                    }
                    if (true & z2) {
                        abstractC1961a.mo16485a(new C1863be("网络异常原因：" + httpURLConnection.getResponseMessage() + " 网络异常状态码：" + LIZ, m16474a, this.f24741i));
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable th9) {
                            C1901by.m16742a(th9, "ht", "mdr");
                        }
                        if (dataOutputStream == null) {
                            return;
                        }
                        try {
                            dataOutputStream.close();
                            return;
                        } catch (Throwable th10) {
                            C1901by.m16742a(th10, "ht", "mdr");
                            return;
                        }
                    }
                }
                InputStream LIZJ = C116971W2r.LIZJ(httpURLConnection);
                byte[] bArr2 = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
                while (!Thread.interrupted() && !this.f24738f && (read = LIZJ.read(bArr2, 0, AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END)) > 0 && (this.f24739g == -1 || this.f24740h < this.f24739g)) {
                    if (read == 1024) {
                        abstractC1961a.mo16484a(bArr2, this.f24740h);
                    } else {
                        byte[] bArr3 = new byte[read];
                        System.arraycopy(bArr2, 0, bArr3, 0, read);
                        abstractC1961a.mo16484a(bArr3, this.f24740h);
                    }
                    this.f24740h += read;
                }
                if (this.f24738f) {
                    abstractC1961a.mo16482e();
                } else {
                    abstractC1961a.mo16483d();
                }
                if (LIZJ != null) {
                    try {
                        LIZJ.close();
                    } catch (IOException e3) {
                        C1901by.m16742a(e3, "ht", "mdr");
                    } catch (Throwable th11) {
                        C1901by.m16742a(th11, "ht", "mdr");
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th12) {
                    C1901by.m16742a(th12, "ht", "mdr");
                }
                if (dataOutputStream == null) {
                    return;
                }
                try {
                    dataOutputStream.close();
                } catch (Throwable th13) {
                    C1901by.m16742a(th13, "ht", "mdr");
                }
            } catch (Throwable th14) {
                th = th14;
                dataOutputStream = null;
            }
        } catch (Throwable th15) {
            th = th15;
            httpURLConnection = null;
            dataOutputStream = null;
        }
    }

    /* renamed from: a */
    public C1971dk m16475a(String str, boolean z, String str2, Map<String, String> map, byte[] bArr, boolean z2) {
        HttpURLConnection m16476a;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                m16476a = m16476a(str, z, str2, map, true);
                if (bArr != null && bArr.length > 0) {
                    DataOutputStream dataOutputStream = new DataOutputStream(m16476a.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                        throw th;
                    } catch (Throwable th2) {
                        C1901by.m16742a(th2, "ht", "mPt");
                        throw th;
                    }
                }
                throw th;
            }
        } catch (C1863be e) {
            e = e;
        } catch (ConnectException e2) {
            e = e2;
        } catch (MalformedURLException e3) {
            e = e3;
        } catch (SocketException e4) {
            e = e4;
        } catch (SocketTimeoutException e5) {
            e = e5;
        } catch (InterruptedIOException unused) {
        } catch (UnknownHostException e6) {
            e = e6;
        } catch (IOException e7) {
            e = e7;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            C1971dk m16473a = m16473a(m16476a, z2);
            if (m16476a != null) {
                try {
                    m16476a.disconnect();
                    return m16473a;
                } catch (Throwable th4) {
                    C1901by.m16742a(th4, "ht", "mPt");
                }
            }
            return m16473a;
        } catch (C1863be e8) {
            e = e8;
            C1901by.m16742a(e, "ht", "mPt");
            throw e;
        } catch (InterruptedIOException unused2) {
            throw new C1863be("未知的错误");
        } catch (ConnectException e9) {
            e = e9;
            e.printStackTrace();
            throw new C1863be("http连接失败 - ConnectionException");
        } catch (MalformedURLException e10) {
            e = e10;
            e.printStackTrace();
            throw new C1863be("url异常 - MalformedURLException");
        } catch (SocketException e11) {
            e = e11;
            e.printStackTrace();
            throw new C1863be("socket 连接异常 - SocketException");
        } catch (SocketTimeoutException e12) {
            e = e12;
            e.printStackTrace();
            throw new C1863be("socket 连接超时 - SocketTimeoutException");
        } catch (UnknownHostException e13) {
            e = e13;
            e.printStackTrace();
            throw new C1863be("未知主机 - UnKnowHostException");
        } catch (IOException e14) {
            e = e14;
            e.printStackTrace();
            throw new C1863be("IO 操作异常 - IOException");
        } catch (Throwable th5) {
            th = th5;
            C1901by.m16742a(th, "ht", "mPt");
            throw new C1863be("未知的错误");
        }
    }

    /* renamed from: a */
    public HttpURLConnection m16476a(String str, boolean z, String str2, Map<String, String> map, boolean z2) {
        URLConnection LIZ;
        HttpsURLConnection httpsURLConnection;
        C1878bj.m16907b();
        if (map == null) {
            map = new HashMap<>();
        }
        C1965b m16469a = this.f24742j.m16469a();
        if (z && !TextUtils.isEmpty(str2)) {
            m16469a = this.f24742j.m16468a(str2);
        }
        String m16480a = m16480a(C1957dd.f24726a, str, map);
        if (this.f24735c) {
            m16480a = C1883bl.m16852a(m16480a);
        }
        URL url = new URL(m16480a);
        C1957dd.AbstractC1958a abstractC1958a = this.f24743k;
        if (abstractC1958a == null || (LIZ = abstractC1958a.m16499a(this.f24737e, url)) == null) {
            Proxy proxy = this.f24737e;
            if (proxy != null) {
                LIZ = url.openConnection(proxy);
            } else {
                LIZ = C116971W2r.LIZ(url);
            }
        }
        if (this.f24735c) {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) LIZ;
            httpsURLConnection2.setSSLSocketFactory(this.f24736d.getSocketFactory());
            httpsURLConnection2.setHostnameVerifier(m16469a);
            httpsURLConnection = httpsURLConnection2;
        } else {
            httpsURLConnection = (HttpURLConnection) LIZ;
        }
        if (Build.VERSION.SDK != null) {
            int i = Build.VERSION.SDK_INT;
            C116971W2r.LIZ(httpsURLConnection, "Connection", "close");
        }
        m16471a(map, httpsURLConnection);
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
    private void m16481a() {
        try {
            this.f24741i = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase();
        } catch (Throwable th) {
            C1901by.m16742a(th, "ht", "ic");
        }
    }

    /* renamed from: a */
    public void m16479a(long j) {
        this.f24740h = j;
    }

    /* renamed from: b */
    public void m16470b(long j) {
        this.f24739g = j;
    }

    /* renamed from: a */
    private String m16474a(HttpURLConnection httpURLConnection) {
        List<String> list;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null && (list = headerFields.get("gsid")) != null && list.size() > 0) {
                return list.get(0);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static String m16472a(Map<String, String> map) {
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

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.zip.GZIPInputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.amap.api.services.p126a.C1971dk m16473a(java.net.HttpURLConnection r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1962dg.m16473a(java.net.HttpURLConnection, boolean):com.amap.api.services.a.dk");
    }

    /* renamed from: a */
    private void m16471a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                C116971W2r.LIZIZ(httpURLConnection, str, map.get(str));
            }
        }
        try {
            C116971W2r.LIZIZ(httpURLConnection, "csid", this.f24741i);
        } catch (Throwable th) {
            C1901by.m16742a(th, "ht", "adh");
        }
        httpURLConnection.setConnectTimeout(this.f24733a);
        httpURLConnection.setReadTimeout(this.f24734b);
    }

    /* renamed from: a */
    private String m16480a(int i, String str, Map<String, String> map) {
        String str2;
        if (i != 1) {
            str2 = "";
        } else {
            str2 = C1957dd.f24727b;
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
        if (this.f24735c) {
            this.f24742j.m16467b(str2);
        }
        return uri;
    }

    public C1962dg(int i, int i2, Proxy proxy, boolean z) {
        this(i, i2, proxy, z, null);
    }

    public C1962dg(int i, int i2, Proxy proxy, boolean z, C1957dd.AbstractC1958a abstractC1958a) {
        this.f24739g = -1L;
        this.f24733a = i;
        this.f24734b = i2;
        this.f24737e = proxy;
        this.f24735c = C1883bl.m16855a().m16847b(z);
        if (C1883bl.m16846c()) {
            this.f24735c = false;
        }
        this.f24743k = abstractC1958a;
        m16481a();
        if (this.f24735c) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.f24736d = sSLContext;
            } catch (Throwable th) {
                C1901by.m16742a(th, "ht", "ne");
            }
        }
        this.f24742j = new C1964a(null);
    }

    /* renamed from: a */
    public C1971dk m16478a(String str, boolean z, String str2, Map<String, String> map, Map<String, String> map2, boolean z2) {
        HttpURLConnection m16476a;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                String m16472a = m16472a(map2);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                if (m16472a != null) {
                    stringBuffer.append("?");
                    stringBuffer.append(m16472a);
                }
                m16476a = m16476a(stringBuffer.toString(), z, str2, map, false);
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                        throw th;
                    } catch (Throwable th2) {
                        C1901by.m16742a(th2, "ht", "mgr");
                        throw th;
                    }
                }
                throw th;
            }
        } catch (C1863be e) {
            throw e;
        } catch (InterruptedIOException unused) {
        } catch (ConnectException unused2) {
        } catch (MalformedURLException unused3) {
        } catch (SocketException unused4) {
        } catch (SocketTimeoutException unused5) {
        } catch (UnknownHostException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable unused8) {
        }
        try {
            C1971dk m16473a = m16473a(m16476a, z2);
            if (m16476a != null) {
                try {
                    m16476a.disconnect();
                    return m16473a;
                } catch (Throwable th3) {
                    C1901by.m16742a(th3, "ht", "mgr");
                }
            }
            return m16473a;
        } catch (C1863be e2) {
            throw e2;
        } catch (InterruptedIOException unused9) {
            throw new C1863be("未知的错误");
        } catch (ConnectException unused10) {
            throw new C1863be("http连接失败 - ConnectionException");
        } catch (MalformedURLException unused11) {
            throw new C1863be("url异常 - MalformedURLException");
        } catch (SocketException unused12) {
            throw new C1863be("socket 连接异常 - SocketException");
        } catch (SocketTimeoutException unused13) {
            throw new C1863be("socket 连接超时 - SocketTimeoutException");
        } catch (UnknownHostException unused14) {
            throw new C1863be("未知主机 - UnKnowHostException");
        } catch (IOException unused15) {
            throw new C1863be("IO 操作异常 - IOException");
        } catch (Throwable unused16) {
            throw new C1863be("未知的错误");
        }
    }
}
