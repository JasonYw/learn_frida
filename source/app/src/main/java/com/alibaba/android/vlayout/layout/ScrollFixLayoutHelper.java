package com.alibaba.android.vlayout.layout;

import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class ScrollFixLayoutHelper extends FixLayoutHelper {
    public int mShowType;

    static {
        Covode.recordClassIndex(4402);
    }

    public int getShowType() {
        return this.mShowType;
    }

    public void setShowType(int i) {
        this.mShowType = i;
    }

    public ScrollFixLayoutHelper(int i, int i2) {
        this(0, i, i2);
    }

    public ScrollFixLayoutHelper(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    @Override // com.alibaba.android.vlayout.layout.FixLayoutHelper
    public boolean shouldBeDraw(LayoutManagerHelper layoutManagerHelper, int i, int i2, int i3) {
        int i4 = this.mShowType;
        if (i4 != 1) {
            if (i4 == 2 && i < getRange().getLower().intValue() + 1) {
                return false;
            }
            return true;
        } else if (i2 < getRange().getLower().intValue() - 1) {
            return false;
        } else {
            return true;
        }
    }
}
