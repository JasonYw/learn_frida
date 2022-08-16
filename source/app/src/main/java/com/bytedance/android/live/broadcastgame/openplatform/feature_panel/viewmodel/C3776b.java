package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.p286d.C3355o;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3742c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88150KoK;
import p003X.AbstractC88220KpS;
import p003X.C106862S5w;
import p003X.C77347GeT;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.b */
/* loaded from: classes5.dex */
public final class C3776b extends AbstractC3775a implements Observer<KVData> {
    public static ChangeQuickRedirect LJIILLIIL;
    public AbstractC88150KoK LJIIZILJ;
    public boolean LJIJ;
    public final Lazy LJIJI = C77347GeT.LIZ(new LiveOpenFeaturePanelViewModel$featureIconBehaviorController$2(this));
    public final Lazy LJIJJ = C77347GeT.LIZ(LiveOpenFeaturePanelViewModel$openFeatureFilter$2.INSTANCE);

    static {
        Covode.recordClassIndex(21459);
    }

    @Override // p003X.AbstractC88225KpX
    public final boolean LIZ() {
        return true;
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a
    public final AbstractC3742c LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILLIIL, false, 1);
        return (AbstractC3742c) (proxy.isSupported ? proxy.result : this.LJIJI.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a
    public final AbstractC88220KpS<C3380j, ?> LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILLIIL, false, 2);
        return (AbstractC88220KpS) (proxy.isSupported ? proxy.result : this.LJIJJ.mo27335getValue());
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LJIILLIIL, false, 5).isSupported) {
            String str2 = null;
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, "data_link_state")) {
                if (kVData2 != null) {
                    str2 = kVData2.getKey();
                }
                if (!Intrinsics.areEqual(str2, "data_join_channel_finished")) {
                    return;
                }
            }
            LJIIL().LJFF();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a
    public final void LIZ(List<List<C3355o>> list, List<String> list2, List<List<C3355o>> list3, List<String> list4, boolean z) {
        if (PatchProxy.proxy(new Object[]{list, list2, list3, list4, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIILLIIL, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, list2, list3, list4);
        AbstractC88150KoK abstractC88150KoK = this.LJIIZILJ;
        if (abstractC88150KoK != null) {
            abstractC88150KoK.LJI();
        }
        super.LIZ(list, list2, list3, list4, z);
    }
}
