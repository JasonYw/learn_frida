package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.RunnableC88615Kvp;

/* loaded from: classes5.dex */
public final class PayFlowView$startHideCountdown$2$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC88615Kvp this$0;

    static {
        Covode.recordClassIndex(21161);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayFlowView$startHideCountdown$2$2(RunnableC88615Kvp runnableC88615Kvp) {
        super(0);
        this.this$0 = runnableC88615Kvp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Function1<? super Boolean, Unit> function1 = this.this$0.LIZIZ.LIZLLL;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            this.this$0.LIZIZ.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
