package com.alibaba.android.vlayout.layout;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.Range;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes20.dex */
public class StaggeredGridLayoutHelper extends BaseLayoutHelper {
    public int anchorPosition;
    public boolean avoidAddOffsetWhenLayout;
    public final Runnable checkForGapsRunnable;
    public boolean fixSpanEndCalculate;
    public int mColLength;
    public int mEachGap;
    public int mHGap;
    public int mLastGap;
    public WeakReference<VirtualLayoutManager> mLayoutManager;
    public boolean mLayoutWithAnchor;
    public LazySpanLookup mLazySpanLookup;
    public int mNumLanes;
    public BitSet mRemainingSpans;
    public Span[] mSpans;
    public int mVGap;
    public boolean needCleanSpanCache;
    public List<View> prelayoutViewList;

    static {
        Covode.recordClassIndex(4404);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onItemsChanged(LayoutManagerHelper layoutManagerHelper) {
    }

    /* loaded from: classes20.dex */
    public static class Span {
        public int mCachedEnd;
        public int mCachedStart;
        public int mDeletedSize;
        public final int mIndex;
        public int mLastEdgeEnd;
        public int mLastEdgeStart;
        public ArrayList<View> mViews;

        static {
            Covode.recordClassIndex(4407);
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        public void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        public void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
            this.mLastEdgeEnd = Integer.MIN_VALUE;
            this.mLastEdgeStart = Integer.MIN_VALUE;
        }

        public int getEndLine(OrientationHelperEx orientationHelperEx) {
            return getEndLine(Integer.MIN_VALUE, orientationHelperEx);
        }

        public RecyclerView.LayoutParams getLayoutParams(View view) {
            return (RecyclerView.LayoutParams) view.getLayoutParams();
        }

        public int getStartLine(OrientationHelperEx orientationHelperEx) {
            return getStartLine(Integer.MIN_VALUE, orientationHelperEx);
        }

        public void setLine(int i) {
            this.mCachedStart = i;
            this.mCachedEnd = i;
            this.mLastEdgeEnd = Integer.MIN_VALUE;
            this.mLastEdgeStart = Integer.MIN_VALUE;
        }

        public Span(int i) {
            this.mViews = new ArrayList<>();
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
            this.mDeletedSize = 0;
            this.mLastEdgeStart = Integer.MIN_VALUE;
            this.mLastEdgeEnd = Integer.MIN_VALUE;
            this.mIndex = i;
        }

        public void calculateCachedStart(OrientationHelperEx orientationHelperEx) {
            if (this.mViews.size() == 0) {
                this.mCachedStart = Integer.MIN_VALUE;
            } else {
                this.mCachedStart = orientationHelperEx.getDecoratedStart(this.mViews.get(0));
            }
        }

        public boolean findEnd(View view) {
            int size = this.mViews.size();
            if (size <= 0 || this.mViews.get(size - 1) != view) {
                return false;
            }
            return true;
        }

        public boolean findStart(View view) {
            if (this.mViews.size() <= 0 || this.mViews.get(0) != view) {
                return false;
            }
            return true;
        }

        public void onOffset(int i) {
            int i2 = this.mLastEdgeStart;
            if (i2 != Integer.MIN_VALUE) {
                this.mLastEdgeStart = i2 + i;
            }
            int i3 = this.mCachedStart;
            if (i3 != Integer.MIN_VALUE) {
                this.mCachedStart = i3 + i;
            }
            int i4 = this.mLastEdgeEnd;
            if (i4 != Integer.MIN_VALUE) {
                this.mLastEdgeEnd = i4 + i;
            }
            int i5 = this.mCachedEnd;
            if (i5 != Integer.MIN_VALUE) {
                this.mCachedEnd = i5 + i;
            }
        }

        public void calculateCachedEnd(OrientationHelperEx orientationHelperEx) {
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
                return;
            }
            ArrayList<View> arrayList = this.mViews;
            this.mCachedEnd = orientationHelperEx.getDecoratedEnd(arrayList.get(arrayList.size() - 1));
        }

        public void popEnd(OrientationHelperEx orientationHelperEx) {
            int size = this.mViews.size();
            View remove = this.mViews.remove(size - 1);
            RecyclerView.LayoutParams layoutParams = getLayoutParams(remove);
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= orientationHelperEx.getDecoratedMeasurement(remove);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        public void popStart(OrientationHelperEx orientationHelperEx) {
            View remove = this.mViews.remove(0);
            RecyclerView.LayoutParams layoutParams = getLayoutParams(remove);
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= orientationHelperEx.getDecoratedMeasurement(remove);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        public int getEndLine(int i, OrientationHelperEx orientationHelperEx) {
            int i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (i != Integer.MIN_VALUE && this.mViews.size() == 0) {
                int i3 = this.mLastEdgeStart;
                if (i3 != Integer.MIN_VALUE) {
                    return i3;
                }
                return i;
            }
            calculateCachedEnd(orientationHelperEx);
            return this.mCachedEnd;
        }

        public int getStartLine(int i, OrientationHelperEx orientationHelperEx) {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (i != Integer.MIN_VALUE && this.mViews.size() == 0) {
                int i3 = this.mLastEdgeEnd;
                if (i3 != Integer.MIN_VALUE) {
                    return i3;
                }
                return i;
            }
            calculateCachedStart(orientationHelperEx);
            return this.mCachedStart;
        }

        public void appendToSpan(View view, OrientationHelperEx orientationHelperEx) {
            RecyclerView.LayoutParams layoutParams = getLayoutParams(view);
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += orientationHelperEx.getDecoratedMeasurement(view);
            }
        }

        public void prependToSpan(View view, OrientationHelperEx orientationHelperEx) {
            RecyclerView.LayoutParams layoutParams = getLayoutParams(view);
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += orientationHelperEx.getDecoratedMeasurement(view);
            }
        }

        public void cacheReferenceLineAndClear(boolean z, int i, OrientationHelperEx orientationHelperEx) {
            int startLine;
            if (z) {
                startLine = getEndLine(orientationHelperEx);
            } else {
                startLine = getStartLine(orientationHelperEx);
            }
            clear();
            if (startLine == Integer.MIN_VALUE) {
                return;
            }
            if (z) {
                orientationHelperEx.getEndAfterPadding();
            } else {
                orientationHelperEx.getStartAfterPadding();
            }
            if (i != Integer.MIN_VALUE) {
                startLine += i;
            }
            this.mCachedEnd = startLine;
            this.mCachedStart = startLine;
            this.mLastEdgeEnd = Integer.MIN_VALUE;
            this.mLastEdgeStart = Integer.MIN_VALUE;
        }

        public boolean isEmpty(int i, int i2, OrientationHelperEx orientationHelperEx) {
            int size = this.mViews.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = this.mViews.get(i3);
                if (orientationHelperEx.getDecoratedStart(view) < i2 && orientationHelperEx.getDecoratedEnd(view) > i) {
                    return false;
                }
            }
            return true;
        }

