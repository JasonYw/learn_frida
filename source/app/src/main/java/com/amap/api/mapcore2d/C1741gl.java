package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.amap.api.mapcore2d.gl */
/* loaded from: classes19.dex */
public final class C1741gl {

    /* renamed from: a */
    public HashMap<Long, C1742gm> f23731a = new HashMap<>();

    /* renamed from: b */
    public long f23732b = 0;

    static {
        Covode.recordClassIndex(5289);
    }

    /* renamed from: a */
    public static long m17428a(int i, int i2) {
        return (i2 & 65535) | ((i & 65535) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m17427a(com.amap.api.mapcore2d.C1742gm r9) {
        /*
            r8 = this;
            r2 = 0
            if (r9 == 0) goto L77
            boolean r0 = r9.f23748p
            if (r0 == 0) goto L77
            java.util.HashMap<java.lang.Long, com.amap.api.mapcore2d.gm> r4 = r8.f23731a
            int r1 = r9.f23743k
            r0 = 1
            if (r1 == r0) goto L3d
            r0 = 2
            if (r1 == r0) goto L34
            r0 = 3
            if (r1 == r0) goto L3d
            r0 = 4
            if (r1 == r0) goto L3d
            r6 = 0
        L1a:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r5 = r4.get(r0)
            com.amap.api.mapcore2d.gm r5 = (com.amap.api.mapcore2d.C1742gm) r5
            if (r5 != 0) goto L4a
            long r0 = com.amap.api.mapcore2d.C1757gy.m17265b()
            r9.f23745m = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.put(r0, r9)
            return r2
        L34:
            int r1 = r9.m17423c()
            int r0 = r9.m17422d()
            goto L45
        L3d:
            int r1 = r9.m17425a()
            int r0 = r9.m17424b()
        L45:
            long r6 = m17428a(r1, r0)
            goto L1a
        L4a:
            int r1 = r5.m17421e()
            int r0 = r9.m17421e()
            if (r1 == r0) goto L62
            long r0 = com.amap.api.mapcore2d.C1757gy.m17265b()
            r9.f23745m = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.put(r0, r9)
            return r2
        L62:
            long r0 = r5.f23745m
            r9.f23745m = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.put(r0, r9)
            long r2 = com.amap.api.mapcore2d.C1757gy.m17265b()
            long r0 = r5.f23745m
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1741gl.m17427a(com.amap.api.mapcore2d.gm):long");
    }

    /* renamed from: a */
    public final void m17429a() {
        this.f23731a.clear();
        this.f23732b = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r0 != 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r0 != 4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17426a(java.util.ArrayList<? extends com.amap.api.mapcore2d.C1742gm> r18) {
        /*
            r17 = this;
            r12 = r18
            if (r12 == 0) goto Lad
            long r3 = com.amap.api.mapcore2d.C1757gy.m17265b()
            r13 = r17
            long r1 = r13.f23732b
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r5 = r3 - r1
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1c
            return
        L1c:
            java.util.HashMap<java.lang.Long, com.amap.api.mapcore2d.gm> r11 = r13.f23731a
            int r14 = r12.size()
            r10 = 0
            r15 = 0
            r5 = 0
        L26:
            r9 = 4
            r8 = 3
            r7 = 2
            r6 = 1
            if (r5 >= r14) goto L6e
            java.lang.Object r2 = r12.get(r5)
            com.amap.api.mapcore2d.gm r2 = (com.amap.api.mapcore2d.C1742gm) r2
            boolean r0 = r2.f23748p
            if (r0 == 0) goto L5a
            int r0 = r2.f23743k
            if (r0 == r6) goto L60
            if (r0 == r7) goto L65
            if (r0 == r8) goto L60
            if (r0 == r9) goto L60
        L40:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r6 = r11.get(r0)
            com.amap.api.mapcore2d.gm r6 = (com.amap.api.mapcore2d.C1742gm) r6
            if (r6 == 0) goto L5a
            int r1 = r6.m17421e()
            int r0 = r2.m17421e()
            if (r1 != r0) goto L5d
            long r0 = r6.f23745m
            r2.f23745m = r0
        L5a:
            int r5 = r5 + 1
            goto L26
        L5d:
            r2.f23745m = r3
            goto L5a
        L60:
            int r1 = r2.f23735c
            int r0 = r2.f23736d
            goto L69
        L65:
            int r1 = r2.f23740h
            int r0 = r2.f23741i
        L69:
            long r15 = m17428a(r1, r0)
            goto L40
        L6e:
            r11.clear()
            int r5 = r12.size()
        L75:
            if (r10 >= r5) goto Lab
            java.lang.Object r2 = r12.get(r10)
            com.amap.api.mapcore2d.gm r2 = (com.amap.api.mapcore2d.C1742gm) r2
            boolean r0 = r2.f23748p
            if (r0 == 0) goto L92
            int r0 = r2.f23743k
            if (r0 == r6) goto L95
            if (r0 == r7) goto L9e
            if (r0 == r8) goto L95
            if (r0 == r9) goto L95
        L8b:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r11.put(r0, r2)
        L92:
            int r10 = r10 + 1
            goto L75
        L95:
            int r1 = r2.m17425a()
            int r0 = r2.m17424b()
            goto La6
        L9e:
            int r1 = r2.m17423c()
            int r0 = r2.m17422d()
        La6:
            long r15 = m17428a(r1, r0)
            goto L8b
        Lab:
            r13.f23732b = r3
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1741gl.m17426a(java.util.ArrayList):void");
    }
}
