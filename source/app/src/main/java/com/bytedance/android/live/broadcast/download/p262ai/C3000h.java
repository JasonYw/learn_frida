package com.bytedance.android.live.broadcast.download.p262ai;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.download.ai.h */
/* loaded from: classes5.dex */
public final class C3000h implements C3LJ {
    @SerializedName("games")
    public List<C2999f> LIZ;

    static {
        Covode.recordClassIndex(15560);
    }

    public C3000h() {
        this.LIZ = new ArrayList();
    }

    public C3000h(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ.add(new C2999f(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
