package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4690e;
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
import p003X.C82052IVq;
import p003X.C82053IVr;
import p003X.C82054IVs;
import p003X.C82055IVt;
import p003X.QL7;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1 */
/* loaded from: classes3.dex */
public final class PkStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $listener;

    static {
        Covode.recordClassIndex(28544);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkStateMachine$stateMachine$1(Function1 function1) {
        super(1);
        this.$listener = function1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C46274 extends Lambda implements Function1<C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4258b>, Unit> {
        public static final C46274 INSTANCE = new C46274();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28559);
        }

        public C46274() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4258b> c0033a) {
            C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4258b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4696f.class), new C46281(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4691a.class), new C46292(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C46281 extends Lambda implements Function2<AbstractC4256d.C4258b, AbstractC4690e.C4696f, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28560);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46281(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4258b c4258b, AbstractC4690e.C4696f c4696f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4258b, c4696f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4258b, c4696f);
                return this.$this_state.LIZ(c4258b, AbstractC4256d.C4260d.LIZIZ, C82055IVt.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$4$2 */
        /* loaded from: classes3.dex */
        public static final class C46292 extends Lambda implements Function2<AbstractC4256d.C4258b, AbstractC4690e.C4691a, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28561);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46292(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4258b c4258b, AbstractC4690e.C4691a c4691a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4258b, c4691a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4258b, c4691a);
                return this.$this_state.LIZ(c4258b, AbstractC4256d.C4257a.LIZIZ, C82052IVq.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C46141 extends Lambda implements Function1<C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4257a>, Unit> {
        public static final C46141 INSTANCE = new C46141();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28546);
        }

        public C46141() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4257a> c0033a) {
            C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4257a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4696f.class), new C46151(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4694d.class), new C46162(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4692b.class), new C46173(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C46151 extends Lambda implements Function2<AbstractC4256d.C4257a, AbstractC4690e.C4696f, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28547);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46151(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4257a c4257a, AbstractC4690e.C4696f c4696f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4257a, c4696f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4257a, c4696f);
                return this.$this_state.LIZ(c4257a, AbstractC4256d.C4260d.LIZIZ, C82055IVt.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C46162 extends Lambda implements Function2<AbstractC4256d.C4257a, AbstractC4690e.C4694d, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28548);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46162(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4257a c4257a, AbstractC4690e.C4694d c4694d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4257a, c4694d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4257a, c4694d);
                return this.$this_state.LIZ(c4257a, AbstractC4256d.C4259c.LIZIZ, C82054IVs.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C46173 extends Lambda implements Function2<AbstractC4256d.C4257a, AbstractC4690e.C4692b, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28549);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46173(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4257a c4257a, AbstractC4690e.C4692b c4692b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4257a, c4692b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4257a, c4692b);
                return this.$this_state.LIZ(c4257a, AbstractC4256d.C4258b.LIZIZ, C82053IVr.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C46182 extends Lambda implements Function1<C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4260d>, Unit> {
        public static final C46182 INSTANCE = new C46182();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28550);
        }

        public C46182() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4260d> c0033a) {
            C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4260d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4694d.class), new C46191(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4691a.class), new C46202(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4693c.class), new C46213(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4695e.class), new C46224(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C46191 extends Lambda implements Function2<AbstractC4256d.C4260d, AbstractC4690e.C4694d, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28551);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46191(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4260d c4260d, AbstractC4690e.C4694d c4694d) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4260d, c4694d}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4260d, c4694d);
                return this.$this_state.LIZ(c4260d, AbstractC4256d.C4259c.LIZIZ, C82054IVs.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C46202 extends Lambda implements Function2<AbstractC4256d.C4260d, AbstractC4690e.C4691a, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28552);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46202(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4260d c4260d, AbstractC4690e.C4691a c4691a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4260d, c4691a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4260d, c4691a);
                return this.$this_state.LIZ(c4260d, AbstractC4256d.C4257a.LIZIZ, C82052IVq.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C46213 extends Lambda implements Function2<AbstractC4256d.C4260d, AbstractC4690e.C4693c, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28553);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46213(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4260d c4260d, AbstractC4690e.C4693c c4693c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4260d, c4693c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4260d, c4693c);
                return this.$this_state.LIZ(c4260d, AbstractC4256d.C4258b.LIZIZ, C82053IVr.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$2$4 */
        /* loaded from: classes3.dex */
        public static final class C46224 extends Lambda implements Function2<AbstractC4256d.C4260d, AbstractC4690e.C4695e, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28554);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46224(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4260d c4260d, AbstractC4690e.C4695e c4695e) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4260d, c4695e}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4260d, c4695e);
                return this.$this_state.LIZ(c4260d, AbstractC4256d.C4258b.LIZIZ, C82053IVr.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C46233 extends Lambda implements Function1<C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4259c>, Unit> {
        public static final C46233 INSTANCE = new C46233();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28555);
        }

        public C46233() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4259c> c0033a) {
            C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>.C0033a<AbstractC4256d.C4259c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4692b.class), new C46241(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4696f.class), new C46252(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4690e.C4691a.class), new C46263(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C46241 extends Lambda implements Function2<AbstractC4256d.C4259c, AbstractC4690e.C4692b, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28556);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46241(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4259c c4259c, AbstractC4690e.C4692b c4692b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4259c, c4692b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4259c, c4692b);
                return this.$this_state.LIZ(c4259c, AbstractC4256d.C4258b.LIZIZ, C82053IVr.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C46252 extends Lambda implements Function2<AbstractC4256d.C4259c, AbstractC4690e.C4696f, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28557);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46252(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4259c c4259c, AbstractC4690e.C4696f c4696f) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4259c, c4696f}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4259c, c4696f);
                return this.$this_state.LIZ(c4259c, AbstractC4256d.C4260d.LIZIZ, C82055IVt.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkStateMachine$stateMachine$1$3$3 */
        /* loaded from: classes3.dex */
        public static final class C46263 extends Lambda implements Function2<AbstractC4256d.C4259c, AbstractC4690e.C4691a, C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28558);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46263(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.linkpk.d, ? extends com.bytedance.android.live.liveinteract.newpk.vm.s>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4256d, ? extends AbstractC4720s> invoke(AbstractC4256d.C4259c c4259c, AbstractC4690e.C4691a c4691a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4259c, c4691a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4259c, c4691a);
                return this.$this_state.LIZ(c4259c, AbstractC4256d.C4257a.LIZIZ, C82052IVq.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s> c103398Qng) {
        C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<AbstractC4256d, AbstractC4690e, AbstractC4720s>) AbstractC4256d.C4257a.LIZIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4256d.C4257a.class).LIZ((Function1) new PkStateMachine$stateMachine$1$$special$$inlined$state$1(AbstractC4256d.C4257a.LIZIZ)), C46141.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4256d.C4260d.class), C46182.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4256d.C4259c.class), C46233.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4256d.C4258b.class), C46274.INSTANCE);
            c103398Qng2.LIZ(this.$listener);
        }
        return Unit.INSTANCE;
    }
}
