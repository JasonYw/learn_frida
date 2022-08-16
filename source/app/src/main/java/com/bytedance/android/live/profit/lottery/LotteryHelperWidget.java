package com.bytedance.android.live.profit.lottery;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.container.HybridDialog;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.profit.C5280j;
import com.bytedance.android.live.profit.lottery.AbstractC5309a;
import com.bytedance.android.live.profit.lottery.AbstractC5315aa;
import com.bytedance.android.live.profit.lottery.AbstractC5325b;
import com.bytedance.android.live.profit.lottery.C5324ae;
import com.bytedance.android.live.profit.lottery.C5330h;
import com.bytedance.android.live.profit.lottery.C5342y;
import com.bytedance.android.live.profit.lottery.LotteryApi;
import com.bytedance.android.live.profit.lottery.LotteryHelperWidget;
import com.bytedance.android.live.profit.lottery.LotteryRepository$createLottery$disposable$2;
import com.bytedance.android.live.profit.lottery.ParticipateStatus;
import com.bytedance.android.live.profit.lottery.k$b;
import com.bytedance.android.live.profit.lottery.plugin.RoomParamsLotteryPlugin$appendUrlParams$1;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ExtendedToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.dynamic.C6514m;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.live.model.C8451e;
import com.bytedance.android.livesdk.log.C8646b;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.reddot.C9225a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC414772bH;
import p003X.AbstractC449173pf;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C413202Xa;
import p003X.C420672kn;
import p003X.C426152td;
import p003X.C426182tg;
import p003X.C427732wB;
import p003X.C436773Pr;
import p003X.C448063ns;
import p003X.C448893pD;
import p003X.C448993pN;
import p003X.C91513M3n;
import p003X.QB4;
import p003X.QVQ;

