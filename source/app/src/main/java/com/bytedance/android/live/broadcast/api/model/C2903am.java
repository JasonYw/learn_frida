package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.model.am */
/* loaded from: classes3.dex */
public final class C2903am implements C3LJ {
    @SerializedName("users")
    public List<C2906ap> LIZ;
    @SerializedName("total")
    public int LIZIZ;
    @SerializedName("has_more")
    public boolean LIZJ;

    static {
        Covode.recordClassIndex(14539);
    }

    public C2903am() {
        this.LIZ = new ArrayList();
    }

    public C2903am(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZIZ = QV1.LIZIZ(c10532g);
                    }
                } else {
                    this.LIZJ = QV1.LIZ(c10532g);
                }
            } else {
                this.LIZ.add(new C2906ap(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
