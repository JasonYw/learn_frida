package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.ac */
/* loaded from: classes5.dex */
public final class C3372ac implements C3LJ {
    @SerializedName("cells")
    public List<C3380j> LIZ;

    static {
        Covode.recordClassIndex(19183);
    }

    public C3372ac() {
        this.LIZ = new ArrayList();
    }

    public C3372ac(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ.add(new C3380j(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
