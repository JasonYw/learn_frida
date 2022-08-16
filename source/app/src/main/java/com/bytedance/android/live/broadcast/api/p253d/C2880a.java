package com.bytedance.android.live.broadcast.api.p253d;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.d.a */
/* loaded from: classes5.dex */
public final class C2880a implements C3LJ {
    @SerializedName("check_result")
    public String LIZ;
    @SerializedName("download_status")
    public Long LIZIZ;

    static {
        Covode.recordClassIndex(14427);
    }

    public C2880a() {
    }

    public C2880a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ = Long.valueOf(QV1.LIZJ(c10532g));
            }
        }
    }
}
