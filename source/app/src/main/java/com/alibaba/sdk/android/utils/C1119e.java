package com.alibaba.sdk.android.utils;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;

/* renamed from: com.alibaba.sdk.android.utils.e */
/* loaded from: classes2.dex */
public class C1119e {

    /* renamed from: a */
    public static final char[] f21742a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(4536);
    }

    /* renamed from: a */
    public static boolean m19771a(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m19772a(String str) {
        return m19770a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
    }

    /* renamed from: b */
    public static String m19769b(String str) {
        return m19770a(MessageDigest.getInstance("SHA-1").digest(str.getBytes()));
    }

    /* renamed from: a */
    public static String m19770a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f21742a[(bArr[i] & 240) >>> 4]);
            sb.append(f21742a[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m19773a(double d) {
        try {
            Thread.sleep((long) (d * 1000.0d));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
