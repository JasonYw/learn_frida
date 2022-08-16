package com.bytedance.android.live.broadcastgame.api;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public abstract class IAudienceGameWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIL;

    static {
        Covode.recordClassIndex(19009);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIL, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
