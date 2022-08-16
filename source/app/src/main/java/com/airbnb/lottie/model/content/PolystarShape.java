package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.model.p051a.C0834b;
import com.airbnb.lottie.p047a.p048a.AbstractC0827c;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC145194eik;
import p003X.C145229ejJ;

/* loaded from: classes19.dex */
public final class PolystarShape implements AbstractC0846b {
    public final String LIZ;
    public final Type LIZIZ;
    public final C0834b LIZJ;
    public final AbstractC145194eik<PointF, PointF> LIZLLL;

    /* renamed from: LJ */
    public final C0834b f21086LJ;
    public final C0834b LJFF;
    public final C0834b LJI;
    public final C0834b LJII;
    public final C0834b LJIIIIZZ;

    static {
        Covode.recordClassIndex(4105);
    }

    /* loaded from: classes19.dex */
    public enum Type {
        Star(1),
        Polygon(2);
        
        public final int value;

        static {
            Covode.recordClassIndex(4106);
        }

        Type(int i) {
            this.value = i;
        }
    }

    @Override // com.airbnb.lottie.model.content.AbstractC0846b
    public final AbstractC0827c LIZ(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a) {
        return new C145229ejJ(lottieDrawable, abstractC0851a, this);
    }

    public PolystarShape(String str, Type type, C0834b c0834b, AbstractC145194eik<PointF, PointF> abstractC145194eik, C0834b c0834b2, C0834b c0834b3, C0834b c0834b4, C0834b c0834b5, C0834b c0834b6) {
        this.LIZ = str;
        this.LIZIZ = type;
        this.LIZJ = c0834b;
        this.LIZLLL = abstractC145194eik;
        this.f21086LJ = c0834b2;
        this.LJFF = c0834b3;
        this.LJI = c0834b4;
        this.LJII = c0834b5;
        this.LJIIIIZZ = c0834b6;
    }
}
