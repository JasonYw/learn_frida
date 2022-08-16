package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.ae */
/* loaded from: classes12.dex */
public final class C3373ae implements C3LJ {
    @SerializedName("name")
    public String LIZ;
    @SerializedName("capacity")
    public long LIZIZ;

    static {
        Covode.recordClassIndex(19185);
    }

    public C3373ae() {
        this.LIZ = "";
        this.LIZIZ = -1L;
    }

    public C3373ae(C10532g c10532g) {
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
        if (this.LIZIZ == 0) {
            this.LIZIZ = -1L;
        }
    }
}
