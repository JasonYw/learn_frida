package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.n */
/* loaded from: classes5.dex */
public final class C3088n implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    static {
        Covode.recordClassIndex(16441);
    }

    public C3088n() {
        this(false, false, 3);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3088n) {
            return C106862S5w.LIZ(((C3088n) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BottomButtonProps:%s,%s", LIZ());
    }

    public C3088n(boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = z2;
    }

    public /* synthetic */ C3088n(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, false);
    }
}
