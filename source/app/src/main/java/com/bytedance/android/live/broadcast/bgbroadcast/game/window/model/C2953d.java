package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.d */
/* loaded from: classes5.dex */
public final class C2953d implements C3LJ {
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
    public Long f25791LJ;
    @SerializedName("prop_icon")
    public String LJFF;
    @SerializedName("selling_price")
    public Long LJI;
    @SerializedName("market_price")
    public Long LJII;
    @SerializedName("sub_items")
    public List<C2957h> LJIIIIZZ;
    @SerializedName("is_introducing")
    public boolean LJIIIZ;

    static {
        Covode.recordClassIndex(14915);
    }

    public C2953d() {
        this.LIZ = "";
        this.LIZIZ = 0L;
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25791LJ = 0L;
        this.LJFF = "";
        this.LJI = 0L;
        this.LJII = 0L;
    }

    public C2953d(C10532g c10532g) {
        this.LJIIIIZZ = new ArrayList();
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
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.f25791LJ = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                    case 8:
                    case 11:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 9:
                        this.LJII = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 10:
                        this.LJI = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 12:
                        this.LJIIIIZZ.add(new C2957h(c10532g));
                        break;
                    case 13:
                        this.LJIIIZ = QV1.LIZ(c10532g);
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
                if (this.f25791LJ == null) {
                    this.f25791LJ = 0L;
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
                return;
            }
        }
    }
}
