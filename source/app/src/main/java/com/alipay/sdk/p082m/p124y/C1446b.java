package com.alipay.sdk.p082m.p124y;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.security.MessageDigest;

/* renamed from: com.alipay.sdk.m.y.b */
/* loaded from: classes26.dex */
public final class C1446b {
    static {
        Covode.recordClassIndex(4947);
    }

    /* renamed from: a */
    public static String m18672a(String str) {
        try {
            if (C1448a.m18665a(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(C34037f.f43302f));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
