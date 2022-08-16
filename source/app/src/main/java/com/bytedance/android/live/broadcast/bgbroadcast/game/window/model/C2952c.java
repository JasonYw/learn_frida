package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.internal.C33838c;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.c */
/* loaded from: classes5.dex */
public final class C2952c implements C3LJ {
    @SerializedName(C33838c.f42636f)
    public C2950a LIZ;
    @SerializedName("promotion_status")
    public String LIZIZ;
    @SerializedName("upper_share_ratio")
    public String LIZJ;
    @SerializedName("down_share_ratio")
    public String LIZLLL;
    @SerializedName("is_promoted_prop_game")

    /* renamed from: LJ */
    public boolean f25790LJ;
    @SerializedName("prop_infos")
    public C2954e LJFF;
    @SerializedName("reserve_item")
    public C2958i LJI;

    static {
        Covode.recordClassIndex(14914);
    }

    public C2952c() {
    }

    public C2952c(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = new C2950a(c10532g);
            } else if (LIZIZ == 12) {
                this.LJFF = new C2954e(c10532g);
            } else if (LIZIZ == 14) {
                this.f25790LJ = QV1.LIZ(c10532g);
            } else if (LIZIZ == 16) {
                this.LJI = new C2958i(c10532g);
            } else if (LIZIZ == 3) {
                this.LIZIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 4) {
                this.LIZJ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 5) {
                QV1.LJII(c10532g);
            } else {
                this.LIZLLL = QV1.LJFF(c10532g);
            }
        }
    }
}
