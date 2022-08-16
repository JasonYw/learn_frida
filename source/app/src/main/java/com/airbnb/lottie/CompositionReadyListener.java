package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface CompositionReadyListener {
    static {
        Covode.recordClassIndex(3899);
    }

    void onCompositionFailed(String str);

    void onCompositionReady(LottieComposition lottieComposition);
}
