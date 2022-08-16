package com.bytedance.android.live.broadcastgame.api.model;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6508ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.bk$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.r */
/* loaded from: classes12.dex */
public final class C3385r extends bk$a {
    public static ChangeQuickRedirect LIZ;
    public final Context LIZIZ;
    public final DataCenter LIZJ;
    public final C6508ci LIZLLL;

    static {
        Covode.recordClassIndex(19205);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3385r) {
            return C106862S5w.LIZ(((C3385r) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LiveFeaturePanelBehaviorExtra:%s,%s,%s", LIZ());
    }

    public C3385r(Context context, DataCenter dataCenter, C6508ci c6508ci) {
        C106862S5w.LIZ(context, dataCenter);
        this.LIZIZ = context;
        this.LIZJ = dataCenter;
        this.LIZLLL = c6508ci;
    }
}
