package com.bytedance.android.live.broadcast.props.p278a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.props.a.g */
/* loaded from: classes5.dex */
public final class C3222g implements C3LJ {
    @SerializedName("is_multi_role")
    public boolean LIZ;

    static {
        Covode.recordClassIndex(17603);
    }

    public C3222g() {
    }

    public C3222g(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = QV1.LIZ(c10532g);
            }
        }
    }
}
