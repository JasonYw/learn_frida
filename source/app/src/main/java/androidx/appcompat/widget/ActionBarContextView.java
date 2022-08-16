package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0199g;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.AbstractC138428cxM;
import p003X.AbstractC138442cxa;
import p003X.C116971W2r;
import p003X.C137833cne;
import p003X.C138269cum;

/* loaded from: classes17.dex */
public class ActionBarContextView extends AbstractC138428cxM {
    public boolean LJI;
    public CharSequence LJII;
    public CharSequence LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public LinearLayout LJIIJJI;
    public TextView LJIIL;
    public TextView LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;

    static {
        Covode.recordClassIndex(581);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CharSequence getSubtitle() {
        return this.LJIIIIZZ;
    }

    public CharSequence getTitle() {
        return this.LJII;
    }

    public final void LIZIZ() {
        if (this.LJIIIZ == null) {
            LIZJ();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // p003X.AbstractC138428cxM
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p003X.AbstractC138428cxM
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // p003X.AbstractC138428cxM
    public final boolean LIZ() {
        if (this.LIZLLL != null) {
            return this.LIZLLL.LIZIZ();
        }
        return false;
    }

    public final void LIZJ() {
        removeAllViews();
        this.LJIIJ = null;
        this.LIZJ = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LIZLLL != null) {
            this.LIZLLL.LIZJ();
            this.LIZLLL.m21195LJ();
        }
    }

    private void LIZLLL() {
        int i;
        if (this.LJIIJJI == null) {
            LayoutInflater.from(getContext()).inflate(2131689486, this);
            this.LJIIJJI = (LinearLayout) getChildAt(getChildCount() - 1);
            this.LJIIL = (TextView) this.LJIIJJI.findViewById(2131165790);
            this.LJIILIIL = (TextView) this.LJIIJJI.findViewById(2131165789);
            if (this.LJIILJJIL != 0) {
                this.LJIIL.setTextAppearance(getContext(), this.LJIILJJIL);
            }
            if (this.LJIILL != 0) {
                this.LJIILIIL.setTextAppearance(getContext(), this.LJIILL);
            }
        }
        this.LJIIL.setText(this.LJII);
        this.LJIILIIL.setText(this.LJIIIIZZ);
        boolean z = !TextUtils.isEmpty(this.LJII);
        boolean z2 = !TextUtils.isEmpty(this.LJIIIIZZ);
        TextView textView = this.LJIILIIL;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.LJIIJJI;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (this.LJIIJJI.getParent() == null) {
            addView(this.LJIIJJI);
        }
    }

    @Override // p003X.AbstractC138428cxM
    public void setContentHeight(int i) {
        this.f18336LJ = i;
    }

    @Override // p003X.AbstractC138428cxM, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // p003X.AbstractC138428cxM, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // p003X.AbstractC138428cxM, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.LJIIIIZZ = charSequence;
        LIZLLL();
    }

    public void setTitle(CharSequence charSequence) {
        this.LJII = charSequence;
        LIZLLL();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.LJI) {
            requestLayout();
        }
        this.LJI = z;
    }

