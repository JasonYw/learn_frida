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

/* renamed from: com.bytedance.android.live.playtogether.c.a */
/* loaded from: classes5.dex */
public final class C5192a implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5193a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.a$a */
    /* loaded from: classes5.dex */
    public static final class C5193a implements C3LJ {
        @SerializedName("member_list")
        public List<C8913hd> LIZ;
        @SerializedName("game_info")
        public C5214n LIZIZ;
        @SerializedName("play_record")
        public C5216p LIZJ;
        @SerializedName("meta_info")
        public C5215o LIZLLL;

        static {
            Covode.recordClassIndex(32858);
        }

        public C5193a() {
        }

        public C5193a(C10532g c10532g) {
            this.LIZ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    this.LIZ.isEmpty();
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZ.add(new C8913hd(c10532g));
                } else if (LIZIZ == 2) {
                    this.LIZIZ = new C5214n(c10532g);
                } else if (LIZIZ == 3) {
                    this.LIZJ = new C5216p(c10532g);
                } else if (LIZIZ != 4) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZLLL = new C5215o(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32857);
    }

    public C5192a() {
    }

    public C5192a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5193a(c10532g);
            }
        }
    }
}
