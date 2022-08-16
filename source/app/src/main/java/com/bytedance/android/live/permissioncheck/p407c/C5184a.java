package com.bytedance.android.live.permissioncheck.p407c;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.permissioncheck.c.a */
/* loaded from: classes3.dex */
public final class C5184a {
    public static ChangeQuickRedirect LIZ;
    public final Object LIZIZ;
    public final long LIZJ;

    static {
        Covode.recordClassIndex(32807);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Long.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5184a) {
            return C106862S5w.LIZ(((C5184a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CheckData:%s,%s", LIZ());
    }

    public C5184a(Object obj, long j) {
        C106862S5w.LIZ(obj);
        this.LIZIZ = obj;
        this.LIZJ = j;
    }

    public /* synthetic */ C5184a(Object obj, long j, int i) {
        this(obj, System.currentTimeMillis());
    }
}
