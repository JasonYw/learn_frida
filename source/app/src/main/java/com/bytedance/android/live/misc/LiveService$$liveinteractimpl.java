package com.bytedance.android.live.misc;

import com.bytedance.android.live.liveinteract.InteractService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC91338Lye;

/* loaded from: classes3.dex */
public class LiveService$$liveinteractimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32503);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IInteractService.class, new InteractService());
        ServiceManager.registerService(AbstractC91338Lye.class, new InteractService());
    }
}
