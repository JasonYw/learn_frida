package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;

/* loaded from: classes25.dex */
public interface LottieListener<T> {
    static {
        Covode.recordClassIndex(3959);
    }

    void onResult(T t);
}
