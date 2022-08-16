package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* renamed from: com.alibaba.sdk.android.httpdns.i */
/* loaded from: classes2.dex */
public class C1074i {

    /* renamed from: a */
    public static ILogger f21613a;

    /* renamed from: c */
    public static int f21614c = -1;

    /* renamed from: c */
    public static boolean f21615c;

    static {
        Covode.recordClassIndex(4480);
    }

    /* renamed from: a */
    public static void m19884a(Throwable th) {
    }

    /* renamed from: c */
    public static String m19883c() {
        try {
            if (f21614c == -1) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (stackTrace[i].getMethodName().equals("getTraceInfo")) {
                        f21614c = i2 + 1;
                        break;
                    } else {
                        i2++;
                        i++;
                    }
                }
            }
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[f21614c + 1];
            new StringBuilder();
            return C0002O.m25082C(stackTraceElement.getFileName(), Constants.COLON_SEPARATOR, Integer.valueOf(stackTraceElement.getLineNumber()), " - [", stackTraceElement.getMethodName(), "]");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static void m19882d(String str) {
        ILogger iLogger = f21613a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* renamed from: e */
    public static void m19881e(String str) {
        ILogger iLogger = f21613a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* renamed from: f */
    public static void m19880f(String str) {
        ILogger iLogger = f21613a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    public static synchronized void setLogEnabled(boolean z) {
        synchronized (C1074i.class) {
            f21615c = z;
        }
    }

    public static void setLogger(ILogger iLogger) {
        f21613a = iLogger;
    }
}
