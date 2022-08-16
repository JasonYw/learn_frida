package com.bytedance.android.live.profit.fansclub.panel;

import com.bytedance.android.live.profit.fansclub.FansClubEntranceParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC458264Ai;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class FansClubPanelService$createPanel$availableFactories$1 extends Lambda implements Function1<AbstractC458264Ai<?>, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $panelType;
    public final /* synthetic */ FansClubEntranceParams $params;

    static {
        Covode.recordClassIndex(33302);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubPanelService$createPanel$availableFactories$1(int i, FansClubEntranceParams fansClubEntranceParams) {
        super(1);
        this.$panelType = i;
        this.$params = fansClubEntranceParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(AbstractC458264Ai<?> abstractC458264Ai) {
        boolean LIZ;
        AbstractC458264Ai<?> abstractC458264Ai2 = abstractC458264Ai;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC458264Ai2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(abstractC458264Ai2);
            LIZ = abstractC458264Ai2.LIZ(this.$panelType, this.$params);
        }
        return Boolean.valueOf(LIZ);
    }
}
