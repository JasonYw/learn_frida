package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC79387HRd;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorPkQuitDialog$prepareActivity$1 */
/* loaded from: classes3.dex */
public final class MultiAnchorPkQuitDialog$prepareActivity$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC79387HRd this$0;

    static {
        Covode.recordClassIndex(28169);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorPkQuitDialog$prepareActivity$1(DialogC79387HRd dialogC79387HRd) {
        super(0);
        this.this$0 = dialogC79387HRd;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            DialogC79387HRd dialogC79387HRd = this.this$0;
            if (!PatchProxy.proxy(new Object[]{dialogC79387HRd, 0, 1, null}, null, DialogC79387HRd.LIZ, true, 3).isSupported) {
                dialogC79387HRd.LIZ(LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Multiple_Again.ordinal());
            }
        }
        return Unit.INSTANCE;
    }
}
