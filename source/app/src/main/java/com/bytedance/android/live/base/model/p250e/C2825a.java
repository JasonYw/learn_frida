package com.bytedance.android.live.base.model.p250e;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.base.model.e.a */
/* loaded from: classes5.dex */
public final class C2825a implements C3LJ {
    @SerializedName("need_certification")
    public boolean LIZ;

    static {
        Covode.recordClassIndex(14016);
    }

    public C2825a() {
        this.LIZ = true;
    }

    public C2825a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = QV1.LIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (!this.LIZ) {
            this.LIZ = true;
        }
    }
}
