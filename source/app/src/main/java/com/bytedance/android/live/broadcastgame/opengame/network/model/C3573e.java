package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.e */
/* loaded from: classes5.dex */
public final class C3573e implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C3574a LIZ;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.e$a */
    /* loaded from: classes5.dex */
    public static final class C3574a implements C3LJ {
        static {
            Covode.recordClassIndex(20439);
        }

        public C3574a() {
        }

        public C3574a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (c10532g.LIZIZ() != -1) {
                QV1.LJII(c10532g);
            }
            c10532g.LIZ(LIZ);
        }
    }

    static {
        Covode.recordClassIndex(20438);
    }

    public C3573e() {
    }

    public C3573e(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C3574a(c10532g);
            }
        }
    }
}
