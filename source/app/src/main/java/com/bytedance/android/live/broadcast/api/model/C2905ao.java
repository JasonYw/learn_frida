package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.model.ao */
/* loaded from: classes12.dex */
public final class C2905ao implements C3LJ {
    @SerializedName("users")
    public List<User> LIZ;
    @SerializedName("has_more")
    public Boolean LIZIZ;
    @SerializedName("cursor")
    public long LIZJ;
    @SerializedName("total")
    public int LIZLLL;

    static {
        Covode.recordClassIndex(14541);
    }

    public C2905ao() {
        this.LIZ = new ArrayList();
    }

    public C2905ao(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            QV1.LJII(c10532g);
                        } else {
                            this.LIZLLL = QV1.LIZIZ(c10532g);
                        }
                    } else {
                        this.LIZJ = QV1.LIZJ(c10532g);
                    }
                } else {
                    this.LIZIZ = Boolean.valueOf(QV1.LIZ(c10532g));
                }
            } else {
                this.LIZ.add(_User_ProtoDecoder.decodeStatic(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
    }
}
