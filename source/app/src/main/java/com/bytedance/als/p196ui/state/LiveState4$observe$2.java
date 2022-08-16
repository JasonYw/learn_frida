package com.bytedance.als.p196ui.state;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function4;
import p003X.AbstractC4569445g;
import p003X.C107481STr;

/* renamed from: com.bytedance.als.ui.state.LiveState4$observe$2 */
/* loaded from: classes9.dex */
public final class LiveState4$observe$2 implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C107481STr LIZIZ;
    public final /* synthetic */ Function4 LIZJ;

    static {
        Covode.recordClassIndex(10094);
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
        C107481STr c107481STr = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], c107481STr, C107481STr.LIZ, false, 5).isSupported && c107481STr.LIZIZ.size() <= 0) {
            c107481STr.LIZJ.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }
}
