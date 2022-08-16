package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PanelStateReportService$appId$2 extends Lambda implements Function0<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PanelStateReportService this$0;

    static {
        Covode.recordClassIndex(21015);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelStateReportService$appId$2(PanelStateReportService panelStateReportService) {
        super(0);
        this.this$0 = panelStateReportService;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LJIILJJIL().LJIIIIZZ.LJII;
    }
}
