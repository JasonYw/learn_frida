package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.t */
/* loaded from: classes5.dex */
public final class C3242t implements C3LJ {
    @SerializedName("game_announcement")
    public GameAnnouncement LIZ;
    @SerializedName("game_award_list")
    public List<C3237s> LIZIZ;
    @SerializedName("evaluation_video_list")
    public C3233r LIZJ;

    static {
        Covode.recordClassIndex(17932);
    }

    public C3242t() {
    }

    public C3242t(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                this.LIZIZ.isEmpty();
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = new GameAnnouncement(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZIZ.add(new C3237s(c10532g));
            } else if (LIZIZ != 3) {
                QV1.LJII(c10532g);
            } else {
                this.LIZJ = new C3233r(c10532g);
            }
        }
    }
}
