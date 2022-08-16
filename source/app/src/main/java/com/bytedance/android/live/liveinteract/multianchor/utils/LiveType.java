package com.bytedance.android.live.liveinteract.multianchor.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum LiveType {
    PC_LIVE,
    VIDEO,
    OTHERS;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28400);
    }

    public static LiveType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LiveType) (proxy.isSupported ? proxy.result : Enum.valueOf(LiveType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LiveType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LiveType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
