package com.bytedance.android.live.broadcastgame.effectgame.roomcat;

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
import p003X.C87131KUz;

/* loaded from: classes5.dex */
public final class RoomcatEffectGameEngine$jsBridgeManager$2 extends Lambda implements Function0<AbstractC3940c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87131KUz this$0;

    static {
        Covode.recordClassIndex(19841);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomcatEffectGameEngine$jsBridgeManager$2(C87131KUz c87131KUz) {
        super(0);
        this.this$0 = c87131KUz;
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
        Context context = this.this$0.LJIIJJI;
        if (context != null) {
            return iBrowserService.createJsBridgeManager((Activity) context, this.this$0.LJI);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
