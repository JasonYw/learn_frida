package com.airbnb.lottie.model;

import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C115854Vj6;
import p003X.C145328eku;

/* loaded from: classes13.dex */
public class LottieCompositionCache {
    public static final LottieCompositionCache LIZIZ;
    public final LruCache<String, LottieComposition> LIZ;

    public static LottieCompositionCache LIZ() {
        return LIZIZ;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(4082);
        LIZIZ = new LottieCompositionCache();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(4082);
        LIZIZ = new LottieCompositionCache();
    }

    public LottieCompositionCache() {
        if (C145328eku.LIZ) {
            if (C145328eku.LJFF && C115854Vj6.LIZ) {
                this.LIZ = new LruCache<>(12);
                return;
            } else {
                this.LIZ = new LruCache<>(20);
                return;
            }
        }
        this.LIZ = new LruCache<>(10485760);
    }

    public final LottieComposition LIZ(String str) {
        if (str == null) {
            return null;
        }
        return this.LIZ.get(str);
    }

    public final void LIZ(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.LIZ.put(str, lottieComposition);
    }
}
