package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.android.live.broadcastgame.opengame.network.C3557au;
import com.bytedance.android.live.broadcastgame.opengame.network.C3565l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.aj */
/* loaded from: classes5.dex */
public final class C3733aj {
    public static ChangeQuickRedirect LIZ;
    public final C3557au LIZIZ;
    public final C3565l LIZJ;

    static {
        Covode.recordClassIndex(21191);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3733aj) {
            return C106862S5w.LIZ(((C3733aj) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ZipResponse:%s,%s", LIZ());
    }

    public C3733aj(C3557au c3557au, C3565l c3565l) {
        C106862S5w.LIZ(c3557au, c3565l);
        this.LIZIZ = c3557au;
        this.LIZJ = c3565l;
    }
}
