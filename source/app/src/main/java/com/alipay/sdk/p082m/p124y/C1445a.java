package com.alipay.sdk.p082m.p124y;

import com.bytedance.covode.number.Covode;
import p003X.C86291JzR;

/* renamed from: com.alipay.sdk.m.y.a */
/* loaded from: classes26.dex */
public final class C1445a {

    /* renamed from: a */
    public static char[] f22515a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b */
    public static byte[] f22516b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C86291JzR.LIZJ, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        Covode.recordClassIndex(4946);
    }

    /* renamed from: a */
    public static byte[] m18673a(String str) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i4 = 0;
        loop0: while (i4 < length) {
            while (true) {
                i = i4 + 1;
                b = f22516b[bytes[i4]];
                if (i >= length || b != -1) {
                    break;
                }
                i4 = i;
            }
            if (b == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b2 = f22516b[bytes[i]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i = i2;
            }
            if (b2 == -1) {
                break;
            }
            stringBuffer.append((char) ((b << 2) | ((b2 & 48) >>> 4)));
            while (true) {
                i3 = i2 + 1;
                byte b5 = bytes[i2];
                if (b5 == 61) {
                    break loop0;
                }
                b3 = f22516b[b5];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) (((b2 & 15) << 4) | ((b3 & 60) >>> 2)));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    break loop0;
                }
                b4 = f22516b[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            stringBuffer.append((char) (b4 | ((b3 & 3) << 6)));
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }
}
