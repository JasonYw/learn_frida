package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.v */
/* loaded from: classes5.dex */
public final class C3250v implements C3LJ {
    @SerializedName("layout")
    public String LIZ;
    @SerializedName("installed_layout")
    public String LIZIZ;

    static {
        Covode.recordClassIndex(18055);
    }

    public C3250v() {
    }

    public C3250v(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ = QV1.LJFF(c10532g);
            }
        }
    }
}
