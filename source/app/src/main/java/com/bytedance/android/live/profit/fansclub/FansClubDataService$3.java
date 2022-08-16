package com.bytedance.android.live.profit.fansclub;

import com.bytedance.android.live.profit.fansclub.AbstractC5258g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final /* synthetic */ class FansClubDataService$3 extends FunctionReferenceImpl implements Function1<AbstractC5258g.C5261i, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33259);
    }

    public FansClubDataService$3(C5257d c5257d) {
        super(1, c5257d, C5257d.class, "processFansClubStatistic", "processFansClubStatistic(Lcom/bytedance/android/live/profit/fansclub/FansClubEvent$Stats;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC5258g.C5261i c5261i) {
        AbstractC5258g.C5261i c5261i2 = c5261i;
        if (!PatchProxy.proxy(new Object[]{c5261i2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5261i2);
            C5257d c5257d = (C5257d) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c5261i2}, c5257d, C5257d.LIZ, false, 5).isSupported) {
                c5257d.f26559LJ.LIZ(new C5273r(c5261i2.LIZ, (int) c5261i2.LIZIZ, c5257d.f26559LJ.LIZLLL().LIZ().LIZIZ, c5257d.f26559LJ.LIZLLL().LIZ().LIZJ));
            }
        }
        return Unit.INSTANCE;
    }
}
