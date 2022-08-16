package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.r */
/* loaded from: classes5.dex */
public final class C3233r implements C3LJ {
    @SerializedName("title")
    public String LIZ;
    @SerializedName("evaluation_videos")
    public List<C3232q> LIZIZ;
    @SerializedName("total_count")
    public Long LIZJ;

    static {
        Covode.recordClassIndex(17705);
    }

    public C3233r() {
        this.LIZ = "";
        this.LIZJ = 0L;
    }

    public C3233r(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
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
                        this.LIZJ = Long.valueOf(QV1.LIZJ(c10532g));
                    }
                } else {
                    this.LIZIZ.add(new C3232q(c10532g));
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        this.LIZIZ.isEmpty();
        if (this.LIZJ == null) {
            this.LIZJ = 0L;
        }
    }
}
