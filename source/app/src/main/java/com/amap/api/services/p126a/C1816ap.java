package com.amap.api.services.p126a;

import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.ap */
/* loaded from: classes13.dex */
public class C1816ap {

    /* renamed from: a */
    public static int f24245a = 4;

    static {
        Covode.recordClassIndex(5427);
    }

    /* renamed from: a */
    public static int[] m17064a(byte[] bArr, boolean z) {
        int[] iArr = new int[bArr.length >>> 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = i >>> 2;
            iArr[i2] = iArr[i2] | ((bArr[i] & 255) << ((i & 3) << 3));
        }
        return iArr;
    }

    /* renamed from: a */
    public static byte[] m17063a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length;
        int i = f24245a;
        int i2 = i - (length % i);
        byte[] bArr3 = new byte[((length / i) + 1) * i];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        while (length < bArr3.length) {
            bArr3[length] = (byte) i2;
            length++;
        }
        int[] m17064a = m17064a(bArr3, true);
        m17061a(m17064a, m17064a(bArr2, false));
        return m17062a(m17064a, false);
    }

    /* renamed from: a */
    public static byte[] m17062a(int[] iArr, boolean z) {
        int i;
        int length = iArr.length << 2;
        if (z) {
            i = iArr[iArr.length - 1];
            if (i > length) {
                return null;
            }
        } else {
            i = length;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((iArr[i2 >>> 2] >>> ((i2 & 3) << 3)) & MotionEventCompat.ACTION_MASK);
        }
        return bArr;
    }

    /* renamed from: a */
    public static int[] m17061a(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        if (length <= 0) {
            return iArr;
        }
        if (iArr2.length < 4) {
            int[] iArr3 = new int[4];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = iArr3;
        }
        int i = iArr[length];
        int i2 = (52 / (length + 1)) + 6;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 > 0) {
                i3 -= 1640531527;
                int i5 = (i3 >>> 2) & 3;
                int i6 = 0;
                do {
                    int i7 = i6 + 1;
                    int i8 = iArr[i7];
                    i = ((((i >>> 5) ^ (i8 << 2)) + ((i8 >>> 3) ^ (i << 4))) ^ ((i8 ^ i3) + (i ^ iArr2[(i6 & 3) ^ i5]))) + iArr[i6];
                    iArr[i6] = i;
                    i6 = i7;
                } while (i6 < length);
                int i9 = iArr[0];
                i = iArr[length] + ((((i >>> 5) ^ (i9 << 2)) + ((i9 >>> 3) ^ (i << 4))) ^ ((i9 ^ i3) + (iArr2[i5 ^ (i6 & 3)] ^ i)));
                iArr[length] = i;
                i2 = i4;
            } else {
                return iArr;
            }
        }
    }
}
