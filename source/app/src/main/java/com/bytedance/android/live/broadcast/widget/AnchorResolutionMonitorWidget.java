package com.bytedance.android.live.broadcast.widget;

import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.config.LiveAnchorResolution;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C86562K9c;
import p003X.HandlerC86563K9d;

/* loaded from: classes5.dex */
public final class AnchorResolutionMonitorWidget extends AbsAnchorResolutionMonitorWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public boolean LIZJ;
    public Room LIZLLL;
    public final AbstractC5436a LJFF;
    public final long LJI;
    public float LJII;

    /* renamed from: LJ */
    public LiveMode f25965LJ = LiveMode.VIDEO;
    public final HandlerC86563K9d LJIIIIZZ = new HandlerC86563K9d(this, Looper.getMainLooper());

    static {
        Covode.recordClassIndex(18295);
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        this.LIZJ = false;
        this.LJIIIIZZ.removeMessages(100042);
    }

    public final boolean LIZ() {
        Boolean bool;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Iterator<T> it = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ().values().iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map != null) {
                Collection<Sticker> values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    for (Sticker sticker : values) {
                        String sdkExtra = sticker.getSdkExtra();
                        if (sdkExtra != null) {
                            try {
                                JSONObject optJSONObject = new JSONObject(sdkExtra).optJSONObject("settings");
                                if (optJSONObject != null) {
                                    bool = Boolean.valueOf(optJSONObject.optBoolean("isCloudEffect", false));
                                } else {
                                    bool = null;
                                }
                                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                                    return true;
                                }
                            } catch (Exception unused) {
                                continue;
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget
    public final void LIZ(float f) {
        this.LJII = f;
    }

    public AnchorResolutionMonitorWidget(AbstractC5436a abstractC5436a) {
        C106862S5w.LIZ(abstractC5436a);
        this.LJFF = abstractC5436a;
        SettingKey<LiveAnchorResolution> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_CLARITY_DICT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJI = settingKey.getValue().getLive_anchor_clarity_frozen_duration() * 1000;
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget
    public final void LIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 5).isSupported && i == 3 && !this.LJIIIIZZ.hasMessages(100042)) {
            AnchorVideoResolutionManager anchorVideoResolutionManager = AnchorVideoResolutionManager.LJIIIZ;
            anchorVideoResolutionManager.m15916LJ("onNetworkStatus : " + i + " , add caton message");
            Message obtain = Message.obtain(this.LJIIIIZZ, 100042);
            Intrinsics.checkNotNullExpressionValue(obtain, "");
            obtain.getData().putFloat("band_width", this.LJII);
            this.LJIIIIZZ.sendMessageDelayed(obtain, this.LJI);
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.AbsAnchorResolutionMonitorWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        ALogger.m15801d("anchor_resolution", "load AnchorResolutionMonitorWidget");
        this.LIZJ = true;
        this.LIZLLL = (Room) this.dataCenter.get("data_room");
        Object obj = this.dataCenter.get("data_live_mode", (String) LiveMode.VIDEO);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.f25965LJ = (LiveMode) obj;
        AnchorVideoResolutionManager.LJI.observe(this, new C86562K9c(this));
    }
}
