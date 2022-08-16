package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.android.live.liveinteract.videotalk.battle.h$a;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.LK5;

/* loaded from: classes3.dex */
public final /* synthetic */ class GuestBattleWidget$onCreate$1 extends FunctionReferenceImpl implements Function1<C6306l, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29883);
    }

    public GuestBattleWidget$onCreate$1(GuestBattleWidget guestBattleWidget) {
        super(1, guestBattleWidget, GuestBattleWidget.class, "onVoiceSceneChanged", "onVoiceSceneChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6306l c6306l) {
        String str;
        C6306l c6306l2 = c6306l;
        if (!PatchProxy.proxy(new Object[]{c6306l2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6306l2);
            GuestBattleWidget guestBattleWidget = (GuestBattleWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6306l2}, guestBattleWidget, GuestBattleWidget.LIZ, false, 18).isSupported) {
                int i = guestBattleWidget.LIZIZ;
                guestBattleWidget.LIZIZ = c6306l2.f26940LJ;
                if (i != 0 && guestBattleWidget.LIZJ().LIZIZ()) {
                    guestBattleWidget.LIZ("voiceSceneChangedTo " + c6306l2.f26940LJ);
                    C6166j c6166j = guestBattleWidget.LIZJ().LIZ;
                    if (!guestBattleWidget.LIZ()) {
                        str = LK5.LIZ(2131583906);
                    } else {
                        str = "";
                    }
                    c6166j.LJIIL = str;
                    guestBattleWidget.f26439LJ.LIZ(new h$a.C4895d(guestBattleWidget.LIZJ().LIZ));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
