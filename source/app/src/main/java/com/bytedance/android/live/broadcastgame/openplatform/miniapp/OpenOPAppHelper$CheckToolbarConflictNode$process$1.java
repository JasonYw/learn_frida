package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87798Kie;
import p003X.C87799Kif;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class OpenOPAppHelper$CheckToolbarConflictNode$process$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87798Kie $chains;
    public final /* synthetic */ C87799Kif this$0;

    static {
        Covode.recordClassIndex(21493);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOPAppHelper$CheckToolbarConflictNode$process$1(C87799Kif c87799Kif, C87798Kie c87798Kie) {
        super(0);
        this.this$0 = c87799Kif;
        this.$chains = c87798Kie;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87911KkT.LIZIZ.LIZ("启动小程序, 命中购物车互斥逻辑", "OpenOPAppHelper");
            this.this$0.LIZJ.LIZ();
            this.$chains.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}