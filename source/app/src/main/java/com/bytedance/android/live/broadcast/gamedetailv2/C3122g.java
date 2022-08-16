package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.g */
/* loaded from: classes5.dex */
public final class C3122g implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final C3119b LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final Integer f25888LJ;

    static {
        Covode.recordClassIndex(16650);
    }

    public C3122g() {
        this(false, null, null, null, 15);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, this.f25888LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3122g) {
            return C106862S5w.LIZ(((C3122g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameDetailContentProps:%s,%s,%s,%s", LIZ());
    }

    public C3122g(boolean z, C3119b c3119b, String str, Integer num) {
        this.LIZIZ = z;
        this.LIZJ = c3119b;
        this.LIZLLL = str;
        this.f25888LJ = num;
    }

    public /* synthetic */ C3122g(boolean z, C3119b c3119b, String str, Integer num, int i) {
        this(true, null, null, 0);
    }
}
