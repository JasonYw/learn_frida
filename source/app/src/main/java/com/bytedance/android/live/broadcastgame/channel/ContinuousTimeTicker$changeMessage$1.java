package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ContinuousTimeTicker$changeMessage$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $action;
    public final /* synthetic */ long $period;
    public final /* synthetic */ C3431f this$0;

    static {
        Covode.recordClassIndex(19353);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuousTimeTicker$changeMessage$1(C3431f c3431f, long j, Function1 function1) {
        super(0);
        this.this$0 = c3431f;
        this.$period = j;
        this.$action = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(this.$period, this.$action);
        }
        return Unit.INSTANCE;
    }
}
