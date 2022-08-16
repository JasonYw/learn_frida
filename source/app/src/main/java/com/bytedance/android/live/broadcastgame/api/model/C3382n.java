package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.n */
/* loaded from: classes5.dex */
public final class C3382n implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("entrance_list")
    public List<C3380j> LIZIZ;
    @SerializedName("group_properties")
    public Map<Long, C3377g> LIZJ;
    @SerializedName("group_order")
    public List<Long> LIZLLL;
    @SerializedName("tab_order")

    /* renamed from: LJ */
    public List<Long> f26025LJ;
    @SerializedName("no_update")
    public boolean LJFF;
    @SerializedName("hash")
    public String LJI;

    static {
        Covode.recordClassIndex(19201);
    }

    public C3382n() {
        this.LIZIZ = new ArrayList();
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new ArrayList();
        this.f26025LJ = new ArrayList();
        this.LJFF = false;
        this.LJI = "";
    }

    public C3382n(C10532g c10532g) {
        List list;
        Object valueOf;
        this.LIZIZ = new ArrayList();
        this.LIZJ = new HashMap();
        this.LIZLLL = new ArrayList();
        this.f26025LJ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        list = this.LIZIZ;
                        valueOf = new C3380j(c10532g);
                        break;
                    case 2:
                        long LIZ3 = c10532g.LIZ();
                        Long l = null;
                        C3377g c3377g = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 != -1) {
                                if (LIZIZ2 != 1) {
                                    if (LIZIZ2 != 2) {
                                        QV1.LJII(c10532g);
                                    } else {
                                        c3377g = new C3377g(c10532g);
                                    }
                                } else {
                                    l = Long.valueOf(QV1.LIZJ(c10532g));
                                }
                            } else {
                                c10532g.LIZ(LIZ3);
                                Map<Long, C3377g> map = this.LIZJ;
                                if (l != null) {
                                    if (c3377g != null) {
                                        map.put(l, c3377g);
                                        continue;
                                    } else {
                                        throw new IllegalStateException("Value must not be null");
                                    }
                                } else {
                                    throw new IllegalStateException("Key must not be null");
                                }
                            }
                        }
                    case 3:
                        list = this.LIZLLL;
                        valueOf = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 4:
                        list = this.f26025LJ;
                        valueOf = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 5:
                        this.LJFF = QV1.LIZ(c10532g);
                        continue;
                    case 6:
                        this.LJI = QV1.LJFF(c10532g);
                        continue;
                    default:
                        QV1.LJII(c10532g);
                        continue;
                }
                list.add(valueOf);
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZIZ.isEmpty()) {
                    this.LIZIZ = new ArrayList();
                }
                if (this.LIZJ == null) {
                    this.LIZJ = new LinkedHashMap();
                }
                if (this.LIZLLL.isEmpty()) {
                    this.LIZLLL = new ArrayList();
                }
                if (this.f26025LJ.isEmpty()) {
                    this.f26025LJ = new ArrayList();
                }
                if (!this.LJFF) {
                    this.LJFF = false;
                }
                if (this.LJI == null) {
                    this.LJI = "";
                    return;
                }
                return;
            }
        }
    }
}
