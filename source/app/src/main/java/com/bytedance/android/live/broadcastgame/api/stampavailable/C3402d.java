package com.bytedance.android.live.broadcastgame.api.stampavailable;

import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.stampavailable.d */
/* loaded from: classes12.dex */
public final class C3402d {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public C3384q LIZJ;
    public PluginType LIZLLL;

    /* renamed from: LJ */
    public String f26032LJ;

    static {
        Covode.recordClassIndex(19269);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZLLL, this.f26032LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3402d) {
            return C106862S5w.LIZ(((C3402d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenMemoryResult:%s,%s", LIZ());
    }

    public C3402d(PluginType pluginType, String str) {
        C106862S5w.LIZ(pluginType, str);
        this.LIZLLL = pluginType;
        this.f26032LJ = str;
    }
}
