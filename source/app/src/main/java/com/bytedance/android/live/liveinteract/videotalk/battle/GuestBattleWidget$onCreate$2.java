package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.android.live.liveinteract.videotalk.battle.h$a;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final /* synthetic */ class GuestBattleWidget$onCreate$2 extends FunctionReferenceImpl implements Function1<C6307m, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29884);
    }

    public GuestBattleWidget$onCreate$2(GuestBattleWidget guestBattleWidget) {
        super(1, guestBattleWidget, GuestBattleWidget.class, "onVideoSceneChanged", "onVideoSceneChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneWithPlayModeEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6307m c6307m) {
        C6307m c6307m2 = c6307m;
        if (!PatchProxy.proxy(new Object[]{c6307m2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6307m2);
            GuestBattleWidget guestBattleWidget = (GuestBattleWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6307m2}, guestBattleWidget, GuestBattleWidget.LIZ, false, 17).isSupported) {
                int i = guestBattleWidget.LIZIZ;
                guestBattleWidget.LIZIZ = c6307m2.LIZIZ;
                if (i != 0 && i != guestBattleWidget.LIZIZ && guestBattleWidget.LIZJ().LIZIZ()) {
                    guestBattleWidget.LIZ("videoSceneChangeTo " + c6307m2.LIZIZ + LoggerUtil.BLANK_TAG + c6307m2.LIZJ);
                    guestBattleWidget.f26439LJ.LIZ(new h$a.C4895d(guestBattleWidget.LIZJ().LIZ));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
