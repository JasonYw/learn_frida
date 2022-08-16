package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdkapi.util.url.UrlBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C413602Yo;
import p003X.KKR;

@AbstractC445813kF(LIZ = "ACTIVITY_ZONE")
/* loaded from: classes5.dex */
public final class PreviewActivityZoneWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18395);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698423;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "PreviewActivityCenterWidget[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        LIZ(C413602Yo.LIZ(LJIIJJI().LIZIZ(), new PreviewActivityZoneWidget$onCreate$1(this)));
        LIZJ(new PreviewActivityZoneWidget$onCreate$2(this));
    }

    public final void LIZIZ() {
        RoomCreateInfo LIZ2;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (LIZ2 = LJIIJJI().LIZIZ().LIZ()) != null) {
            KKR kkr = LIZ2.LJJIIJZLJL;
            if (kkr != null) {
                str = kkr.LIZJ;
                if (str != null && StringsKt__StringsJVMKt.isBlank(str)) {
                    str = "sslocal://webcast_webview?url=https%3a%2f%2fwebcast.amemv.com%2ffalcon%2fwebcast_douyin%2fpage%2fanchor_center_banner%2findex.html%3fenter_from%3dlive_takepage&pull_down_close=1&show_back=1&width_percent=100&height_percent=50&pull_down_indicator_color=white&type=popup&gravity=bottom&height=400&radius=8&hide_more=0&hide_nav_bar=0&hide_status_bar=0";
                }
            } else {
                str = null;
            }
            Uri parse = Uri.parse(new UrlBuilder(str).build());
            ILiveActionHandler iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
            if (iLiveActionHandler != null) {
                iLiveActionHandler.handle(this.context, parse);
            }
        }
    }
}
