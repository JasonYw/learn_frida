package com.bytedance.android.live.core.tetris.widgets;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.tetris.widgets.o */
/* loaded from: classes12.dex */
public final class C4143o {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    static {
        Covode.recordClassIndex(23812);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4143o) {
            return C106862S5w.LIZ(((C4143o) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("WidgetClearEvent:%s,%s", LIZ());
    }

    public C4143o(boolean z, int i) {
        this.LIZIZ = z;
        this.LIZJ = i;
    }

    public /* synthetic */ C4143o(boolean z, int i, int i2) {
        this(z, 1);
    }
}
