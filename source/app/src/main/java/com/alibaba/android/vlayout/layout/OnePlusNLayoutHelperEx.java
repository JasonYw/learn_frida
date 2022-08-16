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
public class OnePlusNLayoutHelperEx extends AbstractFullFillLayoutHelper {
    public Rect mAreaRect;
    public View[] mChildrenViews;
    public float[] mColWeights;
    public float mRowWeight;

    static {
        Covode.recordClassIndex(4397);
    }

    public OnePlusNLayoutHelperEx() {
        this.mAreaRect = new Rect();
        this.mColWeights = new float[0];
        this.mRowWeight = Float.NaN;
        setItemCount(0);
    }

    public void setRowWeight(float f) {
        this.mRowWeight = f;
    }

    public OnePlusNLayoutHelperEx(int i) {
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
        int i3 = i2 - i;
        if (i3 >= 4) {
            if (i3 <= 6) {
                return;
            }
            throw new IllegalArgumentException("OnePlusNLayoutHelper only supports maximum 7 children now");
        }
        throw new IllegalArgumentException("pls use OnePlusNLayoutHelper instead of OnePlusNLayoutHelperEx which childcount <= 5");
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeAlignOffset(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        if (getItemCount() == 3) {
            if (i == 1 && z) {
                return 0;
            }
        } else if (getItemCount() == 4 && i == 1 && z) {
            return 0;
        }
        if (layoutManagerHelper.getOrientation() == 1) {
            if (z) {
                return this.mMarginBottom + this.mPaddingBottom;
            }
            return (-this.mMarginTop) - this.mPaddingTop;
        } else if (z) {
            return this.mMarginRight + this.mPaddingRight;
        } else {
            return (-this.mMarginLeft) - this.mPaddingLeft;
        }
    }

    public OnePlusNLayoutHelperEx(int i, int i2, int i3, int i4, int i5) {
        this.mAreaRect = new Rect();
        this.mColWeights = new float[0];
        this.mRowWeight = Float.NaN;
        setItemCount(i);
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        if (isOutOfRange(layoutStateWrapper.getCurrentPosition())) {
            return;
        }
        View[] viewArr = this.mChildrenViews;
        if (viewArr == null || viewArr.length != getItemCount()) {
            this.mChildrenViews = new View[getItemCount()];
        }
        int allChildren = getAllChildren(this.mChildrenViews, recycler, layoutStateWrapper, layoutChunkResult, layoutManagerHelper);
        getItemCount();
        int i = 0;
        if (layoutManagerHelper.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        int contentWidth = layoutManagerHelper.getContentWidth();
        int contentHeight = layoutManagerHelper.getContentHeight();
        int paddingLeft = layoutManagerHelper.getPaddingLeft() + layoutManagerHelper.getPaddingRight() + getHorizontalMargin() + getHorizontalPadding();
        int paddingTop = layoutManagerHelper.getPaddingTop() + layoutManagerHelper.getPaddingBottom() + getVerticalMargin() + getVerticalPadding();
        if (allChildren == 5) {
            i = handleFive(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop);
        } else if (allChildren == 6) {
            i = handSix(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop);
        } else if (allChildren == 7) {
            i = handSeven(layoutStateWrapper, layoutChunkResult, layoutManagerHelper, z, contentWidth, contentHeight, paddingLeft, paddingTop);
        }
        layoutChunkResult.mConsumed = i;
        Arrays.fill(this.mChildrenViews, (Object) null);
    }

    private int handSix(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        View view3;
        View view4;
        int i5;
        float f;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        float f3;
        OnePlusNLayoutHelperEx onePlusNLayoutHelperEx = this;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        View view5 = onePlusNLayoutHelperEx.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view5.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view = onePlusNLayoutHelperEx.mChildrenViews[5];
        } else {
            view = onePlusNLayoutHelperEx.mChildrenViews[1];
        }
        VirtualLayoutManager.LayoutParams layoutParams2 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view2 = onePlusNLayoutHelperEx.mChildrenViews[4];
        } else {
            view2 = onePlusNLayoutHelperEx.mChildrenViews[2];
        }
        VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
        layoutManagerHelper.getReverseLayout();
        View view6 = onePlusNLayoutHelperEx.mChildrenViews[3];
        VirtualLayoutManager.LayoutParams layoutParams4 = (VirtualLayoutManager.LayoutParams) view6.getLayoutParams();
        boolean reverseLayout = layoutManagerHelper.getReverseLayout();
        View[] viewArr = onePlusNLayoutHelperEx.mChildrenViews;
        if (reverseLayout) {
            view3 = viewArr[2];
        } else {
            view3 = viewArr[4];
        }
        VirtualLayoutManager.LayoutParams layoutParams5 = (VirtualLayoutManager.LayoutParams) view3.getLayoutParams();
        boolean reverseLayout2 = layoutManagerHelper.getReverseLayout();
        View[] viewArr2 = onePlusNLayoutHelperEx.mChildrenViews;
        if (reverseLayout2) {
            view4 = viewArr2[1];
        } else {
            view4 = viewArr2[5];
        }
        VirtualLayoutManager.LayoutParams layoutParams6 = (VirtualLayoutManager.LayoutParams) view4.getLayoutParams();
        float viewMainWeight = onePlusNLayoutHelperEx.getViewMainWeight(0);
        float viewMainWeight2 = onePlusNLayoutHelperEx.getViewMainWeight(1);
        float viewMainWeight3 = onePlusNLayoutHelperEx.getViewMainWeight(2);
        float viewMainWeight4 = onePlusNLayoutHelperEx.getViewMainWeight(3);
        float viewMainWeight5 = onePlusNLayoutHelperEx.getViewMainWeight(4);
        float viewMainWeight6 = onePlusNLayoutHelperEx.getViewMainWeight(5);
        if (z) {
            layoutParams2.topMargin = layoutParams.topMargin;
            int i10 = layoutParams.bottomMargin;
            layoutParams4.bottomMargin = i10;
            layoutParams3.bottomMargin = i10;
            layoutParams3.leftMargin = layoutParams2.leftMargin;
            layoutParams4.rightMargin = layoutParams2.rightMargin;
            layoutParams5.rightMargin = layoutParams2.rightMargin;
            if (!Float.isNaN(onePlusNLayoutHelperEx.mAspectRatio)) {
                layoutParams.height = (int) ((i - i3) / onePlusNLayoutHelperEx.mAspectRatio);
            }
            int i11 = i - i3;
            int i12 = (((i11 - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin;
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
                i7 = i6;
            } else {
                i7 = i6;
                i6 = (int) (((i12 * viewMainWeight3) / 100.0f) + 0.5d);
            }
            int i14 = (((((i11 - layoutParams4.leftMargin) - layoutParams4.rightMargin) - layoutParams5.leftMargin) - layoutParams5.rightMargin) - layoutParams6.leftMargin) - layoutParams6.rightMargin;
            if (Float.isNaN(viewMainWeight4)) {
                f2 = i14 / 3.0f;
            } else {
                f2 = (i12 * viewMainWeight4) / 100.0f;
            }
            int i15 = (int) (f2 + 0.5f);
            if (Float.isNaN(viewMainWeight5)) {
                i8 = i15;
            } else {
                i8 = (int) (((i12 * viewMainWeight5) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight6)) {
                i9 = i15;
            } else {
                i9 = (int) (((i12 * viewMainWeight6) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view5, View.MeasureSpec.makeMeasureSpec(i13 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            int measuredHeight = view5.getMeasuredHeight();
            if (Float.isNaN(this.mRowWeight)) {
                f3 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) / 2.0f;
            } else {
                f3 = (((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) * this.mRowWeight) / 100.0f;
            }
            int i16 = (int) (f3 + 0.5f);
            int i17 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) - i16;
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i7 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.topMargin + i16 + layoutParams2.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i6 + layoutParams3.leftMargin + layoutParams3.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.topMargin + i17 + layoutParams3.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view6, View.MeasureSpec.makeMeasureSpec(i15 + layoutParams4.leftMargin + layoutParams4.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams4.topMargin + i17 + layoutParams4.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(i8 + layoutParams5.leftMargin + layoutParams5.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams5.topMargin + i17 + layoutParams5.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view4, View.MeasureSpec.makeMeasureSpec(i9 + layoutParams6.leftMargin + layoutParams6.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams6.topMargin + i17 + layoutParams6.bottomMargin, 1073741824));
            i5 = Math.max(measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin, (i16 + layoutParams2.topMargin + layoutParams2.bottomMargin) * 2) + Math.max(layoutParams4.topMargin + i17 + layoutParams4.bottomMargin, Math.max(layoutParams5.topMargin + i17 + layoutParams5.bottomMargin, i17 + layoutParams6.topMargin + layoutParams6.bottomMargin)) + getVerticalMargin() + getVerticalPadding();
            onePlusNLayoutHelperEx = this;
            onePlusNLayoutHelperEx.calculateRect((i5 - getVerticalMargin()) - getVerticalPadding(), onePlusNLayoutHelperEx.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = onePlusNLayoutHelperEx.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view5);
            layoutChildWithMargin(view5, onePlusNLayoutHelperEx.mAreaRect.left, onePlusNLayoutHelperEx.mAreaRect.top, decoratedMeasurementInOther, onePlusNLayoutHelperEx.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view6), layoutManagerHelper);
            View view7 = view;
            layoutChildWithMargin(view7, decoratedMeasurementInOther, onePlusNLayoutHelperEx.mAreaRect.top, decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view), onePlusNLayoutHelperEx.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), layoutManagerHelper);
            View view8 = view2;
            layoutChildWithMargin(view8, decoratedMeasurementInOther, onePlusNLayoutHelperEx.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view2), decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view2), onePlusNLayoutHelperEx.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view6), layoutManagerHelper);
            int decoratedMeasurementInOther2 = onePlusNLayoutHelperEx.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view6);
            layoutChildWithMargin(view6, onePlusNLayoutHelperEx.mAreaRect.left, onePlusNLayoutHelperEx.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view6), decoratedMeasurementInOther2, onePlusNLayoutHelperEx.mAreaRect.bottom, layoutManagerHelper);
            int decoratedMeasurementInOther3 = decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view3);
            layoutChildWithMargin(view3, decoratedMeasurementInOther2, onePlusNLayoutHelperEx.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view3), decoratedMeasurementInOther3, onePlusNLayoutHelperEx.mAreaRect.bottom, layoutManagerHelper);
            View view9 = view4;
            layoutChildWithMargin(view9, decoratedMeasurementInOther3, onePlusNLayoutHelperEx.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view4), decoratedMeasurementInOther3 + mainOrientationHelper.getDecoratedMeasurementInOther(view4), onePlusNLayoutHelperEx.mAreaRect.bottom, layoutManagerHelper);
        } else {
            i5 = 0;
        }
        onePlusNLayoutHelperEx.handleStateOnResult(layoutChunkResult, onePlusNLayoutHelperEx.mChildrenViews);
        return i5;
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
            int i10 = layoutParams.bottomMargin;
            layoutParams4.bottomMargin = i10;
            layoutParams3.bottomMargin = i10;
            layoutParams3.leftMargin = layoutParams2.leftMargin;
            layoutParams4.rightMargin = layoutParams2.rightMargin;
            layoutParams5.rightMargin = layoutParams3.rightMargin;
            if (!Float.isNaN(this.mAspectRatio)) {
                layoutParams.height = (int) ((i - i3) / this.mAspectRatio);
            }
            int i11 = ((((((i - i3) - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin) - layoutParams3.leftMargin) - layoutParams3.rightMargin;
            if (Float.isNaN(viewMainWeight)) {
                f = i11 / 3.0f;
            } else {
                f = (i11 * viewMainWeight) / 100.0f;
            }
            int i12 = (int) (f + 0.5f);
            if (Float.isNaN(viewMainWeight2)) {
                i6 = (i11 - i12) / 2;
            } else {
                i6 = (int) (((i11 * viewMainWeight2) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight3)) {
                i7 = i6;
            } else {
                i7 = (int) (((i11 * viewMainWeight3) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight4)) {
                i8 = i6;
            } else {
                i8 = (int) (((i11 * viewMainWeight4) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight5)) {
                i9 = i6;
            } else {
                i9 = (int) (((i11 * viewMainWeight5) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view5, View.MeasureSpec.makeMeasureSpec(i12 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            int measuredHeight = view5.getMeasuredHeight();
            if (Float.isNaN(this.mRowWeight)) {
                f2 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) / 2.0f;
            } else {
                f2 = (((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) * this.mRowWeight) / 100.0f;
            }
            int i13 = (int) (f2 + 0.5f);
            int i14 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) - i13;
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i6 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.topMargin + i13 + layoutParams2.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i7 + layoutParams3.leftMargin + layoutParams3.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.topMargin + i14 + layoutParams3.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(i8 + layoutParams4.leftMargin + layoutParams4.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams4.topMargin + i14 + layoutParams4.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view4, View.MeasureSpec.makeMeasureSpec(i9 + layoutParams5.leftMargin + layoutParams5.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams5.topMargin + i14 + layoutParams5.bottomMargin, 1073741824));
            i5 = Math.max(measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin, i13 + layoutParams2.topMargin + layoutParams2.bottomMargin + Math.max(layoutParams3.topMargin + i14 + layoutParams3.bottomMargin, i14 + layoutParams4.topMargin + layoutParams4.bottomMargin)) + getVerticalMargin() + getVerticalPadding();
            calculateRect((i5 - getVerticalMargin()) - getVerticalPadding(), this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = this.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view5);
            layoutChildWithMargin(view5, this.mAreaRect.left, this.mAreaRect.top, decoratedMeasurementInOther, this.mAreaRect.bottom, layoutManagerHelper);
            int decoratedMeasurementInOther2 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view);
            layoutChildWithMargin(view, decoratedMeasurementInOther, this.mAreaRect.top, decoratedMeasurementInOther2, this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), layoutManagerHelper);
            View view6 = view2;
            layoutChildWithMargin(view6, decoratedMeasurementInOther2, this.mAreaRect.top, decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view2), this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view2), layoutManagerHelper);
            int decoratedMeasurementInOther3 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view3);
            layoutChildWithMargin(view3, decoratedMeasurementInOther, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view3), decoratedMeasurementInOther3, this.mAreaRect.bottom, layoutManagerHelper);
            layoutChildWithMargin(view4, decoratedMeasurementInOther3, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view4), decoratedMeasurementInOther3 + mainOrientationHelper.getDecoratedMeasurementInOther(view4), this.mAreaRect.bottom, layoutManagerHelper);
        } else {
            i5 = 0;
        }
        handleStateOnResult(layoutChunkResult, this.mChildrenViews);
        return i5;
    }

    private int handSeven(VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper, boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2;
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        View view7 = this.mChildrenViews[0];
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view7.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view = this.mChildrenViews[6];
        } else {
            view = this.mChildrenViews[1];
        }
        VirtualLayoutManager.LayoutParams layoutParams2 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view2 = this.mChildrenViews[5];
        } else {
            view2 = this.mChildrenViews[2];
        }
        VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view3 = this.mChildrenViews[4];
        } else {
            view3 = this.mChildrenViews[3];
        }
        VirtualLayoutManager.LayoutParams layoutParams4 = (VirtualLayoutManager.LayoutParams) view3.getLayoutParams();
        boolean reverseLayout = layoutManagerHelper.getReverseLayout();
        View[] viewArr = this.mChildrenViews;
        if (reverseLayout) {
            view4 = viewArr[3];
        } else {
            view4 = viewArr[4];
        }
        VirtualLayoutManager.LayoutParams layoutParams5 = (VirtualLayoutManager.LayoutParams) view4.getLayoutParams();
        boolean reverseLayout2 = layoutManagerHelper.getReverseLayout();
        View[] viewArr2 = this.mChildrenViews;
        if (reverseLayout2) {
            view5 = viewArr2[2];
        } else {
            view5 = viewArr2[5];
        }
        VirtualLayoutManager.LayoutParams layoutParams6 = (VirtualLayoutManager.LayoutParams) view5.getLayoutParams();
        if (layoutManagerHelper.getReverseLayout()) {
            view6 = this.mChildrenViews[1];
        } else {
            view6 = this.mChildrenViews[6];
        }
        VirtualLayoutManager.LayoutParams layoutParams7 = (VirtualLayoutManager.LayoutParams) view6.getLayoutParams();
        float viewMainWeight = getViewMainWeight(0);
        float viewMainWeight2 = getViewMainWeight(1);
        float viewMainWeight3 = getViewMainWeight(2);
        float viewMainWeight4 = getViewMainWeight(3);
        float viewMainWeight5 = getViewMainWeight(4);
        float viewMainWeight6 = getViewMainWeight(5);
        float viewMainWeight7 = getViewMainWeight(6);
        if (z) {
            if (!Float.isNaN(this.mAspectRatio)) {
                layoutParams.height = (int) ((i - i3) / this.mAspectRatio);
            }
            int i12 = ((((((i - i3) - layoutParams.leftMargin) - layoutParams.rightMargin) - layoutParams2.leftMargin) - layoutParams2.rightMargin) - layoutParams3.leftMargin) - layoutParams3.rightMargin;
            if (Float.isNaN(viewMainWeight)) {
                f = i12 / 3.0f;
            } else {
                f = (i12 * viewMainWeight) / 100.0f;
            }
            int i13 = (int) (f + 0.5f);
            if (Float.isNaN(viewMainWeight2)) {
                i6 = (i12 - i13) / 2;
            } else {
                i6 = (int) (((i12 * viewMainWeight2) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight3)) {
                i7 = i6;
            } else {
                i7 = (int) (((i12 * viewMainWeight3) / 100.0f) + 0.5d);
            }
            if (Float.isNaN(viewMainWeight4)) {
                i8 = i6;
            } else {
                i8 = (int) (((i12 * viewMainWeight4) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight5)) {
                i9 = i6;
            } else {
                i9 = (int) (((i12 * viewMainWeight5) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight6)) {
                i10 = i6;
            } else {
                i10 = (int) (((i12 * viewMainWeight6) / 100.0f) + 0.5f);
            }
            if (Float.isNaN(viewMainWeight6)) {
                i11 = i6;
            } else {
                i11 = (int) (((i12 * viewMainWeight7) / 100.0f) + 0.5f);
            }
            layoutManagerHelper.measureChildWithMargins(view7, View.MeasureSpec.makeMeasureSpec(i13 + layoutParams.leftMargin + layoutParams.rightMargin, 1073741824), layoutManagerHelper.getChildMeasureSpec(layoutManagerHelper.getContentHeight(), layoutParams.height, true));
            int measuredHeight = view7.getMeasuredHeight();
            if (Float.isNaN(this.mRowWeight)) {
                f2 = ((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) / 3.0f;
            } else {
                f2 = (((measuredHeight - layoutParams2.bottomMargin) - layoutParams3.topMargin) * this.mRowWeight) / 100.0f;
            }
            int i14 = (int) (f2 + 0.5f);
            layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i6 + layoutParams2.leftMargin + layoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams2.topMargin + i14 + layoutParams2.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i7 + layoutParams3.leftMargin + layoutParams3.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams3.topMargin + i14 + layoutParams3.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(i8 + layoutParams4.leftMargin + layoutParams4.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams4.topMargin + i14 + layoutParams4.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view4, View.MeasureSpec.makeMeasureSpec(i9 + layoutParams5.leftMargin + layoutParams5.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams5.topMargin + i14 + layoutParams5.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view5, View.MeasureSpec.makeMeasureSpec(i10 + layoutParams6.leftMargin + layoutParams6.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams6.topMargin + i14 + layoutParams6.bottomMargin, 1073741824));
            layoutManagerHelper.measureChildWithMargins(view6, View.MeasureSpec.makeMeasureSpec(i11 + layoutParams7.leftMargin + layoutParams7.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams7.topMargin + i14 + layoutParams7.bottomMargin, 1073741824));
            i5 = Math.max(measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin, Math.max(layoutParams2.topMargin + i14 + layoutParams2.bottomMargin, layoutParams3.topMargin + i14 + layoutParams3.bottomMargin) + Math.max(layoutParams4.topMargin + i14 + layoutParams4.bottomMargin, layoutParams5.topMargin + i14 + layoutParams5.bottomMargin) + Math.max(layoutParams6.topMargin + i14 + layoutParams6.bottomMargin, i14 + layoutParams7.topMargin + layoutParams7.bottomMargin)) + getVerticalMargin() + getVerticalPadding();
            calculateRect((i5 - getVerticalMargin()) - getVerticalPadding(), this.mAreaRect, layoutStateWrapper, layoutManagerHelper);
            int decoratedMeasurementInOther = this.mAreaRect.left + mainOrientationHelper.getDecoratedMeasurementInOther(view7);
            layoutChildWithMargin(view7, this.mAreaRect.left, this.mAreaRect.top, decoratedMeasurementInOther, this.mAreaRect.bottom, layoutManagerHelper);
            int decoratedMeasurementInOther2 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view);
            layoutChildWithMargin(view, decoratedMeasurementInOther, this.mAreaRect.top, decoratedMeasurementInOther2, this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), layoutManagerHelper);
            View view8 = view2;
            layoutChildWithMargin(view8, decoratedMeasurementInOther2, this.mAreaRect.top, decoratedMeasurementInOther2 + mainOrientationHelper.getDecoratedMeasurementInOther(view2), this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view2), layoutManagerHelper);
            int decoratedMeasurementInOther3 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view3);
            layoutChildWithMargin(view3, decoratedMeasurementInOther, this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), decoratedMeasurementInOther3, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view5), layoutManagerHelper);
            View view9 = view4;
            layoutChildWithMargin(view9, decoratedMeasurementInOther3, this.mAreaRect.top + mainOrientationHelper.getDecoratedMeasurement(view), decoratedMeasurementInOther3 + mainOrientationHelper.getDecoratedMeasurementInOther(view4), this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view6), layoutManagerHelper);
            int decoratedMeasurementInOther4 = decoratedMeasurementInOther + mainOrientationHelper.getDecoratedMeasurementInOther(view5);
            layoutChildWithMargin(view5, decoratedMeasurementInOther, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view5), decoratedMeasurementInOther4, this.mAreaRect.bottom, layoutManagerHelper);
            layoutChildWithMargin(view6, decoratedMeasurementInOther4, this.mAreaRect.bottom - mainOrientationHelper.getDecoratedMeasurement(view6), decoratedMeasurementInOther4 + mainOrientationHelper.getDecoratedMeasurementInOther(view6), this.mAreaRect.bottom, layoutManagerHelper);
        } else {
            i5 = 0;
        }
        handleStateOnResult(layoutChunkResult, this.mChildrenViews);
        return i5;
    }
}
