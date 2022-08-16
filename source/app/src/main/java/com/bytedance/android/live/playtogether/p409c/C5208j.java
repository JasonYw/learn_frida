package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.livesdk.message.model.C8913hd;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.j */
/* loaded from: classes5.dex */
public final class C5208j implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5209a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.j$a */
    /* loaded from: classes5.dex */
    public static final class C5209a implements C3LJ {
        @SerializedName("result")
        public int LIZ;
        @SerializedName("team_member_list")
        public List<C8913hd> LIZIZ;

        static {
            Covode.recordClassIndex(32913);
        }

        public C5209a() {
        }

        public C5209a(C10532g c10532g) {
            this.LIZIZ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    this.LIZIZ.isEmpty();
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZ = QV1.LIZIZ(c10532g);
                } else if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ.add(new C8913hd(c10532g));
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32912);
    }

    public C5208j() {
    }

    public C5208j(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5209a(c10532g);
            }
        }
    }
}
