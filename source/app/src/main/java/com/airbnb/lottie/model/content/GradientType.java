package com.airbnb.lottie.model.content;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;

/* loaded from: classes18.dex */
public enum GradientType {
    Linear,
    Radial;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(4100);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(4100);
        Linear = new GradientType();
        Radial = new GradientType();
        $VALUES = new GradientType[]{Linear, Radial};
    }
}
