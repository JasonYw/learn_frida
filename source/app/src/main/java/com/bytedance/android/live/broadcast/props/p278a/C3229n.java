package com.bytedance.android.live.broadcast.props.p278a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.n */
/* loaded from: classes5.dex */
public final class C3229n implements C3LJ {
    @SerializedName("coupon_id")
    public String LIZ;
    @SerializedName("coupon_discount_amount")
    public Long LIZIZ;
    @SerializedName("coupon_discount_limit")
    public Long LIZJ;
    @SerializedName("coupon_expire_time")
    public Long LIZLLL;
    @SerializedName("is_default")

    /* renamed from: LJ */
    public Boolean f25935LJ;
    @SerializedName("coupon_template_id")
    public String LJFF;
    @SerializedName("coupon_type")
    public Long LJI;
    @SerializedName("coupon_name")
    public String LJII;

    static {
        Covode.recordClassIndex(17610);
    }

    public C3229n() {
        this.LIZ = "";
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.f25935LJ = Boolean.FALSE;
        this.LJFF = "";
        this.LJI = 0L;
        this.LJII = "";
    }

    public C3229n(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 3:
                        this.LIZJ = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 4:
                        this.LIZLLL = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 5:
                        this.f25935LJ = Boolean.valueOf(QV1.LIZ(c10532g));
                        break;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 8:
                        this.LJII = QV1.LJFF(c10532g);
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
                    this.LIZIZ = 0L;
                }
                if (this.LIZJ == null) {
                    this.LIZJ = 0L;
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = 0L;
                }
                if (this.f25935LJ == null) {
                    this.f25935LJ = Boolean.FALSE;
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI == null) {
                    this.LJI = 0L;
                }
                if (this.LJII == null) {
                    this.LJII = "";
                    return;
                }
                return;
            }
        }
    }
}
