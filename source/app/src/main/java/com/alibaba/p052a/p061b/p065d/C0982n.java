package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.b.d.n */
/* loaded from: classes13.dex */
public class C0982n {

    /* renamed from: com.alibaba.a.b.d.n$1 */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class C09831 {
        static {
            Covode.recordClassIndex(4293);
        }
    }

    /* renamed from: com.alibaba.a.b.d.n$a */
    /* loaded from: classes13.dex */
    public static class C0984a {

        /* renamed from: a */
        public int[] f21418a;

        /* renamed from: b */
        public int f21419b;

        /* renamed from: c */
        public int f21420c;

        static {
            Covode.recordClassIndex(4294);
        }

        public C0984a() {
            this.f21418a = new int[256];
        }

        public /* synthetic */ C0984a(C09831 c09831) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(4292);
    }

    /* renamed from: a */
    public static C0984a m20076a(String str) {
        if (str != null) {
            C0984a c0984a = new C0984a(null);
            int i = 0;
            int i2 = 0;
            do {
                c0984a.f21418a[i2] = i2;
                i2++;
            } while (i2 < 256);
            c0984a.f21419b = 0;
            c0984a.f21420c = 0;
            int i3 = 0;
            int i4 = 0;
            do {
                try {
                    i4 = ((str.charAt(i3) + c0984a.f21418a[i]) + i4) % 256;
                    int i5 = c0984a.f21418a[i];
                    int[] iArr = c0984a.f21418a;
                    iArr[i] = iArr[i4];
                    c0984a.f21418a[i4] = i5;
                    i3 = (i3 + 1) % str.length();
                    i++;
                } catch (Exception unused) {
                    return null;
                }
            } while (i < 256);
            return c0984a;
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m20075a(byte[] bArr, C0984a c0984a) {
        if (bArr == null || c0984a == null) {
            return null;
        }
        int i = c0984a.f21419b;
        int i2 = c0984a.f21420c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            i2 = (c0984a.f21418a[i] + i2) % 256;
            int i4 = c0984a.f21418a[i];
            int[] iArr = c0984a.f21418a;
            iArr[i] = iArr[i2];
            c0984a.f21418a[i2] = i4;
            int i5 = (c0984a.f21418a[i] + c0984a.f21418a[i2]) % 256;
            bArr[i3] = (byte) (c0984a.f21418a[i5] ^ bArr[i3]);
        }
        c0984a.f21419b = i;
        c0984a.f21420c = i2;
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m20074a(byte[] bArr, String str) {
        C0984a m20076a;
        if (bArr == null || str == null || (m20076a = m20076a(str)) == null) {
            return null;
        }
        return m20075a(bArr, m20076a);
    }
}
