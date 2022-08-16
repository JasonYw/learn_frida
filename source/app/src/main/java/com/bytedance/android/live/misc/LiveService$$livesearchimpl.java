package com.bytedance.android.live.misc;

import com.bytedance.android.live.search.api.ILiveSearchService;
import com.bytedance.android.live.search.impl.search.LiveSearchService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public class LiveService$$livesearchimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32513);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(ILiveSearchService.class, new LiveSearchService());
    }
}
