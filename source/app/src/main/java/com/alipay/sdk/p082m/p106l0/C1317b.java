package com.alipay.sdk.p082m.p106l0;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

/* renamed from: com.alipay.sdk.m.l0.b */
/* loaded from: classes20.dex */
public class C1317b {

    /* renamed from: a */
    public static final /* synthetic */ boolean f22210a = !C1317b.class.desiredAssertionStatus();

    /* renamed from: com.alipay.sdk.m.l0.b$a */
    /* loaded from: classes20.dex */
    public static abstract class AbstractC1318a {

        /* renamed from: a */
        public byte[] f22211a;

        /* renamed from: b */
        public int f22212b;

        static {
            Covode.recordClassIndex(4818);
        }
    }

    static {
        Covode.recordClassIndex(4817);
    }

    /* renamed from: com.alipay.sdk.m.l0.b$c */
    /* loaded from: classes20.dex */
    public static class C1320c extends AbstractC1318a {

        /* renamed from: c */
        public final byte[] f22221c;

        /* renamed from: d */
        public int f22222d;

        /* renamed from: e */
        public int f22223e;

        /* renamed from: f */
        public final boolean f22224f;

        /* renamed from: g */
        public final boolean f22225g;

        /* renamed from: h */
        public final boolean f22226h;

        /* renamed from: i */
        public final byte[] f22227i;

        /* renamed from: l */
        public static final /* synthetic */ boolean f22220l = !C1317b.class.desiredAssertionStatus();

        /* renamed from: j */
        public static final byte[] f22218j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        public static final byte[] f22219k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        static {
            Covode.recordClassIndex(4820);
        }

        public C1320c(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.f22211a = bArr;
            boolean z3 = true;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f22224f = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f22225g = z2;
            this.f22226h = (i & 4) == 0 ? false : z3;
            if ((i & 8) == 0) {
                bArr2 = f22218j;
            } else {
                bArr2 = f22219k;
            }
            this.f22227i = bArr2;
            this.f22221c = new byte[2];
            this.f22222d = 0;
            if (this.f22225g) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.f22223e = i2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b3 -> B:15:0x0065). Please submit an issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m19155a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 519
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p106l0.C1317b.C1320c.m19155a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: com.alipay.sdk.m.l0.b$b */
    /* loaded from: classes20.dex */
    public static class C1319b extends AbstractC1318a {

        /* renamed from: f */
        public static final int[] f22213f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g */
        public static final int[] f22214g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c */
        public int f22215c;

        /* renamed from: d */
        public int f22216d;

        /* renamed from: e */
        public final int[] f22217e;

        static {
            Covode.recordClassIndex(4819);
        }

        public C1319b(int i, byte[] bArr) {
            int[] iArr;
            this.f22211a = bArr;
            if ((i & 8) == 0) {
                iArr = f22213f;
            } else {
                iArr = f22214g;
            }
            this.f22217e = iArr;
            this.f22215c = 0;
            this.f22216d = 0;
        }

