package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C78636GzG;
import p003X.H3L;

/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceTeamFightViewManager$2 extends FunctionReferenceImpl implements Function1<C6174n, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31305);
    }

    public VoiceTeamFightViewManager$2(H3L h3l) {
        super(1, h3l, H3L.class, "onTeamFightInfoChanged", "onTeamFightInfoChanged(Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkMicTeamFightInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6174n c6174n) {
        C6174n c6174n2 = c6174n;
        if (!PatchProxy.proxy(new Object[]{c6174n2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6174n2);
            H3L h3l = (H3L) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6174n2}, h3l, H3L.LIZ, false, 3).isSupported && C5056a.LIZJ.LIZLLL() && (h3l.LJIIIZ || C78636GzG.LIZIZ.LIZLLL())) {
                h3l.LIZ(c6174n2);
            }
        }
        return Unit.INSTANCE;
    }
}
