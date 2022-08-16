package com.bytedance.android.live.liveinteract.linkroomfight.p364ui;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.linkroomfight.core.e$b;
import com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C78799H4n;
import p003X.C78802H4q;
import p003X.C78803H4r;
import p003X.C78804H4s;
import p003X.C78805H4t;
import p003X.C78806H4u;
import p003X.C78807H4v;
import p003X.C78808H4w;
import p003X.H52;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.ui.LinkRoomFightViewManager$1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class LinkRoomFightViewManager$1 extends FunctionReferenceImpl implements Function1<e$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27782);
    }

    public LinkRoomFightViewManager$1(H52 h52) {
        super(1, h52, H52.class, "onStateChanged", "onStateChanged(Lcom/bytedance/android/live/liveinteract/linkroomfight/core/LinkRoomFightStateMachine$SideEffect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(e$b e_b) {
        C2WC<C6174n> LIZIZ;
        C6174n LIZ;
        e$b e_b2 = e_b;
        if (!PatchProxy.proxy(new Object[]{e_b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(e_b2);
            H52 h52 = (H52) this.receiver;
            if (!PatchProxy.proxy(new Object[]{e_b2}, h52, H52.LIZ, false, 3).isSupported) {
                ALogger.m15797i("LinkRoomFightView", C0002O.m25086C("onStateChanged: sideEffect = ", e_b2.LIZ));
                C4492d LIZ2 = C4492d.LIZLLL.LIZ();
                if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (LIZ = LIZIZ.LIZ()) != null) {
                    if (Intrinsics.areEqual(e_b2, C78806H4u.LIZIZ)) {
                        h52.LIZ(LIZ);
                    } else if (Intrinsics.areEqual(e_b2, C78802H4q.LIZIZ)) {
                        if (!PatchProxy.proxy(new Object[]{LIZ}, h52, H52.LIZ, false, 7).isSupported) {
                            C106862S5w.LIZ(LIZ);
                            H52.LIZ(h52, LIZ, "refresh", false, 4, null);
                            TeamFightPKProgressLayout.LIZ(h52.LIZJ, LIZ, false, 2, null);
                        }
                    } else if (!Intrinsics.areEqual(e_b2, C78808H4w.LIZIZ)) {
                        if (Intrinsics.areEqual(e_b2, C78805H4t.LIZIZ)) {
                            h52.LIZIZ(LIZ);
                        } else if (Intrinsics.areEqual(e_b2, C78807H4v.LIZIZ)) {
                            h52.LIZJ(LIZ);
                        } else if (e_b2 instanceof C78803H4r) {
                            h52.LIZ("reset");
                        } else {
                            Intrinsics.areEqual(e_b2, C78804H4s.LIZIZ);
                        }
                    }
                    C78799H4n.LIZ(false);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
