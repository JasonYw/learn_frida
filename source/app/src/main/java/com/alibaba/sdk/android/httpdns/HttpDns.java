package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.net64.C1084a;
import com.alibaba.sdk.android.httpdns.p070a.C1030a;
import com.alibaba.sdk.android.httpdns.p071b.C1035b;
import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.alibaba.sdk.android.httpdns.p073d.C1066c;
import com.alibaba.sdk.android.httpdns.p074e.C1068a;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.utils.AMSConfigUtils;
import com.alibaba.sdk.android.utils.AMSDevReporter;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class HttpDns implements HttpDnsService {
    public boolean isExpiredIPEnabled;
    public static C1046d hostManager = C1046d.m19936a();
    public static DegradationFilter degradationFilter = null;
    public static HttpDns instance = null;
    public static boolean inited = false;
    public static String sAccountId = null;
    public static String sSecretKey = null;
    public static Context sContext = null;

    static {
        Covode.recordClassIndex(4429);
    }

    public HttpDns(Context context, String str) {
        C1071f.m19886c(str);
        C1030a.m19992a().m19987c(context, str);
        C1030a.m19992a().m19989a(C1051b.m19920a(context));
    }

    public static void disableReport() {
        C1051b.m19921a().m19904k();
    }

    public static String getAccountId() {
        if (!TextUtils.isEmpty(sAccountId)) {
            return sAccountId;
        }
        String accountId = AMSConfigUtils.getAccountId(sContext);
        sAccountId = accountId;
        return accountId;
    }

    private String getIpByHost(String str) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
            return null;
        }
        String[] ipsByHost = getIpsByHost(str);
        if (ipsByHost == null || ipsByHost.length <= 0) {
            return null;
        }
        return ipsByHost[0];
    }

    private String[] getIpsByHost(String str) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else if (!C1078l.m19876b(str)) {
            return C1071f.f21608c;
        } else {
            if (C1078l.m19875c(str)) {
                return new String[]{str};
            }
            DegradationFilter degradationFilter2 = degradationFilter;
            if (degradationFilter2 != null && degradationFilter2.shouldDegradeHttpDNS(str)) {
                return C1071f.f21608c;
            }
            if (C1104u.m19810e()) {
                return getIpsByHostAsync(str);
            }
            C1067e m19930a = hostManager.m19930a(str);
            if (m19930a != null && m19930a.m19893b() && this.isExpiredIPEnabled) {
                if (!hostManager.m19927a(str)) {
                    C1074i.m19882d(C0002O.m25086C("refresh host async: ", str));
                    C1041c.m19946a().submit(new CallableC1100q(str, EnumC1102s.QUERY_HOST));
                }
                return m19930a.getIps();
            } else if (m19930a != null && !m19930a.m19893b()) {
                return m19930a.getIps();
            } else {
                C1074i.m19882d(C0002O.m25086C("refresh host sync: ", str));
                try {
                    return (String[]) C1041c.m19946a().submit(new CallableC1100q(str, EnumC1102s.QUERY_HOST)).get();
                } catch (Exception e) {
                    C1074i.m19884a(e);
                }
            }
        }
        return C1071f.f21608c;
    }

    public static String getSecretKey() {
        if (!TextUtils.isEmpty(sSecretKey)) {
            return sSecretKey;
        }
        String httpdnsSecretKey = AMSConfigUtils.getHttpdnsSecretKey(sContext);
        sSecretKey = httpdnsSecretKey;
        return httpdnsSecretKey;
    }

    public static synchronized HttpDnsService getService(Context context) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                Context applicationContext = context.getApplicationContext();
                sContext = applicationContext;
                C1033b.m19981a(applicationContext);
                C1051b.m19920a(sContext).m19918a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.3
                    static {
                        Covode.recordClassIndex(4432);
                    }

                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public final void crashDefendMessage(int i, int i2) {
                        HttpDns.inited = true;
                        if (i > i2) {
                            C1033b.m19979b(true);
                            return;
                        }
                        C1074i.m19880f("crash limit exceeds, httpdns disabled");
                        C1033b.m19979b(false);
                    }
                });
                if (!inited) {
                    C1074i.m19880f("sdk crash defend not returned");
                }
                if (C1033b.m19982a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    public static synchronized HttpDnsService getService(Context context, String str) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                sContext = context.getApplicationContext();
                setAccountId(str);
                C1033b.m19981a(sContext);
                C1051b.m19920a(sContext).m19918a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.1
                    static {
                        Covode.recordClassIndex(4430);
                    }

                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public final void crashDefendMessage(int i, int i2) {
                        HttpDns.inited = true;
                        if (i > i2) {
                            C1033b.m19979b(true);
                            return;
                        }
                        C1074i.m19880f("crash limit exceeds, httpdns disabled");
                        C1033b.m19979b(false);
                    }
                });
                if (!inited) {
                    C1074i.m19880f("sdk crash defend not returned");
                }
                if (C1033b.m19982a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    public static synchronized HttpDnsService getService(Context context, String str, String str2) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                sContext = context.getApplicationContext();
                setAccountId(str);
                setSecretKey(str2);
                C1033b.m19981a(sContext);
                C1051b.m19920a(sContext).m19918a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.2
                    static {
                        Covode.recordClassIndex(4431);
                    }

                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public final void crashDefendMessage(int i, int i2) {
                        HttpDns.inited = true;
                        if (i > i2) {
                            C1033b.m19979b(true);
                            return;
                        }
                        C1074i.m19880f("crash limit exceeds, httpdns disabled");
                        C1033b.m19979b(false);
                    }
                });
                if (!inited) {
                    C1074i.m19880f("sdk crash defend not returned");
                }
                if (C1033b.m19982a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    public static void initHttpDns(Context context, String str, String str2) {
        if (instance == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(AMSDevReporter.AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString(), "1.3.2.3-no-bssid");
            AMSDevReporter.asyncReport(context, AMSDevReporter.AMSSdkTypeEnum.AMS_HTTPDNS, hashMap);
            C1089p.setContext(context);
            CallableC1100q.setContext(context);
            C1035b.m19976a(context);
            C1035b.m19972b(context);
            C1104u.m19819a(context);
            C1082n.m19871a().m19870a(context, str);
            if (!TextUtils.isEmpty(str2)) {
                C1029a.setSecretKey(str2);
            }
            reportActive(context, str);
            instance = new HttpDns(context, str);
        }
    }

    public static void reportActive(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            C1074i.m19880f("report active failed due to missing context or accountid");
            return;
        }
        C1051b.m19920a(context).setAccountId(str);
        C1051b.m19920a(context).m19902l();
    }

    public static void reportHttpDnsSuccess(String str, int i) {
        C1051b m19921a = C1051b.m19921a();
        if (m19921a != null) {
            m19921a.m19917a(str, i, C1066c.m19901a(), C1035b.m19977a() ? 1 : 0);
        }
    }

    public static void reportUserGetIP(String str, int i) {
        C1051b m19921a = C1051b.m19921a();
        if (m19921a != null) {
            m19921a.m19911b(str, i, C1066c.m19901a(), C1035b.m19977a() ? 1 : 0);
        }
    }

    public static void setAccountId(String str) {
        sAccountId = str;
    }

    public static void setSecretKey(String str) {
        sSecretKey = str;
    }

    public static synchronized void switchDnsService(boolean z) {
        synchronized (HttpDns.class) {
            C1033b.m19980a(z);
            if (!C1033b.m19982a()) {
                C1074i.m19880f("httpdns service disabled");
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void clearSdnsGlobalParams() {
        C1071f.clearSdnsGlobalParams();
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z) {
        C1084a.m19856a().enableIPv6(z);
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            m19921a.m19906e(z ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
            return null;
        }
        if (C1084a.m19856a().m19855a()) {
            getIpsByHostAsync(str);
            C1067e m19930a = hostManager.m19930a(str);
            if (m19930a != null) {
                String iPv6ByHostAsync = C1084a.m19856a().getIPv6ByHostAsync(str);
                if (this.isExpiredIPEnabled) {
                    C1074i.m19882d(C0002O.m25084C("ipv6 is expired enable, hostName: ", str, " ipv6: ", iPv6ByHostAsync));
                    return iPv6ByHostAsync;
                } else if (!m19930a.m19893b()) {
                    C1074i.m19882d(C0002O.m25084C("ipv6 is not expired, hostName: ", str, " ipv6: ", iPv6ByHostAsync));
                    return iPv6ByHostAsync;
                } else if (m19930a.m19892c()) {
                    C1074i.m19882d(C0002O.m25084C("ipv6 is from cache, hostName: ", str, " ipv6: ", iPv6ByHostAsync));
                    return iPv6ByHostAsync;
                } else {
                    C1074i.m19882d("ipv6 is expired.");
                    return null;
                }
            }
        }
        return null;
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getIpByHostAsync(String str) {
        try {
            if (!C1033b.m19982a()) {
                C1074i.m19880f("HttpDns service turned off");
                return null;
            }
            String[] ipsByHostAsync = getIpsByHostAsync(str);
            if (ipsByHostAsync == null || ipsByHostAsync.length <= 0) {
                return null;
            }
            return ipsByHostAsync[0];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (r6 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        reportUserGetIP(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, com.alibaba.sdk.android.httpdns.C1071f.f21608c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
        if (com.alibaba.sdk.android.httpdns.C1104u.m19810e() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d("[HttpDns] disabled return Nil.");
        reportUserGetIP(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, com.alibaba.sdk.android.httpdns.C1071f.f21608c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        if (r10.equals(r6.getCacheKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, com.alibaba.sdk.android.httpdns.C1071f.f21608c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r7.isExpiredIPEnabled == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
        reportHttpDnsSuccess(r8, 1);
        reportUserGetIP(r8, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, r6.getIps(), r6.m19895a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
        if (r6.m19892c() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d(p002O.C0002O.m25086C("[HttpDns] ips from cache:", java.util.Arrays.toString(r6.getIps())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, r6.getIps(), r6.m19895a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
        if (r5 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d(p002O.C0002O.m25086C("[HttpDns] not expired return ", java.util.Arrays.toString(r6.getIps())));
        reportHttpDnsSuccess(r8, 1);
        reportUserGetIP(r8, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, r6.getIps(), r6.m19895a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19880f("[HttpDns] return Nil.");
        reportUserGetIP(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
        return new com.alibaba.sdk.android.httpdns.HTTPDNSResult(r8, com.alibaba.sdk.android.httpdns.C1071f.f21608c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0094, code lost:
        if (r10.equals(r6.getCacheKey()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        if (com.alibaba.sdk.android.httpdns.C1104u.m19810e() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d(p002O.C0002O.m25086C("refresh host async: ", r8));
        r4 = new com.alibaba.sdk.android.httpdns.CallableC1100q(r8, com.alibaba.sdk.android.httpdns.EnumC1102s.QUERY_HOST, r2, r10);
     */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.sdk.android.httpdns.HTTPDNSResult getIpsByHostAsync(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.HttpDns.getIpsByHostAsync(java.lang.String, java.util.Map, java.lang.String):com.alibaba.sdk.android.httpdns.HTTPDNSResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r4 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (r5 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        reportUserGetIP(r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        return com.alibaba.sdk.android.httpdns.C1071f.f21608c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (com.alibaba.sdk.android.httpdns.C1104u.m19810e() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d("[HttpDns] disabled return Nil.");
        reportUserGetIP(r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
        return com.alibaba.sdk.android.httpdns.C1071f.f21608c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r5.getCacheKey() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
        return com.alibaba.sdk.android.httpdns.C1071f.f21608c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (r6.isExpiredIPEnabled == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        reportHttpDnsSuccess(r7, 1);
        reportUserGetIP(r7, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        return r5.getIps();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r5.m19892c() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d(p002O.C0002O.m25086C("[HttpDns] ips from cache:", java.util.Arrays.toString(r5.getIps())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        return r5.getIps();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d(p002O.C0002O.m25086C("[HttpDns] not expired return ", java.util.Arrays.toString(r5.getIps())));
        reportHttpDnsSuccess(r7, 1);
        reportUserGetIP(r7, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
        return r5.getIps();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19880f("[HttpDns] return Nil.");
        reportUserGetIP(r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
        return com.alibaba.sdk.android.httpdns.C1071f.f21608c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006c, code lost:
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0072, code lost:
        if (r5.getCacheKey() == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0078, code lost:
        if (com.alibaba.sdk.android.httpdns.C1104u.m19810e() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007a, code lost:
        com.alibaba.sdk.android.httpdns.C1074i.m19882d(p002O.C0002O.m25086C("refresh host async: ", r7));
        r1 = new com.alibaba.sdk.android.httpdns.CallableC1100q(r7, com.alibaba.sdk.android.httpdns.EnumC1102s.QUERY_HOST);
     */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] getIpsByHostAsync(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.HttpDns.getIpsByHostAsync(java.lang.String):java.lang.String[]");
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getSessionId() {
        return C1068a.m19891a().getSessionId();
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setAuthCurrentTime(long j) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else {
            C1029a.setAuthCurrentTime(j);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z) {
        setCachedIPEnabled(z, true);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z, boolean z2) {
        try {
            if (!C1033b.m19982a()) {
                C1074i.m19880f("HttpDns service turned off");
                return;
            }
            C1074i.m19880f("Httpdns DB cache enable = " + z + ". autoCleanCacheAfterLoad = " + z2);
            C1035b.m19973a(z, z2);
            C1046d.m19936a().m19933a();
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            m19921a.m19908c(z ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setDegradationFilter(DegradationFilter degradationFilter2) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else {
            degradationFilter = degradationFilter2;
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setExpiredIPEnabled(boolean z) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
            return;
        }
        this.isExpiredIPEnabled = z;
        C1051b m19921a = C1051b.m19921a();
        if (m19921a == null) {
            return;
        }
        m19921a.m19907d(z ? 1 : 0);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setHTTPSRequestEnabled(boolean z) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else {
            C1071f.setHTTPSRequestEnabled(z);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setIPProbeList(List<IPProbeItem> list) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else {
            C1071f.m19888a(list);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogEnabled(boolean z) {
        C1074i.setLogEnabled(z);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogger(ILogger iLogger) {
        C1074i.setLogger(iLogger);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveAfterNetworkChanged(boolean z) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else {
            C1089p.f21650i = z;
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (C1078l.m19876b(str) && !hostManager.m19927a(str)) {
                C1041c.m19946a().submit(new CallableC1100q(str, EnumC1102s.QUERY_HOST));
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setRegion(String str) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else if (TextUtils.isEmpty(str)) {
            C1074i.m19880f("region cannot be empty");
        } else {
            C1082n.m19871a().m19865b(sContext, str);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setSdnsGlobalParams(Map<String, String> map) {
        C1071f.setSdnsGlobalParams(map);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setTimeoutInterval(int i) {
        if (!C1033b.m19982a()) {
            C1074i.m19880f("HttpDns service turned off");
        } else {
            C1071f.setTimeoutInterval(i);
        }
    }
}
