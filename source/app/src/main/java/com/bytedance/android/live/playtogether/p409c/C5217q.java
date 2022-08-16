package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.q */
/* loaded from: classes5.dex */
public final class C5217q implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("serial_id")
    public long LIZIZ;
    @SerializedName("serial_str")
    public String LIZJ;

    static {
        Covode.recordClassIndex(32921);
    }

    public C5217q() {
        this.LIZJ = "";
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "serialId: " + this.LIZIZ + ", serialStr: " + this.LIZJ;
    }

    public C5217q(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZJ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZIZ = QV1.LIZJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
    }
}
