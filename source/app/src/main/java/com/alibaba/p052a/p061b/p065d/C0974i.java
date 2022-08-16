package com.alibaba.p052a.p061b.p065d;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.alibaba.a.b.d.i */
/* loaded from: classes13.dex */
public class C0974i {

    /* renamed from: a */
    public static String f21406a = "UTAnalytics:";

    /* renamed from: b */
    public static boolean f21407b;

    /* renamed from: c */
    public static boolean f21408c;

    static {
        Covode.recordClassIndex(4284);
    }

    /* renamed from: a */
    public static void m20100a(String str, Object obj) {
        if (m20095b() || m20101a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(f21406a);
        }
    }

    /* renamed from: a */
    public static void m20099a(String str, Object obj, Throwable th) {
        if (m20095b() || m20101a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(f21406a);
        }
    }

    /* renamed from: a */
    public static void m20098a(String str, Object... objArr) {
        if (f21408c) {
            StringBuilder sb = new StringBuilder();
            sb.append(f21406a);
            sb.append(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pid:");
            sb2.append(Process.myPid());
            sb2.append(" ");
            if (objArr == null) {
                return;
            }
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] != null) {
                    String obj = objArr[i].toString();
                    if (!obj.endsWith(Constants.COLON_SEPARATOR) && !obj.endsWith(": ")) {
                        sb2.append(obj);
                        obj = Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                    sb2.append(obj);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m20097a(String str, String... strArr) {
        if (f21408c) {
            StringBuilder sb = new StringBuilder();
            sb.append(f21406a);
            sb.append(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pid:");
            sb2.append(Process.myPid());
            sb2.append(" ");
            if (strArr == null) {
                return;
            }
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] != null) {
                    String str2 = strArr[i];
                    if (!str2.endsWith(Constants.COLON_SEPARATOR) && !str2.endsWith(": ")) {
                        sb2.append(str2);
                        str2 = Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                    sb2.append(str2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m20096a(boolean z) {
        f21408c = z;
    }

    /* renamed from: a */
    public static boolean m20101a() {
        return f21407b;
    }

    /* renamed from: b */
    public static boolean m20095b() {
        return f21408c;
    }
}
