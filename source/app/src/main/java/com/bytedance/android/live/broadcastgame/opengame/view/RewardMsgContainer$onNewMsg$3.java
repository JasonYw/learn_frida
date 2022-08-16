package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class RewardMsgContainer$onNewMsg$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3731ad this$0;

    static {
        Covode.recordClassIndex(21167);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardMsgContainer$onNewMsg$3(C3731ad c3731ad) {
        super(0);
        this.this$0 = c3731ad;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.f26096LJ.setVisibility(8);
            this.this$0.m15838LJ();
        }
        return Unit.INSTANCE;
    }
}
