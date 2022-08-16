package com.bytedance.android.live.effect.api;

import android.content.Context;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.EffectManager;
import com.p1594ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC76170G1k;
import p003X.AbstractC86605KAt;
import p003X.AbstractC86668KDe;
import p003X.C106862S5w;
import p003X.C109029SwJ;
import p003X.C86676KDm;
import p003X.K9I;
import p003X.KE1;
import p003X.KEB;
import p003X.KG4;
import p003X.KG5;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.effect.api.o */
/* loaded from: classes5.dex */
public final class C4173o {
    public static ChangeQuickRedirect LIZ;
    public AbstractC86605KAt LIZIZ;
    public Boolean LIZJ;
    public final LiveEffectContextFactory.Type LIZLLL;
    public String LJIIJJI;
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new LiveEffectContext$effectManager$2(this));
    public static final KG5 LJIIJ = new KG5((byte) 0);

    /* renamed from: LJ */
    public static final String f26212LJ = "effect/";
    public static final String LJFF = "android";
    public static final int LJI = 3;
    public static final String LJII = "online";
    public static final String LJIIIIZZ = "075a7110fd0d11e8828ebbac7e7a4e57";
    public static final List<Host> LJIIIZ = CollectionsKt__CollectionsJVMKt.listOf(new Host("https://effect.snssdk.com"));

    @JvmStatic
    public static final C4173o LIZ(LiveEffectContextFactory.Type type) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type}, null, LIZ, true, 15);
        return proxy.isSupported ? (C4173o) proxy.result : LJIIJ.LIZ(type);
    }

    public final EffectManager LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (EffectManager) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    public final AbstractC4169j LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (AbstractC4169j) proxy.result;
        }
        return LiveEffectContextFactory.LIZIZ.LIZIZ(this.LIZLLL);
    }

    public final AbstractC4172k LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (AbstractC4172k) proxy.result;
        }
        return LiveEffectContextFactory.LIZIZ.LIZJ(this.LIZLLL);
    }

    static {
        Covode.recordClassIndex(24323);
    }

    public final AbstractC86605KAt LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC86605KAt) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new K9I();
        }
        AbstractC86605KAt abstractC86605KAt = this.LIZIZ;
        Intrinsics.checkNotNull(abstractC86605KAt);
        return abstractC86605KAt;
    }

    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.LJIIJJI == null) {
            File dir = LK5.LJIIJ().getDir("ttlive_effect_model", 0);
            Intrinsics.checkNotNullExpressionValue(dir, "");
            new StringBuilder();
            this.LJIIJJI = C0002O.m25086C(dir.getAbsolutePath(), File.separator);
        }
        String str = this.LJIIJJI;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: LJ */
    public final boolean m15784LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        KE1 LJFF2 = LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF2, "");
        int LJI2 = LJFF2.LJI();
        Integer LIZ2 = AbstractC86668KDe.LJIJI.LIZ(this.LIZLLL);
        if (LIZ2 == null || LJI2 != LIZ2.intValue()) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        KEB LJI2 = LJIIIIZZ().LJI();
        Intrinsics.checkNotNullExpressionValue(LJI2, "");
        List<FilterModel> list = LJI2.LIZIZ;
        Integer LIZ2 = AbstractC86668KDe.LIZIZ.LIZ(this.LIZLLL);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        int intValue = LIZ2.intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            intValue = 0;
        }
        if (list.isEmpty()) {
            return false;
        }
        FilterModel filterModel = list.get(intValue);
        Intrinsics.checkNotNullExpressionValue(filterModel, "");
        if (StringUtils.isEmpty(filterModel.getFilterPath())) {
            return false;
        }
        return true;
    }

    public final String LJFF() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        KEB LJI2 = LJIIIIZZ().LJI();
        Intrinsics.checkNotNullExpressionValue(LJI2, "");
        List<FilterModel> list = LJI2.LIZIZ;
        Integer LIZ2 = AbstractC86668KDe.LIZIZ.LIZ(this.LIZLLL);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        int intValue = LIZ2.intValue();
        if (intValue < list.size() && intValue < list.size() && intValue >= 0) {
            i = intValue;
        }
        if (list.size() == 0) {
            return "";
        }
        FilterModel filterModel = list.get(i);
        Intrinsics.checkNotNullExpressionValue(filterModel, "");
        String name = filterModel.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    public final boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        KE1 LJFF2 = LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF2, "");
        boolean z = !StringUtils.isEmpty(LJFF2.LIZIZ());
        boolean z2 = !LJII().LIZIZ(C86676KDm.LIZLLL).isEmpty();
        boolean z3 = !LJII().LIZIZ(C86676KDm.LJIIIZ).isEmpty();
        if (z3) {
            z3 = false;
            for (Sticker sticker : LJII().LIZIZ(C86676KDm.LJIIIZ)) {
                Iterator<T> it = sticker.getUpdateKeys().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!Intrinsics.areEqual(LJII().LIZIZ(sticker.getEffectId(), (String) it.next()), 0.0f)) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
        }
        boolean z4 = false;
        for (Sticker sticker2 : LJII().LIZIZ("beauty")) {
            Iterator<T> it2 = sticker2.getUpdateKeys().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!Intrinsics.areEqual(LJII().LIZIZ(sticker2.getEffectId(), (String) it2.next()), 0.0f)) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        boolean z5 = false;
        for (Sticker sticker3 : LJII().LIZIZ(C86676KDm.LJI)) {
            Iterator<T> it3 = sticker3.getUpdateKeys().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (!Intrinsics.areEqual(LJII().LIZIZ(sticker3.getEffectId(), (String) it3.next()), 0.0f)) {
                        z5 = true;
                        break;
                    }
                }
            }
        }
        if (!AbstractC86668KDe.LIZ.LIZ(this.LIZLLL).booleanValue()) {
            z5 = false;
        }
        if (!z && !z2 && !z4 && !z5 && !z3) {
            return false;
        }
        return true;
    }

    public C4173o(LiveEffectContextFactory.Type type) {
        C106862S5w.LIZ(type);
        this.LIZLLL = type;
    }

    public final ResourceFinder LIZ(Context context) {
        ResourceFinder c109029SwJ;
        AbstractC76170G1k lazyService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (ResourceFinder) proxy.result;
        }
        C106862S5w.LIZ(context);
        ResourceFinder resourceFinder = null;
        try {
            lazyService = ServiceManager.getLazyService(ResourceFinder.class);
        } catch (Throwable unused) {
        }
        if (lazyService != null) {
            resourceFinder = (ResourceFinder) lazyService.LIZ();
            if (resourceFinder != null) {
                return resourceFinder;
            }
        }
        LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], KG4.LIZIZ, KG4.LIZ, false, 1);
        if (proxy2.isSupported) {
            c109029SwJ = (ResourceFinder) proxy2.result;
        } else {
            c109029SwJ = new C109029SwJ();
        }
        if (c109029SwJ == null) {
            return new AssetResourceFinder(context.getAssets(), this.LJIIJJI);
        }
        return c109029SwJ;
    }

    public final void LIZ(AbstractC86605KAt abstractC86605KAt) {
        if (PatchProxy.proxy(new Object[]{abstractC86605KAt}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC86605KAt);
        this.LIZIZ = abstractC86605KAt;
    }
}
