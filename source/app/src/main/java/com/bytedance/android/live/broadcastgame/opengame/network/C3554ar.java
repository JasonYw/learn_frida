package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.ar */
/* loaded from: classes5.dex */
public final class C3554ar implements C3LJ {
    @SerializedName(C33968a.f42937f)
    public long LIZ;
    @SerializedName("num")
    public long LIZIZ;

    static {
        Covode.recordClassIndex(20363);
    }

    public C3554ar() {
    }

    public C3554ar(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LIZJ(c10532g);
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ = QV1.LIZJ(c10532g);
            }
        }
    }
}
