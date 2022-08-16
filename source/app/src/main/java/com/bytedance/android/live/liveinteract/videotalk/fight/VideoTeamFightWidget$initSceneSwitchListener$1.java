package com.bytedance.android.live.liveinteract.videotalk.fight;

import com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget;
import com.bytedance.android.live.liveinteract.voicechat.fight.b$a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.message.model.C8866fg;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.AbstractC413392Xt;
import p003X.C106862S5w;
import p003X.C77524GhK;
import p003X.C78612Gys;
import p003X.C78636GzG;
import p003X.C78653GzX;
import p003X.C88440Kt0;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTeamFightWidget$initSceneSwitchListener$1 extends FunctionReferenceImpl implements Function1<C6307m, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30251);
    }

    public VideoTeamFightWidget$initSceneSwitchListener$1(VideoTeamFightWidget videoTeamFightWidget) {
        super(1, videoTeamFightWidget, VideoTeamFightWidget.class, "onSceneWithPlayModeChanged", "onSceneWithPlayModeChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneWithPlayModeEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6307m c6307m) {
        C5923dp LJJJI;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZ;
        C6307m c6307m2 = c6307m;
        if (!PatchProxy.proxy(new Object[]{c6307m2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6307m2);
            LinkMicTeamFightWidget linkMicTeamFightWidget = (LinkMicTeamFightWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6307m2}, linkMicTeamFightWidget, VideoTeamFightWidget.LIZ, false, 4).isSupported) {
                int i = linkMicTeamFightWidget.LIZJ;
                linkMicTeamFightWidget.LIZJ = c6307m2.LIZIZ;
                if (i != 0) {
                    boolean LIZ2 = C78636GzG.LIZ();
                    if (!linkMicTeamFightWidget.LJIILL().LIZIZ()) {
                        if (c6307m2.LIZ() && linkMicTeamFightWidget.LJIIL() && !LIZ2) {
                            C77524GhK.LIZ(linkMicTeamFightWidget, 0, 0L, "sceneChange", 3, null);
                        }
                        if (linkMicTeamFightWidget.LJIIL() && c6307m2.LIZ()) {
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], linkMicTeamFightWidget, VideoTeamFightWidget.LIZ, false, 11);
                            if (!proxy.isSupported ? !((LJJJI = linkMicTeamFightWidget.LJJJI()) == null || (LJJZZIII = LJJJI.LJJZZIII()) == null || (LIZIZ = LJJZZIII.LIZIZ()) == null || (LIZ = LIZIZ.LIZ()) == null || !C78653GzX.LIZ(LIZ.LIZLLL)) : ((Boolean) proxy.result).booleanValue()) {
                                C88440Kt0.LIZ(2131587994);
                            }
                        }
                    } else {
                        C8866fg.C8868b LIZ3 = C78612Gys.LIZ(4, null, 2, null);
                        LIZ3.f27898LJ = true ^ linkMicTeamFightWidget.LJIIL();
                        linkMicTeamFightWidget.LJIILJJIL.LIZ(new b$a.C5061e(linkMicTeamFightWidget.LJIILL().LIZ, LIZ3));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
