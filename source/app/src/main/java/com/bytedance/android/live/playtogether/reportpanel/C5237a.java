package com.bytedance.android.live.playtogether.reportpanel;

import com.bytedance.android.live.playtogether.p409c.C5217q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.playtogether.reportpanel.a */
/* loaded from: classes5.dex */
public final class C5237a {
    public static ChangeQuickRedirect LIZ;
    public final C5217q LIZIZ;

    static {
        Covode.recordClassIndex(33086);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5237a) {
            return C106862S5w.LIZ(((C5237a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Command:%s", LIZ());
    }

    public C5237a(C5217q c5217q) {
        this.LIZIZ = c5217q;
    }
}
