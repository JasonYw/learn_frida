package com.bytedance.android;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.scope.AbstractC9789e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import p003X.AbstractC4569445g;
import p003X.AbstractC89995Lcz;
import p003X.C2L1;

/* loaded from: classes5.dex */
public abstract class GiftRecyclableWidget extends LiveRecyclableWidget implements AbstractC89995Lcz, C2L1, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC9789e LIZIZ;

    static {
        Covode.recordClassIndex(10108);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // p003X.C2L1
    public Widget LIZ() {
        return this;
    }

    public final AbstractC9789e aV_() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC89995Lcz
    public final void LIZ(AbstractC9789e abstractC9789e) {
        this.LIZIZ = abstractC9789e;
    }
}
