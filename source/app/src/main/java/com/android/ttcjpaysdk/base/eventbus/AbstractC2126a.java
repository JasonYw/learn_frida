package com.android.ttcjpaysdk.base.eventbus;

import com.bytedance.covode.number.Covode;

/* renamed from: com.android.ttcjpaysdk.base.eventbus.a */
/* loaded from: classes17.dex */
public interface AbstractC2126a {
    static {
        Covode.recordClassIndex(6015);
    }

    Class<? extends BaseEvent>[] listEvents();

    void onEvent(BaseEvent baseEvent);
}
