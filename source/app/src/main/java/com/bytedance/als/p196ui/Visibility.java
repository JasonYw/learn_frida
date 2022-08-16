package com.bytedance.als.p196ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.als.ui.Visibility */
/* loaded from: classes27.dex */
public enum Visibility {
    SHOW,
    HIDE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10081);
    }

    public static Visibility valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (Visibility) (proxy.isSupported ? proxy.result : Enum.valueOf(Visibility.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Visibility[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (Visibility[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
