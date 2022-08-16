package com.bytedance.android.live.liveinteract.p382pk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.pk.d */
/* loaded from: classes3.dex */
public final class C4729d {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ = true;
    public final boolean LIZJ;
    public final int LIZLLL;

    static {
        Covode.recordClassIndex(28937);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4729d) {
            return C106862S5w.LIZ(((C4729d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PKAdvanceRenderEvent:%s,%s,%s", LIZ());
    }

    public C4729d(boolean z, boolean z2, int i) {
        this.LIZJ = z2;
        this.LIZLLL = i;
    }
}
