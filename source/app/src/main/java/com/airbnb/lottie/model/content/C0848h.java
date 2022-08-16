package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.C0832a;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.h */
/* loaded from: classes17.dex */
public final class C0848h {
    public final List<C0832a> LIZ = new ArrayList();
    public PointF LIZIZ;
    public boolean LIZJ;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(4120);
        } else {
            Covode.recordClassIndex(4120);
        }
    }

    public C0848h() {
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.LIZ.size() + "closed=" + this.LIZJ + '}';
    }

    public C0848h(PointF pointF, boolean z, List<C0832a> list) {
        this.LIZIZ = pointF;
        this.LIZJ = z;
        this.LIZ.addAll(list);
    }
}
