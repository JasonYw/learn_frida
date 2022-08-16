package com.bytedance.android.live.broadcast.props.p278a;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.f */
/* loaded from: classes5.dex */
public final class C3221f implements C3LJ {
    @SerializedName("prop_id")
    public String LIZ;
    @SerializedName("prop_sku_id")
    public Long LIZIZ;
    @SerializedName("prop_name")
    public String LIZJ;
    @SerializedName("prop_description")
    public String LIZLLL;
    @SerializedName("platform_type")

    /* renamed from: LJ */
    public Long f25933LJ;
    @SerializedName("prop_icon")
    public String LJFF;
    @SerializedName("selling_price")
    public Long LJI;
    @SerializedName("market_price")
    public Long LJII;
    @SerializedName("sub_items")
    public List<C3228m> LJIIIIZZ;
    @SerializedName("is_introducing")
    public boolean LJIIIZ;
    @SerializedName("guide_description")
    public String LJIIJ;
    @SerializedName("guide_images")
    public List<String> LJIIJJI;
    @SerializedName("prop_type")
    public Long LJIIL;
    @SerializedName("after_coupon_price")
    public Long LJIILIIL;

    static {
        Covode.recordClassIndex(17602);
    }

    public C3221f() {
        this.LIZ = "";
        this.LIZIZ = 0L;
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25933LJ = 0L;
        this.LJFF = "";
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIJ = "";
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
    }

    public C3221f(C10532g c10532g) {
        List list;
        Object LJFF;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIJJI = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        continue;
                    case 2:
                        this.LIZIZ = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        continue;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        continue;
                    case 5:
                        this.f25933LJ = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        continue;
                    case 7:
                    case 8:
                    case 11:
                    case 14:
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    default:
                        QV1.LJII(c10532g);
                        continue;
                    case 9:
                        this.LJII = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case 10:
                        this.LJI = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case 12:
                        list = this.LJIIIIZZ;
                        LJFF = new C3228m(c10532g);
                        break;
                    case 13:
                        this.LJIIIZ = QV1.LIZ(c10532g);
                        continue;
                    case 16:
                        this.LJIIJ = QV1.LJFF(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        list = this.LJIIJJI;
                        LJFF = QV1.LJFF(c10532g);
                        break;
                    case 18:
                        this.LJIIL = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        this.LJIILIIL = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                }
                list.add(LJFF);
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
                if (this.f25933LJ == null) {
                    this.f25933LJ = 0L;
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI == null) {
                    this.LJI = 0L;
                }
                if (this.LJII == null) {
                    this.LJII = 0L;
                }
                this.LJIIIIZZ.isEmpty();
                if (this.LJIIJ == null) {
                    this.LJIIJ = "";
                }
                this.LJIIJJI.isEmpty();
                if (this.LJIIL == null) {
                    this.LJIIL = 0L;
                }
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = 0L;
                    return;
                }
                return;
            }
        }
    }
}
