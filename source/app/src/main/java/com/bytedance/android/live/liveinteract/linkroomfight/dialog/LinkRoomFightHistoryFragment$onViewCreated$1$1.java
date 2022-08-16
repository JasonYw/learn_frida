package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import com.bytedance.android.live.liveinteract.linkroomfight.api.C4452c;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87010KQi;

/* loaded from: classes3.dex */
public final class LinkRoomFightHistoryFragment$onViewCreated$1$1 extends Lambda implements Function1<C4452c.C4453a, Unit> {
    public static final LinkRoomFightHistoryFragment$onViewCreated$1$1 INSTANCE = new LinkRoomFightHistoryFragment$onViewCreated$1$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27677);
    }

    public LinkRoomFightHistoryFragment$onViewCreated$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C4452c.C4453a c4453a) {
        C4452c.C4453a c4453a2 = c4453a;
        if (!PatchProxy.proxy(new Object[]{c4453a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c4453a2);
            if (c4453a2.LIZIZ != null) {
                C87010KQi.LIZ().LIZ(new UserProfileEvent(c4453a2.LIZIZ));
            }
        }
        return Unit.INSTANCE;
    }
}
