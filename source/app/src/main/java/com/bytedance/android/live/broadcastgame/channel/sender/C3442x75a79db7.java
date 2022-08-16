package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.android.live.broadcastgame.api.channel.C3331a;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C77022GYe;
import p003X.C77088GaI;
import p003X.C87188KXe;
import p003X.C87197KXn;
import p003X.C87199KXp;
import p003X.C87203KXt;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.sender.Anchor2AudienceLoopSeiSender$tryInitTicker$1$$special$$inlined$apply$lambda$1 */
/* loaded from: classes5.dex */
public final class C3442x75a79db7 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Anchor2AudienceLoopSeiSender$tryInitTicker$1 this$0;

    static {
        Covode.recordClassIndex(19561);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3442x75a79db7(Anchor2AudienceLoopSeiSender$tryInitTicker$1 anchor2AudienceLoopSeiSender$tryInitTicker$1) {
        super(1);
        this.this$0 = anchor2AudienceLoopSeiSender$tryInitTicker$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        AbstractC5436a mo30099invoke;
        C3331a c3331a;
        if (!PatchProxy.proxy(new Object[]{new Long(l.longValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            C87188KXe c87188KXe = this.this$0.this$0;
            if (!PatchProxy.proxy(new Object[0], c87188KXe, C87188KXe.LIZ, false, 2).isSupported && (mo30099invoke = c87188KXe.LIZLLL.mo30099invoke()) != null && (c3331a = c87188KXe.LIZJ) != null) {
                Observable.just(c3331a).flatMap(C87199KXp.LIZIZ).flatMap(new C87197KXn(mo30099invoke)).flatMap(C87203KXt.LIZIZ).subscribe(C77088GaI.LIZ, C77022GYe.LIZIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
