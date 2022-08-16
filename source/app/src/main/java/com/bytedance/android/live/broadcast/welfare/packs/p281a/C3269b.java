package com.bytedance.android.live.broadcast.welfare.packs.p281a;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.welfare.packs.C3275h;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.packs.a.b */
/* loaded from: classes5.dex */
public final class C3269b implements C3LJ {
    @SerializedName("game_info")
    public C3243u LIZ;
    @SerializedName("gift_info")
    public C3275h LIZIZ;
    @SerializedName("play_type")
    public Long LIZJ;

    static {
        Covode.recordClassIndex(18229);
    }

    public C3269b() {
        this.LIZJ = 0L;
    }

    public C3269b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZJ = Long.valueOf(QV1.LIZJ(c10532g));
                    }
                } else {
                    this.LIZIZ = new C3275h(c10532g);
                }
            } else {
                this.LIZ = new C3243u(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZJ == null) {
            this.LIZJ = 0L;
        }
    }
}
