package com.alibaba.android.vlayout;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface LayoutViewFactory {
    static {
        Covode.recordClassIndex(4343);
    }

    View generateLayoutView(Context context);
}
