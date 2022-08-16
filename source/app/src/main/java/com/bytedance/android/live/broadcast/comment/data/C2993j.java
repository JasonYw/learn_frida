package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.j */
/* loaded from: classes5.dex */
public final class C2993j implements C3LJ {
    @SerializedName("comment_id")
    public String LIZ;
    @SerializedName("eval_id")
    public String LIZIZ;
    @SerializedName("game_id")
    public String LIZJ;
    @SerializedName("layer")
    public long LIZLLL;
    @SerializedName("user")

    /* renamed from: LJ */
    public User f25813LJ;
    @SerializedName("reply_to_comment_id")
    public String LJFF;
    @SerializedName("reply_to_user")
    public User LJI;
    @SerializedName("reply_to_reply_id")
    public String LJII;
    @SerializedName("content")
    public String LJIIIIZZ;
    @SerializedName("create_time")
    public long LJIIIZ;
    @SerializedName("like_count")
    public long LJIIJ;
    @SerializedName("comment_count")
    public long LJIIJJI;
    @SerializedName("relation_type_flag")
    public long LJIIL;

    static {
        Covode.recordClassIndex(15339);
    }

    public C2993j() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LJFF = "";
        this.LJII = "";
    }

    public C2993j(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZLLL = QV1.LIZJ(c10532g);
                        break;
                    case 5:
                        this.f25813LJ = _User_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJI = _User_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 8:
                        this.LJII = QV1.LJFF(c10532g);
                        break;
                    case 9:
                        this.LJIIIIZZ = QV1.LJFF(c10532g);
                        break;
                    case 10:
                        this.LJIIIZ = QV1.LIZJ(c10532g);
                        break;
                    case 11:
                        this.LJIIJ = QV1.LIZJ(c10532g);
                        break;
                    case 12:
                        this.LJIIJJI = QV1.LIZJ(c10532g);
                        break;
                    case 13:
                        this.LJIIL = QV1.LIZJ(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZ == null) {
                    this.LIZ = "";
                }
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
                }
                if (this.LJFF == null) {
                    this.LJFF = "";
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
