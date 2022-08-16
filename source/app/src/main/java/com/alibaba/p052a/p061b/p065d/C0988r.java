package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alibaba.a.b.d.r */
/* loaded from: classes2.dex */
public class C0988r {
    static {
        Covode.recordClassIndex(4298);
    }

    /* renamed from: a */
    public static String m20064a(String str) {
        try {
            Class LIZ = C116971W2r.LIZ("android.os.SystemProperties");
            return (String) LIZ.getMethod("get", String.class).invoke(LIZ, str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m20063a(String str, String str2) {
        try {
            Class LIZ = C116971W2r.LIZ("android.os.SystemProperties");
            return (String) LIZ.getMethod("get", String.class, String.class).invoke(LIZ, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
