package com.bytedance.android.live.liveinteract.voicechat.panel.adapter;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
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
public final class RadioTalkGuestViewHolder$bindView$1$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ User $it;

    static {
        Covode.recordClassIndex(31645);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioTalkGuestViewHolder$bindView$1$1(User user) {
        super(1);
        this.$it = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C87010KQi LIZ = C87010KQi.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.$it);
            userProfileEvent.setClickUserPosition("pk_linked_audience");
            userProfileEvent.setReportSource("audience_audio");
            userProfileEvent.setReportType("data_card_linked_audience");
            LIZ.LIZ(userProfileEvent);
        }
        return Unit.INSTANCE;
    }
}
