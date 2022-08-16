package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.d */
/* loaded from: classes5.dex */
public final class C3560d implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("cards")
    public List<C8733af> LIZIZ;

    static {
        Covode.recordClassIndex(20419);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3560d) {
            return C106862S5w.LIZ(((C3560d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CardInfoRsp:%s", LIZ());
    }

    public C3560d() {
        this.LIZIZ = null;
    }

    public C3560d(C10532g c10532g) {
        this.LIZIZ = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.LIZIZ.add(new C8733af(c10532g));
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZIZ.isEmpty()) {
            this.LIZIZ = null;
        }
    }
}
