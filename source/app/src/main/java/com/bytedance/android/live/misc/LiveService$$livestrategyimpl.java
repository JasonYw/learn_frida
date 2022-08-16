package com.bytedance.android.live.misc;

import com.bytedance.android.live.impl.StrategyService;
import com.bytedance.android.live.strategy.api.IStrategyService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public class LiveService$$livestrategyimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32515);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IStrategyService.class, new StrategyService());
    }
}
