package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.i */
/* loaded from: classes5.dex */
public final class C2958i implements C3LJ {
    @SerializedName("reserved_total_by_game_anchor")
    public String LIZ;
    @SerializedName("reserved_status")
    public int LIZIZ;
    @SerializedName("reserved_today_by_game_anchor")
    public String LIZJ;
    @SerializedName("reserved_total_by_game")
    public String LIZLLL;

    static {
        Covode.recordClassIndex(14920);
    }

    public C2958i() {
        this.LIZ = "";
        this.LIZIZ = 0;
        this.LIZJ = "";
        this.LIZLLL = "";
    }

    public C2958i(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZIZ = QV1.LIZIZ(c10532g);
            } else if (LIZIZ == 3) {
                this.LIZJ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 4) {
                QV1.LJII(c10532g);
            } else {
                this.LIZLLL = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        if (this.LIZIZ == 0) {
            this.LIZIZ = 0;
        }
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
    }
}
