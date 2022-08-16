package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC81047Hx3;
import p003X.C80899Huf;
import p003X.C80900Hug;
import p003X.C81105Hxz;

/* loaded from: classes3.dex */
public final class GuestBattleSeatAnimTask$handle$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C81105Hxz $event;
    public final /* synthetic */ C80899Huf this$0;

    static {
        Covode.recordClassIndex(26293);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleSeatAnimTask$handle$1(C80899Huf c80899Huf, C81105Hxz c81105Hxz) {
        super(0);
        this.this$0 = c80899Huf;
        this.$event = c81105Hxz;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15801d("GuestBattleSeatAnimTask", "#GuestBattleDebug# [handle] animation end: " + this.$event);
            Function0<Unit> function0 = ((C80900Hug) this.$event).LJFF;
            if (function0 != null) {
                function0.mo30099invoke();
            }
            this.this$0.LIZLLL.LIZ(SeatAnimTaskState.IDLE);
            AbstractC81047Hx3 LIZ = this.this$0.LIZ();
            if (LIZ != null) {
                LIZ.LIZ(this.$event);
            }
            this.this$0.LIZIZ = null;
        }
        return Unit.INSTANCE;
    }
}
