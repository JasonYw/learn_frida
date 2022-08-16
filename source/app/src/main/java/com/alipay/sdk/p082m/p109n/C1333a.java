package com.alipay.sdk.p082m.p109n;

import com.alipay.sdk.app.OpenAuthTask;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.n.a */
/* loaded from: classes2.dex */
public final class C1333a {

    /* renamed from: f */
    public static final int f22277f = 4;

    /* renamed from: g */
    public static final int f22278g = -128;

    /* renamed from: i */
    public static final byte[] f22279i = new byte[128];

    /* renamed from: j */
    public static final char[] f22280j = new char[64];

    /* renamed from: b */
    public static boolean m19080b(char c) {
        return c == '=';
    }

    /* renamed from: c */
    public static boolean m19079c(char c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    static {
        int i;
        int i2;
        Covode.recordClassIndex(4833);
        int i3 = 0;
        int i4 = 0;
        do {
            f22279i[i4] = -1;
            i4++;
        } while (i4 < 128);
        int i5 = 90;
        do {
            f22279i[i5] = (byte) (i5 - 65);
            i5--;
        } while (i5 >= 65);
        int i6 = OpenAuthTask.f22015g;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f22279i[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f22279i[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = f22279i;
        bArr[43] = 62;
        bArr[47] = 63;
        int i8 = 0;
        do {
            f22280j[i8] = (char) (i8 + 65);
            i8++;
        } while (i8 <= 25);
        int i9 = 0;
        do {
            f22280j[i] = (char) (i9 + 97);
            i++;
            i9++;
        } while (i <= 51);
        do {
            f22280j[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        } while (i2 <= 61);
        char[] cArr = f22280j;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    /* renamed from: a */
    public static boolean m19084a(char c) {
        if (c < 128 && f22279i[c] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m19081a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!m19079c(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static String m19082a(byte[] bArr) {
        int i;
        int i2;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i3 = length % 24;
        int i4 = length / 24;
        if (i3 != 0) {
            i = i4 + 1;
        } else {
            i = i4;
        }
        char[] cArr = new char[i * 4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = i5 + 1;
            byte b = bArr[i5];
            int i9 = i8 + 1;
            byte b2 = bArr[i8];
            i5 = i9 + 1;
            byte b3 = bArr[i9];
            byte b4 = (byte) (b2 & 15);
            byte b5 = (byte) (b & 3);
            int i10 = b >> 2;
            if ((b & Byte.MIN_VALUE) != 0) {
                i10 ^= 192;
            }
            byte b6 = (byte) i10;
            int i11 = b2 >> 4;
            if ((b2 & Byte.MIN_VALUE) != 0) {
                i11 ^= 240;
            }
            byte b7 = (byte) i11;
            if ((b3 & Byte.MIN_VALUE) == 0) {
                i2 = b3 >> 6;
            } else {
                i2 = (b3 >> 6) ^ 252;
            }
            int i12 = i6 + 1;
            char[] cArr2 = f22280j;
            cArr[i6] = cArr2[b6];
            int i13 = i12 + 1;
            cArr[i12] = cArr2[(b5 << 4) | b7];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b4 << 2) | ((byte) i2)];
            i6 = i14 + 1;
            cArr[i14] = cArr2[b3 & 63];
        }
        if (i3 == 8) {
            byte b8 = bArr[i5];
            byte b9 = (byte) (b8 & 3);
            int i15 = b8 >> 2;
            if ((b8 & Byte.MIN_VALUE) != 0) {
                i15 ^= 192;
            }
            int i16 = i6 + 1;
            char[] cArr3 = f22280j;
            cArr[i6] = cArr3[(byte) i15];
            int i17 = i16 + 1;
            cArr[i16] = cArr3[b9 << 4];
            cArr[i17] = '=';
            cArr[i17 + 1] = '=';
        } else if (i3 == 16) {
            byte b10 = bArr[i5];
            byte b11 = bArr[i5 + 1];
            byte b12 = (byte) (b11 & 15);
            byte b13 = (byte) (b10 & 3);
            int i18 = b10 >> 2;
            if ((b10 & Byte.MIN_VALUE) != 0) {
                i18 ^= 192;
            }
            byte b14 = (byte) i18;
            int i19 = b11 >> 4;
            if ((b11 & Byte.MIN_VALUE) != 0) {
                i19 ^= 240;
            }
            int i20 = i6 + 1;
            char[] cArr4 = f22280j;
            cArr[i6] = cArr4[b14];
            int i21 = i20 + 1;
            cArr[i20] = cArr4[((byte) i19) | (b13 << 4)];
            cArr[i21] = cArr4[b12 << 2];
            cArr[i21 + 1] = '=';
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m19083a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int m19081a = m19081a(charArray);
        if (m19081a % 4 != 0) {
            return null;
        }
        int i = m19081a / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i * 3];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i - 1) {
            int i5 = i3 + 1;
            char c = charArray[i3];
            if (m19084a(c)) {
                int i6 = i5 + 1;
                char c2 = charArray[i5];
                if (m19084a(c2)) {
                    int i7 = i6 + 1;
                    char c3 = charArray[i6];
                    if (m19084a(c3)) {
                        i3 = i7 + 1;
                        char c4 = charArray[i7];
                        if (m19084a(c4)) {
                            byte[] bArr2 = f22279i;
                            byte b = bArr2[c];
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            int i8 = i4 + 1;
                            bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) (((b2 & 15) << 4) | ((b3 >> 2) & 15));
                            i4 = i9 + 1;
                            bArr[i9] = (byte) ((b3 << 6) | b4);
                            i2++;
                        }
                    }
                }
            }
            return null;
        }
        int i10 = i3 + 1;
        char c5 = charArray[i3];
        if (!m19084a(c5)) {
            return null;
        }
        int i11 = i10 + 1;
        char c6 = charArray[i10];
        if (!m19084a(c6)) {
            return null;
        }
        byte[] bArr3 = f22279i;
        byte b5 = bArr3[c5];
        byte b6 = bArr3[c6];
        int i12 = i11 + 1;
        char c7 = charArray[i11];
        char c8 = charArray[i12];
        if (m19084a(c7) && m19084a(c8)) {
            byte[] bArr4 = f22279i;
            byte b7 = bArr4[c7];
            byte b8 = bArr4[c8];
            int i13 = i4 + 1;
            bArr[i4] = (byte) ((b5 << 2) | (b6 >> 4));
            bArr[i13] = (byte) (((b6 & 15) << 4) | ((b7 >> 2) & 15));
            bArr[i13 + 1] = (byte) (b8 | (b7 << 6));
            return bArr;
        } else if (m19080b(c7) && m19080b(c8)) {
            if ((b6 & 15) != 0) {
                return null;
            }
            int i14 = i2 * 3;
            byte[] bArr5 = new byte[i14 + 1];
            System.arraycopy(bArr, 0, bArr5, 0, i14);
            bArr5[i4] = (byte) ((b5 << 2) | (b6 >> 4));
            return bArr5;
        } else if (m19080b(c7) || !m19080b(c8)) {
            return null;
        } else {
            byte b9 = f22279i[c7];
            if ((b9 & 3) != 0) {
                return null;
            }
            int i15 = i2 * 3;
            byte[] bArr6 = new byte[i15 + 2];
            System.arraycopy(bArr, 0, bArr6, 0, i15);
            bArr6[i4] = (byte) ((b5 << 2) | (b6 >> 4));
            bArr6[i4 + 1] = (byte) (((b9 >> 2) & 15) | ((b6 & 15) << 4));
            return bArr6;
        }
    }
}
