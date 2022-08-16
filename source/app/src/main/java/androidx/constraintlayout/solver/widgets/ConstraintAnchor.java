package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;
import p003X.C146248ezq;

/* loaded from: classes19.dex */
public final class ConstraintAnchor {
    public final ConstraintWidget LIZIZ;
    public final Type LIZJ;
    public ConstraintAnchor LIZLLL;
    public SolverVariable LJIIIIZZ;
    public C0228j LIZ = new C0228j(this);

    /* renamed from: LJ */
    public int f20235LJ = 0;
    public int LJFF = -1;
    public Strength LJI = Strength.NONE;
    public int LJII = 0;

    static {
        Covode.recordClassIndex(822);
    }

    public final boolean LIZLLL() {
        if (this.LIZLLL != null) {
            return true;
        }
        return false;
    }

    public final void LIZ() {
        SolverVariable solverVariable = this.LJIIIIZZ;
        if (solverVariable == null) {
            this.LJIIIIZZ = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.LIZ();
        }
    }

    public final int LIZIZ() {
        ConstraintAnchor constraintAnchor;
        if (this.LIZIZ.LJJJLIIL == 8) {
            return 0;
        }
        if (this.LJFF >= 0 && (constraintAnchor = this.LIZLLL) != null && constraintAnchor.LIZIZ.LJJJLIIL == 8) {
            return this.LJFF;
        }
        return this.f20235LJ;
    }

    public final void LIZJ() {
        this.LIZLLL = null;
        this.f20235LJ = 0;
        this.LJFF = -1;
        this.LJI = Strength.STRONG;
        this.LJII = 0;
        this.LIZ.LIZIZ();
    }

    public final String toString() {
        new StringBuilder();
        return C0002O.m25085C(this.LIZIZ.LJJJLL, Constants.COLON_SEPARATOR, this.LIZJ.toString());
    }

    /* loaded from: classes19.dex */
    public enum Strength {
        NONE,
        STRONG,
        WEAK;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                clinit$r$fake();
                return;
            }
            Covode.recordClassIndex(824);
        }

        private static void clinit$r$fake() {
            Covode.recordClassIndex(824);
            NONE = new Strength();
            STRONG = new Strength();
            WEAK = new Strength();
            $VALUES = new Strength[]{NONE, STRONG, WEAK};
        }
    }

    /* loaded from: classes19.dex */
    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;

        static {
            Covode.recordClassIndex(825);
        }
    }

    private boolean LIZ(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.LIZJ;
        Type type2 = this.LIZJ;
        if (type == type2) {
            if (type2 == Type.BASELINE && (!constraintAnchor.LIZIZ.LJIJJ() || !this.LIZIZ.LJIJJ())) {
                return false;
            }
            return true;
        }
        switch (this.LIZJ) {
            case CENTER:
                if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                    return false;
                }
                return true;
            case LEFT:
            case RIGHT:
                if (type != Type.LEFT && type != Type.RIGHT) {
                    z = false;
                } else {
                    z = true;
                }
                if (constraintAnchor.LIZIZ instanceof C146248ezq) {
                    if (!z && type != Type.CENTER_X) {
                        return false;
                    }
                    return true;
                }
                return z;
            case TOP:
            case BOTTOM:
                if (type != Type.TOP && type != Type.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (constraintAnchor.LIZIZ instanceof C146248ezq) {
                    if (!z2 && type != Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                }
                return z2;
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.LIZJ.name());
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.LIZIZ = constraintWidget;
        this.LIZJ = type;
    }

    public final boolean LIZ(ConstraintAnchor constraintAnchor, int i, int i2, Strength strength, int i3, boolean z) {
        if (constraintAnchor == null) {
            this.LIZLLL = null;
            this.f20235LJ = 0;
            this.LJFF = -1;
            this.LJI = Strength.NONE;
            this.LJII = 2;
            return true;
        } else if (!z && !LIZ(constraintAnchor)) {
            return false;
        } else {
            this.LIZLLL = constraintAnchor;
            if (i > 0) {
                this.f20235LJ = i;
            } else {
                this.f20235LJ = 0;
            }
            this.LJFF = i2;
            this.LJI = strength;
            this.LJII = i3;
            return true;
        }
    }
}
