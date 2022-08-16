package com.bytedance.android.live.broadcast.preview.base;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes3.dex */
public abstract class AbsStartLiveWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIL;

    static {
        Covode.recordClassIndex(17221);
    }

    public abstract void LIZIZ();

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIL, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
