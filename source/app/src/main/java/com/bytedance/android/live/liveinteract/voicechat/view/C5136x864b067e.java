package com.bytedance.android.live.liveinteract.voicechat.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80582HpY;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.view.VoiceChatRoomAnchorView$onGuestBattleLastMinute$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C5136x864b067e extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80582HpY this$0;

    static {
        Covode.recordClassIndex(31865);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5136x864b067e(C80582HpY c80582HpY) {
        super(0);
        this.this$0 = c80582HpY;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJIILLIIL.setVisibility(8);
            this.this$0.LIZIZ.LJIILLIIL.LJFF();
        }
        return Unit.INSTANCE;
    }
}
