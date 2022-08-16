package com.bytedance.android.live.misc;

import com.bytedance.android.live.livepullstream.PullStreamService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC102354QSm;

/* loaded from: classes8.dex */
public class LiveService$$livepullstreamimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32507);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IPullStreamService.class, new PullStreamService());
        ServiceManager.registerService(AbstractC102354QSm.class, new PullStreamService());
    }
}
