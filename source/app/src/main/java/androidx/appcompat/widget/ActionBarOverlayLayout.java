package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.core.view.AbstractC0254k;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.AbstractC138390cwk;
import p003X.AbstractC138445cxd;
import p003X.AbstractC138456cxo;
import p003X.AbstractC138463cxv;
import p003X.C138455cxn;
import p003X.C138591czz;
import p003X.C138593d01;

/* loaded from: classes17.dex */
public class ActionBarOverlayLayout extends ViewGroup implements AbstractC138463cxv, NestedScrollingParent, NestedScrollingParent3, AbstractC0254k {
    public static final int[] LJI = {2130772127, 16842841};
    public ActionBarContainer LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public ViewPropertyAnimator f20226LJ;
    public final AnimatorListenerAdapter LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public ContentFrameLayout LJIIIZ;
    public AbstractC138445cxd LJIIJ;
    public Drawable LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final Rect LJIILLIIL;
    public final Rect LJIIZILJ;
    public final Rect LJIJ;
    public final Rect LJIJI;
    public final Rect LJIJJ;
    public final Rect LJIJJLI;
    public final Rect LJIL;
    public WindowInsetsCompat LJJ;
    public WindowInsetsCompat LJJI;
    public WindowInsetsCompat LJJIFFI;
    public WindowInsetsCompat LJJII;
    public AbstractC138456cxo LJJIII;
    public OverScroller LJJIIJ;
    public final Runnable LJJIIJZLJL;
    public final Runnable LJJIIZ;
    public final NestedScrollingParentHelper LJJIIZI;

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C138455cxn(-1, -1);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.LJJIIZI.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    @Override // p003X.AbstractC138463cxv
    public final boolean LIZIZ() {
        LJIIIIZZ();
        return this.LJIIJ.LJFF();
    }

    @Override // p003X.AbstractC138463cxv
    public final boolean LIZJ() {
        LJIIIIZZ();
        return this.LJIIJ.LJI();
    }

    @Override // p003X.AbstractC138463cxv
    public final boolean LIZLLL() {
        LJIIIIZZ();
        return this.LJIIJ.LJII();
    }

    @Override // p003X.AbstractC138463cxv
    /* renamed from: LJ */
    public final boolean mo21196LJ() {
        LJIIIIZZ();
        return this.LJIIJ.LJIIIIZZ();
    }

    @Override // p003X.AbstractC138463cxv
    public final boolean LJFF() {
        LJIIIIZZ();
        return this.LJIIJ.LJIIIZ();
    }

    @Override // p003X.AbstractC138463cxv
    public final void LJI() {
        LJIIIIZZ();
        this.LJIIJ.LJIIJ();
    }

