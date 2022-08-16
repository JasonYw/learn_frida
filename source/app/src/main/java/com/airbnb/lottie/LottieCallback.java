package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface LottieCallback<T> {
    static {
        Covode.recordClassIndex(3916);
    }

    void onFailed();

    void onSuccess(T t);
}
