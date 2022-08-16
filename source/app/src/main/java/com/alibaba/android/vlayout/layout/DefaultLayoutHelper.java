package com.alibaba.android.vlayout.layout;

import com.alibaba.android.vlayout.LayoutHelper;
import com.bytedance.covode.number.Covode;

/* loaded from: classes14.dex */
public class DefaultLayoutHelper extends LinearLayoutHelper {
    static {
        Covode.recordClassIndex(4380);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelper
    public boolean isOutOfRange(int i) {
        return false;
    }

    public static LayoutHelper newHelper(int i) {
        DefaultLayoutHelper defaultLayoutHelper = new DefaultLayoutHelper();
        defaultLayoutHelper.setItemCount(i);
        return defaultLayoutHelper;
    }
}
