package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.runtime.v$a;
import com.bytedance.android.live.broadcastgame.opengame.runtime.v$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
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
import p003X.C103387QnV;
import p003X.C103396Qne;
import p003X.C103398Qng;
import p003X.C106862S5w;
import p003X.C2WD;
import p003X.C87632Kfy;
import p003X.C87911KkT;
import p003X.LK1;
import p003X.LPR;
import p003X.LPS;
import p003X.LPT;
import p003X.LPU;
import p003X.LPV;
import p003X.LPW;
import p003X.LPX;
import p003X.QL7;

/* loaded from: classes5.dex */
public final class LivePluginState$stateMachine$1 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LPR this$0;

    static {
        Covode.recordClassIndex(20851);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePluginState$stateMachine$1(LPR lpr) {
        super(1);
        this.this$0 = lpr;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$9 */
    /* loaded from: classes5.dex */
    public static final class C36559 extends Lambda implements Function1<AbstractC103391QnZ<? extends v$c, ? extends v$a, ? extends v$b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20886);
        }

        public C36559() {
            super(1);
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$9$1 */
        /* loaded from: classes5.dex */
        public static final class C36561 extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ String $error;
            public final /* synthetic */ v$a $event;
            public final /* synthetic */ C103385QnT $validTransition;

            static {
                Covode.recordClassIndex(20887);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36561(v$a v_a, C103385QnT c103385QnT, String str) {
                super(0);
                this.$event = v_a;
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
                    v$a v_a = this.$event;
                    if (v_a instanceof v$a.C3666a) {
                        if (z_c instanceof C87632Kfy) {
                            ((C87632Kfy) z_c).LIZIZ = true;
                        } else {
                            z_c = new C87632Kfy(false, true, false, 5);
                        }
                        AbstractC87170KWm LIZ2 = AbstractC87170KWm.LJI.LIZ();
                        if (LIZ2 != null && (LJJI2 = LIZ2.LJJI()) != null) {
                            LJJI2.LIZ(z_c);
                        }
                    } else if (v_a instanceof v$a.C3670e) {
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
                    if (Intrinsics.areEqual(side_effect, LPU.LIZ)) {
                        LivePluginState$stateMachine$1.this.this$0.LIZJ.LIZLLL();
                    } else if (Intrinsics.areEqual(side_effect, LPW.LIZ)) {
                        LivePluginState$stateMachine$1.this.this$0.LIZJ.mo15832LJ();
                    } else if (Intrinsics.areEqual(side_effect, LPX.LIZ)) {
                        LivePluginState$stateMachine$1.this.this$0.LIZJ.LJFF();
                    } else if (Intrinsics.areEqual(side_effect, LPV.LIZ)) {
                        AbstractC3663l abstractC3663l = LivePluginState$stateMachine$1.this.this$0.LIZJ;
                        v$a v_a2 = this.$event;
                        if (!(v_a2 instanceof v$a.C3672g)) {
                            v_a2 = null;
                        }
                        v$a.C3672g c3672g = (v$a.C3672g) v_a2;
                        if (c3672g != null) {
                            map = c3672g.LIZ;
                        }
                        abstractC3663l.LIZ(map);
                    } else if (Intrinsics.areEqual(side_effect, LPT.LIZ)) {
                        LivePluginState$stateMachine$1.this.this$0.LIZJ.LJI();
                    } else if (Intrinsics.areEqual(side_effect, LPS.LIZ)) {
                        LivePluginState$stateMachine$1.this.this$0.LIZJ.LIZ(this.$error);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends v$c, ? extends v$a, ? extends v$b> abstractC103391QnZ) {
            AbstractC103391QnZ<? extends v$c, ? extends v$a, ? extends v$b> abstractC103391QnZ2;
            v$a LIZIZ;
            String str;
            AbstractC103391QnZ<? extends v$c, ? extends v$a, ? extends v$b> abstractC103391QnZ3 = abstractC103391QnZ;
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ3}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ3);
                if (abstractC103391QnZ3 instanceof C103387QnV) {
                    C87911KkT.LIZ(C87911KkT.LIZIZ, "livePluginState error " + abstractC103391QnZ3.LIZ() + LoggerUtil.BLANK_TAG + abstractC103391QnZ3.LIZIZ(), null, 2, null);
                }
                boolean z = abstractC103391QnZ3 instanceof C103385QnT;
                if (!z) {
                    abstractC103391QnZ2 = null;
                } else {
                    abstractC103391QnZ2 = abstractC103391QnZ3;
                }
                C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ2;
                if (c103385QnT != null) {
                    if (!z) {
                        abstractC103391QnZ3 = null;
                    }
                    if (abstractC103391QnZ3 != null && (LIZIZ = abstractC103391QnZ3.LIZIZ()) != null) {
                        Function1<v$a, Unit> function1 = LivePluginState$stateMachine$1.this.this$0.LIZLLL;
                        if (function1 != null) {
                            function1.invoke(LIZIZ);
                        }
                        if (LIZIZ instanceof v$a.C3667b) {
                            str = ((v$a.C3667b) LIZIZ).LIZ;
                        } else {
                            str = "";
                        }
                        if (LIZIZ instanceof v$a.C3666a) {
                            LivePluginState$stateMachine$1.this.this$0.LIZIZ.LJIIJ = ((v$a.C3666a) LIZIZ).LIZ;
                        }
                        if (LIZIZ instanceof v$a.C3670e) {
                            LivePluginState$stateMachine$1.this.this$0.LIZIZ.LJIIJJI = ((v$a.C3670e) LIZIZ).LIZ;
                        }
                        LK1.LIZ(0L, false, false, new C36561(LIZIZ, c103385QnT, str), 7, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$8 */
    /* loaded from: classes5.dex */
    public static final class C36548 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3681h>, Unit> {
        public static final C36548 INSTANCE = new C36548();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20885);
        }

        public C36548() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3681h> c0033a) {
            if (!PatchProxy.proxy(new Object[]{c0033a}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$1 */
    /* loaded from: classes5.dex */
    public static final class C36211 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3676c>, Unit> {
        public static final C36211 INSTANCE = new C36211();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20852);
        }

        public C36211() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3676c> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3676c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3669d.class), new C36221(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$1$1 */
        /* loaded from: classes5.dex */
        public static final class C36221 extends Lambda implements Function2<v$c.C3676c, v$a.C3669d, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20853);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36221(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3676c c3676c, v$a.C3669d c3669d) {
                C2WD<z$c> LJJI;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3676c, c3669d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3676c, c3669d);
                AbstractC87170KWm LIZ = AbstractC87170KWm.LJI.LIZ();
                if (LIZ != null && (LJJI = LIZ.LJJI()) != null) {
                    LJJI.LIZ(new C87632Kfy(false, false, false));
                }
                return this.$this_state.LIZ(c3676c, v$c.C3677d.LIZ, LPU.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$2 */
    /* loaded from: classes5.dex */
    public static final class C36232 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3677d>, Unit> {
        public static final C36232 INSTANCE = new C36232();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20854);
        }

        public C36232() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3677d> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3677d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3670e.class), new C36241(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3666a.class), new C36252(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3667b.class), new C36263(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3673h.class), new C36274(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$2$1 */
        /* loaded from: classes5.dex */
        public static final class C36241 extends Lambda implements Function2<v$c.C3677d, v$a.C3670e, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20855);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36241(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3677d c3677d, v$a.C3670e c3670e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3677d, c3670e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3677d, c3670e);
                return C103398Qng.C0033a.LIZ(this.$this_state, c3677d, v$c.C3678e.LIZ, null, 2, null);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$2$2 */
        /* loaded from: classes5.dex */
        public static final class C36252 extends Lambda implements Function2<v$c.C3677d, v$a.C3666a, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20856);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36252(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3677d c3677d, v$a.C3666a c3666a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3677d, c3666a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3677d, c3666a);
                return C103398Qng.C0033a.LIZ(this.$this_state, c3677d, v$c.C3674a.LIZ, null, 2, null);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$2$3 */
        /* loaded from: classes5.dex */
        public static final class C36263 extends Lambda implements Function2<v$c.C3677d, v$a.C3667b, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20857);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36263(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3677d c3677d, v$a.C3667b c3667b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3677d, c3667b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3677d, c3667b);
                return this.$this_state.LIZ(c3677d, v$c.C3675b.LIZ, LPS.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$2$4 */
        /* loaded from: classes5.dex */
        public static final class C36274 extends Lambda implements Function2<v$c.C3677d, v$a.C3673h, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20858);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36274(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3677d c3677d, v$a.C3673h c3673h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3677d, c3673h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3677d, c3673h);
                return this.$this_state.LIZ(c3677d, v$c.C3681h.LIZ, LPX.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$3 */
    /* loaded from: classes5.dex */
    public static final class C36283 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3678e>, Unit> {
        public static final C36283 INSTANCE = new C36283();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20859);
        }

        public C36283() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3678e> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3678e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3666a.class), new C36291(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3673h.class), new C36302(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3667b.class), new C36313(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$3$1 */
        /* loaded from: classes5.dex */
        public static final class C36291 extends Lambda implements Function2<v$c.C3678e, v$a.C3666a, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20860);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36291(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3678e c3678e, v$a.C3666a c3666a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3678e, c3666a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3678e, c3666a);
                return this.$this_state.LIZ(c3678e, v$c.C3680g.LIZ, LPW.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$3$2 */
        /* loaded from: classes5.dex */
        public static final class C36302 extends Lambda implements Function2<v$c.C3678e, v$a.C3673h, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20861);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36302(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3678e c3678e, v$a.C3673h c3673h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3678e, c3673h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3678e, c3673h);
                return this.$this_state.LIZ(c3678e, v$c.C3681h.LIZ, LPX.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$3$3 */
        /* loaded from: classes5.dex */
        public static final class C36313 extends Lambda implements Function2<v$c.C3678e, v$a.C3667b, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20862);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36313(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3678e c3678e, v$a.C3667b c3667b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3678e, c3667b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3678e, c3667b);
                return this.$this_state.LIZ(c3678e, v$c.C3675b.LIZ, LPS.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$4 */
    /* loaded from: classes5.dex */
    public static final class C36324 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3674a>, Unit> {
        public static final C36324 INSTANCE = new C36324();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20863);
        }

        public C36324() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3674a> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3674a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3670e.class), new C36331(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3673h.class), new C36342(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3667b.class), new C36353(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3672g.class), new C36364(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$4$1 */
        /* loaded from: classes5.dex */
        public static final class C36331 extends Lambda implements Function2<v$c.C3674a, v$a.C3670e, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20864);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36331(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3674a c3674a, v$a.C3670e c3670e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3674a, c3670e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3674a, c3670e);
                return this.$this_state.LIZ(c3674a, v$c.C3680g.LIZ, LPW.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$4$2 */
        /* loaded from: classes5.dex */
        public static final class C36342 extends Lambda implements Function2<v$c.C3674a, v$a.C3673h, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20865);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36342(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3674a c3674a, v$a.C3673h c3673h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3674a, c3673h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3674a, c3673h);
                return this.$this_state.LIZ(c3674a, v$c.C3681h.LIZ, LPX.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$4$3 */
        /* loaded from: classes5.dex */
        public static final class C36353 extends Lambda implements Function2<v$c.C3674a, v$a.C3667b, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20866);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36353(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3674a c3674a, v$a.C3667b c3667b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3674a, c3667b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3674a, c3667b);
                return this.$this_state.LIZ(c3674a, v$c.C3675b.LIZ, LPS.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$4$4 */
        /* loaded from: classes5.dex */
        public static final class C36364 extends Lambda implements Function2<v$c.C3674a, v$a.C3672g, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20867);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36364(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3674a c3674a, v$a.C3672g c3672g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3674a, c3672g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3674a, c3672g);
                return this.$this_state.LIZ(c3674a, v$c.C3679f.LIZ, LPV.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$5 */
    /* loaded from: classes5.dex */
    public static final class C36375 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3680g>, Unit> {
        public static final C36375 INSTANCE = new C36375();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20868);
        }

        public C36375() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3680g> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3680g> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3673h.class), new C36381(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3672g.class), new C36392(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3668c.class), new C36403(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3667b.class), new C36414(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$5$1 */
        /* loaded from: classes5.dex */
        public static final class C36381 extends Lambda implements Function2<v$c.C3680g, v$a.C3673h, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20869);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36381(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3680g c3680g, v$a.C3673h c3673h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3680g, c3673h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3680g, c3673h);
                return this.$this_state.LIZ(c3680g, v$c.C3681h.LIZ, LPX.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$5$2 */
        /* loaded from: classes5.dex */
        public static final class C36392 extends Lambda implements Function2<v$c.C3680g, v$a.C3672g, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20870);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36392(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3680g c3680g, v$a.C3672g c3672g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3680g, c3672g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3680g, c3672g);
                return this.$this_state.LIZ(c3680g, v$c.C3679f.LIZ, LPV.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$5$3 */
        /* loaded from: classes5.dex */
        public static final class C36403 extends Lambda implements Function2<v$c.C3680g, v$a.C3668c, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20871);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36403(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3680g c3680g, v$a.C3668c c3668c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3680g, c3668c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3680g, c3668c);
                return this.$this_state.LIZ(c3680g, v$c.C3680g.LIZ, LPT.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$5$4 */
        /* loaded from: classes5.dex */
        public static final class C36414 extends Lambda implements Function2<v$c.C3680g, v$a.C3667b, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20872);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36414(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3680g c3680g, v$a.C3667b c3667b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3680g, c3667b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3680g, c3667b);
                return this.$this_state.LIZ(c3680g, v$c.C3675b.LIZ, LPS.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$6 */
    /* loaded from: classes5.dex */
    public static final class C36426 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3679f>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20873);
        }

        public C36426() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3679f> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3679f> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3673h.class), new C36431(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3668c.class), new C36442(c0033a2));
                if (LivePluginState$stateMachine$1.this.this$0.LIZIZ.LJIILIIL == PluginType.SONIC_GAME) {
                    c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3672g.class), new C36453(c0033a2));
                }
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3667b.class), new C36464(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3670e.class), new C36475(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$6$1 */
        /* loaded from: classes5.dex */
        public static final class C36431 extends Lambda implements Function2<v$c.C3679f, v$a.C3673h, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20874);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36431(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3679f c3679f, v$a.C3673h c3673h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3679f, c3673h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3679f, c3673h);
                return this.$this_state.LIZ(c3679f, v$c.C3681h.LIZ, LPX.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$6$2 */
        /* loaded from: classes5.dex */
        public static final class C36442 extends Lambda implements Function2<v$c.C3679f, v$a.C3668c, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20875);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36442(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3679f c3679f, v$a.C3668c c3668c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3679f, c3668c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3679f, c3668c);
                return this.$this_state.LIZ(c3679f, v$c.C3680g.LIZ, LPT.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$6$3 */
        /* loaded from: classes5.dex */
        public static final class C36453 extends Lambda implements Function2<v$c.C3679f, v$a.C3672g, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20876);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36453(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3679f c3679f, v$a.C3672g c3672g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3679f, c3672g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3679f, c3672g);
                return this.$this_state.LIZ(c3679f, v$c.C3679f.LIZ, LPV.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$6$4 */
        /* loaded from: classes5.dex */
        public static final class C36464 extends Lambda implements Function2<v$c.C3679f, v$a.C3667b, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20877);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36464(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3679f c3679f, v$a.C3667b c3667b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3679f, c3667b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3679f, c3667b);
                return this.$this_state.LIZ(c3679f, v$c.C3675b.LIZ, LPS.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$6$5 */
        /* loaded from: classes5.dex */
        public static final class C36475 extends Lambda implements Function2<v$c.C3679f, v$a.C3670e, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20878);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36475(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3679f c3679f, v$a.C3670e c3670e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3679f, c3670e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3679f, c3670e);
                return this.$this_state.LIZ(c3679f, v$c.C3679f.LIZ, LPW.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$7 */
    /* loaded from: classes5.dex */
    public static final class C36487 extends Lambda implements Function1<C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3675b>, Unit> {
        public static final C36487 INSTANCE = new C36487();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(20879);
        }

        public C36487() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3675b> c0033a) {
            C103398Qng<v$c, v$a, v$b>.C0033a<v$c.C3675b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3671f.class), new C36491(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3667b.class), new C36502(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3673h.class), new C36513(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3672g.class), new C36524(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(v$a.C3668c.class), new C36535(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$7$1 */
        /* loaded from: classes5.dex */
        public static final class C36491 extends Lambda implements Function2<v$c.C3675b, v$a.C3671f, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20880);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36491(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3675b c3675b, v$a.C3671f c3671f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3675b, c3671f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3675b, c3671f);
                return C103398Qng.C0033a.LIZ(this.$this_state, c3675b, v$c.C3677d.LIZ, null, 2, null);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$7$2 */
        /* loaded from: classes5.dex */
        public static final class C36502 extends Lambda implements Function2<v$c.C3675b, v$a.C3667b, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20881);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36502(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3675b c3675b, v$a.C3667b c3667b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3675b, c3667b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3675b, c3667b);
                return this.$this_state.LIZ(c3675b, v$c.C3675b.LIZ, LPS.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$7$3 */
        /* loaded from: classes5.dex */
        public static final class C36513 extends Lambda implements Function2<v$c.C3675b, v$a.C3673h, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20882);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36513(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3675b c3675b, v$a.C3673h c3673h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3675b, c3673h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3675b, c3673h);
                return this.$this_state.LIZ(c3675b, v$c.C3681h.LIZ, LPX.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$7$4 */
        /* loaded from: classes5.dex */
        public static final class C36524 extends Lambda implements Function2<v$c.C3675b, v$a.C3672g, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20883);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36524(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3675b c3675b, v$a.C3672g c3672g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3675b, c3672g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3675b, c3672g);
                return this.$this_state.LIZ(c3675b, v$c.C3675b.LIZ, LPV.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.LivePluginState$stateMachine$1$7$5 */
        /* loaded from: classes5.dex */
        public static final class C36535 extends Lambda implements Function2<v$c.C3675b, v$a.C3668c, C103396Qne<? extends v$c, ? extends v$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(20884);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C36535(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$c, ? extends com.bytedance.android.live.broadcastgame.opengame.runtime.v$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends v$c, ? extends v$b> invoke(v$c.C3675b c3675b, v$a.C3668c c3668c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3675b, c3668c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3675b, c3668c);
                return this.$this_state.LIZ(c3675b, v$c.C3675b.LIZ, LPT.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<v$c, v$a, v$b> c103398Qng) {
        C103398Qng<v$c, v$a, v$b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<v$c, v$a, v$b>) v$c.C3676c.LIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3676c.class), C36211.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3677d.class), C36232.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3678e.class), C36283.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3674a.class), C36324.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3680g.class), C36375.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3679f.class), new C36426());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3675b.class), C36487.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(v$c.C3681h.class), C36548.INSTANCE);
            c103398Qng2.LIZ(new C36559());
        }
        return Unit.INSTANCE;
    }
}
