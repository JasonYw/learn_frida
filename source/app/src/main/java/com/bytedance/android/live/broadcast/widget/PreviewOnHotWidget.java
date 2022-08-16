package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewOnHotWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.KK6;

@AbstractC445813kF(LIZ = "DOU_PLUS")
/* loaded from: classes12.dex */
public final class PreviewOnHotWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18619);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewOnHotWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        LJIILJJIL();
        this.containerView.setOnClickListener(new View.OnClickListener() { // from class: X.2MX
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18620);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long j;
                C3VF user;
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                ServiceManager.getService(M39.class);
                ServiceManager.getService(M39.class);
                PreviewOnHotWidget.this.getContext();
                if (!PatchProxy.proxy(new Object[0], PreviewOnHotWidget.this, PreviewOnHotWidget.LIZ, false, 3).isSupported) {
                    IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                    if (iUserService != null && (user = iUserService.user()) != null) {
                        j = user.LIZIZ();
                    } else {
                        j = 0;
                    }
                    C4574547f.LIZ().LIZ("livesdk_anchor_douplus_click", MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", String.valueOf(j)), TuplesKt.m137to("event_page", "live_take_page")), new Object[0]);
                }
            }
        });
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131700843;
        }
        return 2131700842;
    }
}
