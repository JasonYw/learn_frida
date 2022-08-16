package com.alipay.sdk.p082m.p109n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* renamed from: com.alipay.sdk.m.n.c */
/* loaded from: classes2.dex */
public class C1335c {
    static {
        Covode.recordClassIndex(4835);
    }

    /* renamed from: a */
    public static byte[] m19076a(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int i = blockSize * 2;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int i2 = 1; i2 < i; i2++) {
            bArr[i2] = (byte) (str.codePointAt(i2 % str.length()) & 127);
            if (i2 >= blockSize) {
                bArr[i2] = (byte) (bArr[0] & bArr[i2]);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }
}
