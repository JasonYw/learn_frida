package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.t */
/* loaded from: classes5.dex */
public final class C3595t implements C3LJ {
    @SerializedName("open_id")
    public String LIZ;
    @SerializedName("prop_info")
    public Map<Long, C3554ar> LIZIZ;

    static {
        Covode.recordClassIndex(20490);
    }

    public C3595t() {
    }

    public C3595t(C10532g c10532g) {
        this.LIZIZ = new HashMap();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ == 1) {
                this.LIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                long LIZ2 = c10532g.LIZ();
                Long l = null;
                C3554ar c3554ar = null;
                while (true) {
                    int LIZIZ2 = c10532g.LIZIZ();
                    if (LIZIZ2 == -1) {
                        break;
                    } else if (LIZIZ2 == 1) {
                        l = Long.valueOf(QV1.LIZJ(c10532g));
                    } else if (LIZIZ2 != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        c3554ar = new C3554ar(c10532g);
                    }
                }
                c10532g.LIZ(LIZ2);
                Map<Long, C3554ar> map = this.LIZIZ;
                if (l == null) {
                    throw new IllegalStateException("Key must not be null");
                }
                if (c3554ar == null) {
                    throw new IllegalStateException("Value must not be null");
                }
                map.put(l, c3554ar);
            }
        }
    }
}
