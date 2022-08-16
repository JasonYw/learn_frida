package com.bytedance.android.live.lottie;

import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;
import io.reactivex.Observable;

/* loaded from: classes8.dex */
public interface ILottieService extends IService {
    static {
        Covode.recordClassIndex(32131);
    }

    void finishLottieAnimation();

    Observable<Integer> tryStartLottieAnimation(long j, boolean z);
}
