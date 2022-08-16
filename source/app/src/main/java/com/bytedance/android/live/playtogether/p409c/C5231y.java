package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.y */
/* loaded from: classes5.dex */
public final class C5231y implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5232a LIZ;

    static {
        Covode.recordClassIndex(32936);
    }

    public C5231y() {
    }

    public C5231y(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5232a(c10532g);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.playtogether.c.y$a */
    /* loaded from: classes5.dex */
    public static final class C5232a implements C3LJ {
        @SerializedName("is_authorized")
        public boolean LIZ;
        @SerializedName("game_check_authority_schema")
        public String LIZIZ;
        @SerializedName("play_id")
        public long LIZJ;
        @SerializedName("play_id_str")
        public String LIZLLL;
        @SerializedName("desc_prohibit")

        /* renamed from: LJ */
        public boolean f26542LJ;

        static {
            Covode.recordClassIndex(32937);
        }

        public C5232a() {
            this.LIZIZ = "";
            this.LIZLLL = "";
        }

        public C5232a(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    break;
                } else if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 5) {
                                    QV1.LJII(c10532g);
                                } else {
                                    this.f26542LJ = QV1.LIZ(c10532g);
                                }
                            } else {
                                this.LIZLLL = QV1.LJFF(c10532g);
                            }
                        } else {
                            this.LIZJ = QV1.LIZJ(c10532g);
                        }
                    } else {
                        this.LIZIZ = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZ = QV1.LIZ(c10532g);
                }
            }
            c10532g.LIZ(LIZ);
            if (this.LIZIZ == null) {
                this.LIZIZ = "";
            }
            if (this.LIZLLL == null) {
                this.LIZLLL = "";
            }
        }
    }
}
