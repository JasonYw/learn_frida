package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.m */
/* loaded from: classes5.dex */
public final class C5213m implements C3LJ {
    @SerializedName("support_game_ids")
    public List<String> LIZ;
    @SerializedName("desc_hint")
    public String LIZIZ;
    @SerializedName("desc_limit")
    public int LIZJ;
    @SerializedName("people_count_option")
    public List<Integer> LIZLLL;
    @SerializedName("fare_max")

    /* renamed from: LJ */
    public int f26536LJ;
    @SerializedName("fare_min")
    public int LJFF;
    @SerializedName("fare_desc_hint")
    public String LJI;
    @SerializedName("fare_desc_limit")
    public int LJII;
    @SerializedName("fare_count_hint")
    public String LJIIIIZZ;

    static {
        Covode.recordClassIndex(32917);
    }

    public C5213m() {
        this.LIZIZ = "";
        this.LJI = "";
        this.LJIIIIZZ = "";
    }

    public C5213m(C10532g c10532g) {
        List list;
        Object valueOf;
        this.LIZ = new ArrayList();
        this.LIZLLL = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        list = this.LIZ;
                        valueOf = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        continue;
                    case 3:
                        this.LIZJ = QV1.LIZIZ(c10532g);
                        continue;
                    case 4:
                        list = this.LIZLLL;
                        valueOf = Integer.valueOf(QV1.LIZIZ(c10532g));
                        break;
                    case 5:
                        this.f26536LJ = QV1.LIZIZ(c10532g);
                        continue;
                    case 6:
                        this.LJFF = QV1.LIZIZ(c10532g);
                        continue;
                    case 7:
                        this.LJI = QV1.LJFF(c10532g);
                        continue;
                    case 8:
                        this.LJII = QV1.LIZIZ(c10532g);
                        continue;
                    case 9:
                        this.LJIIIIZZ = QV1.LJFF(c10532g);
                        continue;
                    default:
                        QV1.LJII(c10532g);
                        continue;
                }
                list.add(valueOf);
            } else {
                c10532g.LIZ(LIZ);
                this.LIZ.isEmpty();
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
                }
                this.LIZLLL.isEmpty();
                if (this.LJI == null) {
                    this.LJI = "";
                }
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = "";
                    return;
                }
                return;
            }
        }
    }
}
