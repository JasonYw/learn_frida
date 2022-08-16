package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.a */
/* loaded from: classes12.dex */
public final class C3363a implements C3LJ {
    @SerializedName("pass")
    public boolean LIZ;
    @SerializedName(MiPushCommandMessage.KEY_REASON)
    public String LIZIZ;

    static {
        Covode.recordClassIndex(19166);
    }

    public C3363a() {
        this.LIZ = false;
        this.LIZIZ = "";
    }

    public C3363a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZ = QV1.LIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (!this.LIZ) {
            this.LIZ = false;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
    }
}
