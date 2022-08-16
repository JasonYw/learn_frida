package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.android.live.liveinteract.voicechat.fight.b$a;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.message.model.C8866fg;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C78612Gys;

/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceTeamFightWidget$initSceneSwitchListener$1 extends FunctionReferenceImpl implements Function1<C6306l, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31311);
    }

    public VoiceTeamFightWidget$initSceneSwitchListener$1(VoiceTeamFightWidget voiceTeamFightWidget) {
        super(1, voiceTeamFightWidget, VoiceTeamFightWidget.class, "onVoiceSceneChanged", "onVoiceSceneChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6306l c6306l) {
        C6306l c6306l2 = c6306l;
        if (!PatchProxy.proxy(new Object[]{c6306l2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6306l2);
            LinkMicTeamFightWidget linkMicTeamFightWidget = (LinkMicTeamFightWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6306l2}, linkMicTeamFightWidget, VoiceTeamFightWidget.LIZ, false, 4).isSupported) {
                int i = linkMicTeamFightWidget.LIZJ;
                linkMicTeamFightWidget.LIZJ = c6306l2.f26940LJ;
                if (i != 0 && linkMicTeamFightWidget.LJIILL().LIZIZ()) {
                    linkMicTeamFightWidget.LIZJ("voiceSceneChangedTo " + c6306l2.f26940LJ);
                    C8866fg.C8868b LIZ = C78612Gys.LIZ(4, null, 2, null);
                    LIZ.f27898LJ = true ^ linkMicTeamFightWidget.LJIIL();
                    linkMicTeamFightWidget.LJIILJJIL.LIZ(new b$a.C5061e(linkMicTeamFightWidget.LJIILL().LIZ, LIZ));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
