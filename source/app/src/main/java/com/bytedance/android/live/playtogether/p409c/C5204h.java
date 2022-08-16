package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.h */
/* loaded from: classes5.dex */
public final class C5204h implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5205a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.h$a */
    /* loaded from: classes5.dex */
    public static final class C5205a implements C3LJ {
        @SerializedName("report_tags")
        public List<C5217q> LIZ;

        static {
            Covode.recordClassIndex(32909);
        }

        public C5205a() {
        }

        public C5205a(C10532g c10532g) {
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
                    this.LIZ.add(new C5217q(c10532g));
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32908);
    }

    public C5204h() {
    }

    public C5204h(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5205a(c10532g);
            }
        }
    }
}
