package com.alipay.sdk.p082m.p106l0;

import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p003X.C108922Sua;

/* renamed from: com.alipay.sdk.m.l0.a */
/* loaded from: classes13.dex */
public class C1316a {
    static {
        Covode.recordClassIndex(4816);
    }

    /* renamed from: b */
    public static byte[] m19164b() {
        try {
            byte[] m19161a = C1317b.m19161a("IUQSvE6r1TfFPdPEjfklLw==".getBytes(C34037f.f43302f), 2);
            if (m19161a != null) {
                return C1323e.m19147a(m19161a);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    /* renamed from: a */
    public static byte[] m19170a() {
        return C1323e.m19147a(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    /* renamed from: a */
    public static String m19169a(String str) {
        byte[] bArr;
        try {
            bArr = m19165a(m19170a(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return m19166a(bArr);
    }

    /* renamed from: b */
    public static String m19163b(String str) {
        try {
            return new String(m19162b(m19170a(), m19168a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m19166a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            m19167a(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m19168a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public static void m19167a(StringBuffer stringBuffer, byte b) {
        stringBuffer.append(C108922Sua.LIZLLL.charAt((b >> 4) & 15));
        stringBuffer.append(C108922Sua.LIZLLL.charAt(b & 15));
    }

    /* renamed from: b */
    public static byte[] m19162b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(m19164b()));
        return cipher.doFinal(bArr2);
    }

    /* renamed from: a */
    public static byte[] m19165a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(m19164b()));
        return cipher.doFinal(bArr2);
    }
}
