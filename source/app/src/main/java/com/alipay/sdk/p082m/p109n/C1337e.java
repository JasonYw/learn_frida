package com.alipay.sdk.p082m.p109n;

import com.bytedance.covode.number.Covode;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alipay.sdk.m.n.e */
/* loaded from: classes2.dex */
public class C1337e {

    /* renamed from: a */
    public static String f22281a = "DESede/CBC/PKCS5Padding";

    static {
        Covode.recordClassIndex(4837);
    }

    /* renamed from: a */
    public static String m19073a(String str, String str2, String str3) {
        try {
            return new String(m19072a(str, C1333a.m19083a(str2), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m19071b(String str, String str2, String str3) {
        try {
            return C1333a.m19082a(m19070b(str, str2.getBytes(), str3));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m19072a(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(f22281a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(C1335c.m19076a(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m19070b(String str, byte[] bArr, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance(f22281a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(C1335c.m19076a(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