/* loaded from: classes12.dex */
public final class LotteryHelperWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C448893pD LIZIZ;
    public Disposable LIZJ;
    public final C5923dp LIZLLL;
    public C448063ns LJFF;
    public final C5280j LJII;

    /* renamed from: LJ */
    public final CompositeDisposable f26565LJ = new CompositeDisposable();
    public Observer<KVData> LJI = new Observer<KVData>() { // from class: X.3pK
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(33410);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(KVData kVData) {
            C5342y LIZIZ;
            if (!PatchProxy.proxy(new Object[]{kVData}, this, LIZ, false, 1).isSupported && (LIZIZ = LotteryHelperWidget.LIZ(LotteryHelperWidget.this).LJI().LIZIZ()) != null) {
                LIZIZ.LIZ();
            }
        }
    };

    static {
        Covode.recordClassIndex(33406);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        this.f26565LJ.dispose();
        this.LIZJ.dispose();
        this.dataCenter.removeObserver(this.LJI);
        AbstractC6524y m24985LJ = C413202Xa.m24985LJ();
        ExtendedToolbarButton.C6483b LIZ2 = ExtendedToolbarButton.LJIILJJIL.LIZ(ToolbarButton.LOTTERY);
        C448063ns c448063ns = this.LJFF;
        Intrinsics.checkNotNull(c448063ns);
        m24985LJ.LIZIZ(LIZ2, c448063ns);
    }

    public final AbstractC5315aa LIZ() {
        AbstractC414772bH<AbstractC449173pf<C5330h>> abstractC414772bH;
        C5330h c5330h;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC5315aa) proxy.result;
        }
        C448893pD c448893pD = this.LIZIZ;
        if (c448893pD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C5342y LIZIZ = c448893pD.LJI().LIZIZ();
        if (LIZIZ != null && (abstractC414772bH = LIZIZ.LIZLLL) != null && (c5330h = (C5330h) C91513M3n.LIZ(abstractC414772bH)) != null) {
            return c5330h.LIZ();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.y$b, X.3ns] */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        final C448893pD c448893pD;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        if (this.LJII.LIZLLL().LIZJ()) {
            AbstractC5325b LIZIZ = this.LJII.LIZLLL().LIZIZ();
            if (LIZIZ != null) {
                c448893pD = (C448893pD) LIZIZ;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.profit.lottery.LotteryContext");
            }
        } else {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                c448893pD = (C448893pD) proxy.result;
            } else {
                c448893pD = new C448893pD();
                C5342y c5342y = new C5342y(this.LIZLLL);
                c448893pD.LJI().LIZIZ(c5342y);
                c448893pD.LJII().LIZIZ(new C5322ad(c448893pD));
                Observable observable = c448893pD.LLLLIIIILLL().toObservable();
                c5342y.LIZLLL.takeUntil(observable).subscribe(new Consumer<AbstractC449173pf<? extends C5330h>>() { // from class: X.3pH
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(33407);
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(AbstractC449173pf<? extends C5330h> abstractC449173pf) {
                        AbstractC449173pf<? extends C5330h> abstractC449173pf2 = abstractC449173pf;
                        if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                            C2WD<C5330h> LIZ2 = C448893pD.this.LIZ();
                            Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                            LIZ2.LIZ(C449593qL.LIZ((AbstractC449173pf<? extends ??>) abstractC449173pf2));
                        }
                    }
                });
                c5342y.LJFF.takeUntil(observable).subscribe(new Consumer<Boolean>() { // from class: X.3pI
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(33408);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(Boolean bool) {
                        Object LIZ2;
                        if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                            C448893pD c448893pD2 = C448893pD.this;
                            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c448893pD2, C448893pD.LIZ, false, 4);
                            if (proxy2.isSupported) {
                                LIZ2 = proxy2.result;
                            } else {
                                LIZ2 = c448893pD2.LIZJ.LIZ(c448893pD2, C448893pD.LIZIZ[3]);
                            }
                            Intrinsics.checkNotNullExpressionValue(bool, "");
                            ((C2TE) LIZ2).LIZ(bool);
                        }
                    }
                });
                c5342y.LJII.takeUntil(observable).subscribe(new Consumer<ParticipateStatus>() { // from class: X.3pL
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(33409);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(ParticipateStatus participateStatus) {
                        if (!PatchProxy.proxy(new Object[]{participateStatus}, this, LIZ, false, 1).isSupported) {
                            C2WC<ParticipateStatus> LJIIJ = C448893pD.this.LJIIJ();
                            Intrinsics.checkNotNullExpressionValue(participateStatus, "");
                            LJIIJ.LIZ(participateStatus);
                        }
                    }
                });
            }
            this.LJII.LIZLLL().LIZIZ(c448893pD);
        }
        this.LIZIZ = c448893pD;
        this.LIZLLL.LJJIFFI().LIZ(new LotteryHelperWidget$onCreate$1(this));
        AbstractC6524y m24985LJ = C413202Xa.m24985LJ();
        ExtendedToolbarButton.C6483b LIZ2 = ExtendedToolbarButton.LJIILJJIL.LIZ(ToolbarButton.LOTTERY);
        final C448893pD c448893pD2 = this.LIZIZ;
        if (c448893pD2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ?? r1 = new AbstractC6524y.AbstractView$OnClickListenerC6525b(c448893pD2) { // from class: X.3ns
            public static ChangeQuickRedirect LIZ;
            public final C448893pD LIZIZ;

            static {
                Covode.recordClassIndex(33461);
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C2TD c2td) {
                boolean z = PatchProxy.proxy(new Object[]{c2td}, this, LIZ, false, 7).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 3).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 5).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(boolean z) {
                boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final C9225a LIZIZ() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
                if (proxy2.isSupported) {
                    return (C9225a) proxy2.result;
                }
                return null;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 4).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 9).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final boolean aK_() {
                boolean booleanValue;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                C448073nt c448073nt = C448073nt.LIZIZ;
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c448073nt, C448073nt.LIZ, false, 1);
                if (proxy3.isSupported) {
                    return ((Boolean) proxy3.result).booleanValue();
                }
                SettingKey<C8451e> settingKey = LiveConfigSettingKeys.LOTTERY_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                if (settingKey.getValue().LIZIZ == 1) {
                    SettingKey<C8451e> settingKey2 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    if (settingKey2.getValue().LJIILLIIL == 1) {
                        PatchProxyResult proxy4 = PatchProxy.proxy(new Object[0], c448073nt, C448073nt.LIZ, false, 2);
                        if (proxy4.isSupported) {
                            booleanValue = ((Boolean) proxy4.result).booleanValue();
                        } else {
                            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6945B;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            Boolean LIZ3 = c87308Kak.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            booleanValue = LIZ3.booleanValue();
                        }
                        if (!booleanValue) {
                            return true;
                        }
                    }
                }
                return false;
            }

            {
                C106862S5w.LIZ(c448893pD2);
                this.LIZIZ = c448893pD2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (!PatchProxy.proxy(new Object[]{(byte) 1}, C448073nt.LIZIZ, C448073nt.LIZ, false, 3).isSupported) {
                    C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6945B;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    c87308Kak.LIZ(Boolean.TRUE);
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACT_GAME, new C3E4());
                }
                C4574547f LIZ3 = C4574547f.LIZ();
                C8668v c8668v = new C8668v();
                c8668v.LIZ("live_take_detail");
                LIZ3.LIZ("livesdk_anchor_lottery_click", null, Room.class, c8668v);
                this.LIZIZ.LIZJ().LIZ(Unit.INSTANCE);
            }
        };
        this.LJFF = r1;
        m24985LJ.LIZ(LIZ2, (AbstractC6524y.AbstractView$OnClickListenerC6525b) r1);
        C448893pD c448893pD3 = this.LIZIZ;
        if (c448893pD3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C5341v LIZIZ2 = c448893pD3.LIZIZ().LIZIZ();
        LIZIZ2.LIZ(new C436773Pr());
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LIZIZ2.LIZ(new C426152td(context));
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LIZIZ2.LIZ(new C427732wB(context2, this.LIZLLL));
        LIZIZ2.LIZ(C426182tg.LIZIZ);
        final C5923dp c5923dp = this.LIZLLL;
        LIZIZ2.LIZ(new AbstractC5326d(c5923dp) { // from class: X.2tf
            public static ChangeQuickRedirect LIZ;
            public final C5923dp LIZIZ;

            static {
                Covode.recordClassIndex(33531);
            }

            @Override // com.bytedance.android.live.profit.lottery.AbstractC5326d
            public final void LIZ() {
                boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported;
            }

            {
                C106862S5w.LIZ(c5923dp);
                this.LIZIZ = c5923dp;
            }

            @Override // com.bytedance.android.live.profit.lottery.AbstractC5326d
            public final void LIZ(AbstractC5325b abstractC5325b) {
                if (PatchProxy.proxy(new Object[]{abstractC5325b}, this, LIZ, false, 3).isSupported) {
                    return;
                }
                C106862S5w.LIZ(abstractC5325b);
                C426162te.LIZ(this, abstractC5325b);
            }

            @Override // com.bytedance.android.live.profit.lottery.AbstractC5326d
            public final void LIZ(Map<String, String> map) {
                if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(map);
                RoomParamsLotteryPlugin$appendUrlParams$1 roomParamsLotteryPlugin$appendUrlParams$1 = new RoomParamsLotteryPlugin$appendUrlParams$1(map);
                Room LIZ3 = this.LIZIZ.LIZ().LIZ();
                roomParamsLotteryPlugin$appendUrlParams$1.LIZ(LIZ3.getId(), "room_id");
                roomParamsLotteryPlugin$appendUrlParams$1.LIZ(LIZ3.ownerUserId, "anchor_id");
            }

            @Override // com.bytedance.android.live.profit.lottery.AbstractC5326d
            public final boolean LIZ(AbstractC5309a abstractC5309a) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC5309a}, this, LIZ, false, 2);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                C106862S5w.LIZ(abstractC5309a);
                return C426162te.LIZ(this, abstractC5309a);
            }
        });
        final C448893pD c448893pD4 = this.LIZIZ;
        if (c448893pD4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{c448893pD4}, this, LIZ, false, 5).isSupported) {
            QB4.LIZ(c448893pD4.LJIIIIZZ().LIZIZ().subscribe(new Consumer<Unit>() { // from class: X.3pv
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33411);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Unit unit) {
                    C5342y LIZIZ3;
                    Single<T> doOnSuccess;
                    if (!PatchProxy.proxy(new Object[]{unit}, this, LIZ, false, 1).isSupported && (LIZIZ3 = C448893pD.this.LJI().LIZIZ()) != null && !PatchProxy.proxy(new Object[]{LIZIZ3, 0L, 1, null}, null, C5342y.LIZ, true, 7).isSupported && !PatchProxy.proxy(new Object[]{new Long((long) LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME)}, LIZIZ3, C5342y.LIZ, false, 6).isSupported) {
                        if (LIZIZ3.LIZJ.LIZ() instanceof C449163pe) {
                            C2IN LIZIZ4 = C2IN.LIZIZ();
                            LIZIZ4.LIZLLL("ttlive_lottery", "lottery is already present: " + C91513M3n.LIZ((AbstractC414762bG<AbstractC449173pf<Object>>) LIZIZ3.LIZJ));
                            return;
                        }
                        C5330h c5330h = new C5330h(AbstractC5315aa.C5320e.LIZ);
                        final C8646b c8646b = new C8646b("ttlive_lottery", "handleLotterySubmit " + c5330h.LIZJ);
                        c8646b.LIZIZ("begin");
                        LIZIZ3.LIZ(c5330h);
                        C449443q6 c449443q6 = C449443q6.LIZJ;
                        final long id = LIZIZ3.LJIIJJI.LIZ().LIZ().getId();
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c449443q6, new Long(id), 0L, 2, null}, null, C449443q6.LIZ, true, 11);
                        if (proxy2.isSupported) {
                            doOnSuccess = (Single) proxy2.result;
                        } else {
                            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{new Long(id), new Long((long) LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME)}, c449443q6, C449443q6.LIZ, false, 10);
                            if (proxy3.isSupported) {
                                doOnSuccess = (Single) proxy3.result;
                            } else {
                                final C8646b c8646b2 = new C8646b("ttlive_lottery", "pollReviewStatus roomId=" + id);
                                c8646b2.LIZIZ("begin");
                                Observable<R> flatMap = C7HK.LIZIZ.LIZ(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, TimeUnit.MILLISECONDS).flatMap(new Function<Long, ObservableSource<? extends k$b>>() { // from class: X.3q1
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(33506);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v8, types: [io.reactivex.ObservableSource<? extends com.bytedance.android.live.profit.lottery.k$b>, java.lang.Object] */
                                    @Override // io.reactivex.functions.Function
                                    public final /* synthetic */ ObservableSource<? extends k$b> apply(Long l) {
                                        PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1);
                                        if (proxy4.isSupported) {
                                            return proxy4.result;
                                        }
                                        C106862S5w.LIZ(l);
                                        return C449443q6.LIZ(C449443q6.LIZJ, id, false, 0, 0L, LotteryApi.QueryFrom.ClientPoll, 10, null).toObservable().filter(C449513qD.LIZIZ).onErrorResumeNext(Observable.empty()).map(C449383q0.LIZIZ);
                                    }
                                });
                                Intrinsics.checkNotNullExpressionValue(flatMap, "");
                                doOnSuccess = QB4.LIZIZ(flatMap).firstOrError().doOnSuccess(new Consumer<k$b>() { // from class: X.3qX
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(33509);
                                    }

                                    @Override // io.reactivex.functions.Consumer
                                    public final /* synthetic */ void accept(k$b k_b) {
                                        k$b k_b2 = k_b;
                                        if (!PatchProxy.proxy(new Object[]{k_b2}, this, LIZ, false, 1).isSupported) {
                                            C8646b.this.LIZJ(k_b2.toString());
                                        }
                                    }
                                });
                                Intrinsics.checkNotNullExpressionValue(doOnSuccess, "");
                            }
                        }
                        Single<T> delay = doOnSuccess.doOnSuccess(new Consumer<k$b>() { // from class: X.3qI
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(33549);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(k$b k_b) {
                                if (!PatchProxy.proxy(new Object[]{k_b}, this, LIZ, false, 1).isSupported) {
                                    C8646b c8646b3 = C8646b.this;
                                    c8646b3.LIZIZ("get review result: " + k_b);
                                }
                            }
                        }).delay(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, TimeUnit.MILLISECONDS);
                        Intrinsics.checkNotNullExpressionValue(delay, "");
                        final Disposable LIZ3 = QB4.LIZ(QB4.LIZ(delay), "ttlive_lottery", new LotteryRepository$createLottery$disposable$2(LIZIZ3, c8646b, c5330h));
                        QB4.LIZ(LIZ3, LIZIZ3.LIZIZ);
                        QB4.LIZ(c5330h.LIZIZ().filter(C449153pd.LIZIZ).take(1L).subscribe(new Consumer<C5324ae>() { // from class: X.3qQ
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(33548);
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final /* synthetic */ void accept(C5324ae c5324ae) {
                                if (!PatchProxy.proxy(new Object[]{c5324ae}, this, LIZ, false, 1).isSupported) {
                                    Disposable.this.dispose();
                                    c8646b.LIZIZ("stopped due to state change");
                                }
                            }
                        }), LIZIZ3.LIZIZ);
                    }
                }
            }), this.f26565LJ);
            QB4.LIZ(c448893pD4.LIZJ().LIZIZ().subscribe(new Consumer<Unit>() { // from class: X.3pF
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33412);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Unit unit) {
                    if (!PatchProxy.proxy(new Object[]{unit}, this, LIZ, false, 1).isSupported) {
                        LotteryHelperWidget lotteryHelperWidget = LotteryHelperWidget.this;
                        if (!PatchProxy.proxy(new Object[0], lotteryHelperWidget, LotteryHelperWidget.LIZ, false, 6).isSupported) {
                            AbstractC5315aa LIZ3 = lotteryHelperWidget.LIZ();
                            if (LIZ3 instanceof AbstractC5315aa.C5321f) {
                                C448893pD c448893pD5 = lotteryHelperWidget.LIZIZ;
                                if (c448893pD5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                c448893pD5.LIZLLL().LIZ(Unit.INSTANCE);
                            } else if (LIZ3 instanceof AbstractC5315aa.C5320e) {
                                SettingKey<C8451e> settingKey = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                                String str = settingKey.getValue().LJIIJJI;
                                if (str == null) {
                                    str = "";
                                }
                                C88440Kt0.LIZ(str);
                            } else {
                                SettingKey<C8451e> settingKey2 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                                String str2 = settingKey2.getValue().LIZJ;
                                Intrinsics.checkNotNullExpressionValue(str2, "");
                                lotteryHelperWidget.LIZ(str2, LIZ3);
                            }
                        }
                    }
                }
            }), this.f26565LJ);
            QB4.LIZ(c448893pD4.LIZLLL().LIZIZ().subscribe(new Consumer<Unit>() { // from class: X.3pE
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33413);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Unit unit) {
                    AbstractC5315aa LIZ3;
                    String str;
                    PublishSubject<ParticipateStatus> publishSubject;
                    if (!PatchProxy.proxy(new Object[]{unit}, this, LIZ, false, 1).isSupported) {
                        LotteryHelperWidget lotteryHelperWidget = LotteryHelperWidget.this;
                        if (PatchProxy.proxy(new Object[0], lotteryHelperWidget, LotteryHelperWidget.LIZ, false, 7).isSupported || (LIZ3 = lotteryHelperWidget.LIZ()) == null) {
                            return;
                        }
                        boolean booleanValue = lotteryHelperWidget.LIZLLL.LJIILJJIL().LIZIZ().booleanValue();
                        if (!(LIZ3 instanceof AbstractC5315aa.C5321f) && !(LIZ3 instanceof AbstractC5315aa.C5316a)) {
                            if (LIZ3 instanceof AbstractC5315aa.C5317b) {
                                if (booleanValue) {
                                    SettingKey<C8451e> settingKey = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                                    str = settingKey.getValue().LIZLLL;
                                } else {
                                    SettingKey<C8451e> settingKey2 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                                    str = settingKey2.getValue().LJFF;
                                }
                            } else if (!booleanValue) {
                                str = "";
                            } else {
                                SettingKey<C8451e> settingKey3 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                                str = settingKey3.getValue().LIZJ;
                            }
                        } else {
                            C448893pD c448893pD5 = lotteryHelperWidget.LIZIZ;
                            if (c448893pD5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            if (c448893pD5.LJIIJ().LIZ() == ParticipateStatus.NOTPARTICIPATED) {
                                C448893pD c448893pD6 = lotteryHelperWidget.LIZIZ;
                                if (c448893pD6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                C5342y LIZIZ3 = c448893pD6.LJI().LIZIZ();
                                if (LIZIZ3 != null && (publishSubject = LIZIZ3.LJIIIZ) != null) {
                                    publishSubject.onNext(ParticipateStatus.PARTICIPATED);
                                }
                            }
                            if (booleanValue) {
                                SettingKey<C8451e> settingKey4 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                                str = settingKey4.getValue().LIZLLL;
                            } else {
                                SettingKey<C8451e> settingKey5 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey5, "");
                                str = settingKey5.getValue().f27735LJ;
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        lotteryHelperWidget.LIZ(str, LIZ3);
                    }
                }
            }), this.f26565LJ);
            QB4.LIZ(c448893pD4.mo15615LJ().LIZIZ().subscribe(new Consumer<AbstractC5315aa.C5317b>() { // from class: X.3pG
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33414);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5315aa.C5317b c5317b) {
                    String str;
                    AbstractC5315aa.C5317b c5317b2 = c5317b;
                    if (!PatchProxy.proxy(new Object[]{c5317b2}, this, LIZ, false, 1).isSupported) {
                        LotteryHelperWidget lotteryHelperWidget = LotteryHelperWidget.this;
                        Intrinsics.checkNotNullExpressionValue(c5317b2, "");
                        if (!PatchProxy.proxy(new Object[]{c5317b2}, lotteryHelperWidget, LotteryHelperWidget.LIZ, false, 8).isSupported) {
                            if (c5317b2.LIZJ.LIZLLL) {
                                SettingKey<C8451e> settingKey = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                                str = settingKey.getValue().LIZLLL;
                            } else {
                                SettingKey<C8451e> settingKey2 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                                str = settingKey2.getValue().LJFF;
                            }
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            lotteryHelperWidget.LIZ(str, c5317b2);
                        }
                    }
                }
            }), this.f26565LJ);
            QB4.LIZ(c448893pD4.LJIIIZ().LIZIZ().subscribe(new Consumer<AbstractC5315aa.C5319d>() { // from class: X.3pJ
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33415);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5315aa.C5319d c5319d) {
                    AbstractC5315aa.C5319d c5319d2 = c5319d;
                    if (!PatchProxy.proxy(new Object[]{c5319d2}, this, LIZ, false, 1).isSupported && LotteryHelperWidget.this.LIZLLL.LJIILJJIL().LIZIZ().booleanValue()) {
                        Context context3 = LotteryHelperWidget.this.context;
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        C448993pN.LIZ(context3, c5319d2.LIZIZ);
                    }
                }
            }), this.f26565LJ);
            QB4.LIZ(c448893pD4.LJFF().LIZIZ().subscribe(new Consumer<Unit>() { // from class: X.3pM
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33416);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Unit unit) {
                    if (!PatchProxy.proxy(new Object[]{unit}, this, LIZ, false, 1).isSupported) {
                        LotteryHelperWidget.this.LIZJ.dispose();
                    }
                }
            }), this.f26565LJ);
        }
        this.dataCenter.observe("cmd_refetch_broadcast_game_list", this.LJI);
    }

    public static final /* synthetic */ C448893pD LIZ(LotteryHelperWidget lotteryHelperWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{lotteryHelperWidget}, null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (C448893pD) proxy.result;
        }
        C448893pD c448893pD = lotteryHelperWidget.LIZIZ;
        if (c448893pD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c448893pD;
    }

    public LotteryHelperWidget(C5923dp c5923dp, C5280j c5280j) {
        C106862S5w.LIZ(c5923dp, c5280j);
        this.LIZLLL = c5923dp;
        this.LJII = c5280j;
        Disposable LIZIZ = QVQ.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LIZJ = LIZIZ;
    }

    public final void LIZ(String str, AbstractC5315aa abstractC5315aa) {
        if (PatchProxy.proxy(new Object[]{str, abstractC5315aa}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C2IN LIZIZ = C2IN.LIZIZ();
        LIZIZ.LIZIZ("ttlive_lottery", "openLotteryPanel uri=" + str + " state=" + abstractC5315aa);
        this.LIZJ.dispose();
        if (str.length() == 0) {
            return;
        }
        C448893pD c448893pD = this.LIZIZ;
        if (c448893pD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        IHybridComponent LIZ2 = C448993pN.LIZ(str, c448893pD, abstractC5315aa, context);
        if (LIZ2 instanceof HybridDialog) {
            this.LIZJ = C420672kn.LIZ((DialogFragment) LIZ2);
        }
    }
}
