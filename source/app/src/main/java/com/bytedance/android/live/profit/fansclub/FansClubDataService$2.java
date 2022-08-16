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
public final /* synthetic */ class FansClubDataService$2 extends FunctionReferenceImpl implements Function1<AbstractC5258g.C5259a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33258);
    }

    public FansClubDataService$2(C5257d c5257d) {
        super(1, c5257d, C5257d.class, "processFansClubMessage", "processFansClubMessage(Lcom/bytedance/android/live/profit/fansclub/FansClubEvent$FansClubMessageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC5258g.C5259a c5259a) {
        AbstractC5258g.C5259a c5259a2 = c5259a;
        if (!PatchProxy.proxy(new Object[]{c5259a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5259a2);
            C5257d c5257d = (C5257d) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c5259a2}, c5257d, C5257d.LIZ, false, 4).isSupported) {
                c5257d.f26559LJ.LIZ(c5259a2.LIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
