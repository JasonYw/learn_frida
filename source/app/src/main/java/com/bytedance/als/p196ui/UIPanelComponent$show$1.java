package com.bytedance.als.p196ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scene.navigation.C13991d;
import p003X.AbstractC105709Rjr;
import p003X.AbstractC4569445g;
import p003X.C84784Jb8;
import p003X.RO6;

/* renamed from: com.bytedance.als.ui.UIPanelComponent$show$1 */
/* loaded from: classes9.dex */
public final class UIPanelComponent$show$1 implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ RO6 LIZIZ;

    static {
        Covode.recordClassIndex(10079);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported && event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ.LJFF.mo29786getLifecycle().removeObserver(this);
        C13991d LIZIZ = C84784Jb8.LIZIZ(this.LIZIZ.LJFF);
        RO6 ro6 = this.LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], ro6, RO6.LIZ, false, 5);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = ro6.LIZJ.mo27335getValue();
        }
        LIZIZ.LIZIZ((AbstractC105709Rjr) mo27335getValue);
    }
}
