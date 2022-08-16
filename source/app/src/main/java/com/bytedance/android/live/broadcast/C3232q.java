package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.q */
/* loaded from: classes5.dex */
public final class C3232q implements C3LJ {
    @SerializedName("item_id")
    public String LIZ;
    @SerializedName("author")
    public C2859a LIZIZ;
    @SerializedName("title")
    public String LIZJ;
    @SerializedName("cover_url")
    public String LIZLLL;
    @SerializedName("digg_count")

    /* renamed from: LJ */
    public Integer f25938LJ;

    static {
        Covode.recordClassIndex(17697);
    }

    public C3232q() {
        this.LIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25938LJ = 0;
    }

    public C3232q(C10532g c10532g) {
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
                                this.f25938LJ = Integer.valueOf(QV1.LIZIZ(c10532g));
                            }
                        } else {
                            this.LIZLLL = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LIZJ = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZIZ = new C2859a(c10532g);
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        if (this.f25938LJ == null) {
            this.f25938LJ = 0;
        }
    }
}
