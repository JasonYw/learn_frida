package android.support.wearable.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.xiaomi.mipush.sdk.Constants;
import p003X.AbstractC139232dAK;
import p003X.AbstractC139234dAM;
import p003X.C139230dAI;
import p003X.C139233dAL;
import p003X.TMB;
import p003X.TNR;
import p003X.animation.InterpolatorC139231dAJ;

/* loaded from: classes17.dex */
public final class GridViewPager extends ViewGroup {
    public static final int[] LIZ = {16842931};
    public static final Interpolator LIZIZ = new animation.InterpolatorC139231dAJ();
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public boolean f20210LJ;
    public int LJFF;
    public final Runnable LJI;
    public final Point LJII;
    public TMB LJIIIIZZ;
    public final Point LJIIIZ;
    public Point LJIIJ;
    public Parcelable LJIIJJI;
    public ClassLoader LJIIL;
    public final SimpleArrayMap<Point, C0159b> LJIILIIL;
    public final SimpleArrayMap<Point, C0159b> LJIILJJIL;
    public final Rect LJIILL;
    public final Rect LJIILLIIL;
    public final Scroller LJIIZILJ;
    public C139233dAL LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public float LJJIIJ;
    public float LJJIIJZLJL;
    public float LJJIIZ;
    public float LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public VelocityTracker LJJIJIIJIL;
    public final int LJJIJIL;
    public final int LJJIJL;
    public final int LJJIJLIJ;
    public final int LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public AbstractC139232dAK LJJJI;
    public AbstractC139234dAM LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public final SparseIntArray LJJJJIZL;
    public View LJJJJJ;
    public final BackgroundController LJJJJJL;
    public WindowInsets LJJJJL;
    public View.OnApplyWindowInsetsListener LJJJJLI;
    public boolean LJJJJLL;
    public TMB LJJJJZ;
    public boolean LJJJJZI;

