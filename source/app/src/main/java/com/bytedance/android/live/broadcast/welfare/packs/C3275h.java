package com.bytedance.android.live.broadcast.welfare.packs;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.packs.h */
/* loaded from: classes5.dex */
public final class C3275h implements C3LJ {
    @SerializedName("gift_name")
    public String LIZ;
    @SerializedName("gift_id")
    public String LIZIZ;
    @SerializedName("gift_image")
    public String LIZJ;
    @SerializedName("prop_items")
    public String LIZLLL;
    @SerializedName("code_type")

    /* renamed from: LJ */
    public Long f25963LJ;
    @SerializedName("gift_count")
    public long LJFF;
    @SerializedName("use_description")
    public String LJI;
    @SerializedName("has_receive")
    public boolean LJII;
    @SerializedName("game_code")
    public String LJIIIIZZ;
    @SerializedName("effective_end_time")
    public long LJIIIZ;
    @SerializedName("status")
    public long LJIIJ;
    @SerializedName("play_info")
    public C3274e LJIIJJI;

    static {
        Covode.recordClassIndex(18280);
    }

    public C3275h() {
        this.LJIIJ = 1L;
    }

    public C3275h(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 14) {
                    switch (LIZIZ) {
                        case 1:
                            this.LIZ = QV1.LJFF(c10532g);
                            continue;
                        case 2:
                            this.LIZIZ = QV1.LJFF(c10532g);
                            continue;
                        case 3:
                            this.LIZJ = QV1.LJFF(c10532g);
                            continue;
                        case 4:
                            this.LIZLLL = QV1.LJFF(c10532g);
                            continue;
                        case 5:
                            this.f25963LJ = Long.valueOf(QV1.LIZJ(c10532g));
                            continue;
                        case 6:
                            this.LJFF = QV1.LIZJ(c10532g);
                            continue;
                        case 7:
                            this.LJI = QV1.LJFF(c10532g);
                            continue;
                        case 8:
                            this.LJII = QV1.LIZ(c10532g);
                            continue;
                        case 9:
                            this.LJIIIIZZ = QV1.LJFF(c10532g);
                            continue;
                        case 10:
                            this.LJIIIZ = QV1.LIZJ(c10532g);
                            continue;
                        case 11:
                            this.LJIIJ = QV1.LIZJ(c10532g);
                            continue;
                        default:
                            QV1.LJII(c10532g);
                            continue;
                    }
                } else {
                    this.LJIIJJI = new C3274e(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LJIIJ == 0) {
                    this.LJIIJ = 1L;
                    return;
                }
                return;
            }
        }
    }
}
