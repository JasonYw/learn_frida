package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.profit.lottery.C5322ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C91513M3n;

/* loaded from: classes8.dex */
public final class LotteryIconModel$onCreate$1 extends Lambda implements Function1<C5322ad, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5337p this$0;

    static {
        Covode.recordClassIndex(33422);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryIconModel$onCreate$1(C5337p c5337p) {
        super(1);
        this.this$0 = c5337p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5322ad c5322ad) {
        C5322ad c5322ad2 = c5322ad;
        if (!PatchProxy.proxy(new Object[]{c5322ad2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5322ad2);
            C5337p c5337p = this.this$0;
            Disposable subscribe = c5337p.LIZIZ.subscribe(new Consumer<C5322ad.AbstractC5323a>() { // from class: com.bytedance.android.live.profit.lottery.LotteryIconModel$onCreate$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33423);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5322ad.AbstractC5323a abstractC5323a) {
                    if (!PatchProxy.proxy(new Object[]{abstractC5323a}, this, LIZ, false, 1).isSupported) {
                        C5337p c5337p2 = LotteryIconModel$onCreate$1.this.this$0;
                        Intrinsics.checkNotNullExpressionValue(abstractC5323a, "");
                        c5337p2.mo22922a_(abstractC5323a);
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            c5337p.LIZ(subscribe);
            C91513M3n.LIZIZ(c5322ad2.LIZLLL).subscribe(this.this$0.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
