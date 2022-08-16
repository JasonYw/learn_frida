package com.bytedance.android.live.broadcastgame.channel.p289b;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.b.a */
/* loaded from: classes5.dex */
public final class C3430a {
    public static ChangeQuickRedirect LIZ;
    public final List<AbstractC3337g.AbstractC3338a> LIZIZ;
    public final boolean LIZJ;

    static {
        Covode.recordClassIndex(19460);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Boolean.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3430a) {
            return C106862S5w.LIZ(((C3430a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EnterRoomMessage:%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3430a(List<? extends AbstractC3337g.AbstractC3338a> list, boolean z) {
        C106862S5w.LIZ(list);
        this.LIZIZ = list;
        this.LIZJ = z;
    }
}
