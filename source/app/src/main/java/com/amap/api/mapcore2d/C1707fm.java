package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fm */
/* loaded from: classes19.dex */
public class C1707fm extends AbstractC1709fo {

    /* renamed from: a */
    public static int f23622a = 13;

    /* renamed from: b */
    public static int f23623b = 6;

    /* renamed from: e */
    public Context f23624e;

    static {
        Covode.recordClassIndex(5255);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: a */
    public byte[] mo17513a(byte[] bArr) {
        byte[] m17517a = m17517a(this.f23624e);
        byte[] bArr2 = new byte[m17517a.length + bArr.length];
        System.arraycopy(m17517a, 0, bArr2, 0, m17517a.length);
        System.arraycopy(bArr, 0, bArr2, m17517a.length, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:2|3)|4|5|6|(1:(0))) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] m17517a(android.content.Context r6) {
        /*
            r5 = this;
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r1 = 0
            byte[] r4 = new byte[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "1.2."
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L77
            int r0 = com.amap.api.mapcore2d.C1707fm.f23622a     // Catch: java.lang.Throwable -> L77
            r2.append(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "."
            r2.append(r0)     // Catch: java.lang.Throwable -> L77
            int r0 = com.amap.api.mapcore2d.C1707fm.f23623b     // Catch: java.lang.Throwable -> L77
            r2.append(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "Android"
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1587cu.m18031v(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1587cu.m18040m(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1587cu.m18045h(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1587cu.m18029x(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1573cq.m18121c(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1573cq.m18120d(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.mapcore2d.C1573cq.m18118f(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.mapcore2d.C1602db.m17942a(r3, r0)     // Catch: java.lang.Throwable -> L77
            r0 = 1
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L77
            r0[r1] = r1     // Catch: java.lang.Throwable -> L77
            r3.write(r0)     // Catch: java.lang.Throwable -> L77
            byte[] r4 = r3.toByteArray()     // Catch: java.lang.Throwable -> L77
            goto L7f
        L77:
            r2 = move-exception
            java.lang.String r1 = "sm"
            java.lang.String r0 = "gh"
            com.amap.api.mapcore2d.C1616do.m17866c(r2, r1, r0)     // Catch: java.lang.Throwable -> L83
        L7f:
            r3.close()     // Catch: java.lang.Throwable -> L82
        L82:
            return r4
        L83:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L87
        L87:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1707fm.m17517a(android.content.Context):byte[]");
    }

    public C1707fm(Context context, AbstractC1709fo abstractC1709fo) {
        super(abstractC1709fo);
        this.f23624e = context;
    }
}
