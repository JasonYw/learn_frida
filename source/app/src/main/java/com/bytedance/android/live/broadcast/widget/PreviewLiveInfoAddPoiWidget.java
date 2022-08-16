package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public final class PreviewLiveInfoAddPoiWidget extends PreviewAddPoiWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZLLL;

    static {
        Covode.recordClassIndex(18548);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewAddPoiWidget, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698459;
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewAddPoiWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZLLL, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewAddPoiWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        if (LJIILIIL() != 0) {
            LJIILJJIL();
        }
    }
}
