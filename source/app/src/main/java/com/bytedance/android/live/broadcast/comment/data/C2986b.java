package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.b */
/* loaded from: classes5.dex */
public final class C2986b implements C3LJ {
    @SerializedName("total")
    public Long LIZ;
    @SerializedName("has_more")
    public Boolean LIZIZ;
    @SerializedName("evaluation_detail")
    public ArrayList<C2985a> LIZJ;

    static {
        Covode.recordClassIndex(15317);
    }

    public C2986b() {
        this.LIZ = 0L;
        this.LIZIZ = Boolean.FALSE;
    }

    public C2986b(C10532g c10532g) {
        this.LIZJ = new ArrayList<>();
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
                        this.LIZJ.add(new C2985a(c10532g));
                    }
                } else {
                    this.LIZIZ = Boolean.valueOf(QV1.LIZ(c10532g));
                }
            } else {
                this.LIZ = Long.valueOf(QV1.LIZJ(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = 0L;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = Boolean.FALSE;
        }
        this.LIZJ.isEmpty();
    }
}
