package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PanelStateReportService$panelState$2 extends Lambda implements Function0<PanelStateReportService.PanelState> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PanelStateReportService this$0;

    static {
        Covode.recordClassIndex(21017);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelStateReportService$panelState$2(PanelStateReportService panelStateReportService) {
        super(0);
        this.this$0 = panelStateReportService;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService$PanelState] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PanelStateReportService.PanelState mo30099invoke() {
        Object mo27335getValue;
        long longValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PanelStateReportService panelStateReportService = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], panelStateReportService, PanelStateReportService.LIZ, false, 1);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = panelStateReportService.LIZIZ.mo27335getValue();
        }
        String str = (String) mo27335getValue;
        PanelStateReportService panelStateReportService2 = this.this$0;
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], panelStateReportService2, PanelStateReportService.LIZ, false, 2);
        if (proxy3.isSupported) {
            longValue = ((Long) proxy3.result).longValue();
        } else {
            longValue = ((Number) panelStateReportService2.LIZJ.mo27335getValue()).longValue();
        }
        return new PanelStateReportService.PanelState(str, longValue);
    }
}
