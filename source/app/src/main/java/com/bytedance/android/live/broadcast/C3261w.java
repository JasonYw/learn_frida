package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.w */
/* loaded from: classes5.dex */
public final class C3261w implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    @SerializedName("image_rotation")
    public String LIZJ;

    static {
        Covode.recordClassIndex(18172);
    }

    public C3261w() {
        this.LIZJ = "1";
        this.LIZIZ = "";
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
    }

    public C3261w(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZJ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZJ == null) {
            this.LIZJ = "1";
        }
        this.LIZIZ = "";
    }
}
