package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.model.y */
/* loaded from: classes12.dex */
public final class C2922y implements C3LJ {
    @SerializedName("replay_enabled")
    public boolean LIZ;
    @SerializedName("replay_auto_post")
    public boolean LIZIZ;
    @SerializedName("replay_sync_xitou")
    public boolean LIZJ;
    @SerializedName("replay_sync_product")
    public boolean LIZLLL;
    @SerializedName("replay_product_exposit")

    /* renamed from: LJ */
    public boolean f25783LJ;

    static {
        Covode.recordClassIndex(14578);
    }

    public C2922y() {
    }

    public C2922y(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LIZ(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZIZ = QV1.LIZ(c10532g);
            } else if (LIZIZ == 3) {
                this.LIZJ = QV1.LIZ(c10532g);
            } else if (LIZIZ == 4) {
                this.LIZLLL = QV1.LIZ(c10532g);
            } else if (LIZIZ != 5) {
                QV1.LJII(c10532g);
            } else {
                this.f25783LJ = QV1.LIZ(c10532g);
            }
        }
    }
}
