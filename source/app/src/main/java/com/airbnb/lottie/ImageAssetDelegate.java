package com.airbnb.lottie;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface ImageAssetDelegate {
    static {
        Covode.recordClassIndex(3901);
    }

    Bitmap fetchBitmap(LottieImageAsset lottieImageAsset);
}
