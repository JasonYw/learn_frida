package com.bytedance.android.live.broadcastgame.effectgame;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class EffectGameEngine$jsBridgeManager$2 extends Lambda implements Function0<AbstractC3940c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectGameEngine this$0;

    static {
        Covode.recordClassIndex(19736);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectGameEngine$jsBridgeManager$2(EffectGameEngine effectGameEngine) {
        super(0);
        this.this$0 = effectGameEngine;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.browser.jsbridge.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC3940c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        IBrowserService iBrowserService = (IBrowserService) ServiceManager.getService(IBrowserService.class);
        Context context = this.this$0.LJII;
        if (context != null) {
            return iBrowserService.createJsBridgeManager((Activity) context, this.this$0.LJI);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
