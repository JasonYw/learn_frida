package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.fansclub.r */
/* loaded from: classes12.dex */
public final class C5273r {
    public int LIZ;
    public XTFansClubStatus LIZIZ;
    public boolean LIZJ;

    static {
        Covode.recordClassIndex(33328);
    }

    public C5273r() {
        this(null, 0, XTFansClubStatus.Default, false);
    }

    public C5273r(String str, int i, XTFansClubStatus xTFansClubStatus, boolean z) {
        C106862S5w.LIZ(xTFansClubStatus);
        this.LIZ = i;
        this.LIZIZ = xTFansClubStatus;
        this.LIZJ = z;
    }
}
