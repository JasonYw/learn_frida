package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.internal.C33838c;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.m */
/* loaded from: classes5.dex */
public final class C3582m implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C3583a LIZ;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.m$a */
    /* loaded from: classes5.dex */
    public static final class C3583a implements C3LJ {
        @SerializedName(C33838c.f42636f)
        public C3569a LIZ;

        static {
            Covode.recordClassIndex(20449);
        }

        public C3583a() {
        }

        public C3583a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                } else if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ = new C3569a(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(20448);
    }

    public C3582m() {
    }

    public C3582m(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C3583a(c10532g);
            }
        }
    }
}
