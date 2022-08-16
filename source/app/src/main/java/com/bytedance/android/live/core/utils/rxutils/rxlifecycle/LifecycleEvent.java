package com.bytedance.android.live.core.utils.rxutils.rxlifecycle;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public enum LifecycleEvent {
    ATTACH,
    CREATE,
    CREATE_VIEW,
    START,
    RESUME,
    PAUSE,
    STOP,
    DESTROY_VIEW,
    DESTROY,
    DETACH;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LifecycleEvent[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (LifecycleEvent[]) proxy.result;
        }
        return (LifecycleEvent[]) values().clone();
    }

    static {
        Covode.recordClassIndex(24086);
    }

    public static LifecycleEvent valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (LifecycleEvent) proxy.result;
        }
        return (LifecycleEvent) Enum.valueOf(LifecycleEvent.class, str);
    }
}
