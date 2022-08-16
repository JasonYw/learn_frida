package com.alibaba.android.vlayout.layout;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class LinearLayoutHelper extends BaseLayoutHelper {
    public int mDividerHeight;
    public boolean mLayoutWithAnchor;

    static {
        Covode.recordClassIndex(4394);
    }

    public LinearLayoutHelper() {
        this(0);
    }

    public void setDividerHeight(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mDividerHeight = i;
    }

    public LinearLayoutHelper(int i) {
        this(i, 0);
    }

    public LinearLayoutHelper(int i, int i2) {
        setItemCount(i2);
        setDividerHeight(i);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void checkAnchorInfo(RecyclerView.State state, VirtualLayoutManager.AnchorInfoWrapper anchorInfoWrapper, LayoutManagerHelper layoutManagerHelper) {
        super.checkAnchorInfo(state, anchorInfoWrapper, layoutManagerHelper);
        this.mLayoutWithAnchor = true;
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeAlignOffset(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        boolean z3;
        if (layoutManagerHelper.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
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
        return super.computeAlignOffset(i, z, z2, layoutManagerHelper);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r11 == getRange().getLower().intValue()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
        if (r8 >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0214, code lost:
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0210, code lost:
        if (r11 == getRange().getUpper().intValue()) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutViews(androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20, com.alibaba.android.vlayout.VirtualLayoutManager.LayoutStateWrapper r21, com.alibaba.android.vlayout.layout.LayoutChunkResult r22, com.alibaba.android.vlayout.LayoutManagerHelper r23) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.LinearLayoutHelper.layoutViews(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.vlayout.VirtualLayoutManager$LayoutStateWrapper, com.alibaba.android.vlayout.layout.LayoutChunkResult, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }
}
