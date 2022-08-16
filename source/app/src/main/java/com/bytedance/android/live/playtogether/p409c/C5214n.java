package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.n */
/* loaded from: classes5.dex */
public final class C5214n implements C3LJ {
    @SerializedName("game_id")
    public String LIZ;
    @SerializedName("game_store_schema")
    public String LIZIZ;
    @SerializedName("game_check_authority_schema")
    public String LIZJ;
    @SerializedName("game_name")
    public String LIZLLL;
    @SerializedName("game_icon")

    /* renamed from: LJ */
    public ImageModel f26537LJ;
    @SerializedName("game_desc")
    public String LJFF;
    @SerializedName("game_package_name_android")
    public String LJI;
    @SerializedName("game_package_name_ios")
    public String LJII;
    @SerializedName("game_launcher_schema")
    public String LJIIIIZZ;

    static {
        Covode.recordClassIndex(32918);
    }

    public C5214n() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
    }

    public C5214n(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.f26537LJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        this.LJII = QV1.LJFF(c10532g);
                        break;
                    case 9:
                        this.LJIIIIZZ = QV1.LJFF(c10532g);
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
                if (this.LIZJ == null) {
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
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
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = "";
                    return;
                }
                return;
            }
        }
    }
}
