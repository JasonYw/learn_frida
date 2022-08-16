package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.dx */
/* loaded from: classes19.dex */
public class C1988dx extends AbstractC1990dz {

    /* renamed from: a */
    public static int f24797a = 13;

    /* renamed from: b */
    public static int f24798b = 6;

    /* renamed from: e */
    public Context f24799e;

    static {
        Covode.recordClassIndex(5599);
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: a */
    public byte[] mo16406a(byte[] bArr) {
        byte[] m16411a = m16411a(this.f24799e);
        byte[] bArr2 = new byte[m16411a.length + bArr.length];
        System.arraycopy(m16411a, 0, bArr2, 0, m16411a.length);
        System.arraycopy(bArr, 0, bArr2, m16411a.length, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:2|3)|4|5|6|(1:(0))) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] m16411a(android.content.Context r6) {
        /*
            r5 = this;
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r1 = 0
            byte[] r4 = new byte[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "1.2."
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L77
            int r0 = com.amap.api.services.p126a.C1988dx.f24797a     // Catch: java.lang.Throwable -> L77
            r2.append(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "."
            r2.append(r0)     // Catch: java.lang.Throwable -> L77
            int r0 = com.amap.api.services.p126a.C1988dx.f24798b     // Catch: java.lang.Throwable -> L77
            r2.append(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "Android"
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1878bj.m16869w(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1878bj.m16878n(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1878bj.m16883i(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1878bj.m16867y(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1864bf.m16963c(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1864bf.m16962d(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = com.amap.api.services.p126a.C1864bf.m16960f(r6)     // Catch: java.lang.Throwable -> L77
            com.amap.api.services.p126a.C1892bp.m16788a(r3, r0)     // Catch: java.lang.Throwable -> L77
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
            com.amap.api.services.p126a.C1906cb.m16716c(r2, r1, r0)     // Catch: java.lang.Throwable -> L83
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
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1988dx.m16411a(android.content.Context):byte[]");
    }

    public C1988dx(Context context, AbstractC1990dz abstractC1990dz) {
        super(abstractC1990dz);
        this.f24799e = context;
    }
}
