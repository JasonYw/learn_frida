package com.alipay.sdk.p082m.p124y;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import p003X.C108922Sua;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.y.c */
/* loaded from: classes26.dex */
public final class C1447c {

    /* renamed from: a */
    public static String f22517a = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    static {
        Covode.recordClassIndex(4948);
    }

    /* renamed from: a */
    public static String m18671a() {
        String str = new String();
        for (int i = 0; i < f22517a.length() - 1; i += 4) {
            str = str + f22517a.charAt(i);
        }
        return str;
    }

    /* renamed from: a */
    public static String m18669a(String str, String str2) {
        try {
            PBEKeySpec m18670a = m18670a(str);
            byte[] bytes = str2.getBytes();
            byte[] m18667b = m18667b();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(m18670a).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(m18667b));
            byte[] salt = m18670a.getSalt();
            ByteBuffer allocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
            allocate.put(salt);
            cipher.doFinal(ByteBuffer.wrap(bytes), allocate);
            return m18668a(allocate.array());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m18668a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            stringBuffer.append(C108922Sua.LIZLLL.charAt((b >> 4) & 15));
            stringBuffer.append(C108922Sua.LIZLLL.charAt(b & 15));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static PBEKeySpec m18670a(String str) {
        Class LIZ = C116971W2r.LIZ(new String(C1445a.m18673a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object newInstance = LIZ.newInstance();
        byte[] bArr = new byte[16];
        Method method = LIZ.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(newInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    /* renamed from: b */
    public static String m18666b(String str, String str2) {
        byte[] doFinal;
        try {
            PBEKeySpec m18670a = m18670a(str);
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
            }
            byte[] m18667b = m18667b();
            if (length <= 16) {
                doFinal = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(m18670a.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(m18667b));
                doFinal = cipher.doFinal(bArr, 16, length - 16);
            }
        } catch (Exception unused) {
        }
        if (doFinal != null) {
            String str3 = new String(doFinal);
            if (!C1448a.m18659c(str3)) {
                return null;
            }
            return str3;
        }
        throw new Exception();
    }

    /* renamed from: b */
    public static byte[] m18667b() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 48; i += 2) {
                sb.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i));
            }
            return C1445a.m18673a(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
