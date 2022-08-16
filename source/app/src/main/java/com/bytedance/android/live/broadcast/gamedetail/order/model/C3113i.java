package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.i */
/* loaded from: classes5.dex */
public final class C3113i implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("reserved_total_by_game_anchor")
    public String LIZIZ;
    @SerializedName("reserved_status")
    public int LIZJ;
    @SerializedName("reserved_today_by_game_anchor")
    public String LIZLLL;
    @SerializedName("reserved_total_by_game")

    /* renamed from: LJ */
    public String f25881LJ;

    static {
        Covode.recordClassIndex(16523);
    }

    public C3113i() {
        this.LIZIZ = "";
        this.LIZJ = 0;
        this.LIZLLL = "";
        this.f25881LJ = "";
    }

    public C3113i(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ == 1) {
                this.LIZIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZJ = QV1.LIZIZ(c10532g);
            } else if (LIZIZ == 3) {
                this.LIZLLL = QV1.LJFF(c10532g);
            } else if (LIZIZ != 4) {
                QV1.LJII(c10532g);
            } else {
                this.f25881LJ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
        if (this.LIZJ == 0) {
            this.LIZJ = 0;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = "";
        }
        if (this.f25881LJ == null) {
            this.f25881LJ = "";
        }
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.f25881LJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
