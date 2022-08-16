package com.bytedance.android.live.broadcast.widget;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.AbstractC2868an;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.C5993bc;
import com.bytedance.android.livesdk.config.C7020o;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86668KDe;
import p003X.C422702o4;
import p003X.C80362Hm0;
import p003X.C86656KCs;
import p003X.C86676KDm;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.DialogInterface$OnDismissListenerC86655KCr;
import p003X.KB2;
import p003X.KK6;
import p003X.LK5;
import p003X.RunnableC437953Uf;

@AbstractC445813kF(LIZ = "BEAUTY")
/* loaded from: classes5.dex */
public final class PreviewBeautyWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public EffectLivePreviewActivityProxy LIZJ;
    public AbstractC2868an LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25980LJ = LIZ(C3181o.class);

    static {
        Covode.recordClassIndex(18436);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewBeautyWidget.class, "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewBeautyWidget";
    }

    public final C3181o LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3181o) (proxy.isSupported ? proxy.result : LIZ(this.f25980LJ, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a142";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131700799;
        }
        return 2131700800;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported || !C422702o4.LIZ()) {
            return;
        }
        if (!NetworkUtils.isNetworkAvailable(LK5.LJIIJ())) {
            C88440Kt0.LIZ(2131587784);
            return;
        }
        LIZIZ().LJFF().postValue(2);
        EffectLivePreviewActivityProxy effectLivePreviewActivityProxy = this.LIZJ;
        if (effectLivePreviewActivityProxy != null) {
            effectLivePreviewActivityProxy.LIZ(new DialogInterface$OnDismissListenerC86655KCr(this), KB2.LIZ(LJIIJJI().LIZ().LIZ()));
        }
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("beauty");
        ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).justReportRoomEvent(9, 0L, 11, "");
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Integer LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LJJJLZIJ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(Boolean.FALSE);
        C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LJJJZ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        c87308Kak2.LIZ(Boolean.FALSE);
        C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.LJJL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
        c87308Kak3.LIZ(Boolean.FALSE);
        LIZJ(new PreviewBeautyWidget$onCreate$1(this));
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ANCHOR_ENABLE_OWN_STICKER_PANEL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            C3180k LJIIJJI = LJIIJJI();
            Sticker LIZ3 = LJIIJJI.LIZLLL().LIZ();
            if (LIZ3 != null) {
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.LIZLLL);
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(C86676KDm.LIZLLL, LIZ3);
            }
            LJIIJJI.LIZLLL().LIZIZ().subscribe(C80362Hm0.LIZIZ);
        }
        SettingKey<C7020o> settingKey2 = LiveSettingKeys.LIVE_COMMODITY_NO_FILTER_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        if (Intrinsics.areEqual(settingKey2.getValue().LIZ, Boolean.TRUE) && (LIZ2 = AbstractC86668KDe.LJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT)) != null && LIZ2.intValue() == 2) {
            AbstractC86668KDe.LJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT, 3);
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.postDelayed(new RunnableC437953Uf(this), 2000L);
            }
        }
        LJIIL().add(C87010KQi.LIZ().LIZ(C5993bc.class).subscribe(new Consumer<C5993bc>() { // from class: X.3pB
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18441);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5993bc c5993bc) {
                C5993bc c5993bc2 = c5993bc;
                if (!PatchProxy.proxy(new Object[]{c5993bc2}, this, LIZ, false, 1).isSupported && c5993bc2.LIZ == 0) {
                    PreviewBeautyWidget.this.LIZJ();
                }
            }
        }));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        Sticker LIZ2;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (liveMode != null && C86656KCs.LIZ[liveMode.ordinal()] == 1) {
            C3180k LJIIJJI = LJIIJJI();
            if (LJIIJJI != null && (LIZ2 = LJIIJJI.LIZLLL().LIZ()) != null) {
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.LIZLLL);
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(C86676KDm.LIZLLL, LIZ2);
                return;
            }
            return;
        }
        C3180k LJIIJJI2 = LJIIJJI();
        if (LJIIJJI2 != null && LJIIJJI2.LIZLLL().LIZ() != null) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.LIZLLL);
        }
    }
}
