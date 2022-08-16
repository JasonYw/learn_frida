package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.android.live.broadcastgame.api.channel.C3331a;
import com.bytedance.android.live.broadcastgame.api.channel.C3336f;
import com.bytedance.android.live.broadcastgame.channel.receiver.AbstractC3437f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.ak */
/* loaded from: classes5.dex */
public final class C3427ak {
    public static ChangeQuickRedirect LIZ;
    public AbstractC3437f LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    static {
        Covode.recordClassIndex(19404);
    }

    public C3427ak() {
        this(null, 1);
    }

    public final Set<AbstractC3335e> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Set) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final Map<AbstractC3335e, Set<Long>> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (Map) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public C3427ak(AbstractC3437f abstractC3437f) {
        this.LIZIZ = abstractC3437f;
        this.LIZJ = LazyKt__LazyJVMKt.lazy(MessageDispatcher$callbackSet$2.INSTANCE);
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(MessageDispatcher$cache$2.INSTANCE);
    }

    public /* synthetic */ C3427ak(AbstractC3437f abstractC3437f, int i) {
        this(null);
    }

    private final boolean LIZIZ(AbstractC3337g.AbstractC3338a abstractC3338a, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3338a, str}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (AbstractC3335e abstractC3335e : new HashSet(LIZ())) {
            LIZ(abstractC3335e, abstractC3338a, str);
        }
        return true;
    }

    public final Observable<Boolean> LIZ(AbstractC3337g.AbstractC3338a abstractC3338a, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3338a, str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(abstractC3338a, str);
        Observable<Boolean> just = Observable.just(Boolean.valueOf(LIZIZ(abstractC3338a, str)));
        Intrinsics.checkNotNullExpressionValue(just, "");
        return just;
    }

    public final void LIZ(AbstractC3335e abstractC3335e, AbstractC3337g.AbstractC3338a abstractC3338a, String str) {
        if (PatchProxy.proxy(new Object[]{abstractC3335e, abstractC3338a, str}, this, LIZ, false, 3).isSupported || Intrinsics.areEqual(str, abstractC3335e.LIZIZ())) {
            return;
        }
        if (abstractC3338a instanceof C3336f) {
            abstractC3335e.LIZ((C3336f) abstractC3338a);
        } else if (abstractC3338a instanceof C3331a) {
            C3331a c3331a = (C3331a) abstractC3338a;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3335e, c3331a}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (c3331a.LJII) {
                Set<Long> set = LIZIZ().get(abstractC3335e);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                if (set.contains(Long.valueOf(c3331a.LIZIZ))) {
                    return;
                }
                set.add(Long.valueOf(c3331a.LIZIZ));
                LIZIZ().put(abstractC3335e, set);
            }
            C3336f LIZ2 = c3331a.LIZ();
            if (LIZ2 != null) {
                abstractC3335e.LIZ(LIZ2);
            }
        } else {
            throw new IllegalArgumentException("can't handle type " + abstractC3338a);
        }
    }
}
