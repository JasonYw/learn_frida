package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.p047a.p048a.AbstractC0827c;
import com.airbnb.lottie.p047a.p048a.C0828d;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;
import p002O.C0002O;

/* renamed from: com.airbnb.lottie.model.content.j */
/* loaded from: classes19.dex */
public final class C0849j implements AbstractC0846b {
    public final String LIZ;
    public final List<AbstractC0846b> LIZIZ;

    static {
        Covode.recordClassIndex(4122);
    }

    public final String toString() {
        return C0002O.m25083C("ShapeGroup{name='", this.LIZ, "' Shapes: ", Arrays.toString(this.LIZIZ.toArray()), '}');
    }

    public C0849j(String str, List<AbstractC0846b> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }

    @Override // com.airbnb.lottie.model.content.AbstractC0846b
    public final AbstractC0827c LIZ(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a) {
        return new C0828d(lottieDrawable, abstractC0851a, this);
    }
}
