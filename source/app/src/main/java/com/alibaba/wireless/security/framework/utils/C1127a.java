package com.alibaba.wireless.security.framework.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.wireless.security.framework.utils.a */
/* loaded from: classes2.dex */
public class C1127a {

    /* renamed from: a */
    public static String f21805a = "SGFramework";

    /* renamed from: b */
    public static String f21806b = "SGTIME";

    /* renamed from: c */
    public static boolean f21807c;

    static {
        Covode.recordClassIndex(4551);
    }

    /* renamed from: a */
    public static String m19718a() {
        if (f21807c) {
            return Thread.currentThread().getStackTrace()[3].getMethodName();
        }
        return null;
    }

    /* renamed from: a */
    public static void m19717a(String str) {
    }

    /* renamed from: a */
    public static void m19716a(String str, String str2, String str3, long j) {
    }

    /* renamed from: a */
    public static void m19715a(String str, Throwable th) {
    }

    /* renamed from: b */
    public static long m19714b() {
        if (f21807c) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* renamed from: b */
    public static void m19713b(String str) {
    }
}
