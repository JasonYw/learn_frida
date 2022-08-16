package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.t */
/* loaded from: classes3.dex */
public final class C2926t implements C3LJ {
    @SerializedName("tab_items")
    public List<GameTabItem> LIZ;

    static {
        Covode.recordClassIndex(14588);
    }

    public C2926t() {
    }

    public C2926t(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                this.LIZ.isEmpty();
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ.add(new GameTabItem(c10532g));
            }
        }
    }
}
