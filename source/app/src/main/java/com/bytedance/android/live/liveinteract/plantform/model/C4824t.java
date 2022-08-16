package com.bytedance.android.live.liveinteract.plantform.model;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdk.message.model._KtvMusic_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.t */
/* loaded from: classes3.dex */
public final class C4824t implements C3LJ {
    public transient boolean LIZ;
    @SerializedName("user")
    public User LIZIZ;
    @SerializedName("linkmic_id")
    public long LIZJ;
    @SerializedName("modify_time")
    public long LIZLLL;
    @SerializedName("link_status")

    /* renamed from: LJ */
    public int f26427LJ;
    @SerializedName("link_type")
    public int LJFF;
    @SerializedName("role_type")
    public int LJI;
    @SerializedName("user_position")
    public int LJII;
    @SerializedName("silence_status")
    public int LJIIIIZZ;
    @SerializedName("linkmic_id_str")
    public String LJIIIZ;
    @SerializedName("song_list")
    public List<? extends KtvMusic> LJIIJ;
    @SerializedName(Constants.APP_ID)
    public long LJIIJJI;
    @SerializedName("client_version")
    public long LJIIL;
    @SerializedName("device_platform")
    public String LJIILIIL;
    @SerializedName("list_user_type")
    public int LJIILJJIL;
    @SerializedName("list_user_from_type")
    public int LJIILL;
    @SerializedName("application_has_expired")
    public boolean LJIILLIIL;
    @SerializedName("is_mutual_following")
    public boolean LJIIZILJ;
    @SerializedName("application_reason")
    public String LJIJ;
    @SerializedName("last_7_days_gift_count_text")
    public String LJIJI;
    @SerializedName("fan_ticket")
    public String LJIJJ;
    @SerializedName("offset")
    public long LJIJJLI;
    @SerializedName("rank")
    public long LJIL;
    @SerializedName("is_add_price")
    public boolean LJJ;
    @SerializedName("add_price_time_ms")
    public long LJJI;
    @SerializedName("is_anonymous")
    public boolean LJJIFFI;
    @SerializedName("mic_pos_tag_info")
    public MicPosTagInfo LJJII;

    static {
        Covode.recordClassIndex(29442);
    }

    public C4824t() {
        this.LJIIIZ = "";
        this.LJIILIIL = "";
    }

    public C4824t(C10532g c10532g) {
        this.LJIIJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZIZ = _User_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 2:
                        this.LIZJ = QV1.LIZJ(c10532g);
                        break;
                    case 3:
                        this.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 4:
                        this.f26427LJ = QV1.LIZIZ(c10532g);
                        break;
                    case 5:
                        this.LJFF = QV1.LIZIZ(c10532g);
                        break;
                    case 6:
                        this.LJI = QV1.LIZIZ(c10532g);
                        break;
                    case 7:
                        this.LJII = (int) QV1.LIZJ(c10532g);
                        break;
                    case 8:
                        this.LJIIIIZZ = QV1.LIZIZ(c10532g);
                        break;
                    case 9:
                        this.LJIIIZ = QV1.LJFF(c10532g);
                        break;
                    case 10:
                        this.LJIIJ.add(_KtvMusic_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 11:
                        this.LJIIJJI = QV1.LIZJ(c10532g);
                        break;
                    case 12:
                        this.LJIIL = QV1.LIZJ(c10532g);
                        break;
                    case 13:
                        this.LJIILIIL = QV1.LJFF(c10532g);
                        break;
                    case 14:
                        this.LJIILJJIL = QV1.LIZIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        this.LJIILL = QV1.LIZIZ(c10532g);
                        break;
                    case 16:
                        this.LJIILLIIL = QV1.LIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        this.LJIIZILJ = QV1.LIZ(c10532g);
                        break;
                    case 18:
                        this.LJIJ = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        this.LJIJI = QV1.LJFF(c10532g);
                        break;
                    case 20:
                        this.LJIJJ = QV1.LJFF(c10532g);
                        break;
                    case 21:
                        this.LJIJJLI = QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                        this.LJIL = QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.LJJ = QV1.LIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        this.LJJI = QV1.LIZJ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 26:
                        this.LJJII = new MicPosTagInfo(c10532g);
                        break;
                    case 27:
                        this.LJJIFFI = QV1.LIZ(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = "";
                }
                this.LJIIJ.isEmpty();
                if (this.LJIILIIL == null) {
                    this.LJIILIIL = "";
                    return;
                }
                return;
            }
        }
    }
}