        /* renamed from: a */
        public boolean m19156a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = i;
            int i4 = this.f22215c;
            if (i4 == 6) {
                return false;
            }
            int i5 = i2 + i3;
            int i6 = this.f22216d;
            byte[] bArr2 = this.f22211a;
            int[] iArr = this.f22217e;
            int i7 = 0;
            while (i3 < i5) {
                if (i4 == 0) {
                    while (true) {
                        int i8 = i3 + 4;
                        if (i8 > i5 || (i6 = (iArr[bArr[i3] & 255] << 18) | (iArr[bArr[i3 + 1] & 255] << 12) | (iArr[bArr[i3 + 2] & 255] << 6) | iArr[bArr[i3 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i7 + 2] = (byte) i6;
                        bArr2[i7 + 1] = (byte) (i6 >> 8);
                        bArr2[i7] = (byte) (i6 >> 16);
                        i7 += 3;
                        i3 = i8;
                    }
                    if (i3 >= i5) {
                        break;
                    }
                }
                int i9 = i3 + 1;
                int i10 = iArr[bArr[i3] & 255];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5 && i10 != -1) {
                                        this.f22215c = 6;
                                        return false;
                                    }
                                } else if (i10 == -2) {
                                    i4 = 5;
                                } else if (i10 != -1) {
                                    this.f22215c = 6;
                                    return false;
                                }
                            } else if (i10 >= 0) {
                                int i11 = i10 | (i6 << 6);
                                bArr2[i7 + 2] = (byte) i11;
                                bArr2[i7 + 1] = (byte) (i11 >> 8);
                                bArr2[i7] = (byte) (i11 >> 16);
                                i7 += 3;
                                i6 = i11;
                                i4 = 0;
                            } else if (i10 == -2) {
                                bArr2[i7 + 1] = (byte) (i6 >> 2);
                                bArr2[i7] = (byte) (i6 >> 10);
                                i7 += 2;
                                i4 = 5;
                            } else if (i10 != -1) {
                                this.f22215c = 6;
                                return false;
                            }
                        } else {
                            if (i10 < 0) {
                                if (i10 == -2) {
                                    bArr2[i7] = (byte) (i6 >> 4);
                                    i7++;
                                    i4 = 4;
                                } else if (i10 != -1) {
                                    this.f22215c = 6;
                                    return false;
                                }
                            }
                            i10 |= i6 << 6;
                        }
                    } else {
                        if (i10 < 0) {
                            if (i10 != -1) {
                                this.f22215c = 6;
                                return false;
                            }
                        }
                        i10 |= i6 << 6;
                    }
                    i4++;
                    i6 = i10;
                } else {
                    if (i10 < 0) {
                        if (i10 != -1) {
                            this.f22215c = 6;
                            return false;
                        }
                    }
                    i4++;
                    i6 = i10;
                }
                i3 = i9;
            }
            if (!z) {
                this.f22215c = i4;
                this.f22216d = i6;
                this.f22212b = i7;
                return true;
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            this.f22215c = 6;
                            return false;
                        }
                    } else {
                        int i12 = i7 + 1;
                        bArr2[i7] = (byte) (i6 >> 10);
                        i7 = i12 + 1;
                        bArr2[i12] = (byte) (i6 >> 2);
                    }
                } else {
                    bArr2[i7] = (byte) (i6 >> 4);
                    i7++;
                }
                this.f22215c = i4;
                this.f22212b = i7;
                return true;
            } else {
                this.f22215c = 6;
                return false;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m19161a(byte[] bArr, int i) {
        return m19160a(bArr, 0, bArr.length, i);
    }

    /* renamed from: b */
    public static byte[] m19159b(byte[] bArr, int i) {
        return m19158b(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    public static String m19157c(byte[] bArr, int i) {
        try {
            return new String(m19159b(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[] m19160a(byte[] bArr, int i, int i2, int i3) {
        C1319b c1319b = new C1319b(i3, new byte[(i2 * 3) / 4]);
        if (c1319b.m19156a(bArr, i, i2, true)) {
            int i4 = c1319b.f22212b;
            byte[] bArr2 = c1319b.f22211a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    /* renamed from: b */
    public static byte[] m19158b(byte[] bArr, int i, int i2, int i3) {
        C1320c c1320c = new C1320c(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (c1320c.f22224f) {
            if (i2 % 3 > 0) {
                i4 += 4;
            }
        } else {
            int i6 = i2 % 3;
            if (i6 != 1) {
                if (i6 == 2) {
                    i4 += 3;
                }
            } else {
                i4 += 2;
            }
        }
        if (c1320c.f22225g && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!c1320c.f22226h) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        c1320c.f22211a = new byte[i4];
        c1320c.m19155a(bArr, i, i2, true);
        if (!f22210a && c1320c.f22212b != i4) {
            throw new AssertionError();
        }
        return c1320c.f22211a;
    }
}
