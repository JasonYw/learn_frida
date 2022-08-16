package com.bytedance.android.live.broadcast.bgbroadcast.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum LoggerState {
    STARTED,
    PAUSED,
    RESET;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14706);
    }

    public static LoggerState valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LoggerState) (proxy.isSupported ? proxy.result : Enum.valueOf(LoggerState.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LoggerState[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LoggerState[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
