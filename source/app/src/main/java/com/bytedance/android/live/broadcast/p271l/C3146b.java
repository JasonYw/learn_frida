package com.bytedance.android.live.broadcast.p271l;

import com.bytedance.android.live.broadcast.p271l.p272a.C3144b;
import com.bytedance.android.live.broadcast.p271l.p272a.C3145c;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.l.b */
/* loaded from: classes5.dex */
public final class C3146b implements C3LJ {
    @SerializedName("bind_infos")
    public List<C3144b> LIZ;
    @SerializedName("content")
    public String LIZIZ;
    @SerializedName("reserve_bind_infos")
    public List<C3145c> LIZJ;

    static {
        Covode.recordClassIndex(16883);
    }

    public C3146b() {
        this.LIZ = new ArrayList();
        this.LIZIZ = "";
        this.LIZJ = new ArrayList();
    }

    public C3146b(C10532g c10532g) {
        List list;
        C3LJ c3144b;
        this.LIZ = new ArrayList();
        this.LIZJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            }
            if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
                    } else {
                        list = this.LIZJ;
                        c3144b = new C3145c(c10532g);
                    }
                } else {
                    this.LIZIZ = QV1.LJFF(c10532g);
                }
            } else {
                list = this.LIZ;
                c3144b = new C3144b(c10532g);
            }
            list.add(c3144b);
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ.isEmpty()) {
            this.LIZ = new ArrayList();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
        if (this.LIZJ.isEmpty()) {
            this.LIZJ = new ArrayList();
        }
    }
}
