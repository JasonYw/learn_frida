package com.bytedance.android.live.broadcastgame.opengame;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87668KgY;
import p003X.C87783KiP;
import p003X.C87784KiQ;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.AudiencePluginManager$showPlugin$5$$special$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3482x4cacde60 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87783KiP $popBoxContent;
    public final /* synthetic */ C87668KgY this$0;

    static {
        Covode.recordClassIndex(19900);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3482x4cacde60(C87783KiP c87783KiP, C87668KgY c87668KgY) {
        super(0);
        this.$popBoxContent = c87783KiP;
        this.this$0 = c87668KgY;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Context context;
        C3682x LJIIIZ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC3664m abstractC3664m = this.this$0.LIZIZ.LJII;
            if (abstractC3664m == null || (LJIIIZ = abstractC3664m.LJIIIZ()) == null || (context = LJIIIZ.LJIILL()) == null) {
                context = this.this$0.LIZIZ.LJIIL;
            }
            C87784KiQ c87784KiQ = new C87784KiQ(context);
            C87783KiP c87783KiP = this.$popBoxContent;
            Intrinsics.checkNotNullExpressionValue(c87783KiP, "");
            C87784KiQ.LIZ(c87784KiQ, c87783KiP, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
