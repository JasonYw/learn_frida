package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime.C3860e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87687Kgr;

/* loaded from: classes5.dex */
public final class OpenOPAppHelper$PreviewMiniAppNode$miniAppRuntime$2 extends Lambda implements Function0<C3860e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87687Kgr this$0;

    static {
        Covode.recordClassIndex(21495);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOPAppHelper$PreviewMiniAppNode$miniAppRuntime$2(C87687Kgr c87687Kgr) {
        super(0);
        this.this$0 = c87687Kgr;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3860e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3860e(this.this$0.LIZIZ, null, -1L, false, null);
    }
}
