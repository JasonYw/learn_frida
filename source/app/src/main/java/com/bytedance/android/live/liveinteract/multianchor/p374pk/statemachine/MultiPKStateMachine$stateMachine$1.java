package com.bytedance.android.live.liveinteract.multianchor.p374pk.statemachine;

import com.bytedance.android.live.liveinteract.multianchor.p374pk.statemachine.MultiPKStateMachine;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC103391QnZ;
import p003X.C103396Qne;
import p003X.C103398Qng;
import p003X.C106862S5w;
import p003X.C79503HVp;
import p003X.C79511HVx;
import p003X.HWK;
import p003X.HWN;
import p003X.HWO;
import p003X.HWP;
import p003X.QL7;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1 */
/* loaded from: classes3.dex */
public final class MultiPKStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MultiPKStateMachine this$0;

    static {
        Covode.recordClassIndex(28248);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPKStateMachine$stateMachine$1(MultiPKStateMachine multiPKStateMachine) {
        super(1);
        this.this$0 = multiPKStateMachine;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$5 */
    /* loaded from: classes3.dex */
    public static final class C45655 extends Lambda implements Function1<AbstractC103391QnZ<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4538a, ? extends MultiPKStateMachine.AbstractC4544b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28264);
        }

        public C45655() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4538a, ? extends MultiPKStateMachine.AbstractC4544b> abstractC103391QnZ) {
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ);
                MultiPKStateMachine$stateMachine$1.this.this$0.LIZJ.invoke(abstractC103391QnZ);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C45634 extends Lambda implements Function1<C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4547b>, Unit> {
        public static final C45634 INSTANCE = new C45634();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28262);
        }

        public C45634() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4547b> c0033a) {
            C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4547b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4541c.class), new C45641(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C45641 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4547b, MultiPKStateMachine.AbstractC4538a.C4541c, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28263);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45641(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4547b c4547b, MultiPKStateMachine.AbstractC4538a.C4541c c4541c) {
                MultiPKStateMachine.AbstractC4538a.C4541c c4541c2 = c4541c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4547b, c4541c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4547b, c4541c2);
                return this.$this_state.LIZ(c4547b, new MultiPKStateMachine.AbstractC4545c.C4548c(c4541c2.LIZLLL, c4541c2.LIZIZ), new HWN(c4541c2.LIZLLL, false));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C45501 extends Lambda implements Function1<C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4546a>, Unit> {
        public static final C45501 INSTANCE = new C45501();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28249);
        }

        public C45501() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4546a> c0033a) {
            C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4546a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4541c.class), new C45511(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4540b.class), new C45522(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4543e.class), new C45533(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4539a.class), new C45544(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C45511 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4546a, MultiPKStateMachine.AbstractC4538a.C4541c, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28250);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45511(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4546a c4546a, MultiPKStateMachine.AbstractC4538a.C4541c c4541c) {
                MultiPKStateMachine.AbstractC4538a.C4541c c4541c2 = c4541c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4546a, c4541c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4546a, c4541c2);
                return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4548c(c4541c2.LIZLLL, c4541c2.LIZIZ), new HWN(c4541c2.LIZLLL, false));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$1$4 */
        /* loaded from: classes3.dex */
        public static final class C45544 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4546a, MultiPKStateMachine.AbstractC4538a.C4539a, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28253);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45544(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4546a c4546a, MultiPKStateMachine.AbstractC4538a.C4539a c4539a) {
                MultiPKStateMachine.AbstractC4538a.C4539a c4539a2 = c4539a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4546a, c4539a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4546a, c4539a2);
                return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4547b(new C79511HVx(), c4539a2.LIZIZ), new HWO(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C45522 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4546a, MultiPKStateMachine.AbstractC4538a.C4540b, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28251);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45522(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4546a c4546a, MultiPKStateMachine.AbstractC4538a.C4540b c4540b) {
                MultiPKStateMachine.AbstractC4538a.C4540b c4540b2 = c4540b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4546a, c4540b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4546a, c4540b2);
                if (c4540b2.LIZLLL.LJFF > 0) {
                    if (c4540b2.LIZLLL.LIZ() > 0) {
                        return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4549d(c4540b2.LIZLLL, c4540b2.LIZIZ), new HWP(c4540b2.LIZLLL));
                    }
                    return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4547b(c4540b2.LIZLLL, c4540b2.LIZIZ), new HWO(false, 1));
                }
                return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4548c(c4540b2.LIZLLL, c4540b2.LIZIZ), new HWN(c4540b2.LIZLLL, false));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C45533 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4546a, MultiPKStateMachine.AbstractC4538a.C4543e, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28252);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45533(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4546a c4546a, MultiPKStateMachine.AbstractC4538a.C4543e c4543e) {
                MultiPKStateMachine.AbstractC4538a.C4543e c4543e2 = c4543e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4546a, c4543e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4546a, c4543e2);
                if (c4543e2.f26359LJ) {
                    int i = HWK.LIZ[c4543e2.LIZIZ.ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4547b(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWO(false, 1));
                    }
                    return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4549d(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWP(c4543e2.LIZLLL));
                }
                return this.$this_state.LIZ(c4546a, new MultiPKStateMachine.AbstractC4545c.C4547b(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWO(false, 1));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C45552 extends Lambda implements Function1<C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4548c>, Unit> {
        public static final C45552 INSTANCE = new C45552();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28254);
        }

        public C45552() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4548c> c0033a) {
            C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4548c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4541c.class), new C45561(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4543e.class), new C45572(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4539a.class), new C45583(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C45561 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4548c, MultiPKStateMachine.AbstractC4538a.C4541c, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28255);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45561(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4548c c4548c, MultiPKStateMachine.AbstractC4538a.C4541c c4541c) {
                MultiPKStateMachine.AbstractC4538a.C4541c c4541c2 = c4541c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4548c, c4541c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4548c, c4541c2);
                return this.$this_state.LIZ(c4548c, new MultiPKStateMachine.AbstractC4545c.C4548c(c4541c2.LIZLLL, c4541c2.LIZIZ), new HWN(c4541c2.LIZLLL, true));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C45583 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4548c, MultiPKStateMachine.AbstractC4538a.C4539a, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28257);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45583(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4548c c4548c, MultiPKStateMachine.AbstractC4538a.C4539a c4539a) {
                MultiPKStateMachine.AbstractC4538a.C4539a c4539a2 = c4539a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4548c, c4539a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4548c, c4539a2);
                return this.$this_state.LIZ(c4548c, new MultiPKStateMachine.AbstractC4545c.C4547b(new C79511HVx(), c4539a2.LIZIZ), new HWO(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C45572 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4548c, MultiPKStateMachine.AbstractC4538a.C4543e, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28256);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45572(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4548c c4548c, MultiPKStateMachine.AbstractC4538a.C4543e c4543e) {
                C79503HVp c79503HVp;
                MultiPKStateMachine.AbstractC4538a.C4543e c4543e2 = c4543e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4548c, c4543e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4548c, c4543e2);
                if (c4543e2.f26359LJ) {
                    int i = HWK.LIZIZ[c4543e2.LIZIZ.ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        return this.$this_state.LIZ(c4548c, new MultiPKStateMachine.AbstractC4545c.C4547b(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWO(false, 1));
                    }
                    C79511HVx c79511HVx = c4543e2.LIZLLL;
                    if (c79511HVx != null && (c79503HVp = c79511HVx.LIZIZ) != null && c79503HVp.m23738LJ()) {
                        return this.$this_state.LIZ(c4548c, new MultiPKStateMachine.AbstractC4545c.C4547b(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWO(true));
                    }
                    return this.$this_state.LIZ(c4548c, new MultiPKStateMachine.AbstractC4545c.C4549d(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWP(c4543e2.LIZLLL));
                }
                return this.$this_state.LIZ(c4548c, new MultiPKStateMachine.AbstractC4545c.C4547b(c4543e2.LIZLLL, c4543e2.LIZIZ), new HWO(false, 1));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C45593 extends Lambda implements Function1<C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4549d>, Unit> {
        public static final C45593 INSTANCE = new C45593();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28258);
        }

        public C45593() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4549d> c0033a) {
            C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>.C0033a<MultiPKStateMachine.AbstractC4545c.C4549d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4541c.class), new C45601(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4542d.class), new C45612(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4538a.C4539a.class), new C45623(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C45601 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4549d, MultiPKStateMachine.AbstractC4538a.C4541c, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28259);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45601(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4549d c4549d, MultiPKStateMachine.AbstractC4538a.C4541c c4541c) {
                MultiPKStateMachine.AbstractC4538a.C4541c c4541c2 = c4541c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4549d, c4541c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4549d, c4541c2);
                return this.$this_state.LIZ(c4549d, new MultiPKStateMachine.AbstractC4545c.C4548c(c4541c2.LIZLLL, c4541c2.LIZIZ), new HWN(c4541c2.LIZLLL, true));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C45612 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4549d, MultiPKStateMachine.AbstractC4538a.C4542d, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28260);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45612(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4549d c4549d, MultiPKStateMachine.AbstractC4538a.C4542d c4542d) {
                MultiPKStateMachine.AbstractC4538a.C4542d c4542d2 = c4542d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4549d, c4542d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4549d, c4542d2);
                return this.$this_state.LIZ(c4549d, new MultiPKStateMachine.AbstractC4545c.C4547b(new C79511HVx(), c4542d2.LIZIZ), new HWO(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$stateMachine$1$3$3 */
        /* loaded from: classes3.dex */
        public static final class C45623 extends Lambda implements Function2<MultiPKStateMachine.AbstractC4545c.C4549d, MultiPKStateMachine.AbstractC4538a.C4539a, C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28261);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45623(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$c, ? extends com.bytedance.android.live.liveinteract.multianchor.pk.statemachine.MultiPKStateMachine$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends MultiPKStateMachine.AbstractC4545c, ? extends MultiPKStateMachine.AbstractC4544b> invoke(MultiPKStateMachine.AbstractC4545c.C4549d c4549d, MultiPKStateMachine.AbstractC4538a.C4539a c4539a) {
                MultiPKStateMachine.AbstractC4538a.C4539a c4539a2 = c4539a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4549d, c4539a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4549d, c4539a2);
                return this.$this_state.LIZ(c4549d, new MultiPKStateMachine.AbstractC4545c.C4547b(new C79511HVx(), c4539a2.LIZIZ), new HWO(false, 1));
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b> c103398Qng) {
        C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<MultiPKStateMachine.AbstractC4545c, MultiPKStateMachine.AbstractC4538a, MultiPKStateMachine.AbstractC4544b>) MultiPKStateMachine.AbstractC4545c.C4546a.LIZLLL);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4545c.C4546a.class), C45501.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4545c.C4548c.class), C45552.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4545c.C4549d.class), C45593.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(MultiPKStateMachine.AbstractC4545c.C4547b.class), C45634.INSTANCE);
            c103398Qng2.LIZ(new C45655());
        }
        return Unit.INSTANCE;
    }
}
