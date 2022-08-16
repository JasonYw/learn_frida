package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.comment.data.d */
/* loaded from: classes5.dex */
public final class C2987d implements C3LJ {
    public int LIZ;
    public C2985a LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25809LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    @SerializedName("comment_info")
    public C2993j LJIIJ;
    @SerializedName("out_side_comment_info")
    public ArrayList<C2993j> LJIIJJI;

    static {
        Covode.recordClassIndex(15319);
    }

    public C2987d() {
        this.LIZ = 1;
    }

    public C2987d(C10532g c10532g) {
        this.LJIIJJI = new ArrayList<>();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LJIIJJI.add(new C2993j(c10532g));
                    }
                } else {
                    this.LJIIJ = new C2993j(c10532g);
                }
            } else {
                c10532g.LIZ(LIZ);
                this.LJIIJJI.isEmpty();
                this.LIZ = 1;
                return;
            }
        }
    }
}
