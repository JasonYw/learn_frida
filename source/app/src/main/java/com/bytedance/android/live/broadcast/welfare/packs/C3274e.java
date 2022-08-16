package com.bytedance.android.live.broadcast.welfare.packs;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.packs.e */
/* loaded from: classes5.dex */
public final class C3274e implements C3LJ {
    @SerializedName("type")
    public Long LIZ;
    @SerializedName("platform_receive_condition")
    public Long LIZIZ;
    @SerializedName("platform_receive_param")
    public String LIZJ;

    static {
        Covode.recordClassIndex(18269);
    }

    public C3274e() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
    }

    public C3274e(C10532g c10532g) {
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
                        this.LIZJ = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZIZ = Long.valueOf(QV1.LIZJ(c10532g));
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
            this.LIZIZ = 0L;
        }
    }
}
