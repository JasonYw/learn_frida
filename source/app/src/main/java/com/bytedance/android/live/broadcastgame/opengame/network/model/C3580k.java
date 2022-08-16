package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.k */
/* loaded from: classes5.dex */
public final class C3580k implements C3LJ {
    @SerializedName("display_status")
    public Integer LIZ;

    static {
        Covode.recordClassIndex(20446);
    }

    public C3580k() {
        this.LIZ = 0;
    }

    public C3580k(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = Integer.valueOf(QV1.LIZIZ(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = 0;
        }
    }
}
