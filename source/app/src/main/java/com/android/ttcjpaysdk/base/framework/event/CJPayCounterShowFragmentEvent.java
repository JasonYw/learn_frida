package com.android.ttcjpaysdk.base.framework.event;

import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public final class CJPayCounterShowFragmentEvent extends BaseEvent {
    public final boolean isNeedAnimation;
    public final int originType;
    public final int respectType;

    static {
        Covode.recordClassIndex(6031);
    }

    public final int getOriginType() {
        return this.originType;
    }

    public final int getRespectType() {
        return this.respectType;
    }

    public final boolean isNeedAnimation() {
        return this.isNeedAnimation;
    }

    public CJPayCounterShowFragmentEvent(int i, int i2, boolean z) {
        this.originType = i;
        this.respectType = i2;
        this.isNeedAnimation = z;
    }
}
