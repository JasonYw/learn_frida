package com.bytedance.android.live.misc;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.dynamicstrategy.api.IDynamicStrategyService;
import com.bytedance.android.livesdk.dynamicstrategy.impl.DynamicStrategyService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class LiveService$$dynamicstrategyimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32494);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IDynamicStrategyService.class, new DynamicStrategyService());
    }
}
