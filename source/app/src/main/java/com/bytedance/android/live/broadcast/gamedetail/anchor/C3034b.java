package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.b */
/* loaded from: classes5.dex */
public final class C3034b implements C3LJ {
    @SerializedName("msg_id")
    public String LIZ;
    @SerializedName("title")
    public String LIZIZ;
    @SerializedName("create_time_stamp")
    public Long LIZJ;
    @SerializedName("text")
    public String LIZLLL;
    @SerializedName("tail")

    /* renamed from: LJ */
    public String f25841LJ;

    static {
        Covode.recordClassIndex(16039);
    }

    public C3034b() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = 0L;
        this.LIZLLL = "";
        this.f25841LJ = "";
    }

    public C3034b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 5) {
                    if (LIZIZ != 6) {
                        if (LIZIZ != 7) {
                            if (LIZIZ != 8) {
                                QV1.LJII(c10532g);
                            } else {
                                this.f25841LJ = QV1.LJFF(c10532g);
                            }
                        } else {
                            this.LIZLLL = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LIZJ = Long.valueOf(QV1.LIZJ(c10532g));
                    }
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
        if (this.LIZJ == null) {
            this.LIZJ = 0L;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        if (this.f25841LJ == null) {
            this.f25841LJ = "";
        }
    }
}
