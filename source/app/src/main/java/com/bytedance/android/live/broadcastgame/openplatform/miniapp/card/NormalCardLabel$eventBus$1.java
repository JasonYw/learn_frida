package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87010KQi;
import p003X.C87884Kk2;

/* loaded from: classes5.dex */
public final class NormalCardLabel$eventBus$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ NormalCardLabel this$0;

    static {
        Covode.recordClassIndex(21599);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCardLabel$eventBus$1(NormalCardLabel normalCardLabel) {
        super(1);
        this.this$0 = normalCardLabel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            if (str2.hashCode() == 1127105834 && str2.equals("countdown_time_out")) {
                C87010KQi.LIZ().LIZ(new C3797m("countdown_time_out"));
                this.this$0.setLabel(new C87884Kk2(1, null, null, null, null, 0L, 62));
                Function0<Unit> countDownTimeOut = this.this$0.getCountDownTimeOut();
                if (countDownTimeOut != null) {
                    countDownTimeOut.mo30099invoke();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
