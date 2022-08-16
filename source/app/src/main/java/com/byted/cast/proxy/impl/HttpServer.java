package com.byted.cast.proxy.impl;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.byted.cast.proxy.CastProxyType;
import com.byted.cast.proxy.Event;
import com.byted.cast.proxy.ILogger;
import com.byted.cast.proxy.IMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.nanohttpd.protocols.http.NanoHTTPD;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes8.dex */
public class HttpServer extends NanoHTTPD {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public Context context;
    public String domain = "castproxy.video.bytedance.com";
    public boolean enableDebug = true;
    public ILogger logger;
    public IMonitor monitor;
    public CastProxyType type;

    static {
        Covode.recordClassIndex(9777);
    }

    public String getProxy() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.enableDebug) {
            this.logger.onDebug("CastProxy", C0002O.m25086C("domain:", this.domain));
        }
        return this.domain;
    }

    public void enableDebug(boolean z) {
        this.enableDebug = z;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCastProxyType(CastProxyType castProxyType) {
        this.type = castProxyType;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger;
    }

    public void setMonitor(IMonitor iMonitor) {
        this.monitor = iMonitor;
    }

    public void setProxy(String str) {
        this.domain = str;
    }

    private byte[] inputStreamToByteArray(InputStream inputStream) {
        MethodCollector.m14708i(842);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{inputStream}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            byte[] bArr = (byte[]) proxy.result;
            MethodCollector.m14707o(842);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
        while (true) {
            int read = inputStream.read(bArr2);
            if (read != -1) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                inputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.m14707o(842);
                return byteArray;
            }
        }
    }

    private boolean isLocalHost(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String str2 = null;
        try {
            str2 = new URI(str).getHost();
        } catch (URISyntaxException unused) {
            this.logger.onError("CastProxy", "URISyntaxException");
        }
        if ("localhost".equals(str2) || "127.0.0.1".equals(str2)) {
            return true;
        }
        return false;
    }

    private byte[] httpget(String str) {
        HttpURLConnection httpURLConnection;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (byte[]) proxy.result;
        }
        if (this.enableDebug) {
            this.logger.onDebug("CastProxy", C0002O.m25086C("request http ", str));
        }
        byte[] bArr = null;
        try {
            URL url = new URL(str);
            if (str.startsWith("https")) {
                httpURLConnection = (HttpsURLConnection) C116971W2r.LIZ(url);
            } else {
                httpURLConnection = (HttpURLConnection) C116971W2r.LIZ(url);
            }
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            C116971W2r.LIZ(httpURLConnection, "Connection", "close");
            if (C116971W2r.LIZ(httpURLConnection) == 200) {
                bArr = inputStreamToByteArray(C116971W2r.LIZJ(httpURLConnection));
                return bArr;
            }
        } catch (Exception e) {
            IMonitor iMonitor = this.monitor;
            if (iMonitor != null) {
                iMonitor.onException("request url : ", e);
            }
            if (this.enableDebug) {
                this.logger.onError("CastProxy", C0002O.m25086C("request http fail. ", e.getMessage()));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x03eb, code lost:
        if (r8.length == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x045a, code lost:
        if (r18.enableDebug == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0489, code lost:
        r1 = super.serve(r19);
        com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(843);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0492, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0484, code lost:
        r18.logger.onDebug("CastProxy", "before return in server");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0482, code lost:
        if (r18.enableDebug == false) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ea A[Catch: MalformedURLException -> 0x0435, UnsupportedEncodingException -> 0x045d, all -> 0x0493, TRY_ENTER, TryCatch #1 {MalformedURLException -> 0x0435, blocks: (B:13:0x005e, B:15:0x0064, B:21:0x007a, B:23:0x0080, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:34:0x00ab, B:36:0x00b1, B:39:0x00bd, B:44:0x00cd, B:45:0x011c, B:48:0x00f5, B:52:0x0148, B:54:0x014c, B:55:0x015f, B:57:0x0173, B:58:0x017f, B:61:0x0187, B:63:0x0190, B:65:0x01d0, B:66:0x01fb, B:68:0x0201, B:70:0x0205, B:71:0x020c, B:77:0x021f, B:79:0x0223, B:80:0x0237, B:82:0x0248, B:84:0x024e, B:86:0x0256, B:88:0x025f, B:92:0x0278, B:97:0x02f8, B:99:0x02fb, B:101:0x0316, B:102:0x031a, B:104:0x0335, B:105:0x033a, B:107:0x0345, B:108:0x0355, B:110:0x0359, B:111:0x03a4, B:113:0x03aa, B:120:0x03ce, B:121:0x03ea, B:123:0x03ed, B:125:0x03f1, B:126:0x03f8, B:128:0x03fc, B:129:0x028c, B:131:0x0298, B:133:0x02a1, B:134:0x02b4, B:135:0x02b9, B:137:0x02bf, B:140:0x02cb, B:141:0x02d5, B:143:0x02d9, B:148:0x040a, B:150:0x0412, B:151:0x0422), top: B:12:0x005e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fb A[Catch: MalformedURLException -> 0x0435, UnsupportedEncodingException -> 0x045d, all -> 0x0493, TryCatch #1 {MalformedURLException -> 0x0435, blocks: (B:13:0x005e, B:15:0x0064, B:21:0x007a, B:23:0x0080, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:34:0x00ab, B:36:0x00b1, B:39:0x00bd, B:44:0x00cd, B:45:0x011c, B:48:0x00f5, B:52:0x0148, B:54:0x014c, B:55:0x015f, B:57:0x0173, B:58:0x017f, B:61:0x0187, B:63:0x0190, B:65:0x01d0, B:66:0x01fb, B:68:0x0201, B:70:0x0205, B:71:0x020c, B:77:0x021f, B:79:0x0223, B:80:0x0237, B:82:0x0248, B:84:0x024e, B:86:0x0256, B:88:0x025f, B:92:0x0278, B:97:0x02f8, B:99:0x02fb, B:101:0x0316, B:102:0x031a, B:104:0x0335, B:105:0x033a, B:107:0x0345, B:108:0x0355, B:110:0x0359, B:111:0x03a4, B:113:0x03aa, B:120:0x03ce, B:121:0x03ea, B:123:0x03ed, B:125:0x03f1, B:126:0x03f8, B:128:0x03fc, B:129:0x028c, B:131:0x0298, B:133:0x02a1, B:134:0x02b4, B:135:0x02b9, B:137:0x02bf, B:140:0x02cb, B:141:0x02d5, B:143:0x02d9, B:148:0x040a, B:150:0x0412, B:151:0x0422), top: B:12:0x005e, outer: #0 }] */
    @Override // org.nanohttpd.protocols.http.NanoHTTPD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.nanohttpd.protocols.http.response.Response serve(org.nanohttpd.protocols.http.AbstractC35300c r19) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.proxy.impl.HttpServer.serve(org.nanohttpd.protocols.http.c):org.nanohttpd.protocols.http.response.Response");
    }

    public HttpServer(Context context, int i) {
        super(i);
        this.context = context;
    }

    private void dealErrMsg(long j, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        if (this.enableDebug) {
            this.logger.onError("CastProxy", str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        IMonitor iMonitor = this.monitor;
        if (iMonitor != null) {
            iMonitor.onEvent("ByteCast_CastProxy_Return_Data", new Event(this.context, this.appId, currentTimeMillis - j, false));
            this.monitor.onException("receive url : ", new Exception(str));
        }
    }
}
