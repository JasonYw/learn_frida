package com.byted.cast.proxy;

import com.bytedance.covode.number.Covode;

/* loaded from: classes8.dex */
public interface IMonitor {
    static {
        Covode.recordClassIndex(9773);
    }

    void onEvent(String str, Event event);

    void onException(String str, Exception exc);
}
