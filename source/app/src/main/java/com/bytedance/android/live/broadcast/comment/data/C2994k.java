package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.k */
/* loaded from: classes5.dex */
public final class C2994k implements C3LJ {
    @SerializedName("total")
    public long LIZ;
    @SerializedName("has_more")
    public boolean LIZIZ;
    @SerializedName("comment_detail")
    public List<C2987d> LIZJ;

    static {
        Covode.recordClassIndex(15340);
    }

    public C2994k() {
        this.LIZIZ = true;
    }

    public C2994k(C10532g c10532g) {
        this.LIZJ = new ArrayList();
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
                        this.LIZJ.add(new C2987d(c10532g));
                    }
                } else {
                    this.LIZIZ = QV1.LIZ(c10532g);
                }
            } else {
                this.LIZ = QV1.LIZJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (!this.LIZIZ) {
            this.LIZIZ = true;
        }
        this.LIZJ.isEmpty();
    }
}
