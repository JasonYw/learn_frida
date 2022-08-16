package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.HB5;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class GameInviteInfo implements C3LJ {
    public static final HB5 Companion = new HB5((byte) 0);
    @SerializedName("invite_source")
    public int inviteSource;

    static {
        Covode.recordClassIndex(29395);
    }

    public GameInviteInfo() {
    }

    public GameInviteInfo(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.inviteSource = QV1.LIZIZ(c10532g);
            }
        }
    }

    public final int getInviteSource() {
        return this.inviteSource;
    }

    public final boolean isGameInvite() {
        if (this.inviteSource == 1) {
            return true;
        }
        return false;
    }

    public final void setInviteSource(int i) {
        this.inviteSource = i;
    }
}
