package com.alibaba.android.vlayout.layout;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.alibaba.android.vlayout.LayoutManagerHelper;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public abstract class FixAreaLayoutHelper extends BaseLayoutHelper {
    public FixAreaAdjuster mAdjuster = FixAreaAdjuster.mDefaultAdjuster;
    public FixViewAnimatorHelper mFixViewAnimatorHelper;

    /* loaded from: classes20.dex */
    public interface FixViewAnimatorHelper {
        static {
            Covode.recordClassIndex(4383);
        }

        ViewPropertyAnimator onGetFixViewAppearAnimator(View view);

        ViewPropertyAnimator onGetFixViewDisappearAnimator(View view);
    }

    static {
        Covode.recordClassIndex(4382);
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public void adjustLayout(int i, int i2, LayoutManagerHelper layoutManagerHelper) {
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeMarginEnd(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        return 0;
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computeMarginStart(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        return 0;
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computePaddingEnd(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        return 0;
    }

    @Override // com.alibaba.android.vlayout.layout.MarginLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public int computePaddingStart(int i, boolean z, boolean z2, LayoutManagerHelper layoutManagerHelper) {
        return 0;
    }

    @Override // com.alibaba.android.vlayout.layout.BaseLayoutHelper, com.alibaba.android.vlayout.LayoutHelper
    public boolean isFixLayout() {
        return true;
    }

    public void setAdjuster(FixAreaAdjuster fixAreaAdjuster) {
        this.mAdjuster = fixAreaAdjuster;
    }

    public void setFixViewAnimatorHelper(FixViewAnimatorHelper fixViewAnimatorHelper) {
        this.mFixViewAnimatorHelper = fixViewAnimatorHelper;
    }
}
