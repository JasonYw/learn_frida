package com.bytedance.android.live.broadcast.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C2902ak;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3259e;
import com.bytedance.android.live.broadcast.widget.PreviewSettingWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5993bc;
import com.bytedance.android.livesdk.chatroom.model.C6139e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C2OZ;
import p003X.C33A;
import p003X.C3808116l;
import p003X.C413602Yo;
import p003X.C422102n6;
import p003X.C436583Oy;
import p003X.C438033Un;
import p003X.C439993ar;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.KK6;
import p003X.LK1;
import p003X.LK5;
import p003X.LLY;

@AbstractC445813kF(LIZ = "SETTING")
/* loaded from: classes12.dex */
public final class PreviewSettingWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public boolean f25997LJ;
    public boolean LJFF;
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new PreviewSettingWidget$mDotView$2(this));
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(new PreviewSettingWidget$mTipsView$2(this));
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(new PreviewSettingWidget$mTipAnimation$2(this));
    public final Lazy LJIILJJIL = LIZ(C3259e.class);
    public final Lazy LJIILL = LazyKt__LazyJVMKt.lazy(new PreviewSettingWidget$mHideTipsRunnable$2(this));
    public final Lazy LJIILLIIL = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18661);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewSettingWidget.class, "previewBubbleContext", "getPreviewBubbleContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewBubbleContext;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewSettingWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    private final ValueAnimator LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (ValueAnimator) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    private final C3259e LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C3259e) (proxy.isSupported ? proxy.result : LIZ(this.LJIILJJIL, this, LIZIZ[0]));
    }

    private final Runnable LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (Runnable) (proxy.isSupported ? proxy.result : this.LJIILL.mo27335getValue());
    }

    public static String LJIJ() {
        return "SETTING";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewSettingWidget";
    }

    public final View LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (View) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final TextView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LJIILL() {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a118";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 29).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onDestroy();
        this.containerView.removeCallbacks(LJIIIZ());
    }

    private final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LJIIJJI().LIZ().LIZ() != LiveMode.MEDIA) {
            return false;
        }
        View LIZIZ2 = LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ2, "");
        LIZIZ2.setVisibility(8);
        return true;
    }

    /* renamed from: LJ */
    public final boolean m15862LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LLZL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZ2 = c87308Kak.LIZ();
        if (LIZ2 == null || LIZ2.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LJIILJJIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && LJIIZILJ()) {
            ViewGroup viewGroup = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            LK1.LIZJ(viewGroup);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698477;
        }
        return 2131698476;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        LJI();
        if (KK6.LIZ()) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7261l;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.FALSE);
        }
        super.onPause();
    }

    public PreviewSettingWidget() {
        LazyKt__LazyJVMKt.lazy(new PreviewSettingWidget$mIconView$2(this));
    }

    private final boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZLLIL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLZ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        c87308Kak.LIZ(c87308Kak2.LIZ());
        C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.LLLLZLL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
        Boolean LIZ2 = c87308Kak3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (!LIZ2.booleanValue()) {
            C87308Kak<Boolean> c87308Kak4 = AbstractC80293Hkt.LLLLZLLIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
            Boolean LIZ3 = c87308Kak4.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            if (!LIZ3.booleanValue() && !this.f25997LJ && !m15862LJ() && !C422102n6.LIZIZ()) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_BROADCAST_ROOM_INTRO_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (!value.booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        if (KK6.LIZ()) {
            TextView LIZJ = LIZJ();
            Intrinsics.checkNotNullExpressionValue(LIZJ, "");
            CharSequence text = LIZJ.getText();
            if (text != null) {
                LJIIJJI().LJIILIIL().LIZ(new C2902ak(LJIJ(), true, StringsKt__StringsJVMKt.replace$default(text.toString(), "\n", "", false, 4, (Object) null)));
            }
        } else {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7261l;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.FALSE);
            UIUtils.setViewVisibility(LIZJ(), 0);
            LJII().start();
        }
        LJIIIIZZ().LIZ().LIZ(2);
        this.containerView.postDelayed(LJIIIZ(), LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME);
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        if (KK6.LIZ()) {
            LJIIJJI().LJIILIIL().LIZ(new C2902ak(LJIJ(), false, null, 4));
            return;
        }
        UIUtils.setViewVisibility(LIZJ(), 8);
        if (LJII().isRunning()) {
            LJII().cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r0.booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r0.LIZ().getDot_preview_used() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZLLL() {
        /*
            r4 = this;
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.PreviewSettingWidget.LIZ
            r0 = 13
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            boolean r0 = r4.LJIIJ()
            if (r0 == 0) goto L17
            return
        L17:
            android.view.View r1 = r4.LIZIZ()
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            X.Kak<java.lang.Boolean> r0 = p003X.AbstractC80293Hkt.f7262m
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = r0.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3c
            boolean r0 = r4.LJFF
            if (r0 == 0) goto L3c
        L38:
            r1.setVisibility(r2)
            return
        L3c:
            X.Kak<java.lang.Boolean> r0 = p003X.AbstractC80293Hkt.f7265p
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = r0.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            boolean r0 = r4.f25997LJ
            if (r0 == 0) goto L58
            r0 = 1
            r4.LIZLLL = r0
            goto L38
        L58:
            boolean r0 = p003X.C422102n6.m24969LJ()
            if (r0 != 0) goto L38
            boolean r0 = r4.m15862LJ()
            if (r0 == 0) goto L79
            X.Kak<java.lang.Boolean> r0 = p003X.AbstractC80293Hkt.f7266q
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = r0.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L79
            goto L38
        L79:
            com.bytedance.android.live.core.setting.SettingKey<com.bytedance.android.livesdk.config.LiveAnchorResolution> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_ANCHOR_CLARITY_DICT
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.config.LiveAnchorResolution r0 = (com.bytedance.android.livesdk.config.LiveAnchorResolution) r0
            boolean r0 = r0.getLive_anchor_guide_clarity_open()
            if (r0 == 0) goto L9c
            X.Kak<com.bytedance.android.livesdk.config.LiveAnchorOneOffKeys> r0 = p003X.AbstractC80293Hkt.f7120cp
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = r0.LIZ()
            com.bytedance.android.livesdk.config.LiveAnchorOneOffKeys r0 = (com.bytedance.android.livesdk.config.LiveAnchorOneOffKeys) r0
            boolean r0 = r0.getDot_preview_used()
            if (r0 != 0) goto L9c
            goto L38
        L9c:
            r2 = 8
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewSettingWidget.LIZLLL():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Observable<C5176i<C6139e>> fetchAudioChatSwitch;
        Observable<C5176i<C6139e>> subscribeOn;
        Observable<C5176i<C6139e>> observeOn;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onCreate();
        LIZJ(new PreviewSettingWidget$onCreate$1(new PreviewSettingWidget$onCreate$tipClickListener$1(this)));
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C33A.LJIIJ().LIZIZ().LIZ(RoomRetrofitApi.class);
        if (roomRetrofitApi != null && (fetchAudioChatSwitch = roomRetrofitApi.fetchAudioChatSwitch(0L)) != null && (subscribeOn = fetchAudioChatSwitch.subscribeOn(Schedulers.m138io())) != null && (observeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread())) != null) {
            observeOn.subscribe(C438033Un.LIZIZ, C3808116l.LIZ);
        }
        LLY.LIZ(this.contentView, LK5.LIZ(2131587672));
        LIZ(C413602Yo.LIZ(LJIIJJI().LJI(), new PreviewSettingWidget$onCreate$4(this)));
        LIZIZ(C436583Oy.class);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_BROADCAST_ROOM_INTRO_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_NEW_DOU_PLUS_CAROUSEL_STYLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value2 = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            if (value2.booleanValue()) {
                LIZIZ(C5993bc.class);
            }
        }
    }

    private final <T> void LIZIZ(Class<T> cls) {
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 10).isSupported && (subscribe = C87010KQi.LIZ().LIZ((Class) cls).subscribe((Consumer<T>) new Consumer<T>() { // from class: X.3Ov
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18664);
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(T t) {
                if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (t instanceof C436583Oy) {
                    PreviewSettingWidget previewSettingWidget = PreviewSettingWidget.this;
                    if (t != null) {
                        previewSettingWidget.onEvent((C436583Oy) t);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.model.StartLiveItemDotEvent");
                } else if (t instanceof C5993bc) {
                    PreviewSettingWidget previewSettingWidget2 = PreviewSettingWidget.this;
                    if (t != null) {
                        previewSettingWidget2.onEvent((C5993bc) t);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.event.OpenPanelEvent");
                }
            }
        })) != null) {
            LIZ(subscribe);
        }
    }

    public final void onEvent(C436583Oy c436583Oy) {
        if (PatchProxy.proxy(new Object[]{c436583Oy}, this, LIZ, false, 11).isSupported || LJIIJ() || !StringUtils.equal(c436583Oy.LIZ, LJIJ())) {
            return;
        }
        View LIZIZ2 = LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ2, "");
        LIZIZ2.setVisibility(0);
    }

    public final boolean LIZIZ(LiveMode liveMode) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C422102n6.LIZ(liveMode);
        if (isViewValid() && liveMode != null) {
            int i = C2OZ.LIZ[liveMode.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LJIIZILJ();
                        }
                    } else {
                        LJI();
                        return LJIIZILJ();
                    }
                } else {
                    LJI();
                    return LJIIZILJ();
                }
            } else {
                return LJIIZILJ();
            }
        }
        return false;
    }

    public final void onEvent(C5993bc c5993bc) {
        Object LIZ2;
        long j;
        Long l;
        if (PatchProxy.proxy(new Object[]{c5993bc}, this, LIZ, false, 12).isSupported) {
            return;
        }
        LiveMode LIZ3 = LJIIJJI().LIZ().LIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            LIZ2 = proxy.result;
        } else {
            LIZ2 = LIZ(this.LJIILLIIL, this, LIZIZ[1]);
        }
        CategoryNode LIZ4 = ((C3199v) LIZ2).LJIILL().LIZ();
        if (LIZ4 != null && (l = LIZ4.categoryId) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (c5993bc.LIZ == 4) {
            ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).openRoomIntroDialog(C439993ar.LIZIZ(this.context), null, LIZ3, Long.valueOf(j));
        }
    }
}
