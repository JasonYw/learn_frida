package com.bytedance.alliance.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes2.dex */
public enum WakeupComponentType {
    ACTIVITY,
    SERVICE,
    PROVIDER,
    RECEIVER,
    INSTRUMENTATION;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static WakeupComponentType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (WakeupComponentType[]) proxy.result;
        }
        return (WakeupComponentType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(9923);
    }

    public static WakeupComponentType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (WakeupComponentType) proxy.result;
        }
        return (WakeupComponentType) Enum.valueOf(WakeupComponentType.class, str);
    }
}
