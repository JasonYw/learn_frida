package androidx.constraintlayout.solver.widgets;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p003X.C146243ezl;

/* renamed from: androidx.constraintlayout.solver.widgets.f */
/* loaded from: classes19.dex */
public final class C0227f {
    public List<ConstraintWidget> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final int[] f20237LJ;
    public List<ConstraintWidget> LJFF;
    public List<ConstraintWidget> LJI;
    public HashSet<ConstraintWidget> LJII;
    public HashSet<ConstraintWidget> LJIIIIZZ;
    public List<ConstraintWidget> LJIIIZ;
    public List<ConstraintWidget> LJIIJ;

    static {
        Covode.recordClassIndex(834);
    }

    public final void LIZ() {
        int size = this.LJIIJ.size();
        for (int i = 0; i < size; i++) {
            LIZ(this.LJIIJ.get(i));
        }
    }

    public C0227f(List<ConstraintWidget> list) {
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.f20237LJ = new int[]{this.LIZIZ, this.LIZJ};
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
        this.LJII = new HashSet<>();
        this.LJIIIIZZ = new HashSet<>();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = new ArrayList();
        this.LIZ = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZ(androidx.constraintlayout.solver.widgets.ConstraintWidget r7) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0227f.LIZ(androidx.constraintlayout.solver.widgets.ConstraintWidget):void");
    }

    public final void LIZ(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            this.LJII.add(constraintWidget);
        } else if (i == 1) {
            this.LJIIIIZZ.add(constraintWidget);
        }
    }

    public void LIZ(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget.LJJLI) {
            return;
        }
        arrayList.add(constraintWidget);
        constraintWidget.LJJLI = true;
        if (constraintWidget.LJII()) {
            return;
        }
        if (constraintWidget instanceof C146243ezl) {
            C146243ezl c146243ezl = (C146243ezl) constraintWidget;
            int i = c146243ezl.LJJLIIIJLJLI;
            for (int i2 = 0; i2 < i; i2++) {
                LIZ(arrayList, c146243ezl.LJJLIIIJL[i2]);
            }
        }
        int length = constraintWidget.LJJIIJ.length;
        for (int i3 = 0; i3 < length; i3++) {
            ConstraintAnchor constraintAnchor = constraintWidget.LJJIIJ[i3].LIZLLL;
            if (constraintAnchor != null && (constraintWidget2 = constraintAnchor.LIZIZ) != constraintWidget.LJJIIZI) {
                LIZ(arrayList, constraintWidget2);
            }
        }
    }

    public C0227f(List<ConstraintWidget> list, boolean z) {
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.f20237LJ = new int[]{this.LIZIZ, this.LIZJ};
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
        this.LJII = new HashSet<>();
        this.LJIIIIZZ = new HashSet<>();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = new ArrayList();
        this.LIZ = list;
        this.LIZLLL = true;
    }
}
