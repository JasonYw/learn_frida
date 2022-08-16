package com.bytedance.android.live.broadcast.link.effect;

import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import p003X.K83;
import p003X.K8A;

/* renamed from: com.bytedance.android.live.broadcast.link.effect.a */
/* loaded from: classes5.dex */
public final class C3147a implements K8A {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZLLL;
    public static final K83 LIZJ = new K83((byte) 0);
    public static final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) DigitAvatarEffectHelper$Companion$instance$2.INSTANCE);

    public final C3148b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3148b) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(16911);
    }

    public C3147a() {
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(DigitAvatarEffectHelper$hostService$2.INSTANCE);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DIGIT_AVATAR).LIZ(LIZ());
    }

    public final C4173o LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C4173o) proxy.result;
        }
        return C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DIGIT_AVATAR);
    }

    public /* synthetic */ C3147a(byte b) {
        this();
    }
}
