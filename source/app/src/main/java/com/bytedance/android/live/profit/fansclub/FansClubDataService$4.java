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
public final /* synthetic */ class FansClubDataService$4 extends FunctionReferenceImpl implements Function1<AbstractC5258g.C5260h, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33260);
    }

    public FansClubDataService$4(C5257d c5257d) {
        super(1, c5257d, C5257d.class, "processFansReview", "processFansReview(Lcom/bytedance/android/live/profit/fansclub/FansClubEvent$ReviewSuccess;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC5258g.C5260h c5260h) {
        XTFansClubStatus xTFansClubStatus;
        AbstractC5258g.C5260h c5260h2 = c5260h;
        if (!PatchProxy.proxy(new Object[]{c5260h2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5260h2);
            C5257d c5257d = (C5257d) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c5260h2}, c5257d, C5257d.LIZ, false, 6).isSupported) {
                int i = c5257d.f26559LJ.LIZLLL().LIZ().LIZ;
                boolean z = c5257d.f26559LJ.LIZLLL().LIZ().LIZJ;
                AbstractC5272q abstractC5272q = c5257d.f26559LJ;
                String str = c5260h2.LIZ;
                int i2 = XTFansClubStatus.Created.value;
                if (i2 != XTFansClubStatus.Default.value) {
                    if (i2 == XTFansClubStatus.NotCreate.value) {
                        xTFansClubStatus = XTFansClubStatus.NotCreate;
                    } else if (i2 == XTFansClubStatus.Review.value) {
                        xTFansClubStatus = XTFansClubStatus.Review;
                    } else if (i2 == XTFansClubStatus.Created.value) {
                        xTFansClubStatus = XTFansClubStatus.Created;
                    }
                    abstractC5272q.LIZ(new C5273r(str, i, xTFansClubStatus, z));
                }
                xTFansClubStatus = XTFansClubStatus.Default;
                abstractC5272q.LIZ(new C5273r(str, i, xTFansClubStatus, z));
            }
        }
        return Unit.INSTANCE;
    }
}
