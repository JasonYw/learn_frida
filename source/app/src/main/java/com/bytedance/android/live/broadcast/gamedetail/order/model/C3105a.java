package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.a */
/* loaded from: classes5.dex */
public final class C3105a implements C3LJ {
    @SerializedName("entry_limit_show")
    public String LIZ;
    @SerializedName("entry_limit_detail")
    public List<C3106b> LIZIZ;

    static {
        Covode.recordClassIndex(16515);
    }

    public C3105a() {
        this.LIZ = "";
        this.LIZIZ = new ArrayList();
    }

    public C3105a(C10532g c10532g) {
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
                    this.LIZIZ.add(new C3106b(c10532g));
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        if (this.LIZIZ.isEmpty()) {
            this.LIZIZ = new ArrayList();
        }
    }
}
