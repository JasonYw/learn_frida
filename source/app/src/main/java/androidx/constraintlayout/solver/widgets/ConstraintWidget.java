package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p003X.C146247ezp;
import p003X.C146251ezt;
import p003X.C146256ezy;
import p003X.C146261f03;

/* loaded from: classes19.dex */
public class ConstraintWidget {
    public static float LJJJJLI = 0.5f;

    /* renamed from: LJ */
    public C146256ezy f20236LJ;
    public C146256ezy LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIL;
    public int LJIILIIL;
    public C0227f LJIIZILJ;
    public float LJIJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public float LJJJJLL;
    public float LJJJJZ;
    public Object LJJJJZI;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int[] LJIIIIZZ = new int[2];
    public float LJIIJJI = 1.0f;
    public float LJIILJJIL = 1.0f;
    public int LJIILL = -1;
    public float LJIILLIIL = 1.0f;
    public int[] LJIJ = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public ConstraintAnchor LJIJJ = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
    public ConstraintAnchor LJIJJLI = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
    public ConstraintAnchor LJIL = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
    public ConstraintAnchor LJJ = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
    public ConstraintAnchor LJJI = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
    public ConstraintAnchor LJJIFFI = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
    public ConstraintAnchor LJJII = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
    public ConstraintAnchor LJJIII = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
    public ConstraintAnchor[] LJJIIJ = {this.LJIJJ, this.LJIL, this.LJIJJLI, this.LJJ, this.LJJI, this.LJJIII};
    public ArrayList<ConstraintAnchor> LJJIIJZLJL = new ArrayList<>();
    public DimensionBehaviour[] LJJIIZ = {DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
    public ConstraintWidget LJJIIZI = null;
    public int LJJIJ = 0;
    public int LJJIJIIJI = 0;
    public float LJJIJIIJIL = 0.0f;
    public int LJJIJIL = -1;
    public int LJJIJL = 0;
    public int LJJIJLIJ = 0;
    public int LJJIL = 0;
    public int LJJIZ = 0;
    public int LJJJ = 0;
    public int LJJJI = 0;
    public int LJJJIL = 0;
    public int LJJJJ = 0;
    public int LJJJJI = 0;
    public int LJJJLIIL = 0;
    public String LJJJLL = null;
    public String LJJJLZIJ = null;
    public boolean LJJJZ = false;
    public boolean LJJL = false;
    public boolean LJJLI = false;
    public int LJJLIIIIJ = 0;
    public int LJJLIIIJ = 0;
    public float[] LJJLIIIJILLIZJL = {-1.0f, -1.0f};
    public ConstraintWidget[] LJJLIIIJJI = {null, null};
    public ConstraintWidget[] LJJLIIIJJIZ = {null, null};

    public void LIZJ() {
    }

    public final int LJIILLIIL() {
        return this.LJJIJL;
    }

    public final int LJIIZILJ() {
        return this.LJJIJLIJ;
    }

    public ArrayList<ConstraintAnchor> LJIJJLI() {
        return this.LJJIIJZLJL;
    }

    public final int LJIIL() {
        return this.LJJJ + this.LJJJIL;
    }

    public final int LJIILIIL() {
        return this.LJJJI + this.LJJJJ;
    }

    public final int LJIILJJIL() {
        return this.LJJIJL + this.LJJJIL;
    }

    public final int LJIILL() {
        return this.LJJIJLIJ + this.LJJJJ;
    }

    public final int LJIJ() {
        return this.LJJIJL + this.LJJIJ;
    }

    public final int LJIJI() {
        return this.LJJIJLIJ + this.LJJIJIIJI;
    }

    public final boolean LJIJJ() {
        if (this.LJJJJI > 0) {
            return true;
        }
        return false;
    }

    public final DimensionBehaviour LJJI() {
        return this.LJJIIZ[0];
    }

    public final DimensionBehaviour LJJIFFI() {
        return this.LJJIIZ[1];
    }

    static {
        Covode.recordClassIndex(826);
    }

    public void LIZIZ() {
        int i = 0;
        do {
            this.LJJIIJ[i].LIZ.LIZIZ();
            i++;
        } while (i < 6);
    }

    public final C146256ezy LJIIIIZZ() {
        if (this.f20236LJ == null) {
            this.f20236LJ = new C146256ezy();
        }
        return this.f20236LJ;
    }

    public final C146256ezy LJIIIZ() {
        if (this.LJFF == null) {
            this.LJFF = new C146256ezy();
        }
        return this.LJFF;
    }

    public final int LJIIJ() {
        if (this.LJJJLIIL == 8) {
            return 0;
        }
        return this.LJJIJ;
    }

    public final int LJIIJJI() {
        if (this.LJJJLIIL == 8) {
            return 0;
        }
        return this.LJJIJIIJI;
    }

    public void LJIL() {
        int i = this.LJJIJL;
        int i2 = this.LJJIJLIJ;
        this.LJJJ = i;
        this.LJJJI = i2;
    }

    /* renamed from: LJ */
    public final boolean m21190LJ() {
        if (this.LJII == 0 && this.LJJIJIIJIL == 0.0f && this.LJIIL == 0 && this.LJIILIIL == 0 && this.LJJIIZ[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public final void LJJ() {
        int size = this.LJJIIJZLJL.size();
        for (int i = 0; i < size; i++) {
            this.LJJIIJZLJL.get(i).LIZJ();
        }
    }

    public final boolean LIZLLL() {
        if (this.LJI != 0 || this.LJJIJIIJIL != 0.0f || this.LJIIIZ != 0 || this.LJIIJ != 0 || this.LJJIIZ[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        int i = 0;
        do {
            C0228j c0228j = this.LJJIIJ[i].LIZ;
            ConstraintAnchor constraintAnchor = c0228j.LIZ.LIZLLL;
            if (constraintAnchor != null) {
                if (constraintAnchor.LIZLLL == c0228j.LIZ) {
                    c0228j.LJFF = 4;
                    constraintAnchor.LIZ.LJFF = 4;
                }
                int LIZIZ = c0228j.LIZ.LIZIZ();
                if (c0228j.LIZ.LIZJ == ConstraintAnchor.Type.RIGHT || c0228j.LIZ.LIZJ == ConstraintAnchor.Type.BOTTOM) {
                    LIZIZ = -LIZIZ;
                }
                c0228j.LIZ(constraintAnchor.LIZ, LIZIZ);
            }
            i++;
        } while (i < 6);
    }

    /* loaded from: classes19.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT;

        static {
            Covode.recordClassIndex(828);
        }
    }

    public final boolean LJII() {
        if (this.LJIJJ.LIZ.LJII == 1 && this.LJIL.LIZ.LJII == 1 && this.LJIJJLI.LIZ.LJII == 1 && this.LJJ.LIZ.LJII == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C02261 {
        public static final /* synthetic */ int[] LIZIZ = new int[DimensionBehaviour.values().length];

        static {
            Covode.recordClassIndex(827);
            try {
                LIZIZ[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZIZ[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZIZ[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZIZ[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            LIZ = new int[ConstraintAnchor.Type.values().length];
            try {
                LIZ[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LIZ[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LIZ[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                LIZ[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                LIZ[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                LIZ[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                LIZ[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                LIZ[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                LIZ[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void LJFF() {
        this.LJIJJ.LIZJ();
        this.LJIJJLI.LIZJ();
        this.LJIL.LIZJ();
        this.LJJ.LIZJ();
        this.LJJI.LIZJ();
        this.LJJIFFI.LIZJ();
        this.LJJII.LIZJ();
        this.LJJIII.LIZJ();
        this.LJJIIZI = null;
        this.LJIJI = 0.0f;
        this.LJJIJ = 0;
        this.LJJIJIIJI = 0;
        this.LJJIJIIJIL = 0.0f;
        this.LJJIJIL = -1;
        this.LJJIJL = 0;
        this.LJJIJLIJ = 0;
        this.LJJJ = 0;
        this.LJJJI = 0;
        this.LJJJIL = 0;
        this.LJJJJ = 0;
        this.LJJJJI = 0;
        this.LJJJJIZL = 0;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0;
        this.LJJJJL = 0;
        float f = LJJJJLI;
        this.LJJJJLL = f;
        this.LJJJJZ = f;
        this.LJJIIZ[0] = DimensionBehaviour.FIXED;
        this.LJJIIZ[1] = DimensionBehaviour.FIXED;
        this.LJJJJZI = null;
        this.LJJJLIIL = 0;
        this.LJJJLZIJ = null;
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = 0;
        float[] fArr = this.LJJLIIIJILLIZJL;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        int[] iArr = this.LJIJ;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIJJI = 1.0f;
        this.LJIILJJIL = 1.0f;
        this.LJIIJ = Integer.MAX_VALUE;
        this.LJIILIIL = Integer.MAX_VALUE;
        this.LJIIIZ = 0;
        this.LJIIL = 0;
        this.LJIILL = -1;
        this.LJIILLIIL = 1.0f;
        C146256ezy c146256ezy = this.f20236LJ;
        if (c146256ezy != null) {
            c146256ezy.LIZIZ();
        }
        C146256ezy c146256ezy2 = this.LJFF;
        if (c146256ezy2 != null) {
            c146256ezy2.LIZIZ();
        }
        this.LJIIZILJ = null;
        this.LJJJZ = false;
        this.LJJL = false;
        this.LJJLI = false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.LJJJLZIJ != null) {
            str = "type: " + this.LJJJLZIJ + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.LJJJLL != null) {
            str2 = "id: " + this.LJJJLL + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.LJJIJL);
        sb.append(", ");
        sb.append(this.LJJIJLIJ);
        sb.append(") - (");
        sb.append(this.LJJIJ);
        sb.append(" x ");
        sb.append(this.LJJIJIIJI);
        sb.append(") wrap: (");
        sb.append(this.LJJJJJL);
        sb.append(" x ");
        sb.append(this.LJJJJL);
        sb.append(")");
        return sb.toString();
    }

    public ConstraintWidget() {
        float f = LJJJJLI;
        this.LJJJJLL = f;
        this.LJJJJZ = f;
        this.LJJIIJZLJL.add(this.LJIJJ);
        this.LJJIIJZLJL.add(this.LJIJJLI);
        this.LJJIIJZLJL.add(this.LJIL);
        this.LJJIIJZLJL.add(this.LJJ);
        this.LJJIIJZLJL.add(this.LJJIFFI);
        this.LJJIIJZLJL.add(this.LJJII);
        this.LJJIIJZLJL.add(this.LJJIII);
        this.LJJIIJZLJL.add(this.LJJI);
    }

    public boolean LIZ() {
        if (this.LJJJLIIL != 8) {
            return true;
        }
        return false;
    }

    public void LIZ(int i) {
        C146247ezp.LIZ(i, this);
    }

    public final void LIZJ(int i) {
        this.LJJIJ = i;
        int i2 = this.LJJIJ;
        int i3 = this.LJJJJIZL;
        if (i2 < i3) {
            this.LJJIJ = i3;
        }
    }

    public final void LIZLLL(int i) {
        this.LJJIJIIJI = i;
        int i2 = this.LJJIJIIJI;
        int i3 = this.LJJJJJ;
        if (i2 < i3) {
            this.LJJIJIIJI = i3;
        }
    }

    /* renamed from: LJ */
    public final void m21189LJ(int i) {
        if (i < 0) {
            this.LJJJJIZL = 0;
        } else {
            this.LJJJJIZL = i;
        }
    }

    public final void LJFF(int i) {
        if (i < 0) {
            this.LJJJJJ = 0;
        } else {
            this.LJJJJJ = i;
        }
    }

    public final int LIZIZ(int i) {
        if (i == 0) {
            return LJIIJ();
        }
        if (i == 1) {
            return LJIIJJI();
        }
        return 0;
    }

    public final DimensionBehaviour LJI(int i) {
        if (i == 0) {
            return LJJI();
        }
        if (i == 1) {
            return LJJIFFI();
        }
        return null;
    }

    private boolean LJII(int i) {
        int i2 = i * 2;
        if (this.LJJIIJ[i2].LIZLLL != null) {
            ConstraintAnchor constraintAnchor = this.LJJIIJ[i2].LIZLLL.LIZLLL;
            ConstraintAnchor[] constraintAnchorArr = this.LJJIIJ;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].LIZLLL != null && this.LJJIIJ[i3].LIZLLL.LIZLLL == this.LJJIIJ[i3]) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void LIZ(C146261f03 c146261f03) {
        this.LJIJJ.LIZ();
        this.LJIJJLI.LIZ();
        this.LJIL.LIZ();
        this.LJJ.LIZ();
        this.LJJI.LIZ();
        this.LJJIII.LIZ();
        this.LJJIFFI.LIZ();
        this.LJJII.LIZ();
    }

    public ConstraintAnchor LIZ(ConstraintAnchor.Type type) {
        switch (type) {
            case LEFT:
                return this.LJIJJ;
            case TOP:
                return this.LJIJJLI;
            case RIGHT:
                return this.LJIL;
            case BOTTOM:
                return this.LJJ;
            case BASELINE:
                return this.LJJI;
            case CENTER:
                return this.LJJIII;
            case CENTER_X:
                return this.LJJIFFI;
            case CENTER_Y:
                return this.LJJII;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final void LIZIZ(C146251ezt c146251ezt) {
        c146251ezt.LIZ(this.LJIJJ);
        c146251ezt.LIZ(this.LJIJJLI);
        c146251ezt.LIZ(this.LJIL);
        c146251ezt.LIZ(this.LJJ);
        if (this.LJJJJI > 0) {
            c146251ezt.LIZ(this.LJJI);
        }
    }

    public void LIZJ(C146251ezt c146251ezt) {
        int i;
        int i2;
        int LIZIZ = C146251ezt.LIZIZ(this.LJIJJ);
        int LIZIZ2 = C146251ezt.LIZIZ(this.LJIJJLI);
        int LIZIZ3 = C146251ezt.LIZIZ(this.LJIL);
        int LIZIZ4 = C146251ezt.LIZIZ(this.LJJ);
        int i3 = LIZIZ4 - LIZIZ2;
        if (LIZIZ3 - LIZIZ < 0 || i3 < 0 || LIZIZ == Integer.MIN_VALUE || LIZIZ == Integer.MAX_VALUE || LIZIZ2 == Integer.MIN_VALUE || LIZIZ2 == Integer.MAX_VALUE || LIZIZ3 == Integer.MIN_VALUE || LIZIZ3 == Integer.MAX_VALUE || LIZIZ4 == Integer.MIN_VALUE || LIZIZ4 == Integer.MAX_VALUE) {
            LIZIZ = 0;
            LIZIZ2 = 0;
            LIZIZ3 = 0;
            LIZIZ4 = 0;
        }
        int i4 = LIZIZ3 - LIZIZ;
        int i5 = LIZIZ4 - LIZIZ2;
        this.LJJIJL = LIZIZ;
        this.LJJIJLIJ = LIZIZ2;
        if (this.LJJJLIIL == 8) {
            this.LJJIJ = 0;
            this.LJJIJIIJI = 0;
            return;
        }
        if (this.LJJIIZ[0] != DimensionBehaviour.FIXED || i4 >= (i = this.LJJIJ)) {
            i = i4;
        }
        if (this.LJJIIZ[1] != DimensionBehaviour.FIXED || i5 >= (i2 = this.LJJIJIIJI)) {
            i2 = i5;
        }
        this.LJJIJ = i;
        this.LJJIJIIJI = i2;
        int i6 = this.LJJIJIIJI;
        int i7 = this.LJJJJJ;
        if (i6 < i7) {
            this.LJJIJIIJI = i7;
        }
        int i8 = this.LJJIJ;
        int i9 = this.LJJJJIZL;
        if (i8 < i9) {
            this.LJJIJ = i9;
        }
        this.LJJL = true;
    }

    public final void LIZ(DimensionBehaviour dimensionBehaviour) {
        this.LJJIIZ[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            LIZJ(this.LJJJJJL);
        }
    }

    public final void LIZIZ(DimensionBehaviour dimensionBehaviour) {
        this.LJJIIZ[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            LIZLLL(this.LJJJJL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void LIZ(p003X.C146251ezt r64) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.LIZ(X.ezt):void");
    }

    public void LIZ(int i, int i2) {
        this.LJJJIL = i;
        this.LJJJJ = i2;
    }

    public final void LIZJ(int i, int i2) {
        this.LJJIJLIJ = i;
        this.LJJIJIIJI = i2 - i;
        int i3 = this.LJJIJIIJI;
        int i4 = this.LJJJJJ;
        if (i3 < i4) {
            this.LJJIJIIJI = i4;
        }
    }

    public final void LIZLLL(int i, int i2) {
        if (i2 == 0) {
            this.LJJIL = i;
        } else if (i2 == 1) {
            this.LJJIZ = i;
        }
    }

    public final void LIZIZ(int i, int i2) {
        this.LJJIJL = i;
        this.LJJIJ = i2 - i;
        int i3 = this.LJJIJ;
        int i4 = this.LJJJJIZL;
        if (i3 < i4) {
            this.LJJIJ = i4;
        }
    }

    public final void LIZ(int i, int i2, int i3) {
        if (i3 == 0) {
            LIZIZ(i, i2);
        } else if (i3 == 1) {
            LIZJ(i, i2);
        }
        this.LJJL = true;
    }

    public final void LIZ(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        LIZ(type).LIZ(constraintWidget.LIZ(type2), i, i2, ConstraintAnchor.Strength.STRONG, 0, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZ(p003X.C146251ezt r31, boolean r32, androidx.constraintlayout.solver.SolverVariable r33, androidx.constraintlayout.solver.SolverVariable r34, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r35, boolean r36, androidx.constraintlayout.solver.widgets.ConstraintAnchor r37, androidx.constraintlayout.solver.widgets.ConstraintAnchor r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, int r46, int r47, int r48, float r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.LIZ(X.ezt, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
