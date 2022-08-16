package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87968KlO;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$getGameCastAbility$$inlined$let$lambda$1$2 extends Lambda implements Function1<AbstractC3609d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87968KlO this$0;

    static {
        Covode.recordClassIndex(21105);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$getGameCastAbility$$inlined$let$lambda$1$2(C87968KlO c87968KlO) {
        super(1);
        this.this$0 = c87968KlO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
        AbstractC3609d abstractC3609d2 = abstractC3609d;
        if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3609d2);
            ALogger.m15796v("BaseLiveGameWithPanel", "忽略，解决编译问题 " + this.this$0.LIZIZ);
            abstractC3609d2.LIZJ(false);
        }
        return Unit.INSTANCE;
    }
}
