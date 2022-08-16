package com.bytedance.android.live.broadcastgame.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum OpenGameLauncherResult {
    CONTINUE,
    ABORT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19014);
    }

    public static OpenGameLauncherResult valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (OpenGameLauncherResult) (proxy.isSupported ? proxy.result : Enum.valueOf(OpenGameLauncherResult.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OpenGameLauncherResult[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (OpenGameLauncherResult[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
