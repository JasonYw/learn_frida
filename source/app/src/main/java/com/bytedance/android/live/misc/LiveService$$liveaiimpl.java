package com.bytedance.android.live.misc;

import com.bytedance.android.live.p238ai.api.IAiService;
import com.bytedance.android.live.p238ai.impl.AiService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public class LiveService$$liveaiimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32496);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IAiService.class, new AiService());
    }
}
