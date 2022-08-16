package com.bytedance.android.live.broadcast.props.p278a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.h */
/* loaded from: classes5.dex */
public final class C3223h implements C3LJ {
    @SerializedName("game_id")
    public String LIZ;
    @SerializedName("game_name")
    public String LIZIZ;
    @SerializedName("game_icon")
    public String LIZJ;
    @SerializedName("game_introduction")
    public String LIZLLL;
    @SerializedName("game_prop")

    /* renamed from: LJ */
    public C3221f f25934LJ;
    @SerializedName("user_info")
    public C3219d LJFF;
    @SerializedName("user_info_stats")
    public C3222g LJI;
    @SerializedName("user_claim_coupons")
    public List<C3229n> LJII;

    static {
        Covode.recordClassIndex(17604);
    }

    public C3223h() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZLLL = "";
        this.LJII = new ArrayList();
    }

    public C3223h(C10532g c10532g) {
        this.LJII = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.f25934LJ = new C3221f(c10532g);
                        break;
                    case 2:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJFF = new C3219d(c10532g);
                        break;
                    case 7:
                        this.LJI = new C3222g(c10532g);
                        break;
                    case 8:
                        this.LJII.add(new C3229n(c10532g));
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
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.LJII.isEmpty()) {
                    this.LJII = new ArrayList();
                    return;
                }
                return;
            }
        }
    }
}
