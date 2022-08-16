package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.gamedetail.order.C3102g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AudienceOrderEffect$receiveAction$4 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $modifyState;
    public final /* synthetic */ C3102g $orderState;

    static {
        Covode.recordClassIndex(16193);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderEffect$receiveAction$4(Function1 function1, C3102g c3102g) {
        super(0);
        this.$modifyState = function1;
        this.$orderState = c3102g;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$modifyState.invoke(new C3102g(this.$orderState.LIZIZ.LIZ(false, true, 0), true));
        }
        return Unit.INSTANCE;
    }
}
