package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.x */
/* loaded from: classes5.dex */
public final class C5229x implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5230a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.x$a */
    /* loaded from: classes5.dex */
    public static final class C5230a implements C3LJ {
        @SerializedName("business_id")
        public long LIZ;

        static {
            Covode.recordClassIndex(32935);
        }

        public C5230a() {
        }

        public C5230a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                } else if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ = QV1.LIZJ(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32934);
    }

    public C5229x() {
    }

    public C5229x(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5230a(c10532g);
            }
        }
    }
}
