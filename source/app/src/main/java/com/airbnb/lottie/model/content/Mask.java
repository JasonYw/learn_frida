package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.p051a.C0836d;
import com.bytedance.covode.number.Covode;
import com.umeng.analytics.pro.C33753n;
import p003X.C145161eiD;

/* loaded from: classes19.dex */
public final class Mask {
    public final MaskMode LIZ;
    public final C145161eiD LIZIZ;
    public final C0836d LIZJ;

    static {
        Covode.recordClassIndex(4101);
    }

    /* loaded from: classes19.dex */
    public enum MaskMode {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect;

        static {
            Covode.recordClassIndex(C33753n.C33755a.f42379f);
        }
    }

    public Mask(MaskMode maskMode, C145161eiD c145161eiD, C0836d c0836d) {
        this.LIZ = maskMode;
        this.LIZIZ = c145161eiD;
        this.LIZJ = c0836d;
    }
}
