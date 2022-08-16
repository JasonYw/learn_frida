package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.k */
/* loaded from: classes5.dex */
public final class C5210k implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5211a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.k$a */
    /* loaded from: classes5.dex */
    public static final class C5211a implements C3LJ {
        @SerializedName("toast_msg")
        public String LIZ;

        static {
            Covode.recordClassIndex(32915);
        }

        public C5211a() {
        }

        public C5211a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                } else if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ = QV1.LJFF(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32914);
    }

    public C5210k() {
    }

    public C5210k(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5211a(c10532g);
            }
        }
    }
}
