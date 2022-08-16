package com.bytedance.android.live.broadcastgame.effectgame.choosemusic;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.effectgame.choosemusic.f */
/* loaded from: classes5.dex */
public final class C3470f implements C3LJ {
    @SerializedName("song_list")
    public List<C3471g> LIZ;
    @SerializedName("has_more")
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(19822);
    }

    public C3470f() {
        this.LIZ = new ArrayList();
        this.LIZIZ = false;
    }

    public C3470f(C10532g c10532g) {
        this.LIZ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZIZ = QV1.LIZ(c10532g);
                }
            } else {
                this.LIZ.add(new C3471g(c10532g));
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
        if (!this.LIZIZ) {
            this.LIZIZ = false;
        }
    }
}
