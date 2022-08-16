package com.bytedance.android.live.playtogether.p408b;

import com.bytedance.android.live.playtogether.AbstractC5233d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.playtogether.b.a */
/* loaded from: classes5.dex */
public final class C5190a {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC5233d LIZIZ;

    static {
        Covode.recordClassIndex(32855);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5190a) {
            return C106862S5w.LIZ(((C5190a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PlayTogetherPanelCloseEvent:%s", LIZ());
    }

    public C5190a(AbstractC5233d abstractC5233d) {
        C106862S5w.LIZ(abstractC5233d);
        this.LIZIZ = abstractC5233d;
    }
}
