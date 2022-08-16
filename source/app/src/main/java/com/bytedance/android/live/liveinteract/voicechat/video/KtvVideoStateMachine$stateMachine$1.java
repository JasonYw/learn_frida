package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.android.live.liveinteract.api.data.p341a.C4280a;
import com.bytedance.android.live.liveinteract.voicechat.video.d$a;
import com.bytedance.android.live.liveinteract.voicechat.video.d$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC80486Ho0;
import p003X.C103396Qne;
import p003X.C103398Qng;
import p003X.C106862S5w;
import p003X.C80421Hmx;
import p003X.C80485Hnz;
import p003X.C80494Ho8;
import p003X.C80495Ho9;
import p003X.C80498HoC;
import p003X.C80499HoD;
import p003X.C80500HoE;
import p003X.C80501HoF;
import p003X.C80502HoG;
import p003X.C80503HoH;
import p003X.C80504HoI;
import p003X.C80505HoJ;
import p003X.C80506HoK;
import p003X.C80507HoL;
import p003X.QL7;

/* loaded from: classes3.dex */
public final class KtvVideoStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<d$c, d$a, d$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80485Hnz this$0;

    static {
        Covode.recordClassIndex(31743);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvVideoStateMachine$stateMachine$1(C80485Hnz c80485Hnz) {
        super(1);
        this.this$0 = c80485Hnz;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$6 */
    /* loaded from: classes3.dex */
    public static final class C51146 extends Lambda implements Function1<AbstractC103391QnZ<? extends d$c, ? extends d$a, ? extends d$b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31778);
        }

        public C51146() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends d$c, ? extends d$a, ? extends d$b> abstractC103391QnZ) {
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ);
                KtvVideoStateMachine$stateMachine$1.this.this$0.LIZJ.invoke(abstractC103391QnZ);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C50801 extends Lambda implements Function1<C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5129a>, Unit> {
        public static final C50801 INSTANCE = new C50801();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31744);
        }

        public C50801() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5129a> c0033a) {
            C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5129a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5123i.class), new C50811(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5125k.class), new C50822(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5121g.class), new C50833(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5120f.class), new C50844(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5119e.class), new C50855(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5118d.class), new C50866(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C50811 extends Lambda implements Function2<d$c.C5129a, d$a.C5123i, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31745);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50811(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5129a c5129a, d$a.C5123i c5123i) {
                d$a.C5123i c5123i2 = c5123i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5129a, c5123i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5129a, c5123i2);
                return this.$this_state.LIZ(c5129a, new d$c.C5132d(c5123i2.LIZIZ, c5123i2.LIZJ), C80494Ho8.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C50822 extends Lambda implements Function2<d$c.C5129a, d$a.C5125k, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31746);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50822(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5129a c5129a, d$a.C5125k c5125k) {
                d$a.C5125k c5125k2 = c5125k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5129a, c5125k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5129a, c5125k2);
                return this.$this_state.LIZ(c5129a, new d$c.C5133e(c5125k2.LIZIZ, null, 2), C80494Ho8.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C50833 extends Lambda implements Function2<d$c.C5129a, d$a.C5121g, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31747);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50833(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5129a c5129a, d$a.C5121g c5121g) {
                d$a.C5121g c5121g2 = c5121g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5129a, c5121g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5129a, c5121g2);
                C4280a c4280a = c5121g2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5129a, new d$c.C5130b(str, c4280a.LIZJ()), C80506HoK.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1$4 */
        /* loaded from: classes3.dex */
        public static final class C50844 extends Lambda implements Function2<d$c.C5129a, d$a.C5120f, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31748);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50844(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5129a c5129a, d$a.C5120f c5120f) {
                d$a.C5120f c5120f2 = c5120f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5129a, c5120f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5129a, c5120f2);
                C4280a c4280a = c5120f2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5129a, new d$c.C5133e(str, null, 2), C80494Ho8.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1$5 */
        /* loaded from: classes3.dex */
        public static final class C50855 extends Lambda implements Function2<d$c.C5129a, d$a.C5119e, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31749);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50855(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5129a c5129a, d$a.C5119e c5119e) {
                d$a.C5119e c5119e2 = c5119e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5129a, c5119e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5129a, c5119e2);
                C4280a c4280a = c5119e2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5129a, new d$c.C5131c(str, c4280a.LIZJ()), C80507HoL.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$1$6 */
        /* loaded from: classes3.dex */
        public static final class C50866 extends Lambda implements Function2<d$c.C5129a, d$a.C5118d, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31750);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50866(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5129a c5129a, d$a.C5118d c5118d) {
                d$a.C5118d c5118d2 = c5118d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5129a, c5118d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5129a, c5118d2);
                C4280a c4280a = c5118d2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5129a, new d$c.C5133e(str, null, 2), C80494Ho8.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C50872 extends Lambda implements Function1<C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5132d>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31751);
        }

        public C50872() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5132d> c0033a) {
            C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5132d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5122h.class), new C50881(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5115a.class), new C50892(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5124j.class), new C50903(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5117c.class), new C50914(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5126l.class), new C50925(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5128n.class), new C50936(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C50881 extends Lambda implements Function2<d$c.C5132d, d$a.C5122h, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31752);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50881(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5132d c5132d, d$a.C5122h c5122h) {
                d$a.C5122h c5122h2 = c5122h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5132d, c5122h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5132d, c5122h2);
                return this.$this_state.LIZ(c5132d, new d$c.C5133e(c5122h2.LIZIZ, null, 2), new C80495Ho9(c5122h2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C50892 extends Lambda implements Function2<d$c.C5132d, d$a.C5115a, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31753);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50892(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5132d c5132d, d$a.C5115a c5115a) {
                d$a.C5115a c5115a2 = c5115a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5132d, c5115a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5132d, c5115a2);
                return this.$this_state.LIZ(c5132d, new d$c.C5133e(c5115a2.LIZIZ, null, 2), new C80495Ho9(C80499HoD.LJFF));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C50903 extends Lambda implements Function2<d$c.C5132d, d$a.C5124j, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31754);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50903(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5132d c5132d, d$a.C5124j c5124j) {
                d$a.C5124j c5124j2 = c5124j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5132d, c5124j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5132d, c5124j2);
                return this.$this_state.LIZ(c5132d, new d$c.C5133e(c5124j2.LIZIZ, null, 2), new C80495Ho9(C80421Hmx.LJFF));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2$4 */
        /* loaded from: classes3.dex */
        public static final class C50914 extends Lambda implements Function2<d$c.C5132d, d$a.C5117c, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31755);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50914(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5132d c5132d, d$a.C5117c c5117c) {
                d$a.C5117c c5117c2 = c5117c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5132d, c5117c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5132d, c5117c2);
                return this.$this_state.LIZ(c5132d, new d$c.C5133e(c5117c2.LIZIZ, null, 2), new C80495Ho9(C80501HoF.LJFF));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2$5 */
        /* loaded from: classes3.dex */
        public static final class C50925 extends Lambda implements Function2<d$c.C5132d, d$a.C5126l, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31756);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50925(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5132d c5132d, d$a.C5126l c5126l) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5132d, c5126l}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5132d, c5126l);
                return this.$this_state.LIZ(c5132d, d$c.C5129a.f26501LJ, new C80495Ho9(C80502HoG.LJFF));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$2$6 */
        /* loaded from: classes3.dex */
        public static final class C50936 extends Lambda implements Function2<d$c.C5132d, d$a.C5128n, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31757);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50936(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5132d c5132d, d$a.C5128n c5128n) {
                AbstractC80486Ho0 abstractC80486Ho0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5132d, c5128n}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5132d, c5128n);
                if (KtvVideoStateMachine$stateMachine$1.this.this$0.LIZIZ) {
                    abstractC80486Ho0 = C80498HoC.LJFF;
                } else {
                    abstractC80486Ho0 = C80500HoE.LJFF;
                }
                return this.$this_state.LIZ(c5132d, d$c.C5129a.f26501LJ, new C80495Ho9(abstractC80486Ho0));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C51024 extends Lambda implements Function1<C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5131c>, Unit> {
        public static final C51024 INSTANCE = new C51024();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31766);
        }

        public C51024() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5131c> c0033a) {
            C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5131c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5119e.class), new C51031(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5118d.class), new C51042(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5116b.class), new C51053(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5127m.class), new C51064(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5126l.class), new C51075(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5128n.class), new C51086(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C51031 extends Lambda implements Function2<d$c.C5131c, d$a.C5119e, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31767);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51031(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5131c c5131c, d$a.C5119e c5119e) {
                d$a.C5119e c5119e2 = c5119e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5131c, c5119e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5131c, c5119e2);
                C4280a c4280a = c5119e2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5131c, new d$c.C5131c(str, c4280a.LIZJ()), C80494Ho8.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4$2 */
        /* loaded from: classes3.dex */
        public static final class C51042 extends Lambda implements Function2<d$c.C5131c, d$a.C5118d, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31768);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51042(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5131c c5131c, d$a.C5118d c5118d) {
                d$a.C5118d c5118d2 = c5118d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5131c, c5118d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5131c, c5118d2);
                C4280a c4280a = c5118d2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5131c, new d$c.C5133e(str, null, 2), C80504HoI.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4$3 */
        /* loaded from: classes3.dex */
        public static final class C51053 extends Lambda implements Function2<d$c.C5131c, d$a.C5116b, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31769);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51053(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5131c c5131c, d$a.C5116b c5116b) {
                d$a.C5116b c5116b2 = c5116b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5131c, c5116b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5131c, c5116b2);
                return this.$this_state.LIZ(c5131c, new d$c.C5133e(c5116b2.LIZIZ, null, 2), C80504HoI.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4$4 */
        /* loaded from: classes3.dex */
        public static final class C51064 extends Lambda implements Function2<d$c.C5131c, d$a.C5127m, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31770);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51064(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5131c c5131c, d$a.C5127m c5127m) {
                d$a.C5127m c5127m2 = c5127m;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5131c, c5127m2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5131c, c5127m2);
                return this.$this_state.LIZ(c5131c, new d$c.C5133e(c5127m2.LIZIZ, null, 2), C80504HoI.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4$5 */
        /* loaded from: classes3.dex */
        public static final class C51075 extends Lambda implements Function2<d$c.C5131c, d$a.C5126l, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31771);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51075(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5131c c5131c, d$a.C5126l c5126l) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5131c, c5126l}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5131c, c5126l);
                return this.$this_state.LIZ(c5131c, d$c.C5129a.f26501LJ, C80504HoI.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$4$6 */
        /* loaded from: classes3.dex */
        public static final class C51086 extends Lambda implements Function2<d$c.C5131c, d$a.C5128n, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31772);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51086(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5131c c5131c, d$a.C5128n c5128n) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5131c, c5128n}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5131c, c5128n);
                return this.$this_state.LIZ(c5131c, d$c.C5129a.f26501LJ, C80505HoJ.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$5 */
    /* loaded from: classes3.dex */
    public static final class C51095 extends Lambda implements Function1<C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5133e>, Unit> {
        public static final C51095 INSTANCE = new C51095();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31773);
        }

        public C51095() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5133e> c0033a) {
            C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5133e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5123i.class), new C51101(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5121g.class), new C51112(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5119e.class), new C51123(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5125k.class), new C51134(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$5$1 */
        /* loaded from: classes3.dex */
        public static final class C51101 extends Lambda implements Function2<d$c.C5133e, d$a.C5123i, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31774);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51101(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5133e c5133e, d$a.C5123i c5123i) {
                d$a.C5123i c5123i2 = c5123i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5133e, c5123i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5133e, c5123i2);
                return this.$this_state.LIZ(c5133e, new d$c.C5132d(c5123i2.LIZIZ, c5123i2.LIZJ), C80494Ho8.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$5$2 */
        /* loaded from: classes3.dex */
        public static final class C51112 extends Lambda implements Function2<d$c.C5133e, d$a.C5121g, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31775);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51112(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5133e c5133e, d$a.C5121g c5121g) {
                d$a.C5121g c5121g2 = c5121g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5133e, c5121g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5133e, c5121g2);
                C4280a c4280a = c5121g2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5133e, new d$c.C5130b(str, c4280a.LIZJ()), C80506HoK.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$5$3 */
        /* loaded from: classes3.dex */
        public static final class C51123 extends Lambda implements Function2<d$c.C5133e, d$a.C5119e, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31776);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51123(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5133e c5133e, d$a.C5119e c5119e) {
                d$a.C5119e c5119e2 = c5119e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5133e, c5119e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5133e, c5119e2);
                C4280a c4280a = c5119e2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5133e, new d$c.C5131c(str, c4280a.LIZJ()), C80507HoL.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$5$4 */
        /* loaded from: classes3.dex */
        public static final class C51134 extends Lambda implements Function2<d$c.C5133e, d$a.C5125k, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31777);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51134(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5133e c5133e, d$a.C5125k c5125k) {
                d$a.C5125k c5125k2 = c5125k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5133e, c5125k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5133e, c5125k2);
                return this.$this_state.LIZ(c5133e, new d$c.C5133e(c5125k2.LIZIZ, null, 2), C80494Ho8.LIZIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<d$c, d$a, d$b> c103398Qng) {
        C103398Qng<d$c, d$a, d$b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<d$c, d$a, d$b>) d$c.C5129a.f26501LJ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(d$c.C5129a.class), C50801.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(d$c.C5132d.class), new C50872());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(d$c.C5130b.class), C50943.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(d$c.C5131c.class), C51024.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(d$c.C5133e.class), C51095.INSTANCE);
            c103398Qng2.LIZ(new C51146());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C50943 extends Lambda implements Function1<C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5130b>, Unit> {
        public static final C50943 INSTANCE = new C50943();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31758);
        }

        public C50943() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5130b> c0033a) {
            C103398Qng<d$c, d$a, d$b>.C0033a<d$c.C5130b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5121g.class), new C50951(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5120f.class), new C50962(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5125k.class), new C50973(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5117c.class), new C50984(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5127m.class), new C50995(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5126l.class), new C51006(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(d$a.C5128n.class), new C51017(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C50951 extends Lambda implements Function2<d$c.C5130b, d$a.C5121g, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31759);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50951(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5121g c5121g) {
                d$a.C5121g c5121g2 = c5121g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5121g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5121g2);
                C4280a c4280a = c5121g2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5130b, new d$c.C5130b(str, c4280a.LIZJ()), C80494Ho8.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C50962 extends Lambda implements Function2<d$c.C5130b, d$a.C5120f, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31760);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50962(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5120f c5120f) {
                d$a.C5120f c5120f2 = c5120f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5120f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5120f2);
                C4280a c4280a = c5120f2.LIZIZ;
                C103398Qng.C0033a c0033a = this.$this_state;
                String str = c4280a.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return c0033a.LIZ(c5130b, new d$c.C5133e(str, null, 2), C80503HoH.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$3 */
        /* loaded from: classes3.dex */
        public static final class C50973 extends Lambda implements Function2<d$c.C5130b, d$a.C5125k, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31761);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50973(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5125k c5125k) {
                d$a.C5125k c5125k2 = c5125k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5125k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5125k2);
                return this.$this_state.LIZ(c5130b, new d$c.C5133e(c5125k2.LIZIZ, null, 2), C80503HoH.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$4 */
        /* loaded from: classes3.dex */
        public static final class C50984 extends Lambda implements Function2<d$c.C5130b, d$a.C5117c, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31762);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50984(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5117c c5117c) {
                d$a.C5117c c5117c2 = c5117c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5117c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5117c2);
                return this.$this_state.LIZ(c5130b, new d$c.C5133e(c5117c2.LIZIZ, null, 2), C80503HoH.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$5 */
        /* loaded from: classes3.dex */
        public static final class C50995 extends Lambda implements Function2<d$c.C5130b, d$a.C5127m, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31763);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C50995(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5127m c5127m) {
                d$a.C5127m c5127m2 = c5127m;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5127m2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5127m2);
                return this.$this_state.LIZ(c5130b, new d$c.C5133e(c5127m2.LIZIZ, null, 2), C80503HoH.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$6 */
        /* loaded from: classes3.dex */
        public static final class C51006 extends Lambda implements Function2<d$c.C5130b, d$a.C5126l, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31764);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51006(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5126l c5126l) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5126l}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5126l);
                return this.$this_state.LIZ(c5130b, d$c.C5129a.f26501LJ, C80503HoH.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.voicechat.video.KtvVideoStateMachine$stateMachine$1$3$7 */
        /* loaded from: classes3.dex */
        public static final class C51017 extends Lambda implements Function2<d$c.C5130b, d$a.C5128n, C103396Qne<? extends d$c, ? extends d$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(31765);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C51017(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.voicechat.video.d$c, ? extends com.bytedance.android.live.liveinteract.voicechat.video.d$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends d$c, ? extends d$b> invoke(d$c.C5130b c5130b, d$a.C5128n c5128n) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5130b, c5128n}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c5130b, c5128n);
                return this.$this_state.LIZ(c5130b, d$c.C5129a.f26501LJ, C80505HoJ.LIZIZ);
            }
        }
    }
}
