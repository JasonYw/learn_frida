package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.android.live.liveinteract.videotalk.battle.h$a;
import com.bytedance.android.live.liveinteract.videotalk.battle.h$c;
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
import p003X.C80323HlN;
import p003X.C80328HlS;
import p003X.C80329HlT;
import p003X.C80332HlW;
import p003X.C80333HlX;
import p003X.C80334HlY;
import p003X.C80335HlZ;
import p003X.C80336Hla;
import p003X.C80337Hlb;
import p003X.C80338Hlc;
import p003X.QL7;

/* loaded from: classes3.dex */
public final class GuestBattleStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<h$c, h$a, h$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80323HlN this$0;

    static {
        Covode.recordClassIndex(29825);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleStateMachine$stateMachine$1(C80323HlN c80323HlN) {
        super(1);
        this.this$0 = c80323HlN;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$6 */
    /* loaded from: classes3.dex */
    public static final class C48896 extends Lambda implements Function1<AbstractC103391QnZ<? extends h$c, ? extends h$a, ? extends h$b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29864);
        }

        public C48896() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends h$c, ? extends h$a, ? extends h$b> abstractC103391QnZ) {
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ);
                GuestBattleStateMachine$stateMachine$1.this.this$0.LIZIZ.invoke(abstractC103391QnZ);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C48511 extends Lambda implements Function1<C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4905b>, Unit> {
        public static final C48511 INSTANCE = new C48511();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29826);
        }

        public C48511() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4905b> c0033a) {
            C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4905b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4902k.class), new C48521(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4896e.class), new C48532(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4892a.class), new C48543(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4903l.class), new C48554(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4897f.class), new C48565(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4899h.class), new C48576(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C48521 extends Lambda implements Function2<h$c.C4905b, h$a.C4902k, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29827);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48521(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4905b c4905b, h$a.C4902k c4902k) {
                h$a.C4902k c4902k2 = c4902k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4905b, c4902k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4905b, c4902k2);
                return this.$this_state.LIZ(c4905b, new h$c.C4906c(c4902k2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C48543 extends Lambda implements Function2<h$c.C4905b, h$a.C4892a, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29829);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48543(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4905b c4905b, h$a.C4892a c4892a) {
                h$a.C4892a c4892a2 = c4892a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4905b, c4892a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4905b, c4892a2);
                return this.$this_state.LIZ(c4905b, new h$c.C4906c(c4892a2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1$5 */
        /* loaded from: classes3.dex */
        public static final class C48565 extends Lambda implements Function2<h$c.C4905b, h$a.C4897f, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29831);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48565(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4905b c4905b, h$a.C4897f c4897f) {
                h$a.C4897f c4897f2 = c4897f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4905b, c4897f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4905b, c4897f2);
                return this.$this_state.LIZ(c4905b, new h$c.C4907d(c4897f2.LIZIZ), C80336Hla.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1$6 */
        /* loaded from: classes3.dex */
        public static final class C48576 extends Lambda implements Function2<h$c.C4905b, h$a.C4899h, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29832);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48576(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4905b c4905b, h$a.C4899h c4899h) {
                h$a.C4899h c4899h2 = c4899h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4905b, c4899h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4905b, c4899h2);
                return this.$this_state.LIZ(c4905b, new h$c.C4906c(c4899h2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C48532 extends Lambda implements Function2<h$c.C4905b, h$a.C4896e, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29828);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48532(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4905b c4905b, h$a.C4896e c4896e) {
                h$a.C4896e c4896e2 = c4896e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4905b, c4896e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4905b, c4896e2);
                int i = c4896e2.LIZIZ.LIZLLL;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return this.$this_state.LIZ(c4905b, h$c.C4905b.LIZJ, C80328HlS.LIZIZ);
                            }
                            return this.$this_state.LIZ(c4905b, new h$c.C4907d(c4896e2.LIZIZ), C80336Hla.LIZIZ);
                        }
                        return this.$this_state.LIZ(c4905b, new h$c.C4904a(c4896e2.LIZIZ), C80328HlS.LIZIZ);
                    }
                    return this.$this_state.LIZ(c4905b, new h$c.C4908e(c4896e2.LIZIZ), C80337Hlb.LIZIZ);
                }
                return this.$this_state.LIZ(c4905b, new h$c.C4906c(c4896e2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$1$4 */
        /* loaded from: classes3.dex */
        public static final class C48554 extends Lambda implements Function2<h$c.C4905b, h$a.C4903l, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29830);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48554(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4905b c4905b, h$a.C4903l c4903l) {
                h$a.C4903l c4903l2 = c4903l;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4905b, c4903l2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4905b, c4903l2);
                if (c4903l2.LIZIZ.LIZLLL == 4) {
                    return this.$this_state.LIZ(c4905b, new h$c.C4907d(c4903l2.LIZIZ), C80336Hla.LIZIZ);
                }
                return this.$this_state.LIZ(c4905b, new h$c.C4906c(c4903l2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C48764 extends Lambda implements Function1<C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4904a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29851);
        }

        public C48764() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4904a> c0033a) {
            C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4904a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4902k.class), new C48771(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4892a.class), new C48782(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4903l.class), new C48793(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C48771 extends Lambda implements Function2<h$c.C4904a, h$a.C4902k, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29852);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48771(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4904a c4904a, h$a.C4902k c4902k) {
                h$a.C4902k c4902k2 = c4902k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4904a, c4902k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4904a, c4902k2);
                return this.$this_state.LIZ(c4904a, new h$c.C4906c(c4902k2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$4$2 */
        /* loaded from: classes3.dex */
        public static final class C48782 extends Lambda implements Function2<h$c.C4904a, h$a.C4892a, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29853);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48782(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4904a c4904a, h$a.C4892a c4892a) {
                h$a.C4892a c4892a2 = c4892a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4904a, c4892a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4904a, c4892a2);
                return this.$this_state.LIZ(c4904a, new h$c.C4906c(c4892a2.LIZIZ), C80335HlZ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$4$3 */
        /* loaded from: classes3.dex */
        public static final class C48793 extends Lambda implements Function2<h$c.C4904a, h$a.C4903l, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29854);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48793(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4904a c4904a, h$a.C4903l c4903l) {
                h$a.C4903l c4903l2 = c4903l;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4904a, c4903l2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4904a, c4903l2);
                if (c4903l2.LIZIZ.LIZIZ != GuestBattleStateMachine$stateMachine$1.this.this$0.LIZ().LIZ.LIZIZ) {
                    return this.$this_state.LIZ(c4904a, new h$c.C4906c(c4903l2.LIZIZ), C80335HlZ.LIZIZ);
                }
                return this.$this_state.LIZ(c4904a, new h$c.C4904a(c4903l2.LIZIZ), C80328HlS.LIZIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<h$c, h$a, h$b> c103398Qng) {
        C103398Qng<h$c, h$a, h$b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<h$c, h$a, h$b>) h$c.C4905b.LIZJ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$c.C4905b.class), C48511.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$c.C4906c.class), new C48582());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$c.C4908e.class), new C48683());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$c.C4904a.class), new C48764());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$c.C4907d.class), new C48805());
            c103398Qng2.LIZ(new C48896());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C48582 extends Lambda implements Function1<C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4906c>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29833);
        }

        public C48582() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4906c> c0033a) {
            C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4906c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4893b.class), new C48591(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4896e.class), new C48602(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4903l.class), new C48613(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4900i.class), new C48624(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4894c.class), new C48635(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4898g.class), new C48646(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4895d.class), new C48657(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4897f.class), new C48668(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4899h.class), new C48679(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C48591 extends Lambda implements Function2<h$c.C4906c, h$a.C4893b, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29834);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48591(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4893b c4893b) {
                h$a.C4893b c4893b2 = c4893b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4893b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4893b2);
                return this.$this_state.LIZ(c4906c, new h$c.C4904a(c4893b2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$4 */
        /* loaded from: classes3.dex */
        public static final class C48624 extends Lambda implements Function2<h$c.C4906c, h$a.C4900i, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29837);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48624(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4900i c4900i) {
                h$a.C4900i c4900i2 = c4900i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4900i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4900i2);
                return this.$this_state.LIZ(c4906c, new h$c.C4908e(c4900i2.LIZIZ), C80337Hlb.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$5 */
        /* loaded from: classes3.dex */
        public static final class C48635 extends Lambda implements Function2<h$c.C4906c, h$a.C4894c, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29838);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48635(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4894c c4894c) {
                h$a.C4894c c4894c2 = c4894c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4894c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4894c2);
                return this.$this_state.LIZ(c4906c, new h$c.C4904a(c4894c2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$6 */
        /* loaded from: classes3.dex */
        public static final class C48646 extends Lambda implements Function2<h$c.C4906c, h$a.C4898g, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29839);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48646(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4898g c4898g) {
                h$a.C4898g c4898g2 = c4898g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4898g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4898g2);
                return this.$this_state.LIZ(c4906c, new h$c.C4906c(c4898g2.LIZIZ), C80328HlS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$7 */
        /* loaded from: classes3.dex */
        public static final class C48657 extends Lambda implements Function2<h$c.C4906c, h$a.C4895d, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29840);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48657(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4895d c4895d) {
                h$a.C4895d c4895d2 = c4895d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4895d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4895d2);
                return this.$this_state.LIZ(c4906c, new h$c.C4904a(c4895d2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$8 */
        /* loaded from: classes3.dex */
        public static final class C48668 extends Lambda implements Function2<h$c.C4906c, h$a.C4897f, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29841);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48668(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4897f c4897f) {
                h$a.C4897f c4897f2 = c4897f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4897f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4897f2);
                return this.$this_state.LIZ(c4906c, new h$c.C4907d(c4897f2.LIZIZ), new C80333HlX(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$9 */
        /* loaded from: classes3.dex */
        public static final class C48679 extends Lambda implements Function2<h$c.C4906c, h$a.C4899h, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29842);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48679(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4899h c4899h) {
                h$a.C4899h c4899h2 = c4899h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4899h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4899h2);
                return this.$this_state.LIZ(c4906c, new h$c.C4906c(c4899h2.LIZIZ), new C80334HlY(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C48602 extends Lambda implements Function2<h$c.C4906c, h$a.C4896e, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29835);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48602(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4896e c4896e) {
                h$a.C4896e c4896e2 = c4896e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4896e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4896e2);
                int i = c4896e2.LIZIZ.LIZLLL;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return this.$this_state.LIZ(c4906c, GuestBattleStateMachine$stateMachine$1.this.this$0.LIZ(), C80328HlS.LIZIZ);
                            }
                            return this.$this_state.LIZ(c4906c, new h$c.C4907d(c4896e2.LIZIZ), new C80333HlX(false, 1));
                        }
                        return this.$this_state.LIZ(c4906c, new h$c.C4904a(c4896e2.LIZIZ), C80329HlT.LIZIZ);
                    }
                    return this.$this_state.LIZ(c4906c, new h$c.C4908e(c4896e2.LIZIZ), C80337Hlb.LIZIZ);
                }
                return this.$this_state.LIZ(c4906c, new h$c.C4906c(c4896e2.LIZIZ), C80328HlS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C48613 extends Lambda implements Function2<h$c.C4906c, h$a.C4903l, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29836);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48613(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4906c c4906c, h$a.C4903l c4903l) {
                h$a.C4903l c4903l2 = c4903l;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4906c, c4903l2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4906c, c4903l2);
                if (c4903l2.LIZIZ.LIZLLL == 4) {
                    return this.$this_state.LIZ(c4906c, new h$c.C4907d(c4903l2.LIZIZ), new C80333HlX(true));
                }
                return this.$this_state.LIZ(c4906c, new h$c.C4906c(c4903l2.LIZIZ), C80338Hlc.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C48683 extends Lambda implements Function1<C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4908e>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29843);
        }

        public C48683() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4908e> c0033a) {
            C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4908e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4902k.class), new C48691(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4893b.class), new C48702(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4892a.class), new C48713(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4894c.class), new C48724(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4901j.class), new C48735(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4898g.class), new C48746(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4895d.class), new C48757(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C48691 extends Lambda implements Function2<h$c.C4908e, h$a.C4902k, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29844);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48691(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4902k c4902k) {
                h$a.C4902k c4902k2 = c4902k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4902k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4902k2);
                return this.$this_state.LIZ(c4908e, new h$c.C4906c(c4902k2.LIZIZ), C80332HlW.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C48702 extends Lambda implements Function2<h$c.C4908e, h$a.C4893b, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29845);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48702(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4893b c4893b) {
                h$a.C4893b c4893b2 = c4893b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4893b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4893b2);
                return this.$this_state.LIZ(c4908e, new h$c.C4904a(c4893b2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$3 */
        /* loaded from: classes3.dex */
        public static final class C48713 extends Lambda implements Function2<h$c.C4908e, h$a.C4892a, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29846);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48713(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4892a c4892a) {
                h$a.C4892a c4892a2 = c4892a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4892a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4892a2);
                return this.$this_state.LIZ(c4908e, new h$c.C4906c(c4892a2.LIZIZ), C80332HlW.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$4 */
        /* loaded from: classes3.dex */
        public static final class C48724 extends Lambda implements Function2<h$c.C4908e, h$a.C4894c, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29847);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48724(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4894c c4894c) {
                h$a.C4894c c4894c2 = c4894c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4894c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4894c2);
                return this.$this_state.LIZ(c4908e, new h$c.C4904a(c4894c2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$5 */
        /* loaded from: classes3.dex */
        public static final class C48735 extends Lambda implements Function2<h$c.C4908e, h$a.C4901j, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29848);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48735(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4901j c4901j) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4901j}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4901j);
                return this.$this_state.LIZ(c4908e, new h$c.C4904a(GuestBattleStateMachine$stateMachine$1.this.this$0.LIZ().LIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$6 */
        /* loaded from: classes3.dex */
        public static final class C48746 extends Lambda implements Function2<h$c.C4908e, h$a.C4898g, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29849);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48746(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4898g c4898g) {
                h$a.C4898g c4898g2 = c4898g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4898g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4898g2);
                return this.$this_state.LIZ(c4908e, new h$c.C4908e(c4898g2.LIZIZ), C80328HlS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$3$7 */
        /* loaded from: classes3.dex */
        public static final class C48757 extends Lambda implements Function2<h$c.C4908e, h$a.C4895d, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29850);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48757(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4908e c4908e, h$a.C4895d c4895d) {
                h$a.C4895d c4895d2 = c4895d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4908e, c4895d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4908e, c4895d2);
                return this.$this_state.LIZ(c4908e, new h$c.C4904a(c4895d2.LIZIZ), C80329HlT.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5 */
    /* loaded from: classes3.dex */
    public static final class C48805 extends Lambda implements Function1<C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4907d>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29855);
        }

        public C48805() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4907d> c0033a) {
            C103398Qng<h$c, h$a, h$b>.C0033a<h$c.C4907d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4893b.class), new C48811(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4896e.class), new C48822(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4903l.class), new C48833(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4900i.class), new C48844(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4894c.class), new C48855(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4898g.class), new C48866(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4895d.class), new C48877(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4899h.class), new C48888(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$1 */
        /* loaded from: classes3.dex */
        public static final class C48811 extends Lambda implements Function2<h$c.C4907d, h$a.C4893b, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29856);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48811(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4893b c4893b) {
                h$a.C4893b c4893b2 = c4893b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4893b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4893b2);
                return this.$this_state.LIZ(c4907d, new h$c.C4904a(c4893b2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$4 */
        /* loaded from: classes3.dex */
        public static final class C48844 extends Lambda implements Function2<h$c.C4907d, h$a.C4900i, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29859);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48844(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4900i c4900i) {
                h$a.C4900i c4900i2 = c4900i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4900i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4900i2);
                return this.$this_state.LIZ(c4907d, new h$c.C4908e(c4900i2.LIZIZ), C80337Hlb.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$5 */
        /* loaded from: classes3.dex */
        public static final class C48855 extends Lambda implements Function2<h$c.C4907d, h$a.C4894c, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29860);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48855(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4894c c4894c) {
                h$a.C4894c c4894c2 = c4894c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4894c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4894c2);
                return this.$this_state.LIZ(c4907d, new h$c.C4904a(c4894c2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$6 */
        /* loaded from: classes3.dex */
        public static final class C48866 extends Lambda implements Function2<h$c.C4907d, h$a.C4898g, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29861);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48866(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4898g c4898g) {
                h$a.C4898g c4898g2 = c4898g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4898g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4898g2);
                return this.$this_state.LIZ(c4907d, new h$c.C4907d(c4898g2.LIZIZ), C80328HlS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$7 */
        /* loaded from: classes3.dex */
        public static final class C48877 extends Lambda implements Function2<h$c.C4907d, h$a.C4895d, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29862);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48877(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4895d c4895d) {
                h$a.C4895d c4895d2 = c4895d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4895d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4895d2);
                return this.$this_state.LIZ(c4907d, new h$c.C4904a(c4895d2.LIZIZ), C80329HlT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$8 */
        /* loaded from: classes3.dex */
        public static final class C48888 extends Lambda implements Function2<h$c.C4907d, h$a.C4899h, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29863);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48888(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4899h c4899h) {
                h$a.C4899h c4899h2 = c4899h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4899h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4899h2);
                return this.$this_state.LIZ(c4907d, new h$c.C4906c(c4899h2.LIZIZ), new C80334HlY(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$2 */
        /* loaded from: classes3.dex */
        public static final class C48822 extends Lambda implements Function2<h$c.C4907d, h$a.C4896e, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29857);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48822(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4896e c4896e) {
                h$a.C4896e c4896e2 = c4896e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4896e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4896e2);
                int i = c4896e2.LIZIZ.LIZLLL;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return this.$this_state.LIZ(c4907d, GuestBattleStateMachine$stateMachine$1.this.this$0.LIZ(), C80328HlS.LIZIZ);
                        }
                        return this.$this_state.LIZ(c4907d, new h$c.C4904a(c4896e2.LIZIZ), C80329HlT.LIZIZ);
                    }
                    return this.$this_state.LIZ(c4907d, new h$c.C4908e(c4896e2.LIZIZ), C80337Hlb.LIZIZ);
                }
                return this.$this_state.LIZ(c4907d, new h$c.C4906c(c4896e2.LIZIZ), new C80334HlY(false, 1));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleStateMachine$stateMachine$1$5$3 */
        /* loaded from: classes3.dex */
        public static final class C48833 extends Lambda implements Function2<h$c.C4907d, h$a.C4903l, C103396Qne<? extends h$c, ? extends h$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29858);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C48833(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$c, ? extends com.bytedance.android.live.liveinteract.videotalk.battle.h$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$c, ? extends h$b> invoke(h$c.C4907d c4907d, h$a.C4903l c4903l) {
                h$a.C4903l c4903l2 = c4903l;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4907d, c4903l2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4907d, c4903l2);
                if (c4903l2.LIZIZ.LIZLLL == 4) {
                    return this.$this_state.LIZ(c4907d, new h$c.C4907d(c4903l2.LIZIZ), C80338Hlc.LIZIZ);
                }
                return this.$this_state.LIZ(c4907d, new h$c.C4906c(c4903l2.LIZIZ), new C80334HlY(true));
            }
        }
    }
}
