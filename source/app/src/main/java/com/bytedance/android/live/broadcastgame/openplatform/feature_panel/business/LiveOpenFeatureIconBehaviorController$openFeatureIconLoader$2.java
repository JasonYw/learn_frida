package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3756b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LiveOpenFeatureIconBehaviorController$openFeatureIconLoader$2 extends Lambda implements Function0<C3756b.C3757b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3756b this$0;

    static {
        Covode.recordClassIndex(21314);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveOpenFeatureIconBehaviorController$openFeatureIconLoader$2(C3756b c3756b) {
        super(0);
        this.this$0 = c3756b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.b$b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3756b.C3757b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3756b.C3757b();
    }
}
