package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.w */
/* loaded from: classes19.dex */
public class C1781w {

    /* renamed from: a */
    public long f24052a;

    /* renamed from: b */
    public long f24053b;

    /* renamed from: c */
    public double f24054c;

    /* renamed from: d */
    public double f24055d;

    static {
        Covode.recordClassIndex(5329);
    }

    /* renamed from: a */
    public int m17164a() {
        return (int) this.f24053b;
    }

    /* renamed from: b */
    public int m17162b() {
        return (int) this.f24052a;
    }

    /* renamed from: c */
    public long m17160c() {
        return this.f24053b;
    }

    /* renamed from: d */
    public long m17159d() {
        return this.f24052a;
    }

    /* renamed from: g */
    public C1781w m17156g() {
        return new C1781w(this.f24054c, this.f24055d, this.f24052a, this.f24053b);
    }

    public C1781w() {
        this.f24052a = Long.MIN_VALUE;
        this.f24053b = Long.MIN_VALUE;
        this.f24054c = Double.MIN_VALUE;
        this.f24055d = Double.MIN_VALUE;
        this.f24052a = 0L;
        this.f24053b = 0L;
    }

    /* renamed from: e */
    public double m17158e() {
        if (Double.doubleToLongBits(this.f24055d) == Double.doubleToLongBits(Double.MIN_VALUE)) {
            this.f24055d = (C1773r.m17196a(this.f24053b) * 2.003750834E7d) / 180.0d;
        }
        return this.f24055d;
    }

    public int hashCode() {
        long j = this.f24052a;
        long j2 = this.f24053b;
        long doubleToLongBits = Double.doubleToLongBits(this.f24054c);
        int i = ((((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f24055d);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    /* renamed from: f */
    public double m17157f() {
        if (Double.doubleToLongBits(this.f24054c) == Double.doubleToLongBits(Double.MIN_VALUE)) {
            this.f24054c = ((Math.log(Math.tan(((C1773r.m17196a(this.f24052a) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d;
        }
        return this.f24054c;
    }

    /* renamed from: a */
    public void m17163a(double d) {
        this.f24055d = d;
    }

    /* renamed from: b */
    public void m17161b(double d) {
        this.f24054c = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1781w c1781w = (C1781w) obj;
        if (this.f24052a == c1781w.f24052a && this.f24053b == c1781w.f24053b && Double.doubleToLongBits(this.f24054c) == Double.doubleToLongBits(c1781w.f24054c) && Double.doubleToLongBits(this.f24055d) == Double.doubleToLongBits(c1781w.f24055d)) {
            return true;
        }
        return false;
    }

    public C1781w(int i, int i2) {
        this.f24052a = Long.MIN_VALUE;
        this.f24053b = Long.MIN_VALUE;
        this.f24054c = Double.MIN_VALUE;
        this.f24055d = Double.MIN_VALUE;
        this.f24052a = i;
        this.f24053b = i2;
    }

    public C1781w(double d, double d2, boolean z) {
        this.f24052a = Long.MIN_VALUE;
        this.f24053b = Long.MIN_VALUE;
        this.f24054c = Double.MIN_VALUE;
        this.f24055d = Double.MIN_VALUE;
        if (z) {
            this.f24052a = (long) (d * 1000000.0d);
            this.f24053b = (long) (d2 * 1000000.0d);
            return;
        }
        this.f24054c = d;
        this.f24055d = d2;
    }

    public C1781w(double d, double d2, long j, long j2) {
        this.f24052a = Long.MIN_VALUE;
        this.f24053b = Long.MIN_VALUE;
        this.f24054c = Double.MIN_VALUE;
        this.f24055d = Double.MIN_VALUE;
        this.f24054c = d;
        this.f24055d = d2;
        this.f24052a = j;
        this.f24053b = j2;
    }
}
