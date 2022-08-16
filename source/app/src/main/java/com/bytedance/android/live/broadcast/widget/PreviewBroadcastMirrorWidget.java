package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3259e;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.android.livesdk.config.C6928dj;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C116971W2r;
import p003X.C3VF;
import p003X.C440943cO;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.C91211Lwb;
import p003X.K63;
import p003X.KCQ;
import p003X.KSV;

@AbstractC445813kF(LIZ = "BROADCAST_MIRROR")
/* loaded from: classes5.dex */
public final class PreviewBroadcastMirrorWidget extends AbsPreviewWidget implements KSV, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18446);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewBroadcastMirrorWidget.class, "previewBubbleContext", "getPreviewBubbleContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewBubbleContext;", 0);
        Reflection.property1(propertyReference1Impl);
        new KProperty[1][0] = propertyReference1Impl;
    }

    public static String LIZLLL() {
        return "BROADCAST_MIRROR";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewBroadcastMirrorWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698466;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreviewBroadcastMirrorWidget() {
        LIZ(C3259e.class);
    }

    @Override // p003X.KSV
    public final void LIZJ() {
        ILiveActionHandler iLiveActionHandler;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)) != null) {
            Context context = this.context;
            SettingKey<C6928dj> settingKey = LiveConfigSettingKeys.BROADCAST_MIRROR_GUIDE_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            iLiveActionHandler.handle(context, settingKey.getValue().LIZ);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.BROADCAST_MIRROR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            LJIILJJIL();
        } else {
            LJIILL();
        }
        LIZJ(new PreviewBroadcastMirrorWidget$onCreate$1(this));
    }

    @Override // p003X.KSV
    public final void LIZIZ() {
        C3VF user;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], K63.LJIIL, K63.LIZ, false, 1).isSupported) {
            K63.LIZIZ = -1.0f;
            K63.LIZJ = 0L;
            K63.LIZLLL = 0L;
            K63.f8318LJ = 0L;
            K63.LJFF = 0L;
            K63.LJI = 0L;
            K63.LJII = 0L;
            K63.LJIIIIZZ = 0L;
            K63.LJIIIZ = 0L;
            K63.LJIIJJI = false;
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                long LIZIZ = user.LIZIZ();
                JSONObject jSONObject = new JSONObject();
                C440943cO.LIZ(jSONObject, "uid", LIZIZ);
                K63.LIZJ = SystemClock.uptimeMillis();
                C91211Lwb.LIZ("ttlive_anchor_mirror_track", 10, jSONObject);
            }
        }
        C116971W2r.LIZ(this.context, new Intent(this.context, ((IHostApp) ServiceManager.getService(IHostApp.class)).getHostActivity(23)));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (!PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 6).isSupported && liveMode == LiveMode.SCREEN_RECORD) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.BROADCAST_MIRROR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                int i = Build.VERSION.SDK_INT;
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7267r;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ2 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.booleanValue()) {
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
                        this.containerView.postDelayed(new KCQ(this), 100L);
                    }
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7267r;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.FALSE);
                }
                C4574547f.LIZ().LIZ("livesdk_cast_screen_icon_show");
            }
        }
    }
}
