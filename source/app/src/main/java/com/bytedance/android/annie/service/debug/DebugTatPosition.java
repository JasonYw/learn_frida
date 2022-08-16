package com.bytedance.android.annie.service.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public enum DebugTatPosition {
    TOP_LEFT,
    TOP_RIGHT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11036);
    }

    public static DebugTatPosition valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DebugTatPosition) (proxy.isSupported ? proxy.result : Enum.valueOf(DebugTatPosition.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DebugTatPosition[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DebugTatPosition[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
