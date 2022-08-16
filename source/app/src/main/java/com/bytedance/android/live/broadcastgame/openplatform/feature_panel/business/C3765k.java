package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.bk$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.k */
/* loaded from: classes12.dex */
public final class C3765k extends bk$a {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;

    static {
        Covode.recordClassIndex(21347);
    }

    public C3765k() {
        this(0, 1);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3765k) {
            return C106862S5w.LIZ(((C3765k) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PreviewToolbarBehaviorExtra:%s", LIZ());
    }

    public C3765k(int i) {
        this.LIZIZ = i;
    }

    public /* synthetic */ C3765k(int i, int i2) {
        this(0);
    }
}
