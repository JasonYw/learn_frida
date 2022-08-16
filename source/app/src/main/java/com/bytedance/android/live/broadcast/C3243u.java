package com.bytedance.android.live.broadcast;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.broadcast.api.gamepromote.GameStageType;
import com.bytedance.android.live.broadcast.gamedetail.C3097n;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ott.sourceui.api.utils.ImmersedStatusBarUtils;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.u */
/* loaded from: classes5.dex */
public final class C3243u implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    public Long LIZIZ;
    @SerializedName(C33968a.f42937f)
    public String LIZJ;
    @SerializedName("name")
    public String LIZLLL;
    @SerializedName("status")

    /* renamed from: LJ */
    public String f25945LJ;
    @SerializedName("icon")
    public String LJFF;
    @SerializedName("company")
    public String LJI;
    @SerializedName("publisher")
    public String LJII;
    @SerializedName("tags")
    public List<String> LJIIIIZZ;
    @SerializedName("tag_property")
    public List<C2861ag> LJIIIZ;
    @SerializedName("android_short_url")
    public String LJIIJ;
    @SerializedName("images")
    public Map<String, String> LJIIJJI;
    @SerializedName("introduce")
    public String LJIIL;
    @SerializedName("android_package_size")
    public String LJIILIIL;
    @SerializedName("android_version")
    public String LJIILJJIL;
    @SerializedName("version_code")
    public String LJIILL;
    @SerializedName("android_privacy_url")
    public String LJIILLIIL;
    @SerializedName("authorization_url")
    public String LJIIZILJ;
    @SerializedName("package_update_time")
    public String LJIJ;
    @SerializedName("background_color")
    public String LJIJI;
    @SerializedName("android_package_name")
    public String LJIJJ;
    @SerializedName("download_extra")
    public String LJIJJLI;
    @SerializedName("anti_hijack_content")
    public String LJIL;
    @SerializedName("anti_hijack_image")
    public String LJJ;
    @SerializedName("image_property")
    public Map<String, C3261w> LJJI;
    @SerializedName("online_time")
    public String LJJIFFI;
    @SerializedName("game_stage")
    public int LJJII;
    @SerializedName("videos")
    public ArrayList<C3097n> LJJIII;
    @SerializedName("game_union_type")
    public Long LJJIIJ;
    @SerializedName("user_playing_count")
    public Long LJJIIJZLJL;
    @SerializedName("is_prop_exp_game")
    public boolean LJJIIZ;
    @SerializedName("game_content_config")
    public C3242t LJJIIZI;
    @SerializedName("app_cloud_id")
    public Long LJJIJ;
    @SerializedName("is_download_support")
    public boolean LJJIJIIJI;

    static {
        Covode.recordClassIndex(17964);
    }

    public final GameStageType LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (GameStageType) proxy.result;
        }
        return GameStageType.Companion.LIZ(Integer.valueOf(this.LJJII));
    }

    public C3243u() {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25945LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJII = "";
        this.LJIIJ = "";
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIILJJIL = "";
        this.LJIILL = "";
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
        this.LJIJ = "";
        this.LJIJI = "";
        this.LJIJJ = "";
        this.LJIJJLI = "";
        this.LJJIIJ = 0L;
        this.LJJIIJZLJL = 0L;
        this.LJJIJ = 0L;
        this.LIZIZ = -1L;
    }

    public C3243u(C10532g c10532g) {
        List list;
        Object c3097n;
        Object obj;
        Map map;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIIJJI = new HashMap();
        this.LJJI = new HashMap();
        this.LJJIII = new ArrayList<>();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                String str = null;
                switch (LIZIZ) {
                    case 1:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.f25945LJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    case 16:
                    case 18:
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                    case 26:
                    case 27:
                    case 28:
                    case 30:
                    case 31:
                    case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case 40:
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    case 49:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 6:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        list = this.LJIIIIZZ;
                        c3097n = QV1.LJFF(c10532g);
                        list.add(c3097n);
                        break;
                    case 8:
                        this.LJIIJ = QV1.LJFF(c10532g);
                        break;
                    case 11:
                        long LIZ3 = c10532g.LIZ();
                        obj = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 != -1) {
                                if (LIZIZ2 != 1) {
                                    if (LIZIZ2 != 2) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        obj = QV1.LJFF(c10532g);
                                    }
                                } else {
                                    str = QV1.LJFF(c10532g);
                                }
                            } else {
                                c10532g.LIZ(LIZ3);
                                map = this.LJIIJJI;
                                if (str != null) {
                                    if (obj == null) {
                                        throw new IllegalStateException("Value must not be null");
                                    }
                                    map.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Key must not be null");
                                }
                            }
                        }
                    case 12:
                        this.LJIIL = QV1.LJFF(c10532g);
                        break;
                    case 14:
                        this.LJIILJJIL = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        this.LJIILIIL = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        this.LJIJJ = QV1.LJFF(c10532g);
                        break;
                    case 20:
                        this.LJIILL = QV1.LJFF(c10532g);
                        break;
                    case 21:
                        this.LJIILLIIL = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.LJIIZILJ = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        this.LJIJ = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                        this.LJIJI = QV1.LJFF(c10532g);
                        break;
                    case 29:
                        this.LJIJJLI = QV1.LJFF(c10532g);
                        break;
                    case 32:
                        this.LJII = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        this.LJIL = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        this.LJJ = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        long LIZ4 = c10532g.LIZ();
                        obj = null;
                        while (true) {
                            int LIZIZ3 = c10532g.LIZIZ();
                            if (LIZIZ3 != -1) {
                                if (LIZIZ3 != 1) {
                                    if (LIZIZ3 != 2) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        obj = new C3261w(c10532g);
                                    }
                                } else {
                                    str = QV1.LJFF(c10532g);
                                }
                            } else {
                                c10532g.LIZ(LIZ4);
                                map = this.LJJI;
                                if (str != null) {
                                    if (obj == null) {
                                        throw new IllegalStateException("Value must not be null");
                                    }
                                    map.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Key must not be null");
                                }
                            }
                        }
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        this.LJJIIJZLJL = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        list = this.LJIIIZ;
                        c3097n = new C2861ag(c10532g);
                        list.add(c3097n);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        list = this.LJJIII;
                        c3097n = new C3097n(c10532g);
                        list.add(c3097n);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        this.LJJIFFI = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        this.LJJII = QV1.LIZIZ(c10532g);
                        break;
                    case 48:
                        this.LJJIIJ = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 50:
                        this.LJJIIZ = QV1.LIZ(c10532g);
                        break;
                    case ImmersedStatusBarUtils.STATUS_BAR_ALPHA_20 /* 51 */:
                        this.LJJIIZI = new C3242t(c10532g);
                        break;
                    case 52:
                        this.LJJIJ = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 53:
                        this.LJJIJIIJI = QV1.LIZ(c10532g);
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
                if (this.f25945LJ == null) {
                    this.f25945LJ = "";
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI == null) {
                    this.LJI = "";
                }
                if (this.LJII == null) {
                    this.LJII = "";
                }
                this.LJIIIIZZ.isEmpty();
                this.LJIIIZ.isEmpty();
                if (this.LJIIJ == null) {
                    this.LJIIJ = "";
                }
                if (this.LJIIL == null) {
                    this.LJIIL = "";
                }
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = "";
                }
                if (this.LJIILJJIL == null) {
                    this.LJIILJJIL = "";
                }
                if (this.LJIILL == null) {
                    this.LJIILL = "";
                }
                if (this.LJIILLIIL == null) {
                    this.LJIILLIIL = "";
                }
                if (this.LJIIZILJ == null) {
                    this.LJIIZILJ = "";
                }
                if (this.LJIJ == null) {
                    this.LJIJ = "";
                }
                if (this.LJIJI == null) {
                    this.LJIJI = "";
                }
                if (this.LJIJJ == null) {
                    this.LJIJJ = "";
                }
                if (this.LJIJJLI == null) {
                    this.LJIJJLI = "";
                }
                this.LJJIII.isEmpty();
                if (this.LJJIIJ == null) {
                    this.LJJIIJ = 0L;
                }
                if (this.LJJIIJZLJL == null) {
                    this.LJJIIJZLJL = 0L;
                }
                if (this.LJJIJ == null) {
                    this.LJJIJ = 0L;
                }
                this.LIZIZ = -1L;
                return;
            }
        }
    }
}
