package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.battle;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80674Hr2;
import p003X.C80827HtV;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.battle.BattleGuestMicSeatLayer$onGuestBattleLastMinute$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4375xfde6fc58 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80827HtV this$0;

    static {
        Covode.recordClassIndex(26330);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4375xfde6fc58(C80827HtV c80827HtV) {
        super(0);
        this.this$0 = c80827HtV;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C80674Hr2.LIZ(this.this$0.LIZIZ).setVisibility(8);
            this.this$0.LIZIZ.LIZJ().LJFF();
        }
        return Unit.INSTANCE;
    }
}
