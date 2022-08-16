package com.bytedance.android.live.broadcastgame.opengame.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcastgame.opengame.service.CommercialService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88006Km0;
import p003X.C106862S5w;
import p003X.C87993Kln;
import p003X.C88294Kqe;
import p003X.C88616Kvq;
import p003X.View$OnClickListenerC87997Klr;

/* loaded from: classes5.dex */
public final class PanelTopRightButtonView$5 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87993Kln this$0;

    static {
        Covode.recordClassIndex(21152);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelTopRightButtonView$5(C87993Kln c87993Kln) {
        super(0);
        this.this$0 = c87993Kln;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        View view;
        C88616Kvq c88616Kvq;
        MethodCollector.m14708i(1479);
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87993Kln c87993Kln = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c87993Kln, C87993Kln.LIZ, false, 4).isSupported) {
                View findViewById = c87993Kln.findViewById(2131184941);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                ViewGroup viewGroup = (ViewGroup) findViewById;
                CommercialService commercialService = c87993Kln.getCommercialService();
                PanelTopRightButtonView$setupAnchorPayFlowMsg$1 panelTopRightButtonView$setupAnchorPayFlowMsg$1 = new PanelTopRightButtonView$setupAnchorPayFlowMsg$1(c87993Kln);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{panelTopRightButtonView$setupAnchorPayFlowMsg$1}, commercialService, CommercialService.LIZ, false, 2);
                if (proxy.isSupported) {
                    view = (View) proxy.result;
                } else {
                    C106862S5w.LIZ(panelTopRightButtonView$setupAnchorPayFlowMsg$1);
                    commercialService.LIZJ = new C88294Kqe();
                    commercialService.LIZLLL = new C88616Kvq(commercialService.LJII().LIZLLL);
                    C88616Kvq c88616Kvq2 = commercialService.LIZLLL;
                    if (c88616Kvq2 != null) {
                        c88616Kvq2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    }
                    AbstractC88006Km0 abstractC88006Km0 = commercialService.LIZJ;
                    if (abstractC88006Km0 != null && (c88616Kvq = commercialService.LIZLLL) != null && !PatchProxy.proxy(new Object[]{abstractC88006Km0}, c88616Kvq, C88616Kvq.LIZ, false, 4).isSupported) {
                        C106862S5w.LIZ(abstractC88006Km0);
                        c88616Kvq.LIZIZ = abstractC88006Km0;
                    }
                    C88616Kvq c88616Kvq3 = commercialService.LIZLLL;
                    if (c88616Kvq3 != null) {
                        c88616Kvq3.setOnClickListener(new View$OnClickListenerC87997Klr(commercialService));
                    }
                    commercialService.f26084LJ = panelTopRightButtonView$setupAnchorPayFlowMsg$1;
                    view = commercialService.LIZLLL;
                }
                viewGroup.addView(view);
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1479);
        return unit;
    }
}
