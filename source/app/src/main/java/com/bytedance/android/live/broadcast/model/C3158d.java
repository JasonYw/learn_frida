package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.model.d */
/* loaded from: classes5.dex */
public final class C3158d implements C3LJ {
    @SerializedName("draw_something_id")
    public long LIZ;
    @SerializedName("duration")
    public long LIZIZ;
    @SerializedName("tips_duration")
    public List<Long> LIZJ;

    static {
        Covode.recordClassIndex(16992);
    }

    public C3158d() {
        this.LIZIZ = 70L;
    }

    public C3158d(C10532g c10532g) {
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
                        this.LIZJ.add(Long.valueOf(QV1.LIZJ(c10532g)));
                    }
                } else {
                    this.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZ = QV1.LIZJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZIZ == 0) {
            this.LIZIZ = 70L;
        }
        this.LIZJ.isEmpty();
    }
}
