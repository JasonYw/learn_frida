package com.bytedance.android.live.broadcast.link.effect;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.n$a;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.template.BeautifyTemplate;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C86665KDb;
import p003X.C86676KDm;
import p003X.HKC;
import p003X.K84;
import p003X.K8B;
import p003X.K8C;
import p003X.KAT;
import p003X.KFH;

/* renamed from: com.bytedance.android.live.broadcast.link.effect.d */
/* loaded from: classes5.dex */
public final class C3150d implements HKC {
    public static ChangeQuickRedirect LIZ;
    public C9078n LIZIZ;

    /* renamed from: LJ */
    public final Lazy f25908LJ;
    public static final K8C LIZLLL = new K8C((byte) 0);
    public static final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) LinkEffectHelper$Companion$instance$2.INSTANCE);

    /* renamed from: LJ */
    public static final C3150d m15898LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 9);
        return proxy.isSupported ? (C3150d) proxy.result : LIZLLL.LIZ();
    }

    private C3151e LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3151e) (proxy.isSupported ? proxy.result : this.f25908LJ.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(16915);
    }

    public C3150d() {
        this.f25908LJ = LazyKt__LazyJVMKt.lazy(LinkEffectHelper$hostService$2.INSTANCE);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.LINK).LIZ(LJFF());
    }

    @Override // p003X.HKC
    public final C4173o LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C4173o) proxy.result;
        }
        return C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.LINK);
    }

    @Override // p003X.HKC
    public final void LIZIZ() {
        C9078n c9078n;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (c9078n = this.LIZIZ) != null) {
            c9078n.dismiss();
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZ().LJII().LIZLLL();
    }

    private final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        ALogger.m15801d("LinkEffectHelper", "COMPOSER INIT : initializing config");
        C86665KDb.LIZIZ("ttlive_initializing_config", "LinkEffectHelper");
        AbstractC4169j LJII = LIZ().LJII();
        n$a n_a = new n$a();
        n_a.LIZ(LJFF().LIZ());
        n_a.LIZ(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{C86676KDm.LJI, C86676KDm.LIZJ, "beauty", C86676KDm.LIZLLL, C86676KDm.LJIIIZ}));
        KAT LIZ2 = n_a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LJII.LIZ(LIZ2);
    }

    @Override // p003X.HKC
    public final Fragment LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        if (!LIZ().LJII().LJFF()) {
            LJI();
        }
        return KFH.LJII.LIZ(new K8B(this), BeautifyTemplate.LIZLLL.LIZ(), "", LiveEffectContextFactory.Type.LINK, 2131623937);
    }

    public /* synthetic */ C3150d(byte b) {
        this();
    }

    public final void LIZ(K84 k84) {
        if (PatchProxy.proxy(new Object[]{k84}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(k84);
        C3151e LJFF = LJFF();
        if (!PatchProxy.proxy(new Object[]{k84}, LJFF, C3151e.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(k84);
            k84.LIZ(LJFF.LIZ());
            k84.LIZ(LJFF.LIZIZ());
        }
        LJI();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.LINK).LJIIIIZZ().LJFF();
        LIZ().LJIIIIZZ().LIZ().LJFF(C86676KDm.LJI);
        LIZ().LJIIIIZZ().LIZJ().LIZ();
        LIZ().LJIIIIZZ().mo15785LJ().LIZ((C4181a) null);
    }
}
