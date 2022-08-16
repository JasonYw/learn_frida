package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.an */
/* loaded from: classes5.dex */
public final class C3550an implements C3LJ {
    @SerializedName("status")
    public int LIZ;
    @SerializedName("min_run_minute")
    public long LIZIZ;
    @SerializedName("can_stop")
    public boolean LIZJ;

    static {
        Covode.recordClassIndex(20359);
    }

    public C3550an() {
    }

    public C3550an(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LIZIZ(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZIZ = QV1.LIZJ(c10532g);
            } else if (LIZIZ != 3) {
                QV1.LJII(c10532g);
            } else {
                this.LIZJ = QV1.LIZ(c10532g);
            }
        }
    }
}
