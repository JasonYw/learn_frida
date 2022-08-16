package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p003X.AbstractC139120d8W;
import p003X.C139096d88;
import p003X.C139118d8U;
import p003X.C139119d8V;

/* loaded from: classes17.dex */
public class SlidingPaneLayout extends ViewGroup {
    public int LIZ;
    public final int LIZIZ;
    public boolean LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public float f20287LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public AbstractC139120d8W LJIIIIZZ;
    public final ViewDragHelper LJIIIZ;
    public boolean LJIIJ;
    public final ArrayList<RunnableC0405b> LJIIJJI;
    public int LJIIL;
    public Drawable LJIILIIL;
    public Drawable LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public boolean LJIJ;
    public final Rect LJIJI;
    public Method LJIJJ;
    public Field LJIJJLI;
    public boolean LJIL;

    static {
        Covode.recordClassIndex(1877);
    }

    public int getCoveredFadeColor() {
        return this.LJIIL;
    }

    public int getParallaxDistance() {
        return this.LJII;
    }

    public int getSliderFadeColor() {
        return this.LIZ;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C139119d8V();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJIJ = true;
    }

    /* loaded from: classes17.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            static {
                Covode.recordClassIndex(1879);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }
        };
        public boolean LIZ;

        static {
            Covode.recordClassIndex(1878);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZ = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ ? 1 : 0);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    /* loaded from: classes17.dex */
    public class RunnableC0405b implements Runnable {
        public final View LIZ;

        static {
            Covode.recordClassIndex(1881);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.LIZ.getParent() == SlidingPaneLayout.this) {
                this.LIZ.setLayerType(0, null);
                SlidingPaneLayout.this.LIZIZ(this.LIZ);
            }
            SlidingPaneLayout.this.LJIIJJI.remove(this);
        }

