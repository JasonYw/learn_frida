package com.airbnb.lottie;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface ImageAssetDelegateAsync extends ImageAssetDelegate {
    static {
        Covode.recordClassIndex(3902);
    }

    void fetchBitmapAsync(LottieImageAsset lottieImageAsset, LottieCallback<Bitmap> lottieCallback);
}
