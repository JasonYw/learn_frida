package com.bytedance.android.live.playtogether.p409c;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.playtogether.c.v */
/* loaded from: classes3.dex */
public final class C5227v implements C3LJ {
    @SerializedName("title")
    public String LIZ;
    @SerializedName("msg")
    public List<String> LIZIZ;
    @SerializedName("time")
    public String LIZJ;

    static {
        Covode.recordClassIndex(32932);
    }

    public C5227v() {
        this.LIZ = "";
        this.LIZJ = "";
    }

    public C5227v(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZJ = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZIZ.add(QV1.LJFF(c10532g));
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        this.LIZIZ.isEmpty();
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
    }
}
