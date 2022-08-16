package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88616Kvq;

/* loaded from: classes5.dex */
public final class PayFlowView$onNewPayMsg$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88616Kvq this$0;

    static {
        Covode.recordClassIndex(21156);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayFlowView$onNewPayMsg$3(C88616Kvq c88616Kvq) {
        super(0);
        this.this$0 = c88616Kvq;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ.setVisibility(8);
            this.this$0.m23447LJ();
        }
        return Unit.INSTANCE;
    }
}
