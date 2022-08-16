package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.android.live.broadcastgame.opengame.service.CommercialService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87993Kln;

/* loaded from: classes5.dex */
public final class PanelTopRightButtonView$commercialService$2 extends Lambda implements Function0<CommercialService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87993Kln this$0;

    static {
        Covode.recordClassIndex(21154);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelTopRightButtonView$commercialService$2(C87993Kln c87993Kln) {
        super(0);
        this.this$0 = c87993Kln;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcastgame.opengame.service.CommercialService, com.bytedance.android.live.broadcastgame.opengame.service.a.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcastgame.opengame.service.CommercialService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ CommercialService mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LJFF.LIZ((Class<??>) CommercialService.class);
    }
}
