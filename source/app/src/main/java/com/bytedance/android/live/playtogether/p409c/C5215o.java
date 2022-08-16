package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.o */
/* loaded from: classes5.dex */
public final class C5215o implements C3LJ {
    @SerializedName("type")
    public int LIZ;
    @SerializedName("name")
    public String LIZIZ;
    @SerializedName("play_desc_schema")
    public String LIZJ;
    @SerializedName("play_license_schema")
    public String LIZLLL;
    @SerializedName("feature_schema")

    /* renamed from: LJ */
    public String f26538LJ;
    @SerializedName("exchange_rate")
    public int LJFF;

    static {
        Covode.recordClassIndex(32919);
    }

    public C5215o() {
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f26538LJ = "";
    }

    public C5215o(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LIZIZ(c10532g);
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
                        this.f26538LJ = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LIZIZ(c10532g);
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
                if (this.LIZJ == null) {
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.f26538LJ == null) {
                    this.f26538LJ = "";
                    return;
                }
                return;
            }
        }
    }
}
