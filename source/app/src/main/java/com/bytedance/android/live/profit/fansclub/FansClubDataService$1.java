package com.bytedance.android.live.profit.fansclub;

import com.bytedance.android.live.profit.fansclub.AbstractC5258g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C4BP;

/* loaded from: classes12.dex */
public final /* synthetic */ class FansClubDataService$1 extends FunctionReferenceImpl implements Function1<AbstractC5258g, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33257);
    }

    public FansClubDataService$1(C5257d c5257d) {
        super(1, c5257d, C5257d.class, "filterOthersEvent", "filterOthersEvent(Lcom/bytedance/android/live/profit/fansclub/FansClubEvent;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(AbstractC5258g abstractC5258g) {
        AbstractC5258g abstractC5258g2 = abstractC5258g;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5258g2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(abstractC5258g2);
            C5257d c5257d = (C5257d) this.receiver;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC5258g2}, c5257d, C5257d.LIZ, false, 3);
            if (proxy2.isSupported) {
                z = ((Boolean) proxy2.result).booleanValue();
            } else if (abstractC5258g2 instanceof AbstractC5258g.C5259a) {
                AbstractC5258g.C5259a c5259a = (AbstractC5258g.C5259a) abstractC5258g2;
                if (c5259a.LIZ.getId() == 0 || c5259a.LIZ.getId() != c5257d.LIZLLL.LIZIZ().LIZ().getId()) {
                    z = false;
                }
            } else if (abstractC5258g2 instanceof C4BP) {
                z = c5257d.LIZLLL.LJIILJJIL().LIZIZ().booleanValue();
            }
        }
        return Boolean.valueOf(z);
    }
}
