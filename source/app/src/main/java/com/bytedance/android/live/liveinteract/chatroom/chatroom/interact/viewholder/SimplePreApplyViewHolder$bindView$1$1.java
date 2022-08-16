package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

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

/* loaded from: classes12.dex */
public final class SimplePreApplyViewHolder$bindView$1$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ User $user;

    static {
        Covode.recordClassIndex(26084);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePreApplyViewHolder$bindView$1$1(User user) {
        super(1);
        this.$user = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C87010KQi.LIZ().LIZ(new UserProfileEvent(this.$user));
        }
        return Unit.INSTANCE;
    }
}
