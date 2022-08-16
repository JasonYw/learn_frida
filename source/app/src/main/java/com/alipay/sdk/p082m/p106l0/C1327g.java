package com.alipay.sdk.p082m.p106l0;

import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.l0.g */
/* loaded from: classes26.dex */
public class C1327g {
    static {
        Covode.recordClassIndex(4827);
    }

    /* renamed from: a */
    public static String m19143a(String str, String str2) {
        try {
            Class LIZ = C116971W2r.LIZ("android.os.SystemProperties");
            return (String) LIZ.getMethod("get", String.class, String.class).invoke(LIZ, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
