package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.v */
/* loaded from: classes12.dex */
public final class C3597v implements C3LJ {
    @SerializedName("invite_state")
    public Map<String, Integer> LIZ;

    static {
        Covode.recordClassIndex(20492);
    }

    public C3597v() {
    }

    public C3597v(C10532g c10532g) {
        this.LIZ = new HashMap();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                long LIZ2 = c10532g.LIZ();
                String str = null;
                Integer num = null;
                while (true) {
                    int LIZIZ2 = c10532g.LIZIZ();
                    if (LIZIZ2 == -1) {
                        break;
                    } else if (LIZIZ2 == 1) {
                        str = QV1.LJFF(c10532g);
                    } else if (LIZIZ2 != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        num = Integer.valueOf(QV1.LIZIZ(c10532g));
                    }
                }
                c10532g.LIZ(LIZ2);
                Map<String, Integer> map = this.LIZ;
                if (str == null) {
                    throw new IllegalStateException("Key must not be null");
                }
                if (num == null) {
                    throw new IllegalStateException("Value must not be null");
                }
                map.put(str, num);
            }
        }
    }
}
