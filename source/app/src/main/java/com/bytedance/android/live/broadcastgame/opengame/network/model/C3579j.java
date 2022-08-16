package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.C87431Kcj;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.j */
/* loaded from: classes5.dex */
public final class C3579j implements C3LJ {
    @SerializedName("card")
    public C87431Kcj LIZ;

    static {
        Covode.recordClassIndex(20445);
    }

    public C3579j() {
        this.LIZ = null;
    }

    public C3579j(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C87431Kcj(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = null;
        }
    }
}
