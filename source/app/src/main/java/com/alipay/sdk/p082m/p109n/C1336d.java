package com.alipay.sdk.p082m.p109n;

import com.bytedance.covode.number.Covode;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.alipay.sdk.m.n.d */
/* loaded from: classes2.dex */
public class C1336d {
    static {
        Covode.recordClassIndex(4836);
    }

    /* renamed from: b */
    public static PublicKey m19074b(String str, String str2) {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(C1333a.m19083a(str2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m19075a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = 0
            java.lang.String r0 = "RSA"
            java.security.PublicKey r1 = m19074b(r0, r8)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r0 = 1
            r5.init(r0, r1)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r7.getBytes(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            int r3 = r5.getBlockSize()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r1 = 0
        L21:
            int r0 = r4.length     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L47
            if (r1 >= r0) goto L35
            int r0 = r4.length     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L47
            int r0 = r0 - r1
            if (r0 >= r3) goto L33
            int r0 = r4.length     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L47
            int r0 = r0 - r1
        L2a:
            byte[] r0 = r5.doFinal(r4, r1, r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L47
            r2.write(r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L47
            int r1 = r1 + r3
            goto L21
        L33:
            r0 = r3
            goto L2a
        L35:
            byte[] r6 = r2.toByteArray()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L47
            r2.close()     // Catch: java.io.IOException -> L5a
            return r6
        L3d:
            r0 = move-exception
            goto L43
        L3f:
            r1 = move-exception
            goto L49
        L41:
            r0 = move-exception
            r2 = r6
        L43:
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)     // Catch: java.lang.Throwable -> L47
            goto L54
        L47:
            r1 = move-exception
            r6 = r2
        L49:
            if (r6 == 0) goto L53
            r6.close()     // Catch: java.io.IOException -> L4f
            throw r1
        L4f:
            r0 = move-exception
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)
        L53:
            throw r1
        L54:
            if (r2 == 0) goto L5e
            r2.close()     // Catch: java.io.IOException -> L5a
            return r6
        L5a:
            r0 = move-exception
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p109n.C1336d.m19075a(java.lang.String, java.lang.String):byte[]");
    }
}
