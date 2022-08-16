package com.bytedance.android.annie.scheme.convert;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes7.dex */
public enum HybridUiType {
    FULLSCREEN,
    POPUP;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10979);
    }

    public static HybridUiType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (HybridUiType) (proxy.isSupported ? proxy.result : Enum.valueOf(HybridUiType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static HybridUiType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (HybridUiType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
