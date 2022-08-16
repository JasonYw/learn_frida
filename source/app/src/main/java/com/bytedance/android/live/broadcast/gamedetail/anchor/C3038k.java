package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.k */
/* loaded from: classes5.dex */
public final class C3038k implements C3LJ {
    @SerializedName("change_mode")
    public String LIZ;
    @SerializedName("previous_ratio")
    public String LIZIZ;
    @SerializedName("after_ratio")
    public String LIZJ;
    @SerializedName("previous_promote_type")
    public String LIZLLL;
    @SerializedName("post_promote_type")

    /* renamed from: LJ */
    public String f25844LJ;
    @SerializedName("previous_promote_sub_type")
    public String LJFF;
    @SerializedName("post_promote_sub_type")
    public String LJI;

    static {
        Covode.recordClassIndex(16090);
    }

    public C3038k() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25844LJ = "";
        this.LJFF = "";
        this.LJI = "";
    }

    public C3038k(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.f25844LJ = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZ == null) {
                    this.LIZ = "";
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
                if (this.f25844LJ == null) {
                    this.f25844LJ = "";
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI == null) {
                    this.LJI = "";
                    return;
                }
                return;
            }
        }
    }
}
