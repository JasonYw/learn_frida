package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.battle;

import android.view.View;
import com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4848n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80713Hrf;

/* loaded from: classes3.dex */
public final class BattleVideoGuestMicSeatLayer$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80713Hrf this$0;

    static {
        Covode.recordClassIndex(26333);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BattleVideoGuestMicSeatLayer$onCreate$1(C80713Hrf c80713Hrf) {
        super(1);
        this.this$0 = c80713Hrf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC4848n abstractC4848n = this.this$0.LJIJI;
            if (abstractC4848n != null) {
                abstractC4848n.LIZIZ(this.this$0.LJI);
            }
        }
        return Unit.INSTANCE;
    }
}
