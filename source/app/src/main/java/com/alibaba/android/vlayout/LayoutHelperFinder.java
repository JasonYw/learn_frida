package com.alibaba.android.vlayout;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class LayoutHelperFinder {
    static {
        Covode.recordClassIndex(4340);
    }

    public abstract LayoutHelper getLayoutHelper(int i);

    public abstract List<LayoutHelper> getLayoutHelpers();

    public abstract List<LayoutHelper> reverse();

    public abstract void setLayouts(List<LayoutHelper> list);
}
