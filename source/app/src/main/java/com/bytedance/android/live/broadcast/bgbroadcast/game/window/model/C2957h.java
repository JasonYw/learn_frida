package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.h */
/* loaded from: classes5.dex */
public final class C2957h implements C3LJ {
    @SerializedName("icon")
    public String LIZ;
    @SerializedName("name")
    public String LIZIZ;
    @SerializedName("desc")
    public String LIZJ;

    static {
        Covode.recordClassIndex(14919);
    }

    public C2957h() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
    }

    public C2957h(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
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
    }
}
