package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p003X.C146251ezt;
import p003X.C146256ezy;

/* renamed from: androidx.constraintlayout.solver.widgets.j */
/* loaded from: classes19.dex */
public final class C0228j extends C0229l {
    public ConstraintAnchor LIZ;
    public C0228j LIZIZ;
    public float LIZJ;
    public C0228j LIZLLL;

    /* renamed from: LJ */
    public float f20238LJ;
    public int LJFF;
    public C0228j LJIIIIZZ;
    public C146256ezy LJIIIZ;
    public C146256ezy LJIIJJI;
    public int LJIIJ = 1;
    public int LJIIL = 1;

    static {
        Covode.recordClassIndex(839);
    }

    public static String LIZ(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    @Override // androidx.constraintlayout.solver.widgets.C0229l
    public final void LIZIZ() {
        super.LIZIZ();
        this.LIZIZ = null;
        this.LIZJ = 0.0f;
        this.LJIIIZ = null;
        this.LJIIJ = 1;
        this.LJIIJJI = null;
        this.LJIIL = 1;
        this.LIZLLL = null;
        this.f20238LJ = 0.0f;
        this.LJIIIIZZ = null;
        this.LJFF = 0;
    }

    public final String toString() {
        if (this.LJII == 1) {
            if (this.LIZLLL == this) {
                return "[" + this.LIZ + ", RESOLVED: " + this.f20238LJ + "]  type: " + LIZ(this.LJFF);
            }
            return "[" + this.LIZ + ", RESOLVED: " + this.LIZLLL + Constants.COLON_SEPARATOR + this.f20238LJ + "] type: " + LIZ(this.LJFF);
        }
        return "{ " + this.LIZ + " UNRESOLVED} type: " + LIZ(this.LJFF);
    }

    @Override // androidx.constraintlayout.solver.widgets.C0229l
    public final void LIZ() {
        C0228j c0228j;
        C0228j c0228j2;
        C0228j c0228j3;
        C0228j c0228j4;
        C0228j c0228j5;
        C0228j c0228j6;
        float f;
        float f2;
        float LJIIJ;
        float f3;
        C0228j c0228j7;
        boolean z = true;
        if (this.LJII == 1 || this.LJFF == 4) {
            return;
        }
        C146256ezy c146256ezy = this.LJIIIZ;
        if (c146256ezy != null) {
            if (c146256ezy.LJII != 1) {
                return;
            }
            this.LIZJ = this.LJIIJ * this.LJIIIZ.LIZ;
        }
        C146256ezy c146256ezy2 = this.LJIIJJI;
        if (c146256ezy2 != null && c146256ezy2.LJII != 1) {
            return;
        }
        if (this.LJFF == 1 && ((c0228j7 = this.LIZIZ) == null || c0228j7.LJII == 1)) {
            C0228j c0228j8 = this.LIZIZ;
            if (c0228j8 == null) {
                this.LIZLLL = this;
                this.f20238LJ = this.LIZJ;
            } else {
                this.LIZLLL = c0228j8.LIZLLL;
                this.f20238LJ = c0228j8.f20238LJ + this.LIZJ;
            }
            m21188LJ();
        } else if (this.LJFF == 2 && (c0228j4 = this.LIZIZ) != null && c0228j4.LJII == 1 && (c0228j5 = this.LJIIIIZZ) != null && (c0228j6 = c0228j5.LIZIZ) != null && c0228j6.LJII == 1) {
            if (C146251ezt.LIZ() != null) {
                C146251ezt.LIZ().LJIL++;
            }
            this.LIZLLL = this.LIZIZ.LIZLLL;
            C0228j c0228j9 = this.LJIIIIZZ;
            c0228j9.LIZLLL = c0228j9.LIZIZ.LIZLLL;
            int i = 0;
            if (this.LIZ.LIZJ != ConstraintAnchor.Type.RIGHT && this.LIZ.LIZJ != ConstraintAnchor.Type.BOTTOM) {
                z = false;
                f = this.LJIIIIZZ.LIZIZ.f20238LJ;
                f2 = this.LIZIZ.f20238LJ;
            } else {
                f = this.LIZIZ.f20238LJ;
                f2 = this.LJIIIIZZ.LIZIZ.f20238LJ;
            }
            float f4 = f - f2;
            if (this.LIZ.LIZJ != ConstraintAnchor.Type.LEFT && this.LIZ.LIZJ != ConstraintAnchor.Type.RIGHT) {
                LJIIJ = f4 - this.LIZ.LIZIZ.LJIIJJI();
                f3 = this.LIZ.LIZIZ.LJJJJZ;
            } else {
                LJIIJ = f4 - this.LIZ.LIZIZ.LJIIJ();
                f3 = this.LIZ.LIZIZ.LJJJJLL;
            }
            int LIZIZ = this.LIZ.LIZIZ();
            int LIZIZ2 = this.LJIIIIZZ.LIZ.LIZIZ();
            if (this.LIZ.LIZLLL == this.LJIIIIZZ.LIZ.LIZLLL) {
                f3 = 0.5f;
                LIZIZ2 = 0;
            } else {
                i = LIZIZ;
            }
            float f5 = i;
            float f6 = LIZIZ2;
            float f7 = (LJIIJ - f5) - f6;
            if (z) {
                C0228j c0228j10 = this.LJIIIIZZ;
                c0228j10.f20238LJ = c0228j10.LIZIZ.f20238LJ + f6 + (f7 * f3);
                this.f20238LJ = (this.LIZIZ.f20238LJ - f5) - (f7 * (1.0f - f3));
            } else {
                this.f20238LJ = this.LIZIZ.f20238LJ + f5 + (f7 * f3);
                C0228j c0228j11 = this.LJIIIIZZ;
                c0228j11.f20238LJ = (c0228j11.LIZIZ.f20238LJ - f6) - (f7 * (1.0f - f3));
            }
            m21188LJ();
            this.LJIIIIZZ.m21188LJ();
        } else if (this.LJFF == 3 && (c0228j = this.LIZIZ) != null && c0228j.LJII == 1 && (c0228j2 = this.LJIIIIZZ) != null && (c0228j3 = c0228j2.LIZIZ) != null && c0228j3.LJII == 1) {
            if (C146251ezt.LIZ() != null) {
                C146251ezt.LIZ().LJJ++;
            }
            C0228j c0228j12 = this.LIZIZ;
            this.LIZLLL = c0228j12.LIZLLL;
            C0228j c0228j13 = this.LJIIIIZZ;
            C0228j c0228j14 = c0228j13.LIZIZ;
            c0228j13.LIZLLL = c0228j14.LIZLLL;
            this.f20238LJ = c0228j12.f20238LJ + this.LIZJ;
            c0228j13.f20238LJ = c0228j14.f20238LJ + c0228j13.LIZJ;
            m21188LJ();
            this.LJIIIIZZ.m21188LJ();
        } else if (this.LJFF == 5) {
            this.LIZ.LIZIZ.LIZJ();
        }
    }

    public C0228j(ConstraintAnchor constraintAnchor) {
        this.LIZ = constraintAnchor;
    }

    public final void LIZ(C146251ezt c146251ezt) {
        SolverVariable solverVariable = this.LIZ.LJIIIIZZ;
        C0228j c0228j = this.LIZLLL;
        if (c0228j == null) {
            c146251ezt.LIZ(solverVariable, (int) (this.f20238LJ + 0.5f));
        } else {
            c146251ezt.LIZJ(solverVariable, c146251ezt.LIZ(c0228j.LIZ), (int) (this.f20238LJ + 0.5f), 6);
        }
    }

    public final void LIZIZ(C0228j c0228j, float f) {
        this.LJIIIIZZ = c0228j;
    }

    public final void LIZ(C0228j c0228j, float f) {
        if (this.LJII == 0 || (this.LIZLLL != c0228j && this.f20238LJ != f)) {
            this.LIZLLL = c0228j;
            this.f20238LJ = f;
            if (this.LJII == 1) {
                LIZLLL();
            }
            m21188LJ();
        }
    }

    public final void LIZ(C0228j c0228j, int i) {
        this.LIZIZ = c0228j;
        this.LIZJ = i;
        this.LIZIZ.LIZ(this);
    }

    public final void LIZIZ(C0228j c0228j, int i, C146256ezy c146256ezy) {
        this.LJIIIIZZ = c0228j;
        this.LJIIJJI = c146256ezy;
        this.LJIIL = i;
    }

    public final void LIZ(int i, C0228j c0228j, int i2) {
        this.LJFF = 1;
        this.LIZIZ = c0228j;
        this.LIZJ = i2;
        this.LIZIZ.LIZ(this);
    }

    public final void LIZ(C0228j c0228j, int i, C146256ezy c146256ezy) {
        this.LIZIZ = c0228j;
        this.LIZIZ.LIZ(this);
        this.LJIIIZ = c146256ezy;
        this.LJIIJ = i;
        this.LJIIIZ.LIZ(this);
    }
}
