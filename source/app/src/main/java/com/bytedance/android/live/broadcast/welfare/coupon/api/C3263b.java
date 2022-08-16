package com.bytedance.android.live.broadcast.welfare.coupon.api;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.coupon.api.b */
/* loaded from: classes5.dex */
public final class C3263b implements C3LJ {
    @SerializedName("template_info")
    public C3265d LIZ;
    @SerializedName("user_coupon_status")
    public String LIZIZ;
    @SerializedName("game_info")
    public C3243u LIZJ;
    @SerializedName("bind_coupon_anchor")
    public String LIZLLL;
    @SerializedName("coupon_expire_left_time")

    /* renamed from: LJ */
    public Long f25959LJ;
    @SerializedName("bind_anchor_id")
    public Long LJFF;
    @SerializedName("default_coupon")
    public Boolean LJI;

    static {
        Covode.recordClassIndex(18193);
    }

    public C3263b() {
        this.LJI = Boolean.FALSE;
    }

    public C3263b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = new C3265d(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZJ = new C3243u(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.f25959LJ = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 6:
                        this.LJFF = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 7:
                        this.LJI = Boolean.valueOf(QV1.LIZ(c10532g));
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LJI == null) {
                    this.LJI = Boolean.FALSE;
                    return;
                }
                return;
            }
        }
    }
}
