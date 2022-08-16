package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p003X.C86291JzR;

/* renamed from: com.amap.api.mapcore2d.gp */
/* loaded from: classes19.dex */
public final class C1747gp {

    /* renamed from: a */
    public static final char[] f23795a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final byte[] f23796b = {0, 1, 1, 2, 3, 5, 8, C86291JzR.LIZJ, 8, 7, 6, 5, 4, 3, 2, 1};

    /* renamed from: c */
    public static final IvParameterSpec f23797c = new IvParameterSpec(f23796b);

    static {
        Covode.recordClassIndex(5295);
    }

    /* renamed from: a */
    public static byte[] m17335a(byte[] bArr) {
        int i = 0;
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArr.length - 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(C1602db.m17931c()));
            return cipher.doFinal(bArr3);
        } catch (Throwable th) {
            if (bArr != null) {
                i = bArr.length;
            }
            C1752gu.m17302a(th, "Encrypt", "decryptRsponse length = ".concat(String.valueOf(i)));
            return null;
        }
    }
}
