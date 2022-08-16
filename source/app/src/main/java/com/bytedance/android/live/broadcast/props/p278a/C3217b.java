package com.bytedance.android.live.broadcast.props.p278a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.b */
/* loaded from: classes5.dex */
public final class C3217b implements C3LJ {
    @SerializedName("order_id")
    public String LIZ;
    @SerializedName("order_create_time")
    public Long LIZIZ;
    @SerializedName("payment_id")
    public String LIZJ;
    @SerializedName("cashier_param")
    public String LIZLLL;
    @SerializedName("cashier_type")

    /* renamed from: LJ */
    public String f25931LJ;
    @SerializedName("pay_result_link")
    public String LJFF;
    @SerializedName("order_detail_link")
    public String LJI;
    @SerializedName("check_result")
    public C3218c LJII;

    static {
        Covode.recordClassIndex(17598);
    }

    public C3217b() {
        this.LIZ = "";
        this.LIZIZ = 0L;
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25931LJ = "";
        this.LJFF = "";
        this.LJI = "";
    }

    public C3217b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.f25931LJ = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.LJII = new C3218c(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        this.LIZIZ = Long.valueOf(QV1.LIZJ(c10532g));
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
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.f25931LJ == null) {
                    this.f25931LJ = "";
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
