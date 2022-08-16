package com.alipay.sdk.p082m.p106l0;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.l0.e */
/* loaded from: classes13.dex */
public class C1323e {

    /* renamed from: com.alipay.sdk.m.l0.e$a */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class C1324a {
        static {
            Covode.recordClassIndex(4824);
        }
    }

    static {
        Covode.recordClassIndex(4823);
    }

    /* renamed from: com.alipay.sdk.m.l0.e$b */
    /* loaded from: classes13.dex */
    public static class C1325b {

        /* renamed from: a */
        public int[] f22228a;

        /* renamed from: b */
        public int f22229b;

        /* renamed from: c */
        public int f22230c;

        static {
            Covode.recordClassIndex(4825);
        }

        public C1325b() {
            this.f22228a = new int[256];
        }

        public /* synthetic */ C1325b(C1324a c1324a) {
            this();
        }
    }

    /* renamed from: a */
    public static byte[] m19147a(byte[] bArr) {
        C1325b m19148a;
        if (bArr != null && (m19148a = m19148a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) != null) {
            return m19146a(bArr, m19148a);
        }
        return null;
    }

    /* renamed from: a */
    public static C1325b m19148a(String str) {
        if (str == null) {
            return null;
        }
        C1325b c1325b = new C1325b(null);
        int i = 0;
        int i2 = 0;
        do {
            c1325b.f22228a[i2] = i2;
            i2++;
        } while (i2 < 256);
        c1325b.f22229b = 0;
        c1325b.f22230c = 0;
        int i3 = 0;
        int i4 = 0;
        do {
            try {
                i4 = ((str.charAt(i3) + c1325b.f22228a[i]) + i4) % 256;
                int i5 = c1325b.f22228a[i];
                c1325b.f22228a[i] = c1325b.f22228a[i4];
                c1325b.f22228a[i4] = i5;
                i3 = (i3 + 1) % str.length();
                i++;
            } catch (Exception unused) {
                return null;
            }
        } while (i < 256);
        return c1325b;
    }

    /* renamed from: a */
    public static byte[] m19146a(byte[] bArr, C1325b c1325b) {
        if (bArr != null && c1325b != null) {
            int i = c1325b.f22229b;
            int i2 = c1325b.f22230c;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                i = (i + 1) % 256;
                int[] iArr = c1325b.f22228a;
                i2 = (iArr[i] + i2) % 256;
                int i4 = iArr[i];
                iArr[i] = iArr[i2];
                iArr[i2] = i4;
                int i5 = (iArr[i] + iArr[i2]) % 256;
                bArr[i3] = (byte) (iArr[i5] ^ bArr[i3]);
            }
            c1325b.f22229b = i;
            c1325b.f22230c = i2;
            return bArr;
        }
        return null;
    }
}
