package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.g */
/* loaded from: classes5.dex */
public final class C3377g implements C3LJ {
    @SerializedName("name")
    public String LIZ;
    @SerializedName("capacity")
    public long LIZIZ;
    @SerializedName("after_live_desc_link_url")
    public String LIZJ;
    @SerializedName("before_live_desc")
    public String LIZLLL;
    @SerializedName("group_id")

    /* renamed from: LJ */
    public long f26022LJ;

    static {
        Covode.recordClassIndex(19194);
    }

    public C3377g() {
        this.LIZ = "";
        this.LIZIZ = 0L;
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f26022LJ = 0L;
    }

    public C3377g(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            if (LIZIZ != 5) {
                                QV1.LJII(c10532g);
                            } else {
                                this.LIZLLL = QV1.LJFF(c10532g);
                            }
                        } else {
                            this.LIZJ = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.f26022LJ = QV1.LIZJ(c10532g);
                    }
                } else {
                    this.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        if (this.LIZIZ == 0) {
            this.LIZIZ = 0L;
        }
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        if (this.f26022LJ == 0) {
            this.f26022LJ = 0L;
        }
    }
}
