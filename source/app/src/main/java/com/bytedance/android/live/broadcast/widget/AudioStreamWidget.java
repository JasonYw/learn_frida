package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.AbstractC2865ak;
import com.bytedance.android.live.broadcast.AbstractC2866al;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
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
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C86404K3a;
import p003X.C86412K3i;
import p003X.HSB;
import p003X.K06;
import p003X.K70;
import p003X.K7C;

/* loaded from: classes5.dex */
public final class AudioStreamWidget extends StreamWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2865ak LIZIZ;
    public WidgetManager LIZJ;
    public AbstractC2866al LJIJ;

    static {
        Covode.recordClassIndex(18301);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, p003X.K10
    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (this.LJIIIZ instanceof AbstractC3322w)) {
            AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
            if (absCaptureWidget != null) {
                ((AbstractC3322w) absCaptureWidget).LIZ();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IAudioWidget");
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        DataCenter dataCenter = this.dataCenter;
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        dataCenter.put("data_room", ((ILiveRoomService) service).getCurrentRoom());
    }

    @Override // p003X.AbstractC86398K2u
    public final void LJI() {
        AbsCaptureWidget LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported || this.LJII == null) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            LIZ2 = (AbsCaptureWidget) proxy.result;
        } else {
            LIZ2 = new C86404K3a().LIZ(this.LJIIJJI, this.LJII);
        }
        this.LJIIIZ = LIZ2;
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            absCaptureWidget.LIZLLL = new C86412K3i(this);
        }
        WidgetManager widgetManager = this.LIZJ;
        AbsCaptureWidget absCaptureWidget2 = this.LJIIIZ;
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_START_LIVE_CHAIN_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        widgetManager.load(2131186182, absCaptureWidget2, !settingKey.getValue().booleanValue());
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget
    public final void LIZ(AbstractC5436a abstractC5436a) {
        if (PatchProxy.proxy(new Object[]{abstractC5436a}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5436a);
        abstractC5436a.LJIIJ().enable(false);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget
    public final K70 LIZ(K70 k70) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k70}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (K70) proxy.result;
        }
        C106862S5w.LIZ(k70);
        k70.LJI(true);
        k70.LIZ(1);
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
        int i = 5;
        if (currentRoom != null && currentRoom.linkInitResult != null && currentRoom.linkMicScene == 10) {
            i = 4;
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_CORE_USE_ADAPTED_RESOLUTION_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            k70.LJIIL(value.booleanValue());
        }
        k70.LJIIJ(i);
        return k70;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, p003X.K10
    public final void LIZ(HSB hsb) {
        if (PatchProxy.proxy(new Object[]{hsb}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(hsb);
        if (this.LJIIIZ instanceof AbstractC3322w) {
            AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
            if (absCaptureWidget != null) {
                ((AbstractC3322w) absCaptureWidget).LIZ(hsb);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IAudioWidget");
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, p003X.K10
    public final void LIZ(K7C k7c) {
        if (PatchProxy.proxy(new Object[]{k7c}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(k7c);
        if (this.LJIIIZ instanceof AbstractC3322w) {
            AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
            if (absCaptureWidget != null) {
                ((AbstractC3322w) absCaptureWidget).LIZ(k7c);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.widget.IAudioWidget");
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.StreamWidget, p003X.K0D
    public final void LIZ(Room room) {
        Widget widget;
        if (PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        super.LIZ(room);
        AbstractC2865ak abstractC2865ak = this.LIZIZ;
        if (abstractC2865ak != null) {
            this.LJIJ = abstractC2865ak.LIZ(room);
            WidgetManager widgetManager = this.LIZJ;
            AbstractC2866al abstractC2866al = this.LJIJ;
            if (abstractC2866al != null) {
                widget = abstractC2866al.LIZIZ();
            } else {
                widget = null;
            }
            widgetManager.load(widget);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioStreamWidget(StreamUrlExtra streamUrlExtra, String str, LiveMode liveMode, K06 k06, WidgetManager widgetManager) {
        super(streamUrlExtra, str, liveMode, k06);
        C106862S5w.LIZ(streamUrlExtra, liveMode, k06, widgetManager);
        this.LIZJ = widgetManager;
    }
}
