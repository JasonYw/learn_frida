package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewMiniAppWidget;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.PageData;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.model.p287a.C3368e;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.api.p282a.C3330f;
import com.bytedance.android.live.broadcastgame.api.stampavailable.C3402d;
import com.bytedance.android.live.broadcastgame.api.stampavailable.OpenPlatformApi;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.utility.SharedPrefHelper;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p002O.C0002O;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC439593aD;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C2VQ;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C413602Yo;
import p003X.C439423Zw;
import p003X.C439683aM;
import p003X.C441223cq;
import p003X.C4574547f;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C87710KhE;
import p003X.C87843KjN;
import p003X.C87844KjO;
import p003X.C88306Kqq;
import p003X.KK6;
import p003X.LK5;
import p003X.M0Q;
import p003X.QB4;

@AbstractC445813kF(LIZ = "MINI_APP")
/* loaded from: classes12.dex */
public final class PreviewMiniAppWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final SharedPrefHelper LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25992LJ;
    public C3368e LJI;
    public AbstractC439593aD LJIIL;
    public final Lazy LJIILJJIL = LIZ(C3199v.class);
    public String LJFF = "";
    public volatile int LJIILIIL = 1;
    public final CompositeDisposable LJIILL = new CompositeDisposable();

    static {
        Covode.recordClassIndex(18601);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewMiniAppWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewMiniAppWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        ((OpenPlatformApi) C88306Kqq.LIZ().LIZ(OpenPlatformApi.class)).requestEntrancePermission().subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<AbstractC100834PnQ<C3368e>>() { // from class: X.3aC
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18611);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC100834PnQ<C3368e> abstractC100834PnQ) {
                boolean z;
                int LIZ2;
                AbstractC100834PnQ<C3368e> abstractC100834PnQ2 = abstractC100834PnQ;
                if (!PatchProxy.proxy(new Object[]{abstractC100834PnQ2}, this, LIZ, false, 1).isSupported) {
                    PreviewMiniAppWidget previewMiniAppWidget = PreviewMiniAppWidget.this;
                    previewMiniAppWidget.LJIILIIL = 0;
                    previewMiniAppWidget.LJI = abstractC100834PnQ2.LIZIZ;
                    C3368e c3368e = PreviewMiniAppWidget.this.LJI;
                    if (c3368e != null) {
                        z = c3368e.LIZ;
                    } else {
                        z = false;
                    }
                    C87843KjN.LIZLLL = z;
                    if (abstractC100834PnQ2.LIZIZ.LIZJ) {
                        PreviewMiniAppWidget previewMiniAppWidget2 = PreviewMiniAppWidget.this;
                        if (!PatchProxy.proxy(new Object[0], previewMiniAppWidget2, PreviewMiniAppWidget.LIZ, false, 12).isSupported && (LIZ2 = previewMiniAppWidget2.LIZJ.LIZ(previewMiniAppWidget2.LIZLLL, 0)) < 2) {
                            previewMiniAppWidget2.LIZJ.LIZIZ(previewMiniAppWidget2.LIZLLL, Integer.valueOf(LIZ2 + 1));
                            View findViewById = previewMiniAppWidget2.findViewById(2131172730);
                            Intrinsics.checkNotNullExpressionValue(findViewById, "");
                            findViewById.setVisibility(0);
                        }
                    } else {
                        PreviewMiniAppWidget.this.LIZLLL();
                    }
                    AbstractC439593aD abstractC439593aD = PreviewMiniAppWidget.this.LJIIL;
                    if (abstractC439593aD != null) {
                        abstractC439593aD.LIZ();
                    }
                }
            }
        }, new Consumer<Throwable>() { // from class: X.3aE
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18612);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Throwable th) {
                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    PreviewMiniAppWidget previewMiniAppWidget = PreviewMiniAppWidget.this;
                    previewMiniAppWidget.LJIILIIL = 2;
                    AbstractC439593aD abstractC439593aD = previewMiniAppWidget.LJIIL;
                    if (abstractC439593aD != null) {
                        abstractC439593aD.LIZIZ();
                    }
                }
            }
        });
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        View findViewById = findViewById(2131172730);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        findViewById.setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698465;
        }
        return 2131698464;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJIILL.dispose();
        ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).clearAutoMountMiniAppData();
    }

    public PreviewMiniAppWidget() {
        SharedPrefHelper LIZ2 = SharedPrefHelper.LIZ(LK5.LJIIJ());
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZJ = LIZ2;
        IService service = ServiceManager.getService(IHostContext.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        this.LIZLLL = C0002O.m25086C("LiveMiniAppEntranceShowDot:", ((IHostContext) service).getServerDeviceId());
        IService service2 = ServiceManager.getService(IHostContext.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        this.f25992LJ = C0002O.m25086C("liveMiniAppFirstMemory:", ((IHostContext) service2).getServerDeviceId());
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (!this.LIZJ.LIZ(this.f25992LJ, false)) {
            ALogger.m15797i(LIZ(), "checkOldMemory: first");
            Disposable subscribe = C441223cq.f949LJ.m24901LJ().subscribe(new Consumer<C3402d>() { // from class: X.3cj
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18605);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C3402d c3402d) {
                    C3384q c3384q;
                    String str;
                    String str2;
                    PageDataV2.C3362b c3362b;
                    String str3;
                    PageDataV2.C3362b c3362b2;
                    C3383p LJFF;
                    C3402d c3402d2 = c3402d;
                    if (!PatchProxy.proxy(new Object[]{c3402d2}, this, LIZ, false, 1).isSupported) {
                        if (c3402d2.LIZLLL == PluginType.MINI_APP) {
                            ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), "checkOldMemory: showIcon");
                            PreviewMiniAppWidget.this.LIZ(c3402d2.f26032LJ);
                            C87843KjN.LIZ(new PageDataV2(C441223cq.LIZIZ()));
                            C3402d LIZ2 = C441223cq.LIZ();
                            String str4 = null;
                            if (LIZ2 != null) {
                                c3384q = LIZ2.LIZJ;
                            } else {
                                c3384q = null;
                            }
                            C87843KjN.LIZ(c3384q);
                            C87793KiZ c87793KiZ = C87793KiZ.LIZIZ;
                            C3384q LIZ3 = C87843KjN.LIZ();
                            if (LIZ3 != null && (LJFF = LIZ3.LJFF()) != null) {
                                str = LJFF.LJLIIIL;
                            } else {
                                str = null;
                            }
                            C3384q LIZ4 = C87843KjN.LIZ();
                            if (LIZ4 != null) {
                                str4 = LIZ4.LJFF;
                            }
                            PageDataV2 LIZIZ2 = C87843KjN.LIZIZ();
                            String str5 = "";
                            if (LIZIZ2 == null || (c3362b2 = LIZIZ2.f26017LJ) == null || (str2 = c3362b2.LIZIZ) == null) {
                                str2 = str5;
                            }
                            PageDataV2 LIZIZ3 = C87843KjN.LIZIZ();
                            if (LIZIZ3 != null && (c3362b = LIZIZ3.f26017LJ) != null && (str3 = c3362b.LJIIIIZZ) != null) {
                                str5 = str3;
                            }
                            c87793KiZ.LIZ(str, str4, str2, str5);
                            return;
                        }
                        ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), "checkOldMemory: hideIcon");
                        PreviewMiniAppWidget.this.m15866LJ();
                    }
                }
            }, new Consumer<Throwable>() { // from class: X.3aI
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18606);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), C0002O.m25086C("checkOldMemory: ", th2.getMessage()));
                    }
                }
            });
            if (subscribe != null) {
                QB4.LIZ(subscribe, this.LJIILL);
            }
        } else {
            m15866LJ();
        }
        this.LIZJ.LIZIZ(this.f25992LJ, Boolean.TRUE);
    }

    /* renamed from: LJ */
    public final void m15866LJ() {
        PluginType pluginType;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MINIAPP_MEMORY_OPEN;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C87843KjN.m23464LJ();
        } else {
            C3402d LIZ2 = C441223cq.LIZ();
            if (LIZ2 != null) {
                pluginType = LIZ2.LIZLLL;
            } else {
                pluginType = null;
            }
            if (pluginType == PluginType.MINI_APP) {
                C441223cq.LIZ((C3402d) null);
            }
        }
        if (KK6.LIZ()) {
            HSImageView hSImageView = (HSImageView) findViewById(2131168941);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            hSImageView.setVisibility(8);
            View findViewById = findViewById(2131192798);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = 0;
                findViewById.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        HSImageView hSImageView2 = (HSImageView) findViewById(2131168941);
        Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
        hSImageView2.setVisibility(8);
        View findViewById2 = findViewById(2131165222);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
        if (layoutParams3 != null) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.rightMargin = 0;
            findViewById2.setLayoutParams(layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void LJFF() {
        long j;
        String str;
        C3368e c3368e;
        C3VF user;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            j = user.LIZIZ();
        } else {
            j = 0;
        }
        HashMap hashMap = new HashMap();
        C3368e c3368e2 = this.LJI;
        if (c3368e2 != null && c3368e2.LIZ) {
            str = "satisfied";
        } else {
            str = "not";
        }
        hashMap.put("panel_type", str);
        hashMap.put("live_type", C2VQ.LIZ(LJIIJJI().LIZ().LIZ()));
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("is_partner", "0");
        C4574547f.LIZ().LIZ("livesdk_live_introduce_panel_show", hashMap, new Object[0]);
        C3368e c3368e3 = this.LJI;
        if (c3368e3 != null && c3368e3.LIZ && (c3368e = this.LJI) != null && c3368e.LIZIZ) {
            ((OpenPlatformApi) C88306Kqq.LIZ().LIZ(OpenPlatformApi.class)).requestIntroPanelFinished().subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(C439423Zw.LIZ, new Consumer<Throwable>() { // from class: X.3aL
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18616);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        ALogger.m15798e(PreviewMiniAppWidget.this.LIZ(), th2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Observable observeOn;
        C2WC<PreviewStatusInfo> m15893LJ;
        Observable<PreviewStatusInfo> LIZIZ2;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJLI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(Boolean.FALSE);
        IService service = ServiceManager.getService(IUserService.class);
        Intrinsics.checkNotNull(service);
        IUser LIZ2 = ((IUserService) service).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        String secUid = LIZ2.getSecUid();
        Disposable LIZ3 = C413602Yo.LIZ(LJIIJJI().LJI(), new PreviewMiniAppWidget$onCreate$1(this));
        if (LIZ3 != null) {
            LIZ(LIZ3);
        }
        LIZJ(new PreviewMiniAppWidget$onCreate$2(this, secUid));
        C3180k LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (m15893LJ = LJIIJJI.m15893LJ()) != null && (LIZIZ2 = m15893LJ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new Consumer<PreviewStatusInfo>() { // from class: X.3aK
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18613);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(PreviewStatusInfo previewStatusInfo) {
                PreviewStatusInfo previewStatusInfo2 = previewStatusInfo;
                if (!PatchProxy.proxy(new Object[]{previewStatusInfo2}, this, LIZ, false, 1).isSupported) {
                    int LIZ4 = previewStatusInfo2.LIZ();
                    if (LIZ4 != 1 && LIZ4 != 4 && LIZ4 != 5 && LIZ4 != 6) {
                        ViewGroup viewGroup = PreviewMiniAppWidget.this.containerView;
                        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                        viewGroup.setAlpha(1.0f);
                        return;
                    }
                    ViewGroup viewGroup2 = PreviewMiniAppWidget.this.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                    viewGroup2.setAlpha(0.5f);
                }
            }
        })) != null) {
            LIZ(subscribe);
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C87710KhE.LIZ, true, 1);
        if (!proxy.isSupported || ((Boolean) proxy.result).booleanValue()) {
            ((ImageView) findViewById(2131192798)).setImageResource(2130855864);
            ((TextView) findViewById(2131171162)).setText(2131583380);
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MINIAPP_MEMORY_OPEN;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], C87843KjN.f8582LJ, C87843KjN.LIZ, false, 1);
                    if (proxy2.isSupported) {
                        observeOn = (Observable) proxy2.result;
                    } else {
                        C87843KjN.LIZIZ = null;
                        C87843KjN.LIZJ = null;
                        C87843KjN.LIZLLL = false;
                        observeOn = ((OpenPlatformApi) C88306Kqq.LIZ().LIZ(OpenPlatformApi.class)).getMemoryData().map(C87844KjO.LIZIZ).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread());
                        Intrinsics.checkNotNullExpressionValue(observeOn, "");
                    }
                    Disposable subscribe2 = observeOn.subscribe(new Consumer<Unit>() { // from class: X.3ci
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18607);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(Unit unit) {
                            List<String> list;
                            String str;
                            String str2;
                            String str3;
                            String str4;
                            PageDataV2.C3362b c3362b;
                            PageDataV2.C3362b c3362b2;
                            C3383p LJFF;
                            boolean z = true;
                            if (!PatchProxy.proxy(new Object[]{unit}, this, LIZ, false, 1).isSupported) {
                                if (C87843KjN.LIZLLL()) {
                                    C3384q LIZ4 = C87843KjN.LIZ();
                                    String str5 = null;
                                    if (LIZ4 != null) {
                                        list = LIZ4.LJI;
                                    } else {
                                        list = null;
                                    }
                                    PreviewMiniAppWidget previewMiniAppWidget = PreviewMiniAppWidget.this;
                                    if (list != null && !list.isEmpty()) {
                                        z = false;
                                    }
                                    if (z) {
                                        str = "";
                                    } else {
                                        str = list.get(0);
                                    }
                                    previewMiniAppWidget.LIZ(str);
                                    C87793KiZ c87793KiZ = C87793KiZ.LIZIZ;
                                    C3384q LIZ5 = C87843KjN.LIZ();
                                    if (LIZ5 != null && (LJFF = LIZ5.LJFF()) != null) {
                                        str2 = LJFF.LJLIIIL;
                                    } else {
                                        str2 = null;
                                    }
                                    C3384q LIZ6 = C87843KjN.LIZ();
                                    if (LIZ6 != null) {
                                        str5 = LIZ6.LJFF;
                                    }
                                    PageDataV2 LIZIZ3 = C87843KjN.LIZIZ();
                                    if (LIZIZ3 == null || (c3362b2 = LIZIZ3.f26017LJ) == null || (str3 = c3362b2.LIZIZ) == null) {
                                        str3 = "";
                                    }
                                    PageDataV2 LIZIZ4 = C87843KjN.LIZIZ();
                                    if (LIZIZ4 == null || (c3362b = LIZIZ4.f26017LJ) == null || (str4 = c3362b.LJIIIIZZ) == null) {
                                        str4 = "";
                                    }
                                    c87793KiZ.LIZ(str2, str5, str3, str4);
                                    PreviewMiniAppWidget.this.LIZJ.LIZIZ(PreviewMiniAppWidget.this.f25992LJ, Boolean.TRUE);
                                    return;
                                }
                                PreviewMiniAppWidget.this.LIZIZ();
                                ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), "newMemory: checkOldMemoryCache");
                            }
                        }
                    }, new Consumer<Throwable>() { // from class: X.3aH
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18608);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(Throwable th) {
                            Throwable th2 = th;
                            if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                                ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), C0002O.m25086C("newMemory: ", th2.getMessage()));
                                PreviewMiniAppWidget.this.LIZIZ();
                            }
                        }
                    });
                    if (subscribe2 != null) {
                        QB4.LIZ(subscribe2, this.LJIILL);
                    }
                } else {
                    C441223cq.LIZ(false);
                    Disposable subscribe3 = C441223cq.f949LJ.m24901LJ().subscribe(new Consumer<C3402d>() { // from class: X.3aG
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18609);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(C3402d c3402d) {
                            C3402d c3402d2 = c3402d;
                            if (!PatchProxy.proxy(new Object[]{c3402d2}, this, LIZ, false, 1).isSupported) {
                                if (c3402d2.LIZLLL == PluginType.MINI_APP) {
                                    ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), "oldMemory: showIcon");
                                    C441223cq.LIZ(true);
                                    PreviewMiniAppWidget.this.LIZ(c3402d2.f26032LJ);
                                    return;
                                }
                                ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), "oldMemory: hideIcon");
                                PreviewMiniAppWidget.this.m15866LJ();
                            }
                        }
                    }, new Consumer<Throwable>() { // from class: X.3aJ
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18610);
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final /* synthetic */ void accept(Throwable th) {
                            Throwable th2 = th;
                            if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                                ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), C0002O.m25086C("oldMemory: ", th2.getMessage()));
                            }
                        }
                    });
                    if (subscribe3 != null) {
                        QB4.LIZ(subscribe3, this.LJIILL);
                    }
                }
            }
            SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_MINIAPP_ENTRANCE_PERMISSION;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value2 = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            if (value2.booleanValue()) {
                LIZJ();
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            Disposable subscribe4 = C87010KQi.LIZ().LIZ(C3330f.class).subscribe(new Consumer<C3330f>() { // from class: X.3aF
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18603);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C3330f c3330f) {
                    C3330f c3330f2 = c3330f;
                    if (!PatchProxy.proxy(new Object[]{c3330f2}, this, LIZ, false, 1).isSupported) {
                        if (c3330f2.LIZ != null) {
                            C3384q c3384q = c3330f2.LIZ;
                            Intrinsics.checkNotNull(c3384q);
                            if (!c3384q.LJI.isEmpty()) {
                                ALogger.m15797i(PreviewMiniAppWidget.this.LIZ(), "miniapp url: it.item!!.iconUrl[0]");
                                PreviewMiniAppWidget previewMiniAppWidget = PreviewMiniAppWidget.this;
                                C3384q c3384q2 = c3330f2.LIZ;
                                Intrinsics.checkNotNull(c3384q2);
                                previewMiniAppWidget.LIZ(c3384q2.LJI.get(0));
                                return;
                            }
                            ALogger.m15800e(PreviewMiniAppWidget.this.LIZ(), "iconUrl is empty");
                            PreviewMiniAppWidget.this.LIZ(true);
                            return;
                        }
                        C441223cq.LIZ(false);
                        PreviewMiniAppWidget.this.m15866LJ();
                        PreviewMiniAppWidget.this.LIZ(false);
                    }
                }
            }, C439683aM.LIZ);
            Intrinsics.checkNotNullExpressionValue(subscribe4, "");
            LIZ(subscribe4);
            if (((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).hasPreMountMiniApp()) {
                LIZ(true);
                m15866LJ();
            }
        }
    }

    public final void LIZ(String str) {
        C2WC<PreviewStatusInfo> m15893LJ;
        PreviewStatusInfo LIZ2;
        C2WC<PreviewStatusInfo> m15893LJ2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (KK6.LIZ()) {
            ((ImageView) findViewById(2131192798)).setImageResource(2130855476);
            HSImageView hSImageView = (HSImageView) findViewById(2131168941);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            hSImageView.setVisibility(0);
            M0Q.LIZ(hSImageView, str);
        } else {
            ((ImageView) findViewById(2131192798)).setImageResource(2130855476);
            HSImageView hSImageView2 = (HSImageView) findViewById(2131168941);
            Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
            hSImageView2.setVisibility(0);
            M0Q.LIZ(hSImageView2, str);
            View findViewById = findViewById(2131165222);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = LK5.LIZ(7.0f);
                findViewById.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
        }
        C3180k LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (m15893LJ = LJIIJJI.m15893LJ()) != null && (LIZ2 = m15893LJ.LIZ()) != null) {
            LIZ2.mixMiniAppCount = 1L;
            C3180k LJIIJJI2 = LJIIJJI();
            if (LJIIJJI2 != null && (m15893LJ2 = LJIIJJI2.m15893LJ()) != null) {
                m15893LJ2.LIZ(LIZ2);
            }
        }
    }

    public final void LIZ(boolean z) {
        PreviewStatusInfo previewStatusInfo;
        C2WC<PreviewStatusInfo> m15893LJ;
        C2WC<PreviewStatusInfo> m15893LJ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C3180k LJIIJJI = LJIIJJI();
        if (LJIIJJI != null && (m15893LJ2 = LJIIJJI.m15893LJ()) != null) {
            previewStatusInfo = m15893LJ2.LIZ();
        } else {
            previewStatusInfo = null;
        }
        this.LJIILL.dispose();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MINIAPP_MEMORY_OPEN;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C87843KjN.m23464LJ();
        } else {
            C441223cq.LIZ((C3402d) null);
            C441223cq.LIZ((PageData) null);
        }
        m15866LJ();
        if (z) {
            if (previewStatusInfo != null) {
                previewStatusInfo.mixMiniAppCount = 1L;
            }
            ((ImageView) findViewById(2131192798)).setImageResource(2130855865);
            if (previewStatusInfo == null) {
                return;
            }
        } else {
            ((ImageView) findViewById(2131192798)).setImageResource(2130855864);
            if (previewStatusInfo == null) {
                return;
            }
            previewStatusInfo.mixMiniAppCount = 0L;
        }
        C3180k LJIIJJI2 = LJIIJJI();
        if (LJIIJJI2 != null && (m15893LJ = LJIIJJI2.m15893LJ()) != null) {
            m15893LJ.LIZ(previewStatusInfo);
        }
    }
}
