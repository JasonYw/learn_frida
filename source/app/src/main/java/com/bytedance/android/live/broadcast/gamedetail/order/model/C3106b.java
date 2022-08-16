package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.b */
/* loaded from: classes5.dex */
public final class C3106b implements C3LJ {
    @SerializedName("meet")
    public boolean LIZ;
    @SerializedName("entry_limit_single")
    public String LIZIZ;

    static {
        Covode.recordClassIndex(16516);
    }

    public C3106b() {
        this.LIZIZ = "";
    }

    public C3106b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZ = QV1.LIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
    }
}
