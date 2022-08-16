package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.android.livesdk.chatroom.model.interact.UpdateLinkTypeApplyResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class KtvVideoManager$tryOpenGuestCamera$1 extends Lambda implements Function1<UpdateLinkTypeApplyResponse, Unit> {
    public static final KtvVideoManager$tryOpenGuestCamera$1 INSTANCE = new KtvVideoManager$tryOpenGuestCamera$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31741);
    }

    public KtvVideoManager$tryOpenGuestCamera$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(UpdateLinkTypeApplyResponse updateLinkTypeApplyResponse) {
        if (!PatchProxy.proxy(new Object[]{updateLinkTypeApplyResponse}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(updateLinkTypeApplyResponse);
            C88440Kt0.LIZ(LK5.LIZ(2131584203));
        }
        return Unit.INSTANCE;
    }
}
