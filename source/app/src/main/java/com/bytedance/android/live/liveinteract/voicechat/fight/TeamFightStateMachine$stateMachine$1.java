package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.android.live.liveinteract.voicechat.fight.b$a;
import com.bytedance.android.live.liveinteract.voicechat.fight.b$c;
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
import p003X.C78641GzL;
import p003X.C78644GzO;
import p003X.C78645GzP;
import p003X.C78646GzQ;
import p003X.C78647GzR;
import p003X.C78648GzS;
import p003X.C78649GzT;
import p003X.C78650GzU;
import p003X.C78651GzV;
import p003X.QL7;

/* loaded from: classes3.dex */
public final class TeamFightStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78641GzL this$0;

    static {
        Covode.recordClassIndex(31269);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightStateMachine$stateMachine$1(C78641GzL c78641GzL) {
        super(1);
        this.this$0 = c78641GzL;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$6 */
    /* loaded from: classes3.dex */
    public static final class C50526 extends Lambda implements Function1<AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31303);
        }

        public C50526() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ) {
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ);
                TeamFightStateMachine$stateMachine$1.this.this$0.LIZIZ.invoke(abstractC103391QnZ);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C50191 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5069c>, Unit> {
        public static final C50191 INSTANCE = new C50191();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31270);
        }

        public C50191() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5069c> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5069c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5057a.class), new C50201(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5058b.class), new C50212(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5065i.class), new C50223(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5062f.class), new C50234(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5066j.class), new C50245(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C50201 extends Lambda implements Function2<b$c.C5069c, b$a.C5057a, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31271);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50201(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5069c c5069c, b$a.C5057a c5057a) {
                b$a.C5057a c5057a2 = c5057a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5069c, c5057a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5069c, c5057a2);
                return this.$this_state.LIZ(c5069c, new b$c.C5070d(c5057a2.LIZIZ), C78644GzO.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C50212 extends Lambda implements Function2<b$c.C5069c, b$a.C5058b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31272);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50212(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5069c c5069c, b$a.C5058b c5058b) {
                b$a.C5058b c5058b2 = c5058b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5069c, c5058b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5069c, c5058b2);
                return this.$this_state.LIZ(c5069c, new b$c.C5070d(c5058b2.LIZIZ), C78644GzO.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C50223 extends Lambda implements Function2<b$c.C5069c, b$a.C5065i, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31273);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50223(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5069c c5069c, b$a.C5065i c5065i) {
                b$a.C5065i c5065i2 = c5065i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5069c, c5065i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5069c, c5065i2);
                return this.$this_state.LIZ(c5069c, new b$c.C5067a(c5065i2.LIZIZ), C78648GzS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$1$4 */
        /* loaded from: classes3.dex */
        public static final class C50234 extends Lambda implements Function2<b$c.C5069c, b$a.C5062f, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31274);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50234(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5069c c5069c, b$a.C5062f c5062f) {
                b$a.C5062f c5062f2 = c5062f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5069c, c5062f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5069c, c5062f2);
                int i = c5062f2.LIZIZ.LJFF;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return this.$this_state.LIZ(c5069c, b$c.C5069c.LIZJ, C78650GzU.LIZIZ);
                            }
                            return this.$this_state.LIZ(c5069c, new b$c.C5068b(c5062f2.LIZIZ), C78650GzU.LIZIZ);
                        }
                        return this.$this_state.LIZ(c5069c, new b$c.C5071e(c5062f2.LIZIZ), C78647GzR.LIZIZ);
                    }
                    return this.$this_state.LIZ(c5069c, new b$c.C5067a(c5062f2.LIZIZ), C78648GzS.LIZIZ);
                }
                return this.$this_state.LIZ(c5069c, new b$c.C5070d(c5062f2.LIZIZ), C78644GzO.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$1$5 */
        /* loaded from: classes3.dex */
        public static final class C50245 extends Lambda implements Function2<b$c.C5069c, b$a.C5066j, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31275);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50245(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5069c c5069c, b$a.C5066j c5066j) {
                b$a.C5066j c5066j2 = c5066j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5069c, c5066j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5069c, c5066j2);
                int i = c5066j2.LIZIZ.LJFF;
                if (i != 1) {
                    if (i != 2) {
                        return this.$this_state.LIZ(c5069c, b$c.C5069c.LIZJ, C78650GzU.LIZIZ);
                    }
                    return this.$this_state.LIZ(c5069c, new b$c.C5067a(c5066j2.LIZIZ), C78648GzS.LIZIZ);
                }
                return this.$this_state.LIZ(c5069c, new b$c.C5070d(c5066j2.LIZIZ), C78644GzO.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C50252 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5070d>, Unit> {
        public static final C50252 INSTANCE = new C50252();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31276);
        }

        public C50252() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5070d> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5070d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5064h.class), new C50261(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5065i.class), new C50272(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5066j.class), new C50283(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5059c.class), new C50294(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5060d.class), new C50305(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5061e.class), new C50316(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C50261 extends Lambda implements Function2<b$c.C5070d, b$a.C5064h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31277);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50261(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5070d c5070d, b$a.C5064h c5064h) {
                b$a.C5064h c5064h2 = c5064h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5070d, c5064h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5070d, c5064h2);
                return this.$this_state.LIZ(c5070d, new b$c.C5067a(c5064h2.LIZIZ), C78648GzS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C50272 extends Lambda implements Function2<b$c.C5070d, b$a.C5065i, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31278);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50272(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5070d c5070d, b$a.C5065i c5065i) {
                b$a.C5065i c5065i2 = c5065i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5070d, c5065i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5070d, c5065i2);
                return this.$this_state.LIZ(c5070d, new b$c.C5067a(c5065i2.LIZIZ), C78648GzS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2$4 */
        /* loaded from: classes3.dex */
        public static final class C50294 extends Lambda implements Function2<b$c.C5070d, b$a.C5059c, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31280);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50294(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5070d c5070d, b$a.C5059c c5059c) {
                b$a.C5059c c5059c2 = c5059c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5070d, c5059c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5070d, c5059c2);
                return this.$this_state.LIZ(c5070d, new b$c.C5068b(c5059c2.LIZIZ), new C78651GzV(c5059c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2$5 */
        /* loaded from: classes3.dex */
        public static final class C50305 extends Lambda implements Function2<b$c.C5070d, b$a.C5060d, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31281);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50305(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5070d c5070d, b$a.C5060d c5060d) {
                b$a.C5060d c5060d2 = c5060d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5070d, c5060d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5070d, c5060d2);
                return this.$this_state.LIZ(c5070d, new b$c.C5068b(c5060d2.LIZIZ), new C78651GzV(c5060d2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2$6 */
        /* loaded from: classes3.dex */
        public static final class C50316 extends Lambda implements Function2<b$c.C5070d, b$a.C5061e, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31282);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50316(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5070d c5070d, b$a.C5061e c5061e) {
                b$a.C5061e c5061e2 = c5061e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5070d, c5061e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5070d, c5061e2);
                return this.$this_state.LIZ(c5070d, new b$c.C5068b(c5061e2.LIZIZ), new C78651GzV(c5061e2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C50283 extends Lambda implements Function2<b$c.C5070d, b$a.C5066j, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31279);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50283(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5070d c5070d, b$a.C5066j c5066j) {
                b$a.C5066j c5066j2 = c5066j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5070d, c5066j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5070d, c5066j2);
                if (c5066j2.LIZIZ.LJFF != 2) {
                    return this.$this_state.LIZ(c5070d, new b$c.C5070d(c5066j2.LIZIZ), C78650GzU.LIZIZ);
                }
                return this.$this_state.LIZ(c5070d, new b$c.C5067a(c5066j2.LIZIZ), C78648GzS.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C50323 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5067a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31283);
        }

        public C50323() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5067a> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5067a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5066j.class), new C50331(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5062f.class), new C50342(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5063g.class), new C50353(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5059c.class), new C50364(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5060d.class), new C50375(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5061e.class), new C50386(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C50331 extends Lambda implements Function2<b$c.C5067a, b$a.C5066j, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31284);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50331(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5067a c5067a, b$a.C5066j c5066j) {
                b$a.C5066j c5066j2 = c5066j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5067a, c5066j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5067a, c5066j2);
                return this.$this_state.LIZ(c5067a, new b$c.C5067a(c5066j2.LIZIZ), C78649GzT.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3$3 */
        /* loaded from: classes3.dex */
        public static final class C50353 extends Lambda implements Function2<b$c.C5067a, b$a.C5063g, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31286);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50353(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5067a c5067a, b$a.C5063g c5063g) {
                b$a.C5063g c5063g2 = c5063g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5067a, c5063g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5067a, c5063g2);
                return this.$this_state.LIZ(c5067a, new b$c.C5071e(c5063g2.LIZIZ), C78647GzR.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3$4 */
        /* loaded from: classes3.dex */
        public static final class C50364 extends Lambda implements Function2<b$c.C5067a, b$a.C5059c, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31287);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50364(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5067a c5067a, b$a.C5059c c5059c) {
                b$a.C5059c c5059c2 = c5059c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5067a, c5059c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5067a, c5059c2);
                return this.$this_state.LIZ(c5067a, new b$c.C5068b(c5059c2.LIZIZ), new C78651GzV(c5059c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3$5 */
        /* loaded from: classes3.dex */
        public static final class C50375 extends Lambda implements Function2<b$c.C5067a, b$a.C5060d, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31288);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50375(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5067a c5067a, b$a.C5060d c5060d) {
                b$a.C5060d c5060d2 = c5060d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5067a, c5060d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5067a, c5060d2);
                return this.$this_state.LIZ(c5067a, new b$c.C5068b(c5060d2.LIZIZ), new C78651GzV(c5060d2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3$6 */
        /* loaded from: classes3.dex */
        public static final class C50386 extends Lambda implements Function2<b$c.C5067a, b$a.C5061e, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31289);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50386(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5067a c5067a, b$a.C5061e c5061e) {
                b$a.C5061e c5061e2 = c5061e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5067a, c5061e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5067a, c5061e2);
                return this.$this_state.LIZ(c5067a, new b$c.C5068b(c5061e2.LIZIZ), new C78651GzV(c5061e2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C50342 extends Lambda implements Function2<b$c.C5067a, b$a.C5062f, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31285);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50342(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5067a c5067a, b$a.C5062f c5062f) {
                b$a.C5062f c5062f2 = c5062f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5067a, c5062f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5067a, c5062f2);
                int i = c5062f2.LIZIZ.LJFF;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return this.$this_state.LIZ(c5067a, TeamFightStateMachine$stateMachine$1.this.this$0.LIZ(), C78650GzU.LIZIZ);
                        }
                        return this.$this_state.LIZ(c5067a, new b$c.C5068b(c5062f2.LIZIZ), C78650GzU.LIZIZ);
                    }
                    return this.$this_state.LIZ(c5067a, new b$c.C5071e(c5062f2.LIZIZ), C78647GzR.LIZIZ);
                }
                return this.$this_state.LIZ(c5067a, new b$c.C5067a(c5062f2.LIZIZ), C78650GzU.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C50394 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5071e>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31290);
        }

        public C50394() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5071e> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5071e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5064h.class), new C50401(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5065i.class), new C50412(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5058b.class), new C50423(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5059c.class), new C50434(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5060d.class), new C50445(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5061e.class), new C50456(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C50401 extends Lambda implements Function2<b$c.C5071e, b$a.C5064h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31291);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50401(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5071e c5071e, b$a.C5064h c5064h) {
                b$a.C5064h c5064h2 = c5064h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5071e, c5064h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5071e, c5064h2);
                return this.$this_state.LIZ(c5071e, new b$c.C5067a(c5064h2.LIZIZ), C78646GzQ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4$2 */
        /* loaded from: classes3.dex */
        public static final class C50412 extends Lambda implements Function2<b$c.C5071e, b$a.C5065i, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31292);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50412(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5071e c5071e, b$a.C5065i c5065i) {
                b$a.C5065i c5065i2 = c5065i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5071e, c5065i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5071e, c5065i2);
                return this.$this_state.LIZ(c5071e, new b$c.C5067a(c5065i2.LIZIZ), C78646GzQ.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4$4 */
        /* loaded from: classes3.dex */
        public static final class C50434 extends Lambda implements Function2<b$c.C5071e, b$a.C5059c, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31294);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50434(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5071e c5071e, b$a.C5059c c5059c) {
                b$a.C5059c c5059c2 = c5059c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5071e, c5059c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5071e, c5059c2);
                return this.$this_state.LIZ(c5071e, new b$c.C5068b(c5059c2.LIZIZ), new C78651GzV(c5059c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4$5 */
        /* loaded from: classes3.dex */
        public static final class C50445 extends Lambda implements Function2<b$c.C5071e, b$a.C5060d, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31295);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50445(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5071e c5071e, b$a.C5060d c5060d) {
                b$a.C5060d c5060d2 = c5060d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5071e, c5060d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5071e, c5060d2);
                return this.$this_state.LIZ(c5071e, new b$c.C5068b(c5060d2.LIZIZ), new C78651GzV(c5060d2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4$6 */
        /* loaded from: classes3.dex */
        public static final class C50456 extends Lambda implements Function2<b$c.C5071e, b$a.C5061e, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31296);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50456(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5071e c5071e, b$a.C5061e c5061e) {
                b$a.C5061e c5061e2 = c5061e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5071e, c5061e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5071e, c5061e2);
                return this.$this_state.LIZ(c5071e, new b$c.C5068b(c5061e2.LIZIZ), new C78651GzV(c5061e2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$4$3 */
        /* loaded from: classes3.dex */
        public static final class C50423 extends Lambda implements Function2<b$c.C5071e, b$a.C5058b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31293);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50423(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5071e c5071e, b$a.C5058b c5058b) {
                b$a.C5058b c5058b2 = c5058b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5071e, c5058b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5071e, c5058b2);
                if (c5058b2.LIZIZ.LIZJ != TeamFightStateMachine$stateMachine$1.this.this$0.LIZ().LIZ.LIZJ) {
                    return this.$this_state.LIZ(c5071e, new b$c.C5070d(c5058b2.LIZIZ), C78645GzP.LIZIZ);
                }
                return this.$this_state.LIZ(c5071e, new b$c.C5071e(TeamFightStateMachine$stateMachine$1.this.this$0.LIZ().LIZ), C78650GzU.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$5 */
    /* loaded from: classes3.dex */
    public static final class C50465 extends Lambda implements Function1<C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5068b>, Unit> {
        public static final C50465 INSTANCE = new C50465();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31297);
        }

        public C50465() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5068b> c0033a) {
            C103398Qng<b$c, b$a, b$b>.C0033a<b$c.C5068b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5057a.class), new C50471(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5058b.class), new C50482(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5064h.class), new C50493(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5065i.class), new C50504(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(b$a.C5066j.class), new C50515(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$5$1 */
        /* loaded from: classes3.dex */
        public static final class C50471 extends Lambda implements Function2<b$c.C5068b, b$a.C5057a, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31298);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50471(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5068b c5068b, b$a.C5057a c5057a) {
                b$a.C5057a c5057a2 = c5057a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5068b, c5057a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5068b, c5057a2);
                return this.$this_state.LIZ(c5068b, new b$c.C5070d(c5057a2.LIZIZ), C78644GzO.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$5$2 */
        /* loaded from: classes3.dex */
        public static final class C50482 extends Lambda implements Function2<b$c.C5068b, b$a.C5058b, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31299);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50482(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5068b c5068b, b$a.C5058b c5058b) {
                b$a.C5058b c5058b2 = c5058b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5068b, c5058b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5068b, c5058b2);
                return this.$this_state.LIZ(c5068b, new b$c.C5070d(c5058b2.LIZIZ), C78644GzO.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$5$3 */
        /* loaded from: classes3.dex */
        public static final class C50493 extends Lambda implements Function2<b$c.C5068b, b$a.C5064h, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31300);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50493(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5068b c5068b, b$a.C5064h c5064h) {
                b$a.C5064h c5064h2 = c5064h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5068b, c5064h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5068b, c5064h2);
                return this.$this_state.LIZ(c5068b, new b$c.C5067a(c5064h2.LIZIZ), C78648GzS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$5$4 */
        /* loaded from: classes3.dex */
        public static final class C50504 extends Lambda implements Function2<b$c.C5068b, b$a.C5065i, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31301);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50504(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5068b c5068b, b$a.C5065i c5065i) {
                b$a.C5065i c5065i2 = c5065i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5068b, c5065i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5068b, c5065i2);
                return this.$this_state.LIZ(c5068b, new b$c.C5067a(c5065i2.LIZIZ), C78648GzS.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.TeamFightStateMachine$stateMachine$1$5$5 */
        /* loaded from: classes3.dex */
        public static final class C50515 extends Lambda implements Function2<b$c.C5068b, b$a.C5066j, C103396Qne<? extends b$c, ? extends b$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31302);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50515(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$c, ? extends com.bytedance.android.live.liveinteract.voicechat.fight.b$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends b$c, ? extends b$b> invoke(b$c.C5068b c5068b, b$a.C5066j c5066j) {
                b$a.C5066j c5066j2 = c5066j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5068b, c5066j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5068b, c5066j2);
                int i = c5066j2.LIZIZ.LJFF;
                if (i != 1) {
                    if (i != 2) {
                        return this.$this_state.LIZ(c5068b, b$c.C5069c.LIZJ, C78650GzU.LIZIZ);
                    }
                    return this.$this_state.LIZ(c5068b, new b$c.C5067a(c5066j2.LIZIZ), C78648GzS.LIZIZ);
                }
                return this.$this_state.LIZ(c5068b, new b$c.C5070d(c5066j2.LIZIZ), C78644GzO.LIZIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<b$c, b$a, b$b> c103398Qng) {
        C103398Qng<b$c, b$a, b$b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<b$c, b$a, b$b>) b$c.C5069c.LIZJ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C5069c.class), C50191.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C5070d.class), C50252.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C5067a.class), new C50323());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C5071e.class), new C50394());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(b$c.C5068b.class), C50465.INSTANCE);
            c103398Qng2.LIZ(new C50526());
        }
        return Unit.INSTANCE;
    }
}
