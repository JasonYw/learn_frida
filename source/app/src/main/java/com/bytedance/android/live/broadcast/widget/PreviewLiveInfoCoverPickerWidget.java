package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes5.dex */
public final class PreviewLiveInfoCoverPickerWidget extends PreviewCoverPickerWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIL;
    public final int LJIILIIL = 14;
    public final int LJIILJJIL = 14;

    static {
        Covode.recordClassIndex(18549);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698454;
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget, com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIL, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget
    /* renamed from: LJ */
    public final int mo15868LJ() {
        return this.LJIILIIL;
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget
    public final int LJFF() {
        return this.LJIILJJIL;
    }
}
