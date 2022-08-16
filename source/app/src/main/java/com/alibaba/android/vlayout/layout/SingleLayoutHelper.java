package com.alibaba.android.vlayout.layout;

import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class SingleLayoutHelper extends ColumnLayoutHelper {
    public int mPos = -1;

    static {
        Covode.recordClassIndex(4403);
    }

    public SingleLayoutHelper() {
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

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public void onRangeChange(int i, int i2) {
        this.mPos = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
        if (r8 != false) goto L16;
     */
    @Override // com.alibaba.android.vlayout.layout.ColumnLayoutHelper, com.alibaba.android.vlayout.layout.AbstractFullFillLayoutHelper, com.alibaba.android.vlayout.layout.BaseLayoutHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutViews(androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20, com.alibaba.android.vlayout.VirtualLayoutManager.LayoutStateWrapper r21, com.alibaba.android.vlayout.layout.LayoutChunkResult r22, com.alibaba.android.vlayout.LayoutManagerHelper r23) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.layout.SingleLayoutHelper.layoutViews(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.vlayout.VirtualLayoutManager$LayoutStateWrapper, com.alibaba.android.vlayout.layout.LayoutChunkResult, com.alibaba.android.vlayout.LayoutManagerHelper):void");
    }
}
