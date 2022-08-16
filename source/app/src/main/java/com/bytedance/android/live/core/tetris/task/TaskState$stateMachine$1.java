package com.bytedance.android.live.core.tetris.task;

import com.bytedance.android.live.core.tetris.task.c$a;
import com.bytedance.android.live.core.tetris.task.c$d;
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
import p003X.C148096fTe;
import p003X.C148103fTl;
import p003X.C148104fTm;
import p003X.C148105fTn;
import p003X.C46X;
import p003X.QL7;

/* loaded from: classes20.dex */
public final class TaskState$stateMachine$1 extends Lambda implements Function1<C103398Qng<c$d, c$a, c$c>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C148096fTe this$0;

    static {
        Covode.recordClassIndex(23756);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskState$stateMachine$1(C148096fTe c148096fTe) {
        super(1);
        this.this$0 = c148096fTe;
    }

    /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$3 */
    /* loaded from: classes20.dex */
    public static final class C41263 extends Lambda implements Function1<C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4138d>, Unit> {
        public static final C41263 INSTANCE = new C41263();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(23762);
        }

        public C41263() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4138d> c0033a) {
            if (!PatchProxy.proxy(new Object[]{c0033a}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$4 */
    /* loaded from: classes20.dex */
    public static final class C41274 extends Lambda implements Function1<C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4135a>, Unit> {
        public static final C41274 INSTANCE = new C41274();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(23763);
        }

        public C41274() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4135a> c0033a) {
            if (!PatchProxy.proxy(new Object[]{c0033a}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$1 */
    /* loaded from: classes20.dex */
    public static final class C41211 extends Lambda implements Function1<C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4136b>, Unit> {
        public static final C41211 INSTANCE = new C41211();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(23757);
        }

        public C41211() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4136b> c0033a) {
            C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4136b> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(c$a.C4133b.class), new C41221(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$1$1 */
        /* loaded from: classes20.dex */
        public static final class C41221 extends Lambda implements Function2<c$d.C4136b, c$a.C4133b, C103396Qne<? extends c$d, ? extends c$c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(23758);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41221(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.core.tetris.task.c$d, ? extends com.bytedance.android.live.core.tetris.task.c$c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends c$d, ? extends c$c> invoke(c$d.C4136b c4136b, c$a.C4133b c4133b) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4136b, c4133b}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4136b, c4133b);
                return this.$this_state.LIZ(c4136b, c$d.C4137c.LIZ, C148104fTm.LIZ);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$2 */
    /* loaded from: classes20.dex */
    public static final class C41232 extends Lambda implements Function1<C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4137c>, Unit> {
        public static final C41232 INSTANCE = new C41232();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(23759);
        }

        public C41232() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4137c> c0033a) {
            C103398Qng<c$d, c$a, c$c>.C0033a<c$d.C4137c> c0033a2 = c0033a;
            if (!PatchProxy.proxy(new Object[]{c0033a2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c0033a2);
                c0033a2.LIZ(QL7.LIZJ.LIZ(c$a.C4134c.class), new C41241(c0033a2));
                c0033a2.LIZ(QL7.LIZJ.LIZ(c$a.C4132a.class), new C41252(c0033a2));
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$2$1 */
        /* loaded from: classes20.dex */
        public static final class C41241 extends Lambda implements Function2<c$d.C4137c, c$a.C4134c, C103396Qne<? extends c$d, ? extends c$c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(23760);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41241(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.core.tetris.task.c$d, ? extends com.bytedance.android.live.core.tetris.task.c$c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends c$d, ? extends c$c> invoke(c$d.C4137c c4137c, c$a.C4134c c4134c) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4137c, c4134c}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4137c, c4134c);
                return this.$this_state.LIZ(c4137c, c$d.C4138d.LIZ, C148105fTn.LIZ);
            }
        }

        /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$2$2 */
        /* loaded from: classes20.dex */
        public static final class C41252 extends Lambda implements Function2<c$d.C4137c, c$a.C4132a, C103396Qne<? extends c$d, ? extends c$c>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ C103398Qng.C0033a $this_state;

            static {
                Covode.recordClassIndex(23761);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41252(C103398Qng.C0033a c0033a) {
                super(2);
                this.$this_state = c0033a;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [X.Qne<? extends com.bytedance.android.live.core.tetris.task.c$d, ? extends com.bytedance.android.live.core.tetris.task.c$c>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C103396Qne<? extends c$d, ? extends c$c> invoke(c$d.C4137c c4137c, c$a.C4132a c4132a) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4137c, c4132a}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c4137c, c4132a);
                return this.$this_state.LIZ(c4137c, c$d.C4135a.LIZ, C148103fTl.LIZ);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C103398Qng<c$d, c$a, c$c> c103398Qng) {
        C103398Qng<c$d, c$a, c$c> c103398Qng2 = c103398Qng;
        if (!PatchProxy.proxy(new Object[]{c103398Qng2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c103398Qng2);
            c103398Qng2.LIZ((C103398Qng<c$d, c$a, c$c>) c$d.C4136b.LIZ);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(c$d.C4136b.class), C41211.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(c$d.C4137c.class), C41232.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(c$d.C4138d.class), C41263.INSTANCE);
            c103398Qng2.LIZ(QL7.LIZJ.LIZ(c$d.C4135a.class), C41274.INSTANCE);
            c103398Qng2.LIZ(new C41285());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.core.tetris.task.TaskState$stateMachine$1$5 */
    /* loaded from: classes20.dex */
    public static final class C41285 extends Lambda implements Function1<AbstractC103391QnZ<? extends c$d, ? extends c$a, ? extends c$c>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(23764);
        }

        public C41285() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC103391QnZ<? extends c$d, ? extends c$a, ? extends c$c> abstractC103391QnZ) {
            AbstractC103391QnZ<? extends c$d, ? extends c$a, ? extends c$c> abstractC103391QnZ2 = abstractC103391QnZ;
            if (!PatchProxy.proxy(new Object[]{abstractC103391QnZ2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC103391QnZ2);
                if (!(abstractC103391QnZ2 instanceof C103385QnT)) {
                    abstractC103391QnZ2 = null;
                }
                C103385QnT c103385QnT = (C103385QnT) abstractC103391QnZ2;
                if (c103385QnT != null) {
                    SIDE_EFFECT side_effect = c103385QnT.LIZJ;
                    if (Intrinsics.areEqual(side_effect, C148104fTm.LIZ)) {
                        TaskState$stateMachine$1.this.this$0.LIZLLL = System.currentTimeMillis();
                        C46X.LIZ("Task: " + C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0).LIZJ() + " start run");
                        C148096fTe.LIZIZ(TaskState$stateMachine$1.this.this$0).LIZIZ(C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0));
                        C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0).run();
                    } else if (Intrinsics.areEqual(side_effect, C148105fTn.LIZ)) {
                        long currentTimeMillis = System.currentTimeMillis() - TaskState$stateMachine$1.this.this$0.LIZLLL;
                        C46X.LIZ("Task: " + C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0).LIZJ() + " success, use time " + currentTimeMillis);
                        C148096fTe.LIZIZ(TaskState$stateMachine$1.this.this$0).LIZJ(C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0));
                    } else if (Intrinsics.areEqual(side_effect, C148103fTl.LIZ)) {
                        long currentTimeMillis2 = System.currentTimeMillis() - TaskState$stateMachine$1.this.this$0.LIZLLL;
                        C46X.LIZ("Task: " + C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0).LIZJ() + " failed, use time " + currentTimeMillis2);
                        C148096fTe.LIZIZ(TaskState$stateMachine$1.this.this$0).LIZLLL(C148096fTe.LIZ(TaskState$stateMachine$1.this.this$0));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
