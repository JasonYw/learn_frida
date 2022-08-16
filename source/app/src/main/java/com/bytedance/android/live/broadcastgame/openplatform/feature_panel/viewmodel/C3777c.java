package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3742c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import p003X.AbstractC88220KpS;
import p003X.C77347GeT;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.c */
/* loaded from: classes5.dex */
public final class C3777c extends AbstractC3775a {
    public static ChangeQuickRedirect LJIILLIIL;
    public final Lazy LJIIZILJ = C77347GeT.LIZ(new PreviewOpenFeaturePanelViewModel$featureIconBehaviorController$2(this));
    public final Lazy LJIJ = C77347GeT.LIZ(PreviewOpenFeaturePanelViewModel$openFeatureFilter$2.INSTANCE);

    static {
        Covode.recordClassIndex(21460);
    }

    @Override // p003X.AbstractC88225KpX
    public final boolean LIZ() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a
    public final AbstractC3742c LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILLIIL, false, 1);
        return (AbstractC3742c) (proxy.isSupported ? proxy.result : this.LJIIZILJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a
    public final AbstractC88220KpS<C3380j, ?> LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILLIIL, false, 2);
        return (AbstractC88220KpS) (proxy.isSupported ? proxy.result : this.LJIJ.mo27335getValue());
    }
}
