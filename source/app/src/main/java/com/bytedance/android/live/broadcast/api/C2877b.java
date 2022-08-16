package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.internal.C33838c;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.b */
/* loaded from: classes5.dex */
public final class C2877b implements C3LJ {
    @SerializedName(C33838c.f42636f)
    public C2927w LIZ;
    @SerializedName("is_promoted_prop_game")
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(14419);
    }

    public C2877b() {
    }

    public C2877b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = new C2927w(c10532g);
            } else if (LIZIZ != 14) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ = QV1.LIZ(c10532g);
            }
        }
    }
}
