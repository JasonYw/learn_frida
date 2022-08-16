package com.bytedance.android.live.playtogether.p409c;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.p */
/* loaded from: classes5.dex */
public final class C5216p implements C3LJ {
    @SerializedName("play_id")
    public long LIZ;
    @SerializedName("play_id_str")
    public String LIZIZ;
    @SerializedName("type")
    public int LIZJ;
    @SerializedName("game_id")
    public String LIZLLL;
    @SerializedName("owner_uid")

    /* renamed from: LJ */
    public long f26539LJ;
    @SerializedName("room_id")
    public long LJFF;
    @SerializedName("room_id_str")
    public String LJI;
    @SerializedName("desc")
    public String LJII;
    @SerializedName("fare")
    public int LJIIIIZZ;
    @SerializedName("fare_desc")
    public String LJIIIZ;
    @SerializedName("people_count")
    public int LJIIJ;
    @SerializedName("status")
    public int LJIIJJI;
    @SerializedName("create_time")
    public String LJIIL;
    @SerializedName("update_time")
    public String LJIILIIL;
    @SerializedName("extra")
    public String LJIILJJIL;
    @SerializedName("diamonds")
    public int LJIILL;
    @SerializedName("game_icon")
    public ImageModel LJIILLIIL;
    @SerializedName("real_people_count")
    public int LJIIZILJ;
    @SerializedName("audit_deny_reason")
    public String LJIJ;
    @SerializedName("finish_time")
    public String LJIJI;

    static {
        Covode.recordClassIndex(32920);
    }

    public C5216p() {
        this.LIZIZ = "";
        this.LIZLLL = "";
        this.LJI = "";
        this.LJII = "";
        this.LJIIIZ = "";
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIILJJIL = "";
        this.LJIJ = "";
        this.LJIJI = "";
    }

    public C5216p(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZJ = QV1.LIZIZ(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.f26539LJ = QV1.LIZJ(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        this.LJII = QV1.LJFF(c10532g);
                        break;
                    case 9:
                        this.LJIIIIZZ = QV1.LIZIZ(c10532g);
                        break;
                    case 10:
                        this.LJIIIZ = QV1.LJFF(c10532g);
                        break;
                    case 11:
                        this.LJIIJ = QV1.LIZIZ(c10532g);
                        break;
                    case 12:
                        this.LJIIJJI = QV1.LIZIZ(c10532g);
                        break;
                    case 13:
                        this.LJIIL = QV1.LJFF(c10532g);
                        break;
                    case 14:
                        this.LJIILIIL = QV1.LJFF(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        this.LJIILJJIL = QV1.LJFF(c10532g);
                        break;
                    case 16:
                        this.LJIILL = QV1.LIZIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                        this.LJIILLIIL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 18:
                        this.LJIIZILJ = QV1.LIZIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                        this.LJIJ = QV1.LJFF(c10532g);
                        break;
                    case 20:
                        this.LJIJI = QV1.LJFF(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
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
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = "";
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
