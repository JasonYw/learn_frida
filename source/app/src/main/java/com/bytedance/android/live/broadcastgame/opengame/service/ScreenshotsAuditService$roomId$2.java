package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ScreenshotsAuditService$roomId$2 extends Lambda implements Function0<Long> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ScreenshotsAuditService this$0;

    static {
        Covode.recordClassIndex(21061);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotsAuditService$roomId$2(ScreenshotsAuditService screenshotsAuditService) {
        super(0);
        this.this$0 = screenshotsAuditService;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        long LJIIIIZZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LJIIIIZZ = ((Long) proxy.result).longValue();
        } else {
            LJIIIIZZ = this.this$0.LJIILJJIL().LJIIIIZZ();
        }
        return Long.valueOf(LJIIIIZZ);
    }
}
