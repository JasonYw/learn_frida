package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.w */
/* loaded from: classes5.dex */
public final class C5228w implements C3LJ {
    @SerializedName("nodes")
    public List<C5227v> LIZ;
    @SerializedName("status")
    public int LIZIZ;
    @SerializedName("play_record")
    public C5216p LIZJ;

    static {
        Covode.recordClassIndex(32933);
    }

    public C5228w() {
    }

    public C5228w(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                this.LIZ.isEmpty();
                return;
            } else if (LIZIZ == 1) {
                this.LIZ.add(new C5227v(c10532g));
            } else if (LIZIZ == 2) {
                this.LIZIZ = QV1.LIZIZ(c10532g);
            } else if (LIZIZ != 3) {
                QV1.LJII(c10532g);
            } else {
                this.LIZJ = new C5216p(c10532g);
            }
        }
    }
}
