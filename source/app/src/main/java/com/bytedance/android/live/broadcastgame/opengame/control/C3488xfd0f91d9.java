package com.bytedance.android.live.broadcastgame.opengame.control;

import android.content.Context;
import com.bytedance.android.livesdk.wrds.p758a.C9416a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87783KiP;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.control.OpenPlatformControlService$processInteractControlDataAndShow$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3488xfd0f91d9 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87783KiP $it;
    public final /* synthetic */ C9416a.C9417a $operation$inlined;
    public final /* synthetic */ OpenPlatformControlService this$0;

    static {
        Covode.recordClassIndex(20018);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3488xfd0f91d9(C87783KiP c87783KiP, OpenPlatformControlService openPlatformControlService, C9416a.C9417a c9417a) {
        super(0);
        this.$it = c87783KiP;
        this.this$0 = openPlatformControlService;
        this.$operation$inlined = c9417a;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Context LJIILL;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Integer num = this.$operation$inlined.LIZIZ;
            if (num != null && num.intValue() == 2) {
                LJIILL = this.this$0.LJIIIIZZ().LIZLLL;
            } else {
                LJIILL = this.this$0.LJIIIIZZ().LJIILL();
            }
            this.this$0.LIZJ.LIZ(this.$it, LJIILL);
        }
        return Unit.INSTANCE;
    }
}
