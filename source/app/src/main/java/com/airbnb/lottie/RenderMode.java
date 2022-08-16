package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;

/* loaded from: classes19.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(3970);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(3970);
        AUTOMATIC = new RenderMode();
        HARDWARE = new RenderMode();
        SOFTWARE = new RenderMode();
        $VALUES = new RenderMode[]{AUTOMATIC, HARDWARE, SOFTWARE};
    }
}
