package com.bytedance.android.annie.log;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes7.dex */
public enum LogLevel {
    DEBUG,
    ERROR,
    INFO;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10798);
    }

    public static LogLevel valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LogLevel) (proxy.isSupported ? proxy.result : Enum.valueOf(LogLevel.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LogLevel[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LogLevel[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
