package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

/* renamed from: com.alibaba.a.b.d.c */
/* loaded from: classes20.dex */
public class C0961c {

    /* renamed from: a */
    public static final /* synthetic */ boolean f21378a = !C0961c.class.desiredAssertionStatus();

    /* renamed from: com.alibaba.a.b.d.c$a */
    /* loaded from: classes20.dex */
    public static abstract class AbstractC0962a {

        /* renamed from: a */
        public byte[] f21379a;

        /* renamed from: b */
        public int f21380b;

        static {
            Covode.recordClassIndex(4272);
        }
    }

    /* renamed from: com.alibaba.a.b.d.c$b */
    /* loaded from: classes20.dex */
    public static class C0963b extends AbstractC0962a {

        /* renamed from: c */
        public static final int[] f21381c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: d */
        public static final int[] f21382d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: e */
        public int f21383e;

        /* renamed from: f */
        public int f21384f;

        /* renamed from: g */
        public final int[] f21385g;

        static {
            Covode.recordClassIndex(4273);
        }

        public C0963b(int i, byte[] bArr) {
            this.f21379a = bArr;
            this.f21385g = (i & 8) == 0 ? f21381c : f21382d;
            this.f21383e = 0;
            this.f21384f = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f0, code lost:
            if (r11 != 4) goto L30;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m20127a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p065d.C0961c.C0963b.m20127a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: com.alibaba.a.b.d.c$c */
    /* loaded from: classes20.dex */
    public static class C0964c extends AbstractC0962a {

        /* renamed from: g */
        public static final /* synthetic */ boolean f21386g = !C0961c.class.desiredAssertionStatus();

        /* renamed from: h */
        public static final byte[] f21387h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: i */
        public static final byte[] f21388i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        public int f21389c;

        /* renamed from: d */
        public final boolean f21390d;

        /* renamed from: e */
        public final boolean f21391e;

        /* renamed from: f */
        public final boolean f21392f;

        /* renamed from: j */
        public final byte[] f21393j;

        /* renamed from: k */
        public int f21394k;

        /* renamed from: l */
        public final byte[] f21395l;

        static {
            Covode.recordClassIndex(4274);
        }

        public C0964c(int i, byte[] bArr) {
            this.f21379a = bArr;
            boolean z = true;
            this.f21390d = (i & 1) == 0;
            this.f21391e = (i & 2) == 0;
            this.f21392f = (i & 4) == 0 ? false : z;
            this.f21395l = (i & 8) == 0 ? f21387h : f21388i;
            this.f21393j = new byte[2];
            this.f21389c = 0;
            this.f21394k = this.f21391e ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00eb A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b8 -> B:16:0x006a). Please submit an issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m20126a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 526
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p065d.C0961c.C0964c.m20126a(byte[], int, int, boolean):boolean");
        }
    }

    static {
        Covode.recordClassIndex(4271);
    }

    /* renamed from: a */
    public static byte[] m20132a(byte[] bArr, int i) {
        return m20131a(bArr, 0, bArr.length, i);
    }

    /* renamed from: a */
    public static byte[] m20131a(byte[] bArr, int i, int i2, int i3) {
        C0963b c0963b = new C0963b(i3, new byte[(i2 * 3) / 4]);
        if (c0963b.m20127a(bArr, i, i2, true)) {
            if (c0963b.f21380b == c0963b.f21379a.length) {
                return c0963b.f21379a;
            }
            byte[] bArr2 = new byte[c0963b.f21380b];
            System.arraycopy(c0963b.f21379a, 0, bArr2, 0, c0963b.f21380b);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    /* renamed from: b */
    public static String m20130b(byte[] bArr, int i) {
        try {
            return new String(m20128c(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static byte[] m20129b(byte[] bArr, int i, int i2, int i3) {
        C0964c c0964c = new C0964c(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!c0964c.f21390d) {
            int i6 = i2 % 3;
            if (i6 != 0) {
                if (i6 == 1) {
                    i4 += 2;
                } else if (i6 == 2) {
                    i4 += 3;
                }
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c0964c.f21391e && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!c0964c.f21392f) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        c0964c.f21379a = new byte[i4];
        c0964c.m20126a(bArr, i, i2, true);
        if (f21378a || c0964c.f21380b == i4) {
            return c0964c.f21379a;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static byte[] m20128c(byte[] bArr, int i) {
        return m20129b(bArr, 0, bArr.length, i);
    }
}
