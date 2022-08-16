package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.b */
/* loaded from: classes5.dex */
public final class C3570b implements C3LJ {
    @SerializedName(Constants.APP_ID)
    public String LIZ;
    @SerializedName("game_id")
    public long LIZIZ;

    static {
        Covode.recordClassIndex(20435);
    }

    public C3570b() {
        this.LIZ = "";
    }

    public C3570b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
    }
}
