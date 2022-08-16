package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import android.util.Base64InputStream;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0579c;
import anet.channel.util.ALog;
import anet.channel.util.C0590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p003X.C116971W2r;

/* renamed from: anet.channel.strategy.dispatch.b */
/* loaded from: classes2.dex */
public class C0557b {

    /* renamed from: a */
    public static AtomicInteger f20752a = new AtomicInteger(0);

    /* renamed from: b */
    public static HostnameVerifier f20753b = new C0558c();

    /* renamed from: c */
    public static Random f20754c = new Random();

    /* renamed from: a */
    public static void m20820a(Map map) {
        String m20823a;
        IConnStrategy iConnStrategy;
        if (map == null) {
            return;
        }
        String schemeByHost = AmdcRuntimeInfo.isForceHttps() ? "https" : StrategyCenter.getInstance().getSchemeByHost(DispatchConstants.getAmdcServerDomain(), "http");
        List<IConnStrategy> m20825a = m20825a(schemeByHost);
        int i = 0;
        do {
            HashMap hashMap = new HashMap(map);
            if (i != 2) {
                if (!m20825a.isEmpty()) {
                    iConnStrategy = m20825a.remove(0);
                    if (iConnStrategy != null) {
                        m20823a = m20823a(schemeByHost, iConnStrategy.getIp(), iConnStrategy.getPort(), hashMap, i);
                    }
                } else {
                    iConnStrategy = null;
                }
                m20823a = m20823a(schemeByHost, (String) null, 0, hashMap, i);
            } else {
                String[] amdcServerFixIp = DispatchConstants.getAmdcServerFixIp();
                m20823a = (amdcServerFixIp == null || amdcServerFixIp.length <= 0) ? m20823a(schemeByHost, (String) null, 0, hashMap, i) : m20823a(schemeByHost, amdcServerFixIp[f20754c.nextInt(amdcServerFixIp.length)], 0, hashMap, i);
                iConnStrategy = null;
            }
            int m20821a = m20821a(m20823a, hashMap, i);
            if (iConnStrategy != null) {
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = m20821a == 0;
                StrategyCenter.getInstance().notifyConnEvent(DispatchConstants.getAmdcServerDomain(), iConnStrategy, connEvent);
            }
            if (m20821a == 0 || m20821a == 2) {
                return;
            }
            i++;
        } while (i < 3);
    }

    static {
        Covode.recordClassIndex(2325);
    }

