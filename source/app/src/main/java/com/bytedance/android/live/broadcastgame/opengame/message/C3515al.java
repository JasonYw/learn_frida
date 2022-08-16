package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.al */
/* loaded from: classes5.dex */
public final class C3515al implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final C8906gu LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    static {
        Covode.recordClassIndex(20274);
    }

    public C3515al() {
        this(null, false, false, 7);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Boolean.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL)};
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
        if (obj instanceof C3515al) {
            return C106862S5w.LIZ(((C3515al) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("MiniCardMessage:%s,%s,%s", LIZIZ());
    }

    public C3515al(C8906gu c8906gu, boolean z, boolean z2) {
        this.LIZIZ = c8906gu;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }

    public /* synthetic */ C3515al(C8906gu c8906gu, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? null : c8906gu, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
