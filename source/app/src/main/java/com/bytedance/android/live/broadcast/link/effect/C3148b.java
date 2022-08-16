package com.bytedance.android.live.broadcast.link.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.K9I;
import p003X.KCT;
import p003X.KE8;

/* renamed from: com.bytedance.android.live.broadcast.link.effect.b */
/* loaded from: classes5.dex */
public final class C3148b extends K9I {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(DigitAvatarEffectHostLiveService$composerHandler$2.INSTANCE);
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(DigitAvatarEffectHostLiveService$filterHandler$2.INSTANCE);

    static {
        Covode.recordClassIndex(16913);
    }

    public final C3149c LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3149c) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final C3152f LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3152f) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    @Override // p003X.K9I, p003X.AbstractC86605KAt
    /* renamed from: LJ */
    public final KE8 mo15897LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (KE8) proxy.result;
        }
        return LIZIZ();
    }

    @Override // p003X.K9I, p003X.AbstractC86605KAt
    public final KCT LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (KCT) proxy.result;
        }
        return LIZ();
    }
}
