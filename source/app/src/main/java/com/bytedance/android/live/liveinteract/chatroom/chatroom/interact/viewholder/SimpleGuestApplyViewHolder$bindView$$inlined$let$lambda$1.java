package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
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
public final class SimpleGuestApplyViewHolder$bindView$$inlined$let$lambda$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $getItemPosition$inlined;
    public final /* synthetic */ User $user;
    public final /* synthetic */ C4824t $waitingListUser$inlined;
    public final /* synthetic */ C4337ak this$0;

    static {
        Covode.recordClassIndex(26083);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGuestApplyViewHolder$bindView$$inlined$let$lambda$1(User user, C4337ak c4337ak, C4824t c4824t, Function1 function1) {
        super(1);
        this.$user = user;
        this.this$0 = c4337ak;
        this.$waitingListUser$inlined = c4824t;
        this.$getItemPosition$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.$waitingListUser$inlined.LJJIFFI) {
                ALogger.m15797i("ttlive_simple_guest_apply_view_holder", "click on the anonymous user avatar for apply , do not pull up the profile card");
                C88440Kt0.LIZ(LK5.LIZ(2131585171));
            } else {
                C87010KQi.LIZ().LIZ(new UserProfileEvent(this.$user));
            }
        }
        return Unit.INSTANCE;
    }
}
