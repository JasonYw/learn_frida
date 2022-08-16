package androidx.constraintlayout.solver.widgets;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.l */
/* loaded from: classes19.dex */
public class C0229l {
    public HashSet<C0229l> LJI = new HashSet<>(2);
    public int LJII = 0;

    static {
        Covode.recordClassIndex(841);
    }

    public void LIZ() {
    }

    public final boolean LJFF() {
        if (this.LJII == 1) {
            return true;
        }
        return false;
    }

    public void LIZIZ() {
        this.LJII = 0;
        this.LJI.clear();
    }

    public final void LIZLLL() {
        this.LJII = 0;
        Iterator<C0229l> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    /* renamed from: LJ */
    public final void m21188LJ() {
        this.LJII = 1;
        Iterator<C0229l> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public final void LIZ(C0229l c0229l) {
        this.LJI.add(c0229l);
    }
}
