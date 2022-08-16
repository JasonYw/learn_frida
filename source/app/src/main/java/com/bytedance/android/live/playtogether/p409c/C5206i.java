package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.i */
/* loaded from: classes5.dex */
public final class C5206i implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5207a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.i$a */
    /* loaded from: classes5.dex */
    public static final class C5207a implements C3LJ {
        @SerializedName("invite_interval")
        public int LIZ;

        static {
            Covode.recordClassIndex(32911);
        }

        public C5207a() {
        }

        public C5207a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                } else if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ = QV1.LIZIZ(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32910);
    }

    public C5206i() {
    }

    public C5206i(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5207a(c10532g);
            }
        }
    }
}
