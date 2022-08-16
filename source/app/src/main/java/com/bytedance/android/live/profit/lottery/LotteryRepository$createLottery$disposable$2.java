package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.profit.lottery.AbstractC5331i;
import com.bytedance.android.livesdk.log.C8646b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC414762bG;
import p003X.AbstractC449173pf;
import p003X.C449653qR;
import p003X.C449663qS;
import p003X.C449793qf;
import p003X.C91513M3n;

/* loaded from: classes12.dex */
public final class LotteryRepository$createLottery$disposable$2 extends Lambda implements Function1<k$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5330h $curLottery;
    public final /* synthetic */ C8646b $logCtx;
    public final /* synthetic */ C5342y this$0;

    static {
        Covode.recordClassIndex(33431);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryRepository$createLottery$disposable$2(C5342y c5342y, C8646b c8646b, C5330h c5330h) {
        super(1);
        this.this$0 = c5342y;
        this.$logCtx = c8646b;
        this.$curLottery = c5330h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(k$b k_b) {
        k$b k_b2 = k_b;
        if (!PatchProxy.proxy(new Object[]{k_b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C8646b c8646b = this.$logCtx;
            c8646b.LIZIZ("apply review result: " + k_b2);
            Object LIZ = C91513M3n.LIZ((AbstractC414762bG<AbstractC449173pf<Object>>) this.this$0.LIZJ);
            C5330h c5330h = this.$curLottery;
            if (LIZ == c5330h) {
                if (k_b2 instanceof C449653qR) {
                    c5330h.LIZ(new AbstractC5331i.C5333b(((C449653qR) k_b2).LIZIZ));
                } else if (k_b2 instanceof C449663qS) {
                    c5330h.LIZ(new AbstractC5331i.C5336e(((C449663qS) k_b2).LIZIZ));
                } else if (k_b2 instanceof C449793qf) {
                    c5330h.LIZ(AbstractC5331i.C5332a.LIZ);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
