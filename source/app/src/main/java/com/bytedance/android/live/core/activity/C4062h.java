package com.bytedance.android.live.core.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.activity.h */
/* loaded from: classes.dex */
public final class C4062h {
    public static ChangeQuickRedirect LIZ;
    public final Long LIZIZ;
    public final Map<String, Long> LIZJ;

    static {
        Covode.recordClassIndex(23282);
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
        if (obj instanceof C4062h) {
            return C106862S5w.LIZ(((C4062h) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ActivityTimeStepCacheData:%s,%s", LIZ());
    }

    public C4062h(Long l, Map<String, Long> map) {
        this.LIZIZ = l;
        this.LIZJ = map;
    }
}
