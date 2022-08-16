package com.amap.api.mapcore2d;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;

/* renamed from: com.amap.api.mapcore2d.k */
/* loaded from: classes19.dex */
public class C1761k {

    /* renamed from: I */
    public static float f23947I = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: J */
    public static final float[] f23948J = new float[BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS];

    /* renamed from: K */
    public static final float[] f23949K = new float[BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS];

    /* renamed from: O */
    public static float f23950O;

    /* renamed from: P */
    public static float f23951P;

    /* renamed from: A */
    public float f23952A;

    /* renamed from: B */
    public float f23953B;

    /* renamed from: C */
    public boolean f23954C;

    /* renamed from: D */
    public Interpolator f23955D;

    /* renamed from: E */
    public boolean f23956E;

    /* renamed from: F */
    public float f23957F;

    /* renamed from: G */
    public int f23958G;

    /* renamed from: H */
    public float f23959H;

    /* renamed from: L */
    public float f23960L;

    /* renamed from: M */
    public final float f23961M;

    /* renamed from: N */
    public float f23962N;

    /* renamed from: a */
    public int f23963a;

    /* renamed from: b */
    public int f23964b;

    /* renamed from: c */
    public int f23965c;

    /* renamed from: d */
    public float f23966d;

    /* renamed from: e */
    public float f23967e;

    /* renamed from: f */
    public float f23968f;

    /* renamed from: g */
    public int f23969g;

    /* renamed from: h */
    public int f23970h;

    /* renamed from: i */
    public float f23971i;

    /* renamed from: j */
    public float f23972j;

    /* renamed from: k */
    public float f23973k;

    /* renamed from: l */
    public int f23974l;

    /* renamed from: m */
    public int f23975m;

    /* renamed from: n */
    public int f23976n;

    /* renamed from: o */
    public int f23977o;

    /* renamed from: p */
    public int f23978p;

    /* renamed from: q */
    public int f23979q;

    /* renamed from: r */
    public float f23980r;

    /* renamed from: s */
    public float f23981s;

    /* renamed from: t */
    public float f23982t;

    /* renamed from: u */
    public long f23983u;

    /* renamed from: v */
    public long f23984v;

    /* renamed from: w */
    public float f23985w;

    /* renamed from: x */
    public float f23986x;

    /* renamed from: y */
    public float f23987y;

    /* renamed from: z */
    public float f23988z;

    /* renamed from: b */
    public final int m17241b() {
        return this.f23978p;
    }

    /* renamed from: c */
    public final int m17239c() {
        return this.f23979q;
    }

    /* renamed from: d */
    public final float m17238d() {
        return this.f23980r;
    }

    /* renamed from: e */
    public final float m17237e() {
        return this.f23981s;
    }

    /* renamed from: f */
    public final float m17236f() {
        return this.f23982t;
    }

    /* renamed from: h */
    public final int m17234h() {
        return this.f23963a;
    }

