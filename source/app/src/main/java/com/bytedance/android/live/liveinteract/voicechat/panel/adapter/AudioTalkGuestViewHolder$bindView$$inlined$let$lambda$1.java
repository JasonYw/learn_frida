package com.bytedance.android.live.liveinteract.voicechat.panel.adapter;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class AudioTalkGuestViewHolder$bindView$$inlined$let$lambda$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ User $it;
    public final /* synthetic */ LinkPlayerInfo $linkPlayerInfo$inlined;
    public final /* synthetic */ C5078b this$0;

    static {
        Covode.recordClassIndex(31641);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTalkGuestViewHolder$bindView$$inlined$let$lambda$1(User user, C5078b c5078b, LinkPlayerInfo linkPlayerInfo) {
        super(1);
        this.$it = user;
        this.this$0 = c5078b;
        this.$linkPlayerInfo$inlined = linkPlayerInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LJJIIZ == 0 && this.$linkPlayerInfo$inlined.LJJJIL) {
                ALogger.m15797i("ttlive_audio_talk_guest_view_holder", "click on the anonymous user avatar for apply , do not pull up the profile card");
                C88440Kt0.LIZ(LK5.LIZ(2131585171));
            } else {
                C87010KQi LIZ = C87010KQi.LIZ();
                UserProfileEvent userProfileEvent = new UserProfileEvent(this.$it);
                userProfileEvent.setClickUserPosition("pk_linked_audience");
                userProfileEvent.setReportSource("audience_audio");
                userProfileEvent.setReportType("data_card_linked_audience");
                LIZ.LIZ(userProfileEvent);
            }
        }
        return Unit.INSTANCE;
    }
}
