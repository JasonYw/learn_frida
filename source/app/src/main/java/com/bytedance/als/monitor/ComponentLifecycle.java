package com.bytedance.als.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes6.dex */
public enum ComponentLifecycle {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10062);
    }

    public static ComponentLifecycle valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ComponentLifecycle) (proxy.isSupported ? proxy.result : Enum.valueOf(ComponentLifecycle.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ComponentLifecycle[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ComponentLifecycle[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