    /* renamed from: a */
    public final boolean m17244a() {
        return this.f23954C;
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Covode.recordClassIndex(5309);
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                float f14 = i / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f4 * 0.175f) + (f2 * 0.35000002f)) * f5) + f6;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                    }
                    f13 = 1.0f;
                }
                f23948J[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f17 = 1.0f;
                while (true) {
                    f7 = ((f17 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f3 * f7 * f8;
                    f10 = f7 * f7 * f7;
                    float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f18 - f14) >= 1.0E-5d) {
                        if (f18 > f14) {
                            f17 = f7;
                        } else {
                            f12 = f7;
                        }
                        f = 2.0f;
                        f3 = 3.0f;
                    }
                }
                f23949K[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
                i++;
            } else {
                float[] fArr = f23948J;
                f23949K[100] = 1.0f;
                fArr[100] = 1.0f;
                f23950O = 8.0f;
                f23951P = 1.0f;
                f23951P = 1.0f / m17243a(1.0f);
                return;
            }
        }
    }

    /* renamed from: g */
    public boolean m17235g() {
        float interpolation;
        if (this.f23954C) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f23983u);
        long j = this.f23984v;
        if (currentAnimationTimeMillis < j) {
            int i = this.f23963a;
            if (i != 1) {
                if (i == 2) {
                    float f = currentAnimationTimeMillis * this.f23985w;
                    Interpolator interpolator = this.f23955D;
                    if (interpolator == null) {
                        interpolation = m17243a(f);
                    } else {
                        interpolation = interpolator.getInterpolation(f);
                    }
                    this.f23978p = this.f23964b + Math.round(this.f23986x * interpolation);
                    this.f23979q = this.f23965c + Math.round(this.f23987y * interpolation);
                    this.f23980r = this.f23966d + (this.f23988z * interpolation);
                    this.f23981s = this.f23967e + (this.f23952A * interpolation);
                    this.f23982t = this.f23968f + (interpolation * this.f23953B);
                }
            } else {
                float f2 = currentAnimationTimeMillis / ((float) j);
                int i2 = (int) (f2 * 100.0f);
                float f3 = 1.0f;
                float f4 = 0.0f;
                if (i2 < 100) {
                    float f5 = i2 / 100.0f;
                    int i3 = i2 + 1;
                    float[] fArr = f23948J;
                    float f6 = fArr[i2];
                    f4 = (fArr[i3] - f6) / ((i3 / 100.0f) - f5);
                    f3 = f6 + ((f2 - f5) * f4);
                }
                this.f23957F = ((f4 * this.f23958G) / ((float) this.f23984v)) * 1000.0f;
                int i4 = this.f23964b;
                this.f23978p = i4 + Math.round((this.f23969g - i4) * f3);
                this.f23978p = Math.min(this.f23978p, this.f23975m);
                this.f23978p = Math.max(this.f23978p, this.f23974l);
                int i5 = this.f23965c;
                this.f23979q = i5 + Math.round(f3 * (this.f23970h - i5));
                this.f23979q = Math.min(this.f23979q, this.f23977o);
                this.f23979q = Math.max(this.f23979q, this.f23976n);
                if (this.f23978p == this.f23969g && this.f23979q == this.f23970h) {
                    this.f23954C = true;
                    return true;
                }
            }
            return true;
        }
        this.f23978p = this.f23969g;
        this.f23979q = this.f23970h;
        this.f23980r = this.f23971i;
        this.f23981s = this.f23972j;
        this.f23982t = this.f23973k;
        this.f23954C = true;
        return true;
    }

    /* renamed from: a */
    public final void m17242a(boolean z) {
        this.f23954C = z;
    }

    public C1761k(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private float m17240b(float f) {
        return this.f23961M * 386.0878f * f;
    }

    /* renamed from: a */
    public static float m17243a(float f) {
        float exp;
        float f2 = f * f23950O;
        if (f2 < 1.0f) {
            exp = f2 - (1.0f - ((float) Math.exp(-f2)));
        } else {
            exp = 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
        }
        return exp * f23951P;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1761k(android.content.Context r3, android.view.animation.Interpolator r4) {
        /*
            r2 = this;
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 11
            if (r1 < r0) goto Lf
            r0 = 1
        Lb:
            r2.<init>(r3, r4, r0)
            return
        Lf:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1761k.<init>(android.content.Context, android.view.animation.Interpolator):void");
    }

    public C1761k(Context context, Interpolator interpolator, boolean z) {
        this.f23959H = ViewConfiguration.getScrollFriction();
        this.f23954C = true;
        this.f23955D = interpolator;
        this.f23961M = context.getResources().getDisplayMetrics().density * 160.0f;
        this.f23960L = m17240b(ViewConfiguration.getScrollFriction());
        this.f23956E = z;
        this.f23962N = m17240b(0.84f);
    }
}
