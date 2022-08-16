package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.e */
/* loaded from: classes5.dex */
public final class C2954e implements C3LJ {
    @SerializedName("infos")
    public List<C2953d> LIZ;
    @SerializedName("total_count")
    public long LIZIZ;

    static {
        Covode.recordClassIndex(14916);
    }

    public C2954e() {
        this.LIZ = new ArrayList();
    }

    public C2954e(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZ.add(new C2953d(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
