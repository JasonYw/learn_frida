package com.bytedance.android.live.broadcast.welfare.coupon.api;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.coupon.api.d */
/* loaded from: classes5.dex */
public final class C3265d implements C3LJ {
    @SerializedName("template_id")
    public String LIZ;
    @SerializedName("template_name")
    public String LIZIZ;
    @SerializedName("claim_expire_begin_time")
    public String LIZJ;
    @SerializedName("claim_expire_end_time")
    public String LIZLLL;
    @SerializedName("use_expire_date")

    /* renamed from: LJ */
    public String f25960LJ;
    @SerializedName("user_receive_limit")
    public String LJFF;
    @SerializedName("coupon_discount_type")
    public String LJI;
    @SerializedName("coupon_discount_amount")
    public String LJII;
    @SerializedName("coupon_discount_limit")
    public String LJIIIIZZ;
    @SerializedName("coupon_distribute_type")
    public String LJIIIZ;
    @SerializedName("coupon_type")
    public String LJIIJ;
    @SerializedName("anchor_distribute_amount")
    public String LJIIJJI;

    static {
        Covode.recordClassIndex(18195);
    }

    public C3265d() {
    }

    public C3265d(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            }
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
                    this.f25960LJ = QV1.LJFF(c10532g);
                    break;
                case 6:
                    this.LJFF = QV1.LJFF(c10532g);
                    break;
                case 7:
                    this.LJI = QV1.LJFF(c10532g);
                    break;
                case 8:
                    this.LJII = QV1.LJFF(c10532g);
                    break;
                case 9:
                    this.LJIIIIZZ = QV1.LJFF(c10532g);
                    break;
                case 10:
                    this.LJIIIZ = QV1.LJFF(c10532g);
                    break;
                case 11:
                    this.LJIIJ = QV1.LJFF(c10532g);
                    break;
                case 12:
                    this.LJIIJJI = QV1.LJFF(c10532g);
                    break;
                default:
                    QV1.LJII(c10532g);
                    break;
            }
        }
    }
}
