package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C109391T5d;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.ag */
/* loaded from: classes5.dex */
public final class C2861ag implements C3LJ {
    @SerializedName("tag_id")
    public String LIZ;
    @SerializedName("value")
    public String LIZIZ;
    @SerializedName(C109391T5d.LIZ)
    public String LIZJ;

    static {
        Covode.recordClassIndex(14339);
    }

    public C2861ag() {
    }

    public C2861ag(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 3) {
                QV1.LJII(c10532g);
            } else {
                this.LIZJ = QV1.LJFF(c10532g);
            }
        }
    }
}
