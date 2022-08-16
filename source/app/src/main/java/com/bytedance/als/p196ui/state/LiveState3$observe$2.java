package com.bytedance.als.p196ui.state;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function3;
import p003X.AbstractC4569445g;
import p003X.CAX;

/* renamed from: com.bytedance.als.ui.state.LiveState3$observe$2 */
/* loaded from: classes27.dex */
public final class LiveState3$observe$2 implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ CAX LIZIZ;
    public final /* synthetic */ Function3 LIZJ;

    static {
        Covode.recordClassIndex(10093);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported && event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ.LIZIZ.remove(this.LIZJ);
        CAX cax = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], cax, CAX.LIZ, false, 7).isSupported && cax.LIZIZ.size() <= 0) {
            cax.LIZJ.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }
}
