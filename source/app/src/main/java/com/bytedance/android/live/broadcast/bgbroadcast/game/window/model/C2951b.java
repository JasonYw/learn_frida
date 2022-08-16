package com.bytedance.android.live.broadcast.bgbroadcast.game.window.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.model.b */
/* loaded from: classes5.dex */
public final class C2951b implements C3LJ {
    @SerializedName("online_games")
    public Map<String, C2952c> LIZ;
    @SerializedName("offline_games")
    public Map<String, C2952c> LIZIZ;
    @SerializedName("prop_games")
    public Map<String, C2952c> LIZJ;

    static {
        Covode.recordClassIndex(14913);
    }

    public C2951b() {
    }

    public C2951b(C10532g c10532g) {
        C2952c c2952c;
        Map<String, C2952c> map;
        this.LIZ = new HashMap();
        this.LIZIZ = new HashMap();
        this.LIZJ = new HashMap();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            }
            String str = null;
            if (LIZIZ == 1) {
                long LIZ2 = c10532g.LIZ();
                c2952c = null;
                while (true) {
                    int LIZIZ2 = c10532g.LIZIZ();
                    if (LIZIZ2 == -1) {
                        break;
                    } else if (LIZIZ2 == 1) {
                        str = QV1.LJFF(c10532g);
                    } else if (LIZIZ2 != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        c2952c = new C2952c(c10532g);
                    }
                }
                c10532g.LIZ(LIZ2);
                map = this.LIZ;
                if (str == null) {
                    throw new IllegalStateException("Key must not be null");
                }
                if (c2952c == null) {
                    throw new IllegalStateException("Value must not be null");
                }
            } else if (LIZIZ == 2) {
                long LIZ3 = c10532g.LIZ();
                c2952c = null;
                while (true) {
                    int LIZIZ3 = c10532g.LIZIZ();
                    if (LIZIZ3 == -1) {
                        break;
                    } else if (LIZIZ3 == 1) {
                        str = QV1.LJFF(c10532g);
                    } else if (LIZIZ3 != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        c2952c = new C2952c(c10532g);
                    }
                }
                c10532g.LIZ(LIZ3);
                map = this.LIZIZ;
                if (str == null) {
                    throw new IllegalStateException("Key must not be null");
                }
                if (c2952c == null) {
                    throw new IllegalStateException("Value must not be null");
                }
            } else if (LIZIZ != 4) {
                QV1.LJII(c10532g);
            } else {
                long LIZ4 = c10532g.LIZ();
                c2952c = null;
                while (true) {
                    int LIZIZ4 = c10532g.LIZIZ();
                    if (LIZIZ4 == -1) {
                        break;
                    } else if (LIZIZ4 == 1) {
                        str = QV1.LJFF(c10532g);
                    } else if (LIZIZ4 != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        c2952c = new C2952c(c10532g);
                    }
                }
                c10532g.LIZ(LIZ4);
                map = this.LIZJ;
                if (str == null) {
                    throw new IllegalStateException("Key must not be null");
                }
                if (c2952c == null) {
                    throw new IllegalStateException("Value must not be null");
                }
            }
            map.put(str, c2952c);
        }
    }
}
