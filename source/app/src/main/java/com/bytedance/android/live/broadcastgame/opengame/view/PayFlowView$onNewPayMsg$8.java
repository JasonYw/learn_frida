package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88616Kvq;

/* loaded from: classes5.dex */
public final class PayFlowView$onNewPayMsg$8 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88616Kvq this$0;

    static {
        Covode.recordClassIndex(21159);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayFlowView$onNewPayMsg$8(C88616Kvq c88616Kvq) {
        super(1);
        this.this$0 = c88616Kvq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.setTextWidth(intValue);
        }
        return Unit.INSTANCE;
    }
}
