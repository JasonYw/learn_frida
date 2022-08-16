package com.bytedance.android.live.core.utils.rxutils.autodispose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.utils.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import p003X.AbstractC148059fT3;
import p003X.AbstractC148075fTJ;
import p003X.C148055fSz;
import p003X.C148057fT1;

/* renamed from: com.bytedance.android.live.core.utils.rxutils.autodispose.a */
/* loaded from: classes20.dex */
public final class C4154a implements AbstractC148059fT3<Lifecycle.Event> {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC148075fTJ<Lifecycle.Event> LIZIZ;
    public final LifecycleEventsObservable LIZJ;

    static {
        Covode.recordClassIndex(23999);
    }

    @Override // p003X.AbstractC148059fT3
    public final Observable<Lifecycle.Event> LIZ() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC148059fT3
    public final AbstractC148075fTJ<Lifecycle.Event> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.live.core.utils.rxutils.autodispose.AbstractC4155aa
    public final CompletableSource LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (CompletableSource) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this}, null, C148057fT1.LIZ, true, 1);
        if (proxy2.isSupported) {
            return (CompletableSource) proxy2.result;
        }
        return C148057fT1.LIZ(this, true);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, androidx.lifecycle.Lifecycle$Event] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, androidx.lifecycle.Lifecycle$Event] */
    @Override // p003X.AbstractC148059fT3
    public final /* synthetic */ Lifecycle.Event LIZLLL() {
        Lifecycle.Event event;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        LifecycleEventsObservable lifecycleEventsObservable = this.LIZJ;
        if (!PatchProxy.proxy(new Object[0], lifecycleEventsObservable, LifecycleEventsObservable.LIZ, false, 2).isSupported) {
            int i = LifecycleEventsObservable.C41531.LIZ[lifecycleEventsObservable.LIZIZ.getCurrentState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        event = Lifecycle.Event.ON_DESTROY;
                    } else {
                        event = Lifecycle.Event.ON_RESUME;
                    }
                } else {
                    event = Lifecycle.Event.ON_START;
                }
            } else {
                event = Lifecycle.Event.ON_CREATE;
            }
            lifecycleEventsObservable.LIZJ.onNext(event);
        }
        LifecycleEventsObservable lifecycleEventsObservable2 = this.LIZJ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], lifecycleEventsObservable2, LifecycleEventsObservable.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return lifecycleEventsObservable2.LIZJ.getValue();
    }

    public C4154a(Lifecycle lifecycle, AbstractC148075fTJ<Lifecycle.Event> abstractC148075fTJ) {
        this.LIZJ = new LifecycleEventsObservable(lifecycle);
        this.LIZIZ = abstractC148075fTJ;
    }

    public static C4154a LIZ(Lifecycle lifecycle, AbstractC148075fTJ<Lifecycle.Event> abstractC148075fTJ) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{lifecycle, abstractC148075fTJ}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return (C4154a) proxy.result;
        }
        return new C4154a(lifecycle, abstractC148075fTJ);
    }

    public static C4154a LIZ(Lifecycle lifecycle, Lifecycle.Event event) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{lifecycle, event}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (C4154a) proxy.result;
        }
        return LIZ(lifecycle, new C148055fSz(event));
    }

    public static C4154a LIZ(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{lifecycleOwner, event}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (C4154a) proxy.result;
        }
        return LIZ(lifecycleOwner.mo29786getLifecycle(), event);
    }
}