        public int getNormalizedOffset(int i, int i2, int i3, OrientationHelperEx orientationHelperEx) {
            if (this.mViews.size() == 0) {
                return 0;
            }
            if (i < 0) {
                int endLine = getEndLine(0, orientationHelperEx) - i3;
                if (endLine <= 0) {
                    return 0;
                }
                if ((-i) > endLine) {
                    return -endLine;
                }
                return i;
            }
            int startLine = i2 - getStartLine(0, orientationHelperEx);
            if (startLine <= 0) {
                return 0;
            }
            if (startLine < i) {
                return startLine;
            }
            return i;
        }
    }

    public int getColLength() {
        return this.mColLength;
    }

    public int getHGap() {
        return this.mHGap;
    }

    public int getLane() {
        return this.mNumLanes;
    }

    public int getVGap() {
        return this.mVGap;
    }

    public StaggeredGridLayoutHelper() {
        this(1, 0);
    }

    /* loaded from: classes20.dex */
    public static class LazySpanLookup {
        public int[] mData;

        static {
            Covode.recordClassIndex(4406);
        }

        public void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, Integer.MIN_VALUE);
            }
        }

        public int getSpan(int i) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length && i >= 0) {
                return iArr[i];
            }
            return Integer.MIN_VALUE;
        }

        public int sizeForPosition(int i) {
            int length = this.mData.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        public int invalidateAfter(int i) {
            int[] iArr = this.mData;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            Arrays.fill(iArr, i, iArr.length, Integer.MIN_VALUE);
            return this.mData.length;
        }

        public void ensureSize(int i) {
            int[] iArr = this.mData;
            if (iArr == null) {
                this.mData = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.mData, Integer.MIN_VALUE);
            } else if (i >= iArr.length) {
                this.mData = new int[sizeForPosition(i)];
                System.arraycopy(iArr, 0, this.mData, 0, iArr.length);
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, iArr.length, iArr2.length, Integer.MIN_VALUE);
            }
        }

        public void setSpan(int i, Span span) {
            ensureSize(i);
            this.mData[i] = span.mIndex;
        }

        public void offsetForAddition(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                ensureSize(i3);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.mData, i, i3, Integer.MIN_VALUE);
            }
        }

        public void offsetForRemoval(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                ensureSize(i3);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.mData;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, Integer.MIN_VALUE);
            }
        }
    }

    private void ensureLanes() {
        Span[] spanArr = this.mSpans;
        if (spanArr == null || spanArr.length != this.mNumLanes || this.mRemainingSpans == null) {
            this.mRemainingSpans = new BitSet(this.mNumLanes);
            this.mSpans = new Span[this.mNumLanes];
            for (int i = 0; i < this.mNumLanes; i++) {
                this.mSpans[i] = new Span(i);
            }
        }
    }

    public void checkForGaps() {
        VirtualLayoutManager virtualLayoutManager;
        int intValue;
        int position;
        int decoratedEnd;
        WeakReference<VirtualLayoutManager> weakReference = this.mLayoutManager;
        if (weakReference != null && (virtualLayoutManager = weakReference.get()) != null && virtualLayoutManager.getChildCount() != 0) {
            Range<Integer> range = getRange();
            if (virtualLayoutManager.getReverseLayout()) {
                intValue = range.getUpper().intValue() - 1;
            } else {
                intValue = range.getLower().intValue();
            }
            OrientationHelperEx mainOrientationHelper = virtualLayoutManager.getMainOrientationHelper();
            int childCount = virtualLayoutManager.getChildCount();
            if (virtualLayoutManager.getReverseLayout()) {
                int i = childCount - 1;
                for (int i2 = i; i2 >= 0; i2--) {
                    View childAt = virtualLayoutManager.getChildAt(i2);
                    position = virtualLayoutManager.getPosition(childAt);
                    if (position == intValue) {
                        if (i2 == i) {
                            decoratedEnd = mainOrientationHelper.getDecoratedEnd(childAt);
                        } else {
                            View childAt2 = virtualLayoutManager.getChildAt(i2 + 1);
                            decoratedEnd = virtualLayoutManager.getPosition(childAt2) == position + (-1) ? virtualLayoutManager.obtainExtraMargin(childAt, true) + (mainOrientationHelper.getDecoratedStart(childAt2) - virtualLayoutManager.obtainExtraMargin(childAt2, false)) : mainOrientationHelper.getDecoratedEnd(childAt);
                        }
                    }
                }
                return;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt3 = virtualLayoutManager.getChildAt(i3);
                position = virtualLayoutManager.getPosition(childAt3);
                if (position == intValue) {
                    if (i3 == 0) {
                        decoratedEnd = getMinStart(mainOrientationHelper.getStartAfterPadding(), mainOrientationHelper);
                    } else {
                        View childAt4 = virtualLayoutManager.getChildAt(i3 - 1);
                        decoratedEnd = (mainOrientationHelper.getDecoratedEnd(childAt4) + virtualLayoutManager.obtainExtraMargin(childAt4, true, false)) - virtualLayoutManager.obtainExtraMargin(childAt3, false, false);
                        if (decoratedEnd != mainOrientationHelper.getDecoratedStart(childAt3)) {
                            int position2 = virtualLayoutManager.getPosition(childAt4);
                            int i4 = intValue - 1;
                            if (position2 != i4) {
                                LayoutHelper findLayoutHelperByPosition = virtualLayoutManager.findLayoutHelperByPosition(i4);
                                if (findLayoutHelperByPosition != null && (findLayoutHelperByPosition instanceof StickyLayoutHelper) && findLayoutHelperByPosition.getFixedView() != null) {
                                    decoratedEnd += findLayoutHelperByPosition.getFixedView().getMeasuredHeight();
                                }
                            } else {
                                virtualLayoutManager.findLayoutHelperByPosition(position2).getRange();
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            return;
            if (position != Integer.MIN_VALUE && hasGapsToFix(virtualLayoutManager, position, decoratedEnd) != null) {
                Span[] spanArr = this.mSpans;
                if (spanArr != null) {
                    int length = spanArr.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        this.mSpans[i5].clear();
                    }
                }
                virtualLayoutManager.requestSimpleAnimationsInNextLayout();
                virtualLayoutManager.requestLayout();
            }
        }
    }

    public void setHGap(int i) {
        this.mHGap = i;
    }

    public void setVGap(int i) {
        this.mVGap = i;
    }

    public void setGap(int i) {
        setHGap(i);
        setVGap(i);
    }

    public void setLane(int i) {
        this.mNumLanes = i;
        ensureLanes();
    }

    public StaggeredGridLayoutHelper(int i) {
        this(i, 0);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        super.onClear(layoutManagerHelper);
        this.mLazySpanLookup.clear();
        this.mSpans = null;
        this.mLayoutManager = null;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mLazySpanLookup.mData = bundle.getIntArray("StaggeredGridLayoutHelper_LazySpanLookup");
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onSaveState(Bundle bundle) {
        super.onSaveState(bundle);
        bundle.putIntArray("StaggeredGridLayoutHelper_LazySpanLookup", this.mLazySpanLookup.mData);
    }

    private int getMaxEnd(int i, OrientationHelperEx orientationHelperEx) {
        int endLine = this.mSpans[0].getEndLine(i, orientationHelperEx);
        for (int i2 = 1; i2 < this.mNumLanes; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i, orientationHelperEx);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMaxStart(int i, OrientationHelperEx orientationHelperEx) {
        int startLine = this.mSpans[0].getStartLine(i, orientationHelperEx);
        for (int i2 = 1; i2 < this.mNumLanes; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i, orientationHelperEx);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinEnd(int i, OrientationHelperEx orientationHelperEx) {
        int endLine = this.mSpans[0].getEndLine(i, orientationHelperEx);
        for (int i2 = 1; i2 < this.mNumLanes; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i, orientationHelperEx);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinStart(int i, OrientationHelperEx orientationHelperEx) {
        int startLine = this.mSpans[0].getStartLine(i, orientationHelperEx);
        for (int i2 = 1; i2 < this.mNumLanes; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i, orientationHelperEx);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onOffsetChildrenHorizontal(int i, LayoutManagerHelper layoutManagerHelper) {
        Span[] spanArr;
        super.onOffsetChildrenHorizontal(i, layoutManagerHelper);
        if (layoutManagerHelper.getOrientation() == 0 && (spanArr = this.mSpans) != null) {
            int length = spanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mSpans[i2].onOffset(i);
            }
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onOffsetChildrenVertical(int i, LayoutManagerHelper layoutManagerHelper) {
        Span[] spanArr;
        super.onOffsetChildrenVertical(i, layoutManagerHelper);
        if (layoutManagerHelper.getOrientation() == 1 && (spanArr = this.mSpans) != null) {
            int length = spanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mSpans[i2].onOffset(i);
            }
        }
    }

    public StaggeredGridLayoutHelper(int i, int i2) {
        this.mLazySpanLookup = new LazySpanLookup();
        this.prelayoutViewList = new ArrayList();
        this.mLayoutManager = null;
        this.checkForGapsRunnable = new Runnable() { // from class: com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper.1
            static {
                Covode.recordClassIndex(4405);
            }

            @Override // java.lang.Runnable
            public void run() {
                StaggeredGridLayoutHelper.this.checkForGaps();
            }
        };
        this.fixSpanEndCalculate = false;
        this.avoidAddOffsetWhenLayout = false;
        this.needCleanSpanCache = false;
        setLane(i);
        setGap(i2);
    }

    private void updateAllRemainingSpans(int i, int i2, OrientationHelperEx orientationHelperEx) {
        for (int i3 = 0; i3 < this.mNumLanes; i3++) {
            if (!this.mSpans[i3].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2, orientationHelperEx);
            }
        }
    }

    private boolean checkSpanForGap(Span span, VirtualLayoutManager virtualLayoutManager, int i) {
        boolean z;
        boolean z2;
        OrientationHelperEx mainOrientationHelper = virtualLayoutManager.getMainOrientationHelper();
        if (virtualLayoutManager.getReverseLayout()) {
            if (virtualLayoutManager.getOrientation() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (span.getEndLine(mainOrientationHelper) + computeEndSpace(virtualLayoutManager, z2, true, virtualLayoutManager.isEnableMarginOverLap()) < i) {
                return true;
            }
        } else {
            if (virtualLayoutManager.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (span.getStartLine(mainOrientationHelper) - computeStartSpace(virtualLayoutManager, z, true, virtualLayoutManager.isEnableMarginOverLap()) > i) {
                return true;
            }
        }
        return false;
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i, LayoutManagerHelper layoutManagerHelper) {
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        for (int childCount = layoutManagerHelper.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = layoutManagerHelper.getChildAt(childCount);
            if (childAt != null && mainOrientationHelper.getDecoratedStart(childAt) > i) {
                Span findSpan = findSpan(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewPosition(), childAt, false);
                if (findSpan != null) {
                    findSpan.popEnd(mainOrientationHelper);
                    layoutManagerHelper.removeChildView(childAt);
                    recycler.recycleView(childAt);
                }
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i, LayoutManagerHelper layoutManagerHelper) {
        View childAt;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        boolean z = true;
        while (layoutManagerHelper.getChildCount() > 0 && z && (childAt = layoutManagerHelper.getChildAt(0)) != null && mainOrientationHelper.getDecoratedEnd(childAt) < i) {
            Span findSpan = findSpan(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewPosition(), childAt, true);
            if (findSpan != null) {
                findSpan.popStart(mainOrientationHelper);
                layoutManagerHelper.removeChildView(childAt);
                recycler.recycleView(childAt);
            } else {
                z = false;
            }
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRefreshLayout(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        Span[] spanArr;
        super.onRefreshLayout(state, anchorInfoWrapper, layoutManagerHelper);
        ensureLanes();
        if (isOutOfRange(anchorInfoWrapper.position) && (spanArr = this.mSpans) != null) {
            int length = spanArr.length;
            for (int i = 0; i < length; i++) {
                this.mSpans[i].clear();
            }
        }
    }

    private Span findSpan(int i, View view, boolean z) {
        int span = this.mLazySpanLookup.getSpan(i);
        Span[] spanArr = this.mSpans;
        if (spanArr == null) {
            return null;
        }
        if (span >= 0 && span < spanArr.length) {
            Span span2 = spanArr[span];
            if (z) {
                if (span2.findStart(view)) {
                    return span2;
                }
            } else if (span2.findEnd(view)) {
                return span2;
            }
        }
        int i2 = 0;
        while (true) {
            Span[] spanArr2 = this.mSpans;
            if (i2 >= spanArr2.length) {
                return null;
            }
            if (i2 != span) {
                Span span3 = spanArr2[i2];
                if (z) {
                    if (span3.findStart(view)) {
                        return span3;
                    }
                } else if (span3.findEnd(view)) {
                    return span3;
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
        r4 = r8.mNumLanes;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004d, code lost:
        if (r1 == r11.isDoLayoutRTL()) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 != r11.getReverseLayout()) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        r3 = r8.mNumLanes - 1;
        r7 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper.Span getNextSpan(int r9, com.alibaba.android.vlayout.VirtualLayoutManager.LayoutStateWrapper r10, com.alibaba.android.vlayout.LayoutManagerHelper r11) {
        /*
            r8 = this;
            com.alibaba.android.vlayout.OrientationHelperEx r5 = r11.getMainOrientationHelper()
            int r0 = r11.getOrientation()
            r4 = -1
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L3b
            int r0 = r10.getLayoutDirection()
            if (r0 != r4) goto L39
            r1 = 1
        L14:
            boolean r0 = r11.getReverseLayout()
            if (r1 == r0) goto L54
        L1a:
            int r0 = r8.mNumLanes
            int r3 = r0 + (-1)
            r7 = -1
        L1f:
            int r0 = r10.getLayoutDirection()
            r6 = 0
            if (r0 != r2) goto L59
            r2 = 2147483647(0x7fffffff, float:NaN)
        L29:
            if (r3 == r4) goto L58
            com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper$Span[] r0 = r8.mSpans
            r1 = r0[r3]
            int r0 = r1.getEndLine(r9, r5)
            if (r0 >= r2) goto L37
            r6 = r1
            r2 = r0
        L37:
            int r3 = r3 + r7
            goto L29
        L39:
            r1 = 0
            goto L14
        L3b:
            int r0 = r10.getLayoutDirection()
            if (r0 != r4) goto L52
            r1 = 1
        L42:
            boolean r0 = r11.getReverseLayout()
            if (r1 != r0) goto L50
            r1 = 1
        L49:
            boolean r0 = r11.isDoLayoutRTL()
            if (r1 != r0) goto L54
            goto L1a
        L50:
            r1 = 0
            goto L49
        L52:
            r1 = 0
            goto L42
        L54:
            int r4 = r8.mNumLanes
            r7 = 1
            goto L1f
        L58:
            return r6
        L59:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L5b:
            if (r3 == r4) goto L6b
            com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper$Span[] r0 = r8.mSpans
            r1 = r0[r3]
            int r0 = r1.getStartLine(r9, r5)
            if (r0 <= r2) goto L69
            r6 = r1
            r2 = r0
        L69:
            int r3 = r3 + r7
            goto L5b
        L6b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper.getNextSpan(int, com.alibaba.android.vlayout.VirtualLayoutManager$LayoutStateWrapper, com.alibaba.android.vlayout.LayoutManagerHelper):com.alibaba.android.vlayout.layout.StaggeredGridLayoutHelper$Span");
    }

    private View hasGapsToFix(VirtualLayoutManager virtualLayoutManager, int i, int i2) {
        View view;
        if (virtualLayoutManager.findViewByPosition(i) == null) {
            return null;
        }
        new BitSet(this.mNumLanes).set(0, this.mNumLanes, true);
        Span[] spanArr = this.mSpans;
        if (spanArr != null) {
            int length = spanArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                Span span = this.mSpans[i3];
                if (span.mViews.size() != 0 && checkSpanForGap(span, virtualLayoutManager, i2)) {
                    if (virtualLayoutManager.getReverseLayout()) {
                        view = span.mViews.get(span.mViews.size() - 1);
                    } else {
                        view = span.mViews.get(0);
                    }
                    return view;
                }
            }
        }
        return null;
    }

    private void recycleForPreLayout(RecyclerView.Recycler recycler, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutManagerHelper layoutManagerHelper) {
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        for (int size = this.prelayoutViewList.size() - 1; size >= 0; size--) {
            View view = this.prelayoutViewList.get(size);
            if (view != null && mainOrientationHelper.getDecoratedStart(view) > mainOrientationHelper.getEndAfterPadding()) {
                Span findSpan = findSpan(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewPosition(), view, false);
                if (findSpan != null) {
                    findSpan.popEnd(mainOrientationHelper);
                }
                layoutManagerHelper.removeChildView(view);
                recycler.recycleView(view);
            } else {
                Span findSpan2 = findSpan(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewPosition(), view, false);
                if (findSpan2 != null) {
                    findSpan2.popEnd(mainOrientationHelper);
                }
                layoutManagerHelper.removeChildView(view);
                recycler.recycleView(view);
                return;
            }
        }
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        int contentHeight;
        int verticalPadding;
        int i;
        WeakReference<VirtualLayoutManager> weakReference;
        super.beforeLayout(recycler, state, layoutManagerHelper);
        if (layoutManagerHelper.getOrientation() == 1) {
            contentHeight = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight()) - getHorizontalMargin();
            verticalPadding = getHorizontalPadding();
        } else {
            contentHeight = ((layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom()) - getVerticalMargin();
            verticalPadding = getVerticalPadding();
        }
        int i2 = contentHeight - verticalPadding;
        int i3 = this.mHGap;
        int i4 = this.mNumLanes;
        this.mColLength = (int) (((i2 - (i3 * (i4 - 1))) / i4) + 0.5d);
        int i5 = i2 - (this.mColLength * i4);
        if (i4 <= 1) {
            i = 0;
        } else if (i4 == 2) {
            this.mEachGap = i5;
            this.mLastGap = i5;
            weakReference = this.mLayoutManager;
            if ((weakReference != null || weakReference.get() == null || this.mLayoutManager.get() != layoutManagerHelper) && (layoutManagerHelper instanceof VirtualLayoutManager)) {
                this.mLayoutManager = new WeakReference<>(layoutManagerHelper);
            }
            return;
        } else if (layoutManagerHelper.getOrientation() == 1) {
            i = this.mHGap;
        } else {
            i = this.mVGap;
        }
        this.mLastGap = i;
        this.mEachGap = i;
        weakReference = this.mLayoutManager;
        if (weakReference != null) {
        }
        this.mLayoutManager = new WeakReference<>(layoutManagerHelper);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        int i;
        int i2;
        boolean z;
        super.checkAnchorInfo(state, anchorInfoWrapper, layoutManagerHelper);
        ensureLanes();
        Range<Integer> range = getRange();
        View findViewByPosition = layoutManagerHelper.findViewByPosition(anchorInfoWrapper.position);
        int i3 = 0;
        if (layoutManagerHelper.getOrientation() == 1) {
            i = this.mVGap;
        } else {
            i = this.mHGap;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        if (findViewByPosition == null) {
            Span[] spanArr = this.mSpans;
            if (spanArr != null) {
                int length = spanArr.length;
                while (i3 < length) {
                    this.mSpans[i3].clear();
                    i3++;
                }
                return;
            }
            return;
        }
        int i4 = Integer.MIN_VALUE;
        if (anchorInfoWrapper.layoutFromEnd) {
            i2 = Integer.MIN_VALUE;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        Span[] spanArr2 = this.mSpans;
        if (spanArr2 != null) {
            int length2 = spanArr2.length;
            for (int i5 = 0; i5 < length2; i5++) {
                Span span = this.mSpans[i5];
                if (!span.mViews.isEmpty()) {
                    if (anchorInfoWrapper.layoutFromEnd) {
                        i2 = Math.max(i2, layoutManagerHelper.getPosition(span.mViews.get(span.mViews.size() - 1)));
                    } else {
                        i2 = Math.min(i2, layoutManagerHelper.getPosition(span.mViews.get(0)));
                    }
                }
            }
        }
        if (!isOutOfRange(i2)) {
            if (i2 == range.getLower().intValue()) {
                z = true;
            } else {
                z = false;
            }
            View findViewByPosition2 = layoutManagerHelper.findViewByPosition(i2);
            if (findViewByPosition2 != null) {
                if (anchorInfoWrapper.layoutFromEnd) {
                    anchorInfoWrapper.position = i2;
                    int decoratedEnd = mainOrientationHelper.getDecoratedEnd(findViewByPosition);
                    if (decoratedEnd < anchorInfoWrapper.coordinate) {
                        int i6 = anchorInfoWrapper.coordinate - decoratedEnd;
                        if (z) {
                            i = 0;
                        }
                        i4 = i6 + i;
                    } else if (z) {
                        i4 = 0;
                    } else {
                        i4 = i;
                    }
                    anchorInfoWrapper.coordinate = mainOrientationHelper.getDecoratedEnd(findViewByPosition2) + i4;
                } else {
                    anchorInfoWrapper.position = i2;
                    int decoratedStart = mainOrientationHelper.getDecoratedStart(findViewByPosition);
                    VirtualLayoutManager virtualLayoutManager = this.mLayoutManager.get();
                    if (ExposeLinearLayoutManagerEx.setFix2 && virtualLayoutManager != null && virtualLayoutManager.mCurrentPendingScrollPosition != -1) {
                        anchorInfoWrapper.coordinate = mainOrientationHelper.getDecoratedStart(findViewByPosition2) + i;
                        anchorInfoWrapper.coordinate += ((ExposeLinearLayoutManagerEx) virtualLayoutManager).mPendingScrollPositionOffset - decoratedStart;
                        this.needCleanSpanCache = true;
                    } else if (decoratedStart > anchorInfoWrapper.coordinate) {
                        int i7 = anchorInfoWrapper.coordinate - decoratedStart;
                        if (z) {
                            i = 0;
                        }
                        i4 = i7 - i;
                        anchorInfoWrapper.coordinate = mainOrientationHelper.getDecoratedStart(findViewByPosition2) + i4;
                    } else {
                        if (z) {
                            i = 0;
                        }
                        i4 = -i;
                        anchorInfoWrapper.coordinate = mainOrientationHelper.getDecoratedStart(findViewByPosition2) + i4;
                    }
                }
            }
        } else {
            this.anchorPosition = anchorInfoWrapper.position;
            this.mLayoutWithAnchor = true;
        }
        Span[] spanArr3 = this.mSpans;
        if (spanArr3 != null) {
            int length3 = spanArr3.length;
            while (i3 < length3) {
                this.mSpans[i3].cacheReferenceLineAndClear(layoutManagerHelper.getReverseLayout() ^ anchorInfoWrapper.layoutFromEnd, i4, mainOrientationHelper);
                i3++;
            }
        }
    }

    private void updateRemainingSpans(Span span, int i, int i2, OrientationHelperEx orientationHelperEx) {
        int deletedSize = span.getDeletedSize();
        if (i == -1) {
            if (span.getStartLine(orientationHelperEx) + deletedSize < i2) {
                this.mRemainingSpans.set(span.mIndex, false);
            }
        } else if (span.getEndLine(orientationHelperEx) - deletedSize > i2) {
            this.mRemainingSpans.set(span.mIndex, false);
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onScrollStateChanged(int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        if (i2 <= getRange().getUpper().intValue() && i3 >= getRange().getLower().intValue() && i == 0) {
            checkForGaps();
        }
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeAlignOffset(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        boolean z3;
        if (layoutManagerHelper.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        View findViewByPosition = layoutManagerHelper.findViewByPosition(getRange().getLower().intValue() + i);
        if (findViewByPosition == null) {
            return 0;
        }
        ensureLanes();
        if (z3) {
            if (z) {
                if (i == getItemCount() - 1) {
                    return this.mMarginBottom + this.mPaddingBottom + (getMaxEnd(mainOrientationHelper.getDecoratedEnd(findViewByPosition), mainOrientationHelper) - mainOrientationHelper.getDecoratedEnd(findViewByPosition));
                }
                if (!z2) {
                    return getMinEnd(mainOrientationHelper.getDecoratedStart(findViewByPosition), mainOrientationHelper) - mainOrientationHelper.getDecoratedEnd(findViewByPosition);
                }
            } else if (i == 0) {
                return ((-this.mMarginTop) - this.mPaddingTop) - (mainOrientationHelper.getDecoratedStart(findViewByPosition) - getMinStart(mainOrientationHelper.getDecoratedStart(findViewByPosition), mainOrientationHelper));
            } else {
                if (!z2) {
                    return getMaxStart(mainOrientationHelper.getDecoratedEnd(findViewByPosition), mainOrientationHelper) - mainOrientationHelper.getDecoratedStart(findViewByPosition);
                }
            }
        }
        return 0;
    }

    private void recycle(RecyclerView.Recycler recycler, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, Span span, int i, LayoutManagerHelper layoutManagerHelper) {
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        if (layoutStateWrapper.getLayoutDirection() == -1) {
            recycleFromEnd(recycler, Math.max(i, getMaxStart(span.getStartLine(mainOrientationHelper), mainOrientationHelper)) + (mainOrientationHelper.getEnd() - mainOrientationHelper.getStartAfterPadding()), layoutManagerHelper);
        } else {
            recycleFromStart(recycler, Math.min(i, getMinEnd(span.getEndLine(mainOrientationHelper), mainOrientationHelper)) - (mainOrientationHelper.getEnd() - mainOrientationHelper.getStartAfterPadding()), layoutManagerHelper);
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public boolean isRecyclable(int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper, boolean z) {
        View findViewByPosition;
        boolean isRecyclable = super.isRecyclable(i, i2, i3, layoutManagerHelper, z);
        if (isRecyclable && (findViewByPosition = layoutManagerHelper.findViewByPosition(i)) != null) {
            OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
            int viewPosition = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).getViewPosition();
            if (layoutManagerHelper.getReverseLayout()) {
                if (z) {
                    Span findSpan = findSpan(viewPosition, findViewByPosition, true);
                    if (findSpan != null) {
                        findSpan.popEnd(mainOrientationHelper);
                    }
                } else {
                    Span findSpan2 = findSpan(viewPosition, findViewByPosition, false);
                    if (findSpan2 != null) {
                        findSpan2.popStart(mainOrientationHelper);
                        return isRecyclable;
                    }
                }
            } else if (z) {
                Span findSpan3 = findSpan(viewPosition, findViewByPosition, true);
                if (findSpan3 != null) {
                    findSpan3.popStart(mainOrientationHelper);
                    return isRecyclable;
                }
            } else {
                Span findSpan4 = findSpan(viewPosition, findViewByPosition, false);
                if (findSpan4 != null) {
                    findSpan4.popEnd(mainOrientationHelper);
                    return isRecyclable;
                }
            }
        }
        return isRecyclable;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        int offset;
        int extra;
        int i;
        int i2;
        int i3;
        int i4;
        Span span;
        boolean z2;
        boolean z3;
        int size;
        boolean z4;
        int startLine;
        int i5;
        int i6;
        int decoratedMeasurement;
        int i7;
        int i8;
        int i9;
        int i10;
        View view;
        int i11;
        int size2;
        RecyclerView.State state2 = state;
        VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper2 = layoutStateWrapper;
        if (isOutOfRange(layoutStateWrapper2.getCurrentPosition())) {
            return;
        }
        ensureLanes();
        if (layoutManagerHelper.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        OrientationHelperEx secondaryOrientationHelper = layoutManagerHelper.getSecondaryOrientationHelper();
        boolean isEnableMarginOverLap = layoutManagerHelper.isEnableMarginOverLap();
        this.mRemainingSpans.set(0, this.mNumLanes, true);
        if (layoutStateWrapper2.getLayoutDirection() == 1) {
            offset = layoutStateWrapper2.getOffset() + layoutStateWrapper2.getAvailable();
            if (this.avoidAddOffsetWhenLayout) {
                extra = mainOrientationHelper.getEndPadding() + offset;
            } else {
                extra = layoutStateWrapper2.getExtra() + offset + mainOrientationHelper.getEndPadding();
            }
        } else {
            offset = layoutStateWrapper2.getOffset() - layoutStateWrapper2.getAvailable();
            if (this.avoidAddOffsetWhenLayout) {
                extra = offset - mainOrientationHelper.getStartAfterPadding();
            } else {
                extra = (offset - layoutStateWrapper2.getExtra()) - mainOrientationHelper.getStartAfterPadding();
            }
        }
        updateAllRemainingSpans(layoutStateWrapper2.getLayoutDirection(), extra, mainOrientationHelper);
        int offset2 = layoutStateWrapper2.getOffset();
        if (ExposeLinearLayoutManagerEx.setFix2 && this.needCleanSpanCache) {
            for (Span span2 : this.mSpans) {
                span2.invalidateCache();
            }
        }
        this.prelayoutViewList.clear();
        while (layoutStateWrapper2.hasMore(state2) && !this.mRemainingSpans.isEmpty() && !isOutOfRange(layoutStateWrapper2.getCurrentPosition())) {
            int currentPosition = layoutStateWrapper2.getCurrentPosition();
            View next = layoutStateWrapper2.next(recycler);
            if (next == null) {
                break;
            }
            VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) next.getLayoutParams();
            int viewPosition = layoutParams.getViewPosition();
            int span3 = this.mLazySpanLookup.getSpan(viewPosition);
            if (span3 == Integer.MIN_VALUE) {
                span = getNextSpan(offset2, layoutStateWrapper2, layoutManagerHelper);
                this.mLazySpanLookup.setSpan(viewPosition, span);
            } else {
                span = this.mSpans[span3];
            }
            if (viewPosition - getRange().getLower().intValue() < this.mNumLanes) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getRange().getUpper().intValue() - viewPosition < this.mNumLanes) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (layoutStateWrapper2.isPreLayout()) {
                this.prelayoutViewList.add(next);
            }
            layoutManagerHelper.addChildView(layoutStateWrapper2, next);
            if (z) {
                int childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(this.mColLength, layoutParams.width, false);
                int totalSpace = mainOrientationHelper.getTotalSpace();
                if (Float.isNaN(layoutParams.mAspectRatio)) {
                    size2 = layoutParams.height;
                } else {
                    size2 = (int) ((View.MeasureSpec.getSize(childMeasureSpec) / layoutParams.mAspectRatio) + 0.5f);
                }
                layoutManagerHelper.measureChildWithMargins(next, childMeasureSpec, layoutManagerHelper.getChildMeasureSpec(totalSpace, size2, true));
                z4 = true;
            } else {
                int childMeasureSpec2 = layoutManagerHelper.getChildMeasureSpec(this.mColLength, layoutParams.height, false);
                int totalSpace2 = mainOrientationHelper.getTotalSpace();
                if (Float.isNaN(layoutParams.mAspectRatio)) {
                    size = layoutParams.width;
                } else {
                    size = (int) ((View.MeasureSpec.getSize(childMeasureSpec2) * layoutParams.mAspectRatio) + 0.5f);
                }
                z4 = true;
                layoutManagerHelper.measureChildWithMargins(next, layoutManagerHelper.getChildMeasureSpec(totalSpace2, size, true), childMeasureSpec2);
            }
            if (layoutStateWrapper2.getLayoutDirection() == z4) {
                decoratedMeasurement = span.getEndLine(offset2, mainOrientationHelper);
                if (z2) {
                    i11 = computeStartSpace(layoutManagerHelper, z, z4, isEnableMarginOverLap);
                } else if (this.mLayoutWithAnchor) {
                    if (Math.abs(currentPosition - this.anchorPosition) >= this.mNumLanes) {
                        if (z) {
                            i11 = this.mVGap;
                        } else {
                            i11 = this.mHGap;
                        }
                    }
                    i6 = mainOrientationHelper.getDecoratedMeasurement(next) + decoratedMeasurement;
                } else if (z) {
                    i11 = this.mVGap;
                } else {
                    i11 = this.mHGap;
                }
                decoratedMeasurement += i11;
                i6 = mainOrientationHelper.getDecoratedMeasurement(next) + decoratedMeasurement;
            } else {
                if (z3) {
                    startLine = span.getStartLine(offset2, mainOrientationHelper);
                    if (z) {
                        i7 = this.mMarginBottom;
                    } else {
                        i7 = this.mMarginRight;
                    }
                    i5 = i7 + this.mPaddingRight;
                } else {
                    startLine = span.getStartLine(offset2, mainOrientationHelper);
                    if (z) {
                        i5 = this.mVGap;
                    } else {
                        i5 = this.mHGap;
                    }
                }
                i6 = startLine - i5;
                decoratedMeasurement = i6 - mainOrientationHelper.getDecoratedMeasurement(next);
            }
            if (layoutStateWrapper2.getLayoutDirection() == 1) {
                span.appendToSpan(next, mainOrientationHelper);
            } else {
                span.prependToSpan(next, mainOrientationHelper);
            }
            if (span.mIndex == this.mNumLanes - 1) {
                int i12 = span.mIndex;
                int i13 = this.mColLength;
                int i14 = this.mEachGap;
                i8 = ((i12 * (i13 + i14)) - i14) + this.mLastGap;
            } else {
                i8 = span.mIndex * (this.mColLength + this.mEachGap);
            }
            int startAfterPadding = i8 + secondaryOrientationHelper.getStartAfterPadding();
            if (z) {
                i9 = this.mMarginLeft;
                i10 = this.mPaddingLeft;
            } else {
                i9 = this.mMarginTop;
                i10 = this.mPaddingTop;
            }
            int i15 = startAfterPadding + i9 + i10;
            int decoratedMeasurementInOther = i15 + mainOrientationHelper.getDecoratedMeasurementInOther(next);
            if (z) {
                view = next;
                layoutChildWithMargin(next, i15, decoratedMeasurement, decoratedMeasurementInOther, i6, layoutManagerHelper);
            } else {
                view = next;
                layoutChildWithMargin(view, decoratedMeasurement, i15, i6, decoratedMeasurementInOther, layoutManagerHelper);
            }
            updateRemainingSpans(span, layoutStateWrapper2.getLayoutDirection(), extra, mainOrientationHelper);
            recycle(recycler, layoutStateWrapper2, span, offset, layoutManagerHelper);
            handleStateOnResult(layoutChunkResult, view);
            StringBuilder sb = new StringBuilder("layoutViews: need break fill? layoutState.hasMore(state)=");
            sb.append(layoutStateWrapper2.hasMore(state));
            sb.append(" !mRemainingSpans.isEmpty()");
            sb.append(!this.mRemainingSpans.isEmpty());
            sb.append(" !isOutOfRange(layoutState.getCurrentPosition())");
            sb.append(!isOutOfRange(layoutStateWrapper2.getCurrentPosition()));
            state2 = state;
            layoutStateWrapper2 = layoutStateWrapper2;
        }
        if (isOutOfRange(layoutStateWrapper2.getCurrentPosition()) && this.mSpans != null) {
            if (layoutStateWrapper2.getLayoutDirection() == -1) {
                int length = this.mSpans.length;
                for (int i16 = 0; i16 < length; i16++) {
                    Span span4 = this.mSpans[i16];
                    if (span4.mCachedStart != Integer.MIN_VALUE) {
                        span4.mLastEdgeStart = span4.mCachedStart;
                    }
                }
            } else {
                int length2 = this.mSpans.length;
                for (int i17 = 0; i17 < length2; i17++) {
                    Span span5 = this.mSpans[i17];
                    if (span5.mCachedEnd != Integer.MIN_VALUE) {
                        span5.mLastEdgeEnd = span5.mCachedEnd;
                    }
                }
            }
        }
        if (layoutStateWrapper2.getLayoutDirection() == -1) {
            if (!isOutOfRange(layoutStateWrapper2.getCurrentPosition()) && layoutStateWrapper2.hasMore(state2)) {
                layoutChunkResult.mConsumed = layoutStateWrapper2.getOffset() - getMaxStart(mainOrientationHelper.getStartAfterPadding(), mainOrientationHelper);
            } else {
                int offset3 = layoutStateWrapper2.getOffset() - getMinStart(mainOrientationHelper.getEndAfterPadding(), mainOrientationHelper);
                if (z) {
                    i3 = this.mMarginTop;
                    i4 = this.mPaddingTop;
                } else {
                    i3 = this.mMarginLeft;
                    i4 = this.mPaddingLeft;
                }
                layoutChunkResult.mConsumed = offset3 + i3 + i4;
            }
        } else if (!isOutOfRange(layoutStateWrapper2.getCurrentPosition()) && layoutStateWrapper2.hasMore(state2)) {
            layoutChunkResult.mConsumed = getMinEnd(mainOrientationHelper.getEndAfterPadding(), mainOrientationHelper) - layoutStateWrapper2.getOffset();
        } else {
            int maxEnd = getMaxEnd(mainOrientationHelper.getStartAfterPadding(), mainOrientationHelper) - layoutStateWrapper2.getOffset();
            if (z) {
                i = this.mMarginBottom;
                i2 = this.mPaddingBottom;
            } else {
                i = this.mMarginRight;
                i2 = this.mPaddingRight;
            }
            layoutChunkResult.mConsumed = maxEnd + i + i2;
        }
        recycleForPreLayout(recycler, layoutStateWrapper2, layoutManagerHelper);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        super.afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
        this.mLayoutWithAnchor = false;
        if (i <= getRange().getUpper().intValue() && i2 >= getRange().getLower().intValue() && !state.isPreLayout() && layoutManagerHelper.getChildCount() > 0) {
            ViewCompat.postOnAnimation(layoutManagerHelper.getChildAt(0), this.checkForGapsRunnable);
        }
    }
}
