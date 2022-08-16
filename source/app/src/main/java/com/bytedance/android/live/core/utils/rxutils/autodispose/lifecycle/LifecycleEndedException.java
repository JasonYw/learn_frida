package com.bytedance.android.live.core.utils.rxutils.autodispose.lifecycle;

import com.bytedance.android.live.core.utils.rxutils.autodispose.OutsideScopeException;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class LifecycleEndedException extends OutsideScopeException {
    static {
        Covode.recordClassIndex(24031);
    }

    public LifecycleEndedException() {
        this("Lifecycle has ended!");
    }

    public LifecycleEndedException(String str) {
        super(str);
    }
}
