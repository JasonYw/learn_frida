package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.dk */
/* loaded from: classes8.dex */
public class C1611dk {

    /* renamed from: a */
    public final int f23344a = 37;

    /* renamed from: b */
    public int f23345b = 17;

    static {
        Covode.recordClassIndex(5159);
    }

    /* renamed from: a */
    public int m17910a() {
        return this.f23345b;
    }

    /* renamed from: a */
    public C1611dk m17892a(boolean[] zArr) {
        if (zArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (boolean z : zArr) {
                m17901a(z);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17900a(byte[] bArr) {
        if (bArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (byte b : bArr) {
                m17909a(b);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17899a(char[] cArr) {
        if (cArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (char c : cArr) {
                m17908a(c);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17898a(double[] dArr) {
        if (dArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (double d : dArr) {
                m17907a(d);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17897a(float[] fArr) {
        if (fArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (float f : fArr) {
                m17906a(f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17896a(int[] iArr) {
        if (iArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (int i : iArr) {
                m17905a(i);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17895a(long[] jArr) {
        if (jArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (long j : jArr) {
                m17904a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17894a(Object[] objArr) {
        if (objArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (Object obj : objArr) {
                m17903a(obj);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1611dk m17893a(short[] sArr) {
        if (sArr == null) {
            this.f23345b *= this.f23344a;
        } else {
            for (short s : sArr) {
                m17902a(s);
            }
        }
        return this;
    }

    public int hashCode() {
        return m17910a();
    }

    /* renamed from: a */
    public C1611dk m17909a(byte b) {
        this.f23345b = (this.f23345b * this.f23344a) + b;
        return this;
    }

    /* renamed from: a */
    public C1611dk m17908a(char c) {
        this.f23345b = (this.f23345b * this.f23344a) + c;
        return this;
    }

    /* renamed from: a */
    public C1611dk m17907a(double d) {
        m17904a(Double.doubleToLongBits(d));
        return this;
    }

    /* renamed from: a */
    public C1611dk m17906a(float f) {
        this.f23345b = (this.f23345b * this.f23344a) + Float.floatToIntBits(f);
        return this;
    }

    /* renamed from: a */
    public C1611dk m17905a(int i) {
        this.f23345b = (this.f23345b * this.f23344a) + i;
        return this;
    }

    /* renamed from: a */
    public C1611dk m17904a(long j) {
        this.f23345b = (this.f23345b * this.f23344a) + ((int) (j ^ (j >> 32)));
        return this;
    }

    /* renamed from: a */
    public C1611dk m17903a(Object obj) {
        if (obj == null) {
            this.f23345b *= this.f23344a;
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                m17895a((long[]) obj);
                return this;
            } else if (obj instanceof int[]) {
                m17896a((int[]) obj);
                return this;
            } else if (obj instanceof short[]) {
                m17893a((short[]) obj);
                return this;
            } else if (obj instanceof char[]) {
                m17899a((char[]) obj);
                return this;
            } else if (obj instanceof byte[]) {
                m17900a((byte[]) obj);
                return this;
            } else if (obj instanceof double[]) {
                m17898a((double[]) obj);
                return this;
            } else if (obj instanceof float[]) {
                m17897a((float[]) obj);
                return this;
            } else if (obj instanceof boolean[]) {
                m17892a((boolean[]) obj);
                return this;
            } else {
                m17894a((Object[]) obj);
                return this;
            }
        } else {
            this.f23345b = (this.f23345b * this.f23344a) + obj.hashCode();
            return this;
        }
    }

    /* renamed from: a */
    public C1611dk m17902a(short s) {
        this.f23345b = (this.f23345b * this.f23344a) + s;
        return this;
    }

    /* renamed from: a */
    public C1611dk m17901a(boolean z) {
        this.f23345b = (this.f23345b * this.f23344a) + (!z ? 1 : 0);
        return this;
    }
}
