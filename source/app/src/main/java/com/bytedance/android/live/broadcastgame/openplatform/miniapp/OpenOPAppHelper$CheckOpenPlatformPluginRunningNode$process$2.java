package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87798Kie;

/* loaded from: classes5.dex */
public final class OpenOPAppHelper$CheckOpenPlatformPluginRunningNode$process$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87798Kie $chains;

    static {
        Covode.recordClassIndex(21491);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOPAppHelper$CheckOpenPlatformPluginRunningNode$process$2(C87798Kie c87798Kie) {
        super(0);
        this.$chains = c87798Kie;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$chains.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
