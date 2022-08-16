package com.bytedance.android.live.misc;

import com.bytedance.android.live.shortvideo.impl.base.ShortVideoServiceImpl;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.service.ILiveShortVideoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public class LiveService$$liveshortvideoimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32514);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(ILiveShortVideoService.class, new ShortVideoServiceImpl());
    }
}
