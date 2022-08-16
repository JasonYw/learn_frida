package com.bytedance.android.live.broadcast.gamedetail.anchor;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3107c;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3109e;
import com.bytedance.android.live.broadcast.promotelist.C3213g;
import com.bytedance.android.live.broadcast.props.p278a.C3224i;
import com.bytedance.android.live.broadcast.welfare.coupon.api.C3264c;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.internal.C33838c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.d */
/* loaded from: classes5.dex */
public final class C3036d implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33838c.f42636f)
    public C3243u LIZIZ;
    @SerializedName("up_share_ratio")
    public String LIZJ;
    @SerializedName("down_share_ratio")
    public String LIZLLL;
    @SerializedName("share_introduce")

    /* renamed from: LJ */
    public Map<String, String> f25842LJ;
    @SerializedName("promotion_rule")
    public Map<String, String> LJFF;
    @SerializedName("anchor_recommend")
    public String LJI;
    @SerializedName("audit_status")
    public String LJII;
    @SerializedName("promotion_status")
    public String LJIIIIZZ;
    @SerializedName("msg_item")
    public C3034b LJIIIZ;
    @SerializedName("gift_infos")
    public C3213g LJIIJ;
    @SerializedName("is_promoted_prop_game")
    public Boolean LJIIJJI;
    @SerializedName("prop_infos")
    public C3224i LJIIL;
    @SerializedName("constract_end_time")
    public Long LJIILIIL;
    @SerializedName("coupon_summary")
    public C3264c LJIILJJIL;
    @SerializedName("evaluate_summary")
    public C2988e LJIILL;
    @SerializedName("evaluation_detail")
    public List<C2985a> LJIILLIIL;
    @SerializedName("fans_group")
    public List<C3107c> LJIIZILJ;
    @SerializedName("official_account")
    public List<C3108d> LJIJ;
    @SerializedName("game_union_type")
    public Long LJIJI;
    @SerializedName("promotion_task_type")
    public long LJIJJ;
    @SerializedName("video_promotion_task_type")
    public long LJIJJLI;
    @SerializedName("promotion_task")
    public String LJIL;
    @SerializedName("video_promotion_task")
    public String LJJ;
    @SerializedName("msg_tip")
    public C3037j LJJI;
    @SerializedName("video_point")
    public String LJJIFFI;
    @SerializedName("anchor_promote_scene")
    public long LJJII;
    public List<String> LJJIII;
    public List<String> LJJIIJ;
    @SerializedName("promotion_data")
    public C3109e LJJIIJZLJL;

    static {
        Covode.recordClassIndex(16043);
    }

    public final boolean LIZ() {
        if (this.LJIJJLI == 2) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LJIJJ == 2) {
            return true;
        }
        return false;
    }

    public C3036d() {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIJJI = Boolean.FALSE;
        this.LJIILIIL = 0L;
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIJI = 0L;
        this.LJJIIJZLJL = null;
        this.LJJII = 1L;
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual("1", this.LJIIIIZZ) && !Intrinsics.areEqual(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, this.LJIIIIZZ)) {
            return false;
        }
        return true;
    }

    /* renamed from: LJ */
    public final List<String> m15900LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<String> list = this.LJJIIJ;
        if (list == null) {
            List<C3107c> list2 = this.LJIIZILJ;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (C3107c c3107c : list2) {
                arrayList.add(c3107c.LIZLLL);
            }
            return arrayList;
        }
        return list;
    }

    public final boolean LIZLLL() {
        boolean areEqual;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual("4", this.LJIIIIZZ)) {
            C3243u c3243u = this.LIZIZ;
            if (c3243u != null) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c3243u, C3243u.LIZ, false, 1);
                if (proxy2.isSupported) {
                    areEqual = ((Boolean) proxy2.result).booleanValue();
                } else {
                    areEqual = Intrinsics.areEqual("2", c3243u.f25945LJ);
                }
                if (areEqual) {
                }
            }
            return false;
        }
        return true;
    }

    public C3036d(C10532g c10532g) {
        List list;
        C3LJ c3108d;
        String str;
        Map<String, String> map;
        this.f25842LJ = new HashMap();
        this.LJFF = new HashMap();
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            String str2 = null;
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZIZ = new C3243u(c10532g);
                        break;
                    case 2:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        long LIZ3 = c10532g.LIZ();
                        str = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 != -1) {
                                if (LIZIZ2 != 1) {
                                    if (LIZIZ2 != 2) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        str = QV1.LJFF(c10532g);
                                    }
                                } else {
                                    str2 = QV1.LJFF(c10532g);
                                }
                            } else {
                                c10532g.LIZ(LIZ3);
                                map = this.f25842LJ;
                                if (str2 != null) {
                                    if (str == null) {
                                        throw new IllegalStateException("Value must not be null");
                                    }
                                    map.put(str2, str);
                                    break;
                                } else {
                                    throw new IllegalStateException("Key must not be null");
                                }
                            }
                        }
                    case 4:
                        long LIZ4 = c10532g.LIZ();
                        str = null;
                        while (true) {
                            int LIZIZ3 = c10532g.LIZIZ();
                            if (LIZIZ3 != -1) {
                                if (LIZIZ3 != 1) {
                                    if (LIZIZ3 != 2) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        str = QV1.LJFF(c10532g);
                                    }
                                } else {
                                    str2 = QV1.LJFF(c10532g);
                                }
                            } else {
                                c10532g.LIZ(LIZ4);
                                map = this.LJFF;
                                if (str2 != null) {
                                    if (str == null) {
                                        throw new IllegalStateException("Value must not be null");
                                    }
                                    map.put(str2, str);
                                    break;
                                } else {
                                    throw new IllegalStateException("Key must not be null");
                                }
                            }
                        }
                    case 5:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJII = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJIIIIZZ = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 9:
                        this.LJIIIZ = new C3034b(c10532g);
                        break;
                    case 10:
                        this.LJIIJ = new C3213g(c10532g);
                        break;
                    case 11:
                        this.LJIILIIL = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 12:
                        this.LJIILJJIL = new C3264c(c10532g);
                        break;
                    case 13:
                        this.LJIIL = new C3224i(c10532g);
                        break;
                    case 14:
                        this.LJIJI = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        this.LJIIJJI = Boolean.valueOf(QV1.LIZ(c10532g));
                        break;
                    case 16:
                        this.LJIILL = new C2988e(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        list = this.LJIILLIIL;
                        c3108d = new C2985a(c10532g);
                        list.add(c3108d);
                        break;
                    case 18:
                        list = this.LJIIZILJ;
                        c3108d = new C3107c(c10532g);
                        list.add(c3108d);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        list = this.LJIJ;
                        c3108d = new C3108d(c10532g);
                        list.add(c3108d);
                        break;
                    case 20:
                        this.LJJIIJZLJL = new C3109e(c10532g);
                        break;
                    case 21:
                        this.LJIJJ = QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        this.LJIL = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.LJJI = new C3037j(c10532g);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        this.LJJIFFI = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                        this.LJJ = QV1.LJFF(c10532g);
                        break;
                    case 26:
                        this.LJJII = QV1.LIZJ(c10532g);
                        break;
                    case 27:
                        this.LJIJJLI = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZJ == null) {
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.LJI == null) {
                    this.LJI = "";
                }
                if (this.LJII == null) {
                    this.LJII = "";
                }
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = "";
                }
                if (this.LJIIJJI == null) {
                    this.LJIIJJI = Boolean.FALSE;
                }
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = 0L;
                }
                if (this.LJIILLIIL.isEmpty()) {
                    this.LJIILLIIL = new ArrayList();
                }
                if (this.LJIIZILJ.isEmpty()) {
                    this.LJIIZILJ = new ArrayList();
                }
                if (this.LJIJ.isEmpty()) {
                    this.LJIJ = new ArrayList();
                }
                if (this.LJIJI == null) {
                    this.LJIJI = 0L;
                }
                if (this.LJJIIJZLJL == null) {
                    this.LJJIIJZLJL = null;
                }
                if (this.LJJII == 0) {
                    this.LJJII = 1L;
                    return;
                }
                return;
            }
        }
    }
}
