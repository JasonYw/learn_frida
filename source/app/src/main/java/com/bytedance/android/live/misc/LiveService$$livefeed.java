package com.bytedance.android.live.misc;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostFeed;
import com.bytedance.android.livesdk.chatroom.reserve.IAppointmentService;
import com.bytedance.android.livesdk.feed.LiveFeedOuterService;
import com.bytedance.android.livesdk.feed.services.AppointmentService;
import com.bytedance.android.livesdk.feed.tab.FeedUrlService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC95457Nit;

/* loaded from: classes8.dex */
public class LiveService$$livefeed {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32500);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(AbstractC95457Nit.class, new LiveFeedOuterService());
        ServiceManager.registerService(IAppointmentService.class, new AppointmentService());
        ServiceManager.registerService(IHostFeed.class, new FeedUrlService());
    }
}
