package com.bytedance.android.live.broadcast.welfare.packs;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.welfare.packs.d */
/* loaded from: classes5.dex */
public final class C3272d {
    public static ChangeQuickRedirect LIZ;
    public final C3243u LIZIZ;
    public final C3275h LIZJ;
    public final Long LIZLLL;

    static {
        Covode.recordClassIndex(18251);
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
        if (obj instanceof C3272d) {
            return C106862S5w.LIZ(((C3272d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GamePacksInfo:%s,%s,%s", LIZ());
    }

    public C3272d(C3243u c3243u, C3275h c3275h, Long l) {
        this.LIZIZ = c3243u;
        this.LIZJ = c3275h;
        this.LIZLLL = l;
    }
}
