package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.h */
/* loaded from: classes5.dex */
public final class C2991h implements C3LJ {
    @SerializedName("evaluation_id")
    public long LIZ;
    @SerializedName("audit_status")
    public int LIZIZ;
    @SerializedName("audit_toast")
    public String LIZJ;

    static {
        Covode.recordClassIndex(15337);
    }

    public C2991h() {
        this.LIZJ = "";
    }

    public C2991h(C10532g c10532g) {
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
                    this.LIZIZ = QV1.LIZIZ(c10532g);
                }
            } else {
                this.LIZ = QV1.LIZJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
    }
}
