package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.d */
/* loaded from: classes3.dex */
public final class C3879d {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final List<String> LIZLLL;

    /* renamed from: LJ */
    public final List<String> f26120LJ;

    static {
        Covode.recordClassIndex(21992);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ), this.LIZLLL, this.f26120LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3879d) {
            return C106862S5w.LIZ(((C3879d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CacheConfigItem:%s,%s,%s,%s", LIZ());
    }

    public C3879d(boolean z, boolean z2, List<String> list, List<String> list2) {
        C106862S5w.LIZ(list, list2);
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = list;
        this.f26120LJ = list2;
    }
}
