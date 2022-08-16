package com.bytedance.android.live.broadcast.p271l.p272a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.l.a.c */
/* loaded from: classes5.dex */
public final class C3145c extends C3143a implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("game_tags")
    public List<String> LIZIZ;
    @SerializedName("game_id")
    public String LIZJ;
    @SerializedName("game_name")
    public String LIZLLL;
    @SerializedName("game_icon")

    /* renamed from: LJ */
    public String f25907LJ;
    @SerializedName("download_extra")
    public String LJFF;
    @SerializedName("game_status")
    public long LJI;
    @SerializedName("anchor")
    public User LJII;
    @SerializedName("game_stage")
    public Integer LJIIIIZZ;

    static {
        Covode.recordClassIndex(16879);
    }

    public C3145c() {
        this.LIZJ = null;
        this.LIZLLL = null;
        this.f25907LJ = null;
        this.LIZIZ = new ArrayList();
        this.LJFF = null;
        this.LJI = 0L;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }

    public C3145c(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.f25907LJ = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LIZIZ.add(QV1.LJFF(c10532g));
                        break;
                    case 5:
                        this.LJFF = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJI = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        this.LJII = _User_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 8:
                        this.LJIIIIZZ = Integer.valueOf(QV1.LIZIZ(c10532g));
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZJ == null) {
                    this.LIZJ = null;
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = null;
                }
                if (this.f25907LJ == null) {
                    this.f25907LJ = null;
                }
                if (this.LIZIZ.isEmpty()) {
                    this.LIZIZ = new ArrayList();
                }
                if (this.LJFF == null) {
                    this.LJFF = null;
                }
                if (this.LJI == 0) {
                    this.LJI = 0L;
                }
                if (this.LJII == null) {
                    this.LJII = null;
                }
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = null;
                    return;
                }
                return;
            }
        }
    }
}
