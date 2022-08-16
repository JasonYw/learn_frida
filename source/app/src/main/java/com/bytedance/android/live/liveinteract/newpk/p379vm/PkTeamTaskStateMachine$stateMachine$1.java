package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4675a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4707o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C103396Qne;
import p003X.C103398Qng;
import p003X.C106862S5w;
import p003X.C149311fnH;
import p003X.C149312fnI;
import p003X.C149313fnJ;
import p003X.C149314fnK;
import p003X.C149315fnL;
import p003X.C149316fnM;
import p003X.C149317fnN;
import p003X.C149318fnO;
import p003X.C149319fnP;
import p003X.C149320fnQ;
import p003X.C149321fnR;
import p003X.QL7;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1 */
/* loaded from: classes20.dex */
public final class PkTeamTaskStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $listener;

    static {
        Covode.recordClassIndex(28562);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTeamTaskStateMachine$stateMachine$1(Function1 function1) {
        super(1);
        this.$listener = function1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$10 */
    /* loaded from: classes20.dex */
    public static final class C464110 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4680e>, Unit> {
        public static final C464110 INSTANCE = new C464110();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28585);
        }

        public C464110() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4680e> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4680e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4708a.class), new C46421(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46432(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$10$1 */
        /* loaded from: classes20.dex */
        public static final class C46421 extends Lambda implements Function2<AbstractC4675a.C4680e, AbstractC4707o.C4708a, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28586);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46421(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4680e c4680e, AbstractC4707o.C4708a c4708a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4680e, c4708a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4680e, c4708a);
                return this.$this_state.LIZ(c4680e, AbstractC4675a.C4679d.LIZIZ, C149314fnK.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$10$2 */
        /* loaded from: classes20.dex */
        public static final class C46432 extends Lambda implements Function2<AbstractC4675a.C4680e, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28587);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46432(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4680e c4680e, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4680e, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4680e, c4711d);
                return this.$this_state.LIZ(c4680e, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$11 */
    /* loaded from: classes20.dex */
    public static final class C464411 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4679d>, Unit> {
        public static final C464411 INSTANCE = new C464411();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28588);
        }

        public C464411() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4679d> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4679d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46451(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$11$1 */
        /* loaded from: classes20.dex */
        public static final class C46451 extends Lambda implements Function2<AbstractC4675a.C4679d, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28589);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46451(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4679d c4679d, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4679d, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4679d, c4711d);
                return this.$this_state.LIZ(c4679d, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$2 */
    /* loaded from: classes20.dex */
    public static final class C46462 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4677b>, Unit> {
        public static final C46462 INSTANCE = new C46462();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28590);
        }

        public C46462() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4677b> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4677b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4713f.class), new C46471(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46482(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes20.dex */
        public static final class C46471 extends Lambda implements Function2<AbstractC4675a.C4677b, AbstractC4707o.C4713f, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28591);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46471(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4677b c4677b, AbstractC4707o.C4713f c4713f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4677b, c4713f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4677b, c4713f);
                return this.$this_state.LIZ(c4677b, AbstractC4675a.C4681f.LIZIZ, C149316fnM.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes20.dex */
        public static final class C46482 extends Lambda implements Function2<AbstractC4675a.C4677b, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28592);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46482(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4677b c4677b, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4677b, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4677b, c4711d);
                return this.$this_state.LIZ(c4677b, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$3 */
    /* loaded from: classes20.dex */
    public static final class C46493 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4681f>, Unit> {
        public static final C46493 INSTANCE = new C46493();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28593);
        }

        public C46493() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4681f> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4681f> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4716i.class), new C46501(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46512(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes20.dex */
        public static final class C46501 extends Lambda implements Function2<AbstractC4675a.C4681f, AbstractC4707o.C4716i, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28594);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46501(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4681f c4681f, AbstractC4707o.C4716i c4716i) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4681f, c4716i}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4681f, c4716i);
                return this.$this_state.LIZ(c4681f, AbstractC4675a.C4684i.LIZIZ, C149319fnP.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes20.dex */
        public static final class C46512 extends Lambda implements Function2<AbstractC4675a.C4681f, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28595);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46512(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4681f c4681f, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4681f, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4681f, c4711d);
                return this.$this_state.LIZ(c4681f, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$7 */
    /* loaded from: classes20.dex */
    public static final class C46687 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4683h>, Unit> {
        public static final C46687 INSTANCE = new C46687();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28612);
        }

        public C46687() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4683h> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4683h> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46691(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$7$1 */
        /* loaded from: classes20.dex */
        public static final class C46691 extends Lambda implements Function2<AbstractC4675a.C4683h, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28613);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46691(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4683h c4683h, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4683h, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4683h, c4711d);
                return this.$this_state.LIZ(c4683h, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$8 */
    /* loaded from: classes20.dex */
    public static final class C46708 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4682g>, Unit> {
        public static final C46708 INSTANCE = new C46708();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28614);
        }

        public C46708() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4682g> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4682g> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46711(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$8$1 */
        /* loaded from: classes20.dex */
        public static final class C46711 extends Lambda implements Function2<AbstractC4675a.C4682g, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28615);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46711(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4682g c4682g, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4682g, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4682g, c4711d);
                return this.$this_state.LIZ(c4682g, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$9 */
    /* loaded from: classes20.dex */
    public static final class C46729 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4686k>, Unit> {
        public static final C46729 INSTANCE = new C46729();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28616);
        }

        public C46729() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4686k> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4686k> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4712e.class), new C46731(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46742(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$9$1 */
        /* loaded from: classes20.dex */
        public static final class C46731 extends Lambda implements Function2<AbstractC4675a.C4686k, AbstractC4707o.C4712e, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28617);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46731(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4686k c4686k, AbstractC4707o.C4712e c4712e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4686k, c4712e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4686k, c4712e);
                return this.$this_state.LIZ(c4686k, AbstractC4675a.C4680e.LIZIZ, C149315fnL.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$9$2 */
        /* loaded from: classes20.dex */
        public static final class C46742 extends Lambda implements Function2<AbstractC4675a.C4686k, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28618);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46742(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4686k c4686k, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4686k, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4686k, c4711d);
                return this.$this_state.LIZ(c4686k, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$4 */
    /* loaded from: classes20.dex */
    public static final class C46524 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4684i>, Unit> {
        public static final C46524 INSTANCE = new C46524();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28596);
        }

        public C46524() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4684i> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4684i> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4717j.class), new C46531(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4710c.class), new C46542(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46553(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46564(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes20.dex */
        public static final class C46531 extends Lambda implements Function2<AbstractC4675a.C4684i, AbstractC4707o.C4717j, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28597);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46531(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4684i c4684i, AbstractC4707o.C4717j c4717j) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4684i, c4717j}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4684i, c4717j);
                return this.$this_state.LIZ(c4684i, AbstractC4675a.C4685j.LIZIZ, C149320fnQ.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$4$2 */
        /* loaded from: classes20.dex */
        public static final class C46542 extends Lambda implements Function2<AbstractC4675a.C4684i, AbstractC4707o.C4710c, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28598);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46542(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4684i c4684i, AbstractC4707o.C4710c c4710c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4684i, c4710c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4684i, c4710c);
                return this.$this_state.LIZ(c4684i, AbstractC4675a.C4678c.LIZIZ, C149313fnJ.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$4$3 */
        /* loaded from: classes20.dex */
        public static final class C46553 extends Lambda implements Function2<AbstractC4675a.C4684i, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28599);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46553(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4684i c4684i, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4684i, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4684i, c4711d);
                return this.$this_state.LIZ(c4684i, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$4$4 */
        /* loaded from: classes20.dex */
        public static final class C46564 extends Lambda implements Function2<AbstractC4675a.C4684i, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28600);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46564(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4684i c4684i, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4684i, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4684i, c4711d);
                return this.$this_state.LIZ(c4684i, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$5 */
    /* loaded from: classes20.dex */
    public static final class C46575 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4685j>, Unit> {
        public static final C46575 INSTANCE = new C46575();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28601);
        }

        public C46575() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4685j> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4685j> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4715h.class), new C46581(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4714g.class), new C46592(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4718k.class), new C46603(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4712e.class), new C46614(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46625(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$5$1 */
        /* loaded from: classes20.dex */
        public static final class C46581 extends Lambda implements Function2<AbstractC4675a.C4685j, AbstractC4707o.C4715h, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28602);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46581(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4685j c4685j, AbstractC4707o.C4715h c4715h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4685j, c4715h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4685j, c4715h);
                return this.$this_state.LIZ(c4685j, AbstractC4675a.C4683h.LIZIZ, C149318fnO.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$5$2 */
        /* loaded from: classes20.dex */
        public static final class C46592 extends Lambda implements Function2<AbstractC4675a.C4685j, AbstractC4707o.C4714g, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28603);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46592(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4685j c4685j, AbstractC4707o.C4714g c4714g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4685j, c4714g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4685j, c4714g);
                return this.$this_state.LIZ(c4685j, AbstractC4675a.C4682g.LIZIZ, C149317fnN.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$5$3 */
        /* loaded from: classes20.dex */
        public static final class C46603 extends Lambda implements Function2<AbstractC4675a.C4685j, AbstractC4707o.C4718k, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28604);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46603(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4685j c4685j, AbstractC4707o.C4718k c4718k) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4685j, c4718k}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4685j, c4718k);
                return this.$this_state.LIZ(c4685j, AbstractC4675a.C4686k.LIZIZ, C149321fnR.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$5$4 */
        /* loaded from: classes20.dex */
        public static final class C46614 extends Lambda implements Function2<AbstractC4675a.C4685j, AbstractC4707o.C4712e, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28605);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46614(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4685j c4685j, AbstractC4707o.C4712e c4712e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4685j, c4712e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4685j, c4712e);
                return this.$this_state.LIZ(c4685j, AbstractC4675a.C4680e.LIZIZ, C149315fnL.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$5$5 */
        /* loaded from: classes20.dex */
        public static final class C46625 extends Lambda implements Function2<AbstractC4675a.C4685j, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28606);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46625(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4685j c4685j, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4685j, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4685j, c4711d);
                return this.$this_state.LIZ(c4685j, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$6 */
    /* loaded from: classes20.dex */
    public static final class C46636 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4678c>, Unit> {
        public static final C46636 INSTANCE = new C46636();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28607);
        }

        public C46636() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4678c> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4678c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4715h.class), new C46641(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4714g.class), new C46652(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46663(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C46674(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$6$1 */
        /* loaded from: classes20.dex */
        public static final class C46641 extends Lambda implements Function2<AbstractC4675a.C4678c, AbstractC4707o.C4715h, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28608);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46641(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4678c c4678c, AbstractC4707o.C4715h c4715h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4678c, c4715h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4678c, c4715h);
                return this.$this_state.LIZ(c4678c, AbstractC4675a.C4683h.LIZIZ, C149318fnO.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$6$2 */
        /* loaded from: classes20.dex */
        public static final class C46652 extends Lambda implements Function2<AbstractC4675a.C4678c, AbstractC4707o.C4714g, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28609);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46652(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4678c c4678c, AbstractC4707o.C4714g c4714g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4678c, c4714g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4678c, c4714g);
                return this.$this_state.LIZ(c4678c, AbstractC4675a.C4682g.LIZIZ, C149317fnN.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$6$3 */
        /* loaded from: classes20.dex */
        public static final class C46663 extends Lambda implements Function2<AbstractC4675a.C4678c, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28610);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46663(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4678c c4678c, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4678c, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4678c, c4711d);
                return this.$this_state.LIZ(c4678c, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$6$4 */
        /* loaded from: classes20.dex */
        public static final class C46674 extends Lambda implements Function2<AbstractC4675a.C4678c, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28611);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46674(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4678c c4678c, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4678c, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4678c, c4711d);
                return this.$this_state.LIZ(c4678c, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1 */
    /* loaded from: classes20.dex */
    public static final class C46301 extends Lambda implements Function1<C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4676a>, Unit> {
        public static final C46301 INSTANCE = new C46301();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28574);
        }

        public C46301() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4676a> c0033a) {
            C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>.C0033a<AbstractC4675a.C4676a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4709b.class), new C46311(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4713f.class), new C46332(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4716i.class), new C46343(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4717j.class), new C46354(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4715h.class), new C46365(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4714g.class), new C46376(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4718k.class), new C46387(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4712e.class), new C46398(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4708a.class), new C46409(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4707o.C4711d.class), new C463210(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes20.dex */
        public static final class C46311 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4709b, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28575);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46311(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4709b c4709b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4709b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4709b);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4677b.LIZIZ, C149312fnI.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$10 */
        /* loaded from: classes20.dex */
        public static final class C463210 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4711d, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28576);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C463210(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4711d c4711d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4711d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4711d);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4676a.LIZIZ, C149311fnH.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes20.dex */
        public static final class C46332 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4713f, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28577);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46332(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4713f c4713f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4713f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4713f);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4681f.LIZIZ, C149316fnM.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes20.dex */
        public static final class C46343 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4716i, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28578);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46343(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4716i c4716i) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4716i}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4716i);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4684i.LIZIZ, C149319fnP.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$4 */
        /* loaded from: classes20.dex */
        public static final class C46354 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4717j, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28579);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46354(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4717j c4717j) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4717j}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4717j);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4685j.LIZIZ, C149320fnQ.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$5 */
        /* loaded from: classes20.dex */
        public static final class C46365 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4715h, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28580);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46365(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4715h c4715h) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4715h}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4715h);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4683h.LIZIZ, C149318fnO.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$6 */
        /* loaded from: classes20.dex */
        public static final class C46376 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4714g, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28581);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46376(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4714g c4714g) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4714g}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4714g);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4682g.LIZIZ, C149317fnN.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$7 */
        /* loaded from: classes20.dex */
        public static final class C46387 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4718k, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28582);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46387(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4718k c4718k) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4718k}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4718k);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4686k.LIZIZ, C149321fnR.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$8 */
        /* loaded from: classes20.dex */
        public static final class C46398 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4712e, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28583);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46398(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4712e c4712e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4712e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4712e);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4680e.LIZIZ, C149315fnL.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$1$9 */
        /* loaded from: classes20.dex */
        public static final class C46409 extends Lambda implements Function2<AbstractC4675a.C4676a, AbstractC4707o.C4708a, C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28584);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46409(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.a, ? extends com.bytedance.android.live.liveinteract.newpk.vm.p>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4675a, ? extends AbstractC4719p> invoke(AbstractC4675a.C4676a c4676a, AbstractC4707o.C4708a c4708a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4676a, c4708a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4676a, c4708a);
                return this.$this_state.LIZ(c4676a, AbstractC4675a.C4679d.LIZIZ, C149314fnK.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p> c103398Qng) {
        C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<AbstractC4675a, AbstractC4707o, AbstractC4719p>) AbstractC4675a.C4676a.LIZIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4676a.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$1(AbstractC4675a.C4676a.LIZIZ)), C46301.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4677b.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$2(AbstractC4675a.C4677b.LIZIZ)), C46462.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4681f.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$3(AbstractC4675a.C4681f.LIZIZ)), C46493.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4684i.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$4(AbstractC4675a.C4684i.LIZIZ)), C46524.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4685j.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$5(AbstractC4675a.C4685j.LIZIZ)), C46575.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4678c.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$6(AbstractC4675a.C4678c.LIZIZ)), C46636.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4683h.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$7(AbstractC4675a.C4683h.LIZIZ)), C46687.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4682g.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$8(AbstractC4675a.C4682g.LIZIZ)), C46708.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4686k.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$9(AbstractC4675a.C4686k.LIZIZ)), C46729.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4680e.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$10(AbstractC4675a.C4680e.LIZIZ)), C464110.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4675a.C4679d.class).LIZ((Function1) new PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$11(AbstractC4675a.C4679d.LIZIZ)), C464411.INSTANCE);
            c103398Qng2.LIZ(this.$listener);
        }
        return Unit.INSTANCE;
    }
}
