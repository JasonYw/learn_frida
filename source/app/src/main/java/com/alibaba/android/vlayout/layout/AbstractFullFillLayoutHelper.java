package com.alibaba.android.vlayout.layout;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.Range;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public abstract class AbstractFullFillLayoutHelper extends BaseLayoutHelper {
    public boolean hasFooter;
    public boolean hasHeader;
    public boolean mLayoutWithAnchor;
    public LayoutManagerHelper mTempLayoutHelper;

    static {
        Covode.recordClassIndex(4373);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return true;
    }

    public void doLayoutView(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
    }

    public final void setMeasuredDimension(int i, int i2) {
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    public void setHasFooter(boolean z) {
        this.hasFooter = z;
    }

    public void setHasHeader(boolean z) {
        this.hasHeader = z;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        if (anchorInfoWrapper.layoutFromEnd) {
            if (!this.hasFooter) {
                anchorInfoWrapper.position = getRange().getUpper().intValue();
            }
        } else if (!this.hasHeader) {
            anchorInfoWrapper.position = getRange().getLower().intValue();
        }
        this.mLayoutWithAnchor = true;
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeAlignOffset(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
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

    public void calculateRect(int i, Rect rect, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutManagerHelper layoutManagerHelper) {
        int i2 = 0;
        if (layoutManagerHelper.getOrientation() == 1) {
            rect.left = layoutManagerHelper.getPaddingLeft() + this.mMarginLeft + this.mPaddingLeft;
            rect.right = ((layoutManagerHelper.getContentWidth() - layoutManagerHelper.getPaddingRight()) - this.mMarginRight) - this.mPaddingRight;
            if (layoutStateWrapper.getLayoutDirection() == -1) {
                int offset = layoutStateWrapper.getOffset();
                if (!this.mLayoutWithAnchor && !this.hasFooter) {
                    i2 = this.mMarginBottom + this.mPaddingBottom;
                }
                rect.bottom = offset - i2;
                rect.top = rect.bottom - i;
                return;
            }
            int offset2 = layoutStateWrapper.getOffset();
            if (!this.mLayoutWithAnchor && !this.hasHeader) {
                i2 = this.mMarginTop + this.mPaddingTop;
            }
            rect.top = offset2 + i2;
            rect.bottom = rect.top + i;
            return;
        }
        rect.top = layoutManagerHelper.getPaddingTop() + this.mMarginTop + this.mPaddingTop;
        rect.bottom = ((layoutManagerHelper.getContentHeight() - layoutManagerHelper.getPaddingBottom()) - this.mMarginBottom) - this.mPaddingBottom;
        if (layoutStateWrapper.getLayoutDirection() == -1) {
            int offset3 = layoutStateWrapper.getOffset();
            if (!this.mLayoutWithAnchor && !this.hasFooter) {
                i2 = this.mMarginRight + this.mPaddingRight;
            }
            rect.right = offset3 - i2;
            rect.left = rect.right - i;
            return;
        }
        int offset4 = layoutStateWrapper.getOffset();
        if (!this.mLayoutWithAnchor && !this.hasHeader) {
            i2 = this.mMarginLeft + this.mPaddingLeft;
        }
        rect.left = offset4 + i2;
        rect.right = rect.left + i;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    public void layoutViews(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.LayoutStateWrapper layoutStateWrapper, LayoutChunkResult layoutChunkResult, LayoutManagerHelper layoutManagerHelper) {
        this.mTempLayoutHelper = layoutManagerHelper;
        doLayoutView(recycler, state, layoutStateWrapper, layoutChunkResult, layoutManagerHelper);
        this.mTempLayoutHelper = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r5 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        r2 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r4 >= r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        r1 = r7[r4];
        r7[r4] = r7[r2];
        r7[r2] = r1;
        r4 = r4 + 1;
        r2 = r2 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getAllChildren(android.view.View[] r7, androidx.recyclerview.widget.RecyclerView.Recycler r8, com.alibaba.android.vlayout.VirtualLayoutManager.LayoutStateWrapper r9, com.alibaba.android.vlayout.layout.LayoutChunkResult r10, com.alibaba.android.vlayout.LayoutManagerHelper r11) {
        /*
            r6 = this;
            int r0 = r9.getItemDirection()
            r4 = 0
            r5 = 1
            if (r0 == r5) goto L9
            r5 = 0
        L9:
            com.alibaba.android.vlayout.Range r0 = r6.getRange()
            if (r5 == 0) goto L4f
            java.lang.Comparable r0 = r0.getLower()
        L13:
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            r9.getCurrentPosition()
            r3 = 0
        L1c:
            int r0 = r7.length
            if (r3 >= r0) goto L54
            int r0 = r9.getCurrentPosition()
            boolean r0 = r6.isOutOfRange(r0)
            if (r0 != 0) goto L54
            android.view.View r2 = r6.nextView(r8, r9, r11, r10)
            if (r2 == 0) goto L54
            r7[r3] = r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L41
            android.view.ViewGroup$LayoutParams r0 = r6.generateDefaultLayoutParams()
            r2.setLayoutParams(r0)
        L3e:
            int r3 = r3 + 1
            goto L1c
        L41:
            boolean r0 = r6.checkLayoutParams(r1)
            if (r0 != 0) goto L3e
            android.view.ViewGroup$LayoutParams r0 = r6.generateLayoutParams(r1)
            r2.setLayoutParams(r0)
            goto L3e
        L4f:
            java.lang.Comparable r0 = r0.getUpper()
            goto L13
        L54:
            if (r3 <= 0) goto L69
            if (r5 != 0) goto L69
            int r2 = r3 + (-1)
        L5a:
            if (r4 >= r2) goto L69
            r1 = r7[r4]
            r0 = r7[r2]
            r7[r4] = r0
            r7[r2] = r1
            int r4 = r4 + 1
            int r2 = r2 + (-1)
            goto L5a
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper.getAllChildren(android.view.View[], androidx.recyclerview.widget.RecyclerView$Recycler, com.alibaba.android.vlayout.VirtualLayoutManager$LayoutStateWrapper, com.alibaba.android.vlayout.layout.LayoutChunkResult, com.alibaba.android.vlayout.LayoutManagerHelper):int");
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public boolean isRecyclable(int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper, boolean z) {
        Range<Integer> range = getRange();
        if (!range.contains((Range<Integer>) Integer.valueOf(i))) {
            return true;
        }
        if (this.hasHeader && i == getRange().getLower().intValue()) {
            return true;
        }
        if (this.hasFooter && i == getRange().getUpper().intValue()) {
            return true;
        }
        return Range.create(Integer.valueOf(i2), Integer.valueOf(i3)).contains(Range.create(Integer.valueOf(range.getLower().intValue() + (this.hasHeader ? 1 : 0)), Integer.valueOf(range.getUpper().intValue() - (this.hasFooter ? 1 : 0))));
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void afterLayout(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, LayoutManagerHelper layoutManagerHelper) {
        super.afterLayout(recycler, state, i, i2, i3, layoutManagerHelper);
        this.mLayoutWithAnchor = false;
    }
}
