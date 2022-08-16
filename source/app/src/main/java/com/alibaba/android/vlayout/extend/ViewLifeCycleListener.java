package com.alibaba.android.vlayout.extend;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface ViewLifeCycleListener {
    static {
        Covode.recordClassIndex(4372);
    }

    void onAppeared(View view);

    void onAppearing(View view);

    void onDisappeared(View view);

    void onDisappearing(View view);
}
