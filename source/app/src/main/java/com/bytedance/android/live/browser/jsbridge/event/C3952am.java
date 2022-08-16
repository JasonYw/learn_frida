package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.am */
/* loaded from: classes12.dex */
public final class C3952am {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    static {
        Covode.recordClassIndex(22293);
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
        if (obj instanceof C3952am) {
            return C106862S5w.LIZ(((C3952am) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SubscriberJsEvent:%s,%s", LIZ());
    }

    public C3952am(String str, Map<String, ? extends Object> map) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
