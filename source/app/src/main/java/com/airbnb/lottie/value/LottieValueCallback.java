package com.airbnb.lottie.value;

import com.bytedance.covode.number.Covode;
import p003X.AbstractC145179eiV;

/* loaded from: classes19.dex */
public class LottieValueCallback<T> {
    public AbstractC145179eiV<?, ?> animation;
    public final LottieFrameInfo<T> frameInfo;
    public T value;

    static {
        Covode.recordClassIndex(4161);
    }

    public LottieValueCallback() {
        this.frameInfo = new LottieFrameInfo<>();
        this.value = null;
    }

    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    public final void setAnimation(AbstractC145179eiV<?, ?> abstractC145179eiV) {
        this.animation = abstractC145179eiV;
    }

    public final void setValue(T t) {
        this.value = t;
        AbstractC145179eiV<?, ?> abstractC145179eiV = this.animation;
        if (abstractC145179eiV != null) {
            abstractC145179eiV.LIZ();
        }
    }

    public LottieValueCallback(T t) {
        this.frameInfo = new LottieFrameInfo<>();
        this.value = null;
        this.value = t;
    }

    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        LottieFrameInfo<T> lottieFrameInfo = this.frameInfo;
        lottieFrameInfo.set(f, f2, t, t2, f3, f4, f5);
        return getValue(lottieFrameInfo);
    }
}
