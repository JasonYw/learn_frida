package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.e */
/* loaded from: classes5.dex */
public final class C2988e implements C3LJ {
    @SerializedName("avg_grade")
    public double LIZ;
    @SerializedName("total")
    public long LIZIZ;
    @SerializedName("is_evaluated")
    public boolean LIZJ;
    @SerializedName("hidden_evaluation")
    public int LIZLLL;
    @SerializedName("handle_evaluation")

    /* renamed from: LJ */
    public int f25810LJ;

    static {
        Covode.recordClassIndex(15320);
    }

    public C2988e() {
        this.LIZLLL = 1;
    }

    public C2988e(C10532g c10532g) {
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
                                this.f25810LJ = QV1.LIZIZ(c10532g);
                            }
                        } else {
                            this.LIZLLL = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        this.LIZJ = QV1.LIZ(c10532g);
                    }
                } else {
                    this.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZ = QV1.m22903LJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZLLL == 0) {
            this.LIZLLL = 1;
        }
    }
}
