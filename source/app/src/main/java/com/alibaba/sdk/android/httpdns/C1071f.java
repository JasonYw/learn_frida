package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.alibaba.sdk.android.httpdns.f */
/* loaded from: classes19.dex */
public class C1071f {

    /* renamed from: c */
    public static String f21607c;

    /* renamed from: a */
    public static String[] f21605a = {"203.107.1.1"};

    /* renamed from: b */
    public static final String[] f21606b = {"203.107.1.97", "203.107.1.100", "httpdns-sc.aliyuncs.com"};

    /* renamed from: c */
    public static final String[] f21608c = new String[0];

    /* renamed from: d */
    public static String f21609d = "80";
    public static String PROTOCOL = "http://";

    /* renamed from: a */
    public static int f21603a = 15000;
    public static Map<String, String> extra = new HashMap();

    /* renamed from: a */
    public static List<IPProbeItem> f21604a = null;

    static {
        Covode.recordClassIndex(4477);
    }

    /* renamed from: a */
    public static synchronized void m19888a(List<IPProbeItem> list) {
        synchronized (C1071f.class) {
            f21604a = list;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m19887a(String[] strArr) {
        boolean z;
        synchronized (C1071f.class) {
            if (strArr != null) {
                if (strArr.length != 0) {
                    f21605a = strArr;
                    C1074i.m19882d(C0002O.m25086C("serverIps:", Arrays.toString(f21605a)));
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m19886c(String str) {
        synchronized (C1071f.class) {
            f21607c = str;
        }
    }

    public static synchronized void clearSdnsGlobalParams() {
        synchronized (C1071f.class) {
            extra.clear();
        }
    }

    public static synchronized void setHTTPSRequestEnabled(boolean z) {
        synchronized (C1071f.class) {
            if (z) {
                PROTOCOL = "https://";
                f21609d = "443";
                return;
            }
            PROTOCOL = "http://";
            f21609d = "80";
        }
    }

    public static synchronized void setSdnsGlobalParams(Map<String, String> map) {
        synchronized (C1071f.class) {
            extra.putAll(map);
        }
    }

    public static synchronized void setTimeoutInterval(int i) {
        synchronized (C1071f.class) {
            if (i > 0) {
                f21603a = i;
            }
        }
    }
}
