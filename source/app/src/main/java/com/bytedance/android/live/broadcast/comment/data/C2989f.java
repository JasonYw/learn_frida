package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.f */
/* loaded from: classes5.dex */
public final class C2989f implements C3LJ {
    @SerializedName("evaluation_id")
    public long LIZ;
    @SerializedName("game_id")
    public String LIZIZ;
    @SerializedName("evaluation_type")
    public long LIZJ;
    @SerializedName("score")
    public double LIZLLL;
    @SerializedName("content")

    /* renamed from: LJ */
    public String f25811LJ;
    @SerializedName("images")
    public List<String> LJFF;
    @SerializedName("image_list")
    public ArrayList<ImageModel> LJI;
    @SerializedName("submit_time")
    public long LJII;
    @SerializedName("like_count")
    public long LJIIIIZZ;
    @SerializedName("relation_type_flag")
    public long LJIIIZ;
    @SerializedName("comment_count")
    public long LJIIJ;

    static {
        Covode.recordClassIndex(15321);
    }

    public C2989f() {
        this.LIZIZ = "";
        this.f25811LJ = "";
    }

    public C2989f(C10532g c10532g) {
        List list;
        Object decodeStatic;
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList<>();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZ = QV1.LIZJ(c10532g);
                        continue;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        continue;
                    case 3:
                        this.LIZJ = QV1.LIZJ(c10532g);
                        continue;
                    case 4:
                        this.LIZLLL = QV1.m22903LJ(c10532g);
                        continue;
                    case 5:
                        this.f25811LJ = QV1.LJFF(c10532g);
                        continue;
                    case 6:
                        list = this.LJFF;
                        decodeStatic = QV1.LJFF(c10532g);
                        break;
                    case 7:
                        this.LJII = QV1.LIZJ(c10532g);
                        continue;
                    case 8:
                        this.LJIIIIZZ = QV1.LIZJ(c10532g);
                        continue;
                    case 9:
                        this.LJIIIZ = QV1.LIZJ(c10532g);
                        continue;
                    case 10:
                        this.LJIIJ = QV1.LIZJ(c10532g);
                        continue;
                    case 11:
                    default:
                        QV1.LJII(c10532g);
                        continue;
                    case 12:
                        list = this.LJI;
                        decodeStatic = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                }
                list.add(decodeStatic);
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
                }
                if (this.f25811LJ == null) {
                    this.f25811LJ = "";
                }
                this.LJFF.isEmpty();
                this.LJI.isEmpty();
                return;
            }
        }
    }
}
