package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.linkroomfight.core.e$b;
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
import p003X.C78802H4q;
import p003X.C78805H4t;
import p003X.C78806H4u;
import p003X.C80608Hpy;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.LinkRoomFightAudioWindowManager$1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class LinkRoomFightAudioWindowManager$1 extends FunctionReferenceImpl implements Function1<e$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31872);
    }

    public LinkRoomFightAudioWindowManager$1(C80608Hpy c80608Hpy) {
        super(1, c80608Hpy, C80608Hpy.class, "onFightStateChanged", "onFightStateChanged(Lcom/bytedance/android/live/liveinteract/linkroomfight/core/LinkRoomFightStateMachine$SideEffect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(e$b e_b) {
        C2WC<C6174n> LIZIZ;
        e$b e_b2 = e_b;
        if (!PatchProxy.proxy(new Object[]{e_b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(e_b2);
            C80608Hpy c80608Hpy = (C80608Hpy) this.receiver;
            if (!PatchProxy.proxy(new Object[]{e_b2}, c80608Hpy, C80608Hpy.LIZ, false, 2).isSupported) {
                ALogger.m15797i("link_room_fight", C0002O.m25086C("on Fight state changed : sideEffect = ", e_b2.LIZ));
                C4492d LIZ = C4492d.LIZLLL.LIZ();
                if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && LIZIZ.LIZ() != null && (Intrinsics.areEqual(e_b2, C78806H4u.LIZIZ) || Intrinsics.areEqual(e_b2, C78802H4q.LIZIZ) || Intrinsics.areEqual(e_b2, C78805H4t.LIZIZ))) {
                    c80608Hpy.LIZ();
                }
            }
        }
        return Unit.INSTANCE;
    }
}