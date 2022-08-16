package com.bytedance.android.live.broadcastgame.channel.receiver.helper;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.broadcastgame.api.channel.DelayType;
import com.bytedance.android.live.broadcastgame.api.model.AbstractC3378h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.receiver.helper.a */
/* loaded from: classes5.dex */
public final class C3438a implements AbstractC3441c {
    public static ChangeQuickRedirect LIZ;
    public final Function1<AbstractC3378h, Unit> LIZIZ;
    public final Handler LIZJ = new Handler(Looper.getMainLooper());
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(ImAlignHelper$cale$2.INSTANCE);

    /* renamed from: LJ */
    public final Lazy f26042LJ = LazyKt__LazyJVMKt.lazy(ImAlignHelper$queue$2.INSTANCE);

    static {
        Covode.recordClassIndex(19553);
    }

    private final C3440b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3440b) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    private final PriorityQueue<RunnableC3439a> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (PriorityQueue) (proxy.isSupported ? proxy.result : this.f26042LJ.mo27335getValue());
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.channel.receiver.helper.a$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC3439a implements Runnable {
        public static ChangeQuickRedirect LIZ;
        public final AbstractC3378h LIZIZ;
        public final Function1<RunnableC3439a, Unit> LIZJ;

        static {
            Covode.recordClassIndex(19554);
        }

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ, this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof RunnableC3439a) {
                return C106862S5w.LIZ(((RunnableC3439a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ImAlignHelper$Entry:%s,%s", LIZ());
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                return;
            }
            this.LIZJ.invoke(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RunnableC3439a(AbstractC3378h abstractC3378h, Function1<? super RunnableC3439a, Unit> function1) {
            C106862S5w.LIZ(abstractC3378h, function1);
            this.LIZIZ = abstractC3378h;
            this.LIZJ = function1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3438a(Function1<? super AbstractC3378h, Unit> function1) {
        C106862S5w.LIZ(function1);
        this.LIZIZ = function1;
    }

    public final void LIZ(RunnableC3439a runnableC3439a) {
        if (PatchProxy.proxy(new Object[]{runnableC3439a}, this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZIZ().remove(runnableC3439a);
        this.LIZJ.removeCallbacks(runnableC3439a);
        this.LIZIZ.invoke(runnableC3439a.LIZIZ);
    }

    @Override // com.bytedance.android.live.broadcastgame.channel.receiver.helper.AbstractC3441c
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZ().LIZ(j);
        while (!LIZIZ().isEmpty()) {
            RunnableC3439a peek = LIZIZ().peek();
            if (peek.LIZIZ.LIZJ() <= j) {
                LIZ(peek);
            } else {
                return;
            }
        }
    }

    public final void LIZ(AbstractC3378h abstractC3378h) {
        if (PatchProxy.proxy(new Object[]{abstractC3378h}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3378h);
        if (abstractC3378h.LIZIZ() != DelayType.NO_DELAY.value && abstractC3378h.LIZJ() != 0) {
            RunnableC3439a runnableC3439a = new RunnableC3439a(abstractC3378h, new ImAlignHelper$addMessage$entry$1(this));
            this.LIZJ.postDelayed(runnableC3439a, LIZ().LIZIZ(abstractC3378h.LIZJ()));
            LIZIZ().offer(runnableC3439a);
            return;
        }
        this.LIZIZ.invoke(abstractC3378h);
    }
}
