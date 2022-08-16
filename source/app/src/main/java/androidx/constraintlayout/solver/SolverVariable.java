package androidx.constraintlayout.solver;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p002O.C0002O;

/* loaded from: classes19.dex */
public final class SolverVariable {
    public static int LIZ = 1;
    public String LIZIZ;

    /* renamed from: LJ */
    public int f20234LJ;
    public float LJFF;
    public Type LJII;
    public int LJIIIZ;
    public int LJIIJ;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public float[] LJI = new float[7];
    public C0224b[] LJIIIIZZ = new C0224b[8];

    static {
        Covode.recordClassIndex(810);
    }

    public final String toString() {
        new StringBuilder();
        return C0002O.m25086C("", this.LIZIZ);
    }

    public final void LIZ() {
        this.LIZIZ = null;
        this.LJII = Type.UNKNOWN;
        this.f20234LJ = 0;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJFF = 0.0f;
        this.LJIIIZ = 0;
        this.LJIIJ = 0;
    }

    /* loaded from: classes19.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;

        static {
            Covode.recordClassIndex(811);
        }
    }

    public final void LIZ(Type type) {
        this.LJII = type;
    }

    public SolverVariable(Type type) {
        this.LJII = type;
    }

    public final void LIZJ(C0224b c0224b) {
        int i = this.LJIIIZ;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIIIZZ[i2].LIZJ.LIZ(this.LJIIIIZZ[i2], c0224b, false);
        }
        this.LJIIIZ = 0;
    }

    public final void LIZ(C0224b c0224b) {
        int i = 0;
        while (true) {
            int i2 = this.LJIIIZ;
            if (i < i2) {
                if (this.LJIIIIZZ[i] == c0224b) {
                    return;
                }
                i++;
            } else {
                C0224b[] c0224bArr = this.LJIIIIZZ;
                if (i2 >= c0224bArr.length) {
                    this.LJIIIIZZ = (C0224b[]) Arrays.copyOf(c0224bArr, c0224bArr.length * 2);
                }
                C0224b[] c0224bArr2 = this.LJIIIIZZ;
                int i3 = this.LJIIIZ;
                c0224bArr2[i3] = c0224b;
                this.LJIIIZ = i3 + 1;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        r6.LJIIIZ--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4 >= ((r5 - r3) - 1)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r2 = r6.LJIIIIZZ;
        r1 = r3 + r4;
        r2[r1] = r2[r1 + 1];
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(androidx.constraintlayout.solver.C0224b r7) {
        /*
            r6 = this;
            int r5 = r6.LJIIIZ
            r4 = 0
            r3 = 0
        L4:
            if (r3 >= r5) goto L29
            androidx.constraintlayout.solver.b[] r0 = r6.LJIIIIZZ
            r0 = r0[r3]
            if (r0 == r7) goto Lf
            int r3 = r3 + 1
            goto L4
        Lf:
            int r0 = r5 - r3
            int r0 = r0 + (-1)
            if (r4 >= r0) goto L22
            androidx.constraintlayout.solver.b[] r2 = r6.LJIIIIZZ
            int r1 = r3 + r4
            int r0 = r1 + 1
            r0 = r2[r0]
            r2[r1] = r0
            int r4 = r4 + 1
            goto Lf
        L22:
            int r0 = r6.LJIIIZ
            int r0 = r0 + (-1)
            r6.LJIIIZ = r0
            return
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.SolverVariable.LIZIZ(androidx.constraintlayout.solver.b):void");
    }
}
