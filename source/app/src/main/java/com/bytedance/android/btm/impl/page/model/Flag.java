package com.bytedance.android.btm.impl.page.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes18.dex */
public enum Flag {
    NOT_SURE,
    FORWARD,
    BACK,
    BACKGROUND;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11476);
    }

    public static Flag valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (Flag) (proxy.isSupported ? proxy.result : Enum.valueOf(Flag.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Flag[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (Flag[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
