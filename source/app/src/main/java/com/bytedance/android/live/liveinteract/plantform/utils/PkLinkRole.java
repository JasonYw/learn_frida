package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum PkLinkRole {
    ANCHOR("anchor"),
    GUEST("guest"),
    AUDIENCE("audience");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String role;

    public static PkLinkRole valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (PkLinkRole) (proxy.isSupported ? proxy.result : Enum.valueOf(PkLinkRole.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PkLinkRole[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (PkLinkRole[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(29501);
    }

    PkLinkRole(String str) {
        this.role = str;
    }
}
