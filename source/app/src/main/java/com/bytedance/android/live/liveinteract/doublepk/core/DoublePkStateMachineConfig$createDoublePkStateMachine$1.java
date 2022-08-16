package com.bytedance.android.live.liveinteract.doublepk.core;

import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4399b;
import com.bytedance.android.live.liveinteract.doublepk.core.AbstractC4404d;
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
import p003X.C78890H8a;
import p003X.H8Y;
import p003X.H8Z;
import p003X.QL7;

/* loaded from: classes3.dex */
public final class DoublePkStateMachineConfig$createDoublePkStateMachine$1 extends Lambda implements Function1<C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $listener;

    static {
        Covode.recordClassIndex(26757);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoublePkStateMachineConfig$createDoublePkStateMachine$1(Function1 function1) {
        super(1);
        this.$listener = function1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$1 */
    /* loaded from: classes3.dex */
    public static final class C43891 extends Lambda implements Function1<C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4407c>, Unit> {
        public static final C43891 INSTANCE = new C43891();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26758);
        }

        public C43891() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4407c> c0033a) {
            C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4407c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4399b.C4402c.class), new C43901(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4399b.C4400a.class), new C43912(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$1$1 */
        /* loaded from: classes3.dex */
        public static final class C43901 extends Lambda implements Function2<AbstractC4404d.C4407c, AbstractC4399b.C4402c, C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(26759);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C43901(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.doublepk.core.d, ? extends com.bytedance.android.live.liveinteract.doublepk.core.c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c> invoke(AbstractC4404d.C4407c c4407c, AbstractC4399b.C4402c c4402c) {
                AbstractC4399b.C4402c c4402c2 = c4402c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4407c, c4402c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4407c, c4402c2);
                return this.$this_state.LIZ(c4407c, new AbstractC4404d.C4406b(c4402c2.LIZ), new H8Z());
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$1$2 */
        /* loaded from: classes3.dex */
        public static final class C43912 extends Lambda implements Function2<AbstractC4404d.C4407c, AbstractC4399b.C4400a, C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(26760);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C43912(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.doublepk.core.d, ? extends com.bytedance.android.live.liveinteract.doublepk.core.c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c> invoke(AbstractC4404d.C4407c c4407c, AbstractC4399b.C4400a c4400a) {
                AbstractC4399b.C4400a c4400a2 = c4400a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4407c, c4400a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4407c, c4400a2);
                return this.$this_state.LIZ(c4407c, new AbstractC4404d.C4405a(c4400a2.LIZ), new H8Y());
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$2 */
    /* loaded from: classes3.dex */
    public static final class C43922 extends Lambda implements Function1<C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4406b>, Unit> {
        public static final C43922 INSTANCE = new C43922();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26761);
        }

        public C43922() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4406b> c0033a) {
            C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4406b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4399b.C4401b.class), new C43931(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4399b.C4400a.class), new C43942(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$2$1 */
        /* loaded from: classes3.dex */
        public static final class C43931 extends Lambda implements Function2<AbstractC4404d.C4406b, AbstractC4399b.C4401b, C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(26762);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C43931(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.doublepk.core.d, ? extends com.bytedance.android.live.liveinteract.doublepk.core.c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c> invoke(AbstractC4404d.C4406b c4406b, AbstractC4399b.C4401b c4401b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4406b, c4401b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4406b, c4401b);
                return this.$this_state.LIZ(c4406b, new AbstractC4404d.C4407c(), new C78890H8a());
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$2$2 */
        /* loaded from: classes3.dex */
        public static final class C43942 extends Lambda implements Function2<AbstractC4404d.C4406b, AbstractC4399b.C4400a, C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(26763);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C43942(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.doublepk.core.d, ? extends com.bytedance.android.live.liveinteract.doublepk.core.c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c> invoke(AbstractC4404d.C4406b c4406b, AbstractC4399b.C4400a c4400a) {
                AbstractC4399b.C4400a c4400a2 = c4400a;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4406b, c4400a2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4406b, c4400a2);
                return this.$this_state.LIZ(c4406b, new AbstractC4404d.C4405a(c4400a2.LIZ), new H8Y());
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$3 */
    /* loaded from: classes3.dex */
    public static final class C43953 extends Lambda implements Function1<C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4405a>, Unit> {
        public static final C43953 INSTANCE = new C43953();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26764);
        }

        public C43953() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4405a> c0033a) {
            C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>.C0033a<AbstractC4404d.C4405a> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4399b.C4401b.class), new C43961(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(AbstractC4399b.C4402c.class), new C43972(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$3$1 */
        /* loaded from: classes3.dex */
        public static final class C43961 extends Lambda implements Function2<AbstractC4404d.C4405a, AbstractC4399b.C4401b, C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(26765);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C43961(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.doublepk.core.d, ? extends com.bytedance.android.live.liveinteract.doublepk.core.c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c> invoke(AbstractC4404d.C4405a c4405a, AbstractC4399b.C4401b c4401b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4405a, c4401b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4405a, c4401b);
                return this.$this_state.LIZ(c4405a, new AbstractC4404d.C4407c(), new C78890H8a());
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.DoublePkStateMachineConfig$createDoublePkStateMachine$1$3$2 */
        /* loaded from: classes3.dex */
        public static final class C43972 extends Lambda implements Function2<AbstractC4404d.C4405a, AbstractC4399b.C4402c, C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(26766);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C43972(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.doublepk.core.d, ? extends com.bytedance.android.live.liveinteract.doublepk.core.c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends AbstractC4404d, ? extends AbstractC4403c> invoke(AbstractC4404d.C4405a c4405a, AbstractC4399b.C4402c c4402c) {
                AbstractC4399b.C4402c c4402c2 = c4402c;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4405a, c4402c2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4405a, c4402c2);
                return this.$this_state.LIZ(c4405a, new AbstractC4404d.C4406b(c4402c2.LIZ), new H8Z());
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c> c103398Qng) {
        C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<AbstractC4404d, AbstractC4399b, AbstractC4403c>) new AbstractC4404d.C4407c());
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4404d.C4407c.class), C43891.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4404d.C4406b.class), C43922.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(AbstractC4404d.C4405a.class), C43953.INSTANCE);
            c103398Qng2.LIZ(this.$listener);
        }
        return Unit.INSTANCE;
    }
}
