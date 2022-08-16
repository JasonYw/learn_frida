package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC88305Kqp;
import p003X.C106862S5w;
import p003X.C88066Kmy;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.x */
/* loaded from: classes5.dex */
public final class C3599x {
    public static ChangeQuickRedirect LIZ;
    public final ConcurrentHashMap<Class<?>, Object> LIZLLL;

    /* renamed from: LJ */
    public final AbstractC88305Kqp f26071LJ;
    public static final C88066Kmy LIZJ = new C88066Kmy((byte) 0);
    public static final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) LiveOpenGameClient$Companion$instance$2.INSTANCE);

    static {
        Covode.recordClassIndex(20494);
    }

    public C3599x(AbstractC88305Kqp abstractC88305Kqp) {
        this.f26071LJ = abstractC88305Kqp;
        this.LIZLLL = new ConcurrentHashMap<>();
        LazyKt__LazyJVMKt.lazy(LiveOpenGameClient$hasCheckOpenApiServiceSet$2.INSTANCE);
    }

    public final <T> T LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(cls);
        if (!this.LIZLLL.contains(cls)) {
            ConcurrentHashMap<Class<?>, Object> concurrentHashMap = this.LIZLLL;
            Object create = this.f26071LJ.LIZ().create(cls);
            if (create != null) {
                concurrentHashMap.putIfAbsent(cls, create);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
        return (T) this.LIZLLL.get(cls);
    }

    public /* synthetic */ C3599x(AbstractC88305Kqp abstractC88305Kqp, byte b) {
        this(abstractC88305Kqp);
    }
}
