package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC133051bYH;
import p003X.C116990W3k;
import p003X.C139043d7H;
import p003X.C139187d9b;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C144824eck;
import p003X.W2W;

/* loaded from: classes19.dex */
public class ViewPager extends ViewGroup {
    public PagerAdapter mAdapter;
    public List<OnAdapterChangeListener> mAdapterChangeListeners;
    public int mBottomPageBounds;
    public boolean mCalledSuper;
    public int mChildHeightMeasureSpec;
    public int mChildWidthMeasureSpec;
    public int mCloseEnough;
    public int mCurItem;
    public int mDecorChildCount;
    public int mDefaultGutterSize;
    public int mDrawingOrder;
    public ArrayList<View> mDrawingOrderedChildren;
    public int mExpectedAdapterCount;
    public long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public int mFlingDistance;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public OnPageChangeListener mInternalPageChangeListener;
    public boolean mIsBeingDragged;
    public boolean mIsScrollStarted;
    public boolean mIsUnableToDrag;
    public float mLastMotionX;
    public float mLastMotionY;
    public EdgeEffect mLeftEdge;
    public Drawable mMarginDrawable;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public C144824eck mObserver;
    public OnPageChangeListener mOnPageChangeListener;
    public List<OnPageChangeListener> mOnPageChangeListeners;
    public int mPageMargin;
    public PageTransformer mPageTransformer;
    public int mPageTransformerLayerType;
    public boolean mPopulatePending;
    public EdgeEffect mRightEdge;
    public Scroller mScroller;
    public boolean mScrollingCacheEnabled;
    public int mTopPageBounds;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public static final int[] LAYOUT_ATTRS = {16842931};
    public static final Comparator<C0441b> COMPARATOR = new Comparator<C0441b>() { // from class: androidx.viewpager.widget.ViewPager.1
        static {
            Covode.recordClassIndex(2068);
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C0441b c0441b, C0441b c0441b2) {
            return c0441b.LIZIZ - c0441b2.LIZIZ;
        }
    };
    public static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        static {
            Covode.recordClassIndex(2069);
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public static final C139043d7H sPositionComparator = new C139043d7H();
    public final ArrayList<C0441b> mItems = new ArrayList<>();
    public final C0441b mTempItem = new C0441b();
    public final Rect mTempRect = new Rect();
    public int mRestoredCurItem = -1;
    public Parcelable mRestoredAdapterState = null;
    public ClassLoader mRestoredClassLoader = null;
    public float mFirstOffset = -3.4028235E38f;
    public float mLastOffset = Float.MAX_VALUE;
    public int mOffscreenPageLimit = 1;
    public int mActivePointerId = -1;
    public boolean mFirstLayout = true;
    public boolean mNeedCalculatePageOffsets = false;
    public final Runnable mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
        static {
            Covode.recordClassIndex(2070);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    public int mScrollState = 0;

    /* loaded from: classes16.dex */
    public interface OnAdapterChangeListener {
        static {
            Covode.recordClassIndex(2073);
        }

        void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* loaded from: classes25.dex */
    public interface OnPageChangeListener {
        static {
            Covode.recordClassIndex(2074);
        }

        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* loaded from: classes19.dex */
    public interface PageTransformer {
        static {
            Covode.recordClassIndex(2075);
        }

        void transformPage(View view, float f);
    }

    /* loaded from: classes22.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        static {
            Covode.recordClassIndex(2078);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    /* loaded from: classes19.dex */
    public static class C0441b {
        public Object LIZ;
        public int LIZIZ;
        public boolean LIZJ;
        public float LIZLLL;

        /* renamed from: LJ */
        public float f20295LJ;

        static {
            Covode.recordClassIndex(2080);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        m21100xce120a8a(this, pagerAdapter);
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    /* loaded from: classes19.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean LIZ;
        public int LIZIZ;
        public float LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public int f20294LJ;
        public int position;

        static {
            Covode.recordClassIndex(2072);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.LIZIZ = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            static {
                Covode.recordClassIndex(2077);
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
                return new SavedState(parcel, classLoader);
            }
        };
        public int LIZ;
        public Parcelable LIZIZ;
        public ClassLoader LIZJ;

        static {
            Covode.recordClassIndex(2076);
        }

        public String toString() {
            return C0002O.m25083C("FragmentPager.SavedState{", Integer.toHexString(System.identityHashCode(this)), " position=", Integer.valueOf(this.LIZ), "}");
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ);
            parcel.writeParcelable(this.LIZIZ, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readParcelable(classLoader);
            this.LIZJ = classLoader;
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i > 0) {
            setCurrentItem(i - 1, true);
            return true;
        }
        return false;
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).LIZ) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZ = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.LIZIZ = pagerAdapter.saveState();
        }
        return savedState;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && this.mCurItem < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(2067);
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    private C0441b infoForCurrentScrollPosition() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
            f2 = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C0441b c0441b = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i2 < this.mItems.size()) {
            C0441b c0441b2 = this.mItems.get(i2);
            if (!z && c0441b2.LIZIZ != (i = i3 + 1)) {
                c0441b2 = this.mTempItem;
                c0441b2.f20295LJ = f3 + f4 + f2;
                c0441b2.LIZIZ = i;
                c0441b2.LIZLLL = this.mAdapter.getPageWidth(c0441b2.LIZIZ);
                i2--;
            }
            f3 = c0441b2.f20295LJ;
            float f5 = c0441b2.LIZLLL + f3 + f2;
            if (!z && f < f3) {
                return c0441b;
            }
            if (f >= f5 && i2 != this.mItems.size() - 1) {
                i3 = c0441b2.LIZIZ;
                f4 = c0441b2.LIZLLL;
                i2++;
                c0441b = c0441b2;
                z = false;
            } else {
                return c0441b2;
            }
        }
        return c0441b;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0441b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.LIZIZ, ((scrollX / clientWidth) - infoForCurrentScrollPosition.f20295LJ) / infoForCurrentScrollPosition.LIZLLL, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new C139187d9b(this));
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            public final Rect LIZIZ = new Rect();

            static {
                Covode.recordClassIndex(2071);
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.LIZIZ;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C0441b c0441b = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(c0441b.LIZ);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c0441b.LIZIZ, c0441b.LIZ);
                    if (this.mCurItem == c0441b.LIZIZ) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (c0441b.LIZIZ != itemPosition) {
                    if (c0441b.LIZIZ == this.mCurItem) {
                        i = itemPosition;
                    }
                    c0441b.LIZIZ = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.LIZ) {
                    layoutParams.LIZJ = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void removeOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(AbstractC133051bYH.class) != null) {
            return true;
        }
        return false;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    public void addOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public C0441b infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    public C0441b infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0441b c0441b = this.mItems.get(i2);
            if (c0441b.LIZIZ == i) {
                return c0441b;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            enableLayers(z);
        }
        dispatchOnScrollStateChanged(i);
    }

    private void dispatchOnPageSelected(int i) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0441b infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0441b infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public C0441b infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C0441b c0441b = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, c0441b.LIZ)) {
                return c0441b;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.LIZIZ, savedState.LIZJ);
            setCurrentItemInternal(savedState.LIZ, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.LIZ;
        this.mRestoredAdapterState = savedState.LIZIZ;
        this.mRestoredClassLoader = savedState.LIZJ;
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C0441b c0441b = this.mItems.get(i);
            if (c0441b.LIZJ) {
                c0441b.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0441b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = infoForCurrentScrollPosition.LIZIZ;
        float f3 = ((i / f2) - infoForCurrentScrollPosition.f20295LJ) / (infoForCurrentScrollPosition.LIZLLL + (f / f2));
        this.mCalledSuper = false;
        onPageScrolled(i4, f3, (int) (i3 * f3));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                        return false;
                    }
                    return false;
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + (this.mLastMotionX - f);
        float clientWidth = getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C0441b c0441b = this.mItems.get(0);
        ArrayList<C0441b> arrayList = this.mItems;
        C0441b c0441b2 = arrayList.get(arrayList.size() - 1);
        if (c0441b.LIZIZ != 0) {
            f2 = c0441b.f20295LJ * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0441b2.LIZIZ != this.mAdapter.getCount() - 1) {
            f3 = c0441b2.f20295LJ * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - i;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    public void androidx_viewpager_widget_ViewPager__setAdapter$___twin___(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C0441b c0441b = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, c0441b.LIZIZ, c0441b.LIZ);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new C144824eck(this);
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.findFocus()
            r4 = 1
            r5 = 0
            if (r3 == r6) goto L46
            if (r3 == 0) goto L47
            android.view.ViewParent r1 = r3.getParent()
        Le:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L19
            if (r1 == r6) goto L47
            android.view.ViewParent r1 = r1.getParent()
            goto Le
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r3.getParent()
        L2d:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L46
            java.lang.String r0 = " => "
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L2d
        L46:
            r3 = 0
        L47:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r0.findNextFocus(r6, r3, r7)
            r1 = 66
            r0 = 17
            if (r2 == 0) goto La0
            if (r2 == r3) goto La0
            if (r7 != r0) goto L80
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r2)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L7b
            if (r1 < r0) goto L7b
            boolean r5 = r6.pageLeft()
        L71:
            if (r5 == 0) goto L7a
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L7a:
            return r5
        L7b:
            boolean r5 = r2.requestFocus()
            goto L71
        L80:
            if (r7 != r1) goto L7a
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r2)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L9b
            if (r1 > r0) goto L9b
            boolean r5 = r6.pageRight()
            goto L71
        L9b:
            boolean r5 = r2.requestFocus()
            goto L71
        La0:
            if (r7 == r0) goto Lae
            if (r7 == r4) goto Lae
            if (r7 == r1) goto La9
            r0 = 2
            if (r7 != r0) goto L7a
        La9:
            boolean r5 = r6.pageRight()
            goto L71
        Lae:
            boolean r5 = r6.pageLeft()
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                ViewCompat.postInvalidateOnAnimation(this);
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    public void fakeDragBy(float f) {
        ArrayList<C0441b> arrayList;
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C0441b c0441b = this.mItems.get(0);
            C0441b c0441b2 = this.mItems.get(arrayList.size() - 1);
            if (c0441b.LIZIZ != 0) {
                f2 = c0441b.f20295LJ * clientWidth;
            }
            if (c0441b2.LIZIZ != this.mAdapter.getCount() - 1) {
                f3 = c0441b2.f20295LJ * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - i;
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f2 = this.mPageMargin / width2;
            int i = 0;
            C0441b c0441b = this.mItems.get(0);
            float f3 = c0441b.f20295LJ;
            int size = this.mItems.size();
            int i2 = this.mItems.get(size - 1).LIZIZ;
            for (int i3 = c0441b.LIZIZ; i3 < i2; i3++) {
                while (i3 > c0441b.LIZIZ && i < size) {
                    i++;
                    c0441b = this.mItems.get(i);
                }
                if (i3 == c0441b.LIZIZ) {
                    f = (c0441b.f20295LJ + c0441b.LIZLLL) * width2;
                    f3 = c0441b.f20295LJ + c0441b.LIZLLL + f2;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i3);
                    f = (f3 + pageWidth) * width2;
                    f3 += pageWidth + f2;
                }
                if (this.mPageMargin + f > scrollX) {
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i = this.mActivePointerId;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.mLastMotionX;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.mInitialMotionY);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                            this.mLastMotionX = x;
                            this.mLastMotionY = y;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        if (abs > this.mTouchSlop && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f3 = this.mInitialMotionX;
                            float f4 = this.mTouchSlop;
                            if (i2 > 0) {
                                f = f3 + f4;
                            } else {
                                f = f3 - f4;
                            }
                            this.mLastMotionX = f;
                            this.mLastMotionY = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > this.mTouchSlop) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.mInitialMotionX = x2;
                this.mLastMotionX = x2;
                float y2 = motionEvent.getY();
                this.mInitialMotionY = y2;
                this.mLastMotionY = y2;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r6.LIZIZ == r17.mCurItem) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    /* renamed from: androidx_viewpager_widget_ViewPager_com_bytedance_scalpel_scenemanager_lancet_common_ViewPagerLancet_setAdapter */
    public static void m21101xe06c9687(final ViewPager viewPager, PagerAdapter pagerAdapter) {
        viewPager.androidx_viewpager_widget_ViewPager__setAdapter$___twin___(pagerAdapter);
        if (!PatchProxy.proxy(new Object[]{viewPager}, null, C116990W3k.LIZ, true, 2).isSupported) {
            W2W.LIZ(new Runnable(viewPager) { // from class: X.W3j
                public static ChangeQuickRedirect LIZ;
                public final Object LIZIZ;

                static {
                    Covode.recordClassIndex(104957);
                }

                {
                    this.LIZIZ = viewPager;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Object obj = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, null, C116990W3k.LIZ, true, 3).isSupported || obj == null || !(obj instanceof ViewPager)) {
                        return;
                    }
                    ((ViewPager) obj).addOnPageChangeListener(new C116961W2h());
                }
            });
        }
    }

    /* renamed from: androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_setViewPagerAdapter */
    public static void m21100xce120a8a(ViewPager viewPager, PagerAdapter pagerAdapter) {
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(C140192dPo.LIZJ);
            viewPager.addOnPageChangeListener(C140192dPo.LIZJ);
        }
        if (C140192dPo.LIZ("setViewPagerAdapter")) {
            C140181dPd.LIZ("setAdapter");
        }
        m21101xe06c9687(viewPager, pagerAdapter);
    }

    private boolean isGutterDrag(float f, float f2) {
        if (f >= this.mGutterSize || f2 <= 0.0f) {
            if (f > getWidth() - this.mGutterSize && f2 < 0.0f) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f20294LJ;
    }

    public C0441b addNewItem(int i, int i2) {
        C0441b c0441b = new C0441b();
        c0441b.LIZIZ = i;
        c0441b.LIZ = this.mAdapter.instantiateItem((ViewGroup) this, i);
        c0441b.LIZLLL = this.mAdapter.getPageWidth(i);
        if (i2 >= 0 && i2 < this.mItems.size()) {
            this.mItems.add(i2, c0441b);
            return c0441b;
        }
        this.mItems.add(c0441b);
        return c0441b;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0441b infoForChild;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f, i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.LIZ |= isDecorView(view);
        if (this.mInLayout) {
            if (!layoutParams2.LIZ) {
                layoutParams2.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        if (pageTransformer != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0441b infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.mDecorChildCount
            r6 = 0
            r5 = 1
            if (r0 <= 0) goto L69
            int r10 = r11.getScrollX()
            int r4 = r11.getPaddingLeft()
            int r9 = r11.getPaddingRight()
            int r8 = r11.getWidth()
            int r3 = r11.getChildCount()
            r2 = 0
        L1b:
            if (r2 >= r3) goto L69
            android.view.View r1 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r7 = (androidx.viewpager.widget.ViewPager.LayoutParams) r7
            boolean r0 = r7.LIZ
            if (r0 == 0) goto L44
            int r0 = r7.LIZIZ
            r7 = r0 & 7
            if (r7 == r5) goto L4d
            r0 = 3
            if (r7 == r0) goto L47
            r0 = 5
            if (r7 == r0) goto L5a
            r0 = r4
        L38:
            int r4 = r4 + r10
            int r7 = r1.getLeft()
            int r4 = r4 - r7
            if (r4 == 0) goto L43
            r1.offsetLeftAndRight(r4)
        L43:
            r4 = r0
        L44:
            int r2 = r2 + 1
            goto L1b
        L47:
            int r0 = r1.getWidth()
            int r0 = r0 + r4
            goto L38
        L4d:
            int r0 = r1.getMeasuredWidth()
            int r0 = r8 - r0
            int r0 = r0 / 2
            int r7 = java.lang.Math.max(r0, r4)
            goto L66
        L5a:
            int r7 = r8 - r9
            int r0 = r1.getMeasuredWidth()
            int r7 = r7 - r0
            int r0 = r1.getMeasuredWidth()
            int r9 = r9 + r0
        L66:
            r0 = r4
            r4 = r7
            goto L38
        L69:
            r11.dispatchOnPageScrolled(r12, r13, r14)
            androidx.viewpager.widget.ViewPager$PageTransformer r0 = r11.mPageTransformer
            if (r0 == 0) goto L9c
            int r4 = r11.getScrollX()
            int r3 = r11.getChildCount()
        L78:
            if (r6 >= r3) goto L9c
            android.view.View r2 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L99
            int r0 = r2.getLeft()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r11.getClientWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            androidx.viewpager.widget.ViewPager$PageTransformer r0 = r11.mPageTransformer
            r0.transformPage(r2, r1)
        L99:
            int r6 = r6 + 1
            goto L78
        L9c:
            r11.mCalledSuper = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i6;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i4) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private void calculatePageOffsets(C0441b c0441b, int i, C0441b c0441b2) {
        float f;
        float f2;
        float f3;
        C0441b c0441b3;
        C0441b c0441b4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
        }
        if (c0441b2 != null) {
            int i2 = c0441b2.LIZIZ;
            if (i2 < c0441b.LIZIZ) {
                float f4 = c0441b2.f20295LJ + c0441b2.LIZLLL + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= c0441b.LIZIZ && i4 < this.mItems.size()) {
                    C0441b c0441b5 = this.mItems.get(i4);
                    while (true) {
                        c0441b4 = c0441b5;
                        if (i3 <= c0441b4.LIZIZ || i4 >= this.mItems.size() - 1) {
                            break;
                        }
                        i4++;
                        c0441b5 = this.mItems.get(i4);
                    }
                    while (i3 < c0441b4.LIZIZ) {
                        f4 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    c0441b4.f20295LJ = f4;
                    f4 += c0441b4.LIZLLL + f;
                    i3++;
                }
            } else if (i2 > c0441b.LIZIZ) {
                int size = this.mItems.size() - 1;
                float f5 = c0441b2.f20295LJ;
                int i5 = i2 - 1;
                while (i5 >= c0441b.LIZIZ && size >= 0) {
                    C0441b c0441b6 = this.mItems.get(size);
                    while (true) {
                        c0441b3 = c0441b6;
                        if (i5 >= c0441b3.LIZIZ || size <= 0) {
                            break;
                        }
                        size--;
                        c0441b6 = this.mItems.get(size);
                    }
                    while (i5 > c0441b3.LIZIZ) {
                        f5 -= this.mAdapter.getPageWidth(i5) + f;
                        i5--;
                    }
                    f5 -= c0441b3.LIZLLL + f;
                    c0441b3.f20295LJ = f5;
                    i5--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = c0441b.f20295LJ;
        int i6 = c0441b.LIZIZ - 1;
        if (c0441b.LIZIZ == 0) {
            f2 = c0441b.f20295LJ;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i7 = count - 1;
        if (c0441b.LIZIZ == i7) {
            f3 = (c0441b.f20295LJ + c0441b.LIZLLL) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i8 = i - 1;
        while (i8 >= 0) {
            C0441b c0441b7 = this.mItems.get(i8);
            while (i6 > c0441b7.LIZIZ) {
                f6 -= this.mAdapter.getPageWidth(i6) + f;
                i6--;
            }
            f6 -= c0441b7.LIZLLL + f;
            c0441b7.f20295LJ = f6;
            if (c0441b7.LIZIZ == 0) {
                this.mFirstOffset = f6;
            }
            i8--;
            i6--;
        }
        float f7 = c0441b.f20295LJ + c0441b.LIZLLL + f;
        int i9 = c0441b.LIZIZ + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C0441b c0441b8 = this.mItems.get(i10);
            while (i9 < c0441b8.LIZIZ) {
                f7 += this.mAdapter.getPageWidth(i9) + f;
                i9++;
            }
            if (c0441b8.LIZIZ == i7) {
                this.mLastOffset = (c0441b8.LIZLLL + f7) - 1.0f;
            }
            c0441b8.f20295LJ = f7;
            f7 += c0441b8.LIZLLL + f;
            i10++;
            i9++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0441b infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.f20295LJ, this.mLastOffset)));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.mFlingDistance && Math.abs(i2) > this.mMinimumVelocity) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        }
        if (this.mItems.size() > 0) {
            ArrayList<C0441b> arrayList = this.mItems;
            return Math.max(this.mItems.get(0).LIZIZ, Math.min(i, arrayList.get(arrayList.size() - 1).LIZIZ));
        }
        return i;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C0441b infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f = Math.min(infoForPosition.f20295LJ, this.mLastOffset);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            completeScroll(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).LIZJ = true;
                }
            }
            if (this.mCurItem == i) {
                z3 = false;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0441b infoForChild;
        int max;
        int max2;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.LIZ) {
                    int i9 = layoutParams.LIZIZ & 7;
                    int i10 = layoutParams.LIZIZ & 112;
                    if (i9 != 1) {
                        if (i9 != 3) {
                            if (i9 != 5) {
                                max = paddingLeft;
                            } else {
                                max = (i5 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                        }
                    } else {
                        max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    if (i10 != 16) {
                        if (i10 != 48) {
                            if (i10 != 80) {
                                max2 = paddingTop;
                            } else {
                                max2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                        } else {
                            max2 = paddingTop;
                            paddingTop = childAt.getMeasuredHeight() + paddingTop;
                        }
                    } else {
                        max2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i11 = max + scrollX;
                    childAt.layout(i11, max2, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + max2);
                    i7++;
                }
            }
        }
        int i12 = (i5 - paddingLeft) - paddingRight;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.LIZ && (infoForChild = infoForChild(childAt2)) != null) {
                    float f = i12;
                    int i14 = ((int) (infoForChild.f20295LJ * f)) + paddingLeft;
                    if (layoutParams2.LIZLLL) {
                        layoutParams2.LIZLLL = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.LIZJ), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i14, paddingTop, childAt2.getMeasuredWidth() + i14, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i6 - paddingBottom;
        this.mDecorChildCount = i7;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }
}
