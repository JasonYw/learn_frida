package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.profit.lottery.C5322ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C449073pV;
import p003X.QBJ;
import p003X.QBM;

/* loaded from: classes8.dex */
public final class LotteryIconModel$stateBuffer$1 extends Lambda implements Function2<QBJ<C5322ad.AbstractC5323a>, C5322ad.AbstractC5323a, Unit> {
    public static final LotteryIconModel$stateBuffer$1 INSTANCE = new LotteryIconModel$stateBuffer$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33424);
    }

    public LotteryIconModel$stateBuffer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(QBJ<C5322ad.AbstractC5323a> qbj, C5322ad.AbstractC5323a abstractC5323a) {
        QBJ<C5322ad.AbstractC5323a> qbj2 = qbj;
        C5322ad.AbstractC5323a abstractC5323a2 = abstractC5323a;
        if (!PatchProxy.proxy(new Object[]{qbj2, abstractC5323a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(qbj2, abstractC5323a2);
            if ((abstractC5323a2 instanceof C449073pV) && ((C449073pV) abstractC5323a2).LIZJ) {
                qbj2.LIZ(new QBM());
            }
        }
        return Unit.INSTANCE;
    }
}
