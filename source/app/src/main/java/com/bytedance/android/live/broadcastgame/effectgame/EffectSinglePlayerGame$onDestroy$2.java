package com.bytedance.android.live.broadcastgame.effectgame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87121KUp;

/* loaded from: classes5.dex */
public final class EffectSinglePlayerGame$onDestroy$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87121KUp this$0;

    static {
        Covode.recordClassIndex(19740);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectSinglePlayerGame$onDestroy$2(C87121KUp c87121KUp) {
        super(0);
        this.this$0 = c87121KUp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.removeObserver("cmd_broadcast_game_finish", this.this$0);
        }
        return Unit.INSTANCE;
    }
}
