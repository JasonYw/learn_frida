package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.t */
/* loaded from: classes5.dex */
public final class C5222t implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public C5223a LIZ;

    /* renamed from: com.bytedance.android.live.playtogether.c.t$a */
    /* loaded from: classes5.dex */
    public static final class C5223a implements C3LJ {
        @SerializedName("game_name")
        public String LIZ;
        @SerializedName("game_icon")
        public ImageModel LIZIZ;
        @SerializedName("desc")
        public String LIZJ;
        @SerializedName("pay_desc")
        public String LIZLLL;
        @SerializedName("fare")

        /* renamed from: LJ */
        public int f26541LJ;
        @SerializedName("exchange_ratio")
        public int LJFF;
        @SerializedName("max_count")
        public int LJI;
        @SerializedName("players")
        public List<C5224b> LJII;

        static {
            Covode.recordClassIndex(32928);
        }

        public C5223a() {
        }

        public C5223a(C10532g c10532g) {
            this.LJII = new ArrayList();
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    this.LJII.isEmpty();
                    return;
                }
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 5:
                        this.f26541LJ = QV1.LIZIZ(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LIZIZ(c10532g);
                        break;
                    case 7:
                        this.LJI = QV1.LIZIZ(c10532g);
                        break;
                    case 8:
                        this.LJII.add(new C5224b(c10532g));
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.playtogether.c.t$b */
    /* loaded from: classes12.dex */
    public static final class C5224b implements C3LJ {
        @SerializedName("user")
        public User LIZ;
        @SerializedName("status")
        public int LIZIZ;

        static {
            Covode.recordClassIndex(32929);
        }

        public C5224b() {
        }

        public C5224b(C10532g c10532g) {
            long LIZ = c10532g.LIZ();
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ == -1) {
                    c10532g.LIZ(LIZ);
                    return;
                } else if (LIZIZ == 1) {
                    this.LIZ = _User_ProtoDecoder.decodeStatic(c10532g);
                } else if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZIZ(c10532g);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(32927);
    }

    public C5222t() {
    }

    public C5222t(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZ = new C5223a(c10532g);
            }
        }
    }
}
