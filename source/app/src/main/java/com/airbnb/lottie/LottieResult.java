package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class LottieResult<V> {
    public final Throwable exception;
    public final V value;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(3961);
        } else {
            Covode.recordClassIndex(3961);
        }
    }

    public final Throwable getException() {
        return this.exception;
    }

    public final V getValue() {
        return this.value;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public LottieResult(V v) {
        this.value = v;
    }

    public LottieResult(Throwable th) {
        this.exception = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }
}
