package androidx.core.graphics;

import android.graphics.Path;
import com.alipay.sdk.app.OpenAuthTask;
import com.bytedance.covode.number.Covode;
import p003X.C138524cyu;

/* loaded from: classes17.dex */
public class c$b {
    public char LIZ;
    public float[] LIZIZ;

    static {
        Covode.recordClassIndex(981);
    }

    public c$b(c$b c_b) {
        this.LIZ = c_b.LIZ;
        float[] fArr = c_b.LIZIZ;
        this.LIZIZ = C138524cyu.LIZ(fArr, 0, fArr.length);
    }

    public c$b(char c, float[] fArr) {
        this.LIZ = c;
        this.LIZIZ = fArr;
    }

    public static void LIZ(c$b[] c_bArr, Path path) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float[] fArr = new float[6];
        char c = 0;
        char c2 = 'm';
        int i2 = 0;
        while (i2 < c_bArr.length) {
            char c3 = c_bArr[i2].LIZ;
            float[] fArr2 = c_bArr[i2].LIZIZ;
            float f8 = fArr[c];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case OpenAuthTask.f22015g /* 122 */:
                    path.close();
                    path.moveTo(f12, f13);
                    f8 = f12;
                    f10 = f8;
                    f9 = f13;
                    f11 = f9;
                default:
                    i = 2;
                    break;
            }
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 != 'C') {
                        if (c3 != 'H') {
                            if (c3 != 'Q') {
                                if (c3 != 'V') {
                                    if (c3 != 'a') {
                                        if (c3 != 'c') {
                                            if (c3 != 'h') {
                                                if (c3 != 'q') {
                                                    if (c3 != 'v') {
                                                        if (c3 != 'L') {
                                                            if (c3 != 'M') {
                                                                if (c3 != 'S') {
                                                                    if (c3 != 'T') {
                                                                        if (c3 != 'l') {
                                                                            if (c3 != 'm') {
                                                                                if (c3 != 's') {
                                                                                    if (c3 == 't') {
                                                                                        if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                                                                            f7 = 0.0f;
                                                                                            f6 = 0.0f;
                                                                                        } else {
                                                                                            f6 = f8 - f10;
                                                                                            f7 = f9 - f11;
                                                                                        }
                                                                                        int i4 = i3 + 0;
                                                                                        int i5 = i3 + 1;
                                                                                        path.rQuadTo(f6, f7, fArr2[i4], fArr2[i5]);
                                                                                        f10 = f6 + f8;
                                                                                        f11 = f7 + f9;
                                                                                        f8 += fArr2[i4];
                                                                                        f9 += fArr2[i5];
                                                                                    }
                                                                                } else {
                                                                                    if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                                                                        f4 = 0.0f;
                                                                                        f5 = 0.0f;
                                                                                    } else {
                                                                                        f4 = f8 - f10;
                                                                                        f5 = f9 - f11;
                                                                                    }
                                                                                    int i6 = i3 + 0;
                                                                                    int i7 = i3 + 1;
                                                                                    int i8 = i3 + 2;
                                                                                    int i9 = i3 + 3;
                                                                                    path.rCubicTo(f4, f5, fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                                                                                    f10 = f8 + fArr2[i6];
                                                                                    f11 = f9 + fArr2[i7];
                                                                                    f = fArr2[i8] + f8;
                                                                                    f2 = fArr2[i9];
                                                                                }
                                                                            } else {
                                                                                int i10 = i3 + 0;
                                                                                f8 += fArr2[i10];
                                                                                int i11 = i3 + 1;
                                                                                f9 += fArr2[i11];
                                                                                if (i3 > 0) {
                                                                                    path.rLineTo(fArr2[i10], fArr2[i11]);
                                                                                } else {
                                                                                    path.rMoveTo(fArr2[i10], fArr2[i11]);
                                                                                    f13 = f9;
                                                                                    f12 = f8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i12 = i3 + 0;
                                                                            int i13 = i3 + 1;
                                                                            path.rLineTo(fArr2[i12], fArr2[i13]);
                                                                            f8 += fArr2[i12];
                                                                            f3 = fArr2[i13];
                                                                        }
                                                                    } else {
                                                                        float f14 = f9;
                                                                        float f15 = f8;
                                                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                                            f15 = (f15 * 2.0f) - f10;
                                                                            f14 = (f14 * 2.0f) - f11;
                                                                        }
                                                                        int i14 = i3 + 0;
                                                                        int i15 = i3 + 1;
                                                                        path.quadTo(f15, f14, fArr2[i14], fArr2[i15]);
                                                                        f8 = fArr2[i14];
                                                                        f9 = fArr2[i15];
                                                                        f11 = f14;
                                                                        c3 = 'T';
                                                                        f10 = f15;
                                                                    }
                                                                } else {
                                                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                                        f8 = (f8 * 2.0f) - f10;
                                                                        f9 = (f9 * 2.0f) - f11;
                                                                    }
                                                                    int i16 = i3 + 0;
                                                                    int i17 = i3 + 1;
                                                                    int i18 = i3 + 2;
                                                                    int i19 = i3 + 3;
                                                                    path.cubicTo(f8, f9, fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                                    f10 = fArr2[i16];
                                                                    f11 = fArr2[i17];
                                                                    f8 = fArr2[i18];
                                                                    f9 = fArr2[i19];
                                                                }
                                                            } else {
                                                                int i20 = i3 + 0;
                                                                f8 = fArr2[i20];
                                                                int i21 = i3 + 1;
                                                                f9 = fArr2[i21];
                                                                if (i3 > 0) {
                                                                    path.lineTo(fArr2[i20], fArr2[i21]);
                                                                } else {
                                                                    path.moveTo(fArr2[i20], fArr2[i21]);
                                                                    f13 = f9;
                                                                    f12 = f8;
                                                                }
                                                            }
                                                        } else {
                                                            int i22 = i3 + 0;
                                                            int i23 = i3 + 1;
                                                            path.lineTo(fArr2[i22], fArr2[i23]);
                                                            f8 = fArr2[i22];
                                                            f9 = fArr2[i23];
                                                        }
                                                    } else {
                                                        int i24 = i3 + 0;
                                                        path.rLineTo(0.0f, fArr2[i24]);
                                                        f3 = fArr2[i24];
                                                    }
                                                    f9 += f3;
                                                } else {
                                                    int i25 = i3 + 0;
                                                    int i26 = i3 + 1;
                                                    int i27 = i3 + 2;
                                                    int i28 = i3 + 3;
                                                    path.rQuadTo(fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                                    f10 = fArr2[i25] + f8;
                                                    f11 = f9 + fArr2[i26];
                                                    float f16 = fArr2[i27] + f8;
                                                    f9 += fArr2[i28];
                                                    f8 = f16;
                                                    c3 = 'q';
                                                }
                                            } else {
                                                int i29 = i3 + 0;
                                                path.rLineTo(fArr2[i29], 0.0f);
                                                f8 += fArr2[i29];
                                            }
                                        } else {
                                            int i30 = i3 + 2;
                                            int i31 = i3 + 3;
                                            int i32 = i3 + 4;
                                            int i33 = i3 + 5;
                                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                            f10 = f8 + fArr2[i30];
                                            f11 = f9 + fArr2[i31];
                                            f = fArr2[i32] + f8;
                                            f2 = fArr2[i33];
                                        }
                                        f9 += f2;
                                        f8 = f;
                                    } else {
                                        int i34 = i3 + 5;
                                        float f17 = fArr2[i34] + f8;
                                        int i35 = i3 + 6;
                                        float f18 = fArr2[i35] + f9;
                                        float f19 = fArr2[i3 + 0];
                                        float f20 = fArr2[i3 + 1];
                                        float f21 = fArr2[i3 + 2];
                                        if (fArr2[i3 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr2[i3 + 4] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        c3 = 'a';
                                        LIZ(path, f8, f9, f17, f18, f19, f20, f21, z3, z4);
                                        f8 += fArr2[i34];
                                        f9 += fArr2[i35];
                                    }
                                } else {
                                    c3 = 'V';
                                    int i36 = i3 + 0;
                                    path.lineTo(f8, fArr2[i36]);
                                    f9 = fArr2[i36];
                                }
                            } else {
                                c3 = 'Q';
                                int i37 = i3 + 0;
                                int i38 = i3 + 1;
                                int i39 = i3 + 2;
                                int i40 = i3 + 3;
                                path.quadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                f10 = fArr2[i37];
                                f11 = fArr2[i38];
                                f8 = fArr2[i39];
                                f9 = fArr2[i40];
                            }
                        } else {
                            c3 = 'H';
                            int i41 = i3 + 0;
                            path.lineTo(fArr2[i41], f9);
                            f8 = fArr2[i41];
                        }
                    } else {
                        c3 = 'C';
                        int i42 = i3 + 2;
                        int i43 = i3 + 3;
                        int i44 = i3 + 4;
                        int i45 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i42], fArr2[i43], fArr2[i44], fArr2[i45]);
                        f8 = fArr2[i44];
                        f9 = fArr2[i45];
                        f10 = fArr2[i42];
                        f11 = fArr2[i43];
                    }
                    i3 += i;
                    c2 = c3;
                    c3 = c2;
                } else {
                    c3 = 'A';
                    int i46 = i3 + 5;
                    float f22 = fArr2[i46];
                    int i47 = i3 + 6;
                    float f23 = fArr2[i47];
                    float f24 = fArr2[i3 + 0];
                    float f25 = fArr2[i3 + 1];
                    float f26 = fArr2[i3 + 2];
                    if (fArr2[i3 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i3 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LIZ(path, f8, f9, f22, f23, f24, f25, f26, z, z2);
                    f8 = fArr2[i46];
                    f9 = fArr2[i47];
                }
                f11 = f9;
                f10 = f8;
                i3 += i;
                c2 = c3;
                c3 = c2;
            }
            fArr[0] = f8;
            fArr[1] = f9;
            fArr[2] = f10;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f13;
            c2 = c_bArr[i2].LIZ;
            i2++;
            c = 0;
        }
    }

    public final void LIZ(c$b c_b, c$b c_b2, float f) {
        this.LIZ = c_b.LIZ;
        int i = 0;
        while (true) {
            float[] fArr = c_b.LIZIZ;
            if (i < fArr.length) {
                this.LIZIZ[i] = (fArr[i] * (1.0f - f)) + (c_b2.LIZIZ[i] * f);
                i++;
            } else {
                return;
            }
        }
    }

    public static void LIZ(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5;
        double d11 = d6;
        int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d3;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        int i = 0;
        while (i < ceil) {
            double d20 = d8 + d19;
            double sin3 = Math.sin(d20);
            double cos3 = Math.cos(d20);
            double d21 = (d + ((d3 * cos) * cos3)) - (d14 * sin3);
            double d22 = d2 + (d3 * sin * cos3) + (d17 * sin3);
            double d23 = (d13 * sin3) - (d14 * cos3);
            double d24 = (sin3 * d16) + (cos3 * d17);
            double d25 = d20 - d8;
            double tan = Math.tan(d25 / 2.0d);
            double sin4 = (Math.sin(d25) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d10 + (d15 * sin4)), (float) (d11 + (d18 * sin4)), (float) (d21 - (sin4 * d23)), (float) (d22 - (sin4 * d24)), (float) d21, (float) d22);
            i++;
            d11 = d22;
            d8 = d20;
            d18 = d24;
            d15 = d23;
            d10 = d21;
        }
    }

    public static void LIZ(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        boolean z3;
        float f8 = f6;
        float f9 = f5;
        while (true) {
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f9;
            double d6 = ((d3 * cos) + (d4 * sin)) / d5;
            double d7 = f8;
            double d8 = (((-f) * sin) + (d4 * cos)) / d7;
            double d9 = f4;
            double d10 = ((f3 * cos) + (d9 * sin)) / d5;
            double d11 = (((-f3) * sin) + (d9 * cos)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d12 * d12) + (d13 * d13);
            if (d16 == 0.0d) {
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < 0.0d) {
                float sqrt = (float) (Math.sqrt(d16) / 1.99999d);
                f9 *= sqrt;
                f8 *= sqrt;
            } else {
                double sqrt2 = Math.sqrt(d17);
                double d18 = d12 * sqrt2;
                double d19 = sqrt2 * d13;
                if (z == z2) {
                    d = d14 - d19;
                    d2 = d15 + d18;
                } else {
                    d = d14 + d19;
                    d2 = d15 - d18;
                }
                double atan2 = Math.atan2(d8 - d2, d6 - d);
                double atan22 = Math.atan2(d11 - d2, d10 - d) - atan2;
                int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                if (i >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 != z3) {
                    if (i > 0) {
                        atan22 -= 6.283185307179586d;
                    } else {
                        atan22 += 6.283185307179586d;
                    }
                }
                double d20 = d * d5;
                double d21 = d2 * d7;
                LIZ(path, (d20 * cos) - (d21 * sin), (d20 * sin) + (d21 * cos), d5, d7, d3, d4, radians, atan2, atan22);
                return;
            }
        }
    }
}
