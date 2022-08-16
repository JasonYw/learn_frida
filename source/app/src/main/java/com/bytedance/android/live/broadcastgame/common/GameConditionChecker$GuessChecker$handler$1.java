package com.bytedance.android.live.broadcastgame.common;

import com.bytedance.android.live.broadcastgame.api.interactgame.w$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C441653dX;

/* loaded from: classes12.dex */
public final class GameConditionChecker$GuessChecker$handler$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $onSuccess;
    public final /* synthetic */ C441653dX this$0;

    static {
        Covode.recordClassIndex(19607);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConditionChecker$GuessChecker$handler$1(C441653dX c441653dX, Function1 function1) {
        super(1);
        this.this$0 = c441653dX;
        this.$onSuccess = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            final DataCenter dataCenter = this.this$0.LIZJ;
            this.$onSuccess.invoke(new w$a(dataCenter) { // from class: X.3dd
                public static ChangeQuickRedirect LIZ;
                public final DataCenter LIZIZ;

                static {
                    Covode.recordClassIndex(19648);
                }

                @Override // com.bytedance.android.live.broadcastgame.api.interactgame.w$a
                public final void LIZIZ() {
                }

                @Override // com.bytedance.android.live.broadcastgame.api.interactgame.w$a
                public final String LIZJ() {
                    return "guess";
                }

                @Override // com.bytedance.android.live.broadcastgame.api.interactgame.w$a
                public final void LIZ() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.put("cmd_broadcast_exit_draw_and_guess", Boolean.TRUE);
                }

                {
                    C106862S5w.LIZ(dataCenter);
                    this.LIZIZ = dataCenter;
                }
            });
        }
        return Unit.INSTANCE;
    }
}
