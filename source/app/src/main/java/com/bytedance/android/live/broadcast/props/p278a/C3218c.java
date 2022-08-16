package com.bytedance.android.live.broadcast.props.p278a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.c */
/* loaded from: classes5.dex */
public final class C3218c implements C3LJ {
    @SerializedName("verify_decision_detail")
    public String LIZ;
    @SerializedName("check_code")
    public Integer LIZIZ;

    static {
        Covode.recordClassIndex(17599);
    }

    public C3218c() {
        this.LIZ = "";
        this.LIZIZ = 0;
    }

    public C3218c(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZIZ = Integer.valueOf(QV1.LIZIZ(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = 0;
        }
    }
}
