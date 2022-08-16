package com.bytedance.als.support.coroutine;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt__JobKt;
import p003X.AbstractC525926qA;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC525926qA implements LifecycleEventObserver {
    public static ChangeQuickRedirect LIZ;
    public final Lifecycle LIZIZ;
    public final CoroutineContext LIZJ;

    static {
        Covode.recordClassIndex(10072);
    }

    private Lifecycle LIZ() {
        return this.LIZIZ;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.LIZJ;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(lifecycleOwner, event);
        if (LIZ().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            LIZ().removeObserver(this);
            JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }
}
