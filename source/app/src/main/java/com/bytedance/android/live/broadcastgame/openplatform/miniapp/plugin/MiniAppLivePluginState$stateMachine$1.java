package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin;

import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$a;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC87170KWm;
import p003X.C103385QnT;
import p003X.C103396Qne;
import p003X.C103398Qng;
import p003X.C106862S5w;
import p003X.C2WD;
import p003X.C87632Kfy;
import p003X.C87911KkT;
import p003X.C89524LPa;
import p003X.C89525LPb;
import p003X.C89526LPc;
import p003X.C89527LPd;
import p003X.LK1;
import p003X.LPQ;
import p003X.LPY;
import p003X.LPZ;
import p003X.QL7;

/* loaded from: classes5.dex */
public final class MiniAppLivePluginState$stateMachine$1 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LPQ this$0;

    static {
        Covode.recordClassIndex(21668);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppLivePluginState$stateMachine$1(LPQ lpq) {
        super(1);
        this.this$0 = lpq;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$9 */
    /* loaded from: classes5.dex */
    public static final class C38379 extends Lambda implements Function1<AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21702);
        }

        public C38379() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$9$1 */
        /* loaded from: classes5.dex */
        public static final class C38381 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ String $error;
            public final /* synthetic */ b$a $event;
            public final /* synthetic */ C103385QnT $validTransition;

            static {
                Covode.recordClassIndex(21703);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38381(b$a b_a, C103385QnT c103385QnT, String str) {
                super(0);
                this.$event = b_a;
                this.$validTransition = c103385QnT;
                this.$error = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Unit mo30099invoke() {
                z$c z_c;
                C2WD<z$c> LJJI;
                C2WD<z$c> LJJI2;
                C2WD<z$c> LJJI3;
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                    AbstractC87170KWm LIZ = AbstractC87170KWm.LJI.LIZ();
                    Map<String, String> map = null;
                    if (LIZ != null && (LJJI3 = LIZ.LJJI()) != null) {
                        z_c = LJJI3.LIZ();
                    } else {
                        z_c = null;
                    }
                    b$a b_a = this.$event;
                    if (b_a instanceof b$a.C3840a) {
                        if (z_c instanceof C87632Kfy) {
                            ((C87632Kfy) z_c).LIZIZ = true;
                        } else {
                            z_c = new C87632Kfy(false, true, false, 5);
                        }
                        AbstractC87170KWm LIZ2 = AbstractC87170KWm.LJI.LIZ();
                        if (LIZ2 != null && (LJJI2 = LIZ2.LJJI()) != null) {
                            LJJI2.LIZ(z_c);
                        }
                    } else if (b_a instanceof b$a.C3844e) {
                        if (z_c instanceof C87632Kfy) {
                            ((C87632Kfy) z_c).LIZ = true;
                        } else {
                            z_c = new C87632Kfy(true, false, false, 6);
                        }
                        AbstractC87170KWm LIZ3 = AbstractC87170KWm.LJI.LIZ();
                        if (LIZ3 != null && (LJJI = LIZ3.LJJI()) != null) {
                            LJJI.LIZ(z_c);
                        }
                    }
                    SIDE_EFFECT side_effect = this.$validTransition.LIZJ;
                    if (Intrinsics.areEqual(side_effect, C89524LPa.LIZ)) {
                        MiniAppLivePluginState$stateMachine$1.this.this$0.LIZJ.LIZLLL();
                    } else if (Intrinsics.areEqual(side_effect, C89526LPc.LIZ)) {
                        MiniAppLivePluginState$stateMachine$1.this.this$0.LIZJ.mo15832LJ();
                    } else if (Intrinsics.areEqual(side_effect, C89527LPd.LIZ)) {
                        MiniAppLivePluginState$stateMachine$1.this.this$0.LIZJ.LJFF();
                    } else if (Intrinsics.areEqual(side_effect, C89525LPb.LIZ)) {
                        AbstractC3663l abstractC3663l = MiniAppLivePluginState$stateMachine$1.this.this$0.LIZJ;
                        b$a b_a2 = this.$event;
                        if (!(b_a2 instanceof b$a.C3846g)) {
                            b_a2 = null;
                        }
                        b$a.C3846g c3846g = (b$a.C3846g) b_a2;
                        if (c3846g != null) {
                            map = c3846g.LIZ;
                        }
                        abstractC3663l.LIZ(map);
                    } else if (Intrinsics.areEqual(side_effect, LPZ.LIZ)) {
                        MiniAppLivePluginState$stateMachine$1.this.this$0.LIZJ.LJI();
                    } else if (Intrinsics.areEqual(side_effect, LPY.LIZ)) {
                        MiniAppLivePluginState$stateMachine$1.this.this$0.LIZJ.LIZ(this.$error);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ) {
            AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ2;
            AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ3;
            b$a LIZIZ;
            String str;
            AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ4 = abstractC103391QnZ;
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ4}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ4);
                boolean z = abstractC103391QnZ4 instanceof C103385QnT;
                if (!z) {
                    abstractC103391QnZ2 = null;
                } else {
                    abstractC103391QnZ2 = abstractC103391QnZ4;
                }
                if (abstractC103391QnZ2 == null) {
                    C87911KkT.LIZIZ.LIZ("livePluginState error", abstractC103391QnZ4.toString());
                }
                if (!z) {
                    abstractC103391QnZ3 = null;
                } else {
                    abstractC103391QnZ3 = abstractC103391QnZ4;
                }
                C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ3;
                if (c103385QnT != null) {
                    if (!z) {
                        abstractC103391QnZ4 = null;
                    }
                    if (abstractC103391QnZ4 != null && (LIZIZ = abstractC103391QnZ4.LIZIZ()) != null) {
                        Function1<b$a, Unit> function1 = MiniAppLivePluginState$stateMachine$1.this.this$0.LIZLLL;
                        if (function1 != null) {
                            function1.invoke(LIZIZ);
                        }
                        if (LIZIZ instanceof b$a.C3841b) {
                            str = ((b$a.C3841b) LIZIZ).LIZ;
                        } else {
                            str = "";
                        }
                        if (LIZIZ instanceof b$a.C3840a) {
                            MiniAppLivePluginState$stateMachine$1.this.this$0.LIZIZ.LJIIJ = ((b$a.C3840a) LIZIZ).LIZ;
                        }
                        if (LIZIZ instanceof b$a.C3844e) {
                            MiniAppLivePluginState$stateMachine$1.this.this$0.LIZIZ.LJIIJJI = ((b$a.C3844e) LIZIZ).LIZ;
                        }
                        LK1.LIZ(0L, false, false, new C38381(LIZIZ, c103385QnT, str), 7, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$8 */
    /* loaded from: classes5.dex */
    public static final class C38368 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3855h>, Unit> {
        public static final C38368 INSTANCE = new C38368();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21701);
        }

        public C38368() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3855h> c0033a) {
            if (!PatchProxy.proxy(new Object[]{c0033a}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$1 */
    /* loaded from: classes5.dex */
    public static final class C38041 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3850c>, Unit> {
        public static final C38041 INSTANCE = new C38041();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21669);
        }

        public C38041() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3850c> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3850c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3843d.class), new C38051(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$1$1 */
        /* loaded from: classes5.dex */
        public static final class C38051 extends Lambda implements Function2<b$c.C3850c, b$a.C3843d, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21670);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38051(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3850c c3850c, b$a.C3843d c3843d) {
                C2WD<z$c> LJJI;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3850c, c3843d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3850c, c3843d);
                AbstractC87170KWm LIZ = AbstractC87170KWm.LJI.LIZ();
                if (LIZ != null && (LJJI = LIZ.LJJI()) != null) {
                    LJJI.LIZ(new C87632Kfy(false, false, false));
                }
                return this.$this_state.LIZ(c3850c, b$c.C3851d.LIZ, C89524LPa.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$2 */
    /* loaded from: classes5.dex */
    public static final class C38062 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3851d>, Unit> {
        public static final C38062 INSTANCE = new C38062();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21671);
        }

        public C38062() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3851d> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3851d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3844e.class), new C38071(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3840a.class), new C38082(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3841b.class), new C38093(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3847h.class), new C38104(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$2$1 */
        /* loaded from: classes5.dex */
        public static final class C38071 extends Lambda implements Function2<b$c.C3851d, b$a.C3844e, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21672);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38071(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3851d c3851d, b$a.C3844e c3844e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3851d, c3844e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3851d, c3844e);
                return C103398Qng.C0033a.LIZ(this.$this_state, c3851d, b$c.C3852e.LIZ, null, 2, null);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$2$2 */
        /* loaded from: classes5.dex */
        public static final class C38082 extends Lambda implements Function2<b$c.C3851d, b$a.C3840a, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21673);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38082(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3851d c3851d, b$a.C3840a c3840a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3851d, c3840a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3851d, c3840a);
                return C103398Qng.C0033a.LIZ(this.$this_state, c3851d, b$c.C3848a.LIZ, null, 2, null);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$2$3 */
        /* loaded from: classes5.dex */
        public static final class C38093 extends Lambda implements Function2<b$c.C3851d, b$a.C3841b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21674);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38093(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3851d c3851d, b$a.C3841b c3841b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3851d, c3841b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3851d, c3841b);
                return this.$this_state.LIZ(c3851d, b$c.C3849b.LIZ, LPY.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$2$4 */
        /* loaded from: classes5.dex */
        public static final class C38104 extends Lambda implements Function2<b$c.C3851d, b$a.C3847h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21675);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38104(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3851d c3851d, b$a.C3847h c3847h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3851d, c3847h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3851d, c3847h);
                return this.$this_state.LIZ(c3851d, b$c.C3855h.LIZ, C89527LPd.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$3 */
    /* loaded from: classes5.dex */
    public static final class C38113 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3852e>, Unit> {
        public static final C38113 INSTANCE = new C38113();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21676);
        }

        public C38113() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3852e> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3852e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3840a.class), new C38121(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3847h.class), new C38132(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3841b.class), new C38143(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$3$1 */
        /* loaded from: classes5.dex */
        public static final class C38121 extends Lambda implements Function2<b$c.C3852e, b$a.C3840a, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21677);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38121(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3852e c3852e, b$a.C3840a c3840a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3852e, c3840a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3852e, c3840a);
                return this.$this_state.LIZ(c3852e, b$c.C3854g.LIZ, C89526LPc.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$3$2 */
        /* loaded from: classes5.dex */
        public static final class C38132 extends Lambda implements Function2<b$c.C3852e, b$a.C3847h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21678);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38132(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3852e c3852e, b$a.C3847h c3847h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3852e, c3847h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3852e, c3847h);
                return this.$this_state.LIZ(c3852e, b$c.C3855h.LIZ, C89527LPd.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$3$3 */
        /* loaded from: classes5.dex */
        public static final class C38143 extends Lambda implements Function2<b$c.C3852e, b$a.C3841b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21679);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38143(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3852e c3852e, b$a.C3841b c3841b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3852e, c3841b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3852e, c3841b);
                return this.$this_state.LIZ(c3852e, b$c.C3849b.LIZ, LPY.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$4 */
    /* loaded from: classes5.dex */
    public static final class C38154 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3848a>, Unit> {
        public static final C38154 INSTANCE = new C38154();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21680);
        }

        public C38154() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3848a> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3848a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3844e.class), new C38161(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3847h.class), new C38172(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3841b.class), new C38183(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3846g.class), new C38194(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$4$1 */
        /* loaded from: classes5.dex */
        public static final class C38161 extends Lambda implements Function2<b$c.C3848a, b$a.C3844e, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21681);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38161(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3848a c3848a, b$a.C3844e c3844e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3848a, c3844e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3848a, c3844e);
                return this.$this_state.LIZ(c3848a, b$c.C3854g.LIZ, C89526LPc.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$4$2 */
        /* loaded from: classes5.dex */
        public static final class C38172 extends Lambda implements Function2<b$c.C3848a, b$a.C3847h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21682);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38172(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3848a c3848a, b$a.C3847h c3847h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3848a, c3847h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3848a, c3847h);
                return this.$this_state.LIZ(c3848a, b$c.C3855h.LIZ, C89527LPd.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$4$3 */
        /* loaded from: classes5.dex */
        public static final class C38183 extends Lambda implements Function2<b$c.C3848a, b$a.C3841b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21683);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38183(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3848a c3848a, b$a.C3841b c3841b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3848a, c3841b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3848a, c3841b);
                return this.$this_state.LIZ(c3848a, b$c.C3849b.LIZ, LPY.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$4$4 */
        /* loaded from: classes5.dex */
        public static final class C38194 extends Lambda implements Function2<b$c.C3848a, b$a.C3846g, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21684);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38194(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3848a c3848a, b$a.C3846g c3846g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3848a, c3846g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3848a, c3846g);
                return this.$this_state.LIZ(c3848a, b$c.C3853f.LIZ, C89525LPb.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$5 */
    /* loaded from: classes5.dex */
    public static final class C38205 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3854g>, Unit> {
        public static final C38205 INSTANCE = new C38205();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21685);
        }

        public C38205() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3854g> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3854g> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3847h.class), new C38211(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3846g.class), new C38222(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3842c.class), new C38233(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3841b.class), new C38244(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$5$1 */
        /* loaded from: classes5.dex */
        public static final class C38211 extends Lambda implements Function2<b$c.C3854g, b$a.C3847h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21686);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38211(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3854g c3854g, b$a.C3847h c3847h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3854g, c3847h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3854g, c3847h);
                return this.$this_state.LIZ(c3854g, b$c.C3855h.LIZ, C89527LPd.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$5$2 */
        /* loaded from: classes5.dex */
        public static final class C38222 extends Lambda implements Function2<b$c.C3854g, b$a.C3846g, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21687);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38222(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3854g c3854g, b$a.C3846g c3846g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3854g, c3846g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3854g, c3846g);
                return this.$this_state.LIZ(c3854g, b$c.C3853f.LIZ, C89525LPb.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$5$3 */
        /* loaded from: classes5.dex */
        public static final class C38233 extends Lambda implements Function2<b$c.C3854g, b$a.C3842c, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21688);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38233(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3854g c3854g, b$a.C3842c c3842c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3854g, c3842c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3854g, c3842c);
                return this.$this_state.LIZ(c3854g, b$c.C3854g.LIZ, LPZ.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$5$4 */
        /* loaded from: classes5.dex */
        public static final class C38244 extends Lambda implements Function2<b$c.C3854g, b$a.C3841b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21689);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38244(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3854g c3854g, b$a.C3841b c3841b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3854g, c3841b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3854g, c3841b);
                return this.$this_state.LIZ(c3854g, b$c.C3849b.LIZ, LPY.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$6 */
    /* loaded from: classes5.dex */
    public static final class C38256 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3853f>, Unit> {
        public static final C38256 INSTANCE = new C38256();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21690);
        }

        public C38256() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3853f> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3853f> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3847h.class), new C38261(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3842c.class), new C38272(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3841b.class), new C38283(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3844e.class), new C38294(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$6$1 */
        /* loaded from: classes5.dex */
        public static final class C38261 extends Lambda implements Function2<b$c.C3853f, b$a.C3847h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21691);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38261(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3853f c3853f, b$a.C3847h c3847h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3853f, c3847h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3853f, c3847h);
                return this.$this_state.LIZ(c3853f, b$c.C3855h.LIZ, C89527LPd.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$6$2 */
        /* loaded from: classes5.dex */
        public static final class C38272 extends Lambda implements Function2<b$c.C3853f, b$a.C3842c, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21692);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38272(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3853f c3853f, b$a.C3842c c3842c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3853f, c3842c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3853f, c3842c);
                return this.$this_state.LIZ(c3853f, b$c.C3854g.LIZ, LPZ.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$6$3 */
        /* loaded from: classes5.dex */
        public static final class C38283 extends Lambda implements Function2<b$c.C3853f, b$a.C3841b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21693);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38283(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3853f c3853f, b$a.C3841b c3841b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3853f, c3841b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3853f, c3841b);
                return this.$this_state.LIZ(c3853f, b$c.C3849b.LIZ, LPY.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$6$4 */
        /* loaded from: classes5.dex */
        public static final class C38294 extends Lambda implements Function2<b$c.C3853f, b$a.C3844e, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21694);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38294(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3853f c3853f, b$a.C3844e c3844e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3853f, c3844e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3853f, c3844e);
                return this.$this_state.LIZ(c3853f, b$c.C3853f.LIZ, C89526LPc.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$7 */
    /* loaded from: classes5.dex */
    public static final class C38307 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3849b>, Unit> {
        public static final C38307 INSTANCE = new C38307();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21695);
        }

        public C38307() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3849b> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C3849b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3845f.class), new C38311(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3841b.class), new C38322(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3847h.class), new C38333(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3846g.class), new C38344(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C3842c.class), new C38355(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$7$1 */
        /* loaded from: classes5.dex */
        public static final class C38311 extends Lambda implements Function2<b$c.C3849b, b$a.C3845f, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21696);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38311(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3849b c3849b, b$a.C3845f c3845f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3849b, c3845f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3849b, c3845f);
                return C103398Qng.C0033a.LIZ(this.$this_state, c3849b, b$c.C3851d.LIZ, null, 2, null);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$7$2 */
        /* loaded from: classes5.dex */
        public static final class C38322 extends Lambda implements Function2<b$c.C3849b, b$a.C3841b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21697);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38322(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3849b c3849b, b$a.C3841b c3841b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3849b, c3841b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3849b, c3841b);
                return this.$this_state.LIZ(c3849b, b$c.C3849b.LIZ, LPY.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$7$3 */
        /* loaded from: classes5.dex */
        public static final class C38333 extends Lambda implements Function2<b$c.C3849b, b$a.C3847h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21698);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38333(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3849b c3849b, b$a.C3847h c3847h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3849b, c3847h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3849b, c3847h);
                return this.$this_state.LIZ(c3849b, b$c.C3855h.LIZ, C89527LPd.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$7$4 */
        /* loaded from: classes5.dex */
        public static final class C38344 extends Lambda implements Function2<b$c.C3849b, b$a.C3846g, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21699);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38344(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3849b c3849b, b$a.C3846g c3846g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3849b, c3846g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3849b, c3846g);
                return this.$this_state.LIZ(c3849b, b$c.C3849b.LIZ, C89525LPb.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppLivePluginState$stateMachine$1$7$5 */
        /* loaded from: classes5.dex */
        public static final class C38355 extends Lambda implements Function2<b$c.C3849b, b$a.C3842c, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(21700);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C38355(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$c, ? extends com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C3849b c3849b, b$a.C3842c c3842c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3849b, c3842c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3849b, c3842c);
                return this.$this_state.LIZ(c3849b, b$c.C3849b.LIZ, LPZ.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b> c103398Qng) {
        C103398Qng<b$c, b$a, b$b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<b$c, b$a, b$b>) b$c.C3850c.LIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3850c.class), C38041.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3851d.class), C38062.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3852e.class), C38113.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3848a.class), C38154.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3854g.class), C38205.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3853f.class), C38256.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3849b.class), C38307.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C3855h.class), C38368.INSTANCE);
            c103398Qng2.LIZ(new C38379());
        }
        return Unit.INSTANCE;
    }
}
