package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.alibaba.a.b.d.j */
/* loaded from: classes2.dex */
public class C0975j {

    /* renamed from: a */
    public static char[] f21409a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(4285);
    }

    /* renamed from: a */
    public static String m20094a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f21409a[(bArr[i] & 240) >>> 4]);
            sb.append(f21409a[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m20093b(byte[] bArr) {
        byte[] m20092c = m20092c(bArr);
        return m20092c != null ? m20094a(m20092c) : "0000000000000000";
    }

    /* renamed from: c */
    public static byte[] m20092c(byte[] bArr) {
        if (bArr != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
