package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class SimplePanelStateDispatchService$panelState$2 extends Lambda implements Function0<SimplePanelStateDispatchService.C3713b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SimplePanelStateDispatchService this$0;

    static {
        Covode.recordClassIndex(21068);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePanelStateDispatchService$panelState$2(SimplePanelStateDispatchService simplePanelStateDispatchService) {
        super(0);
        this.this$0 = simplePanelStateDispatchService;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService$b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SimplePanelStateDispatchService.C3713b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new SimplePanelStateDispatchService.C3713b(this.this$0, new SimplePanelStateDispatchService.C3714c(false, true));
    }
}
