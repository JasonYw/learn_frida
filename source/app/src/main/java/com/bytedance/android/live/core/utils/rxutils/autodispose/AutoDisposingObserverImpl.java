package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p003X.C537207Jy;
import p003X.C7H2;
import p003X.C7HC;
import p003X.C7L6;
import p003X.C7L7;

/* loaded from: classes23.dex */
public final class AutoDisposingObserverImpl<T> extends AtomicInteger implements C7L6<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Observer<? super T> delegate;
    public final CompletableSource scope;
    public final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
    public final AtomicReference<Disposable> scopeDisposable = new AtomicReference<>();
    public final AtomicThrowable error = new AtomicThrowable();

    static {
        Covode.recordClassIndex(23988);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        AutoDisposableHelper.LIZ(this.scopeDisposable);
        AutoDisposableHelper.LIZ(this.mainDisposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.mainDisposable.get() != AutoDisposableHelper.DISPOSED) {
            return false;
        }
        return true;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported && !isDisposed()) {
            this.mainDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.LIZ(this.scopeDisposable);
            Observer<? super T> observer = this.delegate;
            AtomicThrowable atomicThrowable = this.error;
            if (!PatchProxy.proxy(new Object[]{observer, this, atomicThrowable}, null, C7L7.LIZ, true, 6).isSupported && getAndIncrement() == 0) {
                Throwable LIZ = atomicThrowable.LIZ();
                if (LIZ != null) {
                    observer.onError(LIZ);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C7H2 c7h2 = new C7H2() { // from class: com.bytedance.android.live.core.utils.rxutils.autodispose.AutoDisposingObserverImpl.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(23989);
            }

            @Override // io.reactivex.AbstractC34963b
            public final void onComplete() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                    return;
                }
                AutoDisposingObserverImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.LIZ(AutoDisposingObserverImpl.this.mainDisposable);
            }

            @Override // io.reactivex.AbstractC34963b
            public final void onError(Throwable th) {
                if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                AutoDisposingObserverImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingObserverImpl.this.onError(th);
            }
        };
        if (C7HC.LIZ(this.scopeDisposable, c7h2, getClass())) {
            this.delegate.onSubscribe(this);
            this.scope.subscribe(c7h2);
            C7HC.LIZ(this.mainDisposable, disposable, getClass());
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 5).isSupported && !isDisposed()) {
            this.mainDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.LIZ(this.scopeDisposable);
            Observer<? super T> observer = this.delegate;
            AtomicThrowable atomicThrowable = this.error;
            if (!PatchProxy.proxy(new Object[]{observer, th, this, atomicThrowable}, null, C7L7.LIZ, true, 5).isSupported) {
                if (atomicThrowable.LIZ(th)) {
                    if (getAndIncrement() == 0) {
                        observer.onError(atomicThrowable.LIZ());
                        return;
                    }
                    return;
                }
                C537207Jy.LIZ(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (!PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 4).isSupported && !isDisposed()) {
            Observer<? super T> observer = this.delegate;
            AtomicThrowable atomicThrowable = this.error;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{observer, t, this, atomicThrowable}, null, C7L7.LIZ, true, 4);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (get() != 0 || !compareAndSet(0, 1)) {
                return;
            } else {
                observer.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
                Throwable LIZ = atomicThrowable.LIZ();
                if (LIZ != null) {
                    observer.onError(LIZ);
                } else {
                    observer.onComplete();
                }
            }
            this.mainDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.LIZ(this.scopeDisposable);
        }
    }

    public AutoDisposingObserverImpl(CompletableSource completableSource, Observer<? super T> observer) {
        this.scope = completableSource;
        this.delegate = observer;
    }
}
