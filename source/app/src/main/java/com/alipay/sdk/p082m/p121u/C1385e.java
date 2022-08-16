package com.alipay.sdk.p082m.p121u;

import com.alipay.sdk.interior.Log;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.u.e */
/* loaded from: classes2.dex */
public class C1385e {

    /* renamed from: a */
    public static Log.ISdkLogCallback f22390a;

    static {
        Covode.recordClassIndex(4885);
    }

    /* renamed from: a */
    public static void m18870a(Log.ISdkLogCallback iSdkLogCallback) {
        f22390a = iSdkLogCallback;
    }

    /* renamed from: a */
    public static void m18866a(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            m18869a(m18864b(th));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static String m18864b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m18869a(String str) {
        try {
            Log.ISdkLogCallback iSdkLogCallback = f22390a;
            if (iSdkLogCallback != null) {
                iSdkLogCallback.onLogLine(String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m18865b(String str, String str2) {
        m18869a(m18868a(str, str2));
    }

    /* renamed from: c */
    public static void m18863c(String str, String str2) {
        m18869a(m18868a(str, str2));
    }

    /* renamed from: d */
    public static void m18862d(String str, String str2) {
        m18869a(m18868a(str, str2));
    }

    /* renamed from: e */
    public static void m18861e(String str, String str2) {
        m18869a(m18868a(str, str2));
    }

    /* renamed from: a */
    public static String m18868a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }

    /* renamed from: a */
    public static void m18867a(String str, String str2, Throwable th) {
        String m18868a = m18868a(str, str2);
        new StringBuilder();
        m18869a(C0002O.m25085C(m18868a, " ", m18864b(th)));
    }
}
