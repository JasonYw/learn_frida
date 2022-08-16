package com.bytedance.android.live.playtogether.edit;

import com.bytedance.android.live.playtogether.p409c.C5231y;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class b$c {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final C5231y.C5232a LIZJ;
    public final Throwable LIZLLL;

    static {
        Covode.recordClassIndex(32975);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b$c) {
            return C106862S5w.LIZ(((b$c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PlayTogetherEditViewModel$PlayTogetherSubmitTeamRespInfo:%s,%s,%s", LIZ());
    }

    public b$c(boolean z, C5231y.C5232a c5232a, Throwable th) {
        this.LIZIZ = z;
        this.LIZJ = c5232a;
        this.LIZLLL = th;
    }
}
