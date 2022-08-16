package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.g */
/* loaded from: classes5.dex */
public final class C3111g implements C3LJ {
    @SerializedName("reserved_status")
    public int LIZ;

    static {
        Covode.recordClassIndex(16521);
    }

    public C3111g() {
        this.LIZ = 0;
    }

    public C3111g(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = QV1.LIZIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == 0) {
            this.LIZ = 0;
        }
    }
}
