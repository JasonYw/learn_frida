package com.bytedance.android.live.broadcastgame.opengame.service;

import android.text.TextUtils;
import com.bytedance.android.live.broadcastgame.opengame.C3607p;
import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.message.C3518at;
import com.bytedance.android.live.broadcastgame.opengame.message.C3526r;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l;
import com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.opengame.view.C3731ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88006Km0;
import p003X.C106862S5w;
import p003X.C87549Ked;
import p003X.C87988Kli;
import p003X.C88616Kvq;

/* loaded from: classes5.dex */
public final class CommercialService implements AbstractC3663l, AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public AbstractC88006Km0 LIZJ;
    public C88616Kvq LIZLLL;

    /* renamed from: LJ */
    public Function0<Unit> f26084LJ;
    public Function0<Unit> LJFF;
    public Function1<? super Boolean, Unit> LJI;
    public C87988Kli LJII;
    public C3731ad LJIIIIZZ;
    public Function1<? super C3731ad, Unit> LJIIIZ;
    public C3682x LJIIJ;
    public final /* synthetic */ C87549Ked LJIIJJI = new C87549Ked();
    public PanelType LIZIZ = PanelType.PANEL_TYPE_X_SCREEN_LOW;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.CommercialService$2 */
    /* loaded from: classes.dex */
    public static final class C36972<T> implements Consumer<Throwable> {
        public static final C36972 LIZ = new C36972();

        static {
            Covode.recordClassIndex(20993);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(Throwable th) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.CommercialService$4 */
    /* loaded from: classes.dex */
    public static final class C36994<T> implements Consumer<Throwable> {
        public static final C36994 LIZ = new C36994();

        static {
            Covode.recordClassIndex(20995);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* bridge */ /* synthetic */ void accept(Throwable th) {
        }
    }

    static {
        Covode.recordClassIndex(20991);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIJJI.LIZ(disposable);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
    }

    public final C3682x LJII() {
        return this.LJIIJ;
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LJII().LJIIJ) {
            return false;
        }
        if (!((BootInfoService) LJII().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZJ() && LJII().LJIIIIZZ.LIZLLL() != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZ() {
        /*
            r6 = this;
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.opengame.service.CommercialService.LIZ
            r3 = 3
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r4, r3)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L17:
            com.bytedance.android.live.broadcastgame.opengame.runtime.x r0 = r6.LJII()
            boolean r0 = r0.LJIIJ
            if (r0 != 0) goto L20
            return r4
        L20:
            com.bytedance.android.live.broadcastgame.opengame.runtime.x r1 = r6.LJII()
            java.lang.Class<com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService> r0 = com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService.class
            com.bytedance.android.live.broadcastgame.opengame.service.a.c r2 = r1.LIZ(r0)
            com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService r2 = (com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService) r2
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r2, r0, r4, r3)
            boolean r0 = r1.isSupported
            r5 = 1
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
        L43:
            return r5
        L44:
            com.bytedance.android.live.broadcastgame.opengame.runtime.d r0 = r2.LIZ()
            if (r0 == 0) goto L77
            com.bytedance.android.live.broadcastgame.opengame.runtime.f r0 = r0.LIZJ
            if (r0 == 0) goto L77
            java.util.List<com.bytedance.android.live.broadcastgame.opengame.network.a$a> r0 = r0.LIZIZ
            if (r0 == 0) goto L77
            java.util.Iterator r3 = r0.iterator()
        L56:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()
            com.bytedance.android.live.broadcastgame.opengame.network.a$a r2 = (com.bytedance.android.live.broadcastgame.opengame.network.C3531a.C3532a) r2
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = "payDiamonds"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L43
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = "payDiamondsV3"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L56
            return r5
        L77:
            com.bytedance.android.live.broadcastgame.opengame.runtime.x r0 = r6.LJII()
            com.bytedance.android.live.broadcastgame.opengame.p r0 = r0.LJIIIIZZ
            com.bytedance.android.live.broadcastgame.api.model.q r0 = r0.LIZ()
            if (r0 == 0) goto L8e
            com.bytedance.android.live.broadcastgame.api.model.p r0 = r0.LJFF()
            if (r0 == 0) goto L8e
            int r0 = r0.LJLJJL
            if (r0 != 0) goto L8e
            return r4
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.service.CommercialService.LIZ():boolean");
    }

    public final void LIZ(PanelType panelType) {
        if (PatchProxy.proxy(new Object[]{panelType}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(panelType);
        this.LIZIZ = panelType;
    }

    public CommercialService(C3682x c3682x) {
        Observable LIZ2;
        Disposable subscribe;
        Observable LIZ3;
        Disposable subscribe2;
        C106862S5w.LIZ(c3682x);
        this.LJIIJ = c3682x;
        AbstractC3512ag abstractC3512ag = LJII().LJII;
        if (abstractC3512ag != null && (LIZ3 = abstractC3512ag.LIZ(C3526r.class)) != null && (subscribe2 = LIZ3.subscribe(new Consumer<C3526r>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.CommercialService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(20992);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C3526r c3526r) {
                C3526r c3526r2 = c3526r;
                if (!PatchProxy.proxy(new Object[]{c3526r2}, this, LIZ, false, 1).isSupported) {
                    CommercialService commercialService = CommercialService.this;
                    Intrinsics.checkNotNullExpressionValue(c3526r2, "");
                    commercialService.LIZ(c3526r2);
                }
            }
        }, C36972.LIZ)) != null) {
            LIZ(subscribe2);
        }
        AbstractC3512ag abstractC3512ag2 = LJII().LJII;
        if (abstractC3512ag2 != null && (LIZ2 = abstractC3512ag2.LIZ(C3518at.class)) != null && (subscribe = LIZ2.subscribe(new Consumer<C3518at>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.CommercialService.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(20994);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C3518at c3518at) {
                C3731ad c3731ad;
                Function1<? super C3731ad, Unit> function1;
                Object obj;
                C3518at c3518at2 = c3518at;
                if (!PatchProxy.proxy(new Object[]{c3518at2}, this, LIZ, false, 1).isSupported) {
                    CommercialService commercialService = CommercialService.this;
                    Intrinsics.checkNotNullExpressionValue(c3518at2, "");
                    if (!PatchProxy.proxy(new Object[]{c3518at2}, commercialService, CommercialService.LIZ, false, 11).isSupported && commercialService.LIZJ() && TextUtils.equals(c3518at2.LIZJ, commercialService.LJII().LJIIIIZZ.LJII)) {
                        if (commercialService.LJIIIIZZ == null && (function1 = commercialService.LJIIIZ) != null) {
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], commercialService, CommercialService.LIZ, false, 9);
                            if (proxy.isSupported) {
                                obj = proxy.result;
                            } else {
                                commercialService.LJII = new C87988Kli();
                                C3731ad c3731ad2 = new C3731ad(commercialService.LJII());
                                C87988Kli c87988Kli = commercialService.LJII;
                                Intrinsics.checkNotNull(c87988Kli);
                                if (!PatchProxy.proxy(new Object[]{c87988Kli}, c3731ad2, C3731ad.LIZ, false, 4).isSupported) {
                                    C106862S5w.LIZ(c87988Kli);
                                    c3731ad2.LIZIZ = c87988Kli;
                                }
                                C3607p c3607p = commercialService.LJII().LJIIIIZZ;
                                if (!PatchProxy.proxy(new Object[]{c3607p}, c3731ad2, C3731ad.LIZ, false, 5).isSupported) {
                                    C106862S5w.LIZ(c3607p);
                                    c3731ad2.LIZJ = c3607p;
                                }
                                commercialService.LJIIIIZZ = c3731ad2;
                                obj = commercialService.LJIIIIZZ;
                                Intrinsics.checkNotNull(obj);
                            }
                            function1.invoke(obj);
                        }
                        C87988Kli c87988Kli2 = commercialService.LJII;
                        if (c87988Kli2 != null && !PatchProxy.proxy(new Object[]{c3518at2}, c87988Kli2, C87988Kli.LIZ, false, 2).isSupported) {
                            C106862S5w.LIZ(c3518at2);
                            c87988Kli2.LIZIZ.add(c3518at2);
                            c87988Kli2.LIZJ.add(c3518at2);
                        }
                        C3731ad c3731ad3 = commercialService.LJIIIIZZ;
                        if ((c3731ad3 == null || !c3731ad3.LIZ()) && (c3731ad = commercialService.LJIIIIZZ) != null) {
                            c3731ad.LIZIZ();
                        }
                    }
                }
            }
        }, C36994.LIZ)) != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(C3526r c3526r) {
        C88616Kvq c88616Kvq;
        Function0<Unit> function0;
        if (PatchProxy.proxy(new Object[]{c3526r}, this, LIZ, false, 4).isSupported || !LIZ()) {
            return;
        }
        if (this.LIZLLL == null && (function0 = this.LJFF) != null) {
            function0.mo30099invoke();
        }
        AbstractC88006Km0 abstractC88006Km0 = this.LIZJ;
        if (abstractC88006Km0 != null) {
            abstractC88006Km0.LIZ(c3526r);
        }
        C88616Kvq c88616Kvq2 = this.LIZLLL;
        if (c88616Kvq2 != null && !c88616Kvq2.LIZ() && (c88616Kvq = this.LIZLLL) != null) {
            Function1<? super Boolean, Unit> function1 = this.LJI;
            if (!PatchProxy.proxy(new Object[]{function1}, c88616Kvq, C88616Kvq.LIZ, false, 5).isSupported) {
                c88616Kvq.LIZLLL = function1;
                c88616Kvq.LIZIZ();
            }
        }
    }
}
