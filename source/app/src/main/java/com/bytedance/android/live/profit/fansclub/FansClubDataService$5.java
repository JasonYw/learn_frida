package com.bytedance.android.live.profit.fansclub;

import com.bytedance.android.live.profit.fansclub.AbstractC5258g;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C458444Ba;

/* loaded from: classes12.dex */
public final /* synthetic */ class FansClubDataService$5 extends FunctionReferenceImpl implements Function1<AbstractC5258g.C5262j, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33261);
    }

    public FansClubDataService$5(C5257d c5257d) {
        super(1, c5257d, C5257d.class, "processSubscribeInfo", "processSubscribeInfo(Lcom/bytedance/android/live/profit/fansclub/FansClubEvent$SubscribeInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC5258g.C5262j c5262j) {
        AbstractC5365a m24858LJ;
        AbstractC5258g.C5262j c5262j2 = c5262j;
        if (!PatchProxy.proxy(new Object[]{c5262j2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5262j2);
            if (!PatchProxy.proxy(new Object[]{c5262j2}, this.receiver, C5257d.LIZ, false, 7).isSupported && (m24858LJ = C458444Ba.m24858LJ()) != null) {
                m24858LJ.LIZ(c5262j2.LIZ);
                m24858LJ.LIZ("im");
            }
        }
        return Unit.INSTANCE;
    }
}
