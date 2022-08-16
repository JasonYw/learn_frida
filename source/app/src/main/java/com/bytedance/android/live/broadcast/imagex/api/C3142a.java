package com.bytedance.android.live.broadcast.imagex.api;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.imagex.api.a */
/* loaded from: classes5.dex */
public final class C3142a implements C3LJ {
    @SerializedName("access_key_id")
    public String LIZ;
    @SerializedName("secret_access_key")
    public String LIZIZ;
    @SerializedName("session_token")
    public String LIZJ;
    @SerializedName("expired_time")
    public String LIZLLL;
    @SerializedName("current_time")

    /* renamed from: LJ */
    public String f25904LJ;
    @SerializedName("service_id")
    public String LJFF;

    static {
        Covode.recordClassIndex(16838);
    }

    public C3142a() {
    }

    public C3142a(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            }
            switch (LIZIZ) {
                case 1:
                    this.LIZ = QV1.LJFF(c10532g);
                    break;
                case 2:
                    this.LIZIZ = QV1.LJFF(c10532g);
                    break;
                case 3:
                    this.LIZJ = QV1.LJFF(c10532g);
                    break;
                case 4:
                    this.LIZLLL = QV1.LJFF(c10532g);
                    break;
                case 5:
                    this.f25904LJ = QV1.LJFF(c10532g);
                    break;
                case 6:
                    this.LJFF = QV1.LJFF(c10532g);
                    break;
                default:
                    QV1.LJII(c10532g);
                    break;
            }
        }
    }
}