    /* renamed from: a */
    public static List<IConnStrategy> m20825a(String str) {
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        if (!NetworkStatusHelper.isProxy()) {
            list = StrategyCenter.getInstance().getConnStrategyListByHost(DispatchConstants.getAmdcServerDomain());
            ListIterator<IConnStrategy> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (!listIterator.next().getProtocol().protocol.equalsIgnoreCase(str)) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    public static String m20826a(InputStream inputStream, boolean z) {
        IOException e;
        FilterInputStream base64InputStream;
        MethodCollector.m14708i(82);
        FilterInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
        try {
            if (z) {
                try {
                    bufferedInputStream = new GZIPInputStream(bufferedInputStream);
                } catch (IOException e2) {
                    e = e2;
                    ALog.m20787e("awcn.DispatchCore", "", null, e, new Object[0]);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    MethodCollector.m14707o(82);
                    return null;
                }
            }
            base64InputStream = new Base64InputStream(bufferedInputStream, 0);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
            while (true) {
                int read = base64InputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            try {
                base64InputStream.close();
            } catch (IOException unused2) {
            }
            MethodCollector.m14707o(82);
            return str;
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = base64InputStream;
            ALog.m20787e("awcn.DispatchCore", "", null, e, new Object[0]);
            bufferedInputStream.close();
            MethodCollector.m14707o(82);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = base64InputStream;
            try {
                bufferedInputStream.close();
            } catch (IOException unused3) {
            }
            MethodCollector.m14707o(82);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m20824a(String str, long j, long j2) {
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = "amdc";
            flowStat.protocoltype = "http";
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e) {
            ALog.m20787e("awcn.DispatchCore", "commit flow info failed!", null, e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static int m20821a(String str, Map map, int i) {
        HttpURLConnection httpURLConnection;
        URL url;
        byte[] bytes;
        String str2;
        MethodCollector.m14708i(81);
        String str3 = "AMDC" + String.valueOf(f20752a.incrementAndGet());
        int i2 = 2;
        ALog.m20785i("awcn.DispatchCore", "send amdc request", str3, PushConstants.WEB_URL, str, "\nhost", map.get("domain").toString());
        Object remove = map.remove("Env");
        try {
            url = new URL(str);
            try {
                httpURLConnection = (HttpURLConnection) C116971W2r.LIZ(url);
                try {
                    httpURLConnection.setConnectTimeout(20000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    C116971W2r.LIZIZ(httpURLConnection, "Connection", "close");
                    C116971W2r.LIZIZ(httpURLConnection, "Accept-Encoding", "gzip");
                    C116971W2r.LIZIZ(httpURLConnection, "Host", DispatchConstants.getAmdcServerDomain());
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (url.getProtocol().equals("https")) {
                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(f20753b);
                    }
                    if (ALog.isPrintLog(1)) {
                        ALog.m20788d("awcn.DispatchCore", "amdc request.", str3, "headers", httpURLConnection.getRequestProperties().toString());
                    }
                    httpURLConnection.getOutputStream().write(C0579c.m20794a(map, "utf-8").getBytes());
                    int LIZ = C116971W2r.LIZ(httpURLConnection);
                    if (ALog.isPrintLog(1)) {
                        ALog.m20788d("awcn.DispatchCore", "amdc response. code: " + LIZ, str3, "\nheaders", httpURLConnection.getHeaderFields());
                    }
                    if (LIZ != 200) {
                        if (LIZ != 302 && LIZ != 307) {
                            i2 = 1;
                        }
                        m20822a(String.valueOf(LIZ), "response code not 200", url, i, i2);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e) {
                            ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e, new Object[0]);
                        }
                        MethodCollector.m14707o(81);
                        return i2;
                    }
                    String headerField = httpURLConnection.getHeaderField("x-am-code");
                    if (!"1000".equals(headerField)) {
                        if (!"1007".equals(headerField) && !"1008".equals(headerField)) {
                            i2 = 1;
                        }
                        m20822a(headerField, "return code: " + headerField, url, i, i2);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e2) {
                            ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e2, new Object[0]);
                        }
                        MethodCollector.m14707o(81);
                        return i2;
                    }
                    String headerField2 = httpURLConnection.getHeaderField("x-am-sign");
                    if (TextUtils.isEmpty(headerField2)) {
                        m20822a("-1001", "response sign is empty", url, i, 1);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e3) {
                            ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e3, new Object[0]);
                        }
                        MethodCollector.m14707o(81);
                        return 1;
                    }
                    String m20826a = m20826a(C116971W2r.LIZJ(httpURLConnection), "gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding()));
                    if (ALog.isPrintLog(1)) {
                        ALog.m20788d("awcn.DispatchCore", "amdc response body", str3, "\nbody", m20826a);
                    }
                    try {
                        m20824a(str, bytes.length, httpURLConnection.getContentLength());
                        if (TextUtils.isEmpty(m20826a)) {
                            m20822a("-1002", "read answer error", url, i, 1);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e4) {
                                ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e4, new Object[0]);
                            }
                            MethodCollector.m14707o(81);
                            return 1;
                        }
                        try {
                            IAmdcSign sign = AmdcRuntimeInfo.getSign();
                            if (sign != null) {
                                str2 = sign.sign(m20826a);
                            } else {
                                str2 = null;
                            }
                            if (!str2.equalsIgnoreCase(headerField2)) {
                                ALog.m20786e("awcn.DispatchCore", "check ret sign failed", str3, "retSign", headerField2, "checkSign", str2);
                                m20822a("-1003", "check sign failed", url, i, 1);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e5) {
                                    ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e5, new Object[0]);
                                }
                                MethodCollector.m14707o(81);
                                return 1;
                            }
                            try {
                                JSONObject jSONObject = (JSONObject) new JSONTokener(m20826a).nextValue();
                                if (GlobalAppRuntimeInfo.getEnv() != remove) {
                                    ALog.m20783w("awcn.DispatchCore", "env change, do not notify result", str3, new Object[0]);
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e6) {
                                        ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e6, new Object[0]);
                                    }
                                    MethodCollector.m14707o(81);
                                    return 0;
                                }
                                HttpDispatcher.getInstance().m20830a(new DispatchEvent(1, jSONObject));
                                m20822a(headerField, "request success", url, i, 0);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e7) {
                                    ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e7, new Object[0]);
                                }
                                MethodCollector.m14707o(81);
                                return 0;
                            } catch (JSONException unused) {
                                HttpDispatcher.getInstance().m20830a(new DispatchEvent(0, null));
                                ALog.m20786e("awcn.DispatchCore", "resolve amdc anser failed", str3, new Object[0]);
                                m20822a("-1004", "resolve answer failed", url, i, 1);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e8) {
                                    ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e8, new Object[0]);
                                }
                                MethodCollector.m14707o(81);
                                return 1;
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                String message = th.getMessage();
                                if (TextUtils.isEmpty(message)) {
                                    message = th.toString();
                                }
                                m20822a("-1000", message, url, i, 1);
                                ALog.m20787e("awcn.DispatchCore", "amdc request fail", str3, th, new Object[0]);
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e9) {
                                        ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e9, new Object[0]);
                                    }
                                }
                                MethodCollector.m14707o(81);
                                return 1;
                            } catch (Throwable th2) {
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e10) {
                                        ALog.m20787e("awcn.DispatchCore", "http disconnect failed", null, e10, new Object[0]);
                                    }
                                }
                                MethodCollector.m14707o(81);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = null;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            url = null;
        }
    }

    /* renamed from: a */
    public static String m20823a(String str, String str2, int i, Map<String, String> map, int i2) {
        StringBuilder sb = new StringBuilder(64);
        if (!AmdcRuntimeInfo.isForceHttps() && i2 == 2 && "https".equalsIgnoreCase(str) && f20754c.nextBoolean()) {
            str = "http";
        }
        sb.append(str);
        sb.append("://");
        if (str2 != null) {
            if (C0590c.m20775a() && C0579c.m20795a(str2)) {
                try {
                    str2 = C0590c.m20773a(str2);
                } catch (Exception unused) {
                }
            }
            if (C0579c.m20793b(str2)) {
                sb.append(LoggerUtil.M_LEFT_TAG);
                sb.append(str2);
                sb.append(LoggerUtil.M_RIGHT_TAG);
            } else {
                sb.append(str2);
            }
            if (i == 0) {
                if ("https".equalsIgnoreCase(str)) {
                    i = 443;
                } else {
                    i = 80;
                }
            }
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(i);
        } else {
            sb.append(DispatchConstants.getAmdcServerDomain());
        }
        sb.append("/amdc/mobileDispatch");
        TreeMap treeMap = new TreeMap();
        treeMap.put("appkey", map.remove("appkey"));
        treeMap.put("v", map.remove("v"));
        treeMap.put("platform", map.remove("platform"));
        sb.append('?');
        sb.append(C0579c.m20794a(treeMap, "utf-8"));
        return sb.toString();
    }

    /* renamed from: a */
    public static void m20822a(String str, String str2, URL url, int i, int i2) {
        if ((i2 != 1 || i == 2) && GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                AmdcStatistic amdcStatistic = new AmdcStatistic();
                amdcStatistic.errorCode = str;
                amdcStatistic.errorMsg = str2;
                if (url != null) {
                    amdcStatistic.host = url.getHost();
                    amdcStatistic.url = url.toString();
                }
                amdcStatistic.retryTimes = i;
                AppMonitor.getInstance().commitStat(amdcStatistic);
            } catch (Exception unused) {
            }
        }
    }
}
