package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.g */
/* loaded from: classes5.dex */
public final class C5201g implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5202a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.g$a */
    /* loaded from: classes5.dex */
    public static final class C5202a implements C3LJ {
        @SerializedName("display_entrance")
        public boolean LIZ;
        @SerializedName("game_infos")
        public List<C5214n> LIZIZ;
        @SerializedName("meta_infos")
        public List<C5203b> LIZJ;
        @SerializedName("anchor_status")
        public long LIZLLL;
        @SerializedName("punish_reason")

        /* renamed from: LJ */
        public String f26534LJ;

        static {
            Covode.recordClassIndex(32906);
        }

        public C5202a() {
        }

        public C5202a(C10532g c10532g) {
            List list;
            C3LJ c5214n;
            this.LIZIZ = new ArrayList();
            this.LIZJ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    this.LIZIZ.isEmpty();
                    this.LIZJ.isEmpty();
                    return;
                } else if (LIZIZ != 1) {
                    if (LIZIZ == 2) {
                        list = this.LIZIZ;
                        c5214n = new C5214n(c10532g);
                    } else if (LIZIZ == 3) {
                        list = this.LIZJ;
                        c5214n = new C5203b(c10532g);
                    } else if (LIZIZ == 4) {
                        this.LIZLLL = QV1.LIZJ(c10532g);
                    } else if (LIZIZ != 5) {
                        QV1.LJII(c10532g);
                    } else {
                        this.f26534LJ = QV1.LJFF(c10532g);
                    }
                    list.add(c5214n);
                } else {
                    this.LIZ = QV1.LIZ(c10532g);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.playtogether.c.g$b */
    /* loaded from: classes5.dex */
    public static final class C5203b implements C3LJ {
        @SerializedName("meta_info")
        public C5215o LIZ;
        @SerializedName("config_info")
        public C5213m LIZIZ;

        static {
            Covode.recordClassIndex(32907);
        }

        public C5203b() {
        }

        public C5203b(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZ = new C5215o(c10532g);
                } else if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = new C5213m(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32905);
    }

    public C5201g() {
    }

    public C5201g(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5202a(c10532g);
            }
        }
    }
}
