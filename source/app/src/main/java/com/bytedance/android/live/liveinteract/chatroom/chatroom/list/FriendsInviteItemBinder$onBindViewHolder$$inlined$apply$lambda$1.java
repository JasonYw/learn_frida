package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78285Gtb;
import p003X.C87010KQi;

/* loaded from: classes3.dex */
public final class FriendsInviteItemBinder$onBindViewHolder$$inlined$apply$lambda$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkPlayerInfo $info$inlined;
    public final /* synthetic */ C78285Gtb this$0;

    static {
        Covode.recordClassIndex(26168);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendsInviteItemBinder$onBindViewHolder$$inlined$apply$lambda$1(C78285Gtb c78285Gtb, LinkPlayerInfo linkPlayerInfo) {
        super(1);
        this.this$0 = c78285Gtb;
        this.$info$inlined = linkPlayerInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.$info$inlined.LJIJI && this.$info$inlined.LJJIFFI == 1) {
                C78285Gtb c78285Gtb = this.this$0;
                User LIZ = this.$info$inlined.LIZ();
                if (!PatchProxy.proxy(new Object[]{LIZ}, c78285Gtb, C78285Gtb.LIZ, false, 2).isSupported && LIZ != null) {
                    C87010KQi LIZ2 = C87010KQi.LIZ();
                    UserProfileEvent userProfileEvent = new UserProfileEvent(LIZ);
                    userProfileEvent.setClickUserPosition("pk_linked_audience");
                    userProfileEvent.setReportSource("audience_audio");
                    userProfileEvent.setReportType("data_card_linked_audience");
                    LIZ2.LIZ(userProfileEvent);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
