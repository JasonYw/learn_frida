package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.a */
/* loaded from: classes5.dex */
public final class C2985a implements C3LJ {
    public int LIZ;
    public Long LIZIZ;
    public boolean LIZJ;
    @SerializedName("user")
    public User LIZLLL;
    @SerializedName("evaluation_info")

    /* renamed from: LJ */
    public C2989f f25808LJ;

    static {
        Covode.recordClassIndex(15316);
    }

    public C2985a() {
        this.LIZ = 2;
        this.LIZIZ = 0L;
        this.LIZJ = true;
    }

    public C2985a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        this.f25808LJ = new C2989f(c10532g);
                    }
                } else {
                    this.LIZLLL = _User_ProtoDecoder.decodeStatic(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                this.LIZ = 2;
                this.LIZIZ = 0L;
                this.LIZJ = true;
                return;
            }
        }
    }
}
