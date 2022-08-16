package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3KR;
import p003X.C3LJ;
import p003X.QV1;

/* loaded from: classes12.dex */
public final class ScreenChatSettingGetResponse implements C3LJ {
    @SerializedName("setting")
    public C3KR data;

    static {
        Covode.recordClassIndex(14523);
    }

    public ScreenChatSettingGetResponse() {
    }

    public ScreenChatSettingGetResponse(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.data = new C3KR(c10532g);
            }
        }
    }

    public final C3KR getData() {
        return this.data;
    }

    public final void setData(C3KR c3kr) {
        this.data = c3kr;
    }
}
