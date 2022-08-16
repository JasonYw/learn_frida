package com.alibaba.android.vlayout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx;
import com.alibaba.android.vlayout.extend.LayoutManagerCanScrollListener;
import com.alibaba.android.vlayout.extend.PerformanceMonitor;
import com.alibaba.android.vlayout.extend.ViewLifeCycleHelper;
import com.alibaba.android.vlayout.extend.ViewLifeCycleListener;
import com.alibaba.android.vlayout.layout.BaseLayoutHelper;
import com.alibaba.android.vlayout.layout.DefaultLayoutHelper;
import com.alibaba.android.vlayout.layout.FixAreaAdjuster;
import com.alibaba.android.vlayout.layout.FixAreaLayoutHelper;
import com.alibaba.android.vlayout.layout.LayoutChunkResult;
import com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes20.dex */
public class VirtualLayoutManager extends ExposeLinearLayoutManagerEx implements LayoutManagerHelper {
    public static LayoutHelper DEFAULT_LAYOUT_HELPER = new DefaultLayoutHelper();
    public static boolean sDebuggable;
    public LayoutManagerCanScrollListener layoutManagerCanScrollListener;
    public boolean mCanScrollHorizontally;
    public boolean mCanScrollVertically;
    public Rect mDecorInsets;
    public LayoutHelper mDefaultLayoutHelper;
    public boolean mEnableMarginOverlapping;
    public FixAreaAdjuster mFixAreaAdjustor;
    public LayoutHelperFinder mHelperFinder;
    public BaseLayoutHelper.LayoutViewBindListener mLayoutViewBindListener;
    public LayoutViewFactory mLayoutViewFatory;
    public int mMaxMeasureSize;
    public int mMeasuredFullSpace;
    public int mNested;
    public boolean mNestedScrolling;
    public boolean mNoScrolling;
    public OrientationHelperEx mOrientationHelper;
    public PerformanceMonitor mPerformanceMonitor;
    public Comparator<Pair<Range<Integer>, Integer>> mRangeComparator;
    public List<Pair<Range<Integer>, Integer>> mRangeLengths;
    public RecyclerView mRecyclerView;
    public OrientationHelperEx mSecondaryOrientationHelper;
    public boolean mSpaceMeasured;
    public boolean mSpaceMeasuring;
    public AnchorInfoWrapper mTempAnchorInfoWrapper;
    public LayoutStateWrapper mTempLayoutStateWrapper;
    public ViewLifeCycleHelper mViewLifeCycleHelper;
    public HashMap<Integer, LayoutHelper> newHelpersSet;
    public HashMap<Integer, LayoutHelper> oldHelpersSet;

    /* loaded from: classes20.dex */
    public static class AnchorInfoWrapper {
        public int coordinate;
        public boolean layoutFromEnd;
        public int position;

        static {
            Covode.recordClassIndex(4361);
        }
    }

    /* loaded from: classes20.dex */
    public interface CacheViewHolder {
        static {
            Covode.recordClassIndex(4362);
        }

        boolean needCached();
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    /* loaded from: classes20.dex */
    public static class LayoutStateWrapper {
        public ExposeLinearLayoutManagerEx.LayoutState mLayoutState;

        static {
            Covode.recordClassIndex(4365);
        }

        public LayoutStateWrapper() {
        }

        public int getAvailable() {
            return this.mLayoutState.mAvailable;
        }

        public int getCurrentPosition() {
            return this.mLayoutState.mCurrentPosition;
        }

        public int getExtra() {
            return this.mLayoutState.mExtra;
        }

        public int getItemDirection() {
            return this.mLayoutState.mItemDirection;
        }

        public int getLayoutDirection() {
            return this.mLayoutState.mLayoutDirection;
        }

        public int getOffset() {
            return this.mLayoutState.mOffset;
        }

        public int getScrollingOffset() {
            return this.mLayoutState.mScrollingOffset;
        }

        public boolean isPreLayout() {
            return this.mLayoutState.mIsPreLayout;
        }

        public boolean isRecycle() {
            return this.mLayoutState.mRecycle;
        }

        public boolean isRefreshLayout() {
            return this.mLayoutState.mOnRefresLayout;
        }

        public boolean hasScrapList() {
            if (this.mLayoutState.mScrapList != null) {
                return true;
            }
            return false;
        }

        public void skipCurrentPosition() {
            this.mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
        }

        public LayoutStateWrapper(ExposeLinearLayoutManagerEx.LayoutState layoutState) {
            this.mLayoutState = layoutState;
        }

        public boolean hasMore(RecyclerView.State state) {
            return this.mLayoutState.hasMore(state);
        }

        public View next(RecyclerView.Recycler recycler) {
            return this.mLayoutState.next(recycler);
        }

