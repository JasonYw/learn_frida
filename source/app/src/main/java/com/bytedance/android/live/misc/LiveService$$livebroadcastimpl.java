package com.bytedance.android.live.misc;

import com.bytedance.android.live.broadcast.BroadcastService;
import com.bytedance.android.live.core.broadcast.IBroadcastCoreService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public class LiveService$$livebroadcastimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32498);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IBroadcastCoreService.class, new BroadcastService());
    }
}
