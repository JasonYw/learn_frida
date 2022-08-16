package com.alibaba.sdk.android.httpdns;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* renamed from: com.alibaba.sdk.android.httpdns.a */
/* loaded from: classes26.dex */
public class C1029a {

    /* renamed from: a */
    public static long f21520a;
    public static String sSecretKey;

    static {
        Covode.recordClassIndex(4435);
    }

    /* renamed from: a */
    public static String m19993a(String str, String str2) {
        if (!C1078l.m19876b(str)) {
            return "";
        }
        new StringBuilder();
        try {
            return C1078l.m19877a(C0002O.m25083C(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, sSecretKey, Constants.ACCEPT_TIME_SEPARATOR_SERVER, str2));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m19994a() {
        return !TextUtils.isEmpty(sSecretKey);
    }

    public static String getTimestamp() {
        return String.valueOf((System.currentTimeMillis() / 1000) + f21520a + 600);
    }

    public static void setAuthCurrentTime(long j) {
        f21520a = j - (System.currentTimeMillis() / 1000);
    }

    public static void setSecretKey(String str) {
        sSecretKey = str;
    }
}
