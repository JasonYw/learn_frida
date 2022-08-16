package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.r */
/* loaded from: classes3.dex */
public final class C3526r implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    static {
        Covode.recordClassIndex(20313);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Long.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)};
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3526r) {
            return C106862S5w.LIZ(((C3526r) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DiamondPay:%s,%s,%s", LIZIZ());
    }

    public C3526r(String str, long j, int i) {
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
