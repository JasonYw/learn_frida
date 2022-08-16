package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.C3760e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AbsOpenFeaturePanelViewModel$featureListHandler$2 extends Lambda implements Function0<C3760e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC3775a this$0;

    static {
        Covode.recordClassIndex(21445);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsOpenFeaturePanelViewModel$featureListHandler$2(AbstractC3775a abstractC3775a) {
        super(0);
        this.this$0 = abstractC3775a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3760e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC3775a abstractC3775a = this.this$0;
        return new C3760e(abstractC3775a, abstractC3775a.LJIIJJI());
    }
}
