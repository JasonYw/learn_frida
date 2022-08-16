package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.AbstractC0448b;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import p002O.C0002O;
import p003X.AbstractC145919euV;
import p003X.AbstractC147128fE2;
import p003X.C129258aYu;
import p003X.C132097bIt;
import p003X.C147123fDx;
import p003X.C147124fDy;
import p003X.C147127fE1;
import p003X.C147129fE3;
import p003X.C147130fE4;
import p003X.C147132fE6;
import p003X.C147136fEA;
import p003X.RunnableC129172aXW;

/* loaded from: classes20.dex */
public final class ViewPager2 extends ViewGroup {
    public static boolean sFeatureEnhancedA11yEnabled = true;
    public AbstractC147128fE2 mAccessibilityProvider;
    public int mCurrentItem;
    public C147124fDy mFakeDragger;
    public LinearLayoutManager mLayoutManager;
    public C129258aYu mPageChangeEventDispatcher;
    public C132097bIt mPageTransformerAdapter;
    public PagerSnapHelper mPagerSnapHelper;
    public Parcelable mPendingAdapterState;
    public RecyclerView mRecyclerView;
    public C147123fDx mScrollEventAdapter;
    public final Rect mTmpContainerRect = new Rect();
    public final Rect mTmpChildRect = new Rect();
    public C129258aYu mExternalPageChangeCallbacks = new C129258aYu(3);
    public boolean mCurrentItemDirty = false;
    public RecyclerView.AdapterDataObserver mCurrentItemDataSetChangeObserver = new AbstractC145919euV() { // from class: androidx.viewpager2.widget.ViewPager2.1
        static {
            Covode.recordClassIndex(2099);
        }

        @Override // p003X.AbstractC145919euV, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.mCurrentItemDirty = true;
            viewPager2.mScrollEventAdapter.LJI = true;
        }
    };
    public int mPendingCurrentItem = -1;
    public RecyclerView.ItemAnimator mSavedItemAnimator = null;
    public boolean mSavedItemAnimatorPresent = false;
    public boolean mUserInputEnabled = true;
    public int mOffscreenPageLimit = -1;

    /* loaded from: classes11.dex */
    public static abstract class OnPageChangeCallback {
        static {
            Covode.recordClassIndex(2103);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    /* loaded from: classes3.dex */
    public interface AbstractC0454f {
        static {
            Covode.recordClassIndex(2114);
        }

        void LIZ(View view, float f);
    }

    public final int getCurrentItem() {
        return this.mCurrentItem;
    }

    public final int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public final boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    private RecyclerView.OnChildAttachStateChangeListener enforceChildFillListener() {
        return new RecyclerView.OnChildAttachStateChangeListener(this) { // from class: androidx.viewpager2.widget.ViewPager2.4
            static {
                Covode.recordClassIndex(2102);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public final void onChildViewDetachedFromWindow(View view) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public final void onChildViewAttachedToWindow(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        };
    }

    public final boolean beginFakeDrag() {
        return this.mFakeDragger.LIZ();
    }

    public final boolean endFakeDrag() {
        return this.mFakeDragger.LIZIZ();
    }

    public final RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.mo25798getAdapter();
    }

    public final int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public final int getOrientation() {
        return this.mLayoutManager.getOrientation();
    }

    public final int getScrollState() {
        return this.mScrollEventAdapter.LIZJ;
    }

    public final void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public final boolean isFakeDragging() {
        return this.mFakeDragger.LIZIZ.LJII;
    }

    /* loaded from: classes20.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            static {
                Covode.recordClassIndex(2105);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return LIZ(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return LIZ(parcel, classLoader);
            }

            public static SavedState LIZ(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }
        };
        public int LIZ;
        public int LIZIZ;
        public Parcelable LIZJ;

        static {
            Covode.recordClassIndex(2104);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            LIZ(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            LIZ(parcel, classLoader);
        }

        private void LIZ(Parcel parcel, ClassLoader classLoader) {
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            this.LIZJ = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeParcelable(this.LIZJ, i);
        }
    }

    static {
        Covode.recordClassIndex(2098);
    }

    public final boolean isRtl() {
        if (this.mLayoutManager.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (this.mAccessibilityProvider.LIZ()) {
            return this.mAccessibilityProvider.LIZIZ();
        }
        return super.getAccessibilityClassName();
    }

    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            if (adapter instanceof AbstractC0448b) {
                ((AbstractC0448b) adapter).restoreState(parcelable);
            }
            this.mPendingAdapterState = null;
        }
        this.mCurrentItem = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
        this.mPendingCurrentItem = -1;
        this.mRecyclerView.scrollToPosition(this.mCurrentItem);
        this.mAccessibilityProvider.LIZJ();
    }

    public final int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZ = this.mRecyclerView.getId();
        int i = this.mPendingCurrentItem;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.LIZIZ = i;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.LIZJ = parcelable;
        } else {
            RecyclerView.Adapter mo25798getAdapter = this.mRecyclerView.mo25798getAdapter();
            if (mo25798getAdapter instanceof AbstractC0448b) {
                savedState.LIZJ = ((AbstractC0448b) mo25798getAdapter).saveState();
                return savedState;
            }
        }
        return savedState;
    }

    public final void requestTransform() {
        if (this.mPageTransformerAdapter.LIZ == null) {
            return;
        }
        double m21352LJ = this.mScrollEventAdapter.m21352LJ();
        int i = (int) m21352LJ;
        float f = (float) (m21352LJ - i);
        this.mPageTransformerAdapter.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    public final void snapToPage() {
        View findSnapView = this.mPagerSnapHelper.findSnapView(this.mLayoutManager);
        if (findSnapView == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = this.mPagerSnapHelper.calculateDistanceToFinalSnap(this.mLayoutManager, findSnapView);
        if (calculateDistanceToFinalSnap[0] != 0 || calculateDistanceToFinalSnap[1] != 0) {
            this.mRecyclerView.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
        }
    }

    public final void updateCurrentItem() {
        PagerSnapHelper pagerSnapHelper = this.mPagerSnapHelper;
        if (pagerSnapHelper != null) {
            View findSnapView = pagerSnapHelper.findSnapView(this.mLayoutManager);
            if (findSnapView == null) {
                return;
            }
            int position = this.mLayoutManager.getPosition(findSnapView);
            if (position != this.mCurrentItem && getScrollState() == 0) {
                this.mPageChangeEventDispatcher.onPageSelected(position);
            }
            this.mCurrentItemDirty = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    private void registerCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    private void unregisterCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public final void addItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.addItemDecoration(itemDecoration);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    public final RecyclerView.ItemDecoration getItemDecorationAt(int i) {
        return this.mRecyclerView.getItemDecorationAt(i);
    }

    public final void registerOnPageChangeCallback(OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.LIZ(onPageChangeCallback);
    }

    public final void removeItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.removeItemDecoration(itemDecoration);
    }

    public final void removeItemDecorationAt(int i) {
        this.mRecyclerView.removeItemDecorationAt(i);
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.LJFF();
    }

    public final void unregisterOnPageChangeCallback(OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.LIZ.remove(onPageChangeCallback);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.LIZ(accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.LJI();
    }

    public final void setOrientation(int i) {
        this.mLayoutManager.setOrientation(i);
        this.mAccessibilityProvider.LIZLLL();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.LIZIZ;
        this.mPendingAdapterState = savedState.LIZJ;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        new StringBuilder();
        throw new IllegalStateException(C0002O.m25086C(getClass().getSimpleName(), " does not support direct child views"));
    }

    public final void setOffscreenPageLimit(int i) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.mOffscreenPageLimit = i;
        this.mRecyclerView.requestLayout();
    }

    public ViewPager2(Context context) {
        super(context);
        initialize(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).LIZ;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    public final void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter mo25798getAdapter = this.mRecyclerView.mo25798getAdapter();
        this.mAccessibilityProvider.LIZIZ(mo25798getAdapter);
        unregisterCurrentItemDataSetTracker(mo25798getAdapter);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.LIZ(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    public final void setPageTransformer(AbstractC0454f abstractC0454f) {
        if (abstractC0454f != null) {
            if (!this.mSavedItemAnimatorPresent) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator(null);
        } else if (this.mSavedItemAnimatorPresent) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        if (abstractC0454f == this.mPageTransformerAdapter.LIZ) {
            return;
        }
        this.mPageTransformerAdapter.LIZ = abstractC0454f;
        requestTransform();
    }

    public final boolean fakeDragBy(float f) {
        int i;
        float f2;
        float f3;
        C147124fDy c147124fDy = this.mFakeDragger;
        if (!c147124fDy.LIZIZ.LJII) {
            return false;
        }
        c147124fDy.LIZLLL -= f;
        int round = Math.round(c147124fDy.LIZLLL - c147124fDy.f19645LJ);
        c147124fDy.f19645LJ += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (c147124fDy.LIZ.getOrientation() == 0) {
            i = round;
            round = 0;
            f2 = c147124fDy.LIZLLL;
            f3 = 0.0f;
        } else {
            i = 0;
            f2 = 0.0f;
            f3 = c147124fDy.LIZLLL;
        }
        c147124fDy.LIZJ.scrollBy(i, round);
        c147124fDy.LIZ(uptimeMillis, 2, f2, f3);
        return true;
    }

    public final void addItemDecoration(RecyclerView.ItemDecoration itemDecoration, int i) {
        this.mRecyclerView.addItemDecoration(itemDecoration, i);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.mAccessibilityProvider.LIZ(i)) {
            return this.mAccessibilityProvider.LIZ(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public final void setCurrentItem(int i, boolean z) {
        if (!isFakeDragging()) {
            setCurrentItemInternal(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948});
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, new int[]{16842948}, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        AbstractC147128fE2 c147132fE6;
        if (sFeatureEnhancedA11yEnabled) {
            c147132fE6 = new C147127fE1(this);
        } else {
            c147132fE6 = new C147132fE6(this);
        }
        this.mAccessibilityProvider = c147132fE6;
        this.mRecyclerView = new C147130fE4(this, context);
        this.mRecyclerView.setId(ViewCompat.generateViewId());
        this.mRecyclerView.setDescendantFocusability(131072);
        this.mLayoutManager = new C147129fE3(this, context);
        this.mRecyclerView.setLayoutManager(this.mLayoutManager);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        this.mScrollEventAdapter = new C147123fDx(this);
        this.mFakeDragger = new C147124fDy(this, this.mScrollEventAdapter, this.mRecyclerView);
        this.mPagerSnapHelper = new C147136fEA(this);
        this.mPagerSnapHelper.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        this.mPageChangeEventDispatcher = new C129258aYu(3);
        this.mScrollEventAdapter.LIZ = this.mPageChangeEventDispatcher;
        OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
            static {
                Covode.recordClassIndex(PushConstants.BROADCAST_MESSAGE_ARRIVE);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    ViewPager2.this.updateCurrentItem();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageSelected(int i) {
                if (ViewPager2.this.mCurrentItem != i) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    viewPager2.mCurrentItem = i;
                    viewPager2.mAccessibilityProvider.mo21350LJ();
                }
            }
        };
        OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
            static {
                Covode.recordClassIndex(2101);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void onPageSelected(int i) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.mRecyclerView.requestFocus(2);
                }
            }
        };
        this.mPageChangeEventDispatcher.LIZ(onPageChangeCallback);
        this.mPageChangeEventDispatcher.LIZ(onPageChangeCallback2);
        this.mAccessibilityProvider.LIZ(this.mRecyclerView);
        this.mPageChangeEventDispatcher.LIZ(this.mExternalPageChangeCallbacks);
        this.mPageTransformerAdapter = new C132097bIt(this.mLayoutManager);
        this.mPageChangeEventDispatcher.LIZ(this.mPageTransformerAdapter);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public final void setCurrentItemInternal(int i, boolean z) {
        int i2;
        int i3;
        RecyclerView.Adapter adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.mCurrentItem && this.mScrollEventAdapter.LIZJ()) {
                return;
            }
            if (min == this.mCurrentItem && z) {
                return;
            }
            double d = this.mCurrentItem;
            this.mCurrentItem = min;
            this.mAccessibilityProvider.mo21350LJ();
            if (!this.mScrollEventAdapter.LIZJ()) {
                d = this.mScrollEventAdapter.m21352LJ();
            }
            C147123fDx c147123fDx = this.mScrollEventAdapter;
            if (z) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            c147123fDx.LIZIZ = i2;
            c147123fDx.LJII = false;
            if (c147123fDx.LJFF != min) {
                z2 = true;
            }
            c147123fDx.LJFF = min;
            c147123fDx.LIZ(2);
            if (z2) {
                c147123fDx.LIZIZ(min);
            }
            if (!z) {
                this.mRecyclerView.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                RecyclerView recyclerView = this.mRecyclerView;
                if (d2 > d) {
                    i3 = min - 3;
                } else {
                    i3 = min + 3;
                }
                recyclerView.scrollToPosition(i3);
                RecyclerView recyclerView2 = this.mRecyclerView;
                recyclerView2.post(new RunnableC129172aXW(min, recyclerView2));
                return;
            }
            this.mRecyclerView.smoothScrollToPosition(min);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i3 - i) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        this.mRecyclerView.layout(this.mTmpChildRect.left, this.mTmpChildRect.top, this.mTmpChildRect.right, this.mTmpChildRect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }
}
