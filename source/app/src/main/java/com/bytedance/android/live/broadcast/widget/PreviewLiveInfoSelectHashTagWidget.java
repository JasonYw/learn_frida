package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewLiveInfoSelectHashTagWidget extends PreviewSelectHashTagWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18562);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget, com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLiveInfoSelectHashTagWidget";
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget
    public final void LIZIZ() {
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698457;
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        if (LJIILIIL() != 0) {
            LJIILJJIL();
        }
    }
}
