package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.u */
/* loaded from: classes5.dex */
public final class C5225u implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5226a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.u$a */
    /* loaded from: classes5.dex */
    public static final class C5226a implements C3LJ {
        @SerializedName("records")
        public List<C5216p> LIZ;
        @SerializedName("total")
        public int LIZIZ;

        static {
            Covode.recordClassIndex(32931);
        }

        public C5226a() {
        }

        public C5226a(C10532g c10532g) {
            this.LIZ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    this.LIZ.isEmpty();
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZ.add(new C5216p(c10532g));
                } else if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZIZ(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32930);
    }

    public C5225u() {
    }

    public C5225u(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5226a(c10532g);
            }
        }
    }
}
