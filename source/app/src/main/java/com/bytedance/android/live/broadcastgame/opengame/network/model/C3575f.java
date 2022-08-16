package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.model.f */
/* loaded from: classes5.dex */
public final class C3575f implements C3LJ {
    @SerializedName("customer_image")
    public ImageModel LIZ;
    @SerializedName("default_image")
    public ImageModel LIZIZ;

    static {
        Covode.recordClassIndex(20440);
    }

    public C3575f() {
        this.LIZ = null;
        this.LIZIZ = null;
    }

    public C3575f(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ == 1) {
                this.LIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
            } else if (LIZIZ != 2) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = null;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = null;
        }
    }
}
