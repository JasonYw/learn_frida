package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.a */
/* loaded from: classes5.dex */
public final class C2874a implements C3LJ {
    @SerializedName("online_games")
    public Map<String, C2877b> LIZ;

    static {
        Covode.recordClassIndex(14413);
    }

    public C2874a() {
    }

    public C2874a(C10532g c10532g) {
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
                C2877b c2877b = null;
                while (true) {
                    int LIZIZ2 = c10532g.LIZIZ();
                    if (LIZIZ2 == -1) {
                        break;
                    } else if (LIZIZ2 == 1) {
                        str = QV1.LJFF(c10532g);
                    } else if (LIZIZ2 != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        c2877b = new C2877b(c10532g);
                    }
                }
                c10532g.LIZ(LIZ2);
                Map<String, C2877b> map = this.LIZ;
                if (str == null) {
                    throw new IllegalStateException("Key must not be null");
                }
                if (c2877b == null) {
                    throw new IllegalStateException("Value must not be null");
                }
                map.put(str, c2877b);
            }
        }
    }
}
