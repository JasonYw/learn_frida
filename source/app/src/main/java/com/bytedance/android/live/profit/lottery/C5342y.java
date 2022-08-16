package com.bytedance.android.live.profit.lottery;

import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.profit.lottery.AbstractC5315aa;
import com.bytedance.android.live.profit.lottery.AbstractC5331i;
import com.bytedance.android.live.profit.lottery.C5328f;
import com.bytedance.android.live.profit.lottery.C5329g;
import com.bytedance.android.live.profit.lottery.C5330h;
import com.bytedance.android.live.profit.lottery.C5339t;
import com.bytedance.android.live.profit.lottery.C5342y;
import com.bytedance.android.live.profit.lottery.LotteryApi;
import com.bytedance.android.live.profit.lottery.ParticipateStatus;
import com.bytedance.android.live.profit.lottery.k$a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.log.C8646b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC414772bH;
import p003X.AbstractC449173pf;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C449283pq;
import p003X.C449343pw;
import p003X.C449413q3;
import p003X.C449443q6;
import p003X.C449523qE;
import p003X.C449533qF;
import p003X.C449543qG;
import p003X.C449593qL;
import p003X.C449633qP;
import p003X.C449813qh;
import p003X.C449833qj;
import p003X.C88306Kqq;
import p003X.C89718LWm;
import p003X.C91301Ly3;
import p003X.C91513M3n;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.profit.lottery.y */
/* loaded from: classes12.dex */
public final class C5342y extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC414772bH<AbstractC449173pf<C5330h>> LIZLLL;
    public final AbstractC414772bH<Boolean> LJFF;
    public final AbstractC414772bH<ParticipateStatus> LJII;
    public final BehaviorSubject<C5339t> LJIIIIZZ;
    public final PublishSubject<ParticipateStatus> LJIIIZ;
    public Function1<? super C5330h, Boolean> LJIIJ;
    public final C5923dp LJIIJJI;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final C89718LWm<AbstractC449173pf<C5330h>> LIZJ = new C89718LWm<>(C449813qh.LIZ, (Function2) null, 2);

    /* renamed from: LJ */
    public final C89718LWm<Boolean> f26569LJ = new C89718LWm<>(Boolean.FALSE, (Function2) null, 2);
    public final C89718LWm<ParticipateStatus> LJI = new C89718LWm<>(ParticipateStatus.NOTPARTICIPATED, (Function2) null, 2);

    static {
        Covode.recordClassIndex(33544);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ.dispose();
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && this.LJIIJJI.LJIILJJIL().LIZIZ().booleanValue()) {
            QB4.LIZ(C449443q6.LIZ(C449443q6.LIZJ, this.LJIIJJI.LIZ().LIZ().getId(), ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), 0, 0L, 12, null).subscribe(new Consumer<Boolean>() { // from class: X.3qA
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33570);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Boolean bool) {
                    Boolean bool2 = bool;
                    if (!PatchProxy.proxy(new Object[]{bool2}, this, LIZ, false, 1).isSupported) {
                        C89718LWm<Boolean> c89718LWm = C5342y.this.f26569LJ;
                        Intrinsics.checkNotNullExpressionValue(bool2, "");
                        c89718LWm.LIZ(bool2);
                        C449343pw.LIZ(C5342y.this.LJIIJJI, bool2.booleanValue());
                    }
                }
            }, new Consumer<Throwable>() { // from class: X.3qN
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33571);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        C5923dp c5923dp = C5342y.this.LJIIJJI;
                        Intrinsics.checkNotNullExpressionValue(th2, "");
                        C449343pw.LIZJ(c5923dp, th2);
                    }
                }
            }), this.LIZIZ);
        }
    }

    public final void LIZ(C5330h c5330h) {
        if (PatchProxy.proxy(new Object[]{c5330h}, this, LIZ, false, 2).isSupported) {
            return;
        }
        Function1<? super C5330h, Boolean> function1 = this.LJIIJ;
        if ((function1 == null || !function1.invoke(c5330h).booleanValue()) && (this.LIZJ.LIZ() instanceof C449813qh)) {
            this.LIZJ.LIZ(C449593qL.LIZ(c5330h));
        }
    }

    public C5342y(C5923dp c5923dp) {
        C106862S5w.LIZ(c5923dp);
        this.LJIIJJI = c5923dp;
        C89718LWm<AbstractC449173pf<C5330h>> c89718LWm = this.LIZJ;
        c89718LWm.LIZIZ();
        this.LIZLLL = c89718LWm;
        C89718LWm<Boolean> c89718LWm2 = this.f26569LJ;
        c89718LWm2.LIZIZ();
        this.LJFF = c89718LWm2;
        C89718LWm<ParticipateStatus> c89718LWm3 = this.LJI;
        c89718LWm3.LIZIZ();
        this.LJII = c89718LWm3;
        BehaviorSubject<C5339t> create = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.LJIIIIZZ = create;
        PublishSubject<ParticipateStatus> create2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "");
        this.LJIIIZ = create2;
        QB4.LIZ(this.LIZJ.subscribe(new Consumer<AbstractC449173pf<? extends C5330h>>() { // from class: X.3pi
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33545);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends C5330h> abstractC449173pf) {
                AbstractC449173pf<? extends C5330h> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    final C5342y c5342y = C5342y.this;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    final C5330h c5330h = (C5330h) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
                    if (!PatchProxy.proxy(new Object[]{c5330h}, c5342y, C5342y.LIZ, false, 3).isSupported) {
                        if (c5330h != null) {
                            Observable<T> doOnNext = c5330h.LIZIZ().map(C449093pX.LIZIZ).startWith(Observable.just(c5330h.LIZ())).doOnNext(new Consumer<AbstractC5315aa>() { // from class: X.3pc
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(33566);
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final /* synthetic */ void accept(AbstractC5315aa abstractC5315aa) {
                                    if (!PatchProxy.proxy(new Object[]{abstractC5315aa}, this, LIZ, false, 1).isSupported) {
                                        C2IN LIZIZ = C2IN.LIZIZ();
                                        LIZIZ.LIZ("ttlive_lottery", "onCurrentLotteryChanged lottery=" + c5330h.LIZJ + " state=" + abstractC5315aa + " currentLottery=" + C91513M3n.LIZ(C5342y.this.LIZLLL));
                                    }
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(doOnNext, "");
                            C91304Ly6 LIZ2 = C91301Ly3.LIZ(doOnNext);
                            QB4.LIZ(LIZ2.filter(C449053pT.LIZIZ).take(1L).subscribe(new Consumer<AbstractC5315aa>() { // from class: X.3ps
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(33560);
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final /* synthetic */ void accept(AbstractC5315aa abstractC5315aa) {
                                    if (!PatchProxy.proxy(new Object[]{abstractC5315aa}, this, LIZ, false, 1).isSupported && C91513M3n.LIZ((AbstractC414762bG<AbstractC449173pf<Object>>) C5342y.this.LIZJ) == c5330h) {
                                        C5342y.this.LIZJ.LIZ(C449813qh.LIZ);
                                        C5342y.this.LJI.LIZ(ParticipateStatus.NOTPARTICIPATED);
                                        C5342y.this.LJIIIIZZ.onNext(new C5339t(0L, CollectionsKt__CollectionsKt.emptyList(), ""));
                                    }
                                }
                            }), c5342y.LIZIZ);
                            QB4.LIZ(LIZ2.ofType(AbstractC5315aa.C5321f.class).take(1L).subscribe(new C449213pj(c5342y, c5330h)), c5342y.LIZIZ);
                            QB4.LIZ(LIZ2.ofType(AbstractC5315aa.C5316a.class).take(1L).subscribe(new Consumer<AbstractC5315aa.C5316a>() { // from class: X.3pu
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(33564);
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final /* synthetic */ void accept(AbstractC5315aa.C5316a c5316a) {
                                    Single<T> doOnEvent;
                                    if (!PatchProxy.proxy(new Object[]{c5316a}, this, LIZ, false, 1).isSupported) {
                                        final C5342y c5342y2 = C5342y.this;
                                        final C5330h c5330h2 = c5330h;
                                        if (!PatchProxy.proxy(new Object[]{c5330h2}, c5342y2, C5342y.LIZ, false, 9).isSupported) {
                                            final C8646b c8646b = new C8646b("ttlive_lottery", "handleLotteryDraw " + c5330h2.LIZJ);
                                            AbstractC5315aa LIZ3 = c5330h2.LIZ();
                                            if (!(LIZ3 instanceof AbstractC5315aa.C5316a)) {
                                                LIZ3 = null;
                                            }
                                            final AbstractC5315aa.C5316a c5316a2 = (AbstractC5315aa.C5316a) LIZ3;
                                            if (c5316a2 == null) {
                                                return;
                                            }
                                            if (!c5316a2.LIZIZ.LJFF) {
                                                c8646b.LIZIZ("begin");
                                                C449443q6 c449443q6 = C449443q6.LIZJ;
                                                long id = c5342y2.LJIIJJI.LIZ().LIZ().getId();
                                                long j = c5316a2.LIZIZ.LIZIZ;
                                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c449443q6, new Long(id), new Long(j), 0, 0L, 12, null}, null, C449443q6.LIZ, true, 7);
                                                if (proxy.isSupported) {
                                                    doOnEvent = (Single) proxy.result;
                                                } else {
                                                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{new Long(id), new Long(j), 10, new Long(1000L)}, c449443q6, C449443q6.LIZ, false, 6);
                                                    if (proxy2.isSupported) {
                                                        doOnEvent = (Single) proxy2.result;
                                                    } else {
                                                        final C8646b c8646b2 = new C8646b("ttlive_lottery", "fetchLotteryResult roomId=" + id + " lotteryId=" + j);
                                                        c8646b2.LIZIZ("start");
                                                        Observable doOnNext2 = ((LotteryApi) C88306Kqq.LIZ().LIZ(LotteryApi.class)).checkUserRight(id, j).map(C449373pz.LIZIZ).doOnNext(C449493qB.LIZIZ);
                                                        Intrinsics.checkNotNullExpressionValue(doOnNext2, "");
                                                        doOnEvent = QB4.LIZIZ(C91301Ly3.LIZ(doOnNext2, new C449833qj(10, 1000L, C449443q6.LIZIZ))).singleOrError().doOnEvent(new BiConsumer<k$a, Throwable>() { // from class: X.3qJ
                                                            public static ChangeQuickRedirect LIZ;

                                                            static {
                                                                Covode.recordClassIndex(33501);
                                                            }

                                                            @Override // io.reactivex.functions.BiConsumer
                                                            public final /* synthetic */ void accept(k$a k_a, Throwable th) {
                                                                Throwable th2 = th;
                                                                if (!PatchProxy.proxy(new Object[]{k_a, th2}, this, LIZ, false, 1).isSupported) {
                                                                    if (k_a != null) {
                                                                        C8646b.this.LIZJ("finish");
                                                                        return;
                                                                    }
                                                                    C8646b c8646b3 = C8646b.this;
                                                                    Intrinsics.checkNotNullExpressionValue(th2, "");
                                                                    c8646b3.LIZ(th2);
                                                                }
                                                            }
                                                        });
                                                        Intrinsics.checkNotNullExpressionValue(doOnEvent, "");
                                                    }
                                                }
                                                QB4.LIZ(doOnEvent.subscribe(new Consumer<k$a>() { // from class: X.3px
                                                    public static ChangeQuickRedirect LIZ;

                                                    static {
                                                        Covode.recordClassIndex(33552);
                                                    }

                                                    @Override // io.reactivex.functions.Consumer
                                                    public final /* synthetic */ void accept(k$a k_a) {
                                                        k$a k_a2 = k_a;
                                                        boolean z = true;
                                                        if (!PatchProxy.proxy(new Object[]{k_a2}, this, LIZ, false, 1).isSupported) {
                                                            boolean LIZ4 = k_a2.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
                                                            if (k_a2.LIZJ.f1033LJ == null) {
                                                                z = false;
                                                            }
                                                            C449123pa c449123pa = new C449123pa(LIZ4, z, C5342y.this.LJIIJJI.LJIILJJIL().LIZIZ().booleanValue(), k_a2.LIZIZ);
                                                            c5330h2.LIZ(new AbstractC5331i.C5335d(c449123pa));
                                                            c8646b.LIZJ(c449123pa.toString());
                                                            C449343pw.LIZ(C5342y.this.LJIIJJI, c5316a2.LIZIZ, c449123pa);
                                                        }
                                                    }
                                                }, new Consumer<Throwable>() { // from class: X.3q2
                                                    public static ChangeQuickRedirect LIZ;

                                                    static {
                                                        Covode.recordClassIndex(33553);
                                                    }

                                                    @Override // io.reactivex.functions.Consumer
                                                    public final /* synthetic */ void accept(Throwable th) {
                                                        Throwable th2 = th;
                                                        if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                                                            c5330h2.LIZ(AbstractC5331i.C5332a.LIZ);
                                                            C8646b c8646b3 = c8646b;
                                                            Intrinsics.checkNotNullExpressionValue(th2, "");
                                                            c8646b3.LIZ(th2);
                                                            C449343pw.LIZIZ(C5342y.this.LJIIJJI, th2);
                                                        }
                                                    }
                                                }), c5342y2.LIZIZ);
                                                return;
                                            }
                                            c8646b.LIZIZ("begin_v2");
                                            final boolean booleanValue = c5342y2.LJIIJJI.LJIILJJIL().LIZIZ().booleanValue();
                                            if (c5342y2.LJI.LIZ() != ParticipateStatus.NOTPARTICIPATED && !booleanValue) {
                                                QB4.LIZ(QB4.LIZ((long) JsBridgeDelegate.GET_URL_OUT_TIME, 1000L).takeUntil(c5342y2.LJIIIIZZ.filter(new Predicate<C5339t>() { // from class: X.3qK
                                                    public static ChangeQuickRedirect LIZ;

                                                    static {
                                                        Covode.recordClassIndex(33554);
                                                    }

                                                    @Override // io.reactivex.functions.Predicate
                                                    public final /* synthetic */ boolean test(C5339t c5339t) {
                                                        C5339t c5339t2 = c5339t;
                                                        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{c5339t2}, this, LIZ, false, 1);
                                                        if (proxy3.isSupported) {
                                                            return ((Boolean) proxy3.result).booleanValue();
                                                        }
                                                        C106862S5w.LIZ(c5339t2);
                                                        if (c5339t2.LIZIZ == AbstractC5315aa.C5316a.this.LIZIZ.LIZIZ) {
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                })).filter(C449733qZ.LIZIZ).take(1L).subscribe(new Consumer<Long>() { // from class: X.3pr
                                                    public static ChangeQuickRedirect LIZ;

                                                    static {
                                                        Covode.recordClassIndex(33556);
                                                    }

                                                    @Override // io.reactivex.functions.Consumer
                                                    public final /* synthetic */ void accept(Long l) {
                                                        if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                                                            C5342y.this.LIZ(c5316a2, c5330h2, 10, null);
                                                        }
                                                    }
                                                }), c5342y2.LIZIZ);
                                                QB4.LIZ(c5342y2.LJIIIIZZ.filter(new Predicate<C5339t>() { // from class: X.3pt
                                                    public static ChangeQuickRedirect LIZ;

                                                    static {
                                                        Covode.recordClassIndex(33557);
                                                    }

                                                    @Override // io.reactivex.functions.Predicate
                                                    public final /* synthetic */ boolean test(C5339t c5339t) {
                                                        C5339t c5339t2 = c5339t;
                                                        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{c5339t2}, this, LIZ, false, 1);
                                                        if (proxy3.isSupported) {
                                                            return ((Boolean) proxy3.result).booleanValue();
                                                        }
                                                        C106862S5w.LIZ(c5339t2);
                                                        if (c5339t2.LIZIZ == AbstractC5315aa.C5316a.this.LIZIZ.LIZIZ && (c5330h2.LIZ() instanceof AbstractC5315aa.C5316a)) {
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                }).subscribe(new Consumer<C5339t>() { // from class: X.3po
                                                    public static ChangeQuickRedirect LIZ;

                                                    static {
                                                        Covode.recordClassIndex(33558);
                                                    }

                                                    @Override // io.reactivex.functions.Consumer
                                                    public final /* synthetic */ void accept(C5339t c5339t) {
                                                        boolean z;
                                                        C5339t c5339t2 = c5339t;
                                                        if (!PatchProxy.proxy(new Object[]{c5339t2}, this, LIZ, false, 1).isSupported) {
                                                            long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
                                                            List<Long> list = c5339t2.LIZJ;
                                                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                                                Iterator<T> it = list.iterator();
                                                                while (it.hasNext()) {
                                                                    if (((Number) it.next()).longValue() == LIZIZ) {
                                                                        z = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z = false;
                                                            if (C5342y.this.LJI.LIZ() != ParticipateStatus.PARTICIPATEINSUCCESS && !z) {
                                                                C5342y.this.LIZ(c5316a2, c5330h2, 0, c5339t2);
                                                                return;
                                                            }
                                                            boolean z2 = booleanValue;
                                                            JsonObject jsonObject = new JsonObject();
                                                            jsonObject.add("rawRes", GsonProtectorUtils.toJsonTree(new Gson(), c5339t2));
                                                            c5330h2.LIZ(new AbstractC5331i.C5335d(new C449123pa(true, z, z2, jsonObject)));
                                                        }
                                                    }
                                                }), c5342y2.LIZIZ);
                                                return;
                                            }
                                            c5330h2.LIZ(new AbstractC5331i.C5335d(new C449123pa(false, false, booleanValue, new JsonObject())));
                                        }
                                    }
                                }
                            }), c5342y.LIZIZ);
                            LIZ2.LIZ();
                            return;
                        }
                        C2IN.LIZIZ().LIZ("ttlive_lottery", "onCurrentLotteryChanged lottery=null");
                    }
                }
            }
        }), this.LIZIZ);
        this.LJIIJJI.LJIILLIIL().LIZ(new LotteryRepository$2(this));
        QB4.LIZ(this.LJIIIZ.subscribe(new Consumer<ParticipateStatus>() { // from class: X.3pn
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33546);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(ParticipateStatus participateStatus) {
                if (!PatchProxy.proxy(new Object[]{participateStatus}, this, LIZ, false, 1).isSupported) {
                    C89718LWm<ParticipateStatus> c89718LWm4 = C5342y.this.LJI;
                    Intrinsics.checkNotNullExpressionValue(participateStatus, "");
                    c89718LWm4.LIZ(participateStatus);
                }
            }
        }), this.LIZIZ);
        LIZ();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            QB4.LIZ(C449443q6.LIZ(C449443q6.LIZJ, this.LJIIJJI.LIZ().LIZ().getId(), true, 0, 0L, LotteryApi.QueryFrom.ClientEnterRoom, 12, null).subscribe(new Consumer<AbstractC449173pf<? extends C5329g>>() { // from class: X.3py
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33550);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC449173pf<? extends C5329g> abstractC449173pf) {
                    AbstractC449173pf<? extends C5329g> abstractC449173pf2 = abstractC449173pf;
                    if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported && (C5342y.this.LIZJ.LIZ() instanceof C449813qh) && (abstractC449173pf2 instanceof C449163pe)) {
                        C449163pe c449163pe = (C449163pe) abstractC449173pf2;
                        C5342y.this.LIZ(new C5330h(new AbstractC5315aa.C5321f((C5329g) c449163pe.LIZIZ)));
                        C449343pw.LIZ(C5342y.this.LJIIJJI, (C5329g) c449163pe.LIZIZ);
                    }
                }
            }, new Consumer<Throwable>() { // from class: X.3qM
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33551);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        C5923dp c5923dp2 = C5342y.this.LJIIJJI;
                        Intrinsics.checkNotNullExpressionValue(th2, "");
                        C449343pw.LIZ(c5923dp2, th2);
                    }
                }
            }), this.LIZIZ);
        }
    }

    public final void LIZ(n$a n_a) {
        AbstractC5315aa abstractC5315aa;
        C5329g c5329g;
        if (PatchProxy.proxy(new Object[]{n_a}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C5330h c5330h = (C5330h) C91513M3n.LIZ(this.LIZLLL);
        C2IN.LIZIZ().LIZ("ttlive_lottery", "onLotteryEvent curLottery=" + c5330h + ", event=" + n_a);
        C5923dp c5923dp = this.LJIIJJI;
        if (!PatchProxy.proxy(new Object[]{c5923dp, n_a}, null, C449343pw.LIZ, true, 20).isSupported) {
            C106862S5w.LIZ(c5923dp, n_a);
            JSONObject jSONObject = new JSONObject();
            C449343pw.LIZ(jSONObject, c5923dp);
            C449343pw.LIZ(jSONObject, n_a.LIZ());
            if (n_a instanceof C449543qG) {
                C449343pw.LIZ(jSONObject, "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_ONGOING.statusMsg);
                C449343pw.LIZ("ttlive_lottery_from_im_status", "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_ONGOING.statusMsg, jSONObject);
            } else if (n_a instanceof C449533qF) {
                C449343pw.LIZ(jSONObject, "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_FINISHED.statusMsg);
                C449343pw.LIZ("ttlive_lottery_from_im_status", "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_FINISHED.statusMsg, jSONObject);
            } else if (n_a instanceof C449413q3) {
                C449343pw.LIZ(jSONObject, "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_REJECTED.statusMsg);
                C449343pw.LIZ(jSONObject, "lottery_reject_info_reason", ((C449413q3) n_a).LIZIZ.LIZJ);
                C449343pw.LIZ("ttlive_lottery_from_im_status", "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_REJECTED.statusMsg, jSONObject);
            } else if (n_a instanceof C449523qE) {
                C449343pw.LIZ(jSONObject, "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_CANCELED.statusMsg);
                C449343pw.LIZ("ttlive_lottery_from_im_status", "lottery_from_im_status", LotteryFromIMStatus.LOTTERY_CANCELED.statusMsg, jSONObject);
            }
        }
        if (n_a instanceof C449543qG) {
            if (c5330h == null) {
                LIZ(new C5330h(new AbstractC5315aa.C5321f(n_a.LIZ())));
            } else {
                c5330h.LIZ(new AbstractC5331i.C5333b(n_a.LIZ()));
            }
        } else if (n_a instanceof C449533qF) {
            if (c5330h != null) {
                abstractC5315aa = c5330h.LIZ();
            } else {
                abstractC5315aa = null;
            }
            if (!(abstractC5315aa instanceof AbstractC5315aa.C5321f)) {
                abstractC5315aa = null;
            }
            AbstractC5315aa.C5321f c5321f = (AbstractC5315aa.C5321f) abstractC5315aa;
            if (c5321f != null && (c5329g = c5321f.LIZIZ) != null && c5329g.LIZIZ == n_a.LIZ().LIZIZ) {
                c5330h.LIZ(AbstractC5331i.C5334c.LIZ);
            }
        } else if (n_a instanceof C449413q3) {
            if (c5330h == null) {
                LIZ(new C5330h(new AbstractC5315aa.C5319d(((C449413q3) n_a).LIZIZ)));
            } else {
                c5330h.LIZ(new AbstractC5331i.C5336e(((C449413q3) n_a).LIZIZ));
            }
        } else if ((n_a instanceof C449523qE) && c5330h != null) {
            c5330h.LIZ(AbstractC5331i.C5332a.LIZ);
        }
    }

    public final void LIZ(final AbstractC5315aa abstractC5315aa, final C5330h c5330h, int i, final C5339t c5339t) {
        Single doOnEvent;
        if (PatchProxy.proxy(new Object[]{abstractC5315aa, c5330h, Integer.valueOf(i), c5339t}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5315aa, c5330h);
        if (abstractC5315aa instanceof AbstractC5315aa.C5316a) {
            C449443q6 c449443q6 = C449443q6.LIZJ;
            final long j = ((AbstractC5315aa.C5316a) abstractC5315aa).LIZIZ.LIZIZ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c449443q6, new Long(j), Integer.valueOf(i), 0L, 4, null}, null, C449443q6.LIZ, true, 13);
            if (proxy.isSupported) {
                doOnEvent = (Single) proxy.result;
            } else {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), new Long(1000L)}, c449443q6, C449443q6.LIZ, false, 12);
                if (proxy2.isSupported) {
                    doOnEvent = (Single) proxy2.result;
                } else {
                    final C8646b c8646b = new C8646b("ttlive_lottery", "checkCandidadteState lotterId=" + j);
                    c8646b.LIZIZ("begin");
                    Observable<R> map = ((LotteryApi) C88306Kqq.LIZ().LIZ(LotteryApi.class)).getCandidateState(j).map(C449283pq.LIZIZ);
                    Intrinsics.checkNotNullExpressionValue(map, "");
                    doOnEvent = QB4.LIZIZ(C91301Ly3.LIZ(map, new C449833qj(i, 1000L, new C449633qP() { // from class: X.3qO
                        public static ChangeQuickRedirect LIZIZ;

                        static {
                            Covode.recordClassIndex(33495);
                        }

                        @Override // p003X.C449633qP
                        public final boolean LIZ(Throwable th, int i2) {
                            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{th, Integer.valueOf(i2)}, this, LIZIZ, false, 1);
                            if (proxy3.isSupported) {
                                return ((Boolean) proxy3.result).booleanValue();
                            }
                            PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{th}, C449443q6.LIZJ, C449443q6.LIZ, false, 1);
                            if (!proxy4.isSupported ? th == null || (C442083eE.LIZIZ(th) != 10001 && C442083eE.LIZIZ(th) != 10002 && !Intrinsics.areEqual(C442083eE.LIZ(th), LoggerUtil.UNKNOWN)) : !((Boolean) proxy4.result).booleanValue()) {
                                return true;
                            }
                            return super.LIZ(th, i2);
                        }
                    }))).singleOrError().doOnEvent(new BiConsumer<C5328f, Throwable>() { // from class: X.3q4
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(33496);
                        }

                        @Override // io.reactivex.functions.BiConsumer
                        public final /* synthetic */ void accept(C5328f c5328f, Throwable th) {
                            Throwable th2 = th;
                            if (!PatchProxy.proxy(new Object[]{c5328f, th2}, this, LIZ, false, 1).isSupported) {
                                if (c5328f != null) {
                                    C8646b c8646b2 = C8646b.this;
                                    c8646b2.LIZIZ("lotteryId=" + j);
                                    return;
                                }
                                C8646b c8646b3 = C8646b.this;
                                Intrinsics.checkNotNullExpressionValue(th2, "");
                                c8646b3.LIZ(th2);
                            }
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(doOnEvent, "");
                }
            }
            QB4.LIZ(doOnEvent.filter(new Predicate<C5328f>() { // from class: X.3pm
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33567);
                }

                @Override // io.reactivex.functions.Predicate
                public final /* synthetic */ boolean test(C5328f c5328f) {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{c5328f}, this, LIZ, false, 1);
                    if (proxy3.isSupported) {
                        return ((Boolean) proxy3.result).booleanValue();
                    }
                    C106862S5w.LIZ(c5328f);
                    if (C5342y.this.LJI.LIZ() == ParticipateStatus.PARTICIPATED || C5342y.this.LJI.LIZ() == ParticipateStatus.PARTICIPATEINSUCCESS) {
                        return true;
                    }
                    return false;
                }
            }).LIZ(new Consumer<C5328f>() { // from class: X.3pp
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33568);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5328f c5328f) {
                    boolean z;
                    C5328f c5328f2 = c5328f;
                    boolean z2 = true;
                    if (!PatchProxy.proxy(new Object[]{c5328f2}, this, LIZ, false, 1).isSupported) {
                        C5342y.this.LJI.LIZ(c5328f2.LIZIZ);
                        if (c5328f2.LIZIZ != ParticipateStatus.PARTICIPATEINSUCCESS && c5328f2.LIZIZ != ParticipateStatus.ISLUCKY) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (c5328f2.LIZIZ != ParticipateStatus.ISLUCKY) {
                            z2 = false;
                        }
                        boolean booleanValue = C5342y.this.LJIIJJI.LJIILJJIL().LIZIZ().booleanValue();
                        JsonObject jsonObject = new JsonObject();
                        Gson gson = new Gson();
                        Object obj = c5339t;
                        if (obj == null) {
                            obj = "";
                        }
                        jsonObject.add("rawRes", GsonProtectorUtils.toJsonTree(gson, obj));
                        c5330h.LIZ(new AbstractC5331i.C5335d(new C449123pa(z, z2, booleanValue, jsonObject)));
                    }
                }
            }, new Consumer<Throwable>() { // from class: X.3ph
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33569);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                        int i2 = ((AbstractC5315aa.C5316a) AbstractC5315aa.this).LIZIZ.f26567LJ;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 4) {
                                    C88440Kt0.LIZ(2131586210, 1);
                                }
                            } else {
                                C88440Kt0.LIZ(2131586210, 1);
                            }
                        } else {
                            C88440Kt0.LIZ(2131586209, 1);
                        }
                        c5330h.LIZ(AbstractC5331i.C5332a.LIZ);
                    }
                }
            }), this.LIZIZ);
        }
    }
}
