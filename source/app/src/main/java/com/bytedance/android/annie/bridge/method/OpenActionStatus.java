package com.bytedance.android.annie.bridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes7.dex */
public enum OpenActionStatus {
    BEFORE_OPEN,
    AFTER_OPEN;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10524);
    }

    public static OpenActionStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (OpenActionStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(OpenActionStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OpenActionStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (OpenActionStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
