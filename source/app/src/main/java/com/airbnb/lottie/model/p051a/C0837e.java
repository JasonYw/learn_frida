package com.airbnb.lottie.model.p051a;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.Collections;
import java.util.List;
import p003X.AbstractC145179eiV;
import p003X.AbstractC145194eik;
import p003X.C145133ehl;
import p003X.C145171eiN;
import p003X.C145176eiS;

/* renamed from: com.airbnb.lottie.model.a.e */
/* loaded from: classes19.dex */
public class C0837e implements AbstractC145194eik<PointF, PointF> {
    public final List<C145133ehl<PointF>> LIZ;

    static {
        if (ReDexClinitStringAb.abTest >= 3) {
            Covode.recordClassIndex(4088);
        } else {
            Covode.recordClassIndex(4088);
        }
    }

    public C0837e() {
        this.LIZ = Collections.singletonList(new C145133ehl(new PointF(0.0f, 0.0f)));
    }

    @Override // p003X.AbstractC145194eik
    public final AbstractC145179eiV<PointF, PointF> LIZ() {
        if (this.LIZ.get(0).LIZLLL()) {
            return new C145176eiS(this.LIZ);
        }
        return new C145171eiN(this.LIZ);
    }

    public C0837e(List<C145133ehl<PointF>> list) {
        this.LIZ = list;
    }
}
