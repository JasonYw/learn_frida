package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3756b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LiveOpenFeaturePanelViewModel$featureIconBehaviorController$2 extends Lambda implements Function0<C3756b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3776b this$0;

    static {
        Covode.recordClassIndex(21449);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveOpenFeaturePanelViewModel$featureIconBehaviorController$2(C3776b c3776b) {
        super(0);
        this.this$0 = c3776b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3756b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3756b(this.this$0);
    }
}
