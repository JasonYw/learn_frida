package com.airbnb.lottie.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.model.b */
/* loaded from: classes19.dex */
public final class C0843b {
    public final String LIZ;
    public final String LIZIZ;
    public final double LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final int f21085LJ;
    public final double LJFF;
    public final double LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;

    static {
        Covode.recordClassIndex(4098);
    }

    public final int hashCode() {
        int hashCode = (((((int) ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.f21085LJ;
        long doubleToLongBits = Double.doubleToLongBits(this.LJFF);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.LJII;
    }

    public C0843b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, int i5, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = d;
        this.LIZLLL = i;
        this.f21085LJ = i2;
        this.LJFF = d2;
        this.LJI = d3;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = z;
    }
}
