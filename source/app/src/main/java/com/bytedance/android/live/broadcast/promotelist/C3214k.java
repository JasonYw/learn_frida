package com.bytedance.android.live.broadcast.promotelist;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.promotelist.k */
/* loaded from: classes5.dex */
public final class C3214k implements C3LJ {
    @SerializedName("games")
    public List<C3215l> LIZ;

    static {
        Covode.recordClassIndex(17538);
    }

    public C3214k() {
        this.LIZ = new ArrayList();
    }

    public C3214k(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ.add(new C3215l(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
