package com.android.ttcjpaysdk.integrated.counter.outerpay.controller;

import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.ttcjpayapi.CJOuterPayCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C137061cbB;
import p003X.RunnableC136224cNf;

/* loaded from: classes17.dex */
public final class CJBaseOuterPayController$onTradeCreateByTokenSuccess$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC136224cNf this$0;

    static {
        Covode.recordClassIndex(7827);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJBaseOuterPayController$onTradeCreateByTokenSuccess$1$1(RunnableC136224cNf runnableC136224cNf) {
        super(0);
        this.this$0 = runnableC136224cNf;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            CJOuterPayCallback cJOuterPayCallback = LIZ.LJIIJ;
            if (cJOuterPayCallback != null) {
                cJOuterPayCallback.onPayResult(C137061cbB.LIZ(C137061cbB.f18125LJ, C137061cbB.LIZIZ, null, 2, null));
            }
            this.this$0.LIZIZ.LJIIL.finish();
        }
        return Unit.INSTANCE;
    }
}
