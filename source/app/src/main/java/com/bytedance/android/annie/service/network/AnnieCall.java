package com.bytedance.android.annie.service.network;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public interface AnnieCall<T> {
    static {
        Covode.recordClassIndex(11121);
    }

    void cancel();

    T execute();
}
