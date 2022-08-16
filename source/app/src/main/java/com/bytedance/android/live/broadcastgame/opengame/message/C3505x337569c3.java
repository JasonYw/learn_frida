package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87546Kea;
import p003X.C87783KiP;
import p003X.C87784KiQ;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.AnchorGameMessageChannel$sendOpenEntranceMessage$2$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3505x337569c3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87783KiP $popBoxContent;
    public final /* synthetic */ Throwable $throwable$inlined;
    public final /* synthetic */ C87546Kea this$0;

    static {
        Covode.recordClassIndex(20251);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3505x337569c3(C87783KiP c87783KiP, C87546Kea c87546Kea, Throwable th) {
        super(0);
        this.$popBoxContent = c87783KiP;
        this.this$0 = c87546Kea;
        this.$throwable$inlined = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87784KiQ c87784KiQ = new C87784KiQ(this.this$0.LIZIZ.LJIIIZ.LJIIIZ().LIZLLL);
            C87783KiP c87783KiP = this.$popBoxContent;
            Intrinsics.checkNotNullExpressionValue(c87783KiP, "");
            C87784KiQ.LIZ(c87784KiQ, c87783KiP, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
