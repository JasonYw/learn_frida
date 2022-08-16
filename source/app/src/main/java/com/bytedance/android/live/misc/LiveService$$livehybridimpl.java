package com.bytedance.android.live.misc;

import com.bytedance.android.live.browser.BrowserServiceImpl;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;

/* loaded from: classes8.dex */
public class LiveService$$livehybridimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(32502);
        } else {
            Covode.recordClassIndex(32502);
        }
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IBrowserService.class, new BrowserServiceImpl());
    }
}
