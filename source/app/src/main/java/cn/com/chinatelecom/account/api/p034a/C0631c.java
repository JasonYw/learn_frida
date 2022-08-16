package cn.com.chinatelecom.account.api.p034a;

import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.a.c */
/* loaded from: classes26.dex */
public final class C0631c {

    /* renamed from: a */
    public static final char[] f20864a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(2682);
    }

    /* renamed from: a */
    public static String m20736a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f20864a[(bArr[i] >> 4) & 15]);
            sb.append(f20864a[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m20737a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i] = (byte) digit;
        }
        return bArr;
    }
}
