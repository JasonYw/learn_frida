package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.battle;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5143z;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80751HsH;

/* loaded from: classes3.dex */
public final class BattleAudioGuestMicSeatLayer$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80751HsH this$0;

    static {
        Covode.recordClassIndex(26329);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BattleAudioGuestMicSeatLayer$onCreate$1(C80751HsH c80751HsH) {
        super(1);
        this.this$0 = c80751HsH;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        User user;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC5143z abstractC5143z = this.this$0.f7367LJ;
            if (abstractC5143z != null) {
                LinkPlayerInfo linkPlayerInfo = this.this$0.LJI;
                if (linkPlayerInfo != null) {
                    user = linkPlayerInfo.LIZ();
                } else {
                    user = null;
                }
                abstractC5143z.LIZ(user);
            }
        }
        return Unit.INSTANCE;
    }
}
