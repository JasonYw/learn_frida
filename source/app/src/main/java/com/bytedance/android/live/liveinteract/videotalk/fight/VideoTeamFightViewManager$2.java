package com.bytedance.android.live.liveinteract.videotalk.fight;

import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C78636GzG;
import p003X.H3Q;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTeamFightViewManager$2 extends FunctionReferenceImpl implements Function1<C6174n, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30245);
    }

    public VideoTeamFightViewManager$2(H3Q h3q) {
        super(1, h3q, H3Q.class, "onTeamFightInfoChanged", "onTeamFightInfoChanged(Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkMicTeamFightInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6174n c6174n) {
        C6174n c6174n2 = c6174n;
        if (!PatchProxy.proxy(new Object[]{c6174n2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6174n2);
            H3Q h3q = (H3Q) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6174n2}, h3q, H3Q.LIZ, false, 2).isSupported && C5056a.LIZJ.LIZLLL() && (h3q.LJIIIIZZ || C78636GzG.LIZIZ.LIZLLL())) {
                h3q.LIZ(c6174n2);
            }
        }
        return Unit.INSTANCE;
    }
}
