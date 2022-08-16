package com.bytedance.android.live.profit.fansclub.panel;

import com.bytedance.android.live.profit.fansclub.AbstractC5268p;
import com.bytedance.android.live.profit.fansclub.FansClubEntranceParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC458264Ai;
import p003X.C106862S5w;
import p003X.C458214Ad;

/* loaded from: classes12.dex */
public final class FansClubPanelService$createPanel$3 extends Lambda implements Function1<AbstractC458264Ai<?>, AbstractC5268p> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $panelType;
    public final /* synthetic */ FansClubEntranceParams $params;
    public final /* synthetic */ C458214Ad this$0;

    static {
        Covode.recordClassIndex(33301);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubPanelService$createPanel$3(C458214Ad c458214Ad, int i, FansClubEntranceParams fansClubEntranceParams) {
        super(1);
        this.this$0 = c458214Ad;
        this.$panelType = i;
        this.$params = fansClubEntranceParams;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.bytedance.android.live.profit.fansclub.p] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ AbstractC5268p invoke(AbstractC458264Ai<?> abstractC458264Ai) {
        AbstractC458264Ai<?> abstractC458264Ai2 = abstractC458264Ai;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC458264Ai2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(abstractC458264Ai2);
        Object LIZIZ = abstractC458264Ai2.LIZIZ(this.$panelType, this.$params);
        for (AbstractC5270g abstractC5270g : this.this$0.LIZIZ) {
            abstractC5270g.LIZ(this.$panelType, this.$params, LIZIZ);
        }
        return abstractC458264Ai2.LIZ(this.$panelType, this.$params, LIZIZ);
    }
}
