package com.airbnb.lottie.value;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface SimpleLottieValueCallback<T> {
    static {
        Covode.recordClassIndex(4162);
    }

    T getValue(LottieFrameInfo<T> lottieFrameInfo);
}
