package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.c */
/* loaded from: classes5.dex */
public final class C3571c implements C3LJ {
    @SerializedName("play_id")
    public long LIZ;

    static {
        Covode.recordClassIndex(20436);
    }

    public C3571c() {
    }

    public C3571c(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = QV1.LIZJ(c10532g);
            }
        }
    }
}
