package com.alipay.sdk.p082m.p095g;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.SecureRandom;
import java.util.Arrays;
import p003X.C108922Sua;

/* renamed from: com.alipay.sdk.m.g.c */
/* loaded from: classes2.dex */
public class C1277c {

    /* renamed from: a */
    public static volatile SecureRandom f22130a;

    /* renamed from: b */
    public static final char[] f22131b = C108922Sua.LIZLLL.toCharArray();

    /* renamed from: a */
    public static byte[] m19295a(byte b) {
        return new byte[]{b};
    }

    /* renamed from: a */
    public static byte[] m19294a(char c) {
        return new byte[]{(byte) (c & 255)};
    }

    /* renamed from: a */
    public static byte[] m19293a(char c, char c2) {
        return new byte[]{(byte) (c & 255), (byte) (c2 & 255)};
    }

    /* renamed from: a */
    public static byte[] m19292a(int i) {
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    /* renamed from: a */
    public static byte[] m19291a(long j) {
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    /* renamed from: a */
    public static byte[] m19290a(short s) {
        return new byte[]{(byte) s, (byte) (s >> 8)};
    }

    static {
        Covode.recordClassIndex(4777);
    }

    /* renamed from: b */
    public static byte[] m19287b() {
        byte[] bArr = new byte[2];
        m19296a().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m19285c() {
        byte[] bArr = new byte[4];
        m19296a().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static SecureRandom m19296a() {
        if (f22130a != null) {
            return f22130a;
        }
        synchronized (C1277c.class) {
            if (f22130a == null) {
                f22130a = new SecureRandom();
            }
        }
        return f22130a;
    }

    /* renamed from: a */
    public static String m19289a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    /* renamed from: b */
    public static String m19286b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f22131b;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m19288a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = null;
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr3 == null) {
                bArr3 = Arrays.copyOf(bArr4, i);
                i2 = bArr4.length;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
                i2 += bArr4.length;
            }
        }
        return bArr3;
    }
}
