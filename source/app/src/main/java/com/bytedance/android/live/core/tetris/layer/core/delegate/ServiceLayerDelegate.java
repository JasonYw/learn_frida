package com.bytedance.android.live.core.tetris.layer.core.delegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.C4095b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public abstract class ServiceLayerDelegate<C extends AbstractC4092b> extends LayerDelegate<C4095b, C> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;

    static {
        Covode.recordClassIndex(23652);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
