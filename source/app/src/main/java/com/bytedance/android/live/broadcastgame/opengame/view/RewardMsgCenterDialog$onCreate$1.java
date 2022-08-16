package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.DialogC88011Km5;

/* loaded from: classes25.dex */
public final class RewardMsgCenterDialog$onCreate$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC88011Km5 this$0;

    static {
        Covode.recordClassIndex(21163);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMsgCenterDialog$onCreate$1(DialogC88011Km5 dialogC88011Km5) {
        super(0);
        this.this$0 = dialogC88011Km5;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
