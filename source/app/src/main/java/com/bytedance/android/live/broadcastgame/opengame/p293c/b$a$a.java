package com.bytedance.android.live.broadcastgame.opengame.p293c;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.PM0;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.c.b$a$a */
/* loaded from: classes7.dex */
public final class b$a$a {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final PM0 LIZJ;

    static {
        Covode.recordClassIndex(19951);
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
        if (obj instanceof b$a$a) {
            return C106862S5w.LIZ(((b$a$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PluginJsBridgeAdapter$InnerMockBridge$HandlerWrap:%s,%s", LIZ());
    }

    public b$a$a(String str, PM0 pm0) {
        C106862S5w.LIZ(str, pm0);
        this.LIZIZ = str;
        this.LIZJ = pm0;
    }
}
