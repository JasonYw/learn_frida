package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.e */
/* loaded from: classes5.dex */
public final class C5198e implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5199a LIZ;

    static {
        Covode.recordClassIndex(32902);
    }

    public C5198e() {
    }

    public C5198e(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5199a(c10532g);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.playtogether.c.e$a */
    /* loaded from: classes5.dex */
    public static final class C5199a implements C3LJ {
        @SerializedName("toast")
        public String LIZ;

        static {
            Covode.recordClassIndex(32903);
        }

        public C5199a() {
            this.LIZ = "";
        }

        public C5199a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    break;
                } else if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZ = QV1.LJFF(c10532g);
                }
            }
            c10532g.LIZ(LIZ);
            if (this.LIZ == null) {
                this.LIZ = "";
            }
        }
    }
}
