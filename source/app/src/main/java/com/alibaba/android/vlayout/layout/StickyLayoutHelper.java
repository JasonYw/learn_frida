package com.alibaba.android.vlayout.layout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class StickyLayoutHelper extends FixAreaLayoutHelper {
    public boolean isLastStatusSticking;
    public boolean mDoNormalHandle;
    public View mFixView;
    public int mOffset;
    public int mPos;
    public Stackable mStackable;
    public boolean mStickyStart;
    public StickyListener stickyListener;

    /* loaded from: classes20.dex */
    public interface Stackable {
        static {
            Covode.recordClassIndex(4409);
        }

        boolean enable();
    }

    /* loaded from: classes20.dex */
    public interface StickyListener {
        static {
            Covode.recordClassIndex(4410);
        }

        void onSticky(int i, View view);

        void onUnSticky(int i, View view);
    }

    static {
        Covode.recordClassIndex(4408);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public boolean requireLayoutView() {
        return false;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public View getFixedView() {
        return this.mFixView;
    }

    public StickyLayoutHelper() {
        this(true);
    }

    public boolean isStickyNow() {
        if (!this.mDoNormalHandle && this.mFixView != null) {
            return true;
        }
        return false;
    }

    public void setOffset(int i) {
        this.mOffset = i;
    }

    public void setStackable(Stackable stackable) {
        this.mStackable = stackable;
    }

    public void setStickyListener(StickyListener stickyListener) {
        this.stickyListener = stickyListener;
    }

    public void setStickyStart(boolean z) {
        this.mStickyStart = z;
    }

    public StickyLayoutHelper(boolean z) {
        this.mPos = -1;
        this.mStickyStart = true;
        this.mStickyStart = z;
        setItemCount(1);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void setItemCount(int i) {
        if (i > 0) {
            super.setItemCount(1);
        } else {
            super.setItemCount(0);
        }
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        super.onClear(layoutManagerHelper);
        View view = this.mFixView;
        if (view != null) {
            layoutManagerHelper.recycleView(view);
            layoutManagerHelper.removeChildView(this.mFixView);
            this.mFixView = null;
        }
    }

    private int getExtraTopOffset(LayoutManagerHelper layoutManagerHelper) {
        View fixedView;
        Stackable stackable = this.mStackable;
        int i = 0;
        if (stackable != null && stackable.enable() && (layoutManagerHelper instanceof VirtualLayoutManager)) {
            for (LayoutHelper layoutHelper : ((VirtualLayoutManager) layoutManagerHelper).getLayoutHelpers()) {
                if (layoutHelper.isFixLayout() && layoutHelper.getRange().getUpper().intValue() < getRange().getLower().intValue() && (fixedView = layoutHelper.getFixedView()) != null) {
                    i += fixedView.getHeight();
                }
            }
        }
        return i;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        this.mPos = i;
    }

    private void doMeasure(View view, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        int childMeasureSpec;
        int childMeasureSpec2;
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutManagerHelper.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        int contentWidth = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight()) - getHorizontalMargin();
        int contentHeight = ((layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom()) - getVerticalMargin();
        float f = layoutParams.mAspectRatio;
        if (z) {
            int childMeasureSpec3 = layoutManagerHelper.getChildMeasureSpec(contentWidth, layoutParams.width, false);
            if (!Float.isNaN(f) && f > 0.0f) {
                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) ((contentWidth / f) + 0.5f), 1073741824);
            } else if (!Float.isNaN(this.mAspectRatio) && this.mAspectRatio > 0.0f) {
                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) ((contentWidth / this.mAspectRatio) + 0.5d), 1073741824);
            } else {
                childMeasureSpec2 = layoutManagerHelper.getChildMeasureSpec(contentHeight, layoutParams.height, true);
            }
            layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec3, childMeasureSpec2);
            return;
        }
        int childMeasureSpec4 = layoutManagerHelper.getChildMeasureSpec(contentHeight, layoutParams.height, false);
        if (!Float.isNaN(f) && f > 0.0f) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) ((contentHeight * f) + 0.5d), 1073741824);
        } else if (!Float.isNaN(this.mAspectRatio) && this.mAspectRatio > 0.0f) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) ((contentHeight * this.mAspectRatio) + 0.5d), 1073741824);
        } else {
            childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(contentWidth, layoutParams.width, true);
        }
        layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec, childMeasureSpec4);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void beforeLayout(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutManagerHelper layoutManagerHelper) {
        super.beforeLayout(recycler, state, layoutManagerHelper);
        View view = this.mFixView;
        if (view != null && layoutManagerHelper.isViewHolderUpdated(view)) {
            layoutManagerHelper.removeChildView(this.mFixView);
            recycler.recycleView(this.mFixView);
            this.mFixView = null;
        }
        this.mDoNormalHandle = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void fixLayoutStateFromAbnormal2Normal(com.alibaba.android.vlayout.OrientationHelperEx r6, androidx.recyclerview.widget.RecyclerView.Recycler r7, int r8, int r9, com.alibaba.android.vlayout.LayoutManagerHelper r10) {
        /*
            r5 = this;
            android.view.View r0 = r5.mFixView
            if (r0 == 0) goto L3a
            boolean r0 = r5.mStickyStart
            r3 = 1
            if (r0 == 0) goto L4e
            int r4 = r10.getChildCount()
            int r4 = r4 - r3
        Le:
            if (r4 < 0) goto L93
            android.view.View r2 = r10.getChildAt(r4)
            int r1 = r10.getPosition(r2)
            int r0 = r5.mPos
            if (r1 >= r0) goto L4b
            int r2 = r6.getDecoratedEnd(r2)
            com.alibaba.android.vlayout.LayoutHelper r1 = r10.findLayoutHelperByPosition(r1)
            boolean r0 = r1 instanceof com.alibaba.android.vlayout.layout.RangeGridLayoutHelper
            if (r0 == 0) goto L3b
            com.alibaba.android.vlayout.layout.RangeGridLayoutHelper r1 = (com.alibaba.android.vlayout.layout.RangeGridLayoutHelper) r1
            int r0 = r1.getBorderEndSpace(r10)
        L2e:
            int r2 = r2 + r0
        L2f:
            int r1 = r5.mOffset
            com.alibaba.android.vlayout.layout.FixAreaAdjuster r0 = r5.mAdjuster
            int r0 = r0.top
            int r1 = r1 + r0
            if (r2 < r1) goto L93
            r5.mDoNormalHandle = r3
        L3a:
            return
        L3b:
            boolean r0 = r1 instanceof com.alibaba.android.vlayout.layout.MarginLayoutHelper
            if (r0 == 0) goto L2f
            com.alibaba.android.vlayout.layout.MarginLayoutHelper r1 = (com.alibaba.android.vlayout.layout.MarginLayoutHelper) r1
            int r0 = r1.getMarginBottom()
            int r2 = r2 + r0
            int r0 = r1.getPaddingBottom()
            goto L2e
        L4b:
            int r4 = r4 + (-1)
            goto Le
        L4e:
            r4 = 0
        L4f:
            int r0 = r10.getChildCount()
            if (r4 >= r0) goto L3a
            android.view.View r2 = r10.getChildAt(r4)
            int r1 = r10.getPosition(r2)
            int r0 = r5.mPos
            if (r1 <= r0) goto L90
            int r2 = r6.getDecoratedStart(r2)
            com.alibaba.android.vlayout.LayoutHelper r1 = r10.findLayoutHelperByPosition(r1)
            boolean r0 = r1 instanceof com.alibaba.android.vlayout.layout.RangeGridLayoutHelper
            if (r0 == 0) goto L80
            com.alibaba.android.vlayout.layout.RangeGridLayoutHelper r1 = (com.alibaba.android.vlayout.layout.RangeGridLayoutHelper) r1
            int r0 = r1.getBorderStartSpace(r10)
        L73:
            int r2 = r2 - r0
        L74:
            int r1 = r5.mOffset
            com.alibaba.android.vlayout.layout.FixAreaAdjuster r0 = r5.mAdjuster
            int r0 = r0.bottom
            int r1 = r1 + r0
            if (r2 < r1) goto L3a
            r5.mDoNormalHandle = r3
            return
        L80:
            boolean r0 = r1 instanceof com.alibaba.android.vlayout.layout.MarginLayoutHelper
            if (r0 == 0) goto L74
            com.alibaba.android.vlayout.layout.MarginLayoutHelper r1 = (com.alibaba.android.vlayout.layout.MarginLayoutHelper) r1
            int r0 = r1.getMarginTop()
            int r2 = r2 - r0
            int r0 = r1.getPaddingTop()
            goto L73
        L90:
            int r4 = r4 + 1
            goto L4f
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.StickyLayoutHelper.fixLayoutStateFromAbnormal2Normal(com.alibaba.android.vlayout.OrientationHelperEx, androidx.recyclerview.widget.RecyclerView$Recycler, int, int, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }

    private void fixLayoutStateInCase1(OrientationHelperEx orientationHelperEx, RecyclerView.Recycler recycler, int i, int i2, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        int i3;
        int i4;
        int paddingTop;
        int decoratedMeasurementInOther;
        int startAfterPadding;
        int i5;
        int decoratedMeasurementInOther2;
        View view;
        int paddingTop2;
        int i6;
        int paddingBottom;
        if ((this.mStickyStart && i2 >= this.mPos) || (!this.mStickyStart && i <= this.mPos)) {
            int decoratedMeasurement = orientationHelperEx.getDecoratedMeasurement(this.mFixView);
            int i7 = 0;
            if (layoutManagerHelper.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            int extraTopOffset = getExtraTopOffset(layoutManagerHelper);
            if (z) {
                i3 = this.mAdjuster.top + extraTopOffset;
            } else {
                i3 = this.mAdjuster.left;
            }
            FixAreaAdjuster fixAreaAdjuster = this.mAdjuster;
            if (z) {
                i4 = fixAreaAdjuster.bottom;
            } else {
                i4 = fixAreaAdjuster.right;
            }
            int i8 = -1;
            if (z) {
                if (layoutManagerHelper.isDoLayoutRTL()) {
                    decoratedMeasurementInOther2 = layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight();
                    startAfterPadding = decoratedMeasurementInOther2 - orientationHelperEx.getDecoratedMeasurementInOther(this.mFixView);
                } else {
                    startAfterPadding = layoutManagerHelper.getPaddingLeft();
                    decoratedMeasurementInOther2 = orientationHelperEx.getDecoratedMeasurementInOther(this.mFixView) + startAfterPadding;
                }
                if (this.mStickyStart) {
                    i6 = layoutManagerHelper.getChildCount() - 1;
                    view = null;
                    while (i6 >= 0) {
                        view = layoutManagerHelper.getChildAt(i6);
                        int position = layoutManagerHelper.getPosition(view);
                        if (position < this.mPos) {
                            paddingTop = orientationHelperEx.getDecoratedEnd(view);
                            LayoutHelper findLayoutHelperByPosition = layoutManagerHelper.findLayoutHelperByPosition(position);
                            if (findLayoutHelperByPosition instanceof RangeGridLayoutHelper) {
                                paddingBottom = ((RangeGridLayoutHelper) findLayoutHelperByPosition).getBorderEndSpace(layoutManagerHelper);
                            } else {
                                if (findLayoutHelperByPosition instanceof MarginLayoutHelper) {
                                    MarginLayoutHelper marginLayoutHelper = (MarginLayoutHelper) findLayoutHelperByPosition;
                                    paddingTop += marginLayoutHelper.getMarginBottom();
                                    paddingBottom = marginLayoutHelper.getPaddingBottom();
                                }
                                decoratedMeasurementInOther = paddingTop + decoratedMeasurement;
                                this.mDoNormalHandle = true;
                                i8 = i6;
                            }
                            paddingTop += paddingBottom;
                            decoratedMeasurementInOther = paddingTop + decoratedMeasurement;
                            this.mDoNormalHandle = true;
                            i8 = i6;
                        } else {
                            i6--;
                        }
                    }
                    decoratedMeasurementInOther = 0;
                    paddingTop = 0;
                } else {
                    view = null;
                    for (int i9 = 0; i9 < layoutManagerHelper.getChildCount(); i9++) {
                        view = layoutManagerHelper.getChildAt(i9);
                        int position2 = layoutManagerHelper.getPosition(view);
                        if (position2 > this.mPos) {
                            decoratedMeasurementInOther = orientationHelperEx.getDecoratedStart(view);
                            LayoutHelper findLayoutHelperByPosition2 = layoutManagerHelper.findLayoutHelperByPosition(position2);
                            if (findLayoutHelperByPosition2 instanceof RangeGridLayoutHelper) {
                                paddingTop2 = ((RangeGridLayoutHelper) findLayoutHelperByPosition2).getBorderStartSpace(layoutManagerHelper);
                            } else {
                                if (findLayoutHelperByPosition2 instanceof MarginLayoutHelper) {
                                    MarginLayoutHelper marginLayoutHelper2 = (MarginLayoutHelper) findLayoutHelperByPosition2;
                                    decoratedMeasurementInOther -= marginLayoutHelper2.getMarginTop();
                                    paddingTop2 = marginLayoutHelper2.getPaddingTop();
                                }
                                paddingTop = decoratedMeasurementInOther - decoratedMeasurement;
                                i6 = i9 + 1;
                                this.mDoNormalHandle = true;
                                i8 = i6;
                            }
                            decoratedMeasurementInOther -= paddingTop2;
                            paddingTop = decoratedMeasurementInOther - decoratedMeasurement;
                            i6 = i9 + 1;
                            this.mDoNormalHandle = true;
                            i8 = i6;
                        }
                    }
                    decoratedMeasurementInOther = 0;
                    paddingTop = 0;
                }
                if (view == null || i8 < 0) {
                    this.mDoNormalHandle = false;
                }
                if (!layoutManagerHelper.getReverseLayout() && this.mStickyStart) {
                    if (paddingTop < orientationHelperEx.getStartAfterPadding() + this.mOffset + i3) {
                        this.mDoNormalHandle = false;
                    }
                } else if (decoratedMeasurementInOther > (orientationHelperEx.getEndAfterPadding() - this.mOffset) - i4) {
                    this.mDoNormalHandle = false;
                }
                if (!this.mDoNormalHandle) {
                    if (!layoutManagerHelper.getReverseLayout() && this.mStickyStart) {
                        paddingTop = orientationHelperEx.getStartAfterPadding() + this.mOffset + i3;
                        decoratedMeasurementInOther = paddingTop + decoratedMeasurement;
                    } else {
                        decoratedMeasurementInOther = (orientationHelperEx.getEndAfterPadding() - this.mOffset) - i4;
                        paddingTop = decoratedMeasurementInOther - decoratedMeasurement;
                        i7 = decoratedMeasurementInOther2;
                    }
                }
                i7 = decoratedMeasurementInOther2;
            } else {
                paddingTop = layoutManagerHelper.getPaddingTop();
                decoratedMeasurementInOther = orientationHelperEx.getDecoratedMeasurementInOther(this.mFixView) + paddingTop;
                if (this.mDoNormalHandle) {
                    if (this.mStickyStart) {
                        for (int childCount = layoutManagerHelper.getChildCount() - 1; childCount >= 0; childCount--) {
                            View childAt = layoutManagerHelper.getChildAt(childCount);
                            if (layoutManagerHelper.getPosition(childAt) < this.mPos) {
                                i7 = orientationHelperEx.getDecoratedEnd(childAt);
                                i5 = i7 + decoratedMeasurement;
                            }
                        }
                        startAfterPadding = 0;
                    } else {
                        for (int i10 = 0; i10 < layoutManagerHelper.getChildCount(); i10++) {
                            View childAt2 = layoutManagerHelper.getChildAt(i10);
                            if (layoutManagerHelper.getPosition(childAt2) > this.mPos) {
                                i7 = orientationHelperEx.getDecoratedStart(childAt2);
                                startAfterPadding = i7 - decoratedMeasurement;
                                break;
                            }
                        }
                        i5 = 0;
                    }
                    startAfterPadding = i7;
                    i7 = i5;
                    break;
                } else if (!layoutManagerHelper.getReverseLayout() && this.mStickyStart) {
                    startAfterPadding = orientationHelperEx.getStartAfterPadding() + this.mOffset + i3;
                    i7 = decoratedMeasurement + startAfterPadding;
                } else {
                    i7 = (orientationHelperEx.getEndAfterPadding() - this.mOffset) - i4;
                    startAfterPadding = i7 - decoratedMeasurement;
                    break;
                }
            }
            layoutChildWithMargin(this.mFixView, startAfterPadding, paddingTop, i7, decoratedMeasurementInOther, layoutManagerHelper);
            if (this.mDoNormalHandle) {
                if (i8 >= 0) {
                    if (this.mFixView.getParent() == null) {
                        layoutManagerHelper.addChildView(this.mFixView, i8);
                    }
                    this.mFixView = null;
                    return;
                }
                return;
            }
            layoutManagerHelper.showView(this.mFixView);
            layoutManagerHelper.addFixedView(this.mFixView);
            return;
        }
        layoutManagerHelper.removeChildView(this.mFixView);
        layoutManagerHelper.recycleView(this.mFixView);
        this.mFixView = null;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        int paddingTop;
        int decoratedMeasurementInOther;
        int offset;
        int offset2;
        int horizontalMargin;
        if (isOutOfRange(layoutStateWrapper.getCurrentPosition())) {
            return;
        }
        View view = this.mFixView;
        if (view == null) {
            view = layoutStateWrapper.next(recycler);
        } else {
            layoutStateWrapper.skipCurrentPosition();
        }
        if (view == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        doMeasure(view, layoutManagerHelper);
        if (layoutManagerHelper.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        layoutChunkResult.mConsumed = mainOrientationHelper.getDecoratedMeasurement(view);
        view.getLayoutParams();
        this.mDoNormalHandle = true;
        int available = (layoutStateWrapper.getAvailable() - layoutChunkResult.mConsumed) + layoutStateWrapper.getExtra();
        if (layoutManagerHelper.getOrientation() == 1) {
            if (layoutManagerHelper.isDoLayoutRTL()) {
                offset2 = (layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight()) - this.mMarginRight;
                offset = offset2 - mainOrientationHelper.getDecoratedMeasurementInOther(view);
            } else {
                offset = this.mMarginLeft + layoutManagerHelper.getPaddingLeft();
                offset2 = mainOrientationHelper.getDecoratedMeasurementInOther(view) + offset;
            }
            if (layoutStateWrapper.getLayoutDirection() == -1) {
                decoratedMeasurementInOther = layoutStateWrapper.getOffset() - this.mMarginBottom;
                paddingTop = layoutStateWrapper.getOffset() - layoutChunkResult.mConsumed;
            } else if (this.mStickyStart) {
                paddingTop = this.mMarginTop + layoutStateWrapper.getOffset();
                decoratedMeasurementInOther = layoutStateWrapper.getOffset() + layoutChunkResult.mConsumed;
            } else {
                decoratedMeasurementInOther = ((mainOrientationHelper.getEndAfterPadding() - this.mMarginBottom) - this.mOffset) - this.mAdjuster.bottom;
                paddingTop = decoratedMeasurementInOther - layoutChunkResult.mConsumed;
            }
            if (!layoutManagerHelper.getReverseLayout() && this.mStickyStart) {
                if ((available >= this.mOffset + this.mAdjuster.top || layoutStateWrapper.getItemDirection() != -1) && paddingTop >= this.mMarginTop + this.mOffset + this.mAdjuster.top) {
                    boolean z2 = VirtualLayoutManager.sDebuggable;
                } else {
                    this.mDoNormalHandle = false;
                    this.mFixView = view;
                    paddingTop = mainOrientationHelper.getStartAfterPadding() + this.mMarginTop + this.mOffset + this.mAdjuster.top;
                    decoratedMeasurementInOther = layoutChunkResult.mConsumed + paddingTop;
                }
            } else if ((available < this.mOffset + this.mAdjuster.bottom && layoutStateWrapper.getItemDirection() == 1) || decoratedMeasurementInOther > this.mMarginBottom + this.mOffset + this.mAdjuster.bottom) {
                this.mDoNormalHandle = false;
                this.mFixView = view;
                decoratedMeasurementInOther = ((mainOrientationHelper.getEndAfterPadding() - this.mMarginBottom) - this.mOffset) - this.mAdjuster.bottom;
                paddingTop = decoratedMeasurementInOther - layoutChunkResult.mConsumed;
            }
        } else {
            paddingTop = layoutManagerHelper.getPaddingTop();
            decoratedMeasurementInOther = mainOrientationHelper.getDecoratedMeasurementInOther(view) + paddingTop + this.mMarginTop;
            if (layoutStateWrapper.getLayoutDirection() == -1) {
                offset2 = layoutStateWrapper.getOffset() - this.mMarginRight;
                offset = layoutStateWrapper.getOffset() - layoutChunkResult.mConsumed;
            } else {
                offset = this.mMarginLeft + layoutStateWrapper.getOffset();
                offset2 = layoutStateWrapper.getOffset() + layoutChunkResult.mConsumed;
            }
            if (!layoutManagerHelper.getReverseLayout() && this.mStickyStart) {
                if (available < this.mOffset + this.mAdjuster.left) {
                    this.mDoNormalHandle = false;
                    this.mFixView = view;
                    offset = mainOrientationHelper.getStartAfterPadding() + this.mOffset + this.mAdjuster.left;
                    offset2 = layoutChunkResult.mConsumed;
                }
            } else if (available < this.mOffset + this.mAdjuster.right) {
                this.mDoNormalHandle = false;
                this.mFixView = view;
                offset2 = (mainOrientationHelper.getEndAfterPadding() - this.mOffset) - this.mAdjuster.right;
                offset = offset2 - layoutChunkResult.mConsumed;
            }
        }
        int i = paddingTop;
        int i2 = offset;
        View view2 = view;
        layoutChildWithMargin(view2, i2, i, offset2, decoratedMeasurementInOther, layoutManagerHelper);
        int i3 = layoutChunkResult.mConsumed;
        if (z) {
            horizontalMargin = getVerticalMargin();
        } else {
            horizontalMargin = getHorizontalMargin();
        }
        layoutChunkResult.mConsumed = i3 + horizontalMargin;
        if (state.isPreLayout()) {
            this.mDoNormalHandle = true;
        }
        if (this.mDoNormalHandle) {
            layoutManagerHelper.addChildView(layoutStateWrapper, view);
            handleStateOnResult(layoutChunkResult, view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0165, code lost:
        if (r8 != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void fixLayoutStateInCase2(com.alibaba.android.vlayout.OrientationHelperEx r20, androidx.recyclerview.widget.RecyclerView.Recycler r21, int r22, int r23, com.alibaba.android.vlayout.LayoutManagerHelper r24) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.StickyLayoutHelper.fixLayoutStateInCase2(com.alibaba.android.vlayout.OrientationHelperEx, androidx.recyclerview.widget.RecyclerView$Recycler, int, int, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        int i4;
        super.afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
        if (this.mPos < 0) {
            return;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        if (!this.mDoNormalHandle && (i4 = this.mPos) >= i && i4 <= i2) {
            fixLayoutStateFromAbnormal2Normal(mainOrientationHelper, recycler, i, i2, layoutManagerHelper);
        }
        if (this.mDoNormalHandle || state.isPreLayout()) {
            state.isPreLayout();
            View view = this.mFixView;
            if (view != null) {
                layoutManagerHelper.removeChildView(view);
            } else {
                return;
            }
        }
        View view2 = this.mFixView;
        if (!this.mDoNormalHandle && view2 != null) {
            if (view2.getParent() == null) {
                layoutManagerHelper.addFixedView(this.mFixView);
            } else {
                fixLayoutStateInCase1(mainOrientationHelper, recycler, i, i2, layoutManagerHelper);
            }
        } else {
            fixLayoutStateInCase2(mainOrientationHelper, recycler, i, i2, layoutManagerHelper);
        }
        if (this.stickyListener != null) {
            if (this.isLastStatusSticking && !isStickyNow()) {
                this.stickyListener.onUnSticky(this.mPos, view2);
                this.isLastStatusSticking = false;
            } else if (!this.isLastStatusSticking && isStickyNow()) {
                this.stickyListener.onSticky(this.mPos, this.mFixView);
                this.isLastStatusSticking = true;
            }
        }
    }
}
