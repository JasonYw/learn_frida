package com.bytedance.android.live.broadcast.gamedetailv2.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.data.a */
/* loaded from: classes5.dex */
public final class C3118a implements C3LJ {
    @SerializedName("package_size_switch")
    public boolean LIZ;
    @SerializedName("evaluation_entrance")
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(16637);
    }

    public C3118a() {
    }

    public C3118a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LIZ(c10532g);
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ = QV1.LIZ(c10532g);
            }
        }
    }
}
