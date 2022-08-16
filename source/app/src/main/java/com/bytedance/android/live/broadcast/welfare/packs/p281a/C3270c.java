package com.bytedance.android.live.broadcast.welfare.packs.p281a;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.packs.a.c */
/* loaded from: classes5.dex */
public final class C3270c implements C3LJ {
    @SerializedName("receive_records")
    public List<C3269b> LIZ;
    @SerializedName("total_count")
    public long LIZIZ;

    static {
        Covode.recordClassIndex(18230);
    }

    public C3270c() {
        this.LIZ = new ArrayList();
    }

    public C3270c(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZ.add(new C3269b(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
