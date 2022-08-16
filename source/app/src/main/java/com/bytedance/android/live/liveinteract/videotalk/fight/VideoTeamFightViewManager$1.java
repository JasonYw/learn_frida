package com.bytedance.android.live.liveinteract.videotalk.fight;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.fight.b$b;
import com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C78644GzO;
import p003X.C78645GzP;
import p003X.C78646GzQ;
import p003X.C78647GzR;
import p003X.C78648GzS;
import p003X.C78649GzT;
import p003X.C78650GzU;
import p003X.C78651GzV;
import p003X.C78775H3p;
import p003X.H3Q;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTeamFightViewManager$1 extends FunctionReferenceImpl implements Function1<b$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30244);
    }

    public VideoTeamFightViewManager$1(H3Q h3q) {
        super(1, h3q, H3Q.class, "onStateChanged", "onStateChanged(Lcom/bytedance/android/live/liveinteract/voicechat/fight/TeamFightStateMachine$SideEffect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(b$b b_b) {
        C6174n LJII;
        if (!PatchProxy.proxy(new Object[]{b_b}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(b_b);
            H3Q h3q = (H3Q) this.receiver;
            if (!PatchProxy.proxy(new Object[]{b_b}, h3q, H3Q.LIZ, false, 3).isSupported && (LJII = C5056a.LIZJ.LJII()) != null) {
                if (Intrinsics.areEqual(b_b, C78644GzO.LIZIZ)) {
                    h3q.LIZIZ(LJII);
                } else if (Intrinsics.areEqual(b_b, C78648GzS.LIZIZ)) {
                    h3q.LIZJ(LJII);
                } else if (Intrinsics.areEqual(b_b, C78649GzT.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3q, H3Q.LIZ, false, 8).isSupported) {
                        C106862S5w.LIZ(LJII);
                        h3q.LIZ(LJII, "refresh");
                        TeamFightPKProgressLayout.LIZ(h3q.LIZJ, LJII, false, 2, null);
                        h3q.LJIILIIL.mo23709LJ(LJII);
                    }
                } else if (Intrinsics.areEqual(b_b, C78647GzR.LIZIZ)) {
                    h3q.LIZLLL(LJII);
                } else if (Intrinsics.areEqual(b_b, C78645GzP.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3q, H3Q.LIZ, false, 10).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightRecreate");
                        h3q.LIZ(LJII, "recreate");
                        h3q.LIZ(LJII);
                        h3q.LJIILIIL.LIZJ(LJII);
                        h3q.LIZJ.LIZ();
                        h3q.LIZJ.setVisibility(8);
                        h3q.LIZ();
                    }
                } else if (Intrinsics.areEqual(b_b, C78646GzQ.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3q, H3Q.LIZ, false, 11).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightRestart");
                        h3q.LIZ(LJII, "restart");
                        h3q.m23790LJ(LJII);
                        h3q.LJIILIIL.LIZLLL(LJII);
                        C78775H3p.f6558LJ.LIZ(LJII, false);
                    }
                } else if (b_b instanceof C78651GzV) {
                    h3q.LIZ("Reset");
                } else {
                    Intrinsics.areEqual(b_b, C78650GzU.LIZIZ);
                }
                h3q.LJIIJJI = h3q.LJIIJ;
                h3q.LJIIJ = LJII.LJFF;
            }
        }
        return Unit.INSTANCE;
    }
}
