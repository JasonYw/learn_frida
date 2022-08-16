package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.y */
/* loaded from: classes5.dex */
public final class C3389y {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final C3380j LIZJ;

    static {
        Covode.recordClassIndex(19215);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3389y) {
            return C106862S5w.LIZ(((C3389y) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenFeatureInjectGroupIconDataEvent:%s,%s", LIZ());
    }

    public C3389y(boolean z, C3380j c3380j) {
        this.LIZIZ = z;
        this.LIZJ = c3380j;
    }

    public /* synthetic */ C3389y(boolean z, C3380j c3380j, int i) {
        this(false, null);
    }
}
