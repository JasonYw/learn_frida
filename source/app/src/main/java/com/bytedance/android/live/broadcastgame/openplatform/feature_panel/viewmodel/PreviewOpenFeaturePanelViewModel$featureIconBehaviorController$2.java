package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3763i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewOpenFeaturePanelViewModel$featureIconBehaviorController$2 extends Lambda implements Function0<C3763i> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3777c this$0;

    static {
        Covode.recordClassIndex(21451);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewOpenFeaturePanelViewModel$featureIconBehaviorController$2(C3777c c3777c) {
        super(0);
        this.this$0 = c3777c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3763i mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3763i(this.this$0);
    }
}
