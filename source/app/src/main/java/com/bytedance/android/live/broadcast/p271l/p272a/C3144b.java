package com.bytedance.android.live.broadcast.p271l.p272a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.C89114L9g;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.l.a.b */
/* loaded from: classes5.dex */
public final class C3144b extends C3143a implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("game_id")
    public String LIZIZ;
    @SerializedName("game_name")
    public String LIZJ;
    @SerializedName("game_icon")
    public String LIZLLL;
    @SerializedName("download_extra")

    /* renamed from: LJ */
    public String f25905LJ;
    @SerializedName("game_status")
    public long LJFF;
    @SerializedName("game_tags")
    public List<String> LJI;
    @SerializedName("anchor")
    public User LJII;
    public C89114L9g LJIIIIZZ;
    public C3002c LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;

    static {
        Covode.recordClassIndex(16878);
    }

    public C3144b() {
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.f25905LJ = "";
        this.LJFF = 1L;
    }

    public C3144b(C10532g c10532g) {
        this.LJI = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZIZ = QV1.LJFF(c10532g);
                        break;
                    case 2:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 4:
                        this.LJI.add(QV1.LJFF(c10532g));
                        break;
                    case 5:
                        this.f25905LJ = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        this.LJFF = QV1.LIZJ(c10532g);
                        break;
                    case 7:
                        this.LJII = _User_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZIZ == null) {
                    this.LIZIZ = "";
                }
                if (this.LIZJ == null) {
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.f25905LJ == null) {
                    this.f25905LJ = "";
                }
                if (this.LJFF == 0) {
                    this.LJFF = 1L;
                }
                this.LJI.isEmpty();
                return;
            }
        }
    }
}
