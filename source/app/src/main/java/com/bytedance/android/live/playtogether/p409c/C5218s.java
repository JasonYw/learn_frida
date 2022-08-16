package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.s */
/* loaded from: classes5.dex */
public final class C5218s implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5219a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.s$a */
    /* loaded from: classes5.dex */
    public static final class C5219a implements C3LJ {
        @SerializedName("orders")
        public List<C5220b> LIZ;
        @SerializedName("total")
        public int LIZIZ;

        static {
            Covode.recordClassIndex(32924);
        }

        public C5219a() {
        }

        public C5219a(C10532g c10532g) {
            this.LIZ = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    this.LIZ.isEmpty();
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZ.add(new C5220b(c10532g));
                } else if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZIZ(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32923);
    }

    public C5218s() {
    }

    public C5218s(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5219a(c10532g);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.playtogether.c.s$c */
    /* loaded from: classes5.dex */
    public static final class C5221c implements C3LJ {
        @SerializedName("nick_name")
        public String LIZ;
        @SerializedName("icon_url")
        public ImageModel LIZIZ;

        static {
            Covode.recordClassIndex(32926);
        }

        public C5221c() {
            this.LIZ = "";
        }

        public C5221c(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    break;
                } else if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                    }
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

    /* renamed from: com.bytedance.android.live.playtogether.c.s$b */
    /* loaded from: classes5.dex */
    public static final class C5220b implements C3LJ {
        @SerializedName("order_id")
        public String LIZ;
        @SerializedName("game_info")
        public C5214n LIZIZ;
        @SerializedName("service_meta_info")
        public C5215o LIZJ;
        @SerializedName("play_record")
        public C5216p LIZLLL;
        @SerializedName("provider_info")

        /* renamed from: LJ */
        public C5221c f26540LJ;
        @SerializedName("order_status")
        public int LJFF;
        @SerializedName("actual_pay_diamonds")
        public String LJI;
        @SerializedName("order_create_time")
        public String LJII;
        @SerializedName("audit_status")
        public int LJIIIIZZ;
        @SerializedName("refund_audit_status")
        public int LJIIIZ;

        static {
            Covode.recordClassIndex(32925);
        }

        public C5220b() {
            this.LIZ = "";
            this.LJI = "";
            this.LJII = "";
        }

        public C5220b(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ != -1) {
                    switch (LIZIZ) {
                        case 1:
                            this.LIZ = QV1.LJFF(c10532g);
                            break;
                        case 2:
                            this.LIZIZ = new C5214n(c10532g);
                            break;
                        case 3:
                            this.LIZJ = new C5215o(c10532g);
                            break;
                        case 4:
                            this.LIZLLL = new C5216p(c10532g);
                            break;
                        case 5:
                            this.f26540LJ = new C5221c(c10532g);
                            break;
                        case 6:
                            this.LJFF = QV1.LIZIZ(c10532g);
                            break;
                        case 7:
                        default:
                            QV1.LJII(c10532g);
                            break;
                        case 8:
                            this.LJI = QV1.LJFF(c10532g);
                            break;
                        case 9:
                            this.LJII = QV1.LJFF(c10532g);
                            break;
                        case 10:
                            this.LJIIIIZZ = QV1.LIZIZ(c10532g);
                            break;
                        case 11:
                            this.LJIIIZ = QV1.LIZIZ(c10532g);
                            break;
                    }
                } else {
                    c10532g.LIZ(LIZ);
                    if (this.LIZ == null) {
                        this.LIZ = "";
                    }
                    if (this.LJI == null) {
                        this.LJI = "";
                    }
                    if (this.LJII == null) {
                        this.LJII = "";
                        return;
                    }
                    return;
                }
            }
        }
    }
}