    public static float LIZ(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int LIZ(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static boolean LIZIZ(int i, int i2, int i3) {
        return i >= 0 && i <= i3;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestFitSystemWindows() {
    }

    public final TMB getAdapter() {
        return this.LJIIIIZZ;
    }

    public final int getOffscreenPageCount() {
        return this.LJJ;
    }

    public final int getPageColumnMargin() {
        return this.LJIJJ;
    }

    public final int getPageRowMargin() {
        return this.LJIJI;
    }

    private void LIZ(TMB tmb, TMB tmb2) {
        AbstractC139234dAM abstractC139234dAM = this.LJJJIL;
        if (abstractC139234dAM != null) {
            abstractC139234dAM.LIZ(tmb2);
        }
        BackgroundController backgroundController = this.LJJJJJL;
        if (backgroundController != null) {
            backgroundController.LIZ(tmb2);
        }
    }

    private void LIZ(int i, int i2) {
        this.LJJJJIZL.put(i, i2);
    }

    private void LIZ(int i, int i2, boolean z) {
        this.LJIL = false;
        LIZ(i, i2, true, false);
    }

    private void LIZ(int i, int i2, boolean z, boolean z2) {
        LIZ(i, i2, z, z2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZ(int r9, int r10, boolean r11, boolean r12, int r13) {
        /*
            r8 = this;
            X.TMB r0 = r8.LJIIIIZZ
            if (r0 == 0) goto L6f
            int r0 = r0.LIZ()
            if (r0 <= 0) goto L6f
            if (r12 != 0) goto L1d
            android.graphics.Point r0 = r8.LJIIIZ
            boolean r0 = r0.equals(r10, r9)
            if (r0 == 0) goto L1d
            androidx.collection.SimpleArrayMap<android.graphics.Point, android.support.wearable.view.GridViewPager$b> r0 = r8.LJIILIIL
            int r0 = r0.size()
            if (r0 == 0) goto L1d
            return
        L1d:
            X.TMB r0 = r8.LJIIIIZZ
            int r0 = r0.LIZ()
            r2 = 1
            int r0 = r0 - r2
            r1 = 0
            int r4 = LIZ(r9, r1, r0)
            X.TMB r0 = r8.LJIIIIZZ
            int r0 = r0.LIZIZ()
            int r0 = r0 - r2
            int r3 = LIZ(r10, r1, r0)
            android.graphics.Point r0 = r8.LJIIIZ
            int r0 = r0.x
            if (r3 == r0) goto L5b
            r8.LJJJJI = r1
        L3d:
            r7 = 1
        L3e:
            boolean r0 = r8.LJJIZ
            if (r0 == 0) goto L66
            android.graphics.Point r0 = r8.LJIIIZ
            r0.set(r1, r1)
            if (r7 == 0) goto L57
            X.dAK r0 = r8.LJJJI
            if (r0 == 0) goto L50
            r0.LIZ(r4, r3)
        L50:
            android.support.wearable.view.BackgroundController r0 = r8.LJJJJJL
            if (r0 == 0) goto L57
            r0.LIZ(r4, r3)
        L57:
            r8.requestLayout()
            return
        L5b:
            android.graphics.Point r0 = r8.LJIIIZ
            int r0 = r0.y
            if (r4 == r0) goto L64
            r8.LJJJJI = r2
            goto L3d
        L64:
            r7 = 0
            goto L3e
        L66:
            r8.LIZLLL(r3, r4)
            r2 = r8
            r5 = r11
            r6 = r13
            r2.LIZ(r3, r4, r5, r6, r7)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.GridViewPager.LIZ(int, int, boolean, boolean, int):void");
    }

    private void LIZ(int i, int i2, boolean z, int i3, boolean z2) {
        int i4;
        int i5;
        C0159b m21217LJ = m21217LJ(i, i2);
        if (m21217LJ != null) {
            i5 = LIZIZ(m21217LJ.LIZIZ) - getPaddingLeft();
            i4 = LIZJ(m21217LJ.LIZJ) - getPaddingTop();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (z2) {
            AbstractC139232dAK abstractC139232dAK = this.LJJJI;
            if (abstractC139232dAK != null) {
                abstractC139232dAK.LIZ(i2, i);
            }
            BackgroundController backgroundController = this.LJJJJJL;
            if (backgroundController != null) {
                backgroundController.LIZ(i2, i);
            }
        }
        if (z) {
            LIZIZ(i5, i4);
            return;
        }
        LIZ(false);
        scrollTo(i5, i4);
        LJFF(i5, i4);
    }

    public final void LIZ() {
        int LIZ2 = this.LJIIIIZZ.LIZ();
        this.LIZJ = LIZ2;
        Point point = new Point(this.LJIIIZ);
        SimpleArrayMap<? extends Point, ? extends C0159b> simpleArrayMap = new SimpleArrayMap<>();
        for (int size = this.LJIILIIL.size() - 1; size >= 0; size--) {
            Point keyAt = this.LJIILIIL.keyAt(size);
            C0159b valueAt = this.LJIILIIL.valueAt(size);
            Point point2 = TMB.LIZIZ;
            if (point2 == TMB.LIZJ) {
                simpleArrayMap.put(keyAt, valueAt);
            } else if (point2 == TMB.LIZIZ) {
                if (this.LJIIIZ.equals(valueAt.LIZIZ, valueAt.LIZJ)) {
                    point.y = LIZ(this.LJIIIZ.y, 0, Math.max(0, LIZ2 - 1));
                    if (point.y < LIZ2) {
                        int i = this.LJIIIZ.x;
                        TMB tmb = this.LJIIIIZZ;
                        int i2 = point.y;
                        point.x = LIZ(i, 0, tmb.LIZIZ() - 1);
                    } else {
                        point.x = 0;
                    }
                }
            } else if (!point2.equals(valueAt.LIZIZ, valueAt.LIZJ)) {
                if (this.LJIIIZ.equals(valueAt.LIZIZ, valueAt.LIZJ)) {
                    point.set(point2.x, point2.y);
                }
                valueAt.LIZIZ = point2.x;
                valueAt.LIZJ = point2.y;
                simpleArrayMap.put(new Point(point2), valueAt);
            }
        }
        this.LJIILIIL.clear();
        this.LJIILIIL.putAll(simpleArrayMap);
        if (this.LIZJ > 0) {
            TMB tmb2 = this.LJIIIIZZ;
            int i3 = point.y;
            this.LIZLLL = tmb2.LIZIZ();
        } else {
            this.LIZLLL = 0;
        }
        LIZJ();
        LIZ(point.y, point.x, false, true);
        requestLayout();
    }

    private void LIZ(View view, C139230dAI c139230dAI) {
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        int i = 0;
        int i2 = c139230dAI.width == -2 ? 0 : 1073741824;
        if (c139230dAI.height != -2) {
            i = 1073741824;
        }
        view.measure(getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(contentWidth, i2), c139230dAI.leftMargin + c139230dAI.rightMargin, c139230dAI.width), getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(contentHeight, i), c139230dAI.topMargin + c139230dAI.bottomMargin, c139230dAI.height));
    }

    private void LIZ(int i, int i2, float f, float f2, int i3, int i4) {
        this.LJJJ = true;
        AbstractC139232dAK abstractC139232dAK = this.LJJJI;
        if (abstractC139232dAK != null) {
            abstractC139232dAK.LIZ(i2, i, f2, f);
        }
        BackgroundController backgroundController = this.LJJJJJL;
        if (backgroundController != null) {
            backgroundController.LIZ(i2, i, f2, f);
        }
    }

    private void LIZ(boolean z) {
        boolean z2;
        if (this.LJJJJ != 2) {
            z2 = false;
        } else {
            z2 = true;
            this.LJIIZILJ.abortAnimation();
            int LIZ2 = LIZ(this.LJIIIZ.y);
            int scrollY = getScrollY();
            int currX = this.LJIIZILJ.getCurrX();
            int currY = this.LJIIZILJ.getCurrY();
            if (LIZ2 != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.LJJJJJ = null;
        this.LJIL = false;
        if (z2) {
            if (z) {
                ViewCompat.postOnAnimation(this, this.LJI);
            } else {
                this.LJI.run();
            }
        }
    }

    private boolean LIZ(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float min;
        float f6 = this.LJJIIJ - f;
        float f7 = this.LJJIIJZLJL - f2;
        this.LJJIIJ = f;
        this.LJJIIJZLJL = f2;
        Rect rect = this.LJIILL;
        int LIZIZ2 = LIZIZ(rect.left) - getPaddingLeft();
        int LIZIZ3 = LIZIZ(rect.right) - getPaddingLeft();
        int LIZJ = LIZJ(rect.top) - getPaddingTop();
        int LIZJ2 = LIZJ(rect.bottom) - getPaddingTop();
        float LIZ2 = LIZ(this.LJIIIZ.y);
        float scrollY = getScrollY();
        boolean z = false;
        if (this.LJJJJI == 1) {
            int contentHeight = getContentHeight() + this.LJIJI;
            if (f7 < 0.0f) {
                f5 = -(scrollY % contentHeight);
            } else {
                float f8 = contentHeight;
                f5 = (f8 - (scrollY % f8)) % f8;
            }
            if (Math.abs(f5) <= Math.abs(f7)) {
                f7 -= f5;
                scrollY += f5;
                View LIZ3 = LIZ(LJI((int) LIZ2, (int) scrollY));
                if (LIZ3 != null) {
                    int LIZ4 = LIZ(LIZ3, (int) Math.signum(f7));
                    if (LIZ4 > 0) {
                        min = Math.max(0.0f, Math.min(f7, LIZ4));
                    } else {
                        min = Math.min(0.0f, Math.max(f7, LIZ4));
                    }
                    int i = (int) min;
                    LIZ3.scrollBy(0, i);
                    f7 -= min;
                    this.LJJIIJZLJL += min - i;
                }
            }
        }
        int i2 = (int) (((int) f6) + LIZ2);
        int i3 = (int) (((int) f7) + scrollY);
        if (i2 < LIZIZ2 || i2 > LIZIZ3 || i3 < LIZJ || i3 > LIZJ2) {
            int overScrollMode = getOverScrollMode();
            if ((this.LJJJJI == 0 && LIZIZ2 < LIZIZ3) || (this.LJJJJI == 1 && LIZJ < LIZJ2)) {
                z = true;
            }
            if (overScrollMode != 0 && (!z || overScrollMode != 1)) {
                f6 = LIZ(f6, LIZIZ2 - LIZ2, LIZIZ3 - LIZ2);
                f7 = LIZ(f7, LIZJ - scrollY, LIZJ2 - scrollY);
            } else {
                float f9 = LIZIZ3;
                if (LIZ2 > f9) {
                    f3 = LIZ2 - f9;
                } else {
                    float f10 = LIZIZ2;
                    f3 = LIZ2 < f10 ? LIZ2 - f10 : 0.0f;
                }
                float f11 = LIZJ2;
                if (scrollY <= f11) {
                    f11 = LIZJ;
                    if (scrollY >= f11) {
                        f4 = 0.0f;
                        if (Math.abs(f3) > 0.0f && Math.signum(f3) == Math.signum(f6)) {
                            f6 *= LIZIZ.getInterpolation(1.0f - (Math.abs(f3) / getContentWidth()));
                        }
                        if (Math.abs(f4) > 0.0f && Math.signum(f4) == Math.signum(f7)) {
                            f7 *= LIZIZ.getInterpolation(1.0f - (Math.abs(f4) / getContentHeight()));
                        }
                    }
                }
                f4 = scrollY - f11;
                if (Math.abs(f3) > 0.0f) {
                    f6 *= LIZIZ.getInterpolation(1.0f - (Math.abs(f3) / getContentWidth()));
                }
                if (Math.abs(f4) > 0.0f) {
                    f7 *= LIZIZ.getInterpolation(1.0f - (Math.abs(f4) / getContentHeight()));
                }
            }
        }
        float f12 = LIZ2 + f6;
        float f13 = scrollY + f7;
        int i4 = (int) f12;
        this.LJJIIJ += f12 - i4;
        int i5 = (int) f13;
        this.LJJIIJZLJL += f13 - i5;
        scrollTo(i4, i5);
        LJFF(i4, i5);
        return true;
    }

    private View LIZ(C0159b c0159b) {
        if (c0159b.LIZ != null) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (this.LJIIIIZZ.LIZLLL()) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    private void LIZ(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.LJJIJIIJI) {
            int i = actionIndex == 0 ? 1 : 0;
            this.LJJIIJ = MotionEventCompat.getX(motionEvent, i);
            this.LJJIIJZLJL = MotionEventCompat.getY(motionEvent, i);
            this.LJJIJIIJI = MotionEventCompat.getPointerId(motionEvent, i);
            VelocityTracker velocityTracker = this.LJJIJIIJIL;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C139230dAI();
    }

    public final Point getCurrentItem() {
        return new Point(this.LJIIIZ);
    }

    /* loaded from: classes17.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.wearable.view.GridViewPager.SavedState.1
            static {
                Covode.recordClassIndex(322);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };
        public int LIZ;
        public int LIZIZ;

        static {
            Covode.recordClassIndex(321);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
        }
    }

    private int getContentHeight() {
        return getMeasuredHeight() - (getPaddingTop() + getPaddingBottom());
    }

    private int getContentWidth() {
        return getMeasuredWidth() - (getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJJIZ = true;
        getParent().requestFitSystemWindows();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LJI);
        super.onDetachedFromWindow();
    }

    static {
        Covode.recordClassIndex(320);
        new DecelerateInterpolator(2.5f);
    }

    private void LIZJ() {
        AbstractC139234dAM abstractC139234dAM = this.LJJJIL;
        if (abstractC139234dAM != null) {
            abstractC139234dAM.LIZ();
        }
        BackgroundController backgroundController = this.LJJJJJL;
        if (backgroundController != null) {
            backgroundController.LIZ();
        }
    }

    private C0159b LIZLLL() {
        return LJI(LIZ((int) LIZIZ(getScrollY())), getScrollY());
    }

    /* renamed from: LJ */
    private void m21218LJ() {
        this.LJJI = false;
        this.LJJIFFI = false;
        VelocityTracker velocityTracker = this.LJJIJIIJIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJJIJIIJIL = null;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZ = this.LJIIIZ.x;
        savedState.LIZIZ = this.LJIIIZ.y;
        return savedState;
    }

    /* renamed from: android.support.wearable.view.GridViewPager$b */
    /* loaded from: classes17.dex */
    public static class C0159b {
        public Object LIZ;
        public int LIZIZ;
        public int LIZJ;

        static {
            Covode.recordClassIndex(324);
        }

        public final String toString() {
            int i = this.LIZIZ;
            int i2 = this.LIZJ;
            String valueOf = String.valueOf(this.LIZ);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append(i);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(i2);
            sb.append(" => ");
            sb.append(valueOf);
            return sb.toString();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.LJIIZILJ.isFinished() && this.LJIIZILJ.computeScrollOffset()) {
            if (this.LJJJJ == 3) {
                if (this.LJJJJJ == null) {
                    this.LJIIZILJ.abortAnimation();
                } else {
                    this.LJJJJJ.scrollTo(this.LJIIZILJ.getCurrX(), this.LJIIZILJ.getCurrY());
                }
            } else {
                int LIZ2 = LIZ(this.LJIIIZ.y);
                int scrollY = getScrollY();
                int currX = this.LJIIZILJ.getCurrX();
                int currY = this.LJIIZILJ.getCurrY();
                if (LIZ2 != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (!LJFF(currX, currY)) {
                        this.LJIIZILJ.abortAnimation();
                        scrollTo(0, 0);
                    }
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        LIZ(true);
    }

    public final void LIZIZ() {
        TMB tmb = this.LJIIIIZZ;
        if (tmb != null && tmb.LIZ() > 0) {
            LIZLLL(this.LJIIIZ.x, this.LJIIIZ.y);
        }
    }

    public final void setConsumeWindowInsets(boolean z) {
        this.f20210LJ = z;
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.LJJJJLI = onApplyWindowInsetsListener;
    }

    public final void setOnPageChangeListener(AbstractC139232dAK abstractC139232dAK) {
        this.LJJJI = abstractC139232dAK;
    }

    public final void setSlideAnimationDuration(int i) {
        this.LJFF = i;
    }

    private int LIZ(int i) {
        return this.LJJJJIZL.get(i, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    private float LIZ(float f) {
        int contentWidth = getContentWidth() + this.LJIJJ;
        if (contentWidth == 0) {
            return 0.0f;
        }
        return f / contentWidth;
    }

    private float LIZIZ(float f) {
        int contentHeight = getContentHeight() + this.LJIJI;
        if (contentHeight == 0) {
            return 0.0f;
        }
        return f / contentHeight;
    }

    private int LIZJ(int i) {
        return (i * (getContentHeight() + this.LJIJI)) + getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C139230dAI) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C139230dAI(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        LIZ(view);
        if (this.LJIJJLI) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void setOffscreenPageCount(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.LJJ) {
            this.LJJ = i;
            LIZIZ();
        }
    }

    public final void setOnAdapterChangeListener(AbstractC139234dAM abstractC139234dAM) {
        TMB tmb;
        this.LJJJIL = abstractC139234dAM;
        if (abstractC139234dAM != null && (tmb = this.LJIIIIZZ) != null && !this.LJJJJLL) {
            abstractC139234dAM.LIZ(tmb);
        }
    }

    private int LIZIZ(int i) {
        return (i * (getContentWidth() + this.LJIJJ)) + getPaddingLeft();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        onApplyWindowInsets(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.LJJJJLI;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
        }
        if (this.f20210LJ) {
            return windowInsets.consumeSystemWindowInsets();
        }
        return windowInsets;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        this.LJJJJL = windowInsets;
        return windowInsets;
    }

    public final void setScrollState(int i) {
        if (this.LJJJJ == i) {
            return;
        }
        this.LJJJJ = i;
        AbstractC139232dAK abstractC139232dAK = this.LJJJI;
        if (abstractC139232dAK != null) {
            abstractC139232dAK.LIZ(i);
        }
        BackgroundController backgroundController = this.LJJJJJL;
        if (backgroundController != null) {
            backgroundController.LIZ(i);
        }
    }

    public static String LIZLLL(int i) {
        int i2 = (i * 2) + 3;
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(LoggerUtil.BLANK_TAG);
            sb.append(LoggerUtil.BLANK_TAG);
        }
        return sb.toString();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (getVisibility() == 0 && this.LJIIIIZZ != null && !this.LJIILIIL.isEmpty()) {
            int LIZ2 = LIZ(this.LJIIIZ.y);
            int i2 = this.LIZLLL - 1;
            if (i > 0) {
                if (LIZ2 + getPaddingLeft() >= LIZIZ(i2)) {
                    return false;
                }
                return true;
            } else if (LIZ2 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (getVisibility() == 0 && this.LJIIIIZZ != null && !this.LJIILIIL.isEmpty()) {
            int scrollY = getScrollY();
            int i2 = this.LIZJ - 1;
            if (i > 0) {
                if (scrollY + getPaddingTop() >= LIZJ(i2)) {
                    return false;
                }
                return true;
            } else if (scrollY > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.LJJI) {
                    return true;
                }
                if (!this.LJJIFFI) {
                    return false;
                }
                if (action != 2) {
                    if (action == 6) {
                        LIZ(motionEvent);
                    }
                } else {
                    LIZJ(motionEvent);
                }
            } else {
                LIZIZ(motionEvent);
            }
            return this.LJJI;
        }
        this.LJJI = false;
        this.LJJIFFI = false;
        this.LJJIJIIJI = -1;
        VelocityTracker velocityTracker = this.LJJIJIIJIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJJIJIIJIL = null;
        }
        return false;
    }

    private void LIZIZ(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.LIZ;
        if (LIZIZ(savedState.LIZIZ, 0, this.LIZJ - 1) && LIZIZ(i, 0, this.LJIIIIZZ.LIZIZ() - 1)) {
            this.LJIIJ = new Point(savedState.LIZ, savedState.LIZIZ);
            return;
        }
        this.LJIIIZ.set(0, 0);
        scrollTo(0, 0);
    }

    private boolean LIZIZ(MotionEvent motionEvent) {
        if (this.LJJI) {
            return false;
        }
        this.LJJIJIIJI = MotionEventCompat.getPointerId(motionEvent, 0);
        this.LJJIIZI = motionEvent.getX();
        this.LJJIIZ = motionEvent.getY();
        this.LJJIJ = getScrollY();
        this.LJJIIJ = this.LJJIIZI;
        this.LJJIIJZLJL = this.LJJIIZ;
        this.LJJIFFI = true;
        this.LJJIJIIJIL = VelocityTracker.obtain();
        this.LJJIJIIJIL.addMovement(motionEvent);
        this.LJIIZILJ.computeScrollOffset();
        int i = this.LJJJJ;
        if (((i == 2 || i == 3) && this.LJJJJI == 0 && Math.abs(this.LJIIZILJ.getFinalX() - this.LJIIZILJ.getCurrX()) > this.LJJIL) || (this.LJJJJI == 1 && Math.abs(this.LJIIZILJ.getFinalY() - this.LJIIZILJ.getCurrY()) > this.LJJIL)) {
            this.LJIIZILJ.abortAnimation();
            this.LJIL = false;
            LIZIZ();
            this.LJJI = true;
            LIZIZ(true);
            setScrollState(1);
            return false;
        }
        LIZ(false);
        this.LJJI = false;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZJ(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = r13.LJJIJIIJI
            r7 = 0
            r1 = -1
            if (r0 != r1) goto L7
            return r7
        L7:
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L10
            boolean r0 = r13.LJJI
            return r0
        L10:
            float r6 = androidx.core.view.MotionEventCompat.getX(r14, r0)
            float r5 = androidx.core.view.MotionEventCompat.getY(r14, r0)
            float r0 = r13.LJJIIJ
            float r12 = r6 - r0
            float r3 = java.lang.Math.abs(r12)
            float r0 = r13.LJJIIJZLJL
            float r11 = r5 - r0
            float r1 = java.lang.Math.abs(r11)
            boolean r0 = r13.LJJI
            r4 = 1
            if (r0 != 0) goto L7f
            float r2 = r3 * r3
            float r0 = r1 * r1
            float r2 = r2 + r0
            int r0 = r13.LJJIII
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7f
            r13.LJJI = r4
            r13.LIZIZ(r4)
            r13.setScrollState(r4)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto Lb1
            r13.LJJJJI = r4
        L47:
            r10 = 0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto La5
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 <= 0) goto Lac
            double r2 = (double) r3
            double r0 = (double) r1
            double r0 = java.lang.Math.hypot(r2, r0)
            double r2 = r2 / r0
            double r8 = java.lang.Math.acos(r2)
            double r2 = java.lang.Math.sin(r8)
            int r0 = r13.LJJII
            double r0 = (double) r0
            double r2 = r2 * r0
            float r7 = (float) r2
            double r2 = java.lang.Math.cos(r8)
            int r0 = r13.LJJII
            double r0 = (double) r0
            double r2 = r2 * r0
            float r1 = (float) r2
        L6d:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto La1
            float r0 = r13.LJJIIJ
            float r0 = r0 + r1
        L74:
            r13.LJJIIJ = r0
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 <= 0) goto L9d
            float r0 = r13.LJJIIJZLJL
            float r0 = r0 + r7
        L7d:
            r13.LJJIIJZLJL = r0
        L7f:
            boolean r0 = r13.LJJI
            if (r0 == 0) goto L95
            int r0 = r13.LJJJJI
            if (r0 == 0) goto L89
            float r6 = r13.LJJIIJ
        L89:
            int r0 = r13.LJJJJI
            if (r0 == r4) goto L8f
            float r5 = r13.LJJIIJZLJL
        L8f:
            r13.LIZ(r6, r5)
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r13)
        L95:
            android.view.VelocityTracker r0 = r13.LJJIJIIJIL
            r0.addMovement(r14)
            boolean r0 = r13.LJJI
            return r0
        L9d:
            float r0 = r13.LJJIIJZLJL
            float r0 = r0 - r7
            goto L7d
        La1:
            float r0 = r13.LJJIIJ
            float r0 = r0 - r1
            goto L74
        La5:
            if (r0 != 0) goto Lac
            int r0 = r13.LJJII
            float r1 = (float) r0
            r7 = 0
            goto L6d
        Lac:
            int r0 = r13.LJJII
            float r7 = (float) r0
            r1 = 0
            goto L6d
        Lb1:
            r13.LJJJJI = r7
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.GridViewPager.LIZJ(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 62) {
                    switch (keyCode) {
                        case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                            if (this.LJIIIZ.y > 0) {
                                LIZ(this.LJIIIZ.x, this.LJIIIZ.y - 1, true);
                                return true;
                            }
                            break;
                        case 20:
                            if (this.LJIIIIZZ != null && this.LJIIIZ.y < this.LJIIIIZZ.LIZ() - 1) {
                                LIZ(this.LJIIIZ.x, this.LJIIIZ.y + 1, true);
                                return true;
                            }
                            break;
                        case 21:
                            if (this.LJIIIZ.x > 0) {
                                LIZ(this.LJIIIZ.x - 1, this.LJIIIZ.y, true);
                                return true;
                            }
                            break;
                        case MotionEventCompat.AXIS_GAS /* 22 */:
                            if (this.LJIIIIZZ != null) {
                                int i = this.LJIIIZ.x;
                                TMB tmb = this.LJIIIIZZ;
                                int i2 = this.LJIIIZ.y;
                                if (i < tmb.LIZIZ() - 1) {
                                    LIZ(this.LJIIIZ.x + 1, this.LJIIIZ.y, true);
                                    break;
                                }
                            }
                            break;
                    }
                } else {
                    debug(0);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void setAdapter(TMB tmb) {
        TMB tmb2 = this.LJIIIIZZ;
        if (tmb2 != null) {
            tmb2.LIZLLL.unregisterObserver(this.LJIJ);
            for (int i = 0; i < this.LJIILIIL.size(); i++) {
                this.LJIILIIL.valueAt(i);
            }
            this.LJIILIIL.clear();
            removeAllViews();
            scrollTo(0, 0);
            this.LJJJJIZL.clear();
        }
        TMB tmb3 = this.LJIIIIZZ;
        this.LJIIIZ.set(0, 0);
        this.LJIIIIZZ = tmb;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        if (this.LJIIIIZZ != null) {
            if (this.LJIJ == null) {
                this.LJIJ = new C139233dAL(this, (byte) 0);
            }
            TMB tmb4 = this.LJIIIIZZ;
            tmb4.LIZLLL.registerObserver(this.LJIJ);
            this.LJIL = false;
            boolean z = this.LJJIZ;
            this.LJJIZ = true;
            this.LIZJ = this.LJIIIIZZ.LIZ();
            if (this.LIZJ > 0) {
                this.LJIIIZ.set(0, 0);
                TMB tmb5 = this.LJIIIIZZ;
                int i2 = this.LJIIIZ.y;
                this.LIZLLL = tmb5.LIZIZ();
            }
            Point point = this.LJIIJ;
            if (point != null) {
                LIZ(point.y, this.LJIIJ.x, false, true);
                this.LJIIJ = null;
                this.LJIIJJI = null;
                this.LJIIL = null;
            } else if (!z) {
                LIZIZ();
            } else {
                requestLayout();
            }
        } else if (this.LJJI) {
            cancelPendingInputEvents();
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(4098);
            dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        if (tmb3 != tmb) {
            if (tmb == null) {
                this.LJJJJLL = false;
                LIZ(tmb3, tmb);
                this.LJJJJZ = null;
                return;
            }
            this.LJJJJLL = true;
            this.LJJJJZ = tmb3;
            return;
        }
        this.LJJJJLL = false;
        this.LJJJJZ = null;
    }

    @Override // android.view.ViewGroup
    public final void debug(int i) {
        super.debug(i);
        String valueOf = String.valueOf(LIZLLL(i));
        String valueOf2 = String.valueOf(this.LJIIIZ);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("mCurItem={");
        sb.append(valueOf2);
        sb.append("}");
        String valueOf3 = String.valueOf(LIZLLL(i));
        String valueOf4 = String.valueOf(this.LJIIIIZZ);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 11 + String.valueOf(valueOf4).length());
        sb2.append(valueOf3);
        sb2.append("mAdapter={");
        sb2.append(valueOf4);
        sb2.append("}");
        String valueOf5 = String.valueOf(LIZLLL(i));
        int i2 = this.LIZJ;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 21);
        sb3.append(valueOf5);
        sb3.append("mRowCount=");
        sb3.append(i2);
        String valueOf6 = String.valueOf(LIZLLL(i));
        int i3 = this.LIZLLL;
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 31);
        sb4.append(valueOf6);
        sb4.append("mCurrentColumnCount=");
        sb4.append(i3);
        int size = this.LJIILIIL.size();
        if (size != 0) {
            String.valueOf(LIZLLL(i)).concat("mItems={");
            for (int i4 = 0; i4 < size; i4++) {
                String valueOf7 = String.valueOf(LIZLLL(i + 1));
                String valueOf8 = String.valueOf(this.LJIILIIL.keyAt(i4));
                String valueOf9 = String.valueOf(this.LJIILIIL.valueAt(i4));
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf7).length() + 4 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
                sb5.append(valueOf7);
                sb5.append(valueOf8);
                sb5.append(" => ");
                sb5.append(valueOf9);
            }
            if (size != 0) {
                String.valueOf(LIZLLL(i)).concat("}");
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int xVelocity;
        int i;
        int i2;
        if (this.LJIIIIZZ == null) {
            return false;
        }
        int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            LIZ(motionEvent);
                        }
                        return true;
                    }
                } else {
                    LIZJ(motionEvent);
                    return true;
                }
            }
            if (this.LJJI && this.LIZJ != 0) {
                VelocityTracker velocityTracker = this.LJJIJIIJIL;
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                int findPointerIndex = motionEvent.findPointerIndex(this.LJJIJIIJI);
                int i3 = this.LJIIIZ.x;
                int i4 = this.LJIIIZ.y;
                C0159b LIZLLL = LIZLLL();
                int i5 = this.LJJJJI;
                if (i5 != 0) {
                    if (i5 != 1) {
                        xVelocity = 0;
                    } else {
                        motionEvent.getX(findPointerIndex);
                        int scrollY = this.LJJIJ - getScrollY();
                        xVelocity = (int) velocityTracker.getYVelocity(this.LJJIJIIJI);
                        int i6 = LIZLLL.LIZJ;
                        float LIZIZ2 = LIZIZ(getScrollY() - LIZJ(LIZLLL.LIZJ));
                        if (LIZIZ2 == 0.0f) {
                            View LIZ2 = LIZ(LIZLLL());
                            int i7 = -xVelocity;
                            int LIZ3 = LIZ(LIZ2, i7);
                            if (LIZ3 != 0) {
                                this.LJJJJJ = LIZ2;
                                if (Math.abs(xVelocity) >= Math.abs(this.LJJIJIL)) {
                                    View view = this.LJJJJJ;
                                    if (view != null) {
                                        if (i7 == 0) {
                                            LIZ(false);
                                            setScrollState(0);
                                        } else {
                                            int scrollX = view.getScrollX();
                                            int scrollY2 = this.LJJJJJ.getScrollY();
                                            setScrollState(3);
                                            int i8 = scrollX + 0;
                                            if (i7 > 0) {
                                                i2 = scrollY2 + LIZ3;
                                                i = scrollY2;
                                            } else {
                                                i = scrollY2 + LIZ3;
                                                i2 = scrollY2;
                                            }
                                            this.LJIIZILJ.fling(scrollX, scrollY2, 0, i7, i8, scrollX, i, i2);
                                            ViewCompat.postInvalidateOnAnimation(this);
                                        }
                                    }
                                    m21218LJ();
                                }
                            }
                        } else {
                            int i9 = this.LJIIIZ.y;
                            i4 = LIZ(i6, LIZIZ2, this.LJIILL.top, this.LJIILL.bottom, xVelocity, scrollY);
                        }
                    }
                } else {
                    xVelocity = (int) velocityTracker.getXVelocity(this.LJJIJIIJI);
                    int i10 = LIZLLL.LIZIZ;
                    float LIZ4 = LIZ(LIZ(LIZLLL.LIZJ) - LIZIZ(LIZLLL.LIZIZ));
                    int i11 = this.LJIIIZ.x;
                    i3 = LIZ(i10, LIZ4, this.LJIILL.left, this.LJIILL.right, xVelocity, (int) (motionEvent.getRawX() - this.LJJIIZI));
                }
                if (this.LJJJJ != 3) {
                    this.LJIL = true;
                    if (i4 != this.LJIIIZ.y) {
                        int i12 = this.LJIIIZ.x;
                        i3 = 0;
                    }
                    LIZ(i4, i3, true, true, xVelocity);
                }
                this.LJJIJIIJI = -1;
                m21218LJ();
                return true;
            }
            this.LJJIJIIJI = -1;
            m21218LJ();
            return true;
        }
        LIZIZ(motionEvent);
        return true;
    }

    private C0159b LIZ(Point point) {
        return this.LJIILIIL.get(point);
    }

    private C0159b LIZ(View view) {
        for (int i = 0; i < this.LJIILIIL.size(); i++) {
            C0159b valueAt = this.LJIILIIL.valueAt(i);
            if (valueAt != null && this.LJIIIIZZ.LIZLLL()) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: LJ */
    private C0159b m21217LJ(int i, int i2) {
        this.LJII.set(i, i2);
        return this.LJIILIIL.get(this.LJII);
    }

    private C0159b LJI(int i, int i2) {
        int LIZIZ2 = (int) LIZIZ(i2);
        int LIZ2 = (int) LIZ(i);
        C0159b m21217LJ = m21217LJ(LIZ2, LIZIZ2);
        if (m21217LJ == null) {
            C0159b c0159b = new C0159b();
            c0159b.LIZIZ = LIZ2;
            c0159b.LIZJ = LIZIZ2;
            return c0159b;
        }
        return m21217LJ;
    }

    private void LIZIZ(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        int LIZ2 = LIZ(this.LJIIIZ.y);
        int scrollY = getScrollY();
        int i3 = i - LIZ2;
        int i4 = i2 - scrollY;
        if (i3 == 0 && i4 == 0) {
            LIZ(false);
            LIZIZ();
            setScrollState(0);
            return;
        }
        setScrollState(2);
        this.LJIIZILJ.startScroll(LIZ2, scrollY, i3, i4, this.LJFF);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private C0159b LIZJ(int i, int i2) {
        Point point = new Point(i, i2);
        C0159b remove = this.LJIILJJIL.remove(point);
        if (remove == null) {
            remove = new C0159b();
            remove.LIZ = this.LJIIIIZZ.LIZJ();
            remove.LIZIZ = i;
            remove.LIZJ = i2;
        }
        point.set(i, i2);
        remove.LIZIZ = i;
        remove.LIZJ = i2;
        this.LJIILIIL.put(point, remove);
        return remove;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C139230dAI c139230dAI;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        this.LJIJJLI = true;
        LIZIZ();
        this.LJIJJLI = false;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && (c139230dAI = (C139230dAI) childAt.getLayoutParams()) != null) {
                LIZ(childAt, c139230dAI);
            }
        }
    }

    private boolean LJFF(int i, int i2) {
        if (this.LJIILIIL.size() == 0) {
            this.LJJJ = false;
            LIZ(0, 0, 0.0f, 0.0f, 0, 0);
            if (this.LJJJ) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0159b LIZLLL = LIZLLL();
        int LIZIZ2 = LIZIZ(LIZLLL.LIZIZ);
        int LIZJ = LIZJ(LIZLLL.LIZJ);
        int paddingLeft = (i + getPaddingLeft()) - LIZIZ2;
        int paddingTop = (i2 + getPaddingTop()) - LIZJ;
        float LIZ2 = LIZ(paddingLeft);
        float LIZIZ3 = LIZIZ(paddingTop);
        this.LJJJ = false;
        LIZ(LIZLLL.LIZIZ, LIZLLL.LIZJ, LIZ2, LIZIZ3, paddingLeft, paddingTop);
        if (this.LJJJ) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.LJJJJ == 2 && this.LJJJJI == 1) {
            i = LIZ(this.LJIIIZ.y);
        }
        super.scrollTo(0, i2);
        int i3 = this.LJIIIZ.y;
        if (LIZ(i3) != i) {
            int childCount = getChildCount();
            int LIZ2 = i - LIZ(i3);
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0159b LIZ3 = LIZ(childAt);
                if (LIZ3 != null && LIZ3.LIZJ == i3) {
                    childAt.offsetLeftAndRight(-LIZ2);
                    postInvalidateOnAnimation();
                }
            }
            LIZ(i3, i);
        }
    }

    private int LIZ(View view, int i) {
        if (view instanceof TNR) {
            return ((TNR) view).LIZ(i);
        }
        if (view instanceof ScrollView) {
            return LIZ((ScrollView) view, i);
        }
        return 0;
    }

    public static int LIZ(ScrollView scrollView, int i) {
        if (scrollView.getChildCount() <= 0) {
            return 0;
        }
        View childAt = scrollView.getChildAt(0);
        int height = scrollView.getHeight();
        int height2 = childAt.getHeight();
        int i2 = height2 - height;
        if (height2 <= height) {
            return 0;
        }
        if (i > 0) {
            return Math.min(i2 - scrollView.getScrollY(), 0);
        }
        if (i >= 0) {
            return 0;
        }
        return -scrollView.getScrollY();
    }

    private void LIZLLL(int i, int i2) {
        Point point = new Point();
        if (this.LJIIIZ.x != i || this.LJIIIZ.y != i2) {
            point.set(this.LJIIIZ.x, this.LJIIIZ.y);
            this.LJIIIZ.set(i, i2);
        }
        if (this.LJIL || getWindowToken() == null) {
            return;
        }
        this.LJIILLIIL.setEmpty();
        int LIZ2 = this.LJIIIIZZ.LIZ();
        if (this.LIZJ == LIZ2) {
            int LIZIZ2 = this.LJIIIIZZ.LIZIZ();
            if (LIZIZ2 > 0) {
                this.LIZJ = LIZ2;
                this.LIZLLL = LIZIZ2;
                int max = Math.max(1, this.LJJ);
                int max2 = Math.max(0, i2 - max);
                int min = Math.min(LIZ2 - 1, i2 + max);
                int max3 = Math.max(0, i - max);
                int min2 = Math.min(LIZIZ2 - 1, i + max);
                for (int size = this.LJIILIIL.size() - 1; size >= 0; size--) {
                    C0159b valueAt = this.LJIILIIL.valueAt(size);
                    if (valueAt.LIZJ == i2) {
                        if (valueAt.LIZIZ >= max3 && valueAt.LIZIZ <= min2) {
                        }
                        Point keyAt = this.LJIILIIL.keyAt(size);
                        this.LJIILIIL.removeAt(size);
                        keyAt.set(valueAt.LIZIZ, valueAt.LIZJ);
                        this.LJIILJJIL.put(keyAt, valueAt);
                    } else {
                        int i3 = this.LJIIIZ.x;
                        if (valueAt.LIZIZ == 0 && valueAt.LIZJ >= max2 && valueAt.LIZJ <= min) {
                        }
                        Point keyAt2 = this.LJIILIIL.keyAt(size);
                        this.LJIILIIL.removeAt(size);
                        keyAt2.set(valueAt.LIZIZ, valueAt.LIZJ);
                        this.LJIILJJIL.put(keyAt2, valueAt);
                    }
                }
                Point point2 = this.LJII;
                point2.y = i2;
                point2.x = max3;
                while (this.LJII.x <= min2) {
                    if (!this.LJIILIIL.containsKey(this.LJII)) {
                        LIZJ(this.LJII.x, this.LJII.y);
                    }
                    this.LJII.x++;
                }
                this.LJII.y = max2;
                while (this.LJII.y <= min) {
                    Point point3 = this.LJII;
                    int i4 = point3.y;
                    point3.x = 0;
                    if (!this.LJIILIIL.containsKey(this.LJII)) {
                        LIZJ(this.LJII.x, this.LJII.y);
                    }
                    if (this.LJII.y != this.LJIIIZ.y) {
                        LIZ(this.LJII.y, LIZIZ(this.LJII.x) - getPaddingLeft());
                    }
                    this.LJII.y++;
                }
                for (int size2 = this.LJIILJJIL.size() - 1; size2 >= 0; size2--) {
                    this.LJIILJJIL.removeAt(size2);
                }
                this.LJIILJJIL.clear();
                this.LJIILL.set(max3, max2, min2, min);
                this.LJIILLIIL.set(LIZIZ(max3) - getPaddingLeft(), LIZJ(max2) - getPaddingTop(), LIZIZ(min2 + 1) - getPaddingRight(), LIZJ(min + 1) + getPaddingBottom());
                if (this.LJJJJLL) {
                    this.LJJJJLL = false;
                    LIZ(this.LJJJJZ, this.LJIIIIZZ);
                    this.LJJJJZ = null;
                }
                if (this.LJJJJZI) {
                    this.LJJJJZI = false;
                    LIZJ();
                    return;
                }
                return;
            }
            throw new IllegalStateException("All rows must have at least 1 column");
        }
        throw new IllegalStateException("Adapter row count changed without a call to notifyDataSetChanged()");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZ(view);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C139230dAI c139230dAI = (C139230dAI) layoutParams;
        if (this.LJIJJLI) {
            c139230dAI.LIZ = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
        WindowInsets windowInsets = this.LJJJJL;
        if (windowInsets != null) {
            view.onApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.LJIILIIL.isEmpty()) {
            int i5 = this.LJIJJ;
            int i6 = this.LJIJI;
            if (i3 > 0 && i4 > 0) {
                int paddingTop = ((i2 - getPaddingTop()) - getPaddingBottom()) + i6;
                int paddingTop2 = ((i4 - getPaddingTop()) - getPaddingBottom()) + i6;
                int LIZ2 = (int) ((LIZ(this.LJIIIZ.y) / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i - getPaddingLeft()) - getPaddingRight()) + i5));
                int scrollY = (int) ((getScrollY() / paddingTop2) * paddingTop);
                scrollTo(LIZ2, scrollY);
                if (!this.LJIIZILJ.isFinished()) {
                    C0159b LIZ3 = LIZ(this.LJIIIZ);
                    this.LJIIZILJ.startScroll(LIZ2, scrollY, LIZIZ(LIZ3.LIZIZ) - getPaddingLeft(), LIZJ(LIZ3.LIZJ) - getPaddingTop(), this.LJIIZILJ.getDuration() - this.LJIIZILJ.timePassed());
                    return;
                }
                return;
            }
            C0159b LIZ4 = LIZ(this.LJIIIZ);
            if (LIZ4 != null) {
                int LIZIZ2 = LIZIZ(LIZ4.LIZIZ) - getPaddingLeft();
                int LIZJ = LIZJ(LIZ4.LIZJ) - getPaddingTop();
                if (LIZIZ2 != LIZ(LIZ4.LIZJ) || LIZJ != getScrollY()) {
                    LIZ(false);
                    scrollTo(LIZIZ2, LIZJ);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0159b LIZ2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C139230dAI c139230dAI = (C139230dAI) childAt.getLayoutParams();
            if (c139230dAI != null && (LIZ2 = LIZ(childAt)) != null) {
                if (c139230dAI.LIZ) {
                    c139230dAI.LIZ = false;
                    LIZ(childAt, c139230dAI);
                }
                int LIZIZ2 = LIZIZ(LIZ2.LIZIZ);
                int LIZJ = LIZJ(LIZ2.LIZJ);
                int LIZ3 = (LIZIZ2 - LIZ(LIZ2.LIZJ)) + c139230dAI.leftMargin;
                int i6 = LIZJ + c139230dAI.topMargin;
                childAt.layout(LIZ3, i6, childAt.getMeasuredWidth() + LIZ3, childAt.getMeasuredHeight() + i6);
            }
        }
        if (this.LJJIZ && !this.LJIILIIL.isEmpty()) {
            LIZ(this.LJIIIZ.x, this.LJIIIZ.y, false, 0, false);
        }
        this.LJJIZ = false;
    }

    private int LIZ(int i, float f, int i2, int i3, int i4, int i5) {
        if (Math.abs(i4) < this.LJJIJLIJ) {
            i4 = (int) Math.copySign(i4, i5);
        }
        float max = (0.5f / Math.max(Math.abs(0.5f - f), 0.001f)) * 100.0f;
        if (Math.abs(i5) > this.LJJIJL && Math.abs(i4) + max > this.LJJIJIL) {
            if (i4 <= 0) {
                i++;
            }
        } else {
            i = Math.round(i + f);
        }
        return LIZ(i, i2, i3);
    }
}
