package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4697g;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4702i;
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
import p003X.ITL;
import p003X.ITM;
import p003X.ITN;
import p003X.QL7;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1 */
/* loaded from: classes3.dex */
public final class PkOperationalPlayStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $listener;

    static {
        Covode.recordClassIndex(28525);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkOperationalPlayStateMachine$stateMachine$1(Function1 function1) {
        super(1);
        this.$listener = function1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C46093 extends Lambda implements Function1<C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4704b>, Unit> {
        public static final C46093 INSTANCE = new C46093();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28538);
        }

        public C46093() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4704b> c0033a) {
            C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4704b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4699b.class), new C46101(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4700c.class), new C46112(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C46101 extends Lambda implements Function2<AbstractC4702i.C4704b, AbstractC4697g.C4699b, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28539);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46101(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4704b c4704b, AbstractC4697g.C4699b c4699b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4704b, c4699b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4704b, c4699b);
                return this.$this_state.LIZ(c4704b, AbstractC4702i.C4703a.LIZIZ, ITM.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C46112 extends Lambda implements Function2<AbstractC4702i.C4704b, AbstractC4697g.C4700c, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28540);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46112(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4704b c4704b, AbstractC4697g.C4700c c4700c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4704b, c4700c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4704b, c4700c);
                return this.$this_state.LIZ(c4704b, AbstractC4702i.C4706d.LIZIZ, ITN.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C46124 extends Lambda implements Function1<C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4706d>, Unit> {
        public static final C46124 INSTANCE = new C46124();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28541);
        }

        public C46124() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4706d> c0033a) {
            C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4706d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4699b.class), new C46131(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C46131 extends Lambda implements Function2<AbstractC4702i.C4706d, AbstractC4697g.C4699b, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28542);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46131(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4706d c4706d, AbstractC4697g.C4699b c4699b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4706d, c4699b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4706d, c4699b);
                return this.$this_state.LIZ(c4706d, AbstractC4702i.C4703a.LIZIZ, ITM.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C46011 extends Lambda implements Function1<C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4705c>, Unit> {
        public static final C46011 INSTANCE = new C46011();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28530);
        }

        public C46011() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4705c> c0033a) {
            C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4705c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4699b.class), new C46021(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4698a.class), new C46032(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4700c.class), new C46043(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C46021 extends Lambda implements Function2<AbstractC4702i.C4705c, AbstractC4697g.C4699b, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28531);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46021(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4705c c4705c, AbstractC4697g.C4699b c4699b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4705c, c4699b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4705c, c4699b);
                return this.$this_state.LIZ(c4705c, AbstractC4702i.C4703a.LIZIZ, ITM.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C46032 extends Lambda implements Function2<AbstractC4702i.C4705c, AbstractC4697g.C4698a, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28532);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46032(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4705c c4705c, AbstractC4697g.C4698a c4698a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4705c, c4698a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4705c, c4698a);
                return this.$this_state.LIZ(c4705c, AbstractC4702i.C4704b.LIZIZ, ITL.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C46043 extends Lambda implements Function2<AbstractC4702i.C4705c, AbstractC4697g.C4700c, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28533);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46043(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4705c c4705c, AbstractC4697g.C4700c c4700c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4705c, c4700c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4705c, c4700c);
                return this.$this_state.LIZ(c4705c, AbstractC4702i.C4706d.LIZIZ, ITN.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C46052 extends Lambda implements Function1<C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4703a>, Unit> {
        public static final C46052 INSTANCE = new C46052();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28534);
        }

        public C46052() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4703a> c0033a) {
            C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>.C0033a<AbstractC4702i.C4703a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4699b.class), new C46061(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4698a.class), new C46072(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4697g.C4700c.class), new C46083(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C46061 extends Lambda implements Function2<AbstractC4702i.C4703a, AbstractC4697g.C4699b, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28535);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46061(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4703a c4703a, AbstractC4697g.C4699b c4699b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4703a, c4699b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4703a, c4699b);
                return this.$this_state.LIZ(c4703a, AbstractC4702i.C4703a.LIZIZ, ITM.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C46072 extends Lambda implements Function2<AbstractC4702i.C4703a, AbstractC4697g.C4698a, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28536);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46072(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4703a c4703a, AbstractC4697g.C4698a c4698a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4703a, c4698a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4703a, c4698a);
                return this.$this_state.LIZ(c4703a, AbstractC4702i.C4704b.LIZIZ, ITL.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C46083 extends Lambda implements Function2<AbstractC4702i.C4703a, AbstractC4697g.C4700c, C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(28537);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46083(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.newpk.vm.i, ? extends com.bytedance.android.live.liveinteract.newpk.vm.h>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4702i, ? extends AbstractC4701h> invoke(AbstractC4702i.C4703a c4703a, AbstractC4697g.C4700c c4700c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4703a, c4700c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4703a, c4700c);
                return this.$this_state.LIZ(c4703a, AbstractC4702i.C4706d.LIZIZ, ITN.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h> c103398Qng) {
        C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<AbstractC4702i, AbstractC4697g, AbstractC4701h>) AbstractC4702i.C4705c.LIZIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4702i.C4705c.class).LIZ((Function1) new C4597x9d52d2f2(AbstractC4702i.C4705c.LIZIZ)), C46011.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4702i.C4703a.class).LIZ((Function1) new C4598x9d52d2f3(AbstractC4702i.C4703a.LIZIZ)), C46052.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4702i.C4704b.class).LIZ((Function1) new C4599x9d52d2f4(AbstractC4702i.C4704b.LIZIZ)), C46093.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4702i.C4706d.class).LIZ((Function1) new C4600x9d52d2f5(AbstractC4702i.C4706d.LIZIZ)), C46124.INSTANCE);
            c103398Qng2.LIZ(this.$listener);
        }
        return Unit.INSTANCE;
    }
}
