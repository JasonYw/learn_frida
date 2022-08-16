package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.profit.lottery.AbstractC5315aa;
import com.bytedance.android.live.profit.lottery.C5322ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC449173pf;
import p003X.C106862S5w;
import p003X.C448893pD;
import p003X.C449043pS;
import p003X.C449063pU;
import p003X.C449073pV;
import p003X.C449083pW;
import p003X.C449163pe;
import p003X.C449593qL;
import p003X.C89718LWm;
import p003X.C91513M3n;
import p003X.QB4;

/* loaded from: classes12.dex */
public final class LotteryViewModel$1 extends Lambda implements Function1<C5342y, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C448893pD $lotteryContext;
    public final /* synthetic */ C5322ad this$0;

    static {
        Covode.recordClassIndex(33434);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryViewModel$1(C5322ad c5322ad, C448893pD c448893pD) {
        super(1);
        this.this$0 = c5322ad;
        this.$lotteryContext = c448893pD;
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.LotteryViewModel$1$1 */
    /* loaded from: classes12.dex */
    public static final class C53021<T, R> implements Function<AbstractC449173pf<? extends C5330h>, ObservableSource<? extends C5322ad.AbstractC5323a>> {
        public static ChangeQuickRedirect LIZ;
        public static final C53021 LIZIZ = new C53021();

        static {
            Covode.recordClassIndex(33435);
        }

        /* renamed from: com.bytedance.android.live.profit.lottery.LotteryViewModel$1$1$1 */
        /* loaded from: classes12.dex */
        public static final class C53031<T, R> implements Function<AbstractC5315aa, C5322ad.AbstractC5323a> {
            public static ChangeQuickRedirect LIZ;
            public static final C53031 LIZIZ = new C53031();

            static {
                Covode.recordClassIndex(33436);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.profit.lottery.ad$a] */
            @Override // io.reactivex.functions.Function
            public final /* synthetic */ C5322ad.AbstractC5323a apply(AbstractC5315aa abstractC5315aa) {
                AbstractC5315aa abstractC5315aa2 = abstractC5315aa;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5315aa2}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(abstractC5315aa2);
                if (abstractC5315aa2 instanceof AbstractC5315aa.C5321f) {
                    return new C449073pV(((AbstractC5315aa.C5321f) abstractC5315aa2).LIZIZ, false);
                }
                return C449083pW.LIZ;
            }
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [io.reactivex.ObservableSource<? extends com.bytedance.android.live.profit.lottery.ad$a>, java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public final /* synthetic */ ObservableSource<? extends C5322ad.AbstractC5323a> apply(AbstractC449173pf<? extends C5330h> abstractC449173pf) {
            AbstractC449173pf<? extends C5330h> abstractC449173pf2 = abstractC449173pf;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(abstractC449173pf2);
            if (abstractC449173pf2 instanceof C449163pe) {
                C5330h c5330h = (C5330h) ((C449163pe) abstractC449173pf2).LIZIZ;
                return c5330h.LIZIZ().map(C449043pS.LIZIZ).startWith((Observable<R>) c5330h.LIZ()).map(C53031.LIZIZ);
            }
            return Observable.just(C449083pW.LIZ);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5342y c5342y) {
        C5342y c5342y2 = c5342y;
        if (!PatchProxy.proxy(new Object[]{c5342y2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5342y2);
            QB4.LIZ(C91513M3n.LIZIZ(c5342y2.LIZLLL).switchMap(C53021.LIZIZ).subscribe(new Consumer<C5322ad.AbstractC5323a>() { // from class: com.bytedance.android.live.profit.lottery.LotteryViewModel$1.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33438);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5322ad.AbstractC5323a abstractC5323a) {
                    if (!PatchProxy.proxy(new Object[]{abstractC5323a}, this, LIZ, false, 1).isSupported) {
                        C89718LWm<C5322ad.AbstractC5323a> c89718LWm = LotteryViewModel$1.this.this$0.LIZJ;
                        Intrinsics.checkNotNullExpressionValue(abstractC5323a, "");
                        c89718LWm.LIZ(abstractC5323a);
                    }
                }
            }), this.this$0.LIZIZ);
            QB4.LIZ(c5342y2.LIZLLL.subscribe(new Consumer<AbstractC449173pf<? extends C5330h>>() { // from class: com.bytedance.android.live.profit.lottery.LotteryViewModel$1.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33439);
                }

                /* renamed from: com.bytedance.android.live.profit.lottery.LotteryViewModel$1$3$1 */
                /* loaded from: classes12.dex */
                public static final class C53061<T, R> implements Function<C5324ae, AbstractC5315aa> {
                    public static ChangeQuickRedirect LIZ;
                    public static final C53061 LIZIZ = new C53061();

                    static {
                        Covode.recordClassIndex(33440);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.profit.lottery.aa] */
                    @Override // io.reactivex.functions.Function
                    public final /* synthetic */ AbstractC5315aa apply(C5324ae c5324ae) {
                        C5324ae c5324ae2 = c5324ae;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5324ae2}, this, LIZ, false, 1);
                        if (proxy.isSupported) {
                            return proxy.result;
                        }
                        C106862S5w.LIZ(c5324ae2);
                        return c5324ae2.LIZLLL;
                    }
                }

                /* renamed from: com.bytedance.android.live.profit.lottery.LotteryViewModel$1$3$2 */
                /* loaded from: classes12.dex */
                public static final class C53072<T> implements Predicate<AbstractC5315aa> {
                    public static ChangeQuickRedirect LIZ;
                    public static final C53072 LIZIZ = new C53072();

                    static {
                        Covode.recordClassIndex(33441);
                    }

                    @Override // io.reactivex.functions.Predicate
                    public final /* synthetic */ boolean test(AbstractC5315aa abstractC5315aa) {
                        AbstractC5315aa abstractC5315aa2 = abstractC5315aa;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5315aa2}, this, LIZ, false, 1);
                        if (proxy.isSupported) {
                            return ((Boolean) proxy.result).booleanValue();
                        }
                        C106862S5w.LIZ(abstractC5315aa2);
                        return C449063pU.LIZ(abstractC5315aa2);
                    }
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC449173pf<? extends C5330h> abstractC449173pf) {
                    AbstractC449173pf<? extends C5330h> abstractC449173pf2 = abstractC449173pf;
                    if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                        Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                        C5330h c5330h = (C5330h) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
                        if (c5330h == null) {
                            return;
                        }
                        c5330h.LIZIZ().map(C53061.LIZIZ).startWith((Observable<R>) c5330h.LIZ()).filter(C53072.LIZIZ).take(1L).subscribe(new Consumer<AbstractC5315aa>() { // from class: com.bytedance.android.live.profit.lottery.LotteryViewModel.1.3.3
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(33442);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(AbstractC5315aa abstractC5315aa) {
                                AbstractC5315aa abstractC5315aa2 = abstractC5315aa;
                                if (!PatchProxy.proxy(new Object[]{abstractC5315aa2}, this, LIZ, false, 1).isSupported) {
                                    if (abstractC5315aa2 instanceof AbstractC5315aa.C5317b) {
                                        AbstractC5315aa.C5317b c5317b = (AbstractC5315aa.C5317b) abstractC5315aa2;
                                        if (!c5317b.LIZJ.LIZLLL && !c5317b.LIZJ.LIZIZ) {
                                            LotteryViewModel$1.this.$lotteryContext.LJFF().LIZ(Unit.INSTANCE);
                                        } else {
                                            LotteryViewModel$1.this.$lotteryContext.mo15615LJ().LIZ(abstractC5315aa2);
                                        }
                                    } else if (abstractC5315aa2 instanceof AbstractC5315aa.C5319d) {
                                        LotteryViewModel$1.this.$lotteryContext.LJIIIZ().LIZ(abstractC5315aa2);
                                    }
                                }
                            }
                        });
                    }
                }
            }), this.this$0.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
