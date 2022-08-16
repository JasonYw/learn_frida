package com.bytedance.android.live.core.tetris.layer.core.delegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class DefaultViewLayerDelegate extends ViewLayerDelegate<AbstractC4092b> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23650);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate
    public final void LIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate
    public final void LIZIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate, com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
