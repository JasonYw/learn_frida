package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.PreviewOpenFeatureIconBehaviorController$previewToolbarBehaviorProvider$2 */
/* loaded from: classes5.dex */
public final class C3755x3c81721d extends Lambda implements Function0<C3764j> {
    public static final C3755x3c81721d INSTANCE = new C3755x3c81721d();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21328);
    }

    public C3755x3c81721d() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3764j mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3764j(null, 1);
    }
}
