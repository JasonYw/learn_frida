package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.dq */
/* loaded from: classes19.dex */
public class C1979dq {

    /* renamed from: a */
    public Context f24780a;

    /* renamed from: b */
    public String f24781b;

    /* renamed from: c */
    public String f24782c;

    /* renamed from: d */
    public String f24783d;

    /* renamed from: e */
    public String f24784e;

    static {
        Covode.recordClassIndex(5590);
    }

    /* renamed from: a */
    public byte[] m16427a(int i) {
        return new byte[]{(byte) ((i >> 24) & MotionEventCompat.ACTION_MASK), (byte) ((i >> 16) & MotionEventCompat.ACTION_MASK), (byte) ((i >> 8) & MotionEventCompat.ACTION_MASK), (byte) (i & MotionEventCompat.ACTION_MASK)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r4 == null) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m16428a() {
        /*
            r7 = this;
            r6 = 0
            byte[] r5 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r7.f24782c     // Catch: java.lang.Throwable -> L4b
            com.amap.api.services.p126a.C1892bp.m16788a(r4, r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r7.f24783d     // Catch: java.lang.Throwable -> L4b
            com.amap.api.services.p126a.C1892bp.m16788a(r4, r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r7.f24781b     // Catch: java.lang.Throwable -> L4b
            com.amap.api.services.p126a.C1892bp.m16788a(r4, r0)     // Catch: java.lang.Throwable -> L4b
            android.content.Context r0 = r7.f24780a     // Catch: java.lang.Throwable -> L4b
            int r0 = com.amap.api.services.p126a.C1878bj.m16873s(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L4b
            com.amap.api.services.p126a.C1892bp.m16788a(r4, r0)     // Catch: java.lang.Throwable -> L4b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2d
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r6 = (int) r2     // Catch: java.lang.Throwable -> L2d
        L2d:
            byte[] r0 = r7.m16427a(r6)     // Catch: java.lang.Throwable -> L4b
            r4.write(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r7.f24784e     // Catch: java.lang.Throwable -> L4b
            byte[] r0 = r7.m16425b(r0)     // Catch: java.lang.Throwable -> L4b
            r4.write(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r7.f24784e     // Catch: java.lang.Throwable -> L4b
            byte[] r0 = com.amap.api.services.p126a.C1892bp.m16786a(r0)     // Catch: java.lang.Throwable -> L4b
            r4.write(r0)     // Catch: java.lang.Throwable -> L4b
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L4b
            goto L58
        L4b:
            r2 = move-exception
            goto L4f
        L4d:
            r2 = move-exception
            r4 = r0
        L4f:
            java.lang.String r1 = "se"
            java.lang.String r0 = "tds"
            com.amap.api.services.p126a.C1906cb.m16716c(r2, r1, r0)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L5b
        L58:
            r4.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            return r5
        L5c:
            r0 = move-exception
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Throwable -> L62
        L62:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C1979dq.m16428a():byte[]");
    }

    /* renamed from: a */
    public void m16426a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 65536) {
            this.f24784e = str;
            return;
        }
        throw new C1863be("无效的参数 - IllegalArgumentException");
    }

    /* renamed from: b */
    public byte[] m16425b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[]{0, 0};
        }
        byte[] m16786a = C1892bp.m16786a(this.f24784e);
        if (m16786a == null) {
            return new byte[]{0, 0};
        }
        int length = m16786a.length;
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    public C1979dq(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3) && str3.length() <= 256) {
            this.f24780a = context.getApplicationContext();
            this.f24782c = str;
            this.f24783d = str2;
            this.f24781b = str3;
            return;
        }
        throw new C1863be("无效的参数 - IllegalArgumentException");
    }
}
