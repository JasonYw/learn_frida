package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewStickerWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.room.AbstractC5503n;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.AbstractC5792i;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8670x;
import com.bytedance.android.livesdk.popup.AbstractC9161b;
import com.bytedance.android.livesdk.popup.C9162c;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p771a.AbstractC9476j;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p002O.C0002O;
import p003X.AbstractC141148dfJ;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C3808216m;
import p003X.C3PE;
import p003X.C422702o4;
import p003X.C4574547f;
import p003X.C86661KCx;
import p003X.C86676KDm;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.K8Q;
import p003X.KAO;
import p003X.KAP;
import p003X.KCP;
import p003X.KD0;
import p003X.KD1;
import p003X.KD2;
import p003X.KDS;
import p003X.KHM;
import p003X.KHN;
import p003X.KK6;
import p003X.LK5;
import p003X.LLY;
import p003X.M0Q;

@AbstractC445813kF(LIZ = "STICKER")
/* loaded from: classes5.dex */
public final class PreviewStickerWidget extends AbsPreviewWidget implements AbstractC5792i, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public Sticker LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public AbstractC9161b<?> f25998LJ;
    public AbstractC9476j LJFF;
    public KHM LJI;
    public KHN LJIIL;
    public Effect LJIILIIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public AbstractC2863ai LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIILJJIL = true;
    public final Lazy LJIJJ = LIZ(C3181o.class);
    public final Lazy LJIJJLI = LIZ(C3PE.class);
    public final Lazy LJIL = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18702);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewStickerWidget.class, "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewStickerWidget.class, "previewStickerContext", "getPreviewStickerContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewStickerContext;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(PreviewStickerWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl3);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    private final C3PE LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3PE) (proxy.isSupported ? proxy.result : LIZ(this.LJIJJLI, this, LIZIZ[1]));
    }

    private final C3199v LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIL, this, LIZIZ[2]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewStickerWidget";
    }

    public final C3181o LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3181o) (proxy.isSupported ? proxy.result : LIZ(this.LJIJJ, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a236";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 26).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AbstractC2863ai LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (AbstractC2863ai) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.LJIIZILJ;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai;
    }

    public PreviewStickerWidget() {
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
    }

    /* renamed from: LJ */
    public final FrameLayout m15860LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (FrameLayout) proxy.result;
        }
        Context context = getContext();
        if (context != null) {
            View findViewById = ((AppCompatActivity) context).findViewById(2131190441);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            return (FrameLayout) findViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698481;
        }
        return 2131698480;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        AbstractC5503n hostStickerViewService = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).hostStickerViewService();
        if (hostStickerViewService != null) {
            hostStickerViewService.LIZIZ(this);
        }
        super.onDestroy();
        CompositeDisposable LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        LIZJ(new PreviewStickerWidget$onCreate$1(this));
        LLY.LIZ(this.containerView, LK5.LIZ(2131587845));
        LJFF();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_GET_STICKER_FROM_SOURCEPARAM;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && !PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            LJII().LJIJ().LIZ(new PreviewStickerWidget$getStickerFromSourceParam$1(this));
        }
    }

    public final void LJFF() {
        CompositeDisposable LJIIL;
        C3180k LJIIJJI;
        C2WD<Sticker> LIZLLL;
        C2WC<Sticker> LIZ2;
        MethodCollector.m14708i(1378);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            MethodCollector.m14707o(1378);
            return;
        }
        Sticker sticker = this.LIZJ;
        if (sticker != null) {
            C3PE LJI = LJI();
            if (LJI != null && (LIZ2 = LJI.LIZ()) != null) {
                LIZ2.LIZ(sticker);
            }
            if (this.LIZLLL == 2 && (LJIIJJI = LJIIJJI()) != null && (LIZLLL = LJIIJJI.LIZLLL()) != null) {
                LIZLLL.LIZ(sticker);
            }
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_GET_STICKER_FROM_SOURCEPARAM;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (!settingKey.getValue().booleanValue()) {
                LJII().LJIJ().LIZ(new PreviewStickerWidget$showBlessingSticker$$inlined$let$lambda$1(sticker, this));
            }
            this.LJIJ = true;
            ImageModel imageModel = null;
            if (sticker.isBlessing()) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZ;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ3 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.booleanValue()) {
                    View inflate = LayoutInflater.from(this.context).inflate(2131700242, (ViewGroup) null);
                    inflate.setOnClickListener(new KD2(this));
                    C9162c LIZJ = C9162c.LIZIZ(this.context).LIZ(inflate).LIZ(5L).LIZLLL(true).LIZJ();
                    Intrinsics.checkNotNullExpressionValue(LIZJ, "");
                    this.f25998LJ = LIZJ;
                    AbstractC9161b<?> abstractC9161b = this.f25998LJ;
                    if (abstractC9161b == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    abstractC9161b.LIZ(this.contentView, 0, 1, LK5.LIZ(-10.0f), LK5.LIZ(-10.0f));
                    SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_BASE_POPUP_MANAGER_ENABLE;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    if (!settingKey2.getValue().booleanValue() && (LJIIL = LJIIL()) != null) {
                        LJIIL.add(((KDS) Single.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).m149as(autoDispose())).LIZ(new KD0(this), C3808216m.LIZ));
                    }
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLLZ;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.FALSE);
                }
            }
            View view = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ImageView imageView = (ImageView) view.findViewById(2131190559);
            C2844m icon = sticker.getIcon();
            if (icon != null) {
                imageModel = icon.LIZ();
            }
            M0Q.LIZ(imageView, imageModel, 2130856832);
            MethodCollector.m14707o(1378);
            return;
        }
        MethodCollector.m14707o(1378);
    }

    public final void LIZLLL() {
        String str;
        KHM khm;
        KHN LIZ2;
        KHN khn;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        AbstractC5503n hostStickerViewService = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).hostStickerViewService();
        if (!C422702o4.LIZ()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.LJIJ) {
            str = "content_guide";
        } else {
            str = "normal_type";
        }
        hashMap.put("content_type", str);
        C4574547f LIZ3 = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZIZ("live_take");
        c8668v.LJFF("click");
        c8668v.LIZ("live_take_page");
        LIZ3.LIZ("pm_live_sticker_click", hashMap, c8668v, new C8670x());
        if (this.LJIILLIIL && !PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event_page", "live_take_page");
            C4574547f.LIZ().LIZ("livesdk_live_sticker_prior_disclosure_icon_click", hashMap2, Room.class);
        }
        C86661KCx c86661KCx = new C86661KCx(this);
        FragmentManager fragmentManager = null;
        if (hostStickerViewService != null) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ANCHOR_ENABLE_OWN_STICKER_PANEL;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (!settingKey.getValue().booleanValue()) {
                hostStickerViewService.LIZ(new AbstractC141148dfJ() { // from class: X.2LI
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18704);
                    }

                    @Override // p003X.AbstractC141148dfJ
                    public final void LIZ(Sticker sticker, String str2, String str3, int i) {
                        if (PatchProxy.proxy(new Object[]{sticker, str2, str3, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(sticker, str3);
                        PreviewStickerWidget.this.LIZ(sticker, str2, i);
                    }

                    @Override // p003X.AbstractC141148dfJ
                    public final void LIZ(Sticker sticker, boolean z, String str2, String str3, int i) {
                        int i2;
                        long j;
                        C3VF user;
                        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, str3, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(sticker, str3);
                        if (Intrinsics.areEqual(sticker, PreviewStickerWidget.this.LIZJ) && PreviewStickerWidget.this.LJIILJJIL) {
                            PreviewStickerWidget.this.LJIILJJIL = false;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (!PatchProxy.proxy(new Object[]{sticker, str2, Integer.valueOf(i), Integer.valueOf(i2)}, PreviewStickerWidget.this, PreviewStickerWidget.LIZ, false, 18).isSupported) {
                            Map hashMap3 = new HashMap();
                            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                            if (iUserService != null && (user = iUserService.user()) != null) {
                                j = user.LIZIZ();
                            } else {
                                j = 0;
                            }
                            hashMap3.put("anchor_id", String.valueOf(j));
                            String valueOf = String.valueOf(i);
                            Intrinsics.checkNotNullExpressionValue(valueOf, "");
                            hashMap3.put("impr_position", valueOf);
                            if (str2 == null) {
                                str2 = "";
                            }
                            hashMap3.put("tab", str2);
                            String valueOf2 = String.valueOf(i2);
                            Intrinsics.checkNotNullExpressionValue(valueOf2, "");
                            hashMap3.put("status", valueOf2);
                            String valueOf3 = String.valueOf(sticker.getId());
                            Intrinsics.checkNotNullExpressionValue(valueOf3, "");
                            hashMap3.put("sticker_id", valueOf3);
                            String valueOf4 = String.valueOf(sticker.isVideoUsedSticker() ? 1 : 0);
                            Intrinsics.checkNotNullExpressionValue(valueOf4, "");
                            hashMap3.put("is_video_sticker", valueOf4);
                            C4574547f LIZ4 = C4574547f.LIZ();
                            C8668v c8668v2 = new C8668v();
                            c8668v2.LIZIZ("live_take");
                            c8668v2.LJFF("click");
                            c8668v2.LIZ("live_take_page");
                            LIZ4.LIZ("live_take_sticker_select", hashMap3, c8668v2);
                        }
                    }
                });
                if (this.LIZJ != null && !this.LJIJI) {
                    Context context = getContext();
                    if (context != null) {
                        Sticker sticker = this.LIZJ;
                        FrameLayout m15860LJ = m15860LJ();
                        Sticker sticker2 = this.LIZJ;
                        Intrinsics.checkNotNull(sticker2);
                        hostStickerViewService.LIZ((AppCompatActivity) context, sticker, m15860LJ, true, LIZ(sticker2.getEffect()));
                        this.LJIJI = true;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                    }
                }
                AbstractC9161b<?> abstractC9161b = this.f25998LJ;
                if (abstractC9161b != null && Boolean.valueOf(abstractC9161b.m15297LJ()).booleanValue()) {
                    AbstractC9161b<?> abstractC9161b2 = this.f25998LJ;
                    if (abstractC9161b2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        abstractC9161b2.LJFF();
                    }
                }
                hostStickerViewService.LIZ(new KAO());
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ().LIZ(new KAP(hostStickerViewService, c86661KCx));
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZ;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(Boolean.FALSE);
                hostStickerViewService.LIZ(this);
                if (this.LJIILL) {
                    C88440Kt0.LIZ(LK5.LIZ(2131582606));
                    this.LJIILL = false;
                }
                Context context2 = getContext();
                if (context2 != null) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) context2;
                    Context context3 = getContext();
                    if (context3 != null) {
                        hostStickerViewService.LIZ(appCompatActivity, ((FragmentActivity) context3).getSupportFragmentManager(), C86676KDm.LIZLLL, m15860LJ(), c86661KCx);
                        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("sticker");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
        }
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            if (this.LJIIL == null) {
                KD1 kd1 = KHN.LJIILL;
                LiveEffectContextFactory.Type type = LiveEffectContextFactory.Type.DEFAULT;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{kd1, type, 0, 2, null}, null, KD1.LIZ, true, 2);
                if (proxy.isSupported) {
                    LIZ2 = (KHN) proxy.result;
                } else {
                    LIZ2 = kd1.LIZ(type, 0);
                }
                if (!PatchProxy.proxy(new Object[]{"live_take_page"}, LIZ2, KHN.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ("live_take_page");
                    LIZ2.LJIIL = "live_take_page";
                }
                LIZ2.getTag();
                this.LJIIL = LIZ2;
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().mo15786LJ().LIZ(new KCP(this));
                Effect effect = this.LJIILIIL;
                if (effect != null && (khn = this.LJIIL) != null) {
                    khn.LJIILIIL = effect;
                }
                KHN khn2 = this.LJIIL;
                if (khn2 != null) {
                    khn2.LIZ(c86661KCx);
                }
            }
            KHN khn3 = this.LJIIL;
            if (khn3 != null) {
                Intrinsics.checkNotNull(khn3);
                if (khn3.LJIILIIL()) {
                    return;
                }
            }
            KHN khn4 = this.LJIIL;
            if (khn4 != null) {
                Context context4 = this.context;
                if (!(context4 instanceof FragmentActivity)) {
                    context4 = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) context4;
                if (fragmentActivity != null) {
                    fragmentManager = fragmentActivity.getSupportFragmentManager();
                }
                khn4.showNow(fragmentManager, "LiveStickerComposerDialogV2");
            }
        } else {
            if (this.LJI == null) {
                KHM khm2 = new KHM(this.context, LiveEffectContextFactory.Type.DEFAULT);
                khm2.LJIIJJI = "live_take_page";
                this.LJI = khm2;
                Effect effect2 = this.LJIILIIL;
                if (effect2 != null && (khm = this.LJI) != null) {
                    khm.LJIIJ = effect2;
                }
                KHM khm3 = this.LJI;
                if (khm3 != null) {
                    khm3.LJIIIZ = c86661KCx;
                }
            }
            KHM khm4 = this.LJI;
            if (khm4 != null) {
                Intrinsics.checkNotNull(khm4);
                if (khm4.isShowing()) {
                    return;
                }
            }
            KHM khm5 = this.LJI;
            if (khm5 != null) {
                C116971W2r.LIZJ(khm5);
            }
        }
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("sticker");
    }

    public static final /* synthetic */ AbstractC9161b LIZ(PreviewStickerWidget previewStickerWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{previewStickerWidget}, null, LIZ, true, 25);
        if (proxy.isSupported) {
            return (AbstractC9161b) proxy.result;
        }
        AbstractC9161b<?> abstractC9161b = previewStickerWidget.f25998LJ;
        if (abstractC9161b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC9161b;
    }

    public final boolean LIZ(Effect effect) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{effect}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZ().isEffectDownloaded(effect);
    }

    public final boolean LIZ(List<Sticker> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (list != null && (!list.isEmpty())) {
            for (Sticker sticker : list) {
                List<String> types = sticker.getTypes();
                if (types != null && (!types.isEmpty())) {
                    return types.contains("TouchGes");
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livehostapi.business.depend.AbstractC5792i
    public final boolean LIZ(String str, Effect effect) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, effect}, this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str, effect);
        List<String> tags = effect.getTags();
        if (tags == null) {
            tags = new ArrayList<>();
        }
        if (!tags.contains("filtered_by_preview_live")) {
            return false;
        }
        ALogger.m15801d(LIZ(), C0002O.m25082C("sticker was filted, name:", effect.getName(), "  effectId:", effect.getEffectId(), "  unzipPath:", effect.getUnzipPath()));
        return true;
    }

    public final void LIZ(Sticker sticker, String str, int i) {
        if (PatchProxy.proxy(new Object[]{sticker, str, Integer.valueOf(i)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        Map hashMap = new HashMap();
        String valueOf = String.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        hashMap.put("impr_position", valueOf);
        if (str == null) {
            str = "";
        }
        hashMap.put("tab", str);
        String valueOf2 = String.valueOf(sticker.getId());
        Intrinsics.checkNotNullExpressionValue(valueOf2, "");
        hashMap.put("sticker_id", valueOf2);
        String valueOf3 = String.valueOf(sticker.isVideoUsedSticker() ? 1 : 0);
        Intrinsics.checkNotNullExpressionValue(valueOf3, "");
        hashMap.put("is_video_sticker", valueOf3);
        C4574547f LIZ2 = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZIZ("live_take");
        c8668v.LJFF("click");
        c8668v.LIZ("live_take_page");
        LIZ2.LIZ("live_sticker_show", hashMap, c8668v);
    }
}
