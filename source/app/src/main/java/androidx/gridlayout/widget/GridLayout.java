package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.legacy.widget.Space;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import p002O.C0002O;
import p003X.AbstractC149652fsp;
import p003X.C139085d7x;
import p003X.C144339eUv;
import p003X.C149649fsm;
import p003X.C149650fsn;

/* loaded from: classes20.dex */
public class GridLayout extends ViewGroup {
    public static final AbstractC149652fsp LJIIJJI;
    public static final AbstractC149652fsp LJIIL;
    public static final AbstractC149652fsp LJIILIIL;
    public static final AbstractC149652fsp LJIILJJIL;
    public static final AbstractC149652fsp LJIILL;
    public static final AbstractC149652fsp LJIILLIIL;
    public final C149650fsn LIZJ;
    public final C149650fsn LIZLLL;

    /* renamed from: LJ */
    public int f20263LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public Printer LJIIIZ;
    public static final Printer LIZ = new LogPrinter(3, GridLayout.class.getName());
    public static final Printer LIZIZ = new Printer() { // from class: androidx.gridlayout.widget.GridLayout.1
        static {
            Covode.recordClassIndex(1320);
        }

        @Override // android.util.Printer
        public final void println(String str) {
        }
    };
    public static final int LJIJJ = 3;
    public static final int LJIJJLI = 4;
    public static final int LJIL = 1;
    public static final int LJJ = 6;
    public static final int LJJI = 0;
    public static final int LJJIFFI = 5;
    public static final int LJJII = 2;
    public static final AbstractC149652fsp LJIIJ = new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.2
        static {
            Covode.recordClassIndex(1321);
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i) {
            return Integer.MIN_VALUE;
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // p003X.AbstractC149652fsp
        public final String LIZ() {
            return "UNDEFINED";
        }
    };
    public static final AbstractC149652fsp LJJIII = new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.3
        static {
            Covode.recordClassIndex(1322);
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i) {
            return 0;
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i, int i2) {
            return 0;
        }

