package com.bytedance.android.live.broadcast.gamedetail.anchor;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.j */
/* loaded from: classes5.dex */
public final class C3037j implements C3LJ {
    @SerializedName("brief")
    public String LIZ;
    @SerializedName("jump_url")
    public String LIZIZ;
    @SerializedName("pc_jump_url")
    public String LIZJ;
    @SerializedName("msg_id")
    public String LIZLLL;
    @SerializedName("tracking_data")

    /* renamed from: LJ */
    public C3038k f25843LJ;

    static {
        Covode.recordClassIndex(16089);
    }

    public C3037j() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
    }

    public C3037j(C10532g c10532g) {
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
                                this.f25843LJ = new C3038k(c10532g);
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
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
    }
}
