package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.fansclub.k */
/* loaded from: classes12.dex */
public final class C5265k {
    public static ChangeQuickRedirect LIZ;
    public final C5256c LIZIZ;
    public final C5256c LIZJ;
    public final C5256c LIZLLL;

    static {
        Covode.recordClassIndex(33292);
    }

    private Object[] LIZJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5265k) {
            return C106862S5w.LIZ(((C5265k) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("FansClubProfile:%s,%s,%s", LIZJ());
    }

    public C5265k() {
        this(null, null, null);
    }

    public final int LIZIZ() {
        FansClubUserStatus fansClubUserStatus;
        C5256c c5256c = this.LIZIZ;
        if (c5256c != null && (fansClubUserStatus = c5256c.LIZLLL) != null) {
            return fansClubUserStatus.value;
        }
        return FansClubUserStatus.Unknown.value;
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LIZIZ == null || LIZIZ() == FansClubUserStatus.Unknown.value) {
            return false;
        }
        return true;
    }

    public C5265k(C5256c c5256c, C5256c c5256c2, C5256c c5256c3) {
        this.LIZIZ = c5256c;
        this.LIZJ = c5256c2;
        this.LIZLLL = c5256c3;
    }
}