        @Override // p003X.AbstractC149652fsp
        public final String LIZ() {
            return "LEADING";
        }
    };
    public static final AbstractC149652fsp LJJIIJ = new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.4
        static {
            Covode.recordClassIndex(1323);
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i) {
            return i;
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i, int i2) {
            return i;
        }

        @Override // p003X.AbstractC149652fsp
        public final String LIZ() {
            return "TRAILING";
        }
    };
    public static final AbstractC149652fsp LJIIZILJ = new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.6
        static {
            Covode.recordClassIndex(1325);
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i) {
            return i >> 1;
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i, int i2) {
            return i >> 1;
        }

        @Override // p003X.AbstractC149652fsp
        public final String LIZ() {
            return "CENTER";
        }
    };
    public static final AbstractC149652fsp LJIJ = new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.7
        static {
            Covode.recordClassIndex(1326);
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i) {
            return 0;
        }

        @Override // p003X.AbstractC149652fsp
        public final String LIZ() {
            return "BASELINE";
        }

        @Override // p003X.AbstractC149652fsp
        public final C0304d LIZIZ() {
            return new C0304d(this) { // from class: androidx.gridlayout.widget.GridLayout.7.1
                public int LIZLLL;

                static {
                    Covode.recordClassIndex(1327);
                }

                @Override // androidx.gridlayout.widget.GridLayout.C0304d
                public final void LIZ() {
                    super.LIZ();
                    this.LIZLLL = Integer.MIN_VALUE;
                }

                @Override // androidx.gridlayout.widget.GridLayout.C0304d
                public final int LIZ(boolean z) {
                    return Math.max(super.LIZ(z), this.LIZLLL);
                }

                @Override // androidx.gridlayout.widget.GridLayout.C0304d
                public final void LIZ(int i, int i2) {
                    super.LIZ(i, i2);
                    this.LIZLLL = Math.max(this.LIZLLL, i + i2);
                }

                @Override // androidx.gridlayout.widget.GridLayout.C0304d
                public final int LIZ(GridLayout gridLayout, View view, AbstractC149652fsp abstractC149652fsp, int i, boolean z) {
                    return Math.max(0, super.LIZ(gridLayout, view, abstractC149652fsp, i, z));
                }
            };
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }
    };
    public static final AbstractC149652fsp LJIJI = new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.8
        static {
            Covode.recordClassIndex(1328);
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(int i, int i2) {
            return i2;
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i) {
            return 0;
        }

        @Override // p003X.AbstractC149652fsp
        public final int LIZ(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // p003X.AbstractC149652fsp
        public final String LIZ() {
            return "FILL";
        }
    };

    public int getAlignmentMode() {
        return this.LJI;
    }

    public int getOrientation() {
        return this.f20263LJ;
    }

    public Printer getPrinter() {
        return this.LJIIIZ;
    }

    public boolean getUseDefaultMargins() {
        return this.LJFF;
    }

    public final int LIZ(View view, boolean z, boolean z2) {
        int i;
        C0307i c0307i;
        C149650fsn c149650fsn;
        C149649fsm LIZ2 = LIZ(view);
        if (z) {
            i = z2 ? LIZ2.leftMargin : LIZ2.rightMargin;
        } else {
            i = z2 ? LIZ2.topMargin : LIZ2.bottomMargin;
        }
        if (i == Integer.MIN_VALUE) {
            if (this.LJFF) {
                if (z) {
                    c0307i = LIZ2.LIZIZ;
                    c149650fsn = this.LIZJ;
                } else {
                    c0307i = LIZ2.LIZ;
                    c149650fsn = this.LIZLLL;
                }
                C0305e c0305e = c0307i.LIZJ;
                if (!z || !LIZ() ? !z2 : z2) {
                    c149650fsn.LIZ();
                } else {
                    int i2 = c0305e.LIZ;
                }
                if (view.getClass() != Space.class && view.getClass() != android.widget.Space.class) {
                    return this.LJII / 2;
                }
            }
            return 0;
        }
        return i;
    }

    private boolean LIZ() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public static void LIZ(String str) {
        new StringBuilder();
        throw new IllegalArgumentException(C0002O.m25086C(str, ". "));
    }

    private void LIZ(View view, int i, int i2, int i3, int i4) {
        view.measure(getChildMeasureSpec(i, LIZIZ(view, true), i3), getChildMeasureSpec(i2, LIZIZ(view, false), i4));
    }

    public final int LIZ(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return LIZJ(view, z) + LIZIZ(view, z);
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$d */
    /* loaded from: classes20.dex */
    public static class C0304d {
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;

        static {
            Covode.recordClassIndex(1334);
        }

        public C0304d() {
            LIZ();
        }

        public String toString() {
            return "Bounds{before=" + this.LIZ + ", after=" + this.LIZIZ + '}';
        }

        public void LIZ() {
            this.LIZ = Integer.MIN_VALUE;
            this.LIZIZ = Integer.MIN_VALUE;
            this.LIZJ = 2;
        }

        public int LIZ(boolean z) {
            if (!z && (this.LIZJ & 2) != 0) {
                return 100000;
            }
            return this.LIZ + this.LIZIZ;
        }

        public void LIZ(int i, int i2) {
            this.LIZ = Math.max(this.LIZ, i);
            this.LIZIZ = Math.max(this.LIZIZ, i2);
        }

        public int LIZ(GridLayout gridLayout, View view, AbstractC149652fsp abstractC149652fsp, int i, boolean z) {
            return this.LIZ - abstractC149652fsp.LIZ(view, i, C139085d7x.LIZ(gridLayout));
        }

        public final void LIZ(GridLayout gridLayout, View view, C0307i c0307i, C149650fsn c149650fsn, int i) {
            int i2;
            int i3 = this.LIZJ;
            if (c0307i.LIZLLL == GridLayout.LJIIJ && c0307i.f20264LJ == 0.0f) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            this.LIZJ = i3 & i2;
            int LIZ = c0307i.LIZ(c149650fsn.LIZ).LIZ(view, i, C139085d7x.LIZ(gridLayout));
            LIZ(LIZ, i - LIZ);
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$e */
    /* loaded from: classes20.dex */
    public static final class C0305e {
        public final int LIZ;
        public final int LIZIZ;

        static {
            Covode.recordClassIndex(1335);
        }

        public final int LIZ() {
            return this.LIZIZ - this.LIZ;
        }

        public final int hashCode() {
            return (this.LIZ * 31) + this.LIZIZ;
        }

        public final String toString() {
            return "[" + this.LIZ + ", " + this.LIZIZ + "]";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0305e c0305e = (C0305e) obj;
            if (this.LIZIZ == c0305e.LIZIZ && this.LIZ == c0305e.LIZ) {
                return true;
            }
            return false;
        }

        public C0305e(int i, int i2) {
            this.LIZ = i;
            this.LIZIZ = i2;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$g */
    /* loaded from: classes20.dex */
    public static final class C0306g {
        public int LIZ;

        static {
            Covode.recordClassIndex(1337);
        }

        public C0306g() {
            LIZ();
        }

        public final void LIZ() {
            this.LIZ = Integer.MIN_VALUE;
        }

        public final String toString() {
            return Integer.toString(this.LIZ);
        }

        public C0306g(int i) {
            this.LIZ = i;
        }
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C149649fsm();
    }

    public int getColumnCount() {
        return this.LIZJ.LIZ();
    }

    public int getRowCount() {
        return this.LIZLLL.LIZ();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        LIZIZ();
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$i */
    /* loaded from: classes20.dex */
    public static class C0307i {
        public static final C0307i LIZ = GridLayout.LIZ(Integer.MIN_VALUE, 1, GridLayout.LJIIJ, 0.0f);
        public final boolean LIZIZ;
        public final C0305e LIZJ;
        public final AbstractC149652fsp LIZLLL;

        /* renamed from: LJ */
        public final float f20264LJ;

        public int hashCode() {
            return (this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode();
        }

        static {
            Covode.recordClassIndex(1339);
        }

        public final C0307i LIZ(C0305e c0305e) {
            return new C0307i(this.LIZIZ, c0305e, this.LIZLLL, this.f20264LJ);
        }

        public final AbstractC149652fsp LIZ(boolean z) {
            if (this.LIZLLL != GridLayout.LJIIJ) {
                return this.LIZLLL;
            }
            if (this.f20264LJ == 0.0f) {
                if (z) {
                    return GridLayout.LJIILIIL;
                }
                return GridLayout.LJIJ;
            }
            return GridLayout.LJIJI;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0307i c0307i = (C0307i) obj;
            if (this.LIZLLL.equals(c0307i.LIZLLL) && this.LIZJ.equals(c0307i.LIZJ)) {
                return true;
            }
            return false;
        }

        public C0307i(boolean z, C0305e c0305e, AbstractC149652fsp abstractC149652fsp, float f) {
            this.LIZIZ = z;
            this.LIZJ = c0305e;
            this.LIZLLL = abstractC149652fsp;
            this.f20264LJ = f;
        }

        public C0307i(boolean z, int i, int i2, AbstractC149652fsp abstractC149652fsp, float f) {
            this(z, new C0305e(i, i2 + i), abstractC149652fsp, f);
        }
    }

    private void LIZIZ() {
        this.LJIIIIZZ = 0;
        C149650fsn c149650fsn = this.LIZJ;
        if (c149650fsn != null) {
            c149650fsn.LIZLLL();
        }
        C149650fsn c149650fsn2 = this.LIZLLL;
        if (c149650fsn2 != null) {
            c149650fsn2.LIZLLL();
        }
        LIZJ();
    }

    private void LIZJ() {
        C149650fsn c149650fsn = this.LIZJ;
        if (c149650fsn != null && this.LIZLLL != null) {
            c149650fsn.m21242LJ();
            this.LIZLLL.m21242LJ();
        }
    }

    /* loaded from: classes19.dex */
    public static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        public final Class<K> keyType;
        public final Class<V> valueType;

        static {
            Covode.recordClassIndex(1329);
        }

        public final C144339eUv<K, V> LIZ() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new C144339eUv<>(objArr, objArr2);
        }

        public Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static <K, V> Assoc<K, V> LIZ(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public final void LIZ(K k, V v) {
            add(Pair.create(k, v));
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$b */
    /* loaded from: classes20.dex */
    public static final class C0303b {
        public final C0305e LIZ;
        public final C0306g LIZIZ;
        public boolean LIZJ = true;

        static {
            Covode.recordClassIndex(1331);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            sb.append(" ");
            if (!this.LIZJ) {
                str = "+>";
            } else {
                str = "->";
            }
            sb.append(str);
            sb.append(" ");
            sb.append(this.LIZIZ);
            return sb.toString();
        }

        public C0303b(C0305e c0305e, C0306g c0306g) {
            this.LIZ = c0305e;
            this.LIZIZ = c0306g;
        }
    }

    private int LIZLLL() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = (i * 31) + ((C149649fsm) childAt.getLayoutParams()).hashCode();
            }
        }
        return i;
    }

    static {
        Covode.recordClassIndex(1319);
        AbstractC149652fsp abstractC149652fsp = LJJIII;
        LJIIJJI = abstractC149652fsp;
        AbstractC149652fsp abstractC149652fsp2 = LJJIIJ;
        LJIIL = abstractC149652fsp2;
        LJIILIIL = abstractC149652fsp;
        LJIILJJIL = abstractC149652fsp2;
        LJIILL = LIZ(LJIILIIL, LJIILJJIL);
        LJIILLIIL = LIZ(LJIILJJIL, LJIILIIL);
    }

    /* renamed from: LJ */
    private void m21152LJ() {
        boolean z;
        C149650fsn c149650fsn;
        int i;
        C0307i c0307i;
        C0307i c0307i2;
        int i2;
        while (true) {
            int i3 = this.LJIIIIZZ;
            if (i3 == 0) {
                if (this.f20263LJ == 0) {
                    z = true;
                    c149650fsn = this.LIZJ;
                } else {
                    z = false;
                    c149650fsn = this.LIZLLL;
                }
                if (c149650fsn.LIZIZ != Integer.MIN_VALUE) {
                    i = c149650fsn.LIZIZ;
                } else {
                    i = 0;
                }
                int[] iArr = new int[i];
                int childCount = getChildCount();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    C149649fsm c149649fsm = (C149649fsm) getChildAt(i6).getLayoutParams();
                    if (z) {
                        c0307i = c149649fsm.LIZ;
                    } else {
                        c0307i = c149649fsm.LIZIZ;
                    }
                    C0305e c0305e = c0307i.LIZJ;
                    boolean z2 = c0307i.LIZIZ;
                    int LIZ2 = c0305e.LIZ();
                    if (z2) {
                        i4 = c0305e.LIZ;
                    }
                    if (z) {
                        c0307i2 = c149649fsm.LIZIZ;
                    } else {
                        c0307i2 = c149649fsm.LIZ;
                    }
                    C0305e c0305e2 = c0307i2.LIZJ;
                    boolean z3 = c0307i2.LIZIZ;
                    int LIZ3 = c0305e2.LIZ();
                    if (i != 0) {
                        if (z3) {
                            i2 = Math.min(c0305e2.LIZ, i);
                        } else {
                            i2 = 0;
                        }
                        LIZ3 = Math.min(LIZ3, i - i2);
                    }
                    if (z3) {
                        i5 = c0305e2.LIZ;
                    }
                    if (i != 0) {
                        if (!z2 || !z3) {
                            while (true) {
                                int i7 = i5 + LIZ3;
                                if (i7 <= iArr.length) {
                                    for (int i8 = i5; i8 < i7; i8++) {
                                        if (iArr[i8] <= i4) {
                                        }
                                    }
                                    break;
                                }
                                if (z3) {
                                    i4++;
                                } else if (i7 <= i) {
                                    i5++;
                                } else {
                                    i4++;
                                    i5 = 0;
                                }
                            }
                        }
                        int length = iArr.length;
                        Arrays.fill(iArr, Math.min(i5, length), Math.min(i5 + LIZ3, length), i4 + LIZ2);
                    }
                    if (z) {
                        LIZ(c149649fsm, i4, LIZ2, i5, LIZ3);
                    } else {
                        LIZ(c149649fsm, i5, LIZ3, i4, LIZ2);
                    }
                    i5 += LIZ3;
                }
                this.LJIIIIZZ = LIZLLL();
                return;
            } else if (i3 != LIZLLL()) {
                this.LJIIIZ.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                LIZIZ();
            } else {
                return;
            }
        }
    }

    public GridLayout(Context context) {
        this(context, null);
    }

    public static C149649fsm LIZ(View view) {
        return (C149649fsm) view.getLayoutParams();
    }

    public void setAlignmentMode(int i) {
        this.LJI = i;
        requestLayout();
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = LIZIZ;
        }
        this.LJIIIZ = printer;
    }

    public void setUseDefaultMargins(boolean z) {
        this.LJFF = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C149649fsm)) {
            return false;
        }
        C149649fsm c149649fsm = (C149649fsm) layoutParams;
        LIZ(c149649fsm, true);
        LIZ(c149649fsm, false);
        return true;
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C149649fsm(getContext(), attributeSet);
    }

    public void setColumnCount(int i) {
        this.LIZJ.LIZ(i);
        LIZIZ();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.LIZJ.LIZ(z);
        LIZIZ();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.f20263LJ != i) {
            this.f20263LJ = i;
            LIZIZ();
            requestLayout();
        }
    }

    public void setRowCount(int i) {
        this.LIZLLL.LIZ(i);
        LIZIZ();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.LIZLLL.LIZ(z);
        LIZIZ();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C149649fsm) {
            return new C149649fsm((C149649fsm) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C149649fsm((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C149649fsm(layoutParams);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int LIZ(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    private int LIZIZ(View view, boolean z) {
        return LIZIZ(view, z, true) + LIZIZ(view, z, false);
    }

    public static int LIZJ(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    public static AbstractC149652fsp LIZ(final AbstractC149652fsp abstractC149652fsp, final AbstractC149652fsp abstractC149652fsp2) {
        return new AbstractC149652fsp() { // from class: androidx.gridlayout.widget.GridLayout.5
            static {
                Covode.recordClassIndex(1324);
            }

            @Override // p003X.AbstractC149652fsp
            public final String LIZ() {
                return C0002O.m25083C("SWITCHING[L:", AbstractC149652fsp.this.LIZ(), ", R:", abstractC149652fsp2.LIZ(), "]");
            }

            @Override // p003X.AbstractC149652fsp
            public final int LIZ(View view, int i) {
                AbstractC149652fsp abstractC149652fsp3;
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    abstractC149652fsp3 = abstractC149652fsp2;
                } else {
                    abstractC149652fsp3 = AbstractC149652fsp.this;
                }
                return abstractC149652fsp3.LIZ(view, i);
            }

            @Override // p003X.AbstractC149652fsp
            public final int LIZ(View view, int i, int i2) {
                AbstractC149652fsp abstractC149652fsp3;
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    abstractC149652fsp3 = abstractC149652fsp2;
                } else {
                    abstractC149652fsp3 = AbstractC149652fsp.this;
                }
                return abstractC149652fsp3.LIZ(view, i, i2);
            }
        };
    }

    public static AbstractC149652fsp LIZ(int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = 7;
            i3 = 0;
        } else {
            i2 = 112;
            i3 = 4;
        }
        int i4 = (i & i2) >> i3;
        if (i4 != 1) {
            if (i4 != 3) {
                if (i4 != 5) {
                    if (i4 != 7) {
                        if (i4 != 8388611) {
                            if (i4 != 8388613) {
                                return LJIIJ;
                            }
                            return LJIILJJIL;
                        }
                        return LJIILIIL;
                    }
                    return LJIJI;
                } else if (z) {
                    return LJIILLIIL;
                } else {
                    return LJIIL;
                }
            } else if (z) {
                return LJIILL;
            } else {
                return LJIIJJI;
            }
        }
        return LJIIZILJ;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int LIZIZ2;
        int LIZIZ3;
        m21152LJ();
        LIZJ();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int LIZ2 = LIZ(i, -paddingLeft);
        int LIZ3 = LIZ(i2, -paddingTop);
        LIZ(LIZ2, LIZ3, true);
        if (this.f20263LJ == 0) {
            LIZIZ3 = this.LIZJ.LIZIZ(LIZ2);
            LIZ(LIZ2, LIZ3, false);
            LIZIZ2 = this.LIZLLL.LIZIZ(LIZ3);
        } else {
            LIZIZ2 = this.LIZLLL.LIZIZ(LIZ3);
            LIZ(LIZ2, LIZ3, false);
            LIZIZ3 = this.LIZJ.LIZIZ(LIZ2);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(LIZIZ3 + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(LIZIZ2 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    private void LIZ(C149649fsm c149649fsm, boolean z) {
        String str;
        C0307i c0307i;
        C149650fsn c149650fsn;
        if (z) {
            str = "column";
            c0307i = c149649fsm.LIZIZ;
        } else {
            str = "row";
            c0307i = c149649fsm.LIZ;
        }
        C0305e c0305e = c0307i.LIZJ;
        if (c0305e.LIZ != Integer.MIN_VALUE && c0305e.LIZ < 0) {
            new StringBuilder();
            LIZ(C0002O.m25086C(str, " indices must be positive"));
        }
        if (z) {
            c149650fsn = this.LIZJ;
        } else {
            c149650fsn = this.LIZLLL;
        }
        int i = c149650fsn.LIZIZ;
        if (i != Integer.MIN_VALUE) {
            if (c0305e.LIZIZ > i) {
                new StringBuilder();
                LIZ(C0002O.m25084C(str, " indices (start + span) mustn't exceed the ", str, " count"));
            }
            if (c0305e.LIZ() > i) {
                new StringBuilder();
                LIZ(C0002O.m25084C(str, " span mustn't exceed the ", str, " count"));
            }
        }
    }

    public static C0307i LIZ(int i, int i2, float f) {
        return LIZ(Integer.MIN_VALUE, i2, LJIIJ, 1.0f);
    }

    private int LIZIZ(View view, boolean z, boolean z2) {
        C149650fsn c149650fsn;
        int[] iArr;
        C0307i c0307i;
        int i;
        if (this.LJI == 1) {
            return LIZ(view, z, z2);
        }
        if (z) {
            c149650fsn = this.LIZJ;
        } else {
            c149650fsn = this.LIZLLL;
        }
        if (z2) {
            if (c149650fsn.LJIIIIZZ == null) {
                c149650fsn.LJIIIIZZ = new int[c149650fsn.LIZ() + 1];
            }
            if (!c149650fsn.LJIIIZ) {
                c149650fsn.LIZIZ(true);
                c149650fsn.LJIIIZ = true;
            }
            iArr = c149650fsn.LJIIIIZZ;
        } else {
            if (c149650fsn.LJIIJ == null) {
                c149650fsn.LJIIJ = new int[c149650fsn.LIZ() + 1];
            }
            if (!c149650fsn.LJIIJJI) {
                c149650fsn.LIZIZ(false);
                c149650fsn.LJIIJJI = true;
            }
            iArr = c149650fsn.LJIIJ;
        }
        C149649fsm LIZ2 = LIZ(view);
        if (z) {
            c0307i = LIZ2.LIZIZ;
        } else {
            c0307i = LIZ2.LIZ;
        }
        C0305e c0305e = c0307i.LIZJ;
        if (z2) {
            i = c0305e.LIZ;
        } else {
            i = c0305e.LIZIZ;
        }
        return iArr[i];
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LIZJ = new C149650fsn(this, true);
        this.LIZLLL = new C149650fsn(this, false);
        this.f20263LJ = 0;
        this.LJFF = false;
        this.LJI = 1;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = LIZ;
        this.LJII = context.getResources().getDimensionPixelOffset(2131427920);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772178, 2130772761, 2130772762, 2130773842, 2130774199, 2130774201, 2130774997});
        try {
            setRowCount(obtainStyledAttributes.getInt(LJIJJLI, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(LJIL, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(LJIJJ, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(LJJ, false));
            setAlignmentMode(obtainStyledAttributes.getInt(LJJI, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(LJJIFFI, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(LJJII, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void LIZ(int i, int i2, boolean z) {
        boolean z2;
        C0307i c0307i;
        C149650fsn c149650fsn;
        GridLayout gridLayout = this;
        int childCount = gridLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = gridLayout.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C149649fsm LIZ2 = LIZ(childAt);
                if (z) {
                    gridLayout.LIZ(childAt, i, i2, LIZ2.width, LIZ2.height);
                } else {
                    if (gridLayout.f20263LJ == 0) {
                        z2 = true;
                        c0307i = LIZ2.LIZIZ;
                    } else {
                        z2 = false;
                        c0307i = LIZ2.LIZ;
                    }
                    if (c0307i.LIZ(z2) == LJIJI) {
                        C0305e c0305e = c0307i.LIZJ;
                        if (z2) {
                            c149650fsn = gridLayout.LIZJ;
                        } else {
                            c149650fsn = gridLayout.LIZLLL;
                        }
                        int[] LIZJ = c149650fsn.LIZJ();
                        int LIZIZ2 = (LIZJ[c0305e.LIZIZ] - LIZJ[c0305e.LIZ]) - gridLayout.LIZIZ(childAt, z2);
                        if (z2) {
                            gridLayout.LIZ(childAt, i, i2, LIZIZ2, LIZ2.height);
                        } else {
                            gridLayout = gridLayout;
                            gridLayout.LIZ(childAt, i, i2, LIZ2.width, LIZIZ2);
                        }
                    }
                }
            }
        }
    }

    public static C0307i LIZ(int i, int i2, AbstractC149652fsp abstractC149652fsp, float f) {
        boolean z;
        if (i != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        return new C0307i(z, i, i2, abstractC149652fsp, f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        GridLayout gridLayout = this;
        m21152LJ();
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        gridLayout.LIZJ.LIZJ((i6 - paddingLeft) - paddingRight);
        gridLayout.LIZLLL.LIZJ(((i4 - i2) - paddingTop) - paddingBottom);
        int[] LIZJ = gridLayout.LIZJ.LIZJ();
        int[] LIZJ2 = gridLayout.LIZLLL.LIZJ();
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = gridLayout.getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C149649fsm LIZ2 = LIZ(childAt);
                C0307i c0307i = LIZ2.LIZIZ;
                C0307i c0307i2 = LIZ2.LIZ;
                C0305e c0305e = c0307i.LIZJ;
                C0305e c0305e2 = c0307i2.LIZJ;
                int i8 = LIZJ[c0305e.LIZ];
                int i9 = LIZJ2[c0305e2.LIZ];
                int i10 = LIZJ[c0305e.LIZIZ] - i8;
                int i11 = LIZJ2[c0305e2.LIZIZ] - i9;
                int LIZJ3 = LIZJ(childAt, true);
                int LIZJ4 = LIZJ(childAt, z2);
                AbstractC149652fsp LIZ3 = c0307i.LIZ(true);
                AbstractC149652fsp LIZ4 = c0307i2.LIZ(z2);
                C0304d LIZ5 = gridLayout.LIZJ.LIZIZ().LIZ(i7);
                C0304d LIZ6 = gridLayout.LIZLLL.LIZIZ().LIZ(i7);
                int LIZ7 = LIZ3.LIZ(childAt, i10 - LIZ5.LIZ(true));
                int LIZ8 = LIZ4.LIZ(childAt, i11 - LIZ6.LIZ(true));
                int LIZIZ2 = gridLayout.LIZIZ(childAt, true, true);
                int LIZIZ3 = gridLayout.LIZIZ(childAt, false, true);
                int LIZIZ4 = gridLayout.LIZIZ(childAt, true, false);
                int i12 = LIZIZ2 + LIZIZ4;
                int LIZIZ5 = LIZIZ3 + gridLayout.LIZIZ(childAt, false, false);
                int LIZ9 = LIZ5.LIZ(this, childAt, LIZ3, LIZJ3 + i12, true);
                int LIZ10 = LIZ6.LIZ(this, childAt, LIZ4, LIZJ4 + LIZIZ5, false);
                int LIZ11 = LIZ3.LIZ(LIZJ3, i10 - i12);
                int LIZ12 = LIZ4.LIZ(LIZJ4, i11 - LIZIZ5);
                int i13 = i8 + LIZ7 + LIZ9;
                if (!LIZ()) {
                    i5 = paddingLeft + LIZIZ2 + i13;
                } else {
                    i5 = (((i6 - LIZ11) - paddingRight) - LIZIZ4) - i13;
                }
                int i14 = paddingTop + i9 + LIZ8 + LIZ10 + LIZIZ3;
                if (LIZ11 != childAt.getMeasuredWidth() || LIZ12 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(LIZ11, 1073741824), View.MeasureSpec.makeMeasureSpec(LIZ12, 1073741824));
                }
                childAt.layout(i5, i14, LIZ11 + i5, LIZ12 + i14);
            }
            i7++;
            gridLayout = this;
            z2 = false;
        }
    }

    public static void LIZ(C149649fsm c149649fsm, int i, int i2, int i3, int i4) {
        c149649fsm.LIZ = c149649fsm.LIZ.LIZ(new C0305e(i, i2 + i));
        c149649fsm.LIZIZ = c149649fsm.LIZIZ.LIZ(new C0305e(i3, i4 + i3));
    }
}
