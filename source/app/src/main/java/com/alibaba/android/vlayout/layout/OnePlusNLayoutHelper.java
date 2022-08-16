package com.alibaba.android.vlayout.layout;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* loaded from: classes20.dex */
public class OnePlusNLayoutHelper extends AbstractFullFillLayoutHelper {
    public Rect mAreaRect;
    public View[] mChildrenViews;
    public float[] mColWeights;
    public float mRowWeight;

    static {
        Covode.recordClassIndex(4396);
    }

    public OnePlusNLayoutHelper() {
        this.mAreaRect = new Rect();
        this.mColWeights = new float[0];
        this.mRowWeight = Float.NaN;
        setItemCount(0);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void onClear(LayoutManagerHelper layoutManagerHelper) {
        super.onClear(layoutManagerHelper);
    }

    public void setRowWeight(float f) {
        this.mRowWeight = f;
    }

    public OnePlusNLayoutHelper(int i) {
        this(i, 0, 0, 0, 0);
    }

    private float getViewMainWeight(int i) {
        float[] fArr = this.mColWeights;
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    public void setColWeights(float[] fArr) {
        if (fArr != null) {
            this.mColWeights = Arrays.copyOf(fArr, fArr.length);
        } else {
            this.mColWeights = new float[0];
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        if (i2 - i <= 6) {
            return;
        }
        throw new IllegalArgumentException("OnePlusNLayoutHelper only supports maximum 7 children now");
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        super.checkAnchorInfo(state, anchorInfoWrapper, layoutManagerHelper);
        this.mLayoutWithAnchor = true;
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeAlignOffset(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        boolean z3;
        if (layoutManagerHelper.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            return 0;
        }
        if (z) {
            if (i == getItemCount() - 1) {
                if (z3) {
                    return this.mMarginBottom + this.mPaddingBottom;
                }
                return this.mMarginRight + this.mPaddingRight;
            }
        } else if (i == 0) {
            if (z3) {
                return (-this.mMarginTop) - this.mPaddingTop;
            }
            return (-this.mMarginLeft) - this.mPaddingLeft;
        }
        return 0;
    }

    public OnePlusNLayoutHelper(int i, int i2, int i3, int i4, int i5) {
        this.mAreaRect = new Rect();
        this.mColWeights = new float[0];
        this.mRowWeight = Float.NaN;
        setItemCount(i);
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        boolean z2;
        int i;
        int offset;
        int i2;
        int paddingTop;
        int decoratedMeasurementInOther;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingTop2;
        int decoratedMeasurementInOther2;
        int i8;
        if (isOutOfRange(layoutStateWrapper.getCurrentPosition())) {
            return;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        if (layoutManagerHelper.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (layoutStateWrapper.getLayoutDirection() == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int contentWidth = layoutManagerHelper.getContentWidth();
        int contentHeight = layoutManagerHelper.getContentHeight();
        int paddingLeft = layoutManagerHelper.getPaddingLeft() + layoutManagerHelper.getPaddingRight() + getHorizontalMargin() + getHorizontalPadding();
        int paddingTop3 = layoutManagerHelper.getPaddingTop() + layoutManagerHelper.getPaddingBottom() + getVerticalMargin() + getVerticalPadding();
        int currentPosition = layoutStateWrapper.getCurrentPosition();
        if (this.hasHeader && currentPosition == getRange().getLower().intValue()) {
            View nextView = nextView(recycler, layoutStateWrapper, layoutManagerHelper, layoutChunkResult);
            int handleHeader = handleHeader(nextView, layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
            if (nextView != null) {
                if (z) {
                    if (z2) {
                        decoratedMeasurementInOther2 = layoutStateWrapper.getOffset();
                        paddingTop2 = decoratedMeasurementInOther2 - handleHeader;
                    } else {
                        int offset2 = layoutStateWrapper.getOffset();
                        if (this.mLayoutWithAnchor) {
                            i8 = 0;
                        } else {
                            i8 = this.mMarginTop + this.mPaddingTop;
                        }
                        paddingTop2 = i8 + offset2;
                        decoratedMeasurementInOther2 = paddingTop2 + handleHeader;
                    }
                    i6 = layoutManagerHelper.getPaddingLeft() + this.mMarginLeft + this.mPaddingLeft;
                    i7 = mainOrientationHelper.getDecoratedMeasurementInOther(nextView) + i6;
                } else {
                    if (z2) {
                        i7 = layoutStateWrapper.getOffset();
                        i6 = i7 - handleHeader;
                    } else {
                        int offset3 = layoutStateWrapper.getOffset();
                        if (this.mLayoutWithAnchor) {
                            i5 = 0;
                        } else {
                            i5 = this.mMarginLeft + this.mPaddingLeft;
                        }
                        i6 = i5 + offset3;
                        i7 = i6 + handleHeader;
                    }
                    paddingTop2 = layoutManagerHelper.getPaddingTop() + this.mMarginTop + this.mPaddingTop;
                    decoratedMeasurementInOther2 = mainOrientationHelper.getDecoratedMeasurementInOther(nextView) + paddingTop2;
                }
                layoutChildWithMargin(nextView, i6, paddingTop2, i7, decoratedMeasurementInOther2, layoutManagerHelper);
            }
            layoutChunkResult.mConsumed = handleHeader;
            handleStateOnResult(layoutChunkResult, nextView);
        } else if (this.hasFooter && currentPosition == getRange().getUpper().intValue()) {
            View nextView2 = nextView(recycler, layoutStateWrapper, layoutManagerHelper, layoutChunkResult);
            int handleFooter = handleFooter(nextView2, layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
            if (nextView2 != null) {
                if (z) {
                    if (z2) {
                        int offset4 = layoutStateWrapper.getOffset();
                        if (this.mLayoutWithAnchor) {
                            i4 = 0;
                        } else {
                            i4 = this.mMarginBottom + this.mPaddingBottom;
                        }
                        decoratedMeasurementInOther = offset4 - i4;
                        paddingTop = decoratedMeasurementInOther - handleFooter;
                    } else {
                        paddingTop = layoutStateWrapper.getOffset();
                        decoratedMeasurementInOther = paddingTop + handleFooter;
                    }
                    offset = layoutManagerHelper.getPaddingLeft() + this.mMarginLeft + this.mPaddingLeft;
                    i2 = mainOrientationHelper.getDecoratedMeasurementInOther(nextView2) + offset;
                } else {
                    if (z2) {
                        int offset5 = layoutStateWrapper.getOffset();
                        if (this.mLayoutWithAnchor) {
                            i3 = 0;
                        } else {
                            i3 = this.mMarginRight + this.mPaddingRight;
                        }
                        i2 = offset5 - i3;
                        offset = i2 - handleFooter;
                    } else {
                        offset = layoutStateWrapper.getOffset();
                        i2 = offset + handleFooter;
                    }
                    paddingTop = layoutManagerHelper.getPaddingTop() + this.mMarginTop + this.mPaddingTop;
                    decoratedMeasurementInOther = mainOrientationHelper.getDecoratedMeasurementInOther(nextView2) + paddingTop;
                }
                layoutChildWithMargin(nextView2, offset, paddingTop, i2, decoratedMeasurementInOther, layoutManagerHelper);
            }
            layoutChunkResult.mConsumed = handleFooter;
            handleStateOnResult(layoutChunkResult, nextView2);
        } else {
            int itemCount = (getItemCount() - (this.hasHeader ? 1 : 0)) - (this.hasFooter ? 1 : 0);
            View[] viewArr = this.mChildrenViews;
            if (viewArr == null || viewArr.length != itemCount) {
                this.mChildrenViews = new View[itemCount];
            }
            int allChildren = getAllChildren(this.mChildrenViews, recycler, layoutStateWrapper, layoutChunkResult, layoutManagerHelper);
            if (allChildren != 0 && allChildren >= itemCount) {
                if (itemCount == 1) {
                    i = handleOne(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
                } else if (itemCount == 2) {
                    i = handleTwo(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
                } else if (itemCount == 3) {
                    i = handleThree(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
                } else if (itemCount == 4) {
                    i = handleFour(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
                } else if (itemCount == 5) {
                    i = handleFive(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop3);
                } else {
                    i = 0;
                }
                layoutChunkResult.mConsumed = i;
                Arrays.fill(this.mChildrenViews, (Object) null);
            }
        }
    }

    private int handleOne(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        int i9 = 0;
        View view = this.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (!Float.isNaN(this.mAspectRatio)) {
            if (z) {
                layoutParams.height = (int) ((i - i3) / this.mAspectRatio);
            } else {
                layoutParams.width = (int) ((i2 - i4) * this.mAspectRatio);
            }
        }
        float viewMainWeight = getViewMainWeight(0);
        if (Float.isNaN(viewMainWeight)) {
            i5 = i - i3;
        } else {
            i5 = (int) ((i - i3) * viewMainWeight);
        }
        if (z) {
            i6 = -1;
        } else {
            i6 = layoutParams.width;
        }
        int childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(i5, i6, !z);
        int i10 = i2 - i4;
        if (z) {
            i7 = layoutParams.height;
        } else {
            i7 = 1073741824;
        }
        layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec, layoutManagerHelper.getChildMeasureSpec(i10, i7, z));
        calculateRect(mainOrientationHelper.getDecoratedMeasurement(view) + 0, this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
        layoutChildWithMargin(view, this.mAreaRect.left, this.mAreaRect.top, this.mAreaRect.right, this.mAreaRect.bottom, layoutManagerHelper);
        handleStateOnResult(layoutChunkResult, view);
        int i11 = this.mAreaRect.bottom - this.mAreaRect.top;
        if (this.hasHeader) {
            i8 = 0;
        } else {
            i8 = this.mMarginTop + this.mPaddingTop;
        }
        int i12 = i11 + i8;
        if (!this.hasFooter) {
            i9 = this.mMarginBottom + this.mPaddingBottom;
        }
        return i12 + i9;
    }

    private int handleThree(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        int i9 = 0;
        View view3 = this.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view3.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view = this.mChildrenViews[2];
        } else {
            view = this.mChildrenViews[1];
        }
        if (layoutManagerHelper.getReverseLayout()) {
            view2 = this.mChildrenViews[1];
        } else {
            view2 = this.mChildrenViews[2];
        }
        VirtualLayoutManager.LayoutParams layoutParams2 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
        float viewMainWeight = getViewMainWeight(0);
        float viewMainWeight2 = getViewMainWeight(1);
        float viewMainWeight3 = getViewMainWeight(2);
        if (z) {
            if (!Float.isNaN(this.mAspectRatio)) {
                layoutParams.height = (int) ((i - i3) / this.mAspectRatio);
            }
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams3.bottomMargin = layoutParams.bottomMargin;
            layoutParams3.leftMargin = layoutParams2.leftMargin;
            layoutParams3.rightMargin = layoutParams2.rightMargin;
            int i10 = ((((i - i3) - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin;
            if (Float.isNaN(viewMainWeight)) {
                i5 = (int) ((i10 / 2.0f) + 0.5f);
            } else {
                i5 = (int) (((i10 * viewMainWeight) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight2)) {
                i6 = i10 - i5;
            } else {
                i6 = (int) (((i10 * viewMainWeight2) / 100.0f) + 0.5d);
            }
            if (Float.isNaN(viewMainWeight3)) {
                i7 = i6;
            } else {
                i7 = (int) (((i10 * viewMainWeight3) / 100.0f) + 0.5d);
            }
            layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(i5 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            int measuredHeight = view3.getMeasuredHeight();
            if (Float.isNaN(this.mRowWeight)) {
                f = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) / 2.0f;
            } else {
                f = (((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) * this.mRowWeight) / 100.0f;
            }
            int i11 = (int) (f + 0.5f);
            int i12 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) - i11;
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i6 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.topMargin + i11 + layoutParams2.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i7 + layoutParams3.leftMargin + layoutParams3.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.topMargin + i12 + layoutParams3.bottomMargin, 1073741824));
            int i13 = 0;
            calculateRect(Math.max(measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin, i11 + layoutParams2.topMargin + layoutParams2.bottomMargin + i12 + layoutParams3.topMargin + layoutParams3.bottomMargin) + 0, this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = this.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view3);
            layoutChildWithMargin(view3, this.mAreaRect.left, this.mAreaRect.top, decoratedMeasurementInOther, this.mAreaRect.bottom, layoutManagerHelper);
            View view4 = view;
            layoutChildWithMargin(view4, decoratedMeasurementInOther, this.mAreaRect.top, decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view), this.mAreaRect.top + view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin, layoutManagerHelper);
            layoutChildWithMargin(view2, decoratedMeasurementInOther, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view2), decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view2), this.mAreaRect.bottom, layoutManagerHelper);
            int i14 = this.mAreaRect.bottom - this.mAreaRect.top;
            if (this.hasHeader) {
                i8 = 0;
            } else {
                i8 = this.mMarginTop + this.mPaddingTop;
            }
            int i15 = i14 + i8;
            if (!this.hasFooter) {
                i13 = this.mMarginBottom + this.mPaddingBottom;
            }
            i9 = i13 + i15;
        }
        handleStateOnResult(layoutChunkResult, this.mChildrenViews);
        return i9;
    }

    private int handleTwo(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        View view = this.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        View view2 = this.mChildrenViews[1];
        VirtualLayoutManager.LayoutParams layoutParams2 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
        float viewMainWeight = getViewMainWeight(0);
        float viewMainWeight2 = getViewMainWeight(1);
        if (z) {
            if (!Float.isNaN(this.mAspectRatio)) {
                int i15 = (int) ((i - i3) / this.mAspectRatio);
                layoutParams2.height = i15;
                layoutParams.height = i15;
            }
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            int i16 = ((((i - i3) - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin;
            if (Float.isNaN(viewMainWeight)) {
                i12 = (int) ((i16 / 2.0f) + 0.5f);
            } else {
                i12 = (int) (((i16 * viewMainWeight) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight2)) {
                i13 = i16 - i12;
            } else {
                i13 = (int) (((i16 * viewMainWeight2) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i12 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i13 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams2.height, true));
            calculateRect(Math.max(mainOrientationHelper.getDecoratedMeasurement(view), mainOrientationHelper.getDecoratedMeasurement(view2)) + 0, this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = this.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view);
            layoutChildWithMargin(view, this.mAreaRect.left, this.mAreaRect.top, decoratedMeasurementInOther, this.mAreaRect.bottom, layoutManagerHelper);
            layoutChildWithMargin(view2, decoratedMeasurementInOther, this.mAreaRect.top, decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view2), this.mAreaRect.bottom, layoutManagerHelper);
            int i17 = this.mAreaRect.bottom - this.mAreaRect.top;
            if (this.hasHeader) {
                i14 = 0;
            } else {
                i14 = this.mMarginTop + this.mPaddingTop;
            }
            i9 = i17 + i14;
            if (this.hasFooter) {
                i7 = 0;
            } else {
                i10 = this.mMarginBottom;
                i11 = this.mPaddingBottom;
                i7 = i10 + i11;
            }
        } else {
            if (!Float.isNaN(this.mAspectRatio)) {
                int i18 = (int) ((i2 - i4) * this.mAspectRatio);
                layoutParams2.width = i18;
                layoutParams.width = i18;
            }
            int i19 = ((((i2 - i4) - layoutParams.topMargin) - layoutParams.bottomMargin) - layoutParams2.topMargin) - layoutParams2.bottomMargin;
            if (Float.isNaN(viewMainWeight)) {
                i5 = (int) ((i19 / 2.0f) + 0.5f);
            } else {
                i5 = (int) (((i19 * viewMainWeight) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight2)) {
                i6 = i19 - i5;
            } else {
                i6 = (int) (((i19 * viewMainWeight2) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view, layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentWidth(), layoutParams.width, true), View.MeasureSpec.makeMeasureSpec(i5 + layoutParams.topMargin + layoutParams.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i6 + layoutParams2.topMargin + layoutParams2.bottomMargin, 1073741824));
            i7 = 0;
            calculateRect(Math.max(mainOrientationHelper.getDecoratedMeasurement(view), mainOrientationHelper.getDecoratedMeasurement(view2)) + 0, this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther2 = this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurementInOther(view);
            layoutChildWithMargin(view, this.mAreaRect.left, this.mAreaRect.top, this.mAreaRect.right, decoratedMeasurementInOther2, layoutManagerHelper);
            layoutChildWithMargin(view2, this.mAreaRect.left, decoratedMeasurementInOther2, this.mAreaRect.right, decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view2), layoutManagerHelper);
            int i20 = this.mAreaRect.right - this.mAreaRect.left;
            if (this.hasHeader) {
                i8 = 0;
            } else {
                i8 = this.mMarginLeft + this.mPaddingRight;
            }
            i9 = i20 + i8;
            if (!this.hasFooter) {
                i10 = this.mMarginRight;
                i11 = this.mPaddingRight;
                i7 = i10 + i11;
            }
        }
        int i21 = i9 + i7;
        handleStateOnResult(layoutChunkResult, this.mChildrenViews);
        return i21;
    }

    private int handleFive(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        View view3;
        View view4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        View view5 = this.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view5.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view = this.mChildrenViews[4];
        } else {
            view = this.mChildrenViews[1];
        }
        VirtualLayoutManager.LayoutParams layoutParams2 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view2 = this.mChildrenViews[3];
        } else {
            view2 = this.mChildrenViews[2];
        }
        VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view3 = this.mChildrenViews[2];
        } else {
            view3 = this.mChildrenViews[3];
        }
        VirtualLayoutManager.LayoutParams layoutParams4 = (VirtualLayoutManager.LayoutParams) view3.getLayoutParams();
        boolean reverseLayout = layoutManagerHelper.getReverseLayout();
        View[] viewArr = this.mChildrenViews;
        if (reverseLayout) {
            view4 = viewArr[1];
        } else {
            view4 = viewArr[4];
        }
        VirtualLayoutManager.LayoutParams layoutParams5 = (VirtualLayoutManager.LayoutParams) view4.getLayoutParams();
        float viewMainWeight = getViewMainWeight(0);
        float viewMainWeight2 = getViewMainWeight(1);
        float viewMainWeight3 = getViewMainWeight(2);
        float viewMainWeight4 = getViewMainWeight(3);
        float viewMainWeight5 = getViewMainWeight(4);
        if (z) {
            layoutParams2.topMargin = layoutParams.topMargin;
            int i11 = layoutParams.bottomMargin;
            layoutParams4.bottomMargin = i11;
            layoutParams3.bottomMargin = i11;
            layoutParams3.leftMargin = layoutParams2.leftMargin;
            layoutParams4.rightMargin = layoutParams2.rightMargin;
            layoutParams5.rightMargin = layoutParams2.rightMargin;
            if (!Float.isNaN(this.mAspectRatio)) {
                layoutParams.height = (int) ((i - i3) / this.mAspectRatio);
            }
            int i12 = ((((i - i3) - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin;
            if (Float.isNaN(viewMainWeight)) {
                f = i12 / 2.0f;
            } else {
                f = (i12 * viewMainWeight) / 100.0f;
            }
            int i13 = (int) (f + 0.5f);
            if (Float.isNaN(viewMainWeight2)) {
                i6 = i12 - i13;
            } else {
                i6 = (int) (((i12 * viewMainWeight2) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight3)) {
                i7 = (int) ((((i6 - layoutParams3.rightMargin) - layoutParams4.leftMargin) / 3.0f) + 0.5f);
            } else {
                i7 = (int) (((i12 * viewMainWeight3) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight4)) {
                i8 = (int) ((((i6 - layoutParams3.rightMargin) - layoutParams4.leftMargin) / 3.0f) + 0.5f);
            } else {
                i8 = (int) (((i12 * viewMainWeight4) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight5)) {
                i9 = (((i6 - layoutParams3.rightMargin) - layoutParams4.leftMargin) - i7) - i8;
            } else {
                i9 = (int) (((i12 * viewMainWeight5) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view5, View.MeasureSpec.makeMeasureSpec(i13 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            int measuredHeight = view5.getMeasuredHeight();
            if (Float.isNaN(this.mRowWeight)) {
                f2 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) / 2.0f;
            } else {
                f2 = (((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) * this.mRowWeight) / 100.0f;
            }
            int i14 = (int) (f2 + 0.5f);
            int i15 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) - i14;
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i6 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.topMargin + i14 + layoutParams2.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i7 + layoutParams3.leftMargin + layoutParams3.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.topMargin + i15 + layoutParams3.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(i8 + layoutParams4.leftMargin + layoutParams4.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams4.topMargin + i15 + layoutParams4.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view4, View.MeasureSpec.makeMeasureSpec(i9 + layoutParams5.leftMargin + layoutParams5.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams5.topMargin + i15 + layoutParams5.bottomMargin, 1073741824));
            int i16 = 0;
            calculateRect(Math.max(measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin, i14 + layoutParams2.topMargin + layoutParams2.bottomMargin + Math.max(layoutParams3.topMargin + i15 + layoutParams3.bottomMargin, i15 + layoutParams4.topMargin + layoutParams4.bottomMargin)) + 0, this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = this.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view5);
            layoutChildWithMargin(view5, this.mAreaRect.left, this.mAreaRect.top, decoratedMeasurementInOther, this.mAreaRect.bottom, layoutManagerHelper);
            View view6 = view;
            layoutChildWithMargin(view6, decoratedMeasurementInOther, this.mAreaRect.top, decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view), this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), layoutManagerHelper);
            int decoratedMeasurementInOther2 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view2);
            layoutChildWithMargin(view2, decoratedMeasurementInOther, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view2), decoratedMeasurementInOther2, this.mAreaRect.bottom, layoutManagerHelper);
            int decoratedMeasurementInOther3 = decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view3);
            layoutChildWithMargin(view3, decoratedMeasurementInOther2, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view3), decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view3), this.mAreaRect.bottom, layoutManagerHelper);
            layoutChildWithMargin(view4, decoratedMeasurementInOther3, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view4), decoratedMeasurementInOther3 + mainOrientationHelper.getDecoratedMeasurementInOther(view4), this.mAreaRect.bottom, layoutManagerHelper);
            int i17 = this.mAreaRect.bottom - this.mAreaRect.top;
            if (this.hasHeader) {
                i10 = 0;
            } else {
                i10 = this.mMarginTop + this.mPaddingTop;
            }
            int i18 = i17 + i10;
            if (!this.hasFooter) {
                i16 = this.mMarginBottom + this.mPaddingBottom;
            }
            i5 = i18 + i16;
        } else {
            i5 = 0;
        }
        handleStateOnResult(layoutChunkResult, this.mChildrenViews);
        return i5;
    }

    private int handleFour(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        View view3 = this.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view3.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view = this.mChildrenViews[3];
        } else {
            view = this.mChildrenViews[1];
        }
        VirtualLayoutManager.LayoutParams layoutParams2 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        View view4 = this.mChildrenViews[2];
        VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view4.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view2 = this.mChildrenViews[1];
        } else {
            view2 = this.mChildrenViews[3];
        }
        VirtualLayoutManager.LayoutParams layoutParams4 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
        float viewMainWeight = getViewMainWeight(0);
        float viewMainWeight2 = getViewMainWeight(1);
        float viewMainWeight3 = getViewMainWeight(2);
        float viewMainWeight4 = getViewMainWeight(3);
        if (z) {
            layoutParams2.topMargin = layoutParams.topMargin;
            int i10 = layoutParams.bottomMargin;
            layoutParams4.bottomMargin = i10;
            layoutParams3.bottomMargin = i10;
            layoutParams3.leftMargin = layoutParams2.leftMargin;
            layoutParams4.rightMargin = layoutParams2.rightMargin;
            if (!Float.isNaN(this.mAspectRatio)) {
                layoutParams.height = (int) ((i - i3) / this.mAspectRatio);
            }
            int i11 = ((((i - i3) - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin;
            if (Float.isNaN(viewMainWeight)) {
                f = i11 / 2.0f;
            } else {
                f = (i11 * viewMainWeight) / 100.0f;
            }
            int i12 = (int) (f + 0.5f);
            if (Float.isNaN(viewMainWeight2)) {
                i6 = i11 - i12;
            } else {
                i6 = (int) (((i11 * viewMainWeight2) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight3)) {
                i7 = (int) ((((i6 - layoutParams3.rightMargin) - layoutParams4.leftMargin) / 2.0f) + 0.5f);
            } else {
                i7 = (int) (((i11 * viewMainWeight3) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight4)) {
                i8 = ((i6 - layoutParams3.rightMargin) - layoutParams4.leftMargin) - i7;
            } else {
                i8 = (int) (((i11 * viewMainWeight4) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(i12 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            int measuredHeight = view3.getMeasuredHeight();
            if (Float.isNaN(this.mRowWeight)) {
                f2 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) / 2.0f;
            } else {
                f2 = (((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) * this.mRowWeight) / 100.0f;
            }
            int i13 = (int) (f2 + 0.5f);
            int i14 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) - i13;
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i6 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.topMargin + i13 + layoutParams2.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view4, View.MeasureSpec.makeMeasureSpec(i7 + layoutParams3.leftMargin + layoutParams3.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.topMargin + i14 + layoutParams3.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i8 + layoutParams4.leftMargin + layoutParams4.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams4.topMargin + i14 + layoutParams4.bottomMargin, 1073741824));
            int i15 = 0;
            calculateRect(Math.max(measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin, i13 + layoutParams2.topMargin + layoutParams2.bottomMargin + Math.max(layoutParams3.topMargin + i14 + layoutParams3.bottomMargin, i14 + layoutParams4.topMargin + layoutParams4.bottomMargin)) + 0, this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = this.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view3);
            layoutChildWithMargin(view3, this.mAreaRect.left, this.mAreaRect.top, decoratedMeasurementInOther, this.mAreaRect.bottom, layoutManagerHelper);
            View view5 = view;
            layoutChildWithMargin(view5, decoratedMeasurementInOther, this.mAreaRect.top, decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view), this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), layoutManagerHelper);
            int decoratedMeasurementInOther2 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view4);
            layoutChildWithMargin(view4, decoratedMeasurementInOther, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view4), decoratedMeasurementInOther2, this.mAreaRect.bottom, layoutManagerHelper);
            layoutChildWithMargin(view2, decoratedMeasurementInOther2, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view2), decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view2), this.mAreaRect.bottom, layoutManagerHelper);
            int i16 = this.mAreaRect.bottom - this.mAreaRect.top;
            if (this.hasHeader) {
                i9 = 0;
            } else {
                i9 = this.mMarginTop + this.mPaddingTop;
            }
            int i17 = i16 + i9;
            if (!this.hasFooter) {
                i15 = this.mMarginBottom + this.mPaddingBottom;
            }
            i5 = i17 + i15;
        } else {
            i5 = 0;
        }
        handleStateOnResult(layoutChunkResult, this.mChildrenViews);
        return i5;
    }

    private int handleFooter(View view, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (view == null) {
            return 0;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        int i7 = i - i3;
        if (z) {
            i5 = -1;
        } else {
            i5 = layoutParams.width;
        }
        int childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(i7, i5, !z);
        int i8 = i2 - i4;
        if (z) {
            i6 = layoutParams.height;
        } else {
            i6 = 1073741824;
        }
        layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec, layoutManagerHelper.getChildMeasureSpec(i8, i6, z));
        return mainOrientationHelper.getDecoratedMeasurement(view);
    }

    private int handleHeader(View view, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (view == null) {
            return 0;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        int i7 = i - i3;
        if (z) {
            i5 = -1;
        } else {
            i5 = layoutParams.width;
        }
        int childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(i7, i5, !z);
        int i8 = i2 - i4;
        if (z) {
            i6 = layoutParams.height;
        } else {
            i6 = 1073741824;
        }
        layoutManagerHelper.measureChildWithMargins(view, childMeasureSpec, layoutManagerHelper.getChildMeasureSpec(i8, i6, z));
        return mainOrientationHelper.getDecoratedMeasurement(view);
    }
}