    public void setCustomView(View view) {
        View view2 = this.LJIIJ;
        if (view2 != null) {
            removeView(view2);
        }
        this.LJIIJ = view;
        if (view != null) {
            LinearLayout linearLayout = this.LJIIJJI;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.LJIIJJI = null;
            }
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.LJII);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void LIZ(final AbstractC138442cxa abstractC138442cxa) {
        View view = this.LJIIIZ;
        if (view == null) {
            this.LJIIIZ = C116971W2r.LIZ(LayoutInflater.from(getContext()), this.LJIILLIIL, (ViewGroup) this, false);
            addView(this.LJIIIZ);
        } else if (view.getParent() == null) {
            addView(this.LJIIIZ);
        }
        this.LJIIIZ.findViewById(2131165811).setOnClickListener(new View.OnClickListener(this) { // from class: androidx.appcompat.widget.ActionBarContextView.1
            static {
                Covode.recordClassIndex(582);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                abstractC138442cxa.LIZJ();
            }
        });
        C0199g c0199g = (C0199g) abstractC138442cxa.LIZIZ();
        if (this.LIZLLL != null) {
            this.LIZLLL.LIZLLL();
        }
        this.LIZLLL = new ActionMenuPresenter(getContext());
        this.LIZLLL.LIZ(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0199g.addMenuPresenter(this.LIZLLL, this.LIZIZ);
        this.LIZJ = (ActionMenuView) this.LIZLLL.LIZ(this);
        ViewCompat.setBackground(this.LIZJ, null);
        addView(this.LIZJ, layoutParams);
    }

    @Override // p003X.AbstractC138428cxM
    public final /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat LIZ(int i, long j) {
        return super.LIZ(i, j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130772155);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size2 = View.MeasureSpec.getSize(i);
                if (this.f18336LJ > 0) {
                    size = this.f18336LJ;
                } else {
                    size = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size2 - getPaddingLeft()) - getPaddingRight();
                int i6 = size - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
                View view = this.LJIIIZ;
                if (view != null) {
                    int LIZ = AbstractC138428cxM.LIZ(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJIIIZ.getLayoutParams();
                    paddingLeft = LIZ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                if (this.LIZJ != null && this.LIZJ.getParent() == this) {
                    paddingLeft = AbstractC138428cxM.LIZ(this.LIZJ, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.LJIIJJI;
                if (linearLayout != null && this.LJIIJ == null) {
                    if (this.LJI) {
                        this.LJIIJJI.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.LJIIJJI.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                            paddingLeft -= measuredWidth;
                        } else {
                            z = false;
                        }
                        LinearLayout linearLayout2 = this.LJIIJJI;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = AbstractC138428cxM.LIZ(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.LJIIJ;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams.width != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (layoutParams.width >= 0) {
                        paddingLeft = Math.min(layoutParams.width, paddingLeft);
                    }
                    if (layoutParams.height == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (layoutParams.height >= 0) {
                        i6 = Math.min(layoutParams.height, i6);
                    }
                    this.LJIIJ.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i6, i5));
                }
                if (this.f18336LJ <= 0) {
                    int childCount = getChildCount();
                    int i7 = 0;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i7) {
                            i7 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size2, i7);
                    return;
                }
                setMeasuredDimension(size2, size);
                return;
            }
            new StringBuilder();
            throw new IllegalStateException(C0002O.m25086C(getClass().getSimpleName(), " can only be used with android:layout_height=\"wrap_content\""));
        }
        new StringBuilder();
        throw new IllegalStateException(C0002O.m25086C(getClass().getSimpleName(), " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C138269cum LIZ = C138269cum.LIZ(context, attributeSet, new int[]{2130772256, 2130772259, 2130772741, 2130773218, 2130774600, 2130774767}, i, 0);
        ViewCompat.setBackground(this, LIZ.LIZ(0));
        this.LJIILJJIL = LIZ.LJI(5, 0);
        this.LJIILL = LIZ.LJI(4, 0);
        this.f18336LJ = LIZ.LJFF(3, 0);
        this.LJIILLIIL = LIZ.LJI(2, 2131689491);
        LIZ.LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean LIZ = C137833cne.LIZ(this);
        if (LIZ) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.LJIIIZ;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJIIIZ.getLayoutParams();
            if (LIZ) {
                i5 = marginLayoutParams.rightMargin;
                i6 = marginLayoutParams.leftMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
                i6 = marginLayoutParams.rightMargin;
            }
            int LIZ2 = AbstractC138428cxM.LIZ(paddingLeft, i5, LIZ);
            paddingLeft = AbstractC138428cxM.LIZ(LIZ2 + AbstractC138428cxM.LIZ(this.LJIIIZ, LIZ2, paddingTop, paddingTop2, LIZ), i6, LIZ);
        }
        LinearLayout linearLayout = this.LJIIJJI;
        if (linearLayout != null && this.LJIIJ == null && linearLayout.getVisibility() != 8) {
            paddingLeft += AbstractC138428cxM.LIZ(this.LJIIJJI, paddingLeft, paddingTop, paddingTop2, LIZ);
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            AbstractC138428cxM.LIZ(view2, paddingLeft, paddingTop, paddingTop2, LIZ);
        }
        if (LIZ) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        if (this.LIZJ != null) {
            AbstractC138428cxM.LIZ(this.LIZJ, paddingRight, paddingTop, paddingTop2, !LIZ);
        }
    }
}
