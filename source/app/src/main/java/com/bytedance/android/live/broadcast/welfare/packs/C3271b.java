package com.bytedance.android.live.broadcast.welfare.packs;

import com.bytedance.android.live.broadcast.promotelist.C3213g;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.packs.b */
/* loaded from: classes5.dex */
public final class C3271b implements C3LJ {
    @SerializedName("gift_infos")
    public C3213g LIZ;

    static {
        Covode.recordClassIndex(18242);
    }

    public C3271b() {
    }

    public C3271b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C3213g(c10532g);
            }
        }
    }
}
