package com.bytedance.android.live.broadcast.gamedetailv2.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.data.d */
/* loaded from: classes5.dex */
public final class C3120d implements C3LJ {
    @SerializedName("tag")
    public int LIZ;
    @SerializedName(C33968a.f42937f)
    public String LIZIZ;
    @SerializedName("class")
    public String LIZJ;
    @SerializedName("text_content")
    public String LIZLLL;
    @SerializedName("children")

    /* renamed from: LJ */
    public List<C3120d> f25887LJ;

    static {
        Covode.recordClassIndex(16640);
    }

    public C3120d() {
        this.f25887LJ = new ArrayList();
    }

    public C3120d(C10532g c10532g) {
        this.f25887LJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            if (LIZIZ != 5) {
                                QV1.LJII(c10532g);
                            } else {
                                this.f25887LJ.add(new C3120d(c10532g));
                            }
                        } else {
                            this.LIZLLL = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LIZJ = QV1.LJFF(c10532g);
                    }
                } else {
                    this.LIZIZ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZ = QV1.LIZIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.f25887LJ.isEmpty()) {
            this.f25887LJ = new ArrayList();
        }
    }
}
