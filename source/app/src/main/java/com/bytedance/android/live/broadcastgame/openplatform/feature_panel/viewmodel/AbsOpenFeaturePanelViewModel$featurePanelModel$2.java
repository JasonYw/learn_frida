package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model.C3768a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AbsOpenFeaturePanelViewModel$featurePanelModel$2 extends Lambda implements Function0<C3768a> {
    public static final AbsOpenFeaturePanelViewModel$featurePanelModel$2 INSTANCE = new AbsOpenFeaturePanelViewModel$featurePanelModel$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21446);
    }

    public AbsOpenFeaturePanelViewModel$featurePanelModel$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.model.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3768a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3768a();
    }
}
