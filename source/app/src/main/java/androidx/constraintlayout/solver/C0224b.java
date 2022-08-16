package androidx.constraintlayout.solver;

import com.bytedance.covode.number.Covode;
import p003X.AbstractC146257ezz;
import p003X.C146251ezt;
import p003X.C146252ezu;
import p003X.C146261f03;

/* renamed from: androidx.constraintlayout.solver.b */
/* loaded from: classes19.dex */
public class C0224b implements AbstractC146257ezz {
    public SolverVariable LIZ;
    public float LIZIZ;
    public final C146252ezu LIZJ;
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(813);
    }

    @Override // p003X.AbstractC146257ezz
    public final SolverVariable LIZIZ() {
        return this.LIZ;
    }

    @Override // p003X.AbstractC146257ezz
    public final void LIZ() {
        this.LIZJ.LIZ();
        this.LIZ = null;
        this.LIZIZ = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C0224b.toString():java.lang.String");
    }

    @Override // p003X.AbstractC146257ezz
    public final SolverVariable LIZ(boolean[] zArr) {
        return this.LIZJ.LIZ(zArr, (SolverVariable) null);
    }

    public C0224b(C146261f03 c146261f03) {
        this.LIZJ = new C146252ezu(this, c146261f03);
    }

    @Override // p003X.AbstractC146257ezz
    public void LIZJ(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.f20234LJ != 1) {
            if (solverVariable.f20234LJ == 2) {
                f = 1000.0f;
            } else if (solverVariable.f20234LJ == 3) {
                f = 1000000.0f;
            } else if (solverVariable.f20234LJ == 4) {
                f = 1.0E9f;
            } else if (solverVariable.f20234LJ == 5) {
                f = 1.0E12f;
            }
        }
        this.LIZJ.LIZ(solverVariable, f);
    }

    public final void LIZIZ(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.LIZ;
        if (solverVariable2 != null) {
            this.LIZJ.LIZ(solverVariable2, -1.0f);
            this.LIZ = null;
        }
        float LIZ = this.LIZJ.LIZ(solverVariable, true) * (-1.0f);
        this.LIZ = solverVariable;
        if (LIZ == 1.0f) {
            return;
        }
        this.LIZIZ /= LIZ;
        this.LIZJ.LIZ(LIZ);
    }

    @Override // p003X.AbstractC146257ezz
    public final void LIZ(AbstractC146257ezz abstractC146257ezz) {
        if (abstractC146257ezz instanceof C0224b) {
            C0224b c0224b = (C0224b) abstractC146257ezz;
            this.LIZ = null;
            this.LIZJ.LIZ();
            for (int i = 0; i < c0224b.LIZJ.LIZ; i++) {
                this.LIZJ.LIZ(c0224b.LIZJ.LIZ(i), c0224b.LIZJ.LIZIZ(i), true);
            }
        }
    }

    public final boolean LIZ(SolverVariable solverVariable) {
        C146252ezu c146252ezu = this.LIZJ;
        if (c146252ezu.LJI != -1) {
            int i = c146252ezu.LJI;
            for (int i2 = 0; i != -1 && i2 < c146252ezu.LIZ; i2++) {
                if (c146252ezu.LIZLLL[i] == solverVariable.LIZJ) {
                    return true;
                }
                i = c146252ezu.f19512LJ[i];
            }
        }
        return false;
    }

    public final C0224b LIZ(C146251ezt c146251ezt, int i) {
        this.LIZJ.LIZ(c146251ezt.LIZ(i, "ep"), 1.0f);
        this.LIZJ.LIZ(c146251ezt.LIZ(i, "em"), -1.0f);
        return this;
    }

    public final C0224b LIZ(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZJ.LIZ(solverVariable, -1.0f);
            this.LIZJ.LIZ(solverVariable2, 1.0f);
            this.LIZJ.LIZ(solverVariable3, 1.0f);
            return this;
        }
        this.LIZJ.LIZ(solverVariable, 1.0f);
        this.LIZJ.LIZ(solverVariable2, -1.0f);
        this.LIZJ.LIZ(solverVariable3, -1.0f);
        return this;
    }

    public final C0224b LIZIZ(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZJ.LIZ(solverVariable, -1.0f);
            this.LIZJ.LIZ(solverVariable2, 1.0f);
            this.LIZJ.LIZ(solverVariable3, -1.0f);
            return this;
        }
        this.LIZJ.LIZ(solverVariable, 1.0f);
        this.LIZJ.LIZ(solverVariable2, -1.0f);
        this.LIZJ.LIZ(solverVariable3, 1.0f);
        return this;
    }

    public final C0224b LIZIZ(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.LIZJ.LIZ(solverVariable3, 0.5f);
        this.LIZJ.LIZ(solverVariable4, 0.5f);
        this.LIZJ.LIZ(solverVariable, -0.5f);
        this.LIZJ.LIZ(solverVariable2, -0.5f);
        this.LIZIZ = -f;
        return this;
    }

    public final C0224b LIZ(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.LIZJ.LIZ(solverVariable, -1.0f);
        this.LIZJ.LIZ(solverVariable2, 1.0f);
        this.LIZJ.LIZ(solverVariable3, f);
        this.LIZJ.LIZ(solverVariable4, -f);
        return this;
    }

    public final C0224b LIZ(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.LIZIZ = 0.0f;
        if (f2 != 0.0f && f != f3) {
            if (f == 0.0f) {
                this.LIZJ.LIZ(solverVariable, 1.0f);
                this.LIZJ.LIZ(solverVariable2, -1.0f);
                return this;
            } else if (f3 == 0.0f) {
                this.LIZJ.LIZ(solverVariable3, 1.0f);
                this.LIZJ.LIZ(solverVariable4, -1.0f);
                return this;
            } else {
                float f4 = (f / f2) / (f3 / f2);
                this.LIZJ.LIZ(solverVariable, 1.0f);
                this.LIZJ.LIZ(solverVariable2, -1.0f);
                this.LIZJ.LIZ(solverVariable4, f4);
                this.LIZJ.LIZ(solverVariable3, -f4);
                return this;
            }
        }
        this.LIZJ.LIZ(solverVariable, 1.0f);
        this.LIZJ.LIZ(solverVariable2, -1.0f);
        this.LIZJ.LIZ(solverVariable4, 1.0f);
        this.LIZJ.LIZ(solverVariable3, -1.0f);
        return this;
    }
}
