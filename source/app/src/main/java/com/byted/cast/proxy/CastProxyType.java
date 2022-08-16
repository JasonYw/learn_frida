package com.byted.cast.proxy;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes.dex */
public enum CastProxyType {
    CastProxyTypeGeneral,
    CastProxyTypeDouyin;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CastProxyType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CastProxyType[]) proxy.result;
        }
        return (CastProxyType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(9767);
    }

    public static CastProxyType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CastProxyType) proxy.result;
        }
        return (CastProxyType) Enum.valueOf(CastProxyType.class, str);
    }
}
