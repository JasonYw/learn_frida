package com.bytedance.android.live.broadcastgame.opengame.runtime;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h;
import com.bytedance.android.live.broadcastgame.opengame.C3607p;
import com.bytedance.android.live.broadcastgame.opengame.auth.OpenBaseAuthService;
import com.bytedance.android.live.broadcastgame.opengame.auth.OpenSonicAuthService;
import com.bytedance.android.live.broadcastgame.opengame.control.OpenPlatformControlService;
import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.network.C3531a;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService;
import com.bytedance.android.live.broadcastgame.opengame.service.CommercialService;
import com.bytedance.android.live.broadcastgame.opengame.service.OpenFeatureIconStateService;
import com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService;
import com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService;
import com.bytedance.android.live.broadcastgame.opengame.service.PerformanceDetectionService;
import com.bytedance.android.live.broadcastgame.opengame.service.ReportService;
import com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService;
import com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackLynxService;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameCardService;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.TrackMiniCardService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC520466hM;
import p003X.C106862S5w;
import p003X.C443233g5;
import p003X.C47A;
import p003X.C87911KkT;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.x */
/* loaded from: classes5.dex */
public final class C3682x implements AbstractC3610e, AbstractC3662k, AbstractC3663l {
    public static ChangeQuickRedirect LIZ;
    public static final HashSet<Class<? extends AbstractC3719c>> LJIJ = SetsKt__SetsKt.hashSetOf(PanelStateReportService.class, SimplePanelStateDispatchService.class, ReportService.class, BootInfoService.class, OpenFeatureIconStateService.class, PerformanceDetectionService.class, OpenPlatformMonitorService.class, OpenPlatformControlService.class, OpenBaseAuthService.class);
    public static final HashMap<PluginType, List<Class<? extends AbstractC3719c>>> LJIJI = MapsKt__MapsKt.hashMapOf(TuplesKt.m137to(PluginType.LYNX, CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{TrackLynxService.class, ScreenshotsAuditService.class, CommercialService.class, AudienceMiniGameIntroCardService.class, TrackMiniGameCardService.class})), TuplesKt.m137to(PluginType.MINI_APP, CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{MiniCardService.class, TrackMiniCardService.class})), TuplesKt.m137to(PluginType.SONIC_GAME, CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{TrackMiniGameService.class, ScreenshotsAuditService.class, CommercialService.class, AudienceMiniGameIntroCardService.class, TrackMiniGameCardService.class, OpenSonicAuthService.class})));
    public AbstractC3659g LIZIZ;
    public AbstractC3609d LIZJ;
    public final Context LIZLLL;

    /* renamed from: LJ */
    public final DataCenter f26082LJ;
    public final AbstractC3497h LJFF;
    public final AbstractC3664m LJI;
    public final AbstractC3512ag LJII;
    public final C3607p LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final AbstractC5436a LJIIL;
    public final Lazy LJIILIIL;
    public final Object LJIILJJIL;
    public PluginType LJIILL;
    public Map<String, Object> LJIILLIIL;
    public HashMap<Class<?>, Class<? extends AbstractC3719c>> LJIIZILJ;

    private final ConcurrentHashMap<Class<? extends AbstractC3719c>, Object> LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (ConcurrentHashMap) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIL() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported;
    }

    public final long LJIIIIZZ() {
        return this.LJIIIIZZ.LIZIZ;
    }

    public final Context LJIILL() {
        AbstractC3609d abstractC3609d = this.LIZJ;
        if (!(abstractC3609d instanceof Context)) {
            abstractC3609d = null;
        }
        Context context = (Context) abstractC3609d;
        if (context == null) {
            return this.LIZLLL;
        }
        return context;
    }

    public final PanelType LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (PanelType) proxy.result;
        }
        AbstractC3609d abstractC3609d = this.LIZJ;
        if (abstractC3609d != null) {
            return abstractC3609d.mo15844LJ();
        }
        return null;
    }

    public final AbstractC3659g LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (AbstractC3659g) proxy.result;
        }
        if (this.LIZIZ != null) {
            AbstractC3659g abstractC3659g = this.LIZIZ;
            if (abstractC3659g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                return abstractC3659g;
            }
            return abstractC3659g;
        }
        return null;
    }

    public final Room LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        DataCenter dataCenter = this.f26082LJ;
        if (dataCenter == null) {
            return null;
        }
        return (Room) dataCenter.get("data_room", (String) null);
    }

    public final PluginType LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (PluginType) proxy.result;
        }
        PluginType pluginType = this.LJIILL;
        if (pluginType != null) {
            return pluginType;
        }
        this.LJIILL = PluginType.Companion.LIZ(this.LJIIIIZZ.LJIIL);
        return this.LJIILL;
    }

    public final boolean LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.f26082LJ == null) {
            C87911KkT.LIZIZ.LIZ("BaseLiveGameWithPanel", "showCastScreenDialog dataCenter == null");
            return false;
        } else if (C443233g5.LIZIZ.LIZ(this.f26082LJ) == 1) {
            return true;
        } else {
            C88440Kt0.LIZ("当前场景不支持玩法投屏，如需投屏请回到视频直播");
            return false;
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3663l> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3663l) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3663l abstractC3663l : arrayList) {
            abstractC3663l.LIZLLL();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3663l> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3663l) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3663l abstractC3663l : arrayList) {
            abstractC3663l.mo15832LJ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3663l> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3663l) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3663l abstractC3663l : arrayList) {
            abstractC3663l.LJFF();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3663l> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3663l) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3663l abstractC3663l : arrayList) {
            abstractC3663l.LJI();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3610e> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3610e) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3610e abstractC3610e : arrayList) {
            abstractC3610e.LJII();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3610e> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3610e) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3610e abstractC3610e : arrayList) {
            abstractC3610e.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3610e> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3610e) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3610e abstractC3610e : arrayList) {
            abstractC3610e.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3610e> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3610e) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3610e abstractC3610e : arrayList) {
            abstractC3610e.LJIIJJI();
        }
    }

    public final boolean LJIIZILJ() {
        C3658f c3658f;
        List<C3531a.C3532a> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C3657d c3657d = this.LJIIIIZZ.LJIIJ;
        if (c3657d != null && (c3658f = c3657d.LIZJ) != null && (list = c3658f.LIZIZ) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C3531a.C3532a) it.next()).LIZ.equals("doScreencast")) {
                    if (this.LJIIJ && !C47A.LIZLLL()) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    static {
        Covode.recordClassIndex(20963);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3662k> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3662k) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3662k abstractC3662k : arrayList) {
            abstractC3662k.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3662k> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3662k) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3662k abstractC3662k : arrayList) {
            abstractC3662k.LIZJ();
        }
    }

    public final void LIZ(AbstractC3659g abstractC3659g) {
        if (PatchProxy.proxy(new Object[]{abstractC3659g}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3659g);
        this.LIZIZ = abstractC3659g;
    }

    private final <T extends AbstractC3719c> void LIZIZ(Class<T> cls) {
        Class<? extends AbstractC3719c> LIZ2;
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 2).isSupported) {
            return;
        }
        Annotation[] annotations = cls.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "");
        int length = annotations.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Annotation annotation = annotations[length];
            if (annotation instanceof AbstractC520466hM) {
                if (annotation != null && (annotation instanceof AbstractC520466hM)) {
                    if (!this.LJIIJ && !this.LJIIJJI) {
                        LIZ2 = ((AbstractC520466hM) annotation).LIZIZ();
                    } else {
                        LIZ2 = ((AbstractC520466hM) annotation).LIZ();
                    }
                    if (!cls.isAssignableFrom(LIZ2)) {
                        new StringBuilder();
                        ALogger.m15800e("PluginContext", C0002O.m25085C(LIZ2.getCanonicalName(), " is no a subClass for ", cls.getCanonicalName()));
                        return;
                    }
                    this.LJIIZILJ.put(cls, LIZ2);
                    LIZJ(LIZ2);
                    return;
                }
            }
        }
        LIZJ(cls);
    }

    private final <T extends AbstractC3719c> void LIZJ(Class<T> cls) {
        MethodCollector.m14708i(1469);
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (LJIJI().containsKey(cls)) {
            return;
        }
        synchronized (this.LJIILJJIL) {
            try {
                ConcurrentHashMap<Class<? extends AbstractC3719c>, Object> LJIJI2 = LJIJI();
                T newInstance = cls.getConstructor(C3682x.class).newInstance(this);
                if (newInstance != null) {
                    T t = newInstance;
                    t.LIZIZ();
                    LJIJI2.put(cls, t);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type T");
                }
            } finally {
                MethodCollector.m14707o(1469);
            }
        }
    }

    public final <T extends AbstractC3719c> T LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(cls);
        Class<? extends AbstractC3719c> cls2 = this.LJIIZILJ.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        if (LJIJI().containsKey(cls)) {
            Object obj = LJIJI().get(cls);
            if (obj != null) {
                return (T) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
        LIZJ(cls);
        Object obj2 = LJIJI().get(cls);
        if (obj2 != null) {
            return (T) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    public final <T> T LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(str);
        T t = (T) this.LJIILLIIL.get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3662k> arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (obj2 instanceof AbstractC3662k) {
                arrayList.add(obj2);
            }
        }
        for (AbstractC3662k abstractC3662k : arrayList) {
            abstractC3662k.LIZ(obj);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3663l> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3663l) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3663l abstractC3663l : arrayList) {
            abstractC3663l.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 16).isSupported) {
            return;
        }
        Collection<Object> values = LJIJI().values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        ArrayList<AbstractC3663l> arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof AbstractC3663l) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3663l abstractC3663l : arrayList) {
            abstractC3663l.LIZ(map);
        }
    }

    public final void LIZ(String str, Object obj) {
        if (PatchProxy.proxy(new Object[]{str, obj}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, obj);
        this.LJIILLIIL.put(str, obj);
    }

    public C3682x(Context context, DataCenter dataCenter, AbstractC3497h abstractC3497h, AbstractC3664m abstractC3664m, AbstractC3512ag abstractC3512ag, C3607p c3607p, Map<String, ? extends Object> map, boolean z, boolean z2, AbstractC5436a abstractC5436a) {
        C106862S5w.LIZ(context, abstractC3664m, c3607p, map);
        this.LIZLLL = context;
        this.f26082LJ = dataCenter;
        this.LJFF = abstractC3497h;
        this.LJI = abstractC3664m;
        this.LJII = abstractC3512ag;
        this.LJIIIIZZ = c3607p;
        this.LJIIIZ = map;
        this.LJIIJ = z;
        this.LJIIJJI = z2;
        this.LJIIL = abstractC5436a;
        this.LJIILIIL = LazyKt__LazyJVMKt.lazy(PluginContext$servicePool$2.INSTANCE);
        this.LJIILJJIL = new Object();
        this.LJIILLIIL = new LinkedHashMap();
        this.LJIIZILJ = new HashMap<>();
        Iterator<T> it = LJIJ.iterator();
        while (it.hasNext()) {
            LIZIZ((Class) it.next());
        }
        List<Class<? extends AbstractC3719c>> list = LJIJI.get(LJIILJJIL());
        if (list != null) {
            for (Class<? extends AbstractC3719c> cls : list) {
                LIZIZ(cls);
                Iterator<T> it2 = LJIJ.iterator();
                while (it2.hasNext()) {
                    Class<?> cls2 = (Class) it2.next();
                    if (cls2.isAssignableFrom(cls)) {
                        this.LJIIZILJ.put(cls2, cls);
                    }
                }
            }
        }
    }

    public /* synthetic */ C3682x(Context context, DataCenter dataCenter, AbstractC3497h abstractC3497h, AbstractC3664m abstractC3664m, AbstractC3512ag abstractC3512ag, C3607p c3607p, Map map, boolean z, boolean z2, AbstractC5436a abstractC5436a, int i) {
        this(context, dataCenter, abstractC3497h, abstractC3664m, abstractC3512ag, c3607p, map, z, (i & 256) != 0 ? false : z2, null);
    }
}
