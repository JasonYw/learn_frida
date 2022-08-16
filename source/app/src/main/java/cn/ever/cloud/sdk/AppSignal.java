package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes25.dex */
public enum AppSignal {
    FOREGROUND,
    BACKGROUND;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3278);
    }

    public static AppSignal valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (AppSignal) (proxy.isSupported ? proxy.result : Enum.valueOf(AppSignal.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AppSignal[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (AppSignal[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
