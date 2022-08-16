package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.d */
/* loaded from: classes5.dex */
public final class C5197d implements C3LJ {
    @SerializedName("play_id")
    public long LIZ;
    @SerializedName("type")
    public int LIZIZ;

    static {
        Covode.recordClassIndex(32901);
    }

    public C5197d() {
    }

    public C5197d(C10532g c10532g) {
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
                this.LIZIZ = QV1.LIZIZ(c10532g);
            }
        }
    }
}
