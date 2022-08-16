package com.bytedance.android.live.core.utils.rxutils.autodispose.lifecycle;

import com.bytedance.android.live.core.utils.rxutils.autodispose.OutsideScopeException;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class LifecycleNotStartedException extends OutsideScopeException {
    static {
        Covode.recordClassIndex(24032);
    }

    public LifecycleNotStartedException() {
        this("Lifecycle hasn't started!");
    }

    public LifecycleNotStartedException(String str) {
        super(str);
    }
}
