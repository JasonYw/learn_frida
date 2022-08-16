package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.l */
/* loaded from: classes5.dex */
public final class C3381l implements C3LJ {
    @SerializedName(C2521l.LJIIL)
    public List<C3384q> LIZ;
    @SerializedName("group_property")
    public Map<Long, C3373ae> LIZIZ;
    @SerializedName("group_order")
    public List<Long> LIZJ;
    @SerializedName("no_update")
    public boolean LIZLLL;
    @SerializedName("hash")

    /* renamed from: LJ */
    public String f26024LJ;

    static {
        Covode.recordClassIndex(19199);
    }

    public C3381l() {
        this.LIZ = new ArrayList();
        this.LIZIZ = new HashMap();
        this.f26024LJ = "";
    }

    public C3381l(C10532g c10532g) {
        List list;
        Object c3384q;
        this.LIZ = new ArrayList();
        this.LIZIZ = new HashMap();
        this.LIZJ = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            if (LIZIZ != 4) {
                                if (LIZIZ != 5) {
                                    QV1.LJII(c10532g);
                                } else {
                                    this.f26024LJ = QV1.LJFF(c10532g);
                                }
                            } else {
                                this.LIZLLL = QV1.LIZ(c10532g);
                            }
                        } else {
                            list = this.LIZJ;
                            c3384q = Long.valueOf(QV1.LIZJ(c10532g));
                        }
                    } else {
                        long LIZ2 = c10532g.LIZ();
                        Long l = null;
                        C3373ae c3373ae = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 == -1) {
                                break;
                            } else if (LIZIZ2 != 1) {
                                if (LIZIZ2 != 2) {
                                    QV1.LJII(c10532g);
                                } else {
                                    c3373ae = new C3373ae(c10532g);
                                }
                            } else {
                                l = Long.valueOf(QV1.LIZJ(c10532g));
                            }
                        }
                        c10532g.LIZ(LIZ2);
                        Map<Long, C3373ae> map = this.LIZIZ;
                        if (l != null) {
                            if (c3373ae != null) {
                                map.put(l, c3373ae);
                            } else {
                                throw new IllegalStateException("Value must not be null");
                            }
                        } else {
                            throw new IllegalStateException("Key must not be null");
                        }
                    }
                } else {
                    list = this.LIZ;
                    c3384q = new C3384q(c10532g);
                }
                list.add(c3384q);
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZ.isEmpty()) {
                    this.LIZ = new ArrayList();
                }
                if (this.LIZIZ == null) {
                    this.LIZIZ = new HashMap();
                }
                this.LIZJ.isEmpty();
                if (this.f26024LJ == null) {
                    this.f26024LJ = "";
                    return;
                }
                return;
            }
        }
    }
}
