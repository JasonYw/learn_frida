package com.bytedance.android.live.broadcast.gamedetail.audience;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3107c;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3113i;
import com.bytedance.android.live.broadcast.promotelist.C3213g;
import com.bytedance.android.live.broadcast.props.p278a.C3224i;
import com.bytedance.android.live.broadcast.welfare.coupon.api.C3264c;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.C89100L8s;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.audience.b */
/* loaded from: classes5.dex */
public final class C3045b implements C3LJ {
    public static final C89100L8s LJIIL = new C89100L8s((byte) 0);
    @SerializedName("base_info")
    public C3243u LIZ;
    @SerializedName("anchor_recommend_reason")
    public String LIZIZ;
    @SerializedName("promotion_status")
    public String LIZJ;
    @SerializedName("gift_infos")
    public C3213g LIZLLL;
    @SerializedName("evaluate_summary")

    /* renamed from: LJ */
    public C2988e f25848LJ;
    @SerializedName("evaluation_info")
    public List<C2985a> LJFF;
    @SerializedName("coupon_summary")
    public C3264c LJI;
    @SerializedName("prop_infos")
    public C3224i LJII;
    @SerializedName("fans_group")
    public List<C3107c> LJIIIIZZ;
    @SerializedName("official_account")
    public List<C3108d> LJIIIZ;
    @SerializedName("download_status")
    public Long LJIIJ;
    @SerializedName("has_group_task")
    public boolean LJIIJJI;
    @SerializedName("reserve_item")
    public C3113i LJIILIIL;

    static {
        Covode.recordClassIndex(16121);
    }

    public C3045b() {
        this.LJFF = new ArrayList();
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIILIIL = null;
        this.LJIIJ = -1L;
    }

    public C3045b(C10532g c10532g) {
        List list;
        C3LJ c3108d;
        this.LJFF = new ArrayList();
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = new C3243u(c10532g);
                        continue;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        continue;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        continue;
                    case 4:
                        this.LIZLLL = new C3213g(c10532g);
                        continue;
                    case 5:
                    case 6:
                    case 11:
                    default:
                        QV1.LJII(c10532g);
                        continue;
                    case 7:
                        this.f25848LJ = new C2988e(c10532g);
                        continue;
                    case 8:
                        list = this.LJFF;
                        c3108d = new C2985a(c10532g);
                        break;
                    case 9:
                        this.LJI = new C3264c(c10532g);
                        continue;
                    case 10:
                        this.LJII = new C3224i(c10532g);
                        continue;
                    case 12:
                        list = this.LJIIIIZZ;
                        c3108d = new C3107c(c10532g);
                        break;
                    case 13:
                        list = this.LJIIIZ;
                        c3108d = new C3108d(c10532g);
                        break;
                    case 14:
                        this.LJIILIIL = new C3113i(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        this.LJIIJ = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case 16:
                        this.LJIIJJI = QV1.LIZ(c10532g);
                        continue;
                }
                list.add(c3108d);
            } else {
                c10532g.LIZ(LIZ);
                if (this.LJFF.isEmpty()) {
                    this.LJFF = new ArrayList();
                }
                if (this.LJIIIIZZ.isEmpty()) {
                    this.LJIIIIZZ = new ArrayList();
                }
                if (this.LJIIIZ.isEmpty()) {
                    this.LJIIIZ = new ArrayList();
                }
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = null;
                }
                if (this.LJIIJ == null) {
                    this.LJIIJ = -1L;
                    return;
                }
                return;
            }
        }
    }
}
