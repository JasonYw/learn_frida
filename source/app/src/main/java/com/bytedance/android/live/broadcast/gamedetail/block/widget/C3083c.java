package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.c */
/* loaded from: classes5.dex */
public final class C3083c implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final C3119b LIZLLL;

    /* renamed from: LJ */
    public final C3100d f25868LJ;

    static {
        Covode.recordClassIndex(16428);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), this.LIZLLL, this.f25868LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3083c) {
            return C106862S5w.LIZ(((C3083c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AudienceBottomBarProps:%s,%s,%s,%s", LIZ());
    }

    public C3083c(boolean z, int i, C3119b c3119b, C3100d c3100d) {
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = c3119b;
        this.f25868LJ = c3100d;
    }
}
