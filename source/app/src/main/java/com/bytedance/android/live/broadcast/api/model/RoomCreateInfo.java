package com.bytedance.android.live.broadcast.api.model;

import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.C6044ac;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ott.sourceui.api.utils.ImmersedStatusBarUtils;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C3KQ;
import p003X.C3L8;
import p003X.C3LJ;
import p003X.C78594Gya;
import p003X.C78618Gyy;
import p003X.C86846KKa;
import p003X.C86850KKe;
import p003X.C86851KKf;
import p003X.H1L;
import p003X.KKR;
import p003X.KKS;
import p003X.KKX;
import p003X.KLB;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class RoomCreateInfo implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("setting_prompt")
    public C3L8 LIZIZ;
    @SerializedName("cover")
    public ImageModel LIZJ;
    @SerializedName("cover_audit_status")
    public long LIZLLL;
    @SerializedName("title")

    /* renamed from: LJ */
    public String f25775LJ;
    @SerializedName("go_live_prompt")
    public String LJFF;
    @SerializedName("live_scenario")
    public C2910f LJI;
    @SerializedName("never_go_live_flag")
    public int LJII;
    @SerializedName("anchor_prompt_type")
    public int LJIIIIZZ;
    @SerializedName("block_prompt")
    public String LJIIIZ;
    @SerializedName("block_schema_locale")
    public String LJIIJ;
    @SerializedName("un_block_time")
    public long LJIIJJI;
    @SerializedName("auto_un_block_prompts")
    public String LJIIL;
    @SerializedName("block_status")
    public int LJIILIIL;
    @SerializedName("auto_cover")
    public long LJIILJJIL;
    @SerializedName("anchor_fans_info")
    public C78618Gyy LJIILL;
    @SerializedName("push_stream_info_map")
    public Map<Long, C2896g> LJIILLIIL;
    @SerializedName("anchor_info_bar_data")
    public C3KQ LJIIZILJ;
    @SerializedName("pc_live_permission_apply")
    public boolean LJIJ;
    @SerializedName("auto_close_interval_list")
    public List<Long> LJIJI;
    @SerializedName("auto_close_interval")
    public Long LJIJJ;
    @SerializedName("linkmic_setting")
    public List<C6044ac> LJIJJLI;
    @SerializedName("linkmic_scene_has_ever_open")
    public List<Integer> LJIL;
    @SerializedName("circle_info")
    public C86846KKa LJJ;
    @SerializedName("new_anchor_flag")
    public int LJJI;
    @SerializedName("is_media")
    public boolean LJJIFFI;
    @SerializedName("is_gov")
    public boolean LJJII;
    @SerializedName("category_node")
    public List<CategoryNode> LJJIII;
    @SerializedName("obs_audit_status")
    public C2918r LJJIIJ;
    @SerializedName(PushConstants.INTENT_ACTIVITY_NAME)
    public KKR LJJIIJZLJL;
    @SerializedName("block_info")
    public List<C2895f> LJJIIZ;
    @SerializedName("is_not_block_create_global")
    public boolean LJJIIZI;
    @SerializedName("user_verified_type")
    public String LJJIJ;
    @SerializedName("audience_display_type")
    public int LJJIJIIJI;
    @SerializedName("commodity_no_filter")
    public int LJJIJIIJIL;
    @SerializedName("is_commodity_no_filter_default_open")
    public boolean LJJIJIL;
    @SerializedName("visibility_range")
    public int LJJIJL;
    @SerializedName("first_message_id")
    public String LJJIJLIJ;
    @SerializedName("replay_setting")
    public C2922y LJJIL;
    @SerializedName("dou_coin_count")
    public long LJJIZ;
    @SerializedName("urge_count")
    public long LJJJ;
    @SerializedName("rank_anchor_hour")
    public long LJJJI;
    @SerializedName("preview_stream")
    public C2921x LJJJIL;
    @SerializedName("book_count")
    public long LJJJJ;
    @SerializedName("is_vip")
    public boolean LJJJJI;
    @SerializedName("starInfo")
    public C78594Gya LJJJJIZL;
    @SerializedName("paid_live_info")
    public KLB LJJJJJ;
    @SerializedName("pc_live_permission_apply_status")
    public int LJJJJJL;
    @SerializedName("pc_live_permission_apply_button_text")
    public String LJJJJL;
    @SerializedName("desire_info")
    public C86850KKe LJJJJLI;

    /* renamed from: com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$f */
    /* loaded from: classes5.dex */
    public static final class C2895f implements C3LJ {
        @SerializedName("live_tab")
        public int LIZ;
        @SerializedName("block_status")
        public int LIZIZ;
        @SerializedName("block_prompt")
        public String LIZJ;
        @SerializedName("un_block_time")
        public long LIZLLL;
        @SerializedName("block_schema_locale")

        /* renamed from: LJ */
        public String f25777LJ;
        @SerializedName("auto_un_block_prompts")
        public String LJFF;
        @SerializedName("is_not_block_create")
        public boolean LJI;

        static {
            Covode.recordClassIndex(14516);
        }

        public C2895f() {
        }

        public C2895f(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                }
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LIZIZ(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = (int) QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        this.f25777LJ = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LIZ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(14509);
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$g */
    /* loaded from: classes5.dex */
    public static final class C2896g implements C3LJ {
        @SerializedName("default_resolution_key")
        public String LIZ;
        @SerializedName("resolutions")
        public List<C2897a> LIZIZ;

        static {
            Covode.recordClassIndex(14517);
        }

        /* renamed from: com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$g$a */
        /* loaded from: classes5.dex */
        public static final class C2897a implements C3LJ {
            @SerializedName("text")
            public String LIZ;
            @SerializedName("key")
            public String LIZIZ;

            static {
                Covode.recordClassIndex(14518);
            }

            public C2897a() {
                this.LIZ = "";
                this.LIZIZ = "";
            }

            public C2897a(C10532g c10532g) {
                long LIZ = c10532g.LIZ();
                while (true) {
                    int LIZIZ = c10532g.LIZIZ();
                    if (LIZIZ == -1) {
                        break;
                    } else if (LIZIZ != 1) {
                        if (LIZIZ != 2) {
                            QV1.LJII(c10532g);
                        } else {
                            this.LIZIZ = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LIZ = QV1.LJFF(c10532g);
                    }
                }
                c10532g.LIZ(LIZ);
                if (this.LIZ == null) {
                    this.LIZ = "";
                }
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
                }
            }
        }

        public C2896g() {
            this.LIZ = "";
            this.LIZIZ = new ArrayList();
        }

        public C2896g(C10532g c10532g) {
            this.LIZIZ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    break;
                } else if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZIZ.add(new C2897a(c10532g));
                    }
                } else {
                    this.LIZ = QV1.LJFF(c10532g);
                }
            }
            c10532g.LIZ(LIZ);
            if (this.LIZ == null) {
                this.LIZ = "";
            }
            if (this.LIZIZ.isEmpty()) {
                this.LIZIZ = new ArrayList();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$e */
    /* loaded from: classes5.dex */
    public static final class C2894e implements C3LJ {
        @SerializedName("banners")
        public List<C2893d> LIZ;

        static {
            Covode.recordClassIndex(14515);
        }

        public C2894e() {
            this.LIZ = new ArrayList();
        }

        public C2894e(C10532g c10532g) {
            this.LIZ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    break;
                } else if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ.add(new C2893d(c10532g));
                }
            }
            c10532g.LIZ(LIZ);
            if (this.LIZ.isEmpty()) {
                this.LIZ = new ArrayList();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$d */
    /* loaded from: classes5.dex */
    public static final class C2893d implements C3LJ {
        public static ChangeQuickRedirect LIZ;
        @SerializedName("area_url")
        public String LIZIZ;
        @SerializedName("area_schema_url")
        public String LIZJ;
        @SerializedName("banner_id")
        public String LIZLLL;
        @SerializedName("banner_type")

        /* renamed from: LJ */
        public Long f25776LJ;
        @SerializedName("life_cycle")
        public String LJFF;

        static {
            Covode.recordClassIndex(14514);
        }

        public C2893d() {
        }

        public C2893d(C10532g c10532g) {
            long LIZ2 = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ2);
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZIZ = QV1.LJFF(c10532g);
                } else if (LIZIZ == 2) {
                    this.LIZJ = QV1.LJFF(c10532g);
                } else if (LIZIZ == 3) {
                    this.LIZLLL = QV1.LJFF(c10532g);
                } else if (LIZIZ == 4) {
                    this.f25776LJ = Long.valueOf(QV1.LIZJ(c10532g));
                } else if (LIZIZ != 5) {
                    QV1.LJII(c10532g);
                } else {
                    this.LJFF = QV1.LJFF(c10532g);
                }
            }
        }

        public final boolean LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return false;
            }
            return true;
        }
    }

    public RoomCreateInfo() {
        this.LJIJI = new ArrayList();
        this.LJIJJ = 0L;
        this.LJIJJLI = new ArrayList();
        this.LJIL = new ArrayList();
        this.LJJIII = new ArrayList();
        this.LJJIIZ = new ArrayList();
        this.LJJIJIIJI = 99;
        this.LJJIJIIJIL = 1;
        this.LJJIJLIJ = "";
    }

    /* loaded from: classes5.dex */
    public enum LiveTabEnum {
        NopeTab(0),
        NormalTab(1),
        AudioTab(2),
        ScreenShotTab(3),
        ThirdPartyTab(4),
        LiveAll(999);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static LiveTabEnum valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (LiveTabEnum) (proxy.isSupported ? proxy.result : Enum.valueOf(LiveTabEnum.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LiveTabEnum[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (LiveTabEnum[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(14510);
        }

        LiveTabEnum(int i) {
            this.value = i;
        }
    }

    public RoomCreateInfo(C10532g c10532g) {
        List list;
        Object valueOf;
        this.LJIILLIIL = new HashMap();
        this.LJIJI = new ArrayList();
        this.LJIJJLI = new ArrayList();
        this.LJIL = new ArrayList();
        this.LJJIII = new ArrayList();
        this.LJJIIZ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        continue;
                    case 2:
                        this.LIZLLL = QV1.LIZJ(c10532g);
                        continue;
                    case 3:
                        this.f25775LJ = QV1.LJFF(c10532g);
                        continue;
                    case 4:
                        this.LJFF = QV1.LJFF(c10532g);
                        continue;
                    case 5:
                        this.LJIIIIZZ = (int) QV1.LIZJ(c10532g);
                        continue;
                    case 6:
                        this.LJI = KKX.LIZ(c10532g);
                        continue;
                    case 7:
                        this.LJII = (int) QV1.LIZJ(c10532g);
                        continue;
                    case 8:
                        this.LJIILIIL = (int) QV1.LIZJ(c10532g);
                        continue;
                    case 9:
                        this.LJIIIZ = QV1.LJFF(c10532g);
                        continue;
                    case 10:
                        this.LJIIJ = QV1.LJFF(c10532g);
                        continue;
                    case 11:
                    case 14:
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                    default:
                        QV1.LJII(c10532g);
                        continue;
                    case 12:
                        this.LJIILJJIL = QV1.LIZJ(c10532g);
                        continue;
                    case 13:
                        this.LJIILL = new C78618Gyy(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        this.LJIIJJI = QV1.LIZJ(c10532g);
                        continue;
                    case 16:
                        this.LJIIL = QV1.LJFF(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        this.LJJIIJ = KKS.LIZ(c10532g);
                        continue;
                    case 18:
                        list = this.LJJIII;
                        valueOf = C86851KKf.LIZ(c10532g);
                        break;
                    case 20:
                        this.LJJI = (int) QV1.LIZJ(c10532g);
                        continue;
                    case 21:
                        this.LJIIZILJ = new C3KQ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        this.LJJIIJZLJL = new KKR(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.LJIJ = QV1.LIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        list = this.LJJIIZ;
                        valueOf = new C2895f(c10532g);
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                        long LIZ3 = c10532g.LIZ();
                        Long l = null;
                        C2896g c2896g = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 != -1) {
                                if (LIZIZ2 != 1) {
                                    if (LIZIZ2 != 2) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        c2896g = new C2896g(c10532g);
                                    }
                                } else {
                                    l = Long.valueOf(QV1.LIZJ(c10532g));
                                }
                            } else {
                                c10532g.LIZ(LIZ3);
                                Map<Long, C2896g> map = this.LJIILLIIL;
                                if (l != null) {
                                    if (c2896g != null) {
                                        map.put(l, c2896g);
                                        continue;
                                    } else {
                                        throw new IllegalStateException("Value must not be null");
                                    }
                                } else {
                                    throw new IllegalStateException("Key must not be null");
                                }
                            }
                        }
                    case 26:
                        this.LJJIJ = QV1.LJFF(c10532g);
                        continue;
                    case 27:
                        this.LJJIL = new C2922y(c10532g);
                        continue;
                    case 28:
                        list = this.LJIJI;
                        valueOf = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 29:
                        this.LJIJJ = Long.valueOf(QV1.LIZJ(c10532g));
                        continue;
                    case 30:
                        this.LJJIJL = QV1.LIZIZ(c10532g);
                        continue;
                    case 31:
                        list = this.LJIJJLI;
                        valueOf = H1L.LIZ(c10532g);
                        break;
                    case 32:
                        list = this.LJIL;
                        valueOf = Integer.valueOf(QV1.LIZIZ(c10532g));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                        this.LJJIJLIJ = QV1.LJFF(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        this.LJJIZ = QV1.LIZJ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        this.LJJJ = QV1.LIZJ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                        this.LJJIFFI = QV1.LIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        this.LJJII = QV1.LIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        this.LJJ = new C86846KKa(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        this.LJJJI = QV1.LIZJ(c10532g);
                        continue;
                    case 40:
                        this.LJJIJIIJI = QV1.LIZIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        this.LIZIZ = new C3L8(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        this.LJJJIL = new C2921x(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        this.LJJIJIIJIL = QV1.LIZIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        this.LJJJJ = QV1.LIZJ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        this.LJJJJI = QV1.LIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        this.LJJJJJL = QV1.LIZIZ(c10532g);
                        continue;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        this.LJJJJL = QV1.LJFF(c10532g);
                        continue;
                    case 48:
                        this.LJJJJJ = new KLB(c10532g);
                        continue;
                    case 49:
                        this.LJJJJLI = new C86850KKe(c10532g);
                        continue;
                    case 50:
                        this.LJJIJIL = QV1.LIZ(c10532g);
                        continue;
                    case ImmersedStatusBarUtils.STATUS_BAR_ALPHA_20 /* 51 */:
                        this.LJJIIZI = QV1.LIZ(c10532g);
                        continue;
                    case 52:
                        this.LJJJJIZL = new C78594Gya(c10532g);
                        continue;
                }
                list.add(valueOf);
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LJIJI.isEmpty()) {
                    this.LJIJI = new ArrayList();
                }
                if (this.LJIJJ == null) {
                    this.LJIJJ = 0L;
                }
                if (this.LJIJJLI.isEmpty()) {
                    this.LJIJJLI = new ArrayList();
                }
                if (this.LJIL.isEmpty()) {
                    this.LJIL = new ArrayList();
                }
                if (this.LJJIII.isEmpty()) {
                    this.LJJIII = new ArrayList();
                }
                if (this.LJJIIZ.isEmpty()) {
                    this.LJJIIZ = new ArrayList();
                }
                if (this.LJJIJIIJI == 0) {
                    this.LJJIJIIJI = 99;
                }
                if (this.LJJIJIIJIL == 0) {
                    this.LJJIJIIJIL = 1;
                }
                if (this.LJJIJLIJ == null) {
                    this.LJJIJLIJ = "";
                    return;
                }
                return;
            }
        }
    }
}
