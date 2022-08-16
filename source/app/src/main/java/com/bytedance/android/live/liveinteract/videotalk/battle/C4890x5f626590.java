package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C79046HEa;
import p003X.C80339Hld;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleViewManager$showBattleStatusEffect$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4890x5f626590 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80339Hld this$0;

    static {
        Covode.recordClassIndex(29865);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4890x5f626590(C80339Hld c80339Hld) {
        super(0);
        this.this$0 = c80339Hld;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZIZ.setVisibility(8);
            if (!this.this$0.LIZIZ.LIZLLL && this.this$0.LIZJ) {
                C79046HEa LIZ = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                if (LIZ.LIZJ()) {
                    C88440Kt0.LIZ(2131583925);
                }
            }
            Function0 function0 = this.this$0.LIZLLL;
            if (function0 != null) {
                function0.mo30099invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
