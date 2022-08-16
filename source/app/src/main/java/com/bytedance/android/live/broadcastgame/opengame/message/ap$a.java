package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C87769KiB;

/* loaded from: classes5.dex */
public final class ap$a implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final C87769KiB LIZIZ;

    static {
        Covode.recordClassIndex(20280);
    }

    private Object[] LIZIZ() {
        return new Object[]{this.LIZIZ};
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
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ap$a) {
            return C106862S5w.LIZ(((ap$a) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenPlatformControlMessageReceiver$OpenPlatformControlMessage:%s", LIZIZ());
    }

    public ap$a(C87769KiB c87769KiB) {
        C106862S5w.LIZ(c87769KiB);
        this.LIZIZ = c87769KiB;
    }
}
