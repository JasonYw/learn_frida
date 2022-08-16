package com.alibaba.android.vlayout.layout;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.OrientationHelperEx;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* loaded from: classes20.dex */
public class ColumnLayoutHelper extends AbstractFullFillLayoutHelper {
    public View[] mEqViews;
    public View[] mViews;
    public Rect mTempArea = new Rect();
    public float[] mWeights = new float[0];

    static {
        Covode.recordClassIndex(4379);
    }

    public void setWeights(float[] fArr) {
        if (fArr != null) {
            this.mWeights = Arrays.copyOf(fArr, fArr.length);
        } else {
            this.mWeights = new float[0];
        }
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        if (anchorInfoWrapper.layoutFromEnd) {
            anchorInfoWrapper.position = getRange().getUpper().intValue();
        } else {
            anchorInfoWrapper.position = getRange().getLower().intValue();
        }
    }

    @Override // com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        boolean z;
        int i;
        int childMeasureSpec;
        int i2;
        int i3;
        int i4;
        if (isOutOfRange(layoutStateWrapper.getCurrentPosition())) {
            return;
        }
        boolean z2 = true;
        if (layoutManagerHelper.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        OrientationHelperEx mainOrientationHelper = layoutManagerHelper.getMainOrientationHelper();
        int itemCount = getItemCount();
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != itemCount) {
            this.mViews = new View[itemCount];
        }
        View[] viewArr2 = this.mEqViews;
        if (viewArr2 != null && viewArr2.length == itemCount) {
            Arrays.fill(viewArr2, (Object) null);
        } else {
            this.mEqViews = new View[itemCount];
        }
        int allChildren = getAllChildren(this.mViews, recycler, layoutStateWrapper, layoutChunkResult, layoutManagerHelper);
        if (z) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < allChildren; i8++) {
                ViewGroup.LayoutParams layoutParams = this.mViews[i8].getLayoutParams();
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = Math.max(i6, layoutParams2.leftMargin);
                    i5 += layoutParams2.leftMargin;
                    if (i8 != allChildren - 1) {
                        i6 = layoutParams2.rightMargin;
                        layoutParams2.rightMargin = 0;
                    } else {
                        i5 += layoutParams2.rightMargin;
                    }
                    i7 = Math.max(i7, layoutParams2.topMargin + layoutParams2.bottomMargin);
                }
            }
            int contentWidth = (((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingLeft()) - layoutManagerHelper.getPaddingRight()) - getHorizontalMargin()) - getHorizontalPadding();
            int i9 = contentWidth - i5;
            int i10 = -1;
            if (!Float.isNaN(this.mAspectRatio)) {
                i10 = (int) ((contentWidth / this.mAspectRatio) + 0.5f);
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = Integer.MAX_VALUE;
            while (i11 < allChildren) {
                View view = this.mViews[i11];
                VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
                int contentHeight = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom();
                if (i10 > 0) {
                    i3 = i10;
                } else {
                    i3 = layoutParams3.height;
                }
                int childMeasureSpec2 = layoutManagerHelper.getChildMeasureSpec(contentHeight, i3, z2);
                float[] fArr = this.mWeights;
                if (fArr != null && i11 < fArr.length && !Float.isNaN(fArr[i11])) {
                    float[] fArr2 = this.mWeights;
                    if (fArr2[i11] >= 0.0f) {
                        int i15 = (int) ((((fArr2[i11] * 1.0f) / 100.0f) * i9) + 0.5f);
                        if (!Float.isNaN(layoutParams3.mAspectRatio)) {
                            i4 = 1073741824;
                            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) ((i15 / layoutParams3.mAspectRatio) + 0.5f), 1073741824);
                        } else {
                            i4 = 1073741824;
                        }
                        layoutManagerHelper.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i15, i4), childMeasureSpec2);
                        i13 += i15;
                        i14 = Math.min(i14, view.getMeasuredHeight());
                        i11++;
                        z2 = true;
                    }
                }
                this.mEqViews[i12] = view;
                i12++;
                i11++;
                z2 = true;
            }
            for (int i16 = 0; i16 < i12; i16++) {
                View view2 = this.mEqViews[i16];
                VirtualLayoutManager.LayoutParams layoutParams4 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
                int i17 = (int) ((((i9 - i13) * 1.0f) / i12) + 0.5f);
                if (!Float.isNaN(layoutParams4.mAspectRatio)) {
                    i2 = 1073741824;
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) ((i17 / layoutParams4.mAspectRatio) + 0.5f), 1073741824);
                } else {
                    int contentHeight2 = (layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingTop()) - layoutManagerHelper.getPaddingBottom();
                    if (i10 > 0) {
                        i = i10;
                    } else {
                        i = layoutParams4.height;
                    }
                    childMeasureSpec = layoutManagerHelper.getChildMeasureSpec(contentHeight2, i, true);
                    i2 = 1073741824;
                }
                layoutManagerHelper.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i17, i2), childMeasureSpec);
                i14 = Math.min(i14, view2.getMeasuredHeight());
            }
            for (int i18 = 0; i18 < allChildren; i18++) {
                View view3 = this.mViews[i18];
                if (view3.getMeasuredHeight() != i14) {
                    layoutManagerHelper.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                }
            }
            int i19 = i14 + i7;
            layoutChunkResult.mConsumed = getVerticalMargin() + i19 + getVerticalPadding();
            calculateRect(i19, this.mTempArea, layoutStateWrapper, layoutManagerHelper);
            int i20 = this.mTempArea.left;
            int i21 = 0;
            while (i21 < allChildren) {
                View view4 = this.mViews[i21];
                int i22 = this.mTempArea.top;
                int i23 = this.mTempArea.bottom;
                int decoratedMeasurementInOther = i20 + mainOrientationHelper.getDecoratedMeasurementInOther(view4);
                layoutChildWithMargin(view4, i20, i22, decoratedMeasurementInOther, i23, layoutManagerHelper);
                i21++;
                i20 = decoratedMeasurementInOther;
            }
        }
        Arrays.fill(this.mViews, (Object) null);
        Arrays.fill(this.mEqViews, (Object) null);
    }
}
