package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorMiniAppPluginRuntime$requestAppStart$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $suc;

    static {
        Covode.recordClassIndex(21765);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniAppPluginRuntime$requestAppStart$1(Function0 function0) {
        super(0);
        this.$suc = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$suc.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
