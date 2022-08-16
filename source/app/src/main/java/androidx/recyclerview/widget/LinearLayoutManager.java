package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p003X.AbstractC113806UrA;
import p003X.AbstractC147106fDg;
import p003X.AbstractC147109fDj;
import p003X.AbstractC147157fEV;
import p003X.C138210ctp;
import p003X.C147114fDo;
import p003X.C147115fDp;

/* loaded from: classes20.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements AbstractC113806UrA, AbstractC147157fEV {
    public final AnchorInfo mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C147115fDp mLayoutChunkResult;
    public C147114fDo mLayoutState;
    public int mOrientation;
    public AbstractC147106fDg mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    static {
        Covode.recordClassIndex(1673);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m21117x8999ee91(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m21116x15902723(this, i, recycler, state);
    }

    /* loaded from: classes20.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            static {
                Covode.recordClassIndex(1676);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int LIZ;
        public int LIZIZ;
        public boolean LIZJ;

        public final void LIZIZ() {
            this.LIZ = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public final boolean LIZ() {
            if (this.LIZ >= 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(1675);
        }

        public SavedState(SavedState savedState) {
            this.LIZ = savedState.LIZ;
            this.LIZIZ = savedState.LIZIZ;
            this.LIZJ = savedState.LIZJ;
        }

        public SavedState(Parcel parcel) {
            this.LIZ = parcel.readInt();
            this.LIZIZ = parcel.readInt();
            this.LIZJ = parcel.readInt() != 1 ? false : true;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LIZ);
            parcel.writeInt(this.LIZIZ);
            parcel.writeInt(this.LIZJ ? 1 : 0);
        }
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* loaded from: classes20.dex */
    public static class AnchorInfo {
        public int mCoordinate;
        public boolean mLayoutFromEnd;
        public AbstractC147106fDg mOrientationHelper;
        public int mPosition;
        public boolean mValid;

        static {
            Covode.recordClassIndex(1674);
        }

        public AnchorInfo() {
            reset();
        }

        public void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        public void assignCoordinateFromPadding() {
            int LIZIZ;
            if (this.mLayoutFromEnd) {
                LIZIZ = this.mOrientationHelper.LIZJ();
            } else {
                LIZIZ = this.mOrientationHelper.LIZIZ();
            }
            this.mCoordinate = LIZIZ;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + '}';
        }

        public void assignFromView(View view, int i) {
            if (this.mLayoutFromEnd) {
                this.mCoordinate = this.mOrientationHelper.LIZIZ(view) + this.mOrientationHelper.LIZ();
            } else {
                this.mCoordinate = this.mOrientationHelper.LIZ(view);
            }
            this.mPosition = i;
        }

        public boolean isViewValidAsAnchor(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount()) {
                return true;
            }
            return false;
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i) {
            int LIZ = this.mOrientationHelper.LIZ();
            if (LIZ >= 0) {
                assignFromView(view, i);
                return;
            }
            this.mPosition = i;
            if (this.mLayoutFromEnd) {
                int LIZJ = (this.mOrientationHelper.LIZJ() - LIZ) - this.mOrientationHelper.LIZIZ(view);
                this.mCoordinate = this.mOrientationHelper.LIZJ() - LIZJ;
                if (LIZJ > 0) {
                    int mo21354LJ = this.mCoordinate - this.mOrientationHelper.mo21354LJ(view);
                    int LIZIZ = this.mOrientationHelper.LIZIZ();
                    int min = mo21354LJ - (LIZIZ + Math.min(this.mOrientationHelper.LIZ(view) - LIZIZ, 0));
                    if (min < 0) {
                        this.mCoordinate += Math.min(LIZJ, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int LIZ2 = this.mOrientationHelper.LIZ(view);
            int LIZIZ2 = LIZ2 - this.mOrientationHelper.LIZIZ();
            this.mCoordinate = LIZ2;
            if (LIZIZ2 > 0) {
                int LIZJ2 = (this.mOrientationHelper.LIZJ() - Math.min(0, (this.mOrientationHelper.LIZJ() - LIZ) - this.mOrientationHelper.LIZIZ(view))) - (LIZ2 + this.mOrientationHelper.mo21354LJ(view));
                if (LIZJ2 < 0) {
                    this.mCoordinate -= Math.min(LIZIZ2, -LIZJ2);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    public C147114fDo createLayoutState() {
        return new C147114fDo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i);
        }
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return false;
    }

    private View getChildClosestToEnd() {
        int childCount;
        if (this.mShouldReverseLayout) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStart() {
        int i;
        if (this.mShouldReverseLayout) {
            i = getChildCount() - 1;
        } else {
            i = 0;
        }
        return getChildAt(i);
    }

    private void resolveShouldLayoutReverse() {
        boolean z = true;
        if (this.mOrientation != 1 && isLayoutRTL()) {
            if (this.mReverseLayout) {
                z = false;
            }
        } else {
            z = this.mReverseLayout;
        }
        this.mShouldReverseLayout = z;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.LJI() == 0 && this.mOrientationHelper.LIZLLL() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.LIZJ = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.LIZIZ = this.mOrientationHelper.LIZJ() - this.mOrientationHelper.LIZIZ(childClosestToEnd);
                savedState2.LIZ = getPosition(childClosestToEnd);
                return savedState2;
            }
            View childClosestToStart = getChildClosestToStart();
            savedState2.LIZ = getPosition(childClosestToStart);
            savedState2.LIZIZ = this.mOrientationHelper.LIZ(childClosestToStart) - this.mOrientationHelper.LIZIZ();
            return savedState2;
        }
        savedState2.LIZIZ();
        return savedState2;
    }

    public void validateChildOrder() {
        if (getChildCount() <= 0) {
            return;
        }
        boolean z = false;
        int position = getPosition(getChildAt(0));
        int LIZ = this.mOrientationHelper.LIZ(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int LIZ2 = this.mOrientationHelper.LIZ(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    if (LIZ2 < LIZ) {
                        z = true;
                    }
                    sb.append(z);
                    throw new RuntimeException(sb.toString());
                } else if (LIZ2 > LIZ) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int LIZ3 = this.mOrientationHelper.LIZ(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                if (LIZ3 < LIZ) {
                    z = true;
                }
                sb2.append(z);
                throw new RuntimeException(sb2.toString());
            } else if (LIZ3 < LIZ) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.mOrientationHelper.mo21355LJ();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.reset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.LIZIZ();
        }
        requestLayout();
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C138210ctp.LIZ(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C138210ctp.LIZ(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C138210ctp.LIZIZ(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // p003X.AbstractC113806UrA
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            this.mOrientationHelper = AbstractC147106fDg.LIZ(this, i);
            this.mAnchorInfo.mOrientationHelper = this.mOrientationHelper;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.mOrientation == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.mOrientation == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.mOrientation == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        } else {
            return 1;
        }
    }

    private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mShouldReverseLayout) {
            return findFirstReferenceChild(recycler, state);
        }
        return findLastReferenceChild(recycler, state);
    }

    private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mShouldReverseLayout) {
            return findLastReferenceChild(recycler, state);
        }
        return findFirstReferenceChild(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.LIZIZ();
        }
        requestLayout();
    }

    private View findFirstReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, C147114fDo c147114fDo) {
        if (c147114fDo.LIZ && !c147114fDo.LJIIJJI) {
            int i = c147114fDo.LJI;
            int i2 = c147114fDo.LJIIIIZZ;
            if (c147114fDo.LJFF == -1) {
                recycleViewsFromEnd(recycler, i, i2);
            } else {
                recycleViewsFromStart(recycler, i, i2);
            }
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.LJFF == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        int i3;
        this.mLayoutState.LIZJ = this.mOrientationHelper.LIZJ() - i2;
        C147114fDo c147114fDo = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c147114fDo.f19641LJ = i3;
        C147114fDo c147114fDo2 = this.mLayoutState;
        c147114fDo2.LIZLLL = i;
        c147114fDo2.LJFF = 1;
        c147114fDo2.LIZIZ = i2;
        c147114fDo2.LJI = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        int i3;
        this.mLayoutState.LIZJ = i2 - this.mOrientationHelper.LIZIZ();
        C147114fDo c147114fDo = this.mLayoutState;
        c147114fDo.LIZLLL = i;
        if (this.mShouldReverseLayout) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c147114fDo.f19641LJ = i3;
        C147114fDo c147114fDo2 = this.mLayoutState;
        c147114fDo2.LJFF = -1;
        c147114fDo2.LIZIZ = i2;
        c147114fDo2.LJI = Integer.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != false) goto L7;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void collectInitialPrefetchPositions(int r6, p003X.AbstractC147109fDj r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.mPendingSavedState
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L26
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L26
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.mPendingSavedState
            boolean r1 = r0.LIZJ
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r5.mPendingSavedState
            int r2 = r0.LIZ
        L14:
            if (r1 == 0) goto L35
        L16:
            r1 = 0
        L17:
            int r0 = r5.mInitialPrefetchItemCount
            if (r1 >= r0) goto L37
            if (r2 < 0) goto L37
            if (r2 >= r6) goto L37
            r7.LIZ(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L17
        L26:
            r5.resolveShouldLayoutReverse()
            boolean r1 = r5.mShouldReverseLayout
            int r2 = r5.mPendingScrollPosition
            if (r2 != r4) goto L14
            if (r1 == 0) goto L34
            int r2 = r6 + (-1)
            goto L16
        L34:
            r2 = 0
        L35:
            r4 = 1
            goto L16
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.collectInitialPrefetchPositions(int, X.fDj):void");
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.LIZ(getChildAt(i)) < this.mOrientationHelper.LIZIZ()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.LIZ(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.LIZ(i, i2, i3, i4);
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i;
        boolean z;
        int LIZ;
        boolean z2 = false;
        if (!state.isPreLayout() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.LIZ()) {
                    anchorInfo.mLayoutFromEnd = this.mPendingSavedState.LIZJ;
                    if (anchorInfo.mLayoutFromEnd) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.LIZJ() - this.mPendingSavedState.LIZIZ;
                        return true;
                    }
                    anchorInfo.mCoordinate = this.mOrientationHelper.LIZIZ() + this.mPendingSavedState.LIZIZ;
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.mo21354LJ(findViewByPosition) > this.mOrientationHelper.mo21355LJ()) {
                            anchorInfo.assignCoordinateFromPadding();
                            return true;
                        } else if (this.mOrientationHelper.LIZ(findViewByPosition) - this.mOrientationHelper.LIZIZ() < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.LIZIZ();
                            anchorInfo.mLayoutFromEnd = false;
                            return true;
                        } else if (this.mOrientationHelper.LIZJ() - this.mOrientationHelper.LIZIZ(findViewByPosition) < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.LIZJ();
                            anchorInfo.mLayoutFromEnd = true;
                            return true;
                        } else {
                            if (anchorInfo.mLayoutFromEnd) {
                                LIZ = this.mOrientationHelper.LIZIZ(findViewByPosition) + this.mOrientationHelper.LIZ();
                            } else {
                                LIZ = this.mOrientationHelper.LIZ(findViewByPosition);
                            }
                            anchorInfo.mCoordinate = LIZ;
                            return true;
                        }
                    }
                    if (getChildCount() > 0) {
                        if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z == this.mShouldReverseLayout) {
                            z2 = true;
                        }
                        anchorInfo.mLayoutFromEnd = z2;
                    }
                    anchorInfo.assignCoordinateFromPadding();
                    return true;
                } else {
                    boolean z3 = this.mShouldReverseLayout;
                    anchorInfo.mLayoutFromEnd = z3;
                    if (z3) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.LIZJ() - this.mPendingScrollPositionOffset;
                        return true;
                    }
                    anchorInfo.mCoordinate = this.mOrientationHelper.LIZIZ() + this.mPendingScrollPositionOffset;
                    return true;
                }
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int fixLayoutEndGap;
        int i6;
        View findViewByPosition;
        int LIZ;
        int i7;
        int i8 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.LIZ()) {
            this.mPendingScrollPosition = this.mPendingSavedState.LIZ;
        }
        ensureLayoutState();
        this.mLayoutState.LIZ = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (this.mAnchorInfo.mValid && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.LIZ(focusedChild) >= this.mOrientationHelper.LIZJ() || this.mOrientationHelper.LIZIZ(focusedChild) <= this.mOrientationHelper.LIZIZ())) {
                this.mAnchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            }
        } else {
            this.mAnchorInfo.reset();
            AnchorInfo anchorInfo = this.mAnchorInfo;
            anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, anchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        C147114fDo c147114fDo = this.mLayoutState;
        if (c147114fDo.LJIIIZ >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        c147114fDo.LJFF = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.LIZIZ();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.LJFF();
        if (state.isPreLayout() && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                i7 = this.mOrientationHelper.LIZJ() - this.mOrientationHelper.LIZIZ(findViewByPosition);
                LIZ = this.mPendingScrollPositionOffset;
            } else {
                LIZ = this.mOrientationHelper.LIZ(findViewByPosition) - this.mOrientationHelper.LIZIZ();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i9 = i7 - LIZ;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        if (!this.mAnchorInfo.mLayoutFromEnd ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(recycler, state, this.mAnchorInfo, i8);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.LJIIJJI = resolveIsInfinite();
        state.isPreLayout();
        this.mLayoutState.LJIIIIZZ = 0;
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C147114fDo c147114fDo2 = this.mLayoutState;
            c147114fDo2.LJII = max;
            fill(recycler, c147114fDo2, state, false);
            i3 = this.mLayoutState.LIZIZ;
            int i10 = this.mLayoutState.LIZLLL;
            if (this.mLayoutState.LIZJ > 0) {
                max2 += this.mLayoutState.LIZJ;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C147114fDo c147114fDo3 = this.mLayoutState;
            c147114fDo3.LJII = max2;
            c147114fDo3.LIZLLL += this.mLayoutState.f19641LJ;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.LIZIZ;
            if (this.mLayoutState.LIZJ > 0) {
                int i11 = this.mLayoutState.LIZJ;
                updateLayoutStateToFillStart(i10, i3);
                C147114fDo c147114fDo4 = this.mLayoutState;
                c147114fDo4.LJII = i11;
                fill(recycler, c147114fDo4, state, false);
                i3 = this.mLayoutState.LIZIZ;
            }
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C147114fDo c147114fDo5 = this.mLayoutState;
            c147114fDo5.LJII = max2;
            fill(recycler, c147114fDo5, state, false);
            i2 = this.mLayoutState.LIZIZ;
            int i12 = this.mLayoutState.LIZLLL;
            if (this.mLayoutState.LIZJ > 0) {
                max += this.mLayoutState.LIZJ;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C147114fDo c147114fDo6 = this.mLayoutState;
            c147114fDo6.LJII = max;
            c147114fDo6.LIZLLL += this.mLayoutState.f19641LJ;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.LIZIZ;
            if (this.mLayoutState.LIZJ > 0) {
                int i13 = this.mLayoutState.LIZJ;
                updateLayoutStateToFillEnd(i12, i2);
                C147114fDo c147114fDo7 = this.mLayoutState;
                c147114fDo7.LJII = i13;
                fill(recycler, c147114fDo7, state, false);
                i2 = this.mLayoutState.LIZIZ;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i2, recycler, state, true);
                i4 = i3 + fixLayoutEndGap2;
                i5 = i2 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i4, recycler, state, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i3, recycler, state, true);
                i4 = i3 + fixLayoutStartGap;
                i5 = i2 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i5, recycler, state, false);
            }
            i3 = i4 + fixLayoutEndGap;
            i2 = i5 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            AbstractC147106fDg abstractC147106fDg = this.mOrientationHelper;
            abstractC147106fDg.LIZIZ = abstractC147106fDg.mo21355LJ();
        } else {
            this.mAnchorInfo.reset();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    /* renamed from: androidx_recyclerview_widget_LinearLayoutManager__scrollHorizontallyBy$___twin___ */
    public int m21119xd934c87f(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    /* renamed from: androidx_recyclerview_widget_LinearLayoutManager__scrollVerticallyBy$___twin___ */
    public int m21118x173125ad(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, recycler);
            }
            return;
        }
        while (i > i2) {
            removeAndRecycleViewAt(i, recycler);
            i--;
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        int i;
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(recycler, state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        if (this.mStackFromEnd) {
            i = state.getItemCount() - 1;
        } else {
            i = 0;
        }
        anchorInfo.mPosition = i;
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, C147114fDo c147114fDo, AbstractC147109fDj abstractC147109fDj) {
        int i = c147114fDo.LIZLLL;
        if (i >= 0 && i < state.getItemCount()) {
            abstractC147109fDj.LIZ(i, Math.max(0, c147114fDo.LJI));
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new C147115fDp();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.LIZ = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, state);
        int fill = this.mLayoutState.LJI + fill(recycler, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.LIZ(-i);
        this.mLayoutState.LJIIIZ = i;
        return i;
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int LIZLLL = (this.mOrientationHelper.LIZLLL() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.LIZ(childAt) < LIZLLL || this.mOrientationHelper.LIZLLL(childAt) < LIZLLL) {
                    recycleChildren(recycler, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.LIZ(childAt2) < LIZLLL || this.mOrientationHelper.LIZLLL(childAt2) < LIZLLL) {
                recycleChildren(recycler, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                if (this.mOrientationHelper.LIZIZ(childAt) > i3 || this.mOrientationHelper.LIZJ(childAt) > i3) {
                    recycleChildren(recycler, i4, i5);
                    return;
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.LIZIZ(childAt2) > i3 || this.mOrientationHelper.LIZJ(childAt2) > i3) {
                recycleChildren(recycler, 0, i6);
                return;
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        View findReferenceChildClosestToStart;
        int LIZIZ;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.isViewValidAsAnchor(focusedChild, state)) {
            anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        } else {
            if (anchorInfo.mLayoutFromEnd) {
                findReferenceChildClosestToStart = findReferenceChildClosestToEnd(recycler, state);
            } else {
                findReferenceChildClosestToStart = findReferenceChildClosestToStart(recycler, state);
            }
            if (findReferenceChildClosestToStart == null) {
                return false;
            }
            anchorInfo.assignFromView(findReferenceChildClosestToStart, getPosition(findReferenceChildClosestToStart));
            if (!state.isPreLayout() && supportsPredictiveItemAnimations() && (this.mOrientationHelper.LIZ(findReferenceChildClosestToStart) >= this.mOrientationHelper.LIZJ() || this.mOrientationHelper.LIZIZ(findReferenceChildClosestToStart) < this.mOrientationHelper.LIZIZ())) {
                if (anchorInfo.mLayoutFromEnd) {
                    LIZIZ = this.mOrientationHelper.LIZJ();
                } else {
                    LIZIZ = this.mOrientationHelper.LIZIZ();
                }
                anchorInfo.mCoordinate = LIZIZ;
            }
            return true;
        }
    }

    /* renamed from: androidx_recyclerview_widget_LinearLayoutManager_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_scrollHorizontallyBy */
    public static int m21117x8999ee91(LinearLayoutManager linearLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return linearLayoutManager.m21119xd934c87f(i, recycler, state);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    /* renamed from: androidx_recyclerview_widget_LinearLayoutManager_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_scrollVerticallyBy */
    public static int m21116x15902723(LinearLayoutManager linearLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return linearLayoutManager.m21118x173125ad(i, recycler, state);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int LIZJ;
        int LIZJ2 = this.mOrientationHelper.LIZJ() - i;
        if (LIZJ2 > 0) {
            int i2 = -scrollBy(-LIZJ2, recycler, state);
            int i3 = i + i2;
            if (z && (LIZJ = this.mOrientationHelper.LIZJ() - i3) > 0) {
                this.mOrientationHelper.LIZ(LIZJ);
                return LIZJ + i2;
            }
            return i2;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int LIZIZ;
        int LIZIZ2 = i - this.mOrientationHelper.LIZIZ();
        if (LIZIZ2 > 0) {
            int i2 = -scrollBy(LIZIZ2, recycler, state);
            int i3 = i + i2;
            if (z && (LIZIZ = i3 - this.mOrientationHelper.LIZIZ()) > 0) {
                this.mOrientationHelper.LIZ(-LIZIZ);
                return i2 - LIZIZ;
            }
            return i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, AbstractC147109fDj abstractC147109fDj) {
        int i3;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            updateLayoutState(i3, Math.abs(i), true, state);
            collectPrefetchPositionsForLayoutState(state, this.mLayoutState, abstractC147109fDj);
        }
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        int i3;
        ensureLayoutState();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.LIZ(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.LIZ(i, i2, i3, i4);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new C147115fDp();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.C0379b properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.LIZ);
        setReverseLayout(properties.LIZJ);
        setStackFromEnd(properties.LIZLLL);
    }

    public int fill(RecyclerView.Recycler recycler, C147114fDo c147114fDo, RecyclerView.State state, boolean z) {
        int i = c147114fDo.LIZJ;
        if (c147114fDo.LJI != Integer.MIN_VALUE) {
            if (c147114fDo.LIZJ < 0) {
                c147114fDo.LJI += c147114fDo.LIZJ;
            }
            recycleByLayoutState(recycler, c147114fDo);
        }
        int i2 = c147114fDo.LIZJ + c147114fDo.LJII;
        C147115fDp c147115fDp = this.mLayoutChunkResult;
        while (true) {
            if ((!c147114fDo.LJIIJJI && i2 <= 0) || !c147114fDo.LIZ(state)) {
                break;
            }
            c147115fDp.LIZ = 0;
            c147115fDp.LIZIZ = false;
            c147115fDp.LIZJ = false;
            c147115fDp.LIZLLL = false;
            layoutChunk(recycler, state, c147114fDo, c147115fDp);
            if (c147115fDp.LIZIZ) {
                break;
            }
            c147114fDo.LIZIZ += c147115fDp.LIZ * c147114fDo.LJFF;
            if (!c147115fDp.LIZJ || c147114fDo.LJIIJ != null || !state.isPreLayout()) {
                c147114fDo.LIZJ -= c147115fDp.LIZ;
                i2 -= c147115fDp.LIZ;
            }
            if (c147114fDo.LJI != Integer.MIN_VALUE) {
                c147114fDo.LJI += c147115fDp.LIZ;
                if (c147114fDo.LIZJ < 0) {
                    c147114fDo.LJI += c147114fDo.LIZJ;
                }
                recycleByLayoutState(recycler, c147114fDo);
            }
            if (z && c147115fDp.LIZLLL) {
                break;
            }
        }
        return i - c147114fDo.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r6, int r7, androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9) {
        /*
            r5 = this;
            r5.resolveShouldLayoutReverse()
            int r0 = r5.getChildCount()
            r4 = 0
            if (r0 != 0) goto Lb
            return r4
        Lb:
            int r3 = r5.convertFocusDirectionToLayoutDirection(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r2) goto L14
            return r4
        L14:
            r5.ensureLayoutState()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.fDg r0 = r5.mOrientationHelper
            int r0 = r0.mo21355LJ()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            r0 = 0
            r5.updateLayoutState(r3, r1, r0, r9)
            X.fDo r1 = r5.mLayoutState
            r1.LJI = r2
            r1.LIZ = r0
            r0 = 1
            r5.fill(r8, r1, r9, r0)
            r0 = -1
            if (r3 != r0) goto L45
            android.view.View r2 = r5.findPartiallyOrCompletelyInvisibleChildClosestToStart()
        L38:
            android.view.View r1 = r5.getChildClosestToStart()
        L3c:
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L51
            if (r2 != 0) goto L50
            return r4
        L45:
            android.view.View r2 = r5.findPartiallyOrCompletelyInvisibleChildClosestToEnd()
            if (r3 == r0) goto L38
            android.view.View r1 = r5.getChildClosestToEnd()
            goto L3c
        L50:
            return r1
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // p003X.AbstractC147157fEV
    public void prepareForDrop(View view, View view2, int i, int i2) {
        char c;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.LIZJ() - (this.mOrientationHelper.LIZ(view2) + this.mOrientationHelper.mo21354LJ(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.LIZJ() - this.mOrientationHelper.LIZIZ(view2));
            }
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.LIZ(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.LIZIZ(view2) - this.mOrientationHelper.mo21354LJ(view));
        }
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        boolean z;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i5);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < position) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.mShouldReverseLayout) {
                        i3 += this.mOrientationHelper.mo21354LJ(viewHolder.itemView);
                    } else {
                        i4 += this.mOrientationHelper.mo21354LJ(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.LJIIJ = scrapList;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                C147114fDo c147114fDo = this.mLayoutState;
                c147114fDo.LJII = i3;
                c147114fDo.LIZJ = 0;
                c147114fDo.LIZ();
                fill(recycler, this.mLayoutState, state, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                C147114fDo c147114fDo2 = this.mLayoutState;
                c147114fDo2.LJII = i4;
                c147114fDo2.LIZJ = 0;
                c147114fDo2.LIZ();
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.LJIIJ = null;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        int LIZIZ;
        this.mLayoutState.LJIIJJI = resolveIsInfinite();
        this.mLayoutState.LJFF = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        C147114fDo c147114fDo = this.mLayoutState;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c147114fDo.LJII = i3;
        C147114fDo c147114fDo2 = this.mLayoutState;
        if (!z2) {
            max = max2;
        }
        c147114fDo2.LJIIIIZZ = max;
        int i4 = -1;
        if (z2) {
            this.mLayoutState.LJII += this.mOrientationHelper.LJFF();
            View childClosestToEnd = getChildClosestToEnd();
            C147114fDo c147114fDo3 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i4 = 1;
            }
            c147114fDo3.f19641LJ = i4;
            this.mLayoutState.LIZLLL = getPosition(childClosestToEnd) + this.mLayoutState.f19641LJ;
            this.mLayoutState.LIZIZ = this.mOrientationHelper.LIZIZ(childClosestToEnd);
            LIZIZ = this.mOrientationHelper.LIZIZ(childClosestToEnd) - this.mOrientationHelper.LIZJ();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.LJII += this.mOrientationHelper.LIZIZ();
            C147114fDo c147114fDo4 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i4 = 1;
            }
            c147114fDo4.f19641LJ = i4;
            this.mLayoutState.LIZLLL = getPosition(childClosestToStart) + this.mLayoutState.f19641LJ;
            this.mLayoutState.LIZIZ = this.mOrientationHelper.LIZ(childClosestToStart);
            LIZIZ = (-this.mOrientationHelper.LIZ(childClosestToStart)) + this.mOrientationHelper.LIZIZ();
        }
        C147114fDo c147114fDo5 = this.mLayoutState;
        c147114fDo5.LIZJ = i2;
        if (z) {
            c147114fDo5.LIZJ -= LIZIZ;
        }
        this.mLayoutState.LJI = LIZIZ;
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, C147114fDo c147114fDo, C147115fDp c147115fDp) {
        boolean z;
        int paddingTop;
        int LJFF;
        int i;
        int i2;
        boolean z2;
        View LIZ = c147114fDo.LIZ(recycler);
        if (LIZ == null) {
            c147115fDp.LIZIZ = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) LIZ.getLayoutParams();
        if (c147114fDo.LJIIJ == null) {
            boolean z3 = this.mShouldReverseLayout;
            if (c147114fDo.LJFF == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(LIZ);
            } else {
                addView(LIZ, 0);
            }
        } else {
            boolean z4 = this.mShouldReverseLayout;
            if (c147114fDo.LJFF == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(LIZ);
            } else {
                addDisappearingView(LIZ, 0);
            }
        }
        measureChildWithMargins(LIZ, 0, 0);
        c147115fDp.LIZ = this.mOrientationHelper.mo21354LJ(LIZ);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i2 = getWidth() - getPaddingRight();
                i = i2 - this.mOrientationHelper.LJFF(LIZ);
            } else {
                i = getPaddingLeft();
                i2 = this.mOrientationHelper.LJFF(LIZ) + i;
            }
            if (c147114fDo.LJFF == -1) {
                LJFF = c147114fDo.LIZIZ;
                paddingTop = c147114fDo.LIZIZ - c147115fDp.LIZ;
            } else {
                paddingTop = c147114fDo.LIZIZ;
                LJFF = c147114fDo.LIZIZ + c147115fDp.LIZ;
            }
        } else {
            paddingTop = getPaddingTop();
            LJFF = this.mOrientationHelper.LJFF(LIZ) + paddingTop;
            if (c147114fDo.LJFF == -1) {
                i2 = c147114fDo.LIZIZ;
                i = c147114fDo.LIZIZ - c147115fDp.LIZ;
            } else {
                i = c147114fDo.LIZIZ;
                i2 = c147114fDo.LIZIZ + c147115fDp.LIZ;
            }
        }
        layoutDecoratedWithMargins(LIZ, i, paddingTop, i2, LJFF);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            c147115fDp.LIZJ = true;
        }
        c147115fDp.LIZLLL = LIZ.hasFocusable();
    }

    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3) {
        int i4;
        ensureLayoutState();
        int LIZIZ = this.mOrientationHelper.LIZIZ();
        int LIZJ = this.mOrientationHelper.LIZJ();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.LIZ(childAt) < LIZJ && this.mOrientationHelper.LIZIZ(childAt) >= LIZIZ) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }
}
