package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public enum LynxThreadStrategy {
    ALL_ON_UI,
    MOST_ON_TASM,
    PART_ON_LAYOUT,
    MULTI_THREADS;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static LynxThreadStrategy valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LynxThreadStrategy) (proxy.isSupported ? proxy.result : Enum.valueOf(LynxThreadStrategy.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LynxThreadStrategy[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LynxThreadStrategy[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(21905);
    }
}
