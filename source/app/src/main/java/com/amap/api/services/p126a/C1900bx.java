package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bx */
/* loaded from: classes8.dex */
public class C1900bx {

    /* renamed from: a */
    public final int f24551a = 37;

    /* renamed from: b */
    public int f24552b = 17;

    static {
        Covode.recordClassIndex(5511);
    }

    /* renamed from: a */
    public int m16761a() {
        return this.f24552b;
    }

    /* renamed from: a */
    public C1900bx m16743a(boolean[] zArr) {
        if (zArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (boolean z : zArr) {
                m16752a(z);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16751a(byte[] bArr) {
        if (bArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (byte b : bArr) {
                m16760a(b);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16750a(char[] cArr) {
        if (cArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (char c : cArr) {
                m16759a(c);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16749a(double[] dArr) {
        if (dArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (double d : dArr) {
                m16758a(d);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16748a(float[] fArr) {
        if (fArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (float f : fArr) {
                m16757a(f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16747a(int[] iArr) {
        if (iArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (int i : iArr) {
                m16756a(i);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16746a(long[] jArr) {
        if (jArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (long j : jArr) {
                m16755a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16745a(Object[] objArr) {
        if (objArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (Object obj : objArr) {
                m16754a(obj);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1900bx m16744a(short[] sArr) {
        if (sArr == null) {
            this.f24552b *= this.f24551a;
        } else {
            for (short s : sArr) {
                m16753a(s);
            }
        }
        return this;
    }

    public int hashCode() {
        return m16761a();
    }

    /* renamed from: a */
    public C1900bx m16760a(byte b) {
        this.f24552b = (this.f24552b * this.f24551a) + b;
        return this;
    }

    /* renamed from: a */
    public C1900bx m16759a(char c) {
        this.f24552b = (this.f24552b * this.f24551a) + c;
        return this;
    }

    /* renamed from: a */
    public C1900bx m16758a(double d) {
        m16755a(Double.doubleToLongBits(d));
        return this;
    }

    /* renamed from: a */
    public C1900bx m16757a(float f) {
        this.f24552b = (this.f24552b * this.f24551a) + Float.floatToIntBits(f);
        return this;
    }

    /* renamed from: a */
    public C1900bx m16756a(int i) {
        this.f24552b = (this.f24552b * this.f24551a) + i;
        return this;
    }

    /* renamed from: a */
    public C1900bx m16755a(long j) {
        this.f24552b = (this.f24552b * this.f24551a) + ((int) (j ^ (j >> 32)));
        return this;
    }

    /* renamed from: a */
    public C1900bx m16754a(Object obj) {
        if (obj == null) {
            this.f24552b *= this.f24551a;
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                m16746a((long[]) obj);
                return this;
            } else if (obj instanceof int[]) {
                m16747a((int[]) obj);
                return this;
            } else if (obj instanceof short[]) {
                m16744a((short[]) obj);
                return this;
            } else if (obj instanceof char[]) {
                m16750a((char[]) obj);
                return this;
            } else if (obj instanceof byte[]) {
                m16751a((byte[]) obj);
                return this;
            } else if (obj instanceof double[]) {
                m16749a((double[]) obj);
                return this;
            } else if (obj instanceof float[]) {
                m16748a((float[]) obj);
                return this;
            } else if (obj instanceof boolean[]) {
                m16743a((boolean[]) obj);
                return this;
            } else {
                m16745a((Object[]) obj);
                return this;
            }
        } else {
            this.f24552b = (this.f24552b * this.f24551a) + obj.hashCode();
            return this;
        }
    }

    /* renamed from: a */
    public C1900bx m16753a(short s) {
        this.f24552b = (this.f24552b * this.f24551a) + s;
        return this;
    }

    /* renamed from: a */
    public C1900bx m16752a(boolean z) {
        this.f24552b = (this.f24552b * this.f24551a) + (!z ? 1 : 0);
        return this;
    }
}
