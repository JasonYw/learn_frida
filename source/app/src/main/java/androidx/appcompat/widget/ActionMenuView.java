package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0199g;
import androidx.appcompat.view.menu.C0200i;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138360cwG;
import p003X.AbstractC138363cwJ;
import p003X.AbstractC138390cwk;
import p003X.AbstractC138401cwv;
import p003X.AbstractC138402cww;
import p003X.AbstractC138403cwx;
import p003X.C137833cne;
import p003X.C138396cwq;
import p003X.C138398cws;
import p003X.C138400cwu;

/* loaded from: classes17.dex */
public class ActionMenuView extends LinearLayoutCompat implements AbstractC138360cwG, AbstractC138363cwJ {
    public C0199g LIZ;
    public boolean LIZIZ;
    public ActionMenuPresenter LIZJ;
    public AbstractC138401cwv LIZLLL;

    /* renamed from: LJ */
    public AbstractC138403cwx f20227LJ;
    public Context LJFF;
    public int LJI;
    public AbstractC138390cwk LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    static {
        Covode.recordClassIndex(599);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public int getPopupTheme() {
        return this.LJI;
    }

    public final C138396cwq LIZ() {
        C138396cwq LIZJ = LIZJ();
        LIZJ.LIZ = true;
        return LIZJ;
    }

    public final void LIZIZ() {
        ActionMenuPresenter actionMenuPresenter = this.LIZJ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LIZLLL();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    public /* synthetic */ ViewGroup.LayoutParams mo25200generateDefaultLayoutParams() {
        return LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
    }

    public static C138396cwq LIZJ() {
        C138396cwq c138396cwq = new C138396cwq(-2, -2);
        c138396cwq.gravity = 16;
        return c138396cwq;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public /* synthetic */ LinearLayoutCompat.LayoutParams mo25200generateDefaultLayoutParams() {
        return LIZJ();
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.LIZJ;
        if (actionMenuPresenter.LJII != null) {
            return actionMenuPresenter.LJII.getDrawable();
        }
        if (actionMenuPresenter.LJIIIZ) {
            return actionMenuPresenter.LJIIIIZZ;
        }
        return null;
    }

    public Menu getMenu() {
        if (this.LIZ == null) {
            Context context = getContext();
            this.LIZ = new C0199g(context);
            this.LIZ.setCallback(new C138398cws(this));
            this.LIZJ = new ActionMenuPresenter(context);
            this.LIZJ.LIZ(true);
            ActionMenuPresenter actionMenuPresenter = this.LIZJ;
            AbstractC138390cwk abstractC138390cwk = this.LJII;
            if (abstractC138390cwk == null) {
                abstractC138390cwk = new C138400cwu();
            }
            actionMenuPresenter.setCallback(abstractC138390cwk);
            this.LIZ.addMenuPresenter(this.LIZJ, this.LJFF);
            this.LIZJ.LIZ(this);
        }
        return this.LIZ;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C138396cwq;
    }

    @Override // p003X.AbstractC138363cwJ
    public void initialize(C0199g c0199g) {
        this.LIZ = c0199g;
    }

    public void setOnMenuItemClickListener(AbstractC138403cwx abstractC138403cwx) {
        this.f20227LJ = abstractC138403cwx;
    }

    public void setOverflowReserved(boolean z) {
        this.LIZIZ = z;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.LIZJ.LJIIJJI = z;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.LIZJ = actionMenuPresenter;
        this.LIZJ.LIZ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: LIZ */
    public C138396cwq mo25201generateLayoutParams(AttributeSet attributeSet) {
        return new C138396cwq(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.LIZJ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.LIZJ.LJFF()) {
                this.LIZJ.LIZJ();
                this.LIZJ.LIZIZ();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.LIZJ;
        if (actionMenuPresenter.LJII != null) {
            actionMenuPresenter.LJII.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.LJIIIZ = true;
        actionMenuPresenter.LJIIIIZZ = drawable;
    }

    public void setPopupTheme(int i) {
        if (this.LJI != i) {
            this.LJI = i;
            if (i == 0) {
                this.LJFF = getContext();
            } else {
                this.LJFF = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    private boolean LIZ(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC138402cww)) {
            z = false | ((AbstractC138402cww) childAt).LIZJ();
        }
        if (i > 0 && (childAt2 instanceof AbstractC138402cww)) {
            return z | ((AbstractC138402cww) childAt2).LIZIZ();
        }
        return z;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: LIZ */
    public final C138396cwq mo25202generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C138396cwq c138396cwq;
        if (layoutParams != null) {
            if (layoutParams instanceof C138396cwq) {
                c138396cwq = new C138396cwq((C138396cwq) layoutParams);
            } else {
                c138396cwq = new C138396cwq(layoutParams);
            }
            if (c138396cwq.gravity <= 0) {
                c138396cwq.gravity = 16;
            }
            return c138396cwq;
        }
        return LIZJ();
    }

    @Override // p003X.AbstractC138360cwG
    public final boolean LIZ(C0200i c0200i) {
        return this.LIZ.performItemAction(c0200i, 0);
    }

    public final void LIZ(AbstractC138390cwk abstractC138390cwk, AbstractC138401cwv abstractC138401cwv) {
        this.LJII = abstractC138390cwk;
        this.LIZLLL = abstractC138401cwv;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.LJIIJ = (int) (56.0f * f);
        this.LJIIJJI = (int) (f * 4.0f);
        this.LJFF = context;
        this.LJI = 0;
    }

    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v89 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        ?? r0;
        boolean z4;
        int i4;
        C0199g c0199g;
        boolean z5 = this.LJIIIIZZ;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        if (z5 != this.LJIIIIZZ) {
            this.LJIIIZ = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.LJIIIIZZ && (c0199g = this.LIZ) != null && size != this.LJIIIZ) {
            this.LJIIIZ = size;
            c0199g.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.LJIIIIZZ) {
            if (childCount > 0) {
                int mode = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
                int i5 = size2 - paddingLeft;
                int i6 = this.LJIIJ;
                int i7 = i5 / i6;
                int i8 = i5 % i6;
                if (i7 == 0) {
                    setMeasuredDimension(i5, 0);
                    return;
                }
                int i9 = i6 + (i8 / i7);
                int childCount2 = getChildCount();
                int i10 = 0;
                int i11 = 0;
                boolean z6 = false;
                int i12 = 0;
                int i13 = 0;
                long j = 0;
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        boolean z7 = childAt instanceof ActionMenuItemView;
                        i12++;
                        if (z7) {
                            int i15 = this.LJIIJJI;
                            r0 = 0;
                            childAt.setPadding(i15, 0, i15, 0);
                        } else {
                            r0 = 0;
                        }
                        C138396cwq c138396cwq = (C138396cwq) childAt.getLayoutParams();
                        c138396cwq.LJFF = r0;
                        int i16 = r0 == true ? 1 : 0;
                        int i17 = r0 == true ? 1 : 0;
                        c138396cwq.LIZJ = i16;
                        c138396cwq.LIZIZ = r0;
                        c138396cwq.LIZLLL = r0;
                        c138396cwq.leftMargin = r0;
                        c138396cwq.rightMargin = r0;
                        if (z7 && ((ActionMenuItemView) childAt).LIZ()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c138396cwq.f18328LJ = z4;
                        if (c138396cwq.LIZ) {
                            i4 = 1;
                        } else {
                            i4 = i7;
                        }
                        int LIZ = LIZ(childAt, i9, i4, childMeasureSpec, paddingTop);
                        i10 = Math.max(i10, LIZ);
                        if (c138396cwq.LIZLLL) {
                            i13++;
                        }
                        if (c138396cwq.LIZ) {
                            z6 = true;
                        }
                        i7 -= LIZ;
                        i11 = Math.max(i11, childAt.getMeasuredHeight());
                        if (LIZ == 1) {
                            j |= 1 << i14;
                        }
                    }
                }
                if (z6 && i12 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z8 = false;
                while (i13 > 0 && i7 > 0) {
                    int i18 = Integer.MAX_VALUE;
                    int i19 = 0;
                    long j2 = 0;
                    for (int i20 = 0; i20 < childCount2; i20++) {
                        C138396cwq c138396cwq2 = (C138396cwq) getChildAt(i20).getLayoutParams();
                        if (c138396cwq2.LIZLLL) {
                            if (c138396cwq2.LIZIZ < i18) {
                                i18 = c138396cwq2.LIZIZ;
                                j2 = 1 << i20;
                                i19 = 1;
                            } else if (c138396cwq2.LIZIZ == i18) {
                                j2 |= 1 << i20;
                                i19++;
                            }
                        }
                    }
                    j |= j2;
                    if (i19 > i7) {
                        break;
                    }
                    int i21 = i18 + 1;
                    for (int i22 = 0; i22 < childCount2; i22++) {
                        View childAt2 = getChildAt(i22);
                        C138396cwq c138396cwq3 = (C138396cwq) childAt2.getLayoutParams();
                        long j3 = 1 << i22;
                        if ((j2 & j3) == 0) {
                            if (c138396cwq3.LIZIZ == i21) {
                                j |= j3;
                            }
                        } else {
                            if (z2 && c138396cwq3.f18328LJ && i7 == 1) {
                                int i23 = this.LJIIJJI;
                                childAt2.setPadding(i23 + i9, 0, i23, 0);
                            }
                            c138396cwq3.LIZIZ++;
                            c138396cwq3.LJFF = true;
                            i7--;
                        }
                    }
                    z8 = true;
                }
                if (!z6 && i12 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i7 > 0 && j != 0 && (i7 < i12 - 1 || z3 || i10 > 1)) {
                    float bitCount = Long.bitCount(j);
                    if (!z3) {
                        if ((j & 1) != 0 && !((C138396cwq) getChildAt(0).getLayoutParams()).f18328LJ) {
                            bitCount -= 0.5f;
                        }
                        int i24 = childCount2 - 1;
                        if ((j & (1 << i24)) != 0 && !((C138396cwq) getChildAt(i24).getLayoutParams()).f18328LJ) {
                            bitCount -= 0.5f;
                        }
                    }
                    if (bitCount > 0.0f) {
                        i3 = (int) ((i7 * i9) / bitCount);
                    } else {
                        i3 = 0;
                    }
                    for (int i25 = 0; i25 < childCount2; i25++) {
                        if ((j & (1 << i25)) != 0) {
                            View childAt3 = getChildAt(i25);
                            C138396cwq c138396cwq4 = (C138396cwq) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                c138396cwq4.LIZJ = i3;
                                c138396cwq4.LJFF = true;
                                if (i25 == 0 && !c138396cwq4.f18328LJ) {
                                    c138396cwq4.leftMargin = (-i3) / 2;
                                }
                            } else if (c138396cwq4.LIZ) {
                                c138396cwq4.LIZJ = i3;
                                c138396cwq4.LJFF = true;
                                c138396cwq4.rightMargin = (-i3) / 2;
                            } else {
                                if (i25 != 0) {
                                    c138396cwq4.leftMargin = i3 / 2;
                                }
                                if (i25 != childCount2 - 1) {
                                    c138396cwq4.rightMargin = i3 / 2;
                                }
                            }
                            z8 = true;
                        }
                    }
                }
                if (z8) {
                    for (int i26 = 0; i26 < childCount2; i26++) {
                        View childAt4 = getChildAt(i26);
                        C138396cwq c138396cwq5 = (C138396cwq) childAt4.getLayoutParams();
                        if (c138396cwq5.LJFF) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec((c138396cwq5.LIZIZ * i9) + c138396cwq5.LIZJ, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode == 1073741824) {
                    i11 = size3;
                }
                setMeasuredDimension(i5, i11);
                return;
            }
        } else {
            for (int i27 = 0; i27 < childCount; i27++) {
                C138396cwq c138396cwq6 = (C138396cwq) getChildAt(i27).getLayoutParams();
                c138396cwq6.rightMargin = 0;
                c138396cwq6.leftMargin = 0;
            }
        }
        super.onMeasure(i, i2);
    }

    public static int LIZ(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        C138396cwq c138396cwq = (C138396cwq) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView != null && actionMenuItemView.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        int i5 = 2;
        if (i2 > 0 && (!z || i2 >= 2)) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        } else {
            i5 = 0;
        }
        if (c138396cwq.LIZ || !z) {
            z2 = false;
        }
        c138396cwq.LIZLLL = z2;
        c138396cwq.LIZIZ = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.LJIIIIZZ) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean LIZ = C137833cne.LIZ(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C138396cwq c138396cwq = (C138396cwq) childAt.getLayoutParams();
                if (c138396cwq.LIZ) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (LIZ(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (LIZ) {
                        i7 = getPaddingLeft() + c138396cwq.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - c138396cwq.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + c138396cwq.leftMargin) + c138396cwq.rightMargin;
                    LIZ(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i6 = paddingRight / i16;
            i5 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int max = Math.max(i5, i6);
        if (LIZ) {
            int width2 = getWidth() - getPaddingRight();
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                C138396cwq c138396cwq2 = (C138396cwq) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c138396cwq2.LIZ) {
                    int i17 = width2 - c138396cwq2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + c138396cwq2.leftMargin) + max);
                }
                i5++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i5 < childCount) {
            View childAt4 = getChildAt(i5);
            C138396cwq c138396cwq3 = (C138396cwq) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c138396cwq3.LIZ) {
                int i19 = paddingLeft + c138396cwq3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + c138396cwq3.rightMargin + max;
            }
            i5++;
        }
    }
}
