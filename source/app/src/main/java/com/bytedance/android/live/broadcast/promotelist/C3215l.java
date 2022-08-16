package com.bytedance.android.live.broadcast.promotelist;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3107c;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3113i;
import com.bytedance.android.live.broadcast.props.p278a.C3224i;
import com.bytedance.android.live.broadcast.welfare.coupon.api.C3264c;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.C89114L9g;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.promotelist.l */
/* loaded from: classes5.dex */
public final class C3215l implements C3LJ {
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
    public C2988e f25928LJ;
    @SerializedName("evaluation_info")
    public List<C2985a> LJFF;
    @SerializedName("coupon_summary")
    public C3264c LJI;
    @SerializedName("prop_infos")
    public C3224i LJII;
    public C89114L9g LJIIIIZZ;
    public C3002c LJIIIZ;
    @SerializedName("fans_group")
    public List<C3107c> LJIIJ;
    @SerializedName("official_account")
    public List<C3108d> LJIIJJI;
    @SerializedName("has_group_task")
    public boolean LJIIL;
    @SerializedName("reserve_item")
    public C3113i LJIILIIL;

    static {
        Covode.recordClassIndex(17539);
    }

    public C3215l() {
        this.LIZJ = "1";
        this.LJFF = new ArrayList();
        this.LJIIJ = new ArrayList();
        this.LJIIJJI = new ArrayList();
        this.LJIILIIL = null;
    }

    public C3215l(C10532g c10532g) {
        List list;
        C3LJ c3108d;
        this.LJFF = new ArrayList();
        this.LJIIJ = new ArrayList();
        this.LJIIJJI = new ArrayList();
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
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    default:
                        QV1.LJII(c10532g);
                        continue;
                    case 7:
                        this.f25928LJ = new C2988e(c10532g);
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
                        list = this.LJIIJ;
                        c3108d = new C3107c(c10532g);
                        break;
                    case 13:
                        list = this.LJIIJJI;
                        c3108d = new C3108d(c10532g);
                        break;
                    case 14:
                        this.LJIILIIL = new C3113i(c10532g);
                        continue;
                    case 16:
                        this.LJIIL = QV1.LIZ(c10532g);
                        continue;
                }
                list.add(c3108d);
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZJ == null) {
                    this.LIZJ = "1";
                }
                if (this.LJFF.isEmpty()) {
                    this.LJFF = new ArrayList();
                }
                if (this.LJIIJ.isEmpty()) {
                    this.LJIIJ = new ArrayList();
                }
                if (this.LJIIJJI.isEmpty()) {
                    this.LJIIJJI = new ArrayList();
                }
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = null;
                    return;
                }
                return;
            }
        }
    }
}
