package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3397a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3799p;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C413202Xa;
import p003X.C4317436i;
import p003X.C4574547f;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class AudienceMiniGameIntroCardService$showCard$2 extends Lambda implements Function1<C3799p, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $delay;
    public final /* synthetic */ long $duration;
    public final /* synthetic */ C3397a $gameIntroCardInfo;
    public final /* synthetic */ C88098KnU $widget;
    public final /* synthetic */ AudienceMiniGameIntroCardService this$0;

    static {
        Covode.recordClassIndex(20979);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniGameIntroCardService$showCard$2(AudienceMiniGameIntroCardService audienceMiniGameIntroCardService, C88098KnU c88098KnU, long j, C3397a c3397a, long j2) {
        super(1);
        this.this$0 = audienceMiniGameIntroCardService;
        this.$widget = c88098KnU;
        this.$delay = j;
        this.$gameIntroCardInfo = c3397a;
        this.$duration = j2;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$1 */
    /* loaded from: classes5.dex */
    public static final class C36871 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20980);
        }

        public C36871() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$1$1 */
        /* loaded from: classes5.dex */
        public static final class C36881 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C3799p $this_addTask;

            static {
                Covode.recordClassIndex(20981);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36881(C3799p c3799p) {
                super(0);
                this.$this_addTask = c3799p;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    AudienceMiniGameIntroCardService$showCard$2.this.$widget.LIZIZ();
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
                AudienceMiniGameIntroCardService$showCard$2.this.$widget.LIZ(AudienceMiniGameIntroCardService$showCard$2.this.$delay, new C36881(c3799p2));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$3 */
    /* loaded from: classes5.dex */
    public static final class C36913 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20984);
        }

        public C36913() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$3$1 */
        /* loaded from: classes5.dex */
        public static final class C36921 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C3799p $this_addTask;

            static {
                Covode.recordClassIndex(20985);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36921(C3799p c3799p) {
                super(0);
                this.$this_addTask = c3799p;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                byte b;
                String str;
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    AudienceMiniGameIntroCardService$showCard$2.this.this$0.LIZLLL = System.currentTimeMillis();
                    AudienceMiniGameIntroCardService$showCard$2.this.this$0.f26083LJ = AudienceMiniGameIntroCardService$showCard$2.this.$gameIntroCardInfo;
                    AudienceMiniGameIntroCardService$showCard$2.this.$widget.LJIIJ();
                    TrackMiniGameCardService trackMiniGameCardService = (TrackMiniGameCardService) AudienceMiniGameIntroCardService$showCard$2.this.this$0.LIZ().LIZ((Class<AbstractC3719c>) TrackMiniGameCardService.class);
                    String str2 = AudienceMiniGameIntroCardService$showCard$2.this.$gameIntroCardInfo.LIZLLL;
                    if (str2 != null && str2.length() != 0) {
                        b = 0;
                    } else {
                        b = 1;
                    }
                    if (!PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, trackMiniGameCardService, TrackMiniGameCardService.LIZ, false, 5).isSupported) {
                        C4574547f LIZ = C4574547f.LIZ();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(trackMiniGameCardService.LIZ());
                        trackMiniGameCardService.LIZ(linkedHashMap);
                        if (b != 0) {
                            str = "type1";
                        } else {
                            str = "type2";
                        }
                        linkedHashMap.put("ad_show_type", str);
                        LIZ.LIZ("livesdk_audience_ad_show", linkedHashMap, Room.class, C8668v.class);
                    }
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
                C88098KnU.LIZ(AudienceMiniGameIntroCardService$showCard$2.this.$widget, 0L, new C36921(c3799p2), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$2 */
    /* loaded from: classes5.dex */
    public static final class C36892 extends Lambda implements Function1<C3799p, Unit> {
        public static final C36892 INSTANCE = new C36892();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20982);
        }

        public C36892() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            final C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                C413202Xa.LIZ().LIZ(ToolbarButton.OPEN_PLATFORM_MINI_GAME, new C4317436i(new Pair(Boolean.TRUE, new Function0<Unit>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService.showCard.2.2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(20983);
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

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$4 */
    /* loaded from: classes5.dex */
    public static final class C36934 extends Lambda implements Function1<C3799p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$showCard$2$4$2 */
        /* loaded from: classes5.dex */
        public static final class C36952<T> implements Consumer<Throwable> {
            public static final C36952 LIZ = new C36952();

            static {
                Covode.recordClassIndex(20988);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* bridge */ /* synthetic */ void accept(Throwable th) {
            }
        }

        static {
            Covode.recordClassIndex(20986);
        }

        public C36934() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3799p c3799p) {
            C3799p c3799p2 = c3799p;
            if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3799p2);
                AudienceMiniGameIntroCardService$showCard$2.this.this$0.LIZJ.add(Single.timer(AudienceMiniGameIntroCardService$showCard$2.this.$duration, TimeUnit.SECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService.showCard.2.4.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(20987);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(Long l) {
                        if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1).isSupported) {
                            AudienceMiniGameIntroCardService.LIZ(AudienceMiniGameIntroCardService$showCard$2.this.this$0, false, false, 3, null);
                        }
                    }
                }, C36952.LIZ));
                c3799p2.LIZ();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3799p c3799p) {
        C88098KnU<C3397a> c88098KnU;
        C3799p c3799p2 = c3799p;
        if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3799p2);
            if (!this.$widget.LIZIZ && (c88098KnU = this.this$0.LIZIZ) != null) {
                c88098KnU.LIZ();
            }
            if (!this.$widget.LIZJ) {
                c3799p2.LIZ("show", new C36871()).LIZ("展示toolbar动画", C36892.INSTANCE).LIZ("展示卡片动画", new C36913()).LIZ("自动隐藏", new C36934());
            }
            c3799p2.LIZ();
        }
        return Unit.INSTANCE;
    }
}