    @Override // p003X.AbstractC138463cxv
    public final void LJII() {
        LJIIIIZZ();
        this.LJIIJ.LJIIJJI();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.LIZ;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public CharSequence getTitle() {
        LJIIIIZZ();
        return this.LJIIJ.mo21653LJ();
    }

    static {
        Covode.recordClassIndex(583);
    }

    public final void LIZ() {
        removeCallbacks(this.LJJIIJZLJL);
        removeCallbacks(this.LJJIIZ);
        ViewPropertyAnimator viewPropertyAnimator = this.f20226LJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private void LJIIIIZZ() {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = (ContentFrameLayout) findViewById(2131165210);
            this.LIZ = (ActionBarContainer) findViewById(2131165211);
            this.LJIIJ = LIZ(findViewById(2131165209));
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C138455cxn;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.LJIILIIL = z;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C138455cxn(layoutParams);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        int i = Build.VERSION.SDK_INT;
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C138455cxn(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LIZ(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.LJIIIIZZ = i;
        AbstractC138456cxo abstractC138456cxo = this.LJJIII;
        if (abstractC138456cxo != null) {
            abstractC138456cxo.LIZIZ(i);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.LIZJ) {
            this.LIZJ = z;
            if (!z) {
                LIZ();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        LJIIIIZZ();
        this.LJIIJ.LIZ(i);
    }

    public void setLogo(int i) {
        LJIIIIZZ();
        this.LJIIJ.LIZIZ(i);
    }

    @Override // p003X.AbstractC138463cxv
    public void setWindowCallback(Window.Callback callback) {
        LJIIIIZZ();
        this.LJIIJ.LIZ(callback);
    }

    @Override // p003X.AbstractC138463cxv
    public void setWindowTitle(CharSequence charSequence) {
        LJIIIIZZ();
        this.LJIIJ.LIZ(charSequence);
    }

    public void setActionBarHideOffset(int i) {
        LIZ();
        this.LIZ.setTranslationY(-Math.max(0, Math.min(i, this.LIZ.getHeight())));
    }

    public void setActionBarVisibilityCallback(AbstractC138456cxo abstractC138456cxo) {
        this.LJJIII = abstractC138456cxo;
        if (getWindowToken() != null) {
            this.LJJIII.LIZIZ(this.LJIIIIZZ);
            int i = this.LJIILL;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        LJIIIIZZ();
        this.LJIIJ.LIZ(drawable);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.LIZIZ = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIL = z2;
    }

    public static AbstractC138445cxd LIZ(View view) {
        if (view instanceof AbstractC138445cxd) {
            return (AbstractC138445cxd) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(C0002O.m25086C("Can't make a decor toolbar out of ", view.getClass().getSimpleName()));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.LJIIJJI != null && !this.LJIIL) {
            if (this.LIZ.getVisibility() == 0) {
                i = (int) (this.LIZ.getBottom() + this.LIZ.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.LJIIJJI.setBounds(0, i, getWidth(), this.LJIIJJI.getIntrinsicHeight() + i);
            this.LJIIJJI.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.LIZJ && !this.LIZLLL) {
            if (this.LJIILJJIL <= this.LIZ.getHeight()) {
                LIZ();
                postDelayed(this.LJJIIJZLJL, 600L);
                return;
            }
            LIZ();
            postDelayed(this.LJJIIZ, 600L);
        }
    }

    private void LIZ(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(LJI);
        boolean z2 = false;
        this.LJII = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.LJIIJJI = obtainStyledAttributes.getDrawable(1);
        if (this.LJIIJJI == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.LJIIL = z2;
        this.LJJIIJ = new OverScroller(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
        if (r5 != false) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r11) {
        /*
            r10 = this;
            r10.LJIIIIZZ()
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r11)
            android.graphics.Rect r5 = new android.graphics.Rect
            int r4 = r2.getSystemWindowInsetLeft()
            int r3 = r2.getSystemWindowInsetTop()
            int r1 = r2.getSystemWindowInsetRight()
            int r0 = r2.getSystemWindowInsetBottom()
            r5.<init>(r4, r3, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r4 = r10.LIZ
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = 1
            boolean r5 = LIZ(r4, r5, r6, r7, r8, r9)
            android.graphics.Rect r0 = r10.LJIILLIIL
            androidx.core.view.ViewCompat.computeSystemWindowInsets(r10, r2, r0)
            android.graphics.Rect r0 = r10.LJIILLIIL
            int r4 = r0.left
            android.graphics.Rect r0 = r10.LJIILLIIL
            int r3 = r0.top
            android.graphics.Rect r0 = r10.LJIILLIIL
            int r1 = r0.right
            android.graphics.Rect r0 = r10.LJIILLIIL
            int r0 = r0.bottom
            androidx.core.view.WindowInsetsCompat r0 = r2.inset(r4, r3, r1, r0)
            r10.LJJ = r0
            androidx.core.view.WindowInsetsCompat r1 = r10.LJJI
            androidx.core.view.WindowInsetsCompat r0 = r10.LJJ
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L51
            androidx.core.view.WindowInsetsCompat r0 = r10.LJJ
            r10.LJJI = r0
            r5 = 1
        L51:
            android.graphics.Rect r1 = r10.LJIIZILJ
            android.graphics.Rect r0 = r10.LJIILLIIL
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L77
            android.graphics.Rect r1 = r10.LJIIZILJ
            android.graphics.Rect r0 = r10.LJIILLIIL
            r1.set(r0)
            r0 = 1
        L63:
            r10.requestLayout()
        L66:
            androidx.core.view.WindowInsetsCompat r0 = r2.consumeDisplayCutout()
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
            android.view.WindowInsets r0 = r0.toWindowInsets()
            return r0
        L77:
            if (r5 == 0) goto L66
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i);
        LJIIIIZZ();
        int i3 = this.LJIILL ^ i;
        this.LJIILL = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        AbstractC138456cxo abstractC138456cxo = this.LJJIII;
        if (abstractC138456cxo != null) {
            abstractC138456cxo.mo21651LJ(!z2);
            if (!z && z2) {
                this.LJJIII.LJIIIZ();
            } else {
                this.LJJIII.LJIIIIZZ();
            }
        }
        if ((i3 & 256) != 0 && this.LJJIII != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // p003X.AbstractC138463cxv
    public final void LIZ(int i) {
        LJIIIIZZ();
        if (i != 2 && i != 5 && i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.AbstractC0254k
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p003X.AbstractC138463cxv
    public final void LIZ(Menu menu, AbstractC138390cwk abstractC138390cwk) {
        LJIIIIZZ();
        this.LJIIJ.LIZ(menu, abstractC138390cwk);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJIILLIIL = new Rect();
        this.LJIIZILJ = new Rect();
        this.LJIJ = new Rect();
        this.LJIJI = new Rect();
        this.LJIJJ = new Rect();
        this.LJIJJLI = new Rect();
        this.LJIL = new Rect();
        this.LJJ = WindowInsetsCompat.CONSUMED;
        this.LJJI = WindowInsetsCompat.CONSUMED;
        this.LJJIFFI = WindowInsetsCompat.CONSUMED;
        this.LJJII = WindowInsetsCompat.CONSUMED;
        this.LJFF = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            static {
                Covode.recordClassIndex(584);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f20226LJ = null;
                actionBarOverlayLayout.LIZLLL = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f20226LJ = null;
                actionBarOverlayLayout.LIZLLL = false;
            }
        };
        this.LJJIIJZLJL = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.2
            static {
                Covode.recordClassIndex(585);
            }

            @Override // java.lang.Runnable
            public final void run() {
                ActionBarOverlayLayout.this.LIZ();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f20226LJ = actionBarOverlayLayout.LIZ.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.LJFF);
            }
        };
        this.LJJIIZ = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.3
            static {
                Covode.recordClassIndex(586);
            }

            @Override // java.lang.Runnable
            public final void run() {
                ActionBarOverlayLayout.this.LIZ();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f20226LJ = actionBarOverlayLayout.LIZ.animate().translationY(-ActionBarOverlayLayout.this.LIZ.getHeight()).setListener(ActionBarOverlayLayout.this.LJFF);
            }
        };
        LIZ(context);
        this.LJJIIZI = new NestedScrollingParentHelper(this);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        LJIIIIZZ();
        measureChildWithMargins(this.LIZ, i, 0, i2, 0);
        C138455cxn c138455cxn = (C138455cxn) this.LIZ.getLayoutParams();
        int max = Math.max(0, this.LIZ.getMeasuredWidth() + c138455cxn.leftMargin + c138455cxn.rightMargin);
        int max2 = Math.max(0, this.LIZ.getMeasuredHeight() + c138455cxn.topMargin + c138455cxn.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.LIZ.getMeasuredState());
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0) {
            z = true;
            measuredHeight = this.LJII;
            if (this.LJIILIIL && this.LIZ.getTabContainer() != null) {
                measuredHeight += this.LJII;
            }
        } else {
            z = false;
            measuredHeight = this.LIZ.getVisibility() != 8 ? this.LIZ.getMeasuredHeight() : 0;
        }
        this.LJIJ.set(this.LJIILLIIL);
        int i3 = Build.VERSION.SDK_INT;
        this.LJJIFFI = this.LJJ;
        if (!this.LIZIZ && !z) {
            this.LJIJ.top += measuredHeight;
            this.LJIJ.bottom += 0;
            int i4 = Build.VERSION.SDK_INT;
            this.LJJIFFI = this.LJJIFFI.inset(0, measuredHeight, 0, 0);
        } else {
            int i5 = Build.VERSION.SDK_INT;
            C138591czz LIZ = C138591czz.LIZ(this.LJJIFFI.getSystemWindowInsetLeft(), this.LJJIFFI.getSystemWindowInsetTop() + measuredHeight, this.LJJIFFI.getSystemWindowInsetRight(), this.LJJIFFI.getSystemWindowInsetBottom() + 0);
            C138593d01 c138593d01 = new C138593d01(this.LJJIFFI);
            c138593d01.LIZ(LIZ);
            this.LJJIFFI = c138593d01.LIZ();
        }
        LIZ(this.LJIIIZ, this.LJIJ, true, true, true, true);
        int i6 = Build.VERSION.SDK_INT;
        if (!this.LJJII.equals(this.LJJIFFI)) {
            WindowInsetsCompat windowInsetsCompat = this.LJJIFFI;
            this.LJJII = windowInsetsCompat;
            ViewCompat.dispatchApplyWindowInsets(this.LJIIIZ, windowInsetsCompat);
        } else {
            int i7 = Build.VERSION.SDK_INT;
        }
        measureChildWithMargins(this.LJIIIZ, i, 0, i2, 0);
        C138455cxn c138455cxn2 = (C138455cxn) this.LJIIIZ.getLayoutParams();
        int max3 = Math.max(max, this.LJIIIZ.getMeasuredWidth() + c138455cxn2.leftMargin + c138455cxn2.rightMargin);
        int max4 = Math.max(max2, this.LJIIIZ.getMeasuredHeight() + c138455cxn2.topMargin + c138455cxn2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.LJIIIZ.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.LJJIIZI.onNestedScrollAccepted(view, view2, i);
        this.LJIILJJIL = getActionBarHideOffset();
        LIZ();
        AbstractC138456cxo abstractC138456cxo = this.LJJIII;
        if (abstractC138456cxo != null) {
            abstractC138456cxo.LJIIJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.LIZ.getVisibility() == 0) {
            return this.LIZJ;
        }
        return false;
    }

    @Override // androidx.core.view.AbstractC0254k
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.AbstractC0254k
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.LIZJ || !z) {
            return false;
        }
        this.LJJIIJ.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.LJJIIJ.getFinalY() > this.LIZ.getHeight()) {
            LIZ();
            this.LJJIIZ.run();
        } else {
            LIZ();
            this.LJJIIJZLJL.run();
        }
        this.LIZLLL = true;
        return true;
    }

    @Override // androidx.core.view.AbstractC0254k
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.LJIILJJIL += i2;
        setActionBarHideOffset(this.LJIILJJIL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C138455cxn c138455cxn = (C138455cxn) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = c138455cxn.leftMargin + paddingLeft;
                int i7 = c138455cxn.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // androidx.core.view.AbstractC0254k
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public static boolean LIZ(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C138455cxn c138455cxn = (C138455cxn) view.getLayoutParams();
        if (c138455cxn.leftMargin != rect.left) {
            c138455cxn.leftMargin = rect.left;
            z5 = true;
        } else {
            z5 = false;
        }
        if (c138455cxn.topMargin != rect.top) {
            c138455cxn.topMargin = rect.top;
            z5 = true;
        }
        if (c138455cxn.rightMargin != rect.right) {
            c138455cxn.rightMargin = rect.right;
            z5 = true;
        }
        if (z3 && c138455cxn.bottomMargin != rect.bottom) {
            c138455cxn.bottomMargin = rect.bottom;
            return true;
        }
        return z5;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }
}
