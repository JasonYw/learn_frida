package com.bytedance.android.live.broadcast.gamedetailv2.data;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.C3250v;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3107c;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3113i;
import com.bytedance.android.live.broadcast.promotelist.C3213g;
import com.bytedance.android.live.broadcast.props.p278a.C3224i;
import com.bytedance.android.live.broadcast.welfare.coupon.api.C3264c;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6891cm;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.data.b */
/* loaded from: classes5.dex */
public final class C3119b implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("base_info")
    public C3243u LIZIZ;
    @SerializedName("recommend_reason")
    public String LIZJ;
    @SerializedName("promotion_status")
    public String LIZLLL;
    @SerializedName("gift_infos")

    /* renamed from: LJ */
    public C3213g f25886LJ;
    @SerializedName("promoter")
    public User LJFF;
    @SerializedName("forwarder")
    public User LJI;
    @SerializedName("evaluate_summary")
    public C2988e LJII;
    @SerializedName("evaluation_info")
    public List<C2985a> LJIIIIZZ;
    @SerializedName("coupons")
    public C3264c LJIIIZ;
    @SerializedName("prop_infos")
    public C3224i LJIIJ;
    @SerializedName("game_union_type")
    public Long LJIIJJI;
    @SerializedName("fans_group")
    public List<C3107c> LJIIL;
    @SerializedName("official_account")
    public List<C3108d> LJIILIIL;
    @SerializedName("fixed_module")
    public C3250v LJIILJJIL;
    @SerializedName("layout")
    public C3120d LJIILL;
    @SerializedName("installed_layout")
    public C3120d LJIILLIIL;
    @SerializedName("download_status")
    public Long LJIIZILJ;
    @SerializedName("has_group_task")
    public boolean LJIJ;
    @SerializedName("dynamic_detail_abtest_param")
    public C3118a LJIJI;
    public boolean LJIJJ;
    @SerializedName("reserve_item")
    public C3113i LJIJJLI;

    static {
        Covode.recordClassIndex(16638);
    }

    public C3119b() {
        this.LJIIIIZZ = new ArrayList();
        this.LJIIJJI = 0L;
        this.LJIIL = new ArrayList();
        this.LJIILIIL = new ArrayList();
        this.LJIJJLI = null;
        this.LJIIZILJ = -1L;
    }

    public final C3120d LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C3120d) proxy.result;
        }
        SettingKey<C6891cm> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_ORDER_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().LIZ) {
            return this.LJIILL;
        }
        if (this.LJIJJ && z) {
            return this.LJIILLIIL;
        }
        return this.LJIILL;
    }

    public C3119b(C10532g c10532g) {
        List list;
        C3LJ c3108d;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIL = new ArrayList();
        this.LJIILIIL = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 101) {
                    if (LIZIZ != 102) {
                        if (LIZIZ != 150) {
                            switch (LIZIZ) {
                                case 1:
                                    this.LIZIZ = new C3243u(c10532g);
                                    break;
                                case 2:
                                    this.LIZJ = QV1.LJFF(c10532g);
                                    break;
                                case 3:
                                    this.LIZLLL = QV1.LJFF(c10532g);
                                    break;
                                case 4:
                                    this.f25886LJ = new C3213g(c10532g);
                                    break;
                                case 5:
                                    this.LJFF = _User_ProtoDecoder.decodeStatic(c10532g);
                                    break;
                                case 6:
                                    this.LJI = _User_ProtoDecoder.decodeStatic(c10532g);
                                    break;
                                case 7:
                                    this.LJII = new C2988e(c10532g);
                                    break;
                                case 8:
                                    list = this.LJIIIIZZ;
                                    c3108d = new C2985a(c10532g);
                                    list.add(c3108d);
                                    break;
                                case 9:
                                    this.LJIIIZ = new C3264c(c10532g);
                                    break;
                                case 10:
                                    this.LJIIJ = new C3224i(c10532g);
                                    break;
                                case 11:
                                    this.LJIIJJI = Long.valueOf(QV1.LIZJ(c10532g));
                                    break;
                                default:
                                    switch (LIZIZ) {
                                        case 13:
                                            this.LJIIZILJ = Long.valueOf(QV1.LIZJ(c10532g));
                                            break;
                                        case 14:
                                            this.LJIJ = QV1.LIZ(c10532g);
                                            break;
                                        case MotionEventCompat.AXIS_HAT_X /* 15 */:
                                            list = this.LJIIL;
                                            c3108d = new C3107c(c10532g);
                                            list.add(c3108d);
                                            break;
                                        case 16:
                                            list = this.LJIILIIL;
                                            c3108d = new C3108d(c10532g);
                                            list.add(c3108d);
                                            break;
                                        case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                                            this.LJIJJLI = new C3113i(c10532g);
                                            break;
                                        case 18:
                                            this.LJIILJJIL = new C3250v(c10532g);
                                            break;
                                        default:
                                            QV1.LJII(c10532g);
                                            break;
                                    }
                            }
                        } else {
                            this.LJIJI = new C3118a(c10532g);
                        }
                    } else {
                        this.LJIILLIIL = new C3120d(c10532g);
                    }
                } else {
                    this.LJIILL = new C3120d(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LJIIIIZZ.isEmpty()) {
                    this.LJIIIIZZ = new ArrayList();
                }
                if (this.LJIIJJI == null) {
                    this.LJIIJJI = 0L;
                }
                if (this.LJIIL.isEmpty()) {
                    this.LJIIL = new ArrayList();
                }
                if (this.LJIILIIL.isEmpty()) {
                    this.LJIILIIL = new ArrayList();
                }
                if (this.LJIJJLI == null) {
                    this.LJIJJLI = null;
                }
                if (this.LJIIZILJ == null) {
                    this.LJIIZILJ = -1L;
                    return;
                }
                return;
            }
        }
    }
}
