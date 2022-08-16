package com.alibaba.android.vlayout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public abstract class OrientationHelperEx {
    public int mLastTotalSpace;
    public final ExposeLinearLayoutManagerEx mLayoutManager;

    static {
        Covode.recordClassIndex(4345);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public abstract void offsetChild(View view, int i);

    public abstract void offsetChildren(int i);

    public void onLayoutComplete() {
        this.mLastTotalSpace = getTotalSpace();
    }

    public int getTotalSpaceChange() {
        if (Integer.MIN_VALUE == this.mLastTotalSpace) {
            return 0;
        }
        return getTotalSpace() - this.mLastTotalSpace;
    }

    public static OrientationHelperEx createHorizontalHelper(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        return new OrientationHelperEx(exposeLinearLayoutManagerEx) { // from class: com.alibaba.android.vlayout.OrientationHelperEx.1
            static {
                Covode.recordClassIndex(4346);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getEnd() {
                return this.mLayoutManager.getWidth();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getEndPadding() {
                return this.mLayoutManager.getPaddingRight();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getStartAfterPadding() {
                return this.mLayoutManager.getPaddingLeft();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getEndAfterPadding() {
                return this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingRight();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getTotalSpace() {
                return (this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingLeft()) - this.mLayoutManager.getPaddingRight();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public void offsetChildren(int i) {
                this.mLayoutManager.offsetChildrenHorizontal(i);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedEnd(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.mLayoutManager.isEnableMarginOverLap()) {
                    return this.mLayoutManager.getDecoratedRight(view) + layoutParams.rightMargin;
                }
                return this.mLayoutManager.getDecoratedRight(view);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedMeasurementInOther(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedStart(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.mLayoutManager.isEnableMarginOverLap()) {
                    return this.mLayoutManager.getDecoratedLeft(view) - layoutParams.leftMargin;
                }
                return this.mLayoutManager.getDecoratedLeft(view);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.mLayoutManager.isEnableMarginOverLap()) {
                    return this.mLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
                }
                return this.mLayoutManager.getDecoratedMeasuredWidth(view);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public void offsetChild(View view, int i) {
                view.offsetLeftAndRight(i);
            }
        };
    }

    public static OrientationHelperEx createVerticalHelper(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        return new OrientationHelperEx(exposeLinearLayoutManagerEx) { // from class: com.alibaba.android.vlayout.OrientationHelperEx.2
            static {
                Covode.recordClassIndex(4347);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getEnd() {
                return this.mLayoutManager.getHeight();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getEndPadding() {
                return this.mLayoutManager.getPaddingBottom();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getStartAfterPadding() {
                return this.mLayoutManager.getPaddingTop();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getEndAfterPadding() {
                return this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingBottom();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getTotalSpace() {
                return (this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingTop()) - this.mLayoutManager.getPaddingBottom();
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public void offsetChildren(int i) {
                this.mLayoutManager.offsetChildrenVertical(i);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedEnd(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.mLayoutManager.isEnableMarginOverLap()) {
                    return this.mLayoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin;
                }
                return this.mLayoutManager.getDecoratedBottom(view);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedMeasurementInOther(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedStart(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.mLayoutManager.isEnableMarginOverLap()) {
                    return this.mLayoutManager.getDecoratedTop(view) - layoutParams.topMargin;
                }
                return this.mLayoutManager.getDecoratedTop(view);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public int getDecoratedMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.mLayoutManager.isEnableMarginOverLap()) {
                    return this.mLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
                }
                return this.mLayoutManager.getDecoratedMeasuredHeight(view);
            }

            @Override // com.alibaba.android.vlayout.OrientationHelperEx
            public void offsetChild(View view, int i) {
                view.offsetTopAndBottom(i);
            }
        };
    }

    public OrientationHelperEx(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        this.mLastTotalSpace = Integer.MIN_VALUE;
        this.mLayoutManager = exposeLinearLayoutManagerEx;
    }

    public static OrientationHelperEx createOrientationHelper(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, int i) {
        if (i != 0) {
            if (i == 1) {
                return createVerticalHelper(exposeLinearLayoutManagerEx);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return createHorizontalHelper(exposeLinearLayoutManagerEx);
    }
}
