package com.bytedance.android.live.broadcast.props.p278a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.d */
/* loaded from: classes5.dex */
public final class C3219d implements C3LJ {
    @SerializedName("game_id")
    public String LIZ;
    @SerializedName("guid")
    public String LIZIZ;
    @SerializedName("nick_name")
    public String LIZJ;
    @SerializedName("server_id")
    public Long LIZLLL;
    @SerializedName("server_name")

    /* renamed from: LJ */
    public String f25932LJ;
    @SerializedName("avatar_icon")
    public String LJFF;
    @SerializedName("real_role_id")
    public String LJI;
    @SerializedName("is_default")
    public boolean LJII;
    @SerializedName("role_source")
    public int LJIIIIZZ;

    static {
        Covode.recordClassIndex(17600);
    }

    public C3219d() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = 0L;
        this.f25932LJ = "";
    }

    public C3219d(C10532g c10532g) {
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
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.LIZLLL = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 6:
                        this.f25932LJ = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 8:
                        this.LJII = QV1.LIZ(c10532g);
                        break;
                    case 9:
                        this.LJIIIIZZ = QV1.LIZIZ(c10532g);
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
                    this.LIZLLL = 0L;
                }
                if (this.f25932LJ == null) {
                    this.f25932LJ = "";
                    return;
                }
                return;
            }
        }
    }
}
