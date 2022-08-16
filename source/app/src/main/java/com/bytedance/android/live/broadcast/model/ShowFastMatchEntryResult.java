package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class ShowFastMatchEntryResult implements C3LJ {
    @SerializedName("show_entry")
    public boolean showEntry;

    static {
        Covode.recordClassIndex(16983);
    }

    public ShowFastMatchEntryResult() {
    }

    public ShowFastMatchEntryResult(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.showEntry = QV1.LIZ(c10532g);
            }
        }
    }
}
