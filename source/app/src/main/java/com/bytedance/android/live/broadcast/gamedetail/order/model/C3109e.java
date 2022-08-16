package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.e */
/* loaded from: classes5.dex */
public final class C3109e implements C3LJ {
    @SerializedName("reserve_total_num")
    public String LIZ;
    @SerializedName("reserve_today_num")
    public String LIZIZ;
    @SerializedName("sum_income")
    public String LIZJ;
    @SerializedName("today_charge")
    public String LIZLLL;
    @SerializedName("today_income")

    /* renamed from: LJ */
    public String f25880LJ;

    static {
        Covode.recordClassIndex(16519);
    }

    public C3109e() {
        this.LIZ = null;
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25880LJ = "";
    }

    public C3109e(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 3) {
                this.LIZJ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 4) {
                this.LIZLLL = QV1.LJFF(c10532g);
            } else if (LIZIZ != 5) {
                QV1.LJII(c10532g);
            } else {
                this.f25880LJ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = null;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        if (this.f25880LJ == null) {
            this.f25880LJ = "";
        }
    }
}
