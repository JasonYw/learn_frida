package com.bytedance.android.live.browser.p300a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.a.c$a */
/* loaded from: classes7.dex */
public final class c$a {
    public static ChangeQuickRedirect LIZ;
    public final C13039ag LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(21962);
    }

    public c$a() {
        this(null, null, 3);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c$a) {
            return C106862S5w.LIZ(((c$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("HybridJsbTools$LynxDebugJsbInfo:%s,%s", LIZ());
    }

    public c$a(C13039ag c13039ag, String str) {
        this.LIZIZ = c13039ag;
        this.LIZJ = str;
    }

    public /* synthetic */ c$a(C13039ag c13039ag, String str, int i) {
        this((i & 1) != 0 ? null : c13039ag, (i & 2) != 0 ? "" : str);
    }
}
