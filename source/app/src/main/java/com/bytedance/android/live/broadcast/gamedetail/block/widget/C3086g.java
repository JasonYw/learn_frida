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

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.g */
/* loaded from: classes5.dex */
public final class C3086g implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final C3119b LIZJ;
    public final C3100d LIZLLL;

    static {
        Covode.recordClassIndex(16432);
    }

    public C3086g() {
        this(0, null, null, 7);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3086g) {
            return C106862S5w.LIZ(((C3086g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AudienceGameTitleBarProps:%s,%s,%s", LIZ());
    }

    public C3086g(int i, C3119b c3119b, C3100d c3100d) {
        this.LIZIZ = i;
        this.LIZJ = c3119b;
        this.LIZLLL = c3100d;
    }

    public /* synthetic */ C3086g(int i, C3119b c3119b, C3100d c3100d, int i2) {
        this(0, null, null);
    }
}