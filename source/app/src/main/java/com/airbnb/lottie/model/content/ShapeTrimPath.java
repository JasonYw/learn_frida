package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.model.p051a.C0834b;
import com.airbnb.lottie.p047a.p048a.AbstractC0827c;
import com.airbnb.lottie.p047a.p048a.C0831t;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class ShapeTrimPath implements AbstractC0846b {
    public final String LIZ;
    public final Type LIZIZ;
    public final C0834b LIZJ;
    public final C0834b LIZLLL;

    /* renamed from: LJ */
    public final C0834b f21088LJ;

    static {
        Covode.recordClassIndex(4111);
    }

    /* loaded from: classes19.dex */
    public enum Type {
        Simultaneously,
        Individually;

        static {
            Covode.recordClassIndex(4112);
        }
    }

    public final String toString() {
        return "Trim Path: {start: " + this.LIZJ + ", end: " + this.LIZLLL + ", offset: " + this.f21088LJ + "}";
    }

    @Override // com.airbnb.lottie.model.content.AbstractC0846b
    public final AbstractC0827c LIZ(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a) {
        return new C0831t(abstractC0851a, this);
    }

    public ShapeTrimPath(String str, Type type, C0834b c0834b, C0834b c0834b2, C0834b c0834b3) {
        this.LIZ = str;
        this.LIZIZ = type;
        this.LIZJ = c0834b;
        this.LIZLLL = c0834b2;
        this.f21088LJ = c0834b3;
    }
}
