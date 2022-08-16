package com.bytedance.android.live.misc;

import com.bytedance.android.live.revenue.RevenueServiceImpl;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC88352Kra;

/* loaded from: classes8.dex */
public class LiveService$$revenueintegration {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32517);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(AbstractC88352Kra.class, new RevenueServiceImpl());
    }
}
