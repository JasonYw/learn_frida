package com.bytedance.android.live.broadcast.gamedetail.order;

import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12643t;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.a */
/* loaded from: classes5.dex */
public final class C3098a implements AbstractC12643t {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final C3036d LIZLLL;

    static {
        Covode.recordClassIndex(16486);
    }

    public C3098a() {
        this(false, 0, null, 7);
    }

    public static /* synthetic */ C3098a LIZ(C3098a c3098a, boolean z, int i, C3036d c3036d, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3098a, (byte) 0, Integer.valueOf(i), c3036d, Integer.valueOf(i2), null}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (C3098a) proxy.result;
        }
        if ((i2 & 1) != 0) {
            z = c3098a.LIZIZ;
        }
        if ((i2 & 2) != 0) {
            i = c3098a.LIZJ;
        }
        if ((i2 & 4) != 0) {
            c3036d = c3098a.LIZLLL;
        }
        return c3098a.LIZ(z, i, c3036d);
    }

    private C3098a LIZ(boolean z, int i, C3036d c3036d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), c3036d}, this, LIZ, false, 1);
        return proxy.isSupported ? (C3098a) proxy.result : new C3098a(z, i, c3036d);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3098a) {
            return C106862S5w.LIZ(((C3098a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AnchorGameDetailState:%s,%s,%s", LIZ());
    }

    public C3098a(boolean z, int i, C3036d c3036d) {
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = c3036d;
    }

    public /* synthetic */ C3098a(boolean z, int i, C3036d c3036d, int i2) {
        this(true, 0, null);
    }
}
