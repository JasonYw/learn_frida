package androidx.palette.graphics;

import androidx.palette.graphics.Palette;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p003X.C142875e7J;

/* loaded from: classes18.dex */
public class a$a {
    public int LIZ;
    public final /* synthetic */ C142875e7J LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f20274LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    static {
        Covode.recordClassIndex(1595);
    }

    private int LJFF() {
        return (this.LIZ + 1) - this.LIZJ;
    }

    public final boolean LIZIZ() {
        if (LJFF() > 1) {
            return true;
        }
        return false;
    }

    public final int LIZ() {
        return ((this.LJFF - this.f20274LJ) + 1) * ((this.LJII - this.LJI) + 1) * ((this.LJIIIZ - this.LJIIIIZZ) + 1);
    }

    public final void LIZJ() {
        int[] iArr = this.LIZIZ.LIZ;
        int[] iArr2 = this.LIZIZ.LIZIZ;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.LIZJ; i8 <= this.LIZ; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int LIZ = C142875e7J.LIZ(i9);
            int LIZIZ = C142875e7J.LIZIZ(i9);
            int LIZJ = C142875e7J.LIZJ(i9);
            if (LIZ > i2) {
                i2 = LIZ;
            }
            if (LIZ < i) {
                i = LIZ;
            }
            if (LIZIZ > i4) {
                i4 = LIZIZ;
            }
            if (LIZIZ < i3) {
                i3 = LIZIZ;
            }
            if (LIZJ > i6) {
                i6 = LIZJ;
            }
            if (LIZJ < i5) {
                i5 = LIZJ;
            }
        }
        this.f20274LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        this.LIZLLL = i7;
    }

    public final int LIZLLL() {
        int i;
        int i2 = this.LJFF - this.f20274LJ;
        int i3 = this.LJII - this.LJI;
        int i4 = this.LJIIIZ - this.LJIIIIZZ;
        if (i2 >= i3 && i2 >= i4) {
            i = -3;
        } else if (i3 >= i2 && i3 >= i4) {
            i = -2;
        } else {
            i = -1;
        }
        int[] iArr = this.LIZIZ.LIZ;
        int[] iArr2 = this.LIZIZ.LIZIZ;
        C142875e7J.LIZ(iArr, i, this.LIZJ, this.LIZ);
        Arrays.sort(iArr, this.LIZJ, this.LIZ + 1);
        C142875e7J.LIZ(iArr, i, this.LIZJ, this.LIZ);
        int i5 = this.LIZLLL / 2;
        int i6 = this.LIZJ;
        int i7 = 0;
        while (true) {
            int i8 = this.LIZ;
            if (i6 <= i8) {
                i7 += iArr2[iArr[i6]];
                if (i7 >= i5) {
                    return Math.min(i8 - 1, i6);
                }
                i6++;
            } else {
                return this.LIZJ;
            }
        }
    }

    /* renamed from: LJ */
    public final Palette.Swatch m21127LJ() {
        int[] iArr = this.LIZIZ.LIZ;
        int[] iArr2 = this.LIZIZ.LIZIZ;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.LIZJ; i5 <= this.LIZ; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += C142875e7J.LIZ(i6) * i7;
            i3 += C142875e7J.LIZIZ(i6) * i7;
            i4 += i7 * C142875e7J.LIZJ(i6);
        }
        float f = i2;
        return new Palette.Swatch(C142875e7J.LIZ(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }

    public a$a(C142875e7J c142875e7J, int i, int i2) {
        this.LIZIZ = c142875e7J;
        this.LIZJ = i;
        this.LIZ = i2;
        LIZJ();
    }
}
