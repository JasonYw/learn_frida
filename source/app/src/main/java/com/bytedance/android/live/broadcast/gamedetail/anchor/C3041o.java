package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.o */
/* loaded from: classes5.dex */
public final class C3041o implements C3LJ {
    @SerializedName("first_result")
    public Long LIZ;

    static {
        Covode.recordClassIndex(16100);
    }

    public C3041o() {
    }

    public C3041o(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = Long.valueOf(QV1.LIZJ(c10532g));
            }
        }
    }
}
