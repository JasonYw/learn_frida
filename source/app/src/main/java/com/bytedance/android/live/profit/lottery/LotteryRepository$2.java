package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.profit.lottery.AbstractC5315aa;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C449683qU;
import p003X.C91513M3n;
import p003X.QB4;

/* loaded from: classes12.dex */
public final class LotteryRepository$2 extends Lambda implements Function1<IMessageManager, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5342y this$0;

    static {
        Covode.recordClassIndex(33427);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryRepository$2(C5342y c5342y) {
        super(1);
        this.this$0 = c5342y;
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.LotteryRepository$2$1 */
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class C52991 extends FunctionReferenceImpl implements Function1<n$a, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33428);
        }

        public C52991(C5342y c5342y) {
            super(1, c5342y, C5342y.class, "onLotteryEvent", "onLotteryEvent(Lcom/bytedance/android/live/profit/lottery/LotteryIMDataSource$LocalLotteryEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(n$a n_a) {
            n$a n_a2 = n_a;
            if (!PatchProxy.proxy(new Object[]{n_a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(n_a2);
                ((C5342y) this.receiver).LIZ(n_a2);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.LotteryRepository$2$2 */
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class C53002 extends FunctionReferenceImpl implements Function1<C5340u, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33429);
        }

        public C53002(C5342y c5342y) {
            super(1, c5342y, C5342y.class, "onLotteryParticipateSuccessEvent", "onLotteryParticipateSuccessEvent(Lcom/bytedance/android/live/profit/lottery/LotteryParticipateSuccessInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C5340u c5340u) {
            AbstractC5315aa abstractC5315aa;
            C5329g c5329g;
            C5340u c5340u2 = c5340u;
            if (!PatchProxy.proxy(new Object[]{c5340u2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c5340u2);
                C5342y c5342y = (C5342y) this.receiver;
                if (!PatchProxy.proxy(new Object[]{c5340u2}, c5342y, C5342y.LIZ, false, 10).isSupported) {
                    C5330h c5330h = (C5330h) C91513M3n.LIZ(c5342y.LIZLLL);
                    if (c5330h != null) {
                        abstractC5315aa = c5330h.LIZ();
                    } else {
                        abstractC5315aa = null;
                    }
                    if (!(abstractC5315aa instanceof AbstractC5315aa.C5321f)) {
                        abstractC5315aa = null;
                    }
                    AbstractC5315aa.C5321f c5321f = (AbstractC5315aa.C5321f) abstractC5315aa;
                    if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() == c5340u2.LIZJ && c5321f != null && (c5329g = c5321f.LIZIZ) != null && c5329g.LIZIZ == c5340u2.LIZIZ) {
                        c5342y.LJI.LIZ(ParticipateStatus.PARTICIPATEINSUCCESS);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IMessageManager iMessageManager) {
        IMessageManager iMessageManager2 = iMessageManager;
        if (!PatchProxy.proxy(new Object[]{iMessageManager2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iMessageManager2);
            Observable<n$a> observable = new C449683qU(iMessageManager2, this.this$0.LIZIZ).LIZJ;
            final C52991 c52991 = new C52991(this.this$0);
            QB4.LIZ(observable.subscribe(new Consumer() { // from class: X.3qe
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33572);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
                }
            }), this.this$0.LIZIZ);
            Observable<C5340u> observable2 = new C449683qU(iMessageManager2, this.this$0.LIZIZ).f1032LJ;
            final C53002 c53002 = new C53002(this.this$0);
            QB4.LIZ(observable2.subscribe(new Consumer() { // from class: X.3qe
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33572);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
                }
            }), this.this$0.LIZIZ);
            QB4.LIZ(new C449683qU(iMessageManager2, this.this$0.LIZIZ).LJI.subscribe(new Consumer<C5339t>() { // from class: com.bytedance.android.live.profit.lottery.LotteryRepository$2.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33430);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5339t c5339t) {
                    if (!PatchProxy.proxy(new Object[]{c5339t}, this, LIZ, false, 1).isSupported) {
                        LotteryRepository$2.this.this$0.LJIIIIZZ.onNext(c5339t);
                    }
                }
            }), this.this$0.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
