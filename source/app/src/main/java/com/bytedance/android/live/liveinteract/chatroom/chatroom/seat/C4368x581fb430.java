package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80901Huh;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.GuestBattleSeatAnimTask$playGuestBattleSeatAnimation$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4368x581fb430 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80901Huh this$0;

    static {
        Covode.recordClassIndex(26294);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4368x581fb430(C80901Huh c80901Huh) {
        super(0);
        this.this$0 = c80901Huh;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Function0 function0 = this.this$0.LIZJ;
            if (function0 != null) {
                function0.mo30099invoke();
            }
            HSImageView hSImageView = this.this$0.LIZIZ.f7383LJ;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}
