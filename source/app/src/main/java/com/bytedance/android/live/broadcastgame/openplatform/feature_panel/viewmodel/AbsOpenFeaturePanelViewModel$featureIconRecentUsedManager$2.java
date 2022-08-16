package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3758c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes28.dex */
public final class AbsOpenFeaturePanelViewModel$featureIconRecentUsedManager$2 extends Lambda implements Function0<C3758c> {
    public static final AbsOpenFeaturePanelViewModel$featureIconRecentUsedManager$2 INSTANCE = new AbsOpenFeaturePanelViewModel$featureIconRecentUsedManager$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21443);
    }

    public AbsOpenFeaturePanelViewModel$featureIconRecentUsedManager$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3758c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3758c();
    }
}
