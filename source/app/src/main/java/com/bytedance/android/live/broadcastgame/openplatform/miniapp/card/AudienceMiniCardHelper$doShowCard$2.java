package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AudienceMiniCardService;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.TrackMiniCardService;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C413202Xa;
import p003X.C4317436i;
import p003X.C4574547f;
import p003X.C81173Hz5;
import p003X.C87811Kir;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class AudienceMiniCardHelper$doShowCard$2 extends Lambda implements Function1<C3799p, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C8733af $cardInfo;
    public final /* synthetic */ int $type;
    public final /* synthetic */ C88098KnU $widget;
    public final /* synthetic */ C3795b this$0;

    static {
        Covode.recordClassIndex(21504);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniCardHelper$doShowCard$2(C3795b c3795b, C88098KnU c88098KnU, C8733af c8733af, int i) {
        super(1);
        this.this$0 = c3795b;
        this.$widget = c88098KnU;
        this.$cardInfo = c8733af;
        this.$type = i;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$1 */
    /* loaded from: classes5.dex */
    public static final class C37801 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21505);
        }

        public C37801() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$1$1 */
        /* loaded from: classes5.dex */
        public static final class C37811 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C3799p $this_addTask;

            static {
                Covode.recordClassIndex(21506);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C37811(C3799p c3799p) {
                super(0);
                this.$this_addTask = c3799p;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    this.$this_addTask.LIZ();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                AudienceMiniCardHelper$doShowCard$2.this.$widget.LIZIZ();
                C88098KnU.LIZ(AudienceMiniCardHelper$doShowCard$2.this.$widget, 0L, new C37811(c3799p2), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$4 */
    /* loaded from: classes5.dex */
    public static final class C37854 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21510);
        }

        public C37854() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$4$1 */
        /* loaded from: classes5.dex */
        public static final class C37861 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C3799p $this_addTask;

            static {
                Covode.recordClassIndex(21511);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C37861(C3799p c3799p) {
                super(0);
                this.$this_addTask = c3799p;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    AudienceMiniCardHelper$doShowCard$2.this.$widget.LJIIJ();
                    this.$this_addTask.LIZ();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                C88098KnU.LIZ(AudienceMiniCardHelper$doShowCard$2.this.$widget, 0L, new C37861(c3799p2), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$5 */
    /* loaded from: classes5.dex */
    public static final class C37875 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21512);
        }

        public C37875() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$5$1 */
        /* loaded from: classes5.dex */
        public static final class C37881 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C3799p $this_addTask;

            static {
                Covode.recordClassIndex(21513);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C37881(C3799p c3799p) {
                super(0);
                this.$this_addTask = c3799p;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    this.$this_addTask.LIZ();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                C88098KnU c88098KnU = AudienceMiniCardHelper$doShowCard$2.this.$widget;
                C37881 c37881 = new C37881(c3799p2);
                if (!PatchProxy.proxy(new Object[]{c37881}, c88098KnU, C88098KnU.LIZ, false, 17).isSupported) {
                    C106862S5w.LIZ(c37881);
                    Object obj = c88098KnU.LIZLLL;
                    if (obj != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "ScaleX", 1.0f, 0.5f, 0.0f, 1.0f);
                        ofFloat.setDuration(280L);
                        ofFloat.setInterpolator(new DecelerateInterpolator());
                        Object obj2 = c88098KnU.LIZLLL;
                        if (obj2 != null) {
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(obj2, "ScaleY", 1.0f, 0.5f, 0.0f, 1.0f);
                            ofFloat2.setDuration(280L);
                            ofFloat2.setInterpolator(new DecelerateInterpolator());
                            Object obj3 = c88098KnU.LIZLLL;
                            if (obj3 != null) {
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(obj3, "alpha", 1.0f, 0.0f, 1.0f);
                                ofFloat3.setDuration(280L);
                                ofFloat3.setInterpolator(new DecelerateInterpolator());
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                                c88098KnU.LIZ(140L, (Function0<Unit>) new IntroduceCardWidget$quickShowCard$1(c37881));
                                C88098KnU.LIZ(c88098KnU, 0L, new IntroduceCardWidget$quickShowCard$2(animatorSet), 1, null);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$2 */
    /* loaded from: classes5.dex */
    public static final class C37822 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21507);
        }

        public C37822() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                AudienceMiniCardHelper$doShowCard$2.this.$widget.LIZ(AudienceMiniCardHelper$doShowCard$2.this.$type, (int) C87811Kir.LJI.LIZ(AudienceMiniCardHelper$doShowCard$2.this.$cardInfo));
                c3799p2.LIZ();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$3 */
    /* loaded from: classes5.dex */
    public static final class C37833 extends Lambda implements Function1<C3799p, Unit> {
        public static final C37833 INSTANCE = new C37833();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21508);
        }

        public C37833() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            final C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                C413202Xa.LIZ().LIZ(ToolbarButton.OPEN_PLATFORM_MINI_APP, new C4317436i(new Pair(Boolean.TRUE, new Function0<Unit>() { // from class: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper.doShowCard.2.3.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(21509);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final /* synthetic */ Unit mo30099invoke() {
                        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            C3799p.this.LIZ();
                        }
                        return Unit.INSTANCE;
                    }
                })));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.AudienceMiniCardHelper$doShowCard$2$6 */
    /* loaded from: classes5.dex */
    public static final class C37896 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21514);
        }

        public C37896() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                AudienceMiniCardHelper$doShowCard$2.this.$widget.LIZ(AudienceMiniCardHelper$doShowCard$2.this.$type, (int) C87811Kir.LJI.LIZ(AudienceMiniCardHelper$doShowCard$2.this.$cardInfo));
                c3799p2.LIZ();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3799p c3799p) {
        C88098KnU<C3561g> c88098KnU;
        C3799p c3799p2 = c3799p;
        if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3799p2);
            if (!this.$widget.LIZIZ && (c88098KnU = this.this$0.LIZIZ) != null) {
                c88098KnU.LIZ();
            }
            if (!this.$widget.LIZJ) {
                TrackMiniCardService trackMiniCardService = (TrackMiniCardService) this.this$0.LJFF.LIZ((Class<AbstractC3719c>) TrackMiniCardService.class);
                Bundle LIZ = this.this$0.LIZ(this.$cardInfo);
                if (!PatchProxy.proxy(new Object[]{LIZ}, trackMiniCardService, TrackMiniCardService.LIZLLL, false, 16).isSupported) {
                    C4574547f LIZ2 = C4574547f.LIZ();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(trackMiniCardService.LJII());
                    AudienceMiniCardService.LIZLLL.LIZ(trackMiniCardService.LJFF, linkedHashMap);
                    LIZ2.LIZ("livesdk_small_program_audience_explanation_card_show", linkedHashMap, Room.class, C81173Hz5.class);
                    if (LIZ != null) {
                        C4574547f.LIZ().LIZ("livesdk_mp_explain_card_show", trackMiniCardService.LIZIZ(LIZ), new Object[0]);
                        trackMiniCardService.LIZ(LIZ);
                    }
                }
                c3799p2.LIZ("show", new C37801()).LIZ("设置数据", new C37822()).LIZ("展示toolbar动画", C37833.INSTANCE).LIZ("展示卡片动画", new C37854());
            } else {
                c3799p2.LIZ("快速展示", new C37875()).LIZ("设置数据", new C37896());
            }
            c3799p2.LIZ();
        }
        return Unit.INSTANCE;
    }
}
