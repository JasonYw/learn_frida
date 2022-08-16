package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.model.f */
/* loaded from: classes5.dex */
public final class C3160f implements C3LJ {
    @SerializedName("word")
    public String LIZ;
    @SerializedName("tips")
    public List<String> LIZIZ;

    static {
        Covode.recordClassIndex(16994);
    }

    public C3160f() {
        this.LIZ = "";
    }

    public C3160f(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ.add(QV1.LJFF(c10532g));
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        this.LIZIZ.isEmpty();
    }
}
