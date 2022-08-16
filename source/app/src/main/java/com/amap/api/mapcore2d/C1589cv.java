package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.amap.api.mapcore2d.cv */
/* loaded from: classes19.dex */
public class C1589cv {

    /* renamed from: a */
    public static final char[] f23291a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b */
    public static final byte[] f23292b = new byte[128];

    static {
        Covode.recordClassIndex(5137);
        int i = 0;
        do {
            f23292b[i] = -1;
            i++;
        } while (i < 128);
        int i2 = 65;
        do {
            f23292b[i2] = (byte) (i2 - 65);
            i2++;
        } while (i2 <= 90);
        int i3 = 97;
        do {
            f23292b[i3] = (byte) ((i3 - 97) + 26);
            i3++;
        } while (i3 <= 122);
        int i4 = 48;
        do {
            f23292b[i4] = (byte) ((i4 - 48) + 52);
            i4++;
        } while (i4 <= 57);
        byte[] bArr = f23292b;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    /* renamed from: c */
    public static String m18017c(byte[] bArr) {
        try {
            return m18015d(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m18026a(String str) {
        return C1602db.m17936a(m18021b(str));
    }

    /* renamed from: b */
    public static String m18020b(byte[] bArr) {
        try {
            return m18015d(bArr);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "er", "e64");
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m18025a(byte[] bArr) {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        if (keyGenerator == null) {
            return null;
        }
        keyGenerator.init(256);
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        PublicKey m17928d = C1602db.m17928d();
        if (m17928d == null) {
            return null;
        }
        byte[] m18024a = m18024a(encoded, m17928d);
        byte[] m18023a = m18023a(encoded, bArr);
        byte[] bArr2 = new byte[m18024a.length + m18023a.length];
        System.arraycopy(m18024a, 0, bArr2, 0, m18024a.length);
        System.arraycopy(m18023a, 0, bArr2, m18024a.length, m18023a.length);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m18021b(String str) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3 = 0;
        if (str == null) {
            return new byte[0];
        }
        byte[] m17940a = C1602db.m17940a(str);
        int length = m17940a.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                b = f23292b[m17940a[i3]];
                if (i >= length || b != -1) {
                    break;
                }
                i3 = i;
            }
            if (b == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b2 = f23292b[m17940a[i]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i = i2;
            }
            if (b2 == -1) {
                break;
            }
            byteArrayOutputStream.write((b << 2) | ((b2 & 48) >>> 4));
            while (i2 != length) {
                int i4 = i2 + 1;
                byte b3 = m17940a[i2];
                if (b3 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b4 = f23292b[b3];
                if (i4 < length && b4 == -1) {
                    i2 = i4;
                } else if (b4 == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(((b2 & 15) << 4) | ((b4 & 60) >>> 2));
                    while (i4 != length) {
                        i3 = i4 + 1;
                        byte b5 = m17940a[i4];
                        if (b5 == 61) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byte b6 = f23292b[b5];
                        if (i3 < length && b6 == -1) {
                            i4 = i3;
                        } else if (b6 == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(b6 | ((b4 & 3) << 6));
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    public static String m18015d(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f23291a[i3 >>> 2]);
                stringBuffer.append(f23291a[(i3 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            if (i4 == length) {
                stringBuffer.append(f23291a[i3 >>> 2]);
                stringBuffer.append(f23291a[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                stringBuffer.append(f23291a[(i5 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i = i4 + 1;
            int i6 = bArr[i4] & 255;
            stringBuffer.append(f23291a[i3 >>> 2]);
            stringBuffer.append(f23291a[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
            stringBuffer.append(f23291a[((i5 & 15) << 2) | ((i6 & 192) >>> 6)]);
            stringBuffer.append(f23291a[i6 & 63]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m18024a(byte[] bArr, Key key) {
        Cipher cipher = Cipher.getInstance(C1602db.m17930c(C1610dj.f23339a));
        cipher.init(1, key);
        return cipher.doFinal(bArr);
    }

    /* renamed from: b */
    public static byte[] m18019b(byte[] bArr, byte[] bArr2) {
        return m18016c(bArr, bArr2, C1602db.m17931c());
    }

    /* renamed from: a */
    public static byte[] m18023a(byte[] bArr, byte[] bArr2) {
        try {
            return m18019b(bArr, bArr2);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "er", "asEn");
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m18022a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m18014d(bArr, bArr2, bArr3);
    }

    /* renamed from: b */
    public static byte[] m18018b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m18016c(bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m18016c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return cipher.doFinal(bArr2);
    }

    /* renamed from: d */
    public static byte[] m18014d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr2);
    }
}
