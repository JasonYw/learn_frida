package com.bytedance.android.live.core.utils.rxutils.autodispose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.subjects.BehaviorSubject;
import p003X.C148052fSw;

/* loaded from: classes20.dex */
public final class LifecycleEventsObservable extends Observable<Lifecycle.Event> {
    public static ChangeQuickRedirect LIZ;
    public final Lifecycle LIZIZ;
    public final BehaviorSubject<Lifecycle.Event> LIZJ = BehaviorSubject.create();

    static {
        Covode.recordClassIndex(23995);
    }

    /* loaded from: classes20.dex */
    public static final class ArchLifecycleObserver extends MainThreadDisposable implements LifecycleObserver {
        public static ChangeQuickRedirect LIZ;
        public final Lifecycle LIZIZ;
        public final Observer<? super Lifecycle.Event> LIZJ;
        public final BehaviorSubject<Lifecycle.Event> LIZLLL;

        static {
            Covode.recordClassIndex(23997);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public final void LIZ() {
            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                return;
            }
            this.LIZIZ.removeObserver(this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public final void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported && !isDisposed()) {
                if (event != Lifecycle.Event.ON_CREATE || this.LIZLLL.getValue() != event) {
                    this.LIZLLL.onNext(event);
                }
                this.LIZJ.onNext(event);
            }
        }

        public ArchLifecycleObserver(Lifecycle lifecycle, Observer<? super Lifecycle.Event> observer, BehaviorSubject<Lifecycle.Event> behaviorSubject) {
            this.LIZIZ = lifecycle;
            this.LIZJ = observer;
            this.LIZLLL = behaviorSubject;
        }
    }

    /* renamed from: com.bytedance.android.live.core.utils.rxutils.autodispose.LifecycleEventsObservable$1 */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class C41531 {
        public static final /* synthetic */ int[] LIZ = new int[Lifecycle.State.values().length];

        static {
            Covode.recordClassIndex(23996);
            try {
                LIZ[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[Lifecycle.State.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[Lifecycle.State.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[Lifecycle.State.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LIZ[Lifecycle.State.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LifecycleEventsObservable(Lifecycle lifecycle) {
        this.LIZIZ = lifecycle;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(Observer<? super Lifecycle.Event> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, LIZ, false, 3).isSupported) {
            return;
        }
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.LIZIZ, observer, this.LIZJ);
        observer.onSubscribe(archLifecycleObserver);
        if (!C148052fSw.LIZ()) {
            observer.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.LIZIZ.addObserver(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.LIZIZ.removeObserver(archLifecycleObserver);
        }
    }
}
