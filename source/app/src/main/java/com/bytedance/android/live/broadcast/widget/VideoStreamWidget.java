package com.bytedance.android.live.broadcast.widget;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.AbstractC2928aq;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.config.LiveAnchorResolution;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C3QC;
import p003X.C3QD;
import p003X.C86404K3a;
import p003X.C86413K3j;
import p003X.C87308Kak;
import p003X.K06;
import p003X.K07;
import p003X.K41;
import p003X.K4D;
import p003X.K70;
import p003X.KCU;

/* loaded from: classes5.dex */
public final class VideoStreamWidget extends StreamWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public WidgetManager LIZIZ;
    public AbsAnchorResolutionMonitorWidget LIZJ;

    static {
        Covode.recordClassIndex(18855);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, p003X.K0D
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.LJFF();
        AbsAnchorResolutionMonitorWidget absAnchorResolutionMonitorWidget = this.LIZJ;
        if (absAnchorResolutionMonitorWidget != null) {
            absAnchorResolutionMonitorWidget.onUnload();
        }
    }

    @Override // p003X.AbstractC86398K2u
    public final void LJI() {
        AbsCaptureWidget LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported || this.LJII == null) {
            return;
        }
        KCU.LIZ(LiveMode.VIDEO, "video_widget_new", false, 4, (Object) null);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            LIZ2 = (AbsCaptureWidget) proxy.result;
        } else {
            LIZ2 = new C86404K3a().LIZ(this.LJIIJJI, this.LJIILJJIL, this.LJII, this.LJIIJ);
        }
        this.LJIIIZ = LIZ2;
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            absCaptureWidget.LIZLLL = new C86413K3j(this);
        }
        this.LIZIZ.load(2131186182, (Widget) this.LJIIIZ, true);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget
    public final K70 LIZ(K70 k70) {
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k70}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (K70) proxy.result;
        }
        C106862S5w.LIZ(k70);
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJII;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZIZ = c87308Kak.LIZIZ();
        if (LIZIZ != null && LIZIZ.intValue() == 0) {
            i = 2;
        }
        k70.LJIIJ(i);
        k70.LIZ(0);
        return k70;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget
    public final K07 LIZIZ(AbstractC5436a abstractC5436a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5436a}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (K07) proxy.result;
        }
        C106862S5w.LIZ(abstractC5436a);
        LiveMode liveMode = this.LJIILLIIL;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new K07(abstractC5436a, liveMode, dataCenter, this.LJIIZILJ, this.LIZJ, this);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, com.bytedance.android.live.broadcast.api.AbstractC2883g
    public final void LIZ(K41 k41) {
        if (PatchProxy.proxy(new Object[]{k41}, this, LIZ, false, 3).isSupported || !(this.LJIIIZ instanceof AbstractC3312ab)) {
            return;
        }
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            ((AbstractC3312ab) absCaptureWidget).LIZ(k41);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IVideoWidget");
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, com.bytedance.android.live.broadcast.api.AbstractC2883g
    public final void LIZ(K4D k4d) {
        if (PatchProxy.proxy(new Object[]{k4d}, this, LIZ, false, 4).isSupported || !(this.LJIIIZ instanceof AbstractC3312ab)) {
            return;
        }
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            ((AbstractC3312ab) absCaptureWidget).LIZ(k4d);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IVideoWidget");
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, p003X.K0D
    public final void LIZ(Room room) {
        AbstractC2928aq abstractC2928aq;
        if (PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        super.LIZ(room);
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            final VideoWidget2 videoWidget2 = (VideoWidget2) absCaptureWidget;
            if (!PatchProxy.proxy(new Object[]{room}, videoWidget2, VideoWidget2.f26007LJ, false, 6).isSupported) {
                videoWidget2.LJJIII = true;
                videoWidget2.LIZ(C5986ap.class);
                videoWidget2.LIZ(C3QD.class);
                videoWidget2.LIZ(C3QC.class);
                videoWidget2.dataCenter.put("data_sticker_message_manager", videoWidget2.LJIIJ);
                videoWidget2.LJIILLIIL = room;
                videoWidget2.LJJ = false;
                videoWidget2.dataCenter.observe("data_broadcast_pause_state", videoWidget2);
                if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
                    ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZ(videoWidget2.LJJIIJZLJL);
                }
                videoWidget2.m15854LJ();
                videoWidget2.LJII();
                videoWidget2.dataCenter.put("data_broadcast_preview_surface_view", new WeakReference(videoWidget2.LJIILIIL));
                videoWidget2.LJIL = C5923dp.LJIIJ.LIZ(videoWidget2.dataCenter, videoWidget2.LJIIJ()).LLILL().LIZIZ().subscribe(new Consumer(videoWidget2) { // from class: X.K3n
                    public static ChangeQuickRedirect LIZ;
                    public final VideoWidget2 LIZIZ;

                    static {
                        Covode.recordClassIndex(18945);
                    }

                    {
                        this.LIZIZ = videoWidget2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        this.LIZIZ.LIZ((Boolean) obj);
                    }
                });
                videoWidget2.LJI();
                videoWidget2.LJIIIIZZ();
                if (videoWidget2.LJJIIJ >= 0) {
                    videoWidget2.LIZ(videoWidget2.LJJIIJ);
                    videoWidget2.LJJIIJ = -1;
                }
                if (LiveConfigSettingKeys.LIVE_ANCHOR_FIX_UPLOAD_ORIGIN_FRAMES_ENABLE.getValue().booleanValue()) {
                    videoWidget2.LIZLLL();
                }
            }
            SettingKey<LiveAnchorResolution> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_CLARITY_DICT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().getLive_anchor_clarity_open()) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, StreamWidget.LIZLLL, false, 1);
                if (proxy.isSupported) {
                    abstractC2928aq = (AbstractC2928aq) proxy.result;
                } else {
                    abstractC2928aq = this.f26004LJ;
                    if (abstractC2928aq == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                AbstractC5436a abstractC5436a = this.LJII;
                Intrinsics.checkNotNull(abstractC5436a);
                this.LIZJ = abstractC2928aq.LIZ(abstractC5436a);
                this.LIZIZ.load(this.LIZJ);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.VideoWidget2");
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, com.bytedance.android.live.broadcast.api.AbstractC2883g, com.bytedance.android.live.room.AbstractC5478a
    public final void LIZ(FrameLayout frameLayout, FragmentManager fragmentManager) {
        if (PatchProxy.proxy(new Object[]{frameLayout, fragmentManager}, this, LIZ, false, 5).isSupported || !(this.LJIIIZ instanceof AbstractC3312ab)) {
            return;
        }
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            ((AbstractC3312ab) absCaptureWidget).LIZJ();
            AbsCaptureWidget absCaptureWidget2 = this.LJIIIZ;
            if (absCaptureWidget2 != null) {
                ((AbstractC3312ab) absCaptureWidget2).LIZ(frameLayout, fragmentManager);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IVideoWidget");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IVideoWidget");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamWidget(StreamUrlExtra streamUrlExtra, String str, LiveMode liveMode, K06 k06, WidgetManager widgetManager) {
        super(streamUrlExtra, str, liveMode, k06);
        C106862S5w.LIZ(streamUrlExtra, liveMode, k06, widgetManager);
        this.LIZIZ = widgetManager;
    }
}
