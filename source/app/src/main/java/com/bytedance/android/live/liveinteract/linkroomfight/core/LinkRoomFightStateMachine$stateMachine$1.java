package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.android.live.liveinteract.linkroomfight.core.e$a;
import com.bytedance.android.live.liveinteract.linkroomfight.core.e$c;
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
import p003X.C78786H4a;
import p003X.C78802H4q;
import p003X.C78803H4r;
import p003X.C78804H4s;
import p003X.C78805H4t;
import p003X.C78806H4u;
import p003X.C78807H4v;
import p003X.C78808H4w;
import p003X.QL7;

/* loaded from: classes3.dex */
public final class LinkRoomFightStateMachine$stateMachine$1 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78786H4a this$0;

    static {
        Covode.recordClassIndex(27567);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightStateMachine$stateMachine$1(C78786H4a c78786H4a) {
        super(1);
        this.this$0 = c78786H4a;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$7 */
    /* loaded from: classes3.dex */
    public static final class C44907 extends Lambda implements Function1<AbstractC103391QnZ<? extends e$c, ? extends e$a, ? extends e$b>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27602);
        }

        public C44907() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends e$c, ? extends e$a, ? extends e$b> abstractC103391QnZ) {
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ);
                LinkRoomFightStateMachine$stateMachine$1.this.this$0.LIZIZ.invoke(abstractC103391QnZ);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$6 */
    /* loaded from: classes3.dex */
    public static final class C44886 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4505b>, Unit> {
        public static final C44886 INSTANCE = new C44886();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27600);
        }

        public C44886() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4505b> c0033a) {
            C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4505b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4501i.class), new C44891(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$6$1 */
        /* loaded from: classes3.dex */
        public static final class C44891 extends Lambda implements Function2<e$c.C4505b, e$a.C4501i, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27601);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44891(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4505b c4505b, e$a.C4501i c4501i) {
                e$a.C4501i c4501i2 = c4501i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4505b, c4501i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4505b, c4501i2);
                return this.$this_state.LIZ(c4505b, new e$c.C4504a(c4501i2.LIZIZ), C78806H4u.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C44561 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4506c>, Unit> {
        public static final C44561 INSTANCE = new C44561();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27568);
        }

        public C44561() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4506c> c0033a) {
            C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4506c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4501i.class), new C44571(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4494b.class), new C44582(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4497e.class), new C44593(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4502j.class), new C44604(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C44571 extends Lambda implements Function2<e$c.C4506c, e$a.C4501i, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27569);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44571(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4506c c4506c, e$a.C4501i c4501i) {
                e$a.C4501i c4501i2 = c4501i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4506c, c4501i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4506c, c4501i2);
                return this.$this_state.LIZ(c4506c, new e$c.C4504a(c4501i2.LIZIZ), C78806H4u.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C44582 extends Lambda implements Function2<e$c.C4506c, e$a.C4494b, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27570);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44582(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4506c c4506c, e$a.C4494b c4494b) {
                e$a.C4494b c4494b2 = c4494b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4506c, c4494b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4506c, c4494b2);
                return this.$this_state.LIZ(c4506c, new e$c.C4505b(c4494b2.LIZIZ), new C78803H4r(c4494b2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$1$4 */
        /* loaded from: classes3.dex */
        public static final class C44604 extends Lambda implements Function2<e$c.C4506c, e$a.C4502j, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27572);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44604(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4506c c4506c, e$a.C4502j c4502j) {
                e$a.C4502j c4502j2 = c4502j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4506c, c4502j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4506c, c4502j2);
                if (c4502j2.LIZIZ.LJFF != 2) {
                    return this.$this_state.LIZ(c4506c, e$c.C4506c.LIZJ, C78804H4s.LIZIZ);
                }
                return this.$this_state.LIZ(c4506c, new e$c.C4504a(c4502j2.LIZIZ), C78806H4u.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$1$3 */
        /* loaded from: classes3.dex */
        public static final class C44593 extends Lambda implements Function2<e$c.C4506c, e$a.C4497e, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27571);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44593(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4506c c4506c, e$a.C4497e c4497e) {
                e$a.C4497e c4497e2 = c4497e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4506c, c4497e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4506c, c4497e2);
                int i = c4497e2.LIZIZ.LJFF;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return this.$this_state.LIZ(c4506c, e$c.C4506c.LIZJ, C78804H4s.LIZIZ);
                            }
                            return this.$this_state.LIZ(c4506c, new e$c.C4507d(c4497e2.LIZIZ), C78807H4v.LIZIZ);
                        }
                        return this.$this_state.LIZ(c4506c, new e$c.C4505b(c4497e2.LIZIZ), C78804H4s.LIZIZ);
                    }
                    return this.$this_state.LIZ(c4506c, new e$c.C4508e(c4497e2.LIZIZ), C78805H4t.LIZIZ);
                }
                return this.$this_state.LIZ(c4506c, new e$c.C4504a(c4497e2.LIZIZ), C78806H4u.LIZIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C44693 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4509f>, Unit> {
        public static final C44693 INSTANCE = new C44693();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27581);
        }

        public C44693() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4509f> c0033a) {
            C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4509f> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4502j.class), new C44701(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4503k.class), new C44712(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4498f.class), new C44723(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4494b.class), new C44734(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4495c.class), new C44745(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4496d.class), new C44756(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C44701 extends Lambda implements Function2<e$c.C4509f, e$a.C4502j, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27582);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44701(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4509f c4509f, e$a.C4502j c4502j) {
                e$a.C4502j c4502j2 = c4502j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4509f, c4502j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4509f, c4502j2);
                return this.$this_state.LIZ(c4509f, new e$c.C4509f(c4502j2.LIZIZ), C78802H4q.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C44712 extends Lambda implements Function2<e$c.C4509f, e$a.C4503k, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27583);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44712(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4509f c4509f, e$a.C4503k c4503k) {
                e$a.C4503k c4503k2 = c4503k;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4509f, c4503k2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4509f, c4503k2);
                return this.$this_state.LIZ(c4509f, new e$c.C4505b(c4503k2.LIZIZ), new C78803H4r(null));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3$3 */
        /* loaded from: classes3.dex */
        public static final class C44723 extends Lambda implements Function2<e$c.C4509f, e$a.C4498f, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27584);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44723(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4509f c4509f, e$a.C4498f c4498f) {
                e$a.C4498f c4498f2 = c4498f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4509f, c4498f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4509f, c4498f2);
                return this.$this_state.LIZ(c4509f, new e$c.C4508e(c4498f2.LIZIZ), C78805H4t.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3$4 */
        /* loaded from: classes3.dex */
        public static final class C44734 extends Lambda implements Function2<e$c.C4509f, e$a.C4494b, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27585);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44734(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4509f c4509f, e$a.C4494b c4494b) {
                e$a.C4494b c4494b2 = c4494b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4509f, c4494b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4509f, c4494b2);
                return this.$this_state.LIZ(c4509f, new e$c.C4505b(c4494b2.LIZIZ), new C78803H4r(c4494b2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3$5 */
        /* loaded from: classes3.dex */
        public static final class C44745 extends Lambda implements Function2<e$c.C4509f, e$a.C4495c, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27586);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44745(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4509f c4509f, e$a.C4495c c4495c) {
                e$a.C4495c c4495c2 = c4495c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4509f, c4495c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4509f, c4495c2);
                return this.$this_state.LIZ(c4509f, new e$c.C4505b(c4495c2.LIZIZ), new C78803H4r(c4495c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$3$6 */
        /* loaded from: classes3.dex */
        public static final class C44756 extends Lambda implements Function2<e$c.C4509f, e$a.C4496d, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27587);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44756(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4509f c4509f, e$a.C4496d c4496d) {
                e$a.C4496d c4496d2 = c4496d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4509f, c4496d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4509f, c4496d2);
                return this.$this_state.LIZ(c4509f, new e$c.C4505b(c4496d2.LIZIZ), new C78803H4r(c4496d2.LIZJ));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$4 */
    /* loaded from: classes3.dex */
    public static final class C44764 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4508e>, Unit> {
        public static final C44764 INSTANCE = new C44764();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27588);
        }

        public C44764() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4508e> c0033a) {
            C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4508e> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4499g.class), new C44771(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4494b.class), new C44782(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4501i.class), new C44793(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4495c.class), new C44804(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4496d.class), new C44815(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$4$1 */
        /* loaded from: classes3.dex */
        public static final class C44771 extends Lambda implements Function2<e$c.C4508e, e$a.C4499g, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27589);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44771(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4508e c4508e, e$a.C4499g c4499g) {
                e$a.C4499g c4499g2 = c4499g;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4508e, c4499g2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4508e, c4499g2);
                return this.$this_state.LIZ(c4508e, new e$c.C4507d(c4499g2.LIZIZ), C78807H4v.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$4$2 */
        /* loaded from: classes3.dex */
        public static final class C44782 extends Lambda implements Function2<e$c.C4508e, e$a.C4494b, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27590);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44782(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4508e c4508e, e$a.C4494b c4494b) {
                e$a.C4494b c4494b2 = c4494b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4508e, c4494b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4508e, c4494b2);
                return this.$this_state.LIZ(c4508e, new e$c.C4505b(c4494b2.LIZIZ), new C78803H4r(c4494b2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$4$3 */
        /* loaded from: classes3.dex */
        public static final class C44793 extends Lambda implements Function2<e$c.C4508e, e$a.C4501i, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27591);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44793(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4508e c4508e, e$a.C4501i c4501i) {
                e$a.C4501i c4501i2 = c4501i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4508e, c4501i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4508e, c4501i2);
                return this.$this_state.LIZ(c4508e, new e$c.C4504a(c4501i2.LIZIZ), C78806H4u.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$4$4 */
        /* loaded from: classes3.dex */
        public static final class C44804 extends Lambda implements Function2<e$c.C4508e, e$a.C4495c, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27592);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44804(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4508e c4508e, e$a.C4495c c4495c) {
                e$a.C4495c c4495c2 = c4495c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4508e, c4495c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4508e, c4495c2);
                return this.$this_state.LIZ(c4508e, new e$c.C4505b(c4495c2.LIZIZ), new C78803H4r(c4495c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$4$5 */
        /* loaded from: classes3.dex */
        public static final class C44815 extends Lambda implements Function2<e$c.C4508e, e$a.C4496d, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27593);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44815(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4508e c4508e, e$a.C4496d c4496d) {
                e$a.C4496d c4496d2 = c4496d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4508e, c4496d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4508e, c4496d2);
                return this.$this_state.LIZ(c4508e, new e$c.C4505b(c4496d2.LIZIZ), new C78803H4r(c4496d2.LIZJ));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$5 */
    /* loaded from: classes3.dex */
    public static final class C44825 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4507d>, Unit> {
        public static final C44825 INSTANCE = new C44825();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27594);
        }

        public C44825() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4507d> c0033a) {
            C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4507d> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4500h.class), new C44831(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4501i.class), new C44842(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4494b.class), new C44853(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4495c.class), new C44864(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4496d.class), new C44875(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$5$1 */
        /* loaded from: classes3.dex */
        public static final class C44831 extends Lambda implements Function2<e$c.C4507d, e$a.C4500h, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27595);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44831(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4507d c4507d, e$a.C4500h c4500h) {
                e$a.C4500h c4500h2 = c4500h;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4507d, c4500h2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4507d, c4500h2);
                return this.$this_state.LIZ(c4507d, new e$c.C4504a(c4500h2.LIZIZ), C78806H4u.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$5$2 */
        /* loaded from: classes3.dex */
        public static final class C44842 extends Lambda implements Function2<e$c.C4507d, e$a.C4501i, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27596);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44842(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4507d c4507d, e$a.C4501i c4501i) {
                e$a.C4501i c4501i2 = c4501i;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4507d, c4501i2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4507d, c4501i2);
                return this.$this_state.LIZ(c4507d, new e$c.C4504a(c4501i2.LIZIZ), C78806H4u.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$5$3 */
        /* loaded from: classes3.dex */
        public static final class C44853 extends Lambda implements Function2<e$c.C4507d, e$a.C4494b, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27597);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44853(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4507d c4507d, e$a.C4494b c4494b) {
                e$a.C4494b c4494b2 = c4494b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4507d, c4494b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4507d, c4494b2);
                return this.$this_state.LIZ(c4507d, new e$c.C4505b(c4494b2.LIZIZ), new C78803H4r(c4494b2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$5$4 */
        /* loaded from: classes3.dex */
        public static final class C44864 extends Lambda implements Function2<e$c.C4507d, e$a.C4495c, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27598);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44864(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4507d c4507d, e$a.C4495c c4495c) {
                e$a.C4495c c4495c2 = c4495c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4507d, c4495c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4507d, c4495c2);
                return this.$this_state.LIZ(c4507d, new e$c.C4505b(c4495c2.LIZIZ), new C78803H4r(c4495c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$5$5 */
        /* loaded from: classes3.dex */
        public static final class C44875 extends Lambda implements Function2<e$c.C4507d, e$a.C4496d, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27599);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44875(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4507d c4507d, e$a.C4496d c4496d) {
                e$a.C4496d c4496d2 = c4496d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4507d, c4496d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4507d, c4496d2);
                return this.$this_state.LIZ(c4507d, new e$c.C4505b(c4496d2.LIZIZ), new C78803H4r(c4496d2.LIZJ));
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b> c103398Qng) {
        C103398Qng<e$c, e$a, e$b> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<e$c, e$a, e$b>) e$c.C4506c.LIZJ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(e$c.C4506c.class), C44561.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(e$c.C4504a.class), new C44612());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(e$c.C4509f.class), C44693.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(e$c.C4508e.class), C44764.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(e$c.C4507d.class), C44825.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(e$c.C4505b.class), C44886.INSTANCE);
            c103398Qng2.LIZ(new C44907());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C44612 extends Lambda implements Function1<C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4504a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27573);
        }

        public C44612() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4504a> c0033a) {
            C103398Qng<e$c, e$a, e$b>.C0033a<e$c.C4504a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4502j.class), new C44621(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4493a.class), new C44632(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4498f.class), new C44643(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4494b.class), new C44654(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4495c.class), new C44665(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4496d.class), new C44676(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(e$a.C4497e.class), new C44687(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C44621 extends Lambda implements Function2<e$c.C4504a, e$a.C4502j, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27574);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44621(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4502j c4502j) {
                e$a.C4502j c4502j2 = c4502j;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4502j2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4502j2);
                return this.$this_state.LIZ(c4504a, new e$c.C4504a(c4502j2.LIZIZ), C78802H4q.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C44632 extends Lambda implements Function2<e$c.C4504a, e$a.C4493a, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27575);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44632(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4493a c4493a) {
                e$a.C4493a c4493a2 = c4493a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4493a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4493a2);
                return this.$this_state.LIZ(c4504a, new e$c.C4509f(c4493a2.LIZIZ), C78808H4w.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$3 */
        /* loaded from: classes3.dex */
        public static final class C44643 extends Lambda implements Function2<e$c.C4504a, e$a.C4498f, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27576);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44643(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4498f c4498f) {
                e$a.C4498f c4498f2 = c4498f;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4498f2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4498f2);
                return this.$this_state.LIZ(c4504a, new e$c.C4508e(c4498f2.LIZIZ), C78805H4t.LIZIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$4 */
        /* loaded from: classes3.dex */
        public static final class C44654 extends Lambda implements Function2<e$c.C4504a, e$a.C4494b, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27577);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44654(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4494b c4494b) {
                e$a.C4494b c4494b2 = c4494b;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4494b2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4494b2);
                return this.$this_state.LIZ(c4504a, new e$c.C4505b(c4494b2.LIZIZ), new C78803H4r(c4494b2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$5 */
        /* loaded from: classes3.dex */
        public static final class C44665 extends Lambda implements Function2<e$c.C4504a, e$a.C4495c, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27578);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44665(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4495c c4495c) {
                e$a.C4495c c4495c2 = c4495c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4495c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4495c2);
                return this.$this_state.LIZ(c4504a, new e$c.C4505b(c4495c2.LIZIZ), new C78803H4r(c4495c2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$6 */
        /* loaded from: classes3.dex */
        public static final class C44676 extends Lambda implements Function2<e$c.C4504a, e$a.C4496d, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27579);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44676(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4496d c4496d) {
                e$a.C4496d c4496d2 = c4496d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4496d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4496d2);
                return this.$this_state.LIZ(c4504a, new e$c.C4505b(c4496d2.LIZIZ), new C78803H4r(c4496d2.LIZJ));
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightStateMachine$stateMachine$1$2$7 */
        /* loaded from: classes3.dex */
        public static final class C44687 extends Lambda implements Function2<e$c.C4504a, e$a.C4497e, C103396Qne<? extends e$c, ? extends e$b>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(27580);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44687(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$c, ? extends com.bytedance.android.live.liveinteract.linkroomfight.core.e$b>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends e$c, ? extends e$b> invoke(e$c.C4504a c4504a, e$a.C4497e c4497e) {
                e$a.C4497e c4497e2 = c4497e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4504a, c4497e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4504a, c4497e2);
                int i = c4497e2.LIZIZ.LJFF;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return this.$this_state.LIZ(c4504a, LinkRoomFightStateMachine$stateMachine$1.this.this$0.LIZ(), C78804H4s.LIZIZ);
                            }
                            return this.$this_state.LIZ(c4504a, new e$c.C4507d(c4497e2.LIZIZ), C78807H4v.LIZIZ);
                        }
                        return this.$this_state.LIZ(c4504a, new e$c.C4505b(c4497e2.LIZIZ), C78804H4s.LIZIZ);
                    }
                    return this.$this_state.LIZ(c4504a, new e$c.C4508e(c4497e2.LIZIZ), C78805H4t.LIZIZ);
                }
                return this.$this_state.LIZ(c4504a, new e$c.C4504a(c4497e2.LIZIZ), C78804H4s.LIZIZ);
            }
        }
    }
}
