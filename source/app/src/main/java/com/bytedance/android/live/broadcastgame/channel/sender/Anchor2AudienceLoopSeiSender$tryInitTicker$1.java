package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.android.live.broadcastgame.channel.C3431f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87188KXe;

/* loaded from: classes5.dex */
public final class Anchor2AudienceLoopSeiSender$tryInitTicker$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87188KXe this$0;

    static {
        Covode.recordClassIndex(19560);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Anchor2AudienceLoopSeiSender$tryInitTicker$1(C87188KXe c87188KXe) {
        super(0);
        this.this$0 = c87188KXe;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && this.this$0.LIZIZ == null) {
            C87188KXe c87188KXe = this.this$0;
            C3431f c3431f = new C3431f("sei-loop");
            c3431f.LIZ(1000L, new C3442x75a79db7(this));
            c87188KXe.LIZIZ = c3431f;
        }
        return Unit.INSTANCE;
    }
}
