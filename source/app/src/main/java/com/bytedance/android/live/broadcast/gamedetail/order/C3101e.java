package com.bytedance.android.live.broadcast.gamedetail.order;

import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12643t;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.e */
/* loaded from: classes5.dex */
public final class C3101e implements AbstractC12643t {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final C3119b LIZLLL;

    /* renamed from: LJ */
    public final String f25877LJ;

    static {
        Covode.recordClassIndex(16500);
    }

    public C3101e() {
        this(false, 0, null, null, 15);
    }

    public static /* synthetic */ C3101e LIZ(C3101e c3101e, boolean z, int i, C3119b c3119b, String str, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e, (byte) 0, Integer.valueOf(i), null, null, Integer.valueOf(i2), null}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (C3101e) proxy.result;
        }
        if ((i2 & 1) != 0) {
            z = c3101e.LIZIZ;
        }
        if ((i2 & 2) != 0) {
            i = c3101e.LIZJ;
        }
        if ((i2 & 4) != 0) {
            c3119b = c3101e.LIZLLL;
        }
        if ((i2 & 8) != 0) {
            str = c3101e.f25877LJ;
        }
        return c3101e.LIZ(z, i, c3119b, str);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), this.LIZLLL, this.f25877LJ};
    }

    public final C3101e LIZ(boolean z, int i, C3119b c3119b, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), c3119b, str}, this, LIZ, false, 1);
        return proxy.isSupported ? (C3101e) proxy.result : new C3101e(z, i, c3119b, str);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3101e) {
            return C106862S5w.LIZ(((C3101e) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameDetailState:%s,%s,%s,%s", LIZ());
    }

    public C3101e(boolean z, int i, C3119b c3119b, String str) {
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = c3119b;
        this.f25877LJ = str;
    }

    public /* synthetic */ C3101e(boolean z, int i, C3119b c3119b, String str, int i2) {
        this(true, 200, null, null);
    }
}
