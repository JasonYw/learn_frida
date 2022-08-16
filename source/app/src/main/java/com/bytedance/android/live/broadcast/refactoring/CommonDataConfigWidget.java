package com.bytedance.android.live.broadcast.refactoring;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C4574547f;

/* loaded from: classes12.dex */
public class CommonDataConfigWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Room LIZIZ;

    static {
        Covode.recordClassIndex(17707);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public CommonDataConfigWidget() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            AbstractC80293Hkt.f7107cc.LIZ(Long.valueOf(System.currentTimeMillis()));
            C4574547f.LIZ().LIZ(C8668v.class).LIZ("event_page", "live_take_detail");
        }
    }
}
