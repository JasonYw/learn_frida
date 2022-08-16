package com.bytedance.android.live.misc;

import com.bytedance.android.live.base.service.IVSReportService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.p529vs.VsVideoService;
import com.bytedance.android.livesdk.chatroom.p529vs.player.VSPlayerServiceImpl;
import com.bytedance.android.livesdk.chatroom.p529vs.report.VSReportServiceImpl;
import com.bytedance.android.livesdk.chatroom.vsplayer.api.IVSPlayerService;
import com.bytedance.android.livesdkapi.vsplayer.IVsVideoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public class LiveService$$livevs {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32516);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ServiceManager.registerService(IVsVideoService.class, new VsVideoService());
        ServiceManager.registerService(IVSReportService.class, new VSReportServiceImpl());
        ServiceManager.registerService(IVSPlayerService.class, new VSPlayerServiceImpl());
    }
}