        public RunnableC0405b(View view) {
            this.LIZ = view;
        }
    }

    public final boolean LIZIZ() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.LJIIIZ.continueSettling(true)) {
            if (!this.LIZJ) {
                this.LJIIIZ.abort();
            } else {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.LIZJ) {
            if (this.f20287LJ == 1.0f) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = this.LJIIJ;
        }
        savedState.LIZ = z;
        return savedState;
    }

    public final void LIZ() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJIJ = true;
        int size = this.LJIIJJI.size();
        for (int i = 0; i < size; i++) {
            this.LJIIJJI.get(i).run();
        }
        this.LJIIJJI.clear();
    }

    public void setCoveredFadeColor(int i) {
        this.LJIIL = i;
    }

    public void setPanelSlideListener(AbstractC139120d8W abstractC139120d8W) {
        this.LJIIIIZZ = abstractC139120d8W;
    }

    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.LJIILIIL = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.LJIILJJIL = drawable;
    }

    public void setSliderFadeColor(int i) {
        this.LIZ = i;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public void setParallaxDistance(int i) {
        this.LJII = i;
        requestLayout();
    }

    public final void LIZIZ(View view) {
        int i = Build.VERSION.SDK_INT;
        ViewCompat.setLayerPaint(view, ((C139119d8V) view.getLayoutParams()).LIZLLL);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C139119d8V) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C139119d8V(getContext(), attributeSet);
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
    }

    private boolean LIZ(int i) {
        if (!this.LJIJ && !LIZIZ(0.0f)) {
            return false;
        }
        this.LJIIJ = false;
        return true;
    }

    public final boolean LIZJ(View view) {
        if (view == null) {
            return false;
        }
        C139119d8V c139119d8V = (C139119d8V) view.getLayoutParams();
        if (!this.LIZJ || !c139119d8V.LIZJ || this.f20287LJ <= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C139119d8V((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C139119d8V(layoutParams);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.LIZ) {
            if (this.LJIJ || LIZIZ(1.0f)) {
                this.LJIIJ = true;
            }
        } else {
            LIZ(0);
        }
        this.LJIIJ = savedState.LIZ;
    }

    private boolean LIZIZ(float f) {
        int paddingLeft;
        if (!this.LIZJ) {
            return false;
        }
        boolean LIZIZ = LIZIZ();
        C139119d8V c139119d8V = (C139119d8V) this.LIZLLL.getLayoutParams();
        if (LIZIZ) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + c139119d8V.rightMargin) + (f * this.LJFF)) + this.LIZLLL.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + c139119d8V.leftMargin + (f * this.LJFF));
        }
        ViewDragHelper viewDragHelper = this.LJIIIZ;
        View view = this.LIZLLL;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        LIZ();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void LIZ(float r11) {
        /*
            r10 = this;
            boolean r9 = r10.LIZIZ()
            android.view.View r0 = r10.LIZLLL
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.d8V r1 = (p003X.C139119d8V) r1
            boolean r0 = r1.LIZJ
            r7 = 0
            if (r0 == 0) goto L54
            if (r9 == 0) goto L51
            int r0 = r1.rightMargin
        L15:
            if (r0 > 0) goto L54
            r8 = 1
        L18:
            int r6 = r10.getChildCount()
        L1c:
            if (r7 >= r6) goto L56
            android.view.View r5 = r10.getChildAt(r7)
            android.view.View r0 = r10.LIZLLL
            if (r5 == r0) goto L4b
            float r0 = r10.LJIILL
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 - r0
            int r3 = r10.LJII
            float r0 = (float) r3
            float r1 = r1 * r0
            int r2 = (int) r1
            r10.LJIILL = r11
            float r1 = r4 - r11
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 - r0
            if (r9 == 0) goto L3c
            int r2 = -r2
        L3c:
            r5.offsetLeftAndRight(r2)
            if (r8 == 0) goto L4b
            float r1 = r10.LJIILL
            if (r9 == 0) goto L4e
            float r1 = r1 - r4
        L46:
            int r0 = r10.LJIIL
            r10.LIZ(r5, r1, r0)
        L4b:
            int r7 = r7 + 1
            goto L1c
        L4e:
            float r1 = r4 - r1
            goto L46
        L51:
            int r0 = r1.leftMargin
            goto L15
        L54:
            r8 = 0
            goto L18
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.LIZ(float):void");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View childAt;
        int i;
        int i2;
        super.draw(canvas);
        if (LIZIZ()) {
            drawable = this.LJIILJJIL;
        } else {
            drawable = this.LJIILIIL;
        }
        if (getChildCount() > 1 && (childAt = getChildAt(1)) != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (LIZIZ()) {
                i = childAt.getRight();
                i2 = intrinsicWidth + i;
            } else {
                int left = childAt.getLeft();
                i = left - intrinsicWidth;
                i2 = left;
            }
            drawable.setBounds(i, top, i2, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LIZJ) {
            return super.onTouchEvent(motionEvent);
        }
        this.LJIIIZ.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && LIZJ(this.LIZLLL)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = x - this.LJIILLIIL;
                float f2 = y - this.LJIIZILJ;
                int touchSlop = this.LJIIIZ.getTouchSlop();
                if ((f * f) + (f2 * f2) < touchSlop * touchSlop && this.LJIIIZ.isViewUnder(this.LIZLLL, (int) x, (int) y)) {
                    LIZ(0);
                }
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.LJIILLIIL = x2;
        this.LJIIZILJ = y2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(android.view.View r18) {
        /*
            r17 = this;
            boolean r16 = r17.LIZIZ()
            if (r16 == 0) goto L96
            int r15 = r17.getWidth()
            int r0 = r17.getPaddingRight()
            int r15 = r15 - r0
            int r1 = r17.getPaddingLeft()
        L13:
            int r10 = r17.getPaddingTop()
            int r9 = r17.getHeight()
            int r0 = r17.getPaddingBottom()
            int r9 = r9 - r0
            r11 = r18
            if (r11 == 0) goto L91
            boolean r2 = r11.isOpaque()
            r0 = 1
            if (r2 == 0) goto L8d
            int r13 = r11.getLeft()
            int r12 = r11.getRight()
            int r8 = r11.getTop()
            int r7 = r11.getBottom()
        L3b:
            int r6 = r17.getChildCount()
            r5 = 0
        L40:
            r0 = r17
            if (r5 >= r6) goto La5
            android.view.View r4 = r0.getChildAt(r5)
            if (r4 == r11) goto La5
            int r2 = r4.getVisibility()
            r0 = 8
            if (r2 == r0) goto L84
            if (r16 == 0) goto L8b
            r2 = r1
        L55:
            int r0 = r4.getLeft()
            int r14 = java.lang.Math.max(r2, r0)
            int r0 = r4.getTop()
            int r3 = java.lang.Math.max(r10, r0)
            if (r16 == 0) goto L89
            r2 = r15
        L68:
            int r0 = r4.getRight()
            int r2 = java.lang.Math.min(r2, r0)
            int r0 = r4.getBottom()
            int r0 = java.lang.Math.min(r9, r0)
            if (r14 < r13) goto L87
            if (r3 < r8) goto L87
            if (r2 > r12) goto L87
            if (r0 > r7) goto L87
            r0 = 4
        L81:
            r4.setVisibility(r0)
        L84:
            int r5 = r5 + 1
            goto L40
        L87:
            r0 = 0
            goto L81
        L89:
            r2 = r1
            goto L68
        L8b:
            r2 = r15
            goto L55
        L8d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 18
        L91:
            r13 = 0
            r12 = 0
            r8 = 0
            r7 = 0
            goto L3b
        L96:
            int r15 = r17.getPaddingLeft()
            int r1 = r17.getWidth()
            int r0 = r17.getPaddingRight()
            int r1 = r1 - r0
            goto L13
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.LIZ(android.view.View):void");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.LIZJ && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.LJIIJ = !this.LJIIIZ.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.LIZJ || (this.LJI && actionMasked != 0)) {
            this.LJIIIZ.cancel();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked != 3 && actionMasked != 1) {
            if (actionMasked != 0) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float abs = Math.abs(x - this.LJIILLIIL);
                    float abs2 = Math.abs(y - this.LJIIZILJ);
                    if (abs > this.LJIIIZ.getTouchSlop() && abs2 > abs) {
                        this.LJIIIZ.cancel();
                        this.LJI = true;
                        return false;
                    }
                }
            } else {
                this.LJI = false;
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.LJIILLIIL = x2;
                this.LJIIZILJ = y2;
                if (this.LJIIIZ.isViewUnder(this.LIZLLL, (int) x2, (int) y2) && LIZJ(this.LIZLLL)) {
                    z = true;
                    if (!this.LJIIIZ.shouldInterceptTouchEvent(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            }
            z = false;
            if (!this.LJIIIZ.shouldInterceptTouchEvent(motionEvent)) {
            }
            return true;
        } else {
            this.LJIIIZ.cancel();
            return false;
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.LIZJ) {
            if (view == this.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJ = z;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        boolean z;
        int measuredWidth;
        int makeMeasureSpec;
        int i5;
        int makeMeasureSpec2;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
            } else {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
        } else if (mode2 == 0) {
            if (isInEditMode()) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            } else {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        boolean z3 = false;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i3 = 0;
                paddingTop = 0;
            } else {
                i3 = (size2 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i3;
            }
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.LIZLLL = null;
        int i6 = paddingLeft;
        int i7 = 0;
        boolean z4 = false;
        float f = 0.0f;
        while (true) {
            i4 = 8;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            C139119d8V c139119d8V = (C139119d8V) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                c139119d8V.LIZJ = z3;
            } else {
                if (c139119d8V.LIZ > 0.0f) {
                    f += c139119d8V.LIZ;
                    if (c139119d8V.width == 0) {
                    }
                }
                int i8 = c139119d8V.leftMargin + c139119d8V.rightMargin;
                if (c139119d8V.width == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i8, Integer.MIN_VALUE);
                } else if (c139119d8V.width == -1) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i8, 1073741824);
                } else {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c139119d8V.width, 1073741824);
                }
                if (c139119d8V.height == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (c139119d8V.height == -1) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(c139119d8V.height, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i3) {
                    i3 = Math.min(measuredHeight, paddingTop);
                }
                i6 -= measuredWidth2;
                if (i6 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c139119d8V.LIZIZ = z2;
                boolean z5 = z2 | z4;
                if (c139119d8V.LIZIZ) {
                    this.LIZLLL = childAt;
                }
                z4 = z5;
            }
            i7++;
            z3 = false;
        }
        if (z4 || f > 0.0f) {
            int i9 = paddingLeft - this.LIZIZ;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getVisibility() != i4) {
                    C139119d8V c139119d8V2 = (C139119d8V) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i4) {
                        if (c139119d8V2.width == 0 && c139119d8V2.LIZ > 0.0f) {
                            z = true;
                            measuredWidth = 0;
                        } else {
                            z = false;
                            measuredWidth = childAt2.getMeasuredWidth();
                        }
                        if (z4 && childAt2 != this.LIZLLL) {
                            if (c139119d8V2.width < 0 && (measuredWidth > i9 || c139119d8V2.LIZ > 0.0f)) {
                                if (z) {
                                    if (c139119d8V2.height == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i5 = 1073741824;
                                    } else if (c139119d8V2.height == -1) {
                                        i5 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i5 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c139119d8V2.height, 1073741824);
                                    }
                                } else {
                                    i5 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i9, i5), makeMeasureSpec2);
                            }
                        } else if (c139119d8V2.LIZ > 0.0f) {
                            if (c139119d8V2.width == 0) {
                                if (c139119d8V2.height == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (c139119d8V2.height == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c139119d8V2.height, 1073741824);
                                }
                            } else {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z4) {
                                int i11 = paddingLeft - (c139119d8V2.leftMargin + c139119d8V2.rightMargin);
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                                if (measuredWidth != i11) {
                                    childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                }
                            } else {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth + ((int) ((c139119d8V2.LIZ * Math.max(0, i6)) / f)), 1073741824), makeMeasureSpec);
                            }
                        }
                    }
                }
                i10++;
                i4 = 8;
            }
        }
        setMeasuredDimension(size, i3 + getPaddingTop() + getPaddingBottom());
        this.LIZJ = z4;
        if (this.LJIIIZ.getViewDragState() != 0 && !z4) {
            this.LJIIIZ.abort();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LIZ = -858993460;
        this.LJIJ = true;
        this.LJIJI = new Rect();
        this.LJIIJJI = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.LIZIZ = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new C139096d88(this));
        ViewCompat.setImportantForAccessibility(this, 1);
        this.LJIIIZ = ViewDragHelper.create(this, 0.5f, new C139118d8U(this));
        this.LJIIIZ.setMinVelocity(f * 400.0f);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C139119d8V c139119d8V = (C139119d8V) view.getLayoutParams();
        int save = canvas.save();
        if (this.LIZJ && !c139119d8V.LIZIZ && this.LIZLLL != null) {
            canvas.getClipBounds(this.LJIJI);
            if (LIZIZ()) {
                Rect rect = this.LJIJI;
                rect.left = Math.max(rect.left, this.LIZLLL.getRight());
            } else {
                Rect rect2 = this.LJIJI;
                rect2.right = Math.min(rect2.right, this.LIZLLL.getLeft());
            }
            canvas.clipRect(this.LJIJI);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public void LIZ(View view, float f, int i) {
        C139119d8V c139119d8V = (C139119d8V) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
            if (c139119d8V.LIZLLL == null) {
                c139119d8V.LIZLLL = new Paint();
            }
            c139119d8V.LIZLLL.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, c139119d8V.LIZLLL);
            }
            LIZIZ(view);
        } else if (view.getLayerType() != 0) {
            if (c139119d8V.LIZLLL != null) {
                c139119d8V.LIZLLL.setColorFilter(null);
            }
            RunnableC0405b runnableC0405b = new RunnableC0405b(view);
            this.LJIIJJI.add(runnableC0405b);
            ViewCompat.postOnAnimation(this, runnableC0405b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.LJIJ = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        float f;
        boolean LIZIZ = LIZIZ();
        if (LIZIZ) {
            this.LJIIIZ.setEdgeTrackingEnabled(2);
        } else {
            this.LJIIIZ.setEdgeTrackingEnabled(1);
        }
        int i11 = i3 - i;
        if (LIZIZ) {
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.LJIJ) {
            if (this.LIZJ && this.LJIIJ) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.f20287LJ = f;
        }
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C139119d8V c139119d8V = (C139119d8V) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c139119d8V.LIZIZ) {
                    int i14 = i11 - paddingRight;
                    int min = (Math.min(paddingLeft, i14 - this.LIZIZ) - i12) - (c139119d8V.leftMargin + c139119d8V.rightMargin);
                    this.LJFF = min;
                    if (LIZIZ) {
                        i10 = c139119d8V.rightMargin;
                    } else {
                        i10 = c139119d8V.leftMargin;
                    }
                    if (i12 + i10 + min + (measuredWidth / 2) > i14) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c139119d8V.LIZJ = z2;
                    int i15 = (int) (min * this.f20287LJ);
                    i6 = i10 + i15 + i12;
                    this.f20287LJ = i15 / this.LJFF;
                    i5 = 0;
                } else {
                    if (this.LIZJ && (i7 = this.LJII) != 0) {
                        i5 = (int) ((1.0f - this.f20287LJ) * i7);
                    } else {
                        i5 = 0;
                    }
                    i6 = paddingLeft;
                }
                if (LIZIZ) {
                    i9 = (i11 - i6) + i5;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i6 - i5;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
                i12 = i6;
            }
        }
        if (this.LJIJ) {
            if (this.LIZJ) {
                if (this.LJII != 0) {
                    LIZ(this.f20287LJ);
                }
                if (((C139119d8V) this.LIZLLL.getLayoutParams()).LIZJ) {
                    LIZ(this.LIZLLL, this.f20287LJ, this.LIZ);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    LIZ(getChildAt(i16), 0.0f, this.LIZ);
                }
            }
            LIZ(this.LIZLLL);
        }
        this.LJIJ = false;
    }
}
