package com.bytedance.android.live.broadcastgame.api;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes5.dex */
public abstract class IAnchorGameWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(19008);
    }

    public abstract void LIZ();

    public abstract void LIZ(C3383p c3383p);

    public abstract void LIZ(String str, String str2, int i, boolean z, boolean z2);

    public abstract void LIZIZ();

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
