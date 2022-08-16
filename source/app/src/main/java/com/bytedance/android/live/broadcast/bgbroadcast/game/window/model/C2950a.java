package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.broadcast.api.gamepromote.GameStageType;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.a */
/* loaded from: classes5.dex */
public final class C2950a implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33968a.f42937f)
    public String LIZIZ;
    @SerializedName("name")
    public String LIZJ;
    @SerializedName("status")
    public String LIZLLL;
    @SerializedName("icon")

    /* renamed from: LJ */
    public String f25789LJ;
    @SerializedName("company")
    public String LJFF;
    @SerializedName("publisher")
    public String LJI;
    @SerializedName("tags")
    public List<String> LJII;
    @SerializedName("android_short_url")
    public String LJIIIIZZ;
    @SerializedName("images")
    public Map<String, String> LJIIIZ;
    @SerializedName("introduce")
    public String LJIIJ;
    @SerializedName("android_package_size")
    public String LJIIJJI;
    @SerializedName("android_version")
    public String LJIIL;
    @SerializedName("version_code")
    public String LJIILIIL;
    @SerializedName("android_privacy_url")
    public String LJIILJJIL;
    @SerializedName("authorization_url")
    public String LJIILL;
    @SerializedName("package_update_time")
    public String LJIILLIIL;
    @SerializedName("background_color")
    public String LJIIZILJ;
    @SerializedName("android_package_name")
    public String LJIJ;
    @SerializedName("download_extra")
    public String LJIJI;
    @SerializedName("anti_hijack_content")
    public String LJIJJ;
    @SerializedName("anti_hijack_image")
    public String LJIJJLI;
    @SerializedName("game_stage")
    public int LJIL;

    static {
        Covode.recordClassIndex(14912);
    }

    public final GameStageType LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (GameStageType) proxy.result;
        }
        return GameStageType.Companion.LIZ(Integer.valueOf(this.LJIL));
    }

    public C2950a() {
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25789LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJIIIIZZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIILJJIL = "";
        this.LJIILL = "";
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
        this.LJIJ = "";
        this.LJIJI = "";
    }

    public C2950a(C10532g c10532g) {
        this.LJII = new ArrayList();
        this.LJIIIZ = new HashMap();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 6) {
                                    if (LIZIZ != 7) {
                                        if (LIZIZ != 8) {
                                            if (LIZIZ != 11) {
                                                if (LIZIZ != 12) {
                                                    if (LIZIZ != 14) {
                                                        if (LIZIZ != 17) {
                                                            if (LIZIZ != 29) {
                                                                if (LIZIZ != 32) {
                                                                    if (LIZIZ != 47) {
                                                                        if (LIZIZ != 34) {
                                                                            if (LIZIZ != 35) {
                                                                                switch (LIZIZ) {
                                                                                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                                                                                        this.LJIJ = QV1.LJFF(c10532g);
                                                                                        continue;
                                                                                    case 20:
                                                                                        this.LJIILIIL = QV1.LJFF(c10532g);
                                                                                        continue;
                                                                                    case 21:
                                                                                        this.LJIILJJIL = QV1.LJFF(c10532g);
                                                                                        continue;
                                                                                    default:
                                                                                        switch (LIZIZ) {
                                                                                            case MotionEventCompat.AXIS_BRAKE /* 23 */:
                                                                                                this.LJIILL = QV1.LJFF(c10532g);
                                                                                                continue;
                                                                                                continue;
                                                                                            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                                                                                                this.LJIILLIIL = QV1.LJFF(c10532g);
                                                                                                continue;
                                                                                            case MotionEventCompat.AXIS_TILT /* 25 */:
                                                                                                this.LJIIZILJ = QV1.LJFF(c10532g);
                                                                                                continue;
                                                                                            default:
                                                                                                QV1.LJII(c10532g);
                                                                                                continue;
                                                                                        }
                                                                                }
                                                                            } else {
                                                                                this.LJIJJLI = QV1.LJFF(c10532g);
                                                                            }
                                                                        } else {
                                                                            this.LJIJJ = QV1.LJFF(c10532g);
                                                                        }
                                                                    } else {
                                                                        this.LJIL = QV1.LIZIZ(c10532g);
                                                                    }
                                                                } else {
                                                                    this.LJI = QV1.LJFF(c10532g);
                                                                }
                                                            } else {
                                                                this.LJIJI = QV1.LJFF(c10532g);
                                                            }
                                                        } else {
                                                            this.LJIIJJI = QV1.LJFF(c10532g);
                                                        }
                                                    } else {
                                                        this.LJIIL = QV1.LJFF(c10532g);
                                                    }
                                                } else {
                                                    this.LJIIJ = QV1.LJFF(c10532g);
                                                }
                                            } else {
                                                long LIZ3 = c10532g.LIZ();
                                                String str = null;
                                                String str2 = null;
                                                while (true) {
                                                    int LIZIZ2 = c10532g.LIZIZ();
                                                    if (LIZIZ2 != -1) {
                                                        if (LIZIZ2 != 1) {
                                                            if (LIZIZ2 != 2) {
                                                                QV1.LJII(c10532g);
                                                            } else {
                                                                str2 = QV1.LJFF(c10532g);
                                                            }
                                                        } else {
                                                            str = QV1.LJFF(c10532g);
                                                        }
                                                    } else {
                                                        c10532g.LIZ(LIZ3);
                                                        Map<String, String> map = this.LJIIIZ;
                                                        if (str != null) {
                                                            if (str2 != null) {
                                                                map.put(str, str2);
                                                            } else {
                                                                throw new IllegalStateException("Value must not be null");
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Key must not be null");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.LJIIIIZZ = QV1.LJFF(c10532g);
                                        }
                                    } else {
                                        this.LJII.add(QV1.LJFF(c10532g));
                                    }
                                } else {
                                    this.LJFF = QV1.LJFF(c10532g);
                                }
                            } else {
                                this.f25789LJ = QV1.LJFF(c10532g);
                            }
                        } else {
                            this.LIZLLL = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LIZJ = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZIZ = QV1.LJFF(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
                }
                if (this.LIZJ == null) {
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.f25789LJ == null) {
                    this.f25789LJ = "";
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
                }
                if (this.LJI == null) {
                    this.LJI = "";
                }
                this.LJII.isEmpty();
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = "";
                }
                if (this.LJIIJ == null) {
                    this.LJIIJ = "";
                }
                if (this.LJIIJJI == null) {
                    this.LJIIJJI = "";
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
                    return;
                }
                return;
            }
        }
    }
}
