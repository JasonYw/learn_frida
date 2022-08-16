package com.alipay.sdk.p082m.p125z;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.z.b */
/* loaded from: classes25.dex */
public final class C1449b {
    static {
        Covode.recordClassIndex(4950);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r3 != null) goto L13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m18654a(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r5 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            r4.<init>(r7, r8)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            if (r0 != 0) goto L12
            return r5
        L12:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            java.lang.String r0 = "UTF-8"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L37
        L23:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L38
            if (r0 == 0) goto L3f
            r6.append(r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L38
            goto L23
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r3 = r5
        L31:
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.lang.Throwable -> L36
        L36:
            throw r0
        L37:
            r3 = r5
        L38:
            if (r3 != 0) goto L3f
        L3a:
            java.lang.String r0 = r6.toString()
            return r0
        L3f:
            r3.close()     // Catch: java.lang.Throwable -> L3a
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p125z.C1449b.m18654a(java.lang.String, java.lang.String):java.lang.String");
    }
}
