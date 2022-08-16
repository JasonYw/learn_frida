package com.android.ttcjpaysdk.base.framework.event;

import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public final class CJPayLoginEvent extends BaseEvent {
    public final int LIZ;

    static {
        Covode.recordClassIndex(6032);
    }

    public CJPayLoginEvent(int i) {
        this.LIZ = i;
    }
}
