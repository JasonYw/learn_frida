package com.airbnb.lottie.p047a.p048a;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.p047a.p049b.a$a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC145179eiV;

/* renamed from: com.airbnb.lottie.a.a.t */
/* loaded from: classes19.dex */
public final class C0831t implements AbstractC0827c, a$a {
    public final ShapeTrimPath.Type LIZ;
    public final AbstractC145179eiV<?, Float> LIZIZ;
    public final AbstractC145179eiV<?, Float> LIZJ;
    public final AbstractC145179eiV<?, Float> LIZLLL;

    /* renamed from: LJ */
    public final String f21083LJ;
    public final List<a$a> LJFF = new ArrayList();

    static {
        Covode.recordClassIndex(3996);
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0827c
    public final void LIZ(List<AbstractC0827c> list, List<AbstractC0827c> list2) {
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0827c
    public final String LIZIZ() {
        return this.f21083LJ;
    }

    @Override // com.airbnb.lottie.p047a.p049b.a$a
    public final void LIZ() {
        for (int i = 0; i < this.LJFF.size(); i++) {
            this.LJFF.get(i).LIZ();
        }
    }

    public final void LIZ(a$a a_a) {
        this.LJFF.add(a_a);
    }

    public C0831t(AbstractC0851a abstractC0851a, ShapeTrimPath shapeTrimPath) {
        this.f21083LJ = shapeTrimPath.LIZ;
        this.LIZ = shapeTrimPath.LIZIZ;
        this.LIZIZ = shapeTrimPath.LIZJ.LIZ();
        this.LIZJ = shapeTrimPath.LIZLLL.LIZ();
        this.LIZLLL = shapeTrimPath.f21088LJ.LIZ();
        abstractC0851a.LIZ(this.LIZIZ);
        abstractC0851a.LIZ(this.LIZJ);
        abstractC0851a.LIZ(this.LIZLLL);
        this.LIZIZ.LIZ(this);
        this.LIZJ.LIZ(this);
        this.LIZLLL.LIZ(this);
    }
}
