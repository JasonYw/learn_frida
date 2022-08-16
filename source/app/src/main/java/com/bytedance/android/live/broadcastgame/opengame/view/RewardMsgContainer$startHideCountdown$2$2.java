package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.RunnableC88050Kmi;

/* loaded from: classes5.dex */
public final class RewardMsgContainer$startHideCountdown$2$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC88050Kmi this$0;

    static {
        Covode.recordClassIndex(21170);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMsgContainer$startHideCountdown$2$2(RunnableC88050Kmi runnableC88050Kmi) {
        super(0);
        this.this$0 = runnableC88050Kmi;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC3609d abstractC3609d = this.this$0.LIZIZ.LIZLLL;
            if (abstractC3609d != null) {
                abstractC3609d.LIZIZ(8);
            }
            this.this$0.LIZIZ.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
