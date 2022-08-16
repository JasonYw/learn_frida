package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.c */
/* loaded from: classes5.dex */
public final class C3107c implements C3LJ {
    @SerializedName("avatar_uri")
    public String LIZ;
    @SerializedName("owner_uid")
    public long LIZIZ;
    @SerializedName("entry_limit")
    public C3105a LIZJ;
    @SerializedName("name")
    public String LIZLLL;
    @SerializedName("notice")

    /* renamed from: LJ */
    public String f25878LJ;
    @SerializedName("member_count")
    public long LJFF;
    @SerializedName("group_id")
    public String LJI;
    @SerializedName("apply_status")
    public int LJII;

    static {
        Covode.recordClassIndex(16517);
    }

    public C3107c() {
        this.LIZLLL = null;
        this.LIZ = "";
        this.f25878LJ = null;
        this.LJFF = 0L;
        this.LJI = null;
        this.LJII = 0;
    }

    public C3107c(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.f25878LJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LJFF = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        this.LJI = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJII = QV1.LIZIZ(c10532g);
                        break;
                    case 7:
                        this.LIZJ = new C3105a(c10532g);
                        break;
                    case 8:
                        this.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZLLL == null) {
                    this.LIZLLL = null;
                }
                if (this.LIZ == null) {
                    this.LIZ = "";
                }
                if (this.f25878LJ == null) {
                    this.f25878LJ = null;
                }
                if (this.LJFF == 0) {
                    this.LJFF = 0L;
                }
                if (this.LJI == null) {
                    this.LJI = null;
                }
                if (this.LJII == 0) {
                    this.LJII = 0;
                    return;
                }
                return;
            }
        }
    }
}
