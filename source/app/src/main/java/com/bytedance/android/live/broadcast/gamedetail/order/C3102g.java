package com.bytedance.android.live.broadcast.gamedetail.order;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12643t;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C89022L5s;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.g */
/* loaded from: classes5.dex */
public final class C3102g implements AbstractC12643t {
    public static ChangeQuickRedirect LIZ;
    public final C89022L5s LIZIZ;
    public final boolean LIZJ;

    static {
        Covode.recordClassIndex(16509);
    }

    public C3102g() {
        this(null, false, 3);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Boolean.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3102g) {
            return C106862S5w.LIZ(((C3102g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OrderState:%s,%s", LIZ());
    }

    public C3102g(C89022L5s c89022L5s, boolean z) {
        C106862S5w.LIZ(c89022L5s);
        this.LIZIZ = c89022L5s;
        this.LIZJ = z;
    }

    public /* synthetic */ C3102g(C89022L5s c89022L5s, boolean z, int i) {
        this(new C89022L5s(false, false, 0, 7), false);
    }
}
