package com.bytedance.android.live.broadcastgame.openplatform.message;

import com.bytedance.android.live.broadcastgame.api.util.OpenPlatformTimeTracer;
import com.bytedance.android.live.broadcastgame.opengame.message.C3515al;
import com.bytedance.android.live.broadcastgame.opengame.network.C3560d;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC100834PnQ;
import p003X.C106862S5w;
import p003X.C87735Khd;
import p003X.C87767Ki9;
import p003X.KYS;

/* loaded from: classes5.dex */
public final class MiniAppEnterRoomMessageReceiver$checkStampInfo$1 extends Lambda implements Function1<AbstractC100834PnQ<C3560d>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87735Khd this$0;

    static {
        Covode.recordClassIndex(21461);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppEnterRoomMessageReceiver$checkStampInfo$1(C87735Khd c87735Khd) {
        super(1);
        this.this$0 = c87735Khd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC100834PnQ<C3560d> abstractC100834PnQ) {
        C8733af c8733af;
        AbstractC100834PnQ<C3560d> abstractC100834PnQ2 = abstractC100834PnQ;
        if (!PatchProxy.proxy(new Object[]{abstractC100834PnQ2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC100834PnQ2);
            List<C8733af> list = abstractC100834PnQ2.LIZIZ.LIZIZ;
            if (list != null && (c8733af = list.get(0)) != null) {
                C87767Ki9.LIZ().LIZ(OpenPlatformTimeTracer.EventName.stamp_v2_info_end);
                KYS kys = this.this$0.LIZIZ;
                if (kys != null) {
                    C8906gu c8906gu = new C8906gu();
                    c8906gu.LIZJ = c8733af;
                    kys.LIZ(new C3515al(c8906gu, true, false, 4));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
