package com.bytedance.android.live.liveinteract.p382pk.task.api;

import com.bytedance.android.live.liveinteract.p382pk.task.api.h$a;
import com.bytedance.android.live.liveinteract.p382pk.task.api.h$d;
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
import p003X.C103385QnT;
import p003X.C103396Qne;
import p003X.C103398Qng;
import p003X.C106862S5w;
import p003X.QL7;
import p003X.R0B;
import p003X.R0H;
import p003X.R0I;

/* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1 */
/* loaded from: classes8.dex */
public final class TaskState$stateMachine$1 extends Lambda implements Function1<C103398Qng<h$d, h$a, h$c>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ R0B this$0;

    static {
        Covode.recordClassIndex(29051);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskState$stateMachine$1(R0B r0b) {
        super(1);
        this.this$0 = r0b;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$3 */
    /* loaded from: classes8.dex */
    public static final class C47423 extends Lambda implements Function1<C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4752d>, Unit> {
        public static final C47423 INSTANCE = new C47423();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29056);
        }

        public C47423() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4752d> c0033a) {
            if (!PatchProxy.proxy(new Object[]{c0033a}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$4 */
    /* loaded from: classes8.dex */
    public static final class C47434 extends Lambda implements Function1<C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4749a>, Unit> {
        public static final C47434 INSTANCE = new C47434();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29057);
        }

        public C47434() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4749a> c0033a) {
            if (!PatchProxy.proxy(new Object[]{c0033a}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$1 */
    /* loaded from: classes8.dex */
    public static final class C47381 extends Lambda implements Function1<C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4750b>, Unit> {
        public static final C47381 INSTANCE = new C47381();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29052);
        }

        public C47381() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4750b> c0033a) {
            C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4750b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4748b.class), new C47391(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$1$1 */
        /* loaded from: classes8.dex */
        public static final class C47391 extends Lambda implements Function2<h$d.C4750b, h$a.C4748b, C103396Qne<? extends h$d, ? extends h$c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29053);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C47391(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.pk.task.api.h$d, ? extends com.bytedance.android.live.liveinteract.pk.task.api.h$c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$d, ? extends h$c> invoke(h$d.C4750b c4750b, h$a.C4748b c4748b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4750b, c4748b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4750b, c4748b);
                return this.$this_state.LIZ(c4750b, h$d.C4751c.LIZ, R0I.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$2 */
    /* loaded from: classes8.dex */
    public static final class C47402 extends Lambda implements Function1<C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4751c>, Unit> {
        public static final C47402 INSTANCE = new C47402();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29054);
        }

        public C47402() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4751c> c0033a) {
            C103398Qng<h$d, h$a, h$c>.C0033a<h$d.C4751c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(h$a.C4747a.class), new C47411(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$2$1 */
        /* loaded from: classes8.dex */
        public static final class C47411 extends Lambda implements Function2<h$d.C4751c, h$a.C4747a, C103396Qne<? extends h$d, ? extends h$c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(29055);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C47411(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.liveinteract.pk.task.api.h$d, ? extends com.bytedance.android.live.liveinteract.pk.task.api.h$c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends h$d, ? extends h$c> invoke(h$d.C4751c c4751c, h$a.C4747a c4747a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4751c, c4747a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4751c, c4747a);
                return this.$this_state.LIZ(c4751c, h$d.C4752d.LIZ, R0H.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<h$d, h$a, h$c> c103398Qng) {
        C103398Qng<h$d, h$a, h$c> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<h$d, h$a, h$c>) h$d.C4750b.LIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$d.C4750b.class), C47381.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$d.C4751c.class), C47402.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$d.C4752d.class), C47423.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(h$d.C4749a.class), C47434.INSTANCE);
            c103398Qng2.LIZ(new C47445());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.TaskState$stateMachine$1$5 */
    /* loaded from: classes8.dex */
    public static final class C47445 extends Lambda implements Function1<AbstractC103391QnZ<? extends h$d, ? extends h$a, ? extends h$c>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29058);
        }

        public C47445() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends h$d, ? extends h$a, ? extends h$c> abstractC103391QnZ) {
            AbstractC103391QnZ<? extends h$d, ? extends h$a, ? extends h$c> abstractC103391QnZ2 = abstractC103391QnZ;
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ2);
                if (!(abstractC103391QnZ2 instanceof C103385QnT)) {
                    abstractC103391QnZ2 = null;
                }
                C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ2;
                if (c103385QnT != null) {
                    SIDE_EFFECT side_effect = c103385QnT.LIZJ;
                    if (Intrinsics.areEqual(side_effect, R0I.LIZ)) {
                        TaskState$stateMachine$1.this.this$0.LIZLLL = System.currentTimeMillis();
                        EVENT LIZIZ = c103385QnT.LIZIZ();
                        if (LIZIZ != 0) {
                            Object obj = ((h$a.C4748b) LIZIZ).LIZ;
                            R0B.LIZ(TaskState$stateMachine$1.this.this$0).LIZIZ(R0B.LIZIZ(TaskState$stateMachine$1.this.this$0));
                            R0B.LIZIZ(TaskState$stateMachine$1.this.this$0).LIZIZ(obj);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.pk.task.api.TaskState.Event.Start");
                        }
                    } else if (Intrinsics.areEqual(side_effect, R0H.LIZ)) {
                        System.currentTimeMillis();
                        EVENT LIZIZ2 = c103385QnT.LIZIZ();
                        if (LIZIZ2 != 0) {
                            AbstractC4746f<?, Exception> abstractC4746f = ((h$a.C4747a) LIZIZ2).LIZ;
                            if (abstractC4746f != null) {
                                R0B.LIZ(TaskState$stateMachine$1.this.this$0).LIZ(R0B.LIZIZ(TaskState$stateMachine$1.this.this$0), abstractC4746f);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.pk.task.api.TaskResult<OUTPUT, kotlin.Exception /* = java.lang.Exception */>");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.pk.task.api.TaskState.Event.Finish");
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
