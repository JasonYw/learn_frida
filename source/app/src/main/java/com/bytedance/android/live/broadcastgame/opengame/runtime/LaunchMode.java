package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum LaunchMode {
    FROM_PANEL,
    FROM_DEBUG,
    FROM_PREVIEW;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20837);
    }

    public static LaunchMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LaunchMode) (proxy.isSupported ? proxy.result : Enum.valueOf(LaunchMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LaunchMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LaunchMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
