package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.broadcastgame.api.p282a.C3327c;
import com.bytedance.android.live.broadcastgame.api.p282a.C3329e;
import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.message.C3514ak;
import com.bytedance.android.live.broadcastgame.opengame.message.C3515al;
import com.bytedance.android.live.broadcastgame.opengame.network.C3560d;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.live.broadcastgame.opengame.network.MiniCardApi;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3779b;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3801k;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3797m;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime.AnchorMiniAppPluginRuntime$requestAppStart$1;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime.AnchorMiniAppPluginRuntime$requestAppStart$2;
import com.bytedance.android.livehostapi.business.IHostLiveAd;
import com.bytedance.android.livesdk.chatroom.p518ui.DialogC6336gc;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.bdp.live.livecontainer.miniapp.PageConfig;
import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC87170KWm;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C1L9;
import p003X.C2WD;
import p003X.C37E;
import p003X.C86932KNi;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87626Kfs;
import p003X.C87632Kfy;
import p003X.C87659KgP;
import p003X.C87809Kip;
import p003X.C87810Kiq;
import p003X.C87811Kir;
import p003X.C87819Kiz;
import p003X.C87884Kk2;
import p003X.C87890Kk8;
import p003X.C87911KkT;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C95452Nio;
import p003X.DialogInterface$OnClickListenerC87816Kiw;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AnchorMiniCardService extends MiniCardService implements AbstractC3662k, AbstractC3717a, WeakHandler.IHandler {
    public static ChangeQuickRedirect LIZ;
    public Function0<Unit> LIZJ;
    public Function1<? super String, Unit> LIZLLL;
    public long LJFF;
    public final WeakHandler LJII;
    public C3682x LJIIIZ;
    public final /* synthetic */ C87549Ked LJIIJ = new C87549Ked();
    public final String LIZIZ = "AnchorMiniCardServiceV2";

    /* renamed from: LJ */
    public boolean f26112LJ = true;
    public String LJI = "";

    static {
        Covode.recordClassIndex(21791);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIJ.LIZ(disposable);
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService
    public final C3682x LJIIJJI() {
        return this.LJIIIZ;
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        C87911KkT.LIZIZ.LIZ("launch", this.LIZIZ);
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        C87911KkT.LIZIZ.LIZ("start", this.LIZIZ);
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C87911KkT.LIZIZ.LIZ("hide", this.LIZIZ);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        C87911KkT.LIZIZ.LIZ("stop", this.LIZIZ);
        C87010KQi.LIZ().LIZ(new C3779b());
        if (!LJIIJJI().LJIIJJI) {
            C87811Kir.LJII();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            this.LJIIJ.LIZ();
        }
        this.LIZLLL = null;
        this.LJII.removeMessages(0);
    }

    public final boolean LJII() {
        z$c z_c;
        C2WD<z$c> LJJI;
        C3383p LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String str = null;
        if (LJIIJJI().LJIIJJI) {
            C3384q LIZLLL = C87811Kir.LIZLLL();
            if (LIZLLL != null && (LJFF = LIZLLL.LJFF()) != null) {
                str = LJFF.LJLIIIL;
            }
            return Intrinsics.areEqual(str, LJIIJJI().LJIIIIZZ.LJII);
        }
        AbstractC87170KWm LIZ2 = AbstractC87170KWm.LJI.LIZ();
        if (LIZ2 != null && (LJJI = LIZ2.LJJI()) != null) {
            z_c = LJJI.LIZ();
        } else {
            z_c = null;
        }
        if (!(z_c instanceof C87632Kfy)) {
            z_c = null;
        }
        C87632Kfy c87632Kfy = (C87632Kfy) z_c;
        if (c87632Kfy == null || !c87632Kfy.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService
    public final String LJIIIZ() {
        String str;
        Object createFailure;
        PageDataV2.C3362b c3362b;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        PageDataV2 LIZ2 = C87811Kir.LIZ();
        Object obj = null;
        if (LIZ2 != null && (c3362b = LIZ2.f26017LJ) != null) {
            str = c3362b.LJFF;
        } else {
            str = null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                createFailure = parse.getQueryParameter(Constants.APP_ID);
            } else {
                createFailure = null;
            }
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        if (!Result.m30314isFailureimpl(createFailure)) {
            obj = createFailure;
        }
        if (!Intrinsics.areEqual(obj, LJIIJJI().LJIIIIZZ.LJII)) {
            return LJIIJJI().LJIIIIZZ.LJIIL;
        }
        if (str == null) {
            return LJIIJJI().LJIIIIZZ.LJIIL;
        }
        return str;
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService
    public final PageConfig LJIIJ() {
        PageConfig pageConfig;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (PageConfig) proxy.result;
        }
        boolean LJFF = C87811Kir.LJI.LJFF();
        if (!C87811Kir.LJI.LIZ(LJIIJJI().LJIIIIZZ.LJII)) {
            pageConfig = new PageConfig(PageStatus.ADD, LJFF);
        } else if (C87811Kir.LIZ() == null) {
            pageConfig = new PageConfig(PageStatus.ADD, LJFF);
        } else if (C87811Kir.LIZ() != null && LJIIJJI().LJIIJJI) {
            pageConfig = new PageConfig(PageStatus.HIDE, LJFF);
        } else {
            PageDataV2 LIZ2 = C87811Kir.LIZ();
            if (LIZ2 != null && !LIZ2.LJFF) {
                pageConfig = new PageConfig(PageStatus.START_EXPLAIN, LJFF);
            } else {
                PageDataV2 LIZ3 = C87811Kir.LIZ();
                if (LIZ3 != null && LIZ3.LJFF) {
                    pageConfig = new PageConfig(PageStatus.CANCEL_EXPLAIN, LJFF);
                } else {
                    pageConfig = new PageConfig(PageStatus.ADD, true);
                }
            }
        }
        C87911KkT c87911KkT = C87911KkT.LIZIZ;
        StringBuilder sb = new StringBuilder("curState: ");
        sb.append(pageConfig);
        sb.append("  mountPage: ");
        C1L9 LIZJ = C87811Kir.LJI.LIZJ();
        if (LIZJ != null) {
            str = LIZJ.LIZJ;
        } else {
            str = null;
        }
        sb.append(str);
        C87911KkT.LIZ(c87911KkT, sb.toString(), null, 2, null);
        return pageConfig;
    }

    public final void LJIIIIZZ() {
        String str;
        Observable<AbstractC100834PnQ<C3560d>> observeOn;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (LJIIJJI().LJIIJJI) {
            Function0<Unit> function0 = this.LIZJ;
            if (function0 != null) {
                function0.mo30099invoke();
            }
        } else if (LJII()) {
            C87811Kir c87811Kir = C87811Kir.LJI;
            String str2 = LJIIJJI().LJIIIIZZ.LJII;
            long LJIIIIZZ = LJIIJJI().LJIIIIZZ();
            AnchorMiniCardService$mount$1 anchorMiniCardService$mount$1 = AnchorMiniCardService$mount$1.INSTANCE;
            final AnchorMiniCardService$mount$2 anchorMiniCardService$mount$2 = AnchorMiniCardService$mount$2.INSTANCE;
            if (!PatchProxy.proxy(new Object[]{c87811Kir, str2, new Long(LJIIIIZZ), 3, null, anchorMiniCardService$mount$1, anchorMiniCardService$mount$2, 8, null}, null, C87811Kir.LIZ, true, 11).isSupported && !PatchProxy.proxy(new Object[]{str2, new Long(LJIIIIZZ), 3, null, anchorMiniCardService$mount$1, anchorMiniCardService$mount$2}, c87811Kir, C87811Kir.LIZ, false, 10).isSupported) {
                C106862S5w.LIZ(str2);
                PageDataV2 pageDataV2 = C87811Kir.LIZIZ;
                if (pageDataV2 == null) {
                    if (anchorMiniCardService$mount$2 != null) {
                        anchorMiniCardService$mount$2.invoke(new Throwable("pageData is null"));
                        return;
                    }
                    return;
                }
                C87819Kiz c87819Kiz = C87819Kiz.LIZIZ;
                C3514ak LIZ2 = C87809Kip.LIZ(pageDataV2);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2, new Long(LJIIIIZZ), 3, LIZ2}, c87819Kiz, C87819Kiz.LIZ, false, 2);
                if (proxy.isSupported) {
                    observeOn = (Observable) proxy.result;
                } else {
                    C106862S5w.LIZ(str2, LIZ2);
                    new StringBuilder();
                    IHostLiveAd LJJIIZI = C95452Nio.m23163LJ().LJJIIZI();
                    if (LJJIIZI == null || (str = LJJIIZI.getHostDomain()) == null) {
                        str = "";
                    }
                    observeOn = ((MiniCardApi) C88306Kqq.LIZ().LIZ(MiniCardApi.class)).saveCardInfo(C0002O.m25086C(str, "/webcast/stamp/save_card/"), str2, Long.valueOf(LJIIIIZZ), 3, LIZ2.LIZIZ, LIZ2.LJII, LIZ2.f26061LJ, LIZ2.LIZJ, LIZ2.LIZLLL, LIZ2.LJI, LIZ2.LJFF).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
                    Intrinsics.checkNotNullExpressionValue(observeOn, "");
                }
                observeOn.subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C87810Kiq(null, anchorMiniCardService$mount$1), new Consumer<Throwable>() { // from class: X.1LA
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(21630);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(Throwable th) {
                        Function1 function1;
                        if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported && (function1 = Function1.this) != null) {
                            Intrinsics.checkNotNullExpressionValue(th, "");
                            function1.invoke(th);
                        }
                    }
                });
            }
        } else {
            AbstractC3664m abstractC3664m = LJIIJJI().LJI;
            if (!(abstractC3664m instanceof C87626Kfs)) {
                abstractC3664m = null;
            }
            C87626Kfs c87626Kfs = (C87626Kfs) abstractC3664m;
            if (c87626Kfs != null) {
                AnchorMiniCardService$mount$3 anchorMiniCardService$mount$3 = new AnchorMiniCardService$mount$3(this);
                AnchorMiniCardService$mount$4 anchorMiniCardService$mount$4 = AnchorMiniCardService$mount$4.INSTANCE;
                if (!PatchProxy.proxy(new Object[]{anchorMiniCardService$mount$3, anchorMiniCardService$mount$4}, c87626Kfs, C87626Kfs.LIZ, false, 18).isSupported) {
                    C106862S5w.LIZ(anchorMiniCardService$mount$3, anchorMiniCardService$mount$4);
                    c87626Kfs.LIZ(new AnchorMiniAppPluginRuntime$requestAppStart$1(anchorMiniCardService$mount$3), new AnchorMiniAppPluginRuntime$requestAppStart$2(c87626Kfs, anchorMiniCardService$mount$4));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.handler.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer valueOf;
        C1L9 LIZJ;
        Function1<? super String, Unit> function1;
        if (!PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 18).isSupported && message != null && (valueOf = Integer.valueOf(message.what)) != null && valueOf.intValue() == 0 && (LIZJ = C87811Kir.LJI.LIZJ()) != null && (function1 = this.LIZLLL) != null) {
            function1.invoke(LIZJ.LIZJ);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AnchorMiniCardService$2 */
    /* loaded from: classes5.dex */
    public static final class C38622 extends Lambda implements Function1<C3797m, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21793);
        }

        public C38622() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3797m c3797m) {
            Function1<? super String, Unit> function1;
            C3797m c3797m2 = c3797m;
            if (!PatchProxy.proxy(new Object[]{c3797m2}, this, changeQuickRedirect, false, 1).isSupported) {
                String str = c3797m2.LIZ;
                if (str.hashCode() == 1127105834 && str.equals("countdown_time_out")) {
                    AnchorMiniCardService.this.LJII.removeMessages(0);
                    C1L9 LIZJ = C87811Kir.LJI.LIZJ();
                    if (LIZJ != null && (function1 = AnchorMiniCardService.this.LIZLLL) != null) {
                        function1.invoke(LIZJ.LIZJ);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AnchorMiniCardService$3 */
    /* loaded from: classes5.dex */
    public static final class C38633 extends Lambda implements Function1<C3327c, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21794);
        }

        public C38633() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3327c c3327c) {
            PageDataV2.C3362b c3362b;
            C3327c c3327c2 = c3327c;
            if (!PatchProxy.proxy(new Object[]{c3327c2}, this, changeQuickRedirect, false, 1).isSupported) {
                C87911KkT c87911KkT = C87911KkT.LIZIZ;
                StringBuilder sb = new StringBuilder("MountMiniAppEvent:  mountParams:");
                PageDataV2 LIZ = C87811Kir.LIZ();
                if (LIZ != null) {
                    c3362b = LIZ.f26017LJ;
                } else {
                    c3362b = null;
                }
                sb.append(c3362b);
                sb.append(" isMount:");
                sb.append(c3327c2.LIZ);
                c87911KkT.LIZ(sb.toString(), AnchorMiniCardService.this.LIZIZ);
                if (c3327c2.LIZ) {
                    AnchorMiniCardService.this.LJIIIIZZ();
                }
                if (AnchorMiniCardService.this.LJIIJJI().LJIIJJI) {
                    C87659KgP.LIZ(AnchorMiniCardService.this.LJIIJJI().LJI, null, false, false, 7, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AnchorMiniCardService$4 */
    /* loaded from: classes5.dex */
    public static final class C38644 extends Lambda implements Function1<C3329e, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21795);
        }

        public C38644() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3329e c3329e) {
            if (!PatchProxy.proxy(new Object[]{c3329e}, this, changeQuickRedirect, false, 1).isSupported) {
                C87911KkT.LIZIZ.LIZ("ShowMiniAppInCardSettingEvent", AnchorMiniCardService.this.LIZIZ);
                AnchorMiniCardService.this.LJIIJJI().LJI.LIZJ(MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchorAction", "ADD"), TuplesKt.m137to("needSnapshot", String.valueOf(C87811Kir.LJI.LJFF()))));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniCardService(C3682x c3682x) {
        super(c3682x);
        Observable LIZ2;
        Disposable LIZ3;
        C106862S5w.LIZ(c3682x);
        this.LJIIIZ = c3682x;
        C87911KkT.LIZIZ.LIZ("init", this.LIZIZ);
        AbstractC3512ag abstractC3512ag = LJIIJJI().LJII;
        if (abstractC3512ag != null && (LIZ2 = abstractC3512ag.LIZ(C3515al.class)) != null && (LIZ3 = C87890Kk8.LIZ(LIZ2, new C38611())) != null) {
            LIZ(LIZ3);
        }
        Observable LIZ4 = C87010KQi.LIZ().LIZ(C3797m.class);
        Intrinsics.checkNotNullExpressionValue(LIZ4, "");
        LIZ(C87890Kk8.LIZ(LIZ4, new C38622()));
        Observable LIZ5 = C87010KQi.LIZ().LIZ(C3327c.class);
        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
        LIZ(C87890Kk8.LIZ(LIZ5, new C38633()));
        Observable LIZ6 = C87010KQi.LIZ().LIZ(C3329e.class);
        Intrinsics.checkNotNullExpressionValue(LIZ6, "");
        LIZ(C87890Kk8.LIZ(LIZ6, new C38644()));
        this.LJII = new WeakHandler(this);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AnchorMiniCardService$1 */
    /* loaded from: classes5.dex */
    public static final class C38611 extends Lambda implements Function1<C3515al, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21792);
        }

        public C38611() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3515al c3515al) {
            Integer num;
            String str;
            C8733af c8733af;
            Integer num2;
            C8733af c8733af2;
            Long l;
            Long l2;
            long j;
            long j2;
            long j3;
            Long l3;
            C8733af c8733af3;
            C3561g LIZ;
            C87884Kk2 c87884Kk2;
            Integer valueOf;
            C3515al c3515al2 = c3515al;
            if (!PatchProxy.proxy(new Object[]{c3515al2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c3515al2);
                C8906gu c8906gu = c3515al2.LIZIZ;
                if (c8906gu != null) {
                    AnchorMiniCardService anchorMiniCardService = AnchorMiniCardService.this;
                    if (!PatchProxy.proxy(new Object[]{c8906gu}, anchorMiniCardService, AnchorMiniCardService.LIZ, false, 7).isSupported) {
                        if (!PatchProxy.proxy(new Object[]{c8906gu}, anchorMiniCardService, AnchorMiniCardService.LIZ, false, 8).isSupported) {
                            anchorMiniCardService.LJII.removeMessages(0);
                            C8733af c8733af4 = c8906gu.LIZJ;
                            if (c8733af4 != null && c8733af4.LIZLLL == 1 && (c8733af = c8906gu.LIZJ) != null && (num2 = c8733af.LIZ) != null && num2.intValue() == 1 && (c8733af2 = c8906gu.LIZJ) != null && (l = c8733af2.LIZJ) != null) {
                                long longValue = l.longValue();
                                Integer num3 = c8906gu.LIZLLL;
                                if (num3 != null && num3.intValue() == 5 && anchorMiniCardService.f26112LJ) {
                                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8906gu}, anchorMiniCardService, AnchorMiniCardService.LIZ, false, 10);
                                    if (!proxy.isSupported ? (c8733af3 = c8906gu.LIZJ) == null || (LIZ = C87811Kir.LJI.LIZ(c8733af3)) == null || (c87884Kk2 = LIZ.LIZIZ) == null || (valueOf = Integer.valueOf(c87884Kk2.LIZIZ)) == null || (valueOf.intValue() != 4 && valueOf.intValue() != 3) : ((Boolean) proxy.result).booleanValue()) {
                                        anchorMiniCardService.f26112LJ = false;
                                        C88440Kt0.LIZ(LK5.LIZ(2131586310, Long.valueOf(longValue / 1000)));
                                    }
                                }
                                C8733af c8733af5 = c8906gu.LIZJ;
                                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c8733af5}, anchorMiniCardService, AnchorMiniCardService.LIZ, false, 9);
                                if (proxy2.isSupported) {
                                    l2 = (Long) proxy2.result;
                                } else if (c8733af5 != null) {
                                    C3561g LIZ2 = C87811Kir.LJI.LIZ(c8733af5);
                                    if (LIZ2 != null) {
                                        C87884Kk2 c87884Kk22 = LIZ2.LIZIZ;
                                        if (c87884Kk22 != null && c87884Kk22.LIZIZ == 1) {
                                            l2 = c8733af5.LIZJ;
                                        } else {
                                            C87884Kk2 c87884Kk23 = LIZ2.LIZIZ;
                                            if (c87884Kk23 != null) {
                                                j = c87884Kk23.LJI;
                                            } else {
                                                j = -1;
                                            }
                                            C87884Kk2 c87884Kk24 = LIZ2.LIZIZ;
                                            if (c87884Kk24 != null && (l3 = c87884Kk24.LJFF) != null) {
                                                j2 = l3.longValue();
                                            } else {
                                                j2 = j - 1;
                                            }
                                            C87884Kk2 c87884Kk25 = LIZ2.LIZIZ;
                                            if (c87884Kk25 != null && c87884Kk25.LIZIZ == 3 && C87811Kir.LJI.LIZ(LIZ2)) {
                                                long j4 = (j2 - j) * 1000;
                                                Long l4 = c8733af5.LIZJ;
                                                if (l4 != null) {
                                                    j3 = l4.longValue();
                                                } else {
                                                    j3 = 20000;
                                                }
                                                l2 = Long.valueOf(Math.min(j4, j3));
                                            } else {
                                                Long l5 = c8733af5.LIZJ;
                                                if (l5 != null && l5.longValue() == 0) {
                                                    l2 = -1L;
                                                }
                                            }
                                        }
                                    }
                                    l2 = c8733af5.LIZJ;
                                }
                                if (l2 != null) {
                                    long longValue2 = l2.longValue();
                                    if (longValue2 >= 0) {
                                        anchorMiniCardService.LJII.sendEmptyMessageDelayed(0, longValue2);
                                    }
                                }
                            }
                        }
                        C8733af c8733af6 = c8906gu.LIZJ;
                        if (c8733af6 != null && (str = c8733af6.LJFF) != null && str.length() > 0) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("review_status") && jSONObject.has("from_review") && jSONObject.getBoolean("from_review")) {
                                int i = jSONObject.getInt("review_status");
                                PageDataV2 LIZ3 = C87811Kir.LIZ();
                                if (LIZ3 != null) {
                                    LIZ3.LIZ(PageDataV2.ReviewStatus.Companion.LIZ(i));
                                }
                                C87010KQi.LIZ().LIZ(new C3801k(PageDataV2.ReviewStatus.Companion.LIZ(i)));
                            }
                        }
                        C8733af c8733af7 = c8906gu.LIZJ;
                        if (c8733af7 != null) {
                            num = c8733af7.LIZ;
                        } else {
                            num = null;
                        }
                        int LIZJ = C37E.LIZJ();
                        if (num != null && num.intValue() == LIZJ) {
                            C86932KNi c86932KNi = new C86932KNi(anchorMiniCardService.LJIIJJI().LIZLLL, 1);
                            c86932KNi.LIZJ(2131698907);
                            c86932KNi.LIZ(LK5.LIZJ(2130856575), (View.OnClickListener) null);
                            c86932KNi.LIZ(false);
                            c86932KNi.LJFF(17);
                            c86932KNi.LIZIZ(false);
                            c86932KNi.LIZ(LK5.LIZ(2131586720), DialogInterface$OnClickListenerC87816Kiw.LIZIZ);
                            DialogC6336gc LIZ4 = c86932KNi.LIZ();
                            if (LIZ4 != null) {
                                LIZ4.LIZ((CharSequence) anchorMiniCardService.LJIIJJI().LIZLLL.getString(2131586308));
                                LIZ4.LIZIZ(anchorMiniCardService.LJIIJJI().LIZLLL.getString(2131586327));
                                C116971W2r.LIZJ(LIZ4);
                            }
                            C87659KgP.LIZ(anchorMiniCardService.LJIIJJI().LJI, null, false, false, 7, null);
                        }
                    }
                    C87010KQi.LIZ().LIZ(c8906gu);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void LIZ(String str, boolean z, Function1<? super Boolean, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, function1);
        C87811Kir.LJI.LIZ(LJIIJJI().LJIIIIZZ(), LJIIJJI().LJIIIIZZ.LJII, z, new AnchorMiniCardService$showOrHide$1(z, function1), new AnchorMiniCardService$showOrHide$2(function1));
    }
}
