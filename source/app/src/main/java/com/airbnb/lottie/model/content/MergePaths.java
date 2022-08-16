package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0810L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.p047a.p048a.AbstractC0827c;
import com.bytedance.covode.number.Covode;
import com.umeng.analytics.pro.C33753n;
import p003X.C145263ejr;

/* loaded from: classes19.dex */
public final class MergePaths implements AbstractC0846b {
    public final String LIZ;
    public final MergePathsMode LIZIZ;

    static {
        Covode.recordClassIndex(C33753n.C33755a.f42380g);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.LIZIZ + '}';
    }

    /* loaded from: classes19.dex */
    public enum MergePathsMode {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        static {
            Covode.recordClassIndex(4104);
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode) {
        this.LIZ = str;
        this.LIZIZ = mergePathsMode;
    }

    @Override // com.airbnb.lottie.model.content.AbstractC0846b
    public final AbstractC0827c LIZ(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a) {
        if (!lottieDrawable.enableMergePathsForKitKatAndAbove()) {
            C0810L.warn("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C145263ejr(this);
    }
}
