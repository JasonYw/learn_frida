package com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes3.dex */
public final class GuestBattleQuickInteractView$consumeInteractTask$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GuestBattleQuickInteractView this$0;

    static {
        Covode.recordClassIndex(30354);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleQuickInteractView$consumeInteractTask$2(GuestBattleQuickInteractView guestBattleQuickInteractView) {
        super(0);
        this.this$0 = guestBattleQuickInteractView;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.post(new Runnable() { // from class: com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.GuestBattleQuickInteractView$consumeInteractTask$2.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(30355);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LK1.LIZ(GuestBattleQuickInteractView$consumeInteractTask$2.this.this$0.getIcon(), 500L);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
