package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.battle;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80674Hr2;

/* loaded from: classes3.dex */
public final class BattleGuestMicSeatLayer$playSeatPoopAnim$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80674Hr2 this$0;

    static {
        Covode.recordClassIndex(26332);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BattleGuestMicSeatLayer$playSeatPoopAnim$1(C80674Hr2 c80674Hr2) {
        super(0);
        this.this$0 = c80674Hr2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZLLL().LIZ(this.this$0.LJII);
            this.this$0.LJIILL = false;
        }
        return Unit.INSTANCE;
    }
}
