package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.vsplayer.api.IVSPlayerService;
import com.bytedance.android.livesdk.chatroom.vsplayer.api.IVSProgressService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.web.jsbridge2.C13052h;
import p003X.C106862S5w;
import p003X.C4AF;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.bp */
/* loaded from: classes12.dex */
public final class C4002bp extends C4AF<C4003bq, Object> {
    public static ChangeQuickRedirect LIZ;
    public final DataCenter LIZIZ;

    static {
        Covode.recordClassIndex(22709);
    }

    public C4002bp(DataCenter dataCenter) {
        C106862S5w.LIZ(dataCenter);
        this.LIZIZ = dataCenter;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(Object obj, C13052h c13052h) {
        IVSProgressService provideVSProgressService;
        long j;
        C4003bq c4003bq = (C4003bq) obj;
        if (!PatchProxy.proxy(new Object[]{c4003bq, c13052h}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c4003bq, c13052h);
            IVSPlayerService iVSPlayerService = (IVSPlayerService) ServiceManager.getService(IVSPlayerService.class);
            if (iVSPlayerService != null && (provideVSProgressService = iVSPlayerService.provideVSProgressService(this.LIZIZ)) != null) {
                Integer num = c4003bq.LIZ;
                if (num != null) {
                    j = num.intValue();
                } else {
                    j = 0;
                }
                provideVSProgressService.seekTo(j * 1000);
            }
        }
    }
}
