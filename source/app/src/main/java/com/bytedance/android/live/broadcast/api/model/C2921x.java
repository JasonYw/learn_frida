package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.model.x */
/* loaded from: classes5.dex */
public final class C2921x implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("preschedule_key")
    public String LIZIZ;
    @SerializedName("expire_time")
    public int LIZJ;
    @SerializedName("sdk_params")
    public String LIZLLL;

    /* renamed from: LJ */
    public int f25782LJ;
    public int LJFF;
    public String LJI;

    static {
        Covode.recordClassIndex(14577);
    }

    public C2921x() {
        this.LIZIZ = "";
        this.LIZLLL = "";
        this.LJI = "";
    }

    public C2921x(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZLLL = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZJ = (int) QV1.LIZJ(c10532g);
                }
            } else {
                this.LIZIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        this.LJI = "";
    }
}