        public View retrieve(RecyclerView.Recycler recycler, int i) {
            int i2 = this.mLayoutState.mCurrentPosition;
            this.mLayoutState.mCurrentPosition = i;
            View next = next(recycler);
            this.mLayoutState.mCurrentPosition = i2;
            return next;
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public OrientationHelperEx getMainOrientationHelper() {
        return this.mOrientationHelper;
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public OrientationHelperEx getSecondaryOrientationHelper() {
        return this.mSecondaryOrientationHelper;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, com.alibaba.android.vlayout.LayoutManagerHelper
    public boolean isEnableMarginOverLap() {
        return this.mEnableMarginOverlapping;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public int getContentHeight() {
        return super.getHeight();
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public int getContentWidth() {
        return super.getWidth();
    }

    public List<LayoutHelper> getLayoutHelpers() {
        return this.mHelperFinder.getLayoutHelpers();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.alibaba.android.vlayout.LayoutManagerHelper
    public int getOrientation() {
        return super.getOrientation();
    }

    public int getVirtualLayoutDirection() {
        return ((ExposeLinearLayoutManagerEx) this).mLayoutState.mLayoutDirection;
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public boolean isDoLayoutRTL() {
        return isLayoutRTL();
    }

    /* loaded from: classes20.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int zIndex;
        public float mAspectRatio = Float.NaN;
        public int mOriginWidth = Integer.MIN_VALUE;
        public int mOriginHeight = Integer.MIN_VALUE;

        static {
            Covode.recordClassIndex(4364);
        }

        public void restoreOriginHeight() {
            int i = this.mOriginHeight;
            if (i != Integer.MIN_VALUE) {
                this.height = i;
            }
        }

        public void restoreOriginWidth() {
            int i = this.mOriginWidth;
            if (i != Integer.MIN_VALUE) {
                this.width = i;
            }
        }

        public void storeOriginHeight() {
            if (this.mOriginHeight == Integer.MIN_VALUE) {
                this.mOriginHeight = this.height;
            }
        }

        public void storeOriginWidth() {
            if (this.mOriginWidth == Integer.MIN_VALUE) {
                this.mOriginWidth = this.width;
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        Covode.recordClassIndex(4357);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        boolean z;
        LayoutManagerCanScrollListener layoutManagerCanScrollListener = this.layoutManagerCanScrollListener;
        if (layoutManagerCanScrollListener != null) {
            z = layoutManagerCanScrollListener.canScrollHorizontally();
        } else {
            z = true;
        }
        if (this.mCanScrollHorizontally && !this.mNoScrolling && z) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        boolean z;
        LayoutManagerCanScrollListener layoutManagerCanScrollListener = this.layoutManagerCanScrollListener;
        if (layoutManagerCanScrollListener != null) {
            z = layoutManagerCanScrollListener.canScrollVertically();
        } else {
            z = true;
        }
        if (this.mCanScrollVertically && !this.mNoScrolling && z) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public final View generateLayoutView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return null;
        }
        View generateLayoutView = this.mLayoutViewFatory.generateLayoutView(recyclerView.getContext());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ExposeLinearLayoutManagerEx.attachViewHolder(layoutParams, new LayoutViewHolder(generateLayoutView));
        generateLayoutView.setLayoutParams(layoutParams);
        return generateLayoutView;
    }

    public List<View> getFixedViews() {
        if (this.mRecyclerView == null) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            View fixedView = layoutHelper.getFixedView();
            if (fixedView != null) {
                linkedList.add(fixedView);
            }
        }
        return linkedList;
    }

    public void runAdjustLayout() {
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        LayoutHelper layoutHelper = this.mHelperFinder.getLayoutHelper(findFirstVisibleItemPosition);
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        LayoutHelper layoutHelper2 = this.mHelperFinder.getLayoutHelper(findLastVisibleItemPosition);
        List<LayoutHelper> layoutHelpers = this.mHelperFinder.getLayoutHelpers();
        int indexOf = layoutHelpers.indexOf(layoutHelper2);
        for (int indexOf2 = layoutHelpers.indexOf(layoutHelper); indexOf2 <= indexOf; indexOf2++) {
            try {
                layoutHelpers.get(indexOf2).adjustLayout(findFirstVisibleItemPosition, findLastVisibleItemPosition, this);
            } catch (Exception e) {
                if (sDebuggable) {
                    throw e;
                }
            }
        }
    }

    public int getOffsetToStart() {
        int i = -1;
        if (getChildCount() == 0) {
            return -1;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return -1;
        }
        int position = getPosition(childAt);
        int findRangeLength = findRangeLength(Range.create(Integer.valueOf(position), Integer.valueOf(position)));
        if (findRangeLength >= 0 && findRangeLength < this.mRangeLengths.size()) {
            i = -this.mOrientationHelper.getDecoratedStart(childAt);
            for (int i2 = 0; i2 < findRangeLength; i2++) {
                Pair<Range<Integer>, Integer> pair = this.mRangeLengths.get(i2);
                if (pair != null) {
                    i += ((Integer) pair.second).intValue();
                }
            }
        }
        return i;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public void validateChildOrderExpose() {
        if (getChildCount() <= 0) {
            return;
        }
        boolean z = false;
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayoutExpose) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                if (skipValidateOrder(position2)) {
                    return;
                }
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    if (decoratedStart2 < decoratedStart) {
                        z = true;
                    }
                    sb.append(z);
                    throw new RuntimeException(sb.toString());
                } else if (skipValidateOrder(position2)) {
                    return;
                } else {
                    if (decoratedStart2 > decoratedStart) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            if (skipValidateOrder(position3)) {
                return;
            }
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                if (decoratedStart3 < decoratedStart) {
                    z = true;
                }
                sb2.append(z);
                throw new RuntimeException(sb2.toString());
            } else if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    /* loaded from: classes20.dex */
    public static class LayoutViewHolder extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4366);
        }

        public LayoutViewHolder(View view) {
            super(view);
        }
    }

    public static void enableDebugging(boolean z) {
        sDebuggable = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, com.alibaba.android.vlayout.LayoutManagerHelper
    public void hideView(View view) {
        super.hideView(view);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void removeChildView(View view) {
        removeView(view);
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
    }

    public void setCanScrollHorizontally(boolean z) {
        this.mCanScrollHorizontally = z;
    }

    public void setCanScrollVertically(boolean z) {
        this.mCanScrollVertically = z;
    }

    public void setEnableMarginOverlapping(boolean z) {
        this.mEnableMarginOverlapping = z;
    }

    public void setLayoutManagerCanScrollListener(LayoutManagerCanScrollListener layoutManagerCanScrollListener) {
        this.layoutManagerCanScrollListener = layoutManagerCanScrollListener;
    }

    public void setPerformanceMonitor(PerformanceMonitor performanceMonitor) {
        this.mPerformanceMonitor = performanceMonitor;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, com.alibaba.android.vlayout.LayoutManagerHelper
    public void showView(View view) {
        super.showView(view);
    }

    public VirtualLayoutManager(Context context) {
        this(context, 1);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void addFixedView(View view) {
        addOffFlowView(view, false);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public LayoutHelper findLayoutHelperByPosition(int i) {
        return this.mHelperFinder.getLayoutHelper(i);
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    public void setNestedScrolling(boolean z) {
        setNestedScrolling(z, -1);
    }

    private void setDefaultLayoutHelper(LayoutHelper layoutHelper) {
        if (layoutHelper != null) {
            this.mDefaultLayoutHelper = layoutHelper;
            return;
        }
        throw new IllegalArgumentException("layoutHelper should not be null");
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public RecyclerView.ViewHolder getChildViewHolder(View view) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getChildViewHolder(view);
        }
        return null;
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public boolean isViewHolderUpdated(View view) {
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(view);
        if (childViewHolder != null && !ExposeLinearLayoutManagerEx.isViewHolderUpdated(childViewHolder)) {
            return false;
        }
        return true;
    }

    public void setLayoutViewFactory(LayoutViewFactory layoutViewFactory) {
        if (layoutViewFactory != null) {
            this.mLayoutViewFatory = layoutViewFactory;
            return;
        }
        throw new IllegalArgumentException("factory should not be null");
    }

    public void setNoScrolling(boolean z) {
        this.mNoScrolling = z;
        this.mSpaceMeasured = false;
        this.mMeasuredFullSpace = 0;
        this.mSpaceMeasuring = false;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        this.mOrientationHelper = OrientationHelperEx.createOrientationHelper(this, i);
        super.setOrientation(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setReverseLayout(boolean z) {
        if (!z) {
            super.setReverseLayout(false);
            return;
        }
        throw new UnsupportedOperationException("VirtualLayoutManager does not support reverse layout in current version.");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("VirtualLayoutManager does not support stack from end.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            layoutHelper.onOffsetChildrenHorizontal(i, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            layoutHelper.onItemsChanged(this);
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void recycleView(View view) {
        ViewParent parent;
        RecyclerView recyclerView;
        if (this.mRecyclerView != null && (parent = view.getParent()) != null && parent == (recyclerView = this.mRecyclerView)) {
            this.mRecyclerView.getRecycledViewPool().putRecycledView(recyclerView.getChildViewHolder(view));
        }
    }

    public void setViewLifeCycleListener(ViewLifeCycleListener viewLifeCycleListener) {
        if (viewLifeCycleListener != null) {
            this.mViewLifeCycleHelper = new ViewLifeCycleHelper(this, viewLifeCycleListener);
            return;
        }
        throw new IllegalArgumentException("ViewLifeCycleListener should not be null!");
    }

    public boolean skipValidateOrder(int i) {
        LayoutHelper layoutHelper;
        LayoutHelperFinder layoutHelperFinder = this.mHelperFinder;
        if (layoutHelperFinder == null) {
            layoutHelper = null;
        } else {
            layoutHelper = layoutHelperFinder.getLayoutHelper(i);
        }
        if (layoutHelper instanceof StaggeredGridLayoutHelper) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapAttachedViews(RecyclerView.Recycler recycler) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            RecyclerView.ViewHolder childViewHolder = getChildViewHolder(getChildAt(childCount));
            if ((childViewHolder instanceof CacheViewHolder) && ((CacheViewHolder) childViewHolder).needCached()) {
                ExposeLinearLayoutManagerEx.ViewHolderWrapper.setFlags(childViewHolder, 0, 6);
            }
        }
        super.detachAndScrapAttachedViews(recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        View findViewByPosition = super.findViewByPosition(i);
        if (findViewByPosition != null && getPosition(findViewByPosition) == i) {
            return findViewByPosition;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            layoutHelper.onOffsetChildrenVertical(i, this);
        }
        ViewLifeCycleHelper viewLifeCycleHelper = this.mViewLifeCycleHelper;
        if (viewLifeCycleHelper != null) {
            viewLifeCycleHelper.checkViewStatusInScreen();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            layoutHelper.onScrollStateChanged(i, findFirstVisibleItemPosition, findLastVisibleItemPosition, this);
        }
    }

    public void setHelperFinder(LayoutHelperFinder layoutHelperFinder) {
        if (layoutHelperFinder != null) {
            LinkedList linkedList = new LinkedList();
            LayoutHelperFinder layoutHelperFinder2 = this.mHelperFinder;
            if (layoutHelperFinder2 != null) {
                for (LayoutHelper layoutHelper : layoutHelperFinder2.getLayoutHelpers()) {
                    linkedList.add(layoutHelper);
                }
            }
            this.mHelperFinder = layoutHelperFinder;
            if (linkedList.size() > 0) {
                this.mHelperFinder.setLayouts(linkedList);
            }
            this.mSpaceMeasured = false;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("finder is null");
    }

    private int findRangeLength(Range<Integer> range) {
        int size = this.mRangeLengths.size();
        if (size == 0) {
            return -1;
        }
        int i = 0;
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) / 2;
            Range<Integer> range2 = (Range) this.mRangeLengths.get(i3).first;
            if (range2 == null) {
                break;
            } else if (!range2.contains((Range<Integer>) range.getLower()) && !range2.contains((Range<Integer>) range.getUpper()) && !range.contains(range2)) {
                if (range2.getLower().intValue() > range.getUpper().intValue()) {
                    i2 = i3 - 1;
                } else if (range2.getUpper().intValue() < range.getLower().intValue()) {
                    i = i3 + 1;
                }
            } else {
                return i3;
            }
        }
        return -1;
    }

    public void setLayoutHelpers(List<LayoutHelper> list) {
        BaseLayoutHelper.LayoutViewBindListener layoutViewBindListener;
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            this.oldHelpersSet.put(Integer.valueOf(System.identityHashCode(layoutHelper)), layoutHelper);
        }
        if (list != null) {
            int i = 0;
            for (LayoutHelper layoutHelper2 : list) {
                if (layoutHelper2 instanceof FixAreaLayoutHelper) {
                    ((FixAreaLayoutHelper) layoutHelper2).setAdjuster(this.mFixAreaAdjustor);
                }
                if ((layoutHelper2 instanceof BaseLayoutHelper) && (layoutViewBindListener = this.mLayoutViewBindListener) != null) {
                    ((BaseLayoutHelper) layoutHelper2).setLayoutViewBindListener(layoutViewBindListener);
                }
                if (layoutHelper2.getItemCount() > 0) {
                    layoutHelper2.setRange(i, (layoutHelper2.getItemCount() + i) - 1);
                } else {
                    layoutHelper2.setRange(-1, -1);
                }
                i += layoutHelper2.getItemCount();
            }
        }
        this.mHelperFinder.setLayouts(list);
        for (LayoutHelper layoutHelper3 : this.mHelperFinder.getLayoutHelpers()) {
            this.newHelpersSet.put(Integer.valueOf(System.identityHashCode(layoutHelper3)), layoutHelper3);
        }
        Iterator<Map.Entry<Integer, LayoutHelper>> it = this.oldHelpersSet.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            if (this.newHelpersSet.containsKey(key)) {
                this.newHelpersSet.remove(key);
                it.remove();
            }
        }
        for (LayoutHelper layoutHelper4 : this.oldHelpersSet.values()) {
            layoutHelper4.clear(this);
        }
        if (!this.oldHelpersSet.isEmpty() || !this.newHelpersSet.isEmpty()) {
            this.mSpaceMeasured = false;
        }
        this.oldHelpersSet.clear();
        this.newHelpersSet.clear();
        requestLayout();
    }

    /* loaded from: classes20.dex */
    public static class InflateLayoutParams extends LayoutParams {
        static {
            Covode.recordClassIndex(4363);
        }

        public InflateLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void addChildView(View view, int i) {
        super.addView(view, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapView(View view, RecyclerView.Recycler recycler) {
        super.detachAndScrapView(view, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void moveView(int i, int i2) {
        super.moveView(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        super.onAdapterChanged(adapter, adapter2);
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void addOffFlowView(View view, boolean z) {
        showView(view);
        addHiddenView(view, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new InflateLayoutParams(context, attributeSet);
    }

    public int obtainExtraMargin(View view, boolean z) {
        return obtainExtraMargin(view, z, true);
    }

    public VirtualLayoutManager(Context context, int i) {
        this(context, i, false);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void addBackgroundView(View view, boolean z) {
        int i;
        showView(view);
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        addView(view, i);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void addChildView(LayoutStateWrapper layoutStateWrapper, View view) {
        int i;
        if (layoutStateWrapper.getItemDirection() == 1) {
            i = -1;
        } else {
            i = 0;
        }
        addChildView(layoutStateWrapper, view, i);
    }

    public void setNestedScrolling(boolean z, int i) {
        this.mNestedScrolling = z;
        this.mSpaceMeasured = false;
        this.mSpaceMeasuring = false;
        this.mMeasuredFullSpace = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachAndScrapViewAt(int i, RecyclerView.Recycler recycler) {
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(getChildAt(i));
        if ((childViewHolder instanceof CacheViewHolder) && ((CacheViewHolder) childViewHolder).needCached()) {
            ExposeLinearLayoutManagerEx.ViewHolderWrapper.setFlags(childViewHolder, 0, 4);
        }
        super.detachAndScrapViewAt(i, recycler);
    }

    private void runPreLayout(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mNested == 0) {
            for (LayoutHelper layoutHelper : this.mHelperFinder.reverse()) {
                layoutHelper.beforeLayout(recycler, state, this);
            }
        }
        this.mNested++;
    }

    public LayoutHelper findNeighbourNonfixLayoutHelper(LayoutHelper layoutHelper, boolean z) {
        List<LayoutHelper> layoutHelpers;
        int indexOf;
        int i;
        LayoutHelper layoutHelper2;
        if (layoutHelper == null || (indexOf = (layoutHelpers = this.mHelperFinder.getLayoutHelpers()).indexOf(layoutHelper)) == -1) {
            return null;
        }
        if (z) {
            i = indexOf - 1;
        } else {
            i = indexOf + 1;
        }
        if (i < 0 || i >= layoutHelpers.size() || (layoutHelper2 = layoutHelpers.get(i)) == null || layoutHelper2.isFixLayout()) {
            return null;
        }
        return layoutHelper2;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
            layoutHelper.clear(this);
        }
        this.mRecyclerView = null;
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public void onAnchorReady(RecyclerView.State state, ExposeLinearLayoutManagerEx.AnchorInfo anchorInfo) {
        super.onAnchorReady(state, anchorInfo);
        boolean z = true;
        do {
            this.mTempAnchorInfoWrapper.position = anchorInfo.mPosition;
            this.mTempAnchorInfoWrapper.coordinate = anchorInfo.mCoordinate;
            this.mTempAnchorInfoWrapper.layoutFromEnd = anchorInfo.mLayoutFromEnd;
            LayoutHelper layoutHelper = this.mHelperFinder.getLayoutHelper(anchorInfo.mPosition);
            if (layoutHelper != null) {
                layoutHelper.checkAnchorInfo(state, this.mTempAnchorInfoWrapper, this);
            }
            if (this.mTempAnchorInfoWrapper.position == anchorInfo.mPosition) {
                z = false;
            } else {
                anchorInfo.mPosition = this.mTempAnchorInfoWrapper.position;
            }
            anchorInfo.mCoordinate = this.mTempAnchorInfoWrapper.coordinate;
            this.mTempAnchorInfoWrapper.position = -1;
        } while (z);
        this.mTempAnchorInfoWrapper.position = anchorInfo.mPosition;
        this.mTempAnchorInfoWrapper.coordinate = anchorInfo.mCoordinate;
        for (LayoutHelper layoutHelper2 : this.mHelperFinder.getLayoutHelpers()) {
            layoutHelper2.onRefreshLayout(state, this.mTempAnchorInfoWrapper, this);
        }
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i = Build.VERSION.SDK_INT;
        Trace.beginSection("VLM onLayoutChildren");
        if (this.mNoScrolling && state.didStructureChange()) {
            this.mSpaceMeasured = false;
            this.mSpaceMeasuring = true;
        }
        runPreLayout(recycler, state);
        try {
            try {
                super.onLayoutChildren(recycler, state);
                runPostLayout(recycler, state, Integer.MAX_VALUE);
                if ((this.mNestedScrolling || this.mNoScrolling) && this.mSpaceMeasuring) {
                    this.mSpaceMeasured = true;
                    View childAt = getChildAt(getChildCount() - 1);
                    if (childAt != null) {
                        this.mMeasuredFullSpace = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin + computeAlignOffset(childAt, true, false);
                        RecyclerView recyclerView = this.mRecyclerView;
                        if (recyclerView != null && this.mNestedScrolling) {
                            ViewParent parent = recyclerView.getParent();
                            if (parent instanceof View) {
                                this.mMeasuredFullSpace = Math.min(this.mMeasuredFullSpace, ((View) parent).getMeasuredHeight());
                            }
                        }
                    } else {
                        this.mSpaceMeasuring = false;
                    }
                    this.mSpaceMeasuring = false;
                    if (this.mRecyclerView != null && getItemCount() > 0) {
                        this.mRecyclerView.post(new Runnable() { // from class: com.alibaba.android.vlayout.VirtualLayoutManager.2
                            static {
                                Covode.recordClassIndex(4359);
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (VirtualLayoutManager.this.mRecyclerView != null) {
                                    VirtualLayoutManager.this.mRecyclerView.requestLayout();
                                }
                            }
                        });
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                Trace.endSection();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        } catch (Throwable th) {
            runPostLayout(recycler, state, Integer.MAX_VALUE);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.alibaba.android.vlayout.LayoutManagerHelper
    public void measureChild(View view, int i, int i2) {
        measureChildWithDecorations(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.alibaba.android.vlayout.LayoutManagerHelper
    public void measureChildWithMargins(View view, int i, int i2) {
        measureChildWithDecorationsAndMargin(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public int getChildMeasureSpec(int i, int i2, boolean z) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(i, 0, i2, z);
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public int computeAlignOffset(View view, boolean z, boolean z2) {
        return computeAlignOffset(getPosition(view), z, z2);
    }

    public int obtainExtraMargin(View view, boolean z, boolean z2) {
        if (view != null) {
            return computeAlignOffset(view, z, z2);
        }
        return 0;
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void addChildView(LayoutStateWrapper layoutStateWrapper, View view, int i) {
        showView(view);
        if (!layoutStateWrapper.hasScrapList()) {
            addView(view, i);
        } else {
            addDisappearingView(view, i);
        }
    }

    private void measureChildWithDecorations(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.mDecorInsets);
        int updateSpecWithExtra = updateSpecWithExtra(i, this.mDecorInsets.left, this.mDecorInsets.right);
        int updateSpecWithExtra2 = updateSpecWithExtra(i2, this.mDecorInsets.top, this.mDecorInsets.bottom);
        PerformanceMonitor performanceMonitor = this.mPerformanceMonitor;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("measure", view);
        }
        view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        PerformanceMonitor performanceMonitor2 = this.mPerformanceMonitor;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("measure", view);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        if ((View.MeasureSpec.getSize(i) - i2) - i3 < 0) {
            return View.MeasureSpec.makeMeasureSpec(0, mode);
        }
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public int computeAlignOffset(int i, boolean z, boolean z2) {
        LayoutHelper layoutHelper;
        if (i != -1 && (layoutHelper = this.mHelperFinder.getLayoutHelper(i)) != null) {
            return layoutHelper.computeAlignOffset(i - layoutHelper.getRange().getLower().intValue(), z, z2, this);
        }
        return 0;
    }

    public VirtualLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.mMaxMeasureSize = -1;
        this.mRangeComparator = new Comparator<Pair<Range<Integer>, Integer>>() { // from class: com.alibaba.android.vlayout.VirtualLayoutManager.1
            static {
                Covode.recordClassIndex(4358);
            }

            @Override // java.util.Comparator
            public int compare(Pair<Range<Integer>, Integer> pair, Pair<Range<Integer>, Integer> pair2) {
                if (pair == null) {
                    if (pair2 == null) {
                        return 0;
                    }
                    return -1;
                } else if (pair2 == null) {
                    return 1;
                } else {
                    return ((Integer) ((Range) pair.first).getLower()).intValue() - ((Integer) ((Range) pair2.first).getLower()).intValue();
                }
            }
        };
        this.mFixAreaAdjustor = FixAreaAdjuster.mDefaultAdjuster;
        this.newHelpersSet = new HashMap<>();
        this.oldHelpersSet = new HashMap<>();
        this.mTempAnchorInfoWrapper = new AnchorInfoWrapper();
        int i2 = 0;
        this.mNested = 0;
        this.mTempLayoutStateWrapper = new LayoutStateWrapper();
        this.mRangeLengths = new ArrayList();
        this.mDefaultLayoutHelper = DEFAULT_LAYOUT_HELPER;
        this.mLayoutViewFatory = new LayoutViewFactory() { // from class: com.alibaba.android.vlayout.VirtualLayoutManager.3
            static {
                Covode.recordClassIndex(4360);
            }

            @Override // com.alibaba.android.vlayout.LayoutViewFactory
            public View generateLayoutView(Context context2) {
                return new LayoutView(context2);
            }
        };
        this.mDecorInsets = new Rect();
        this.mSpaceMeasured = false;
        this.mMeasuredFullSpace = 0;
        this.mSpaceMeasuring = false;
        this.mOrientationHelper = OrientationHelperEx.createOrientationHelper(this, i);
        this.mSecondaryOrientationHelper = OrientationHelperEx.createOrientationHelper(this, i != 1 ? 1 : i2);
        this.mCanScrollVertically = super.canScrollVertically();
        this.mCanScrollHorizontally = super.canScrollHorizontally();
        setHelperFinder(new RangeLayoutHelperFinder());
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.mDecorInsets);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (getOrientation() == 1) {
            i = updateSpecWithExtra(i, layoutParams.leftMargin + this.mDecorInsets.left, layoutParams.rightMargin + this.mDecorInsets.right);
        }
        if (getOrientation() == 0) {
            i2 = updateSpecWithExtra(i2, this.mDecorInsets.top, this.mDecorInsets.bottom);
        }
        PerformanceMonitor performanceMonitor = this.mPerformanceMonitor;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("measure", view);
        }
        view.measure(i, i2);
        PerformanceMonitor performanceMonitor2 = this.mPerformanceMonitor;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("measure", view);
        }
    }

    private void runPostLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        this.mNested--;
        if (this.mNested <= 0) {
            this.mNested = 0;
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = findLastVisibleItemPosition();
            for (LayoutHelper layoutHelper : this.mHelperFinder.getLayoutHelpers()) {
                try {
                    layoutHelper.afterLayout(recycler, state, findFirstVisibleItemPosition, findLastVisibleItemPosition, i, this);
                } catch (Exception e) {
                    if (sDebuggable) {
                        throw e;
                    }
                }
            }
            ViewLifeCycleHelper viewLifeCycleHelper = this.mViewLifeCycleHelper;
            if (viewLifeCycleHelper != null) {
                viewLifeCycleHelper.checkViewStatusInScreen();
            }
        }
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            View childAt = getChildAt(i2 - 1);
            int position = getPosition(getChildAt(i));
            int position2 = getPosition(childAt);
            int i3 = i;
            while (i < i2) {
                int position3 = getPosition(getChildAt(i3));
                if (position3 != -1) {
                    LayoutHelper layoutHelper = this.mHelperFinder.getLayoutHelper(position3);
                    if (layoutHelper != null && !layoutHelper.isRecyclable(position3, position, position2, this, true)) {
                        i3++;
                    } else {
                        removeAndRecycleViewAt(i3, recycler);
                    }
                } else {
                    removeAndRecycleViewAt(i3, recycler);
                }
                i++;
            }
            return;
        }
        View childAt2 = getChildAt(i);
        int position4 = getPosition(getChildAt(i2 + 1));
        int position5 = getPosition(childAt2);
        while (i > i2) {
            int position6 = getPosition(getChildAt(i));
            if (position6 != -1) {
                LayoutHelper layoutHelper2 = this.mHelperFinder.getLayoutHelper(position6);
                if (layoutHelper2 == null || layoutHelper2.isRecyclable(position6, position4, position5, this, false)) {
                    removeAndRecycleViewAt(i, recycler);
                }
            } else {
                removeAndRecycleViewAt(i, recycler);
            }
            i--;
        }
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public int scrollInternalBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        Trace.beginSection("VLM scroll");
        runPreLayout(recycler, state);
        int i4 = 0;
        try {
            try {
                if (!this.mNoScrolling) {
                    i = super.scrollInternalBy(i, recycler, state);
                } else if (getChildCount() == 0 || i == 0) {
                    return 0;
                } else {
                    ((ExposeLinearLayoutManagerEx) this).mLayoutState.mRecycle = true;
                    ensureLayoutStateExpose();
                    if (i > 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    int abs = Math.abs(i);
                    updateLayoutStateExpose(i2, abs, true, state);
                    int fill = ((ExposeLinearLayoutManagerEx) this).mLayoutState.mScrollingOffset + fill(recycler, ((ExposeLinearLayoutManagerEx) this).mLayoutState, state, false);
                    if (fill < 0) {
                        return 0;
                    }
                    if (abs > fill) {
                        i = i2 * fill;
                    }
                }
                i4 = i;
            } catch (Exception e) {
                if (ExposeLinearLayoutManagerEx.isLocalTest) {
                    throw e;
                }
            }
            runPostLayout(recycler, state, i4);
            int i5 = Build.VERSION.SDK_INT;
            Trace.endSection();
            return i4;
        } finally {
            runPostLayout(recycler, state, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        onItemsChanged(recyclerView);
    }

    public void setFixOffset(int i, int i2, int i3, int i4) {
        this.mFixAreaAdjustor = new FixAreaAdjuster(i, i2, i3, i4);
    }

    @Override // com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, ExposeLinearLayoutManagerEx.LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        LayoutHelper layoutHelper;
        int i;
        int i2 = layoutState.mCurrentPosition;
        this.mTempLayoutStateWrapper.mLayoutState = layoutState;
        LayoutHelperFinder layoutHelperFinder = this.mHelperFinder;
        if (layoutHelperFinder == null || (layoutHelper = layoutHelperFinder.getLayoutHelper(i2)) == null) {
            layoutHelper = this.mDefaultLayoutHelper;
        }
        layoutHelper.doLayout(recycler, state, this.mTempLayoutStateWrapper, layoutChunkResult, this);
        this.mTempLayoutStateWrapper.mLayoutState = null;
        if (layoutState.mCurrentPosition == i2) {
            layoutChunkResult.mFinished = true;
            return;
        }
        int i3 = layoutState.mCurrentPosition - layoutState.mItemDirection;
        if (layoutChunkResult.mIgnoreConsumed) {
            i = 0;
        } else {
            i = layoutChunkResult.mConsumed;
        }
        Range<Integer> range = new Range<>(Integer.valueOf(Math.min(i2, i3)), Integer.valueOf(Math.max(i2, i3)));
        int findRangeLength = findRangeLength(range);
        if (findRangeLength >= 0) {
            Pair<Range<Integer>, Integer> pair = this.mRangeLengths.get(findRangeLength);
            if (pair != null && ((Range) pair.first).equals(range) && ((Integer) pair.second).intValue() == i) {
                return;
            }
            this.mRangeLengths.remove(findRangeLength);
        }
        this.mRangeLengths.add(Pair.create(range, Integer.valueOf(i)));
        Collections.sort(this.mRangeLengths, this.mRangeComparator);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9, int r10, int r11) {
        /*
            r7 = this;
            boolean r0 = r7.mNoScrolling
            if (r0 != 0) goto Lc
            boolean r0 = r7.mNestedScrolling
            if (r0 != 0) goto Lc
            super.onMeasure(r8, r9, r10, r11)
            return
        Lc:
            androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
            r0 = 134217727(0x7ffffff, float:3.8518597E-34)
            if (r1 == 0) goto L9c
            boolean r0 = r7.mNestedScrolling
            if (r0 == 0) goto L9c
            int r4 = r7.mMaxMeasureSize
            if (r4 > 0) goto L29
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L9c
            android.view.View r1 = (android.view.View) r1
            int r4 = r1.getMeasuredHeight()
        L29:
            boolean r0 = r7.mSpaceMeasured
            if (r0 == 0) goto L2f
            int r4 = r7.mMeasuredFullSpace
        L2f:
            boolean r0 = r7.mNoScrolling
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L55
            boolean r0 = r7.mSpaceMeasured
            r0 = r0 ^ r3
            r7.mSpaceMeasuring = r0
            int r0 = r7.getChildCount()
            if (r0 > 0) goto L65
            int r1 = r7.getChildCount()
            int r0 = r7.getItemCount()
            if (r1 != r0) goto L65
            int r0 = r7.getItemCount()
            if (r0 != 0) goto L55
            r7.mSpaceMeasured = r3
            r7.mSpaceMeasuring = r5
            r4 = 0
        L55:
            int r1 = r7.getOrientation()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto La0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            super.onMeasure(r8, r9, r10, r0)
            return
        L65:
            int r0 = r7.getChildCount()
            int r0 = r0 - r3
            android.view.View r6 = r7.getChildAt(r0)
            int r2 = r7.mMeasuredFullSpace
            if (r6 == 0) goto L84
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            int r1 = r7.getDecoratedBottom(r6)
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r2 = r7.computeAlignOffset(r6, r3, r5)
            int r2 = r2 + r1
        L84:
            int r1 = r7.getChildCount()
            int r0 = r7.getItemCount()
            if (r1 != r0) goto L94
            if (r6 == 0) goto L55
            int r0 = r7.mMeasuredFullSpace
            if (r2 == r0) goto L55
        L94:
            r7.mSpaceMeasured = r5
            r7.mSpaceMeasuring = r3
            r4 = 134217727(0x7ffffff, float:3.8518597E-34)
            goto L55
        L9c:
            r4 = 134217727(0x7ffffff, float:3.8518597E-34)
            goto L29
        La0:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            super.onMeasure(r8, r9, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.VirtualLayoutManager.onMeasure(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, int, int):void");
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void layoutChild(View view, int i, int i2, int i3, int i4) {
        PerformanceMonitor performanceMonitor = this.mPerformanceMonitor;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("layout", view);
        }
        layoutDecorated(view, i, i2, i3, i4);
        PerformanceMonitor performanceMonitor2 = this.mPerformanceMonitor;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("layout", view);
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutManagerHelper
    public void layoutChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        PerformanceMonitor performanceMonitor = this.mPerformanceMonitor;
        if (performanceMonitor != null) {
            performanceMonitor.recordStart("layout", view);
        }
        layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
        PerformanceMonitor performanceMonitor2 = this.mPerformanceMonitor;
        if (performanceMonitor2 != null) {
            performanceMonitor2.recordEnd("layout", view);
        }
    }
}
