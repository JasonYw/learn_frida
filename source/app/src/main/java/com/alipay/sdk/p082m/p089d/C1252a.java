package com.alipay.sdk.p082m.p089d;

import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.alipay.sdk.m.d.a */
/* loaded from: classes2.dex */
public class C1252a {

    /* renamed from: b */
    public static boolean f22098b;

    static {
        Covode.recordClassIndex(4752);
    }

    /* renamed from: b */
    public static void m19326b(String str, Object... objArr) {
    }

    /* renamed from: c */
    public static void m19325c(String str, Object... objArr) {
    }

    /* renamed from: d */
    public static void m19324d(String str, Object... objArr) {
    }

    /* renamed from: e */
    public static void m19323e(String str, Object... objArr) {
    }

    /* renamed from: a */
    public static void m19327a(boolean z) {
        f22098b = z;
    }

    /* renamed from: a */
    public static String m19329a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    /* renamed from: a */
    public static String m19328a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        int i = 0;
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(m19329a(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }
}
