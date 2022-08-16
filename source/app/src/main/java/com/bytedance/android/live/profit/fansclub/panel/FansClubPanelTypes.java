package com.bytedance.android.live.profit.fansclub.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum FansClubPanelTypes {
    Native,
    Web,
    Lynx;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33303);
    }

    public static FansClubPanelTypes valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (FansClubPanelTypes) (proxy.isSupported ? proxy.result : Enum.valueOf(FansClubPanelTypes.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FansClubPanelTypes[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (FansClubPanelTypes[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
