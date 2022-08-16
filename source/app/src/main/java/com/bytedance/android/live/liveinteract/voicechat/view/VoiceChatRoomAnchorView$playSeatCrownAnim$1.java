package com.bytedance.android.live.liveinteract.voicechat.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class VoiceChatRoomAnchorView$playSeatCrownAnim$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VoiceChatRoomAnchorView this$0;

    static {
        Covode.recordClassIndex(31866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatRoomAnchorView$playSeatCrownAnim$1(VoiceChatRoomAnchorView voiceChatRoomAnchorView) {
        super(0);
        this.this$0 = voiceChatRoomAnchorView;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIIZILJ.LIZ(this.this$0.getMBattleResult());
            this.this$0.LJIJI = false;
        }
        return Unit.INSTANCE;
    }
}
