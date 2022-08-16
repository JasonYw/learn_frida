package com.bytedance.android.live.broadcast.gamedetail;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.n */
/* loaded from: classes5.dex */
public final class C3097n implements C3LJ {
    @SerializedName("video_cover_url")
    public String LIZ;
    @SerializedName("video_play_url")
    public String LIZIZ;
    @SerializedName("rotation")
    public Integer LIZJ;

    static {
        Covode.recordClassIndex(16482);
    }

    public C3097n() {
    }

    public C3097n(C10532g c10532g) {
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
                this.LIZJ = Integer.valueOf(QV1.LIZIZ(c10532g));
            }
        }
    }
}
