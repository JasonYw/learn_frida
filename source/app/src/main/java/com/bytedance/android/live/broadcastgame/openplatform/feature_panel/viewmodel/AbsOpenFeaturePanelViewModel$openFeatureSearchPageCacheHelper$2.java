package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3762g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AbsOpenFeaturePanelViewModel$openFeatureSearchPageCacheHelper$2 extends Lambda implements Function0<C3762g> {
    public static final AbsOpenFeaturePanelViewModel$openFeatureSearchPageCacheHelper$2 INSTANCE = new AbsOpenFeaturePanelViewModel$openFeatureSearchPageCacheHelper$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21448);
    }

    public AbsOpenFeaturePanelViewModel$openFeatureSearchPageCacheHelper$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.g] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3762g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3762g();
    }
}
