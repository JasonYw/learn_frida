package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p3070a.AbstractC35210c;
import org.p3070a.AbstractC35211d;
import p003X.C537207Jy;
import p003X.C7H2;
import p003X.C7HC;
import p003X.C7HD;
import p003X.C7L2;
import p003X.C7L4;
import p003X.C7L7;

/* loaded from: classes23.dex */
public final class AutoDisposingSubscriberImpl<T> extends AtomicInteger implements C7L4<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC35210c<? super T> delegate;
    public final CompletableSource scope;
    public final AtomicReference<AbstractC35211d> mainSubscription = new AtomicReference<>();
    public final AtomicReference<Disposable> scopeDisposable = new AtomicReference<>();
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicReference<AbstractC35211d> ref = new AtomicReference<>();
    public final AtomicLong requested = new AtomicLong();

    static {
        Covode.recordClassIndex(23990);
    }

    @Override // org.p3070a.AbstractC35211d
    public final void cancel() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        AutoDisposableHelper.LIZ(this.scopeDisposable);
        AutoSubscriptionHelper.LIZ(this.mainSubscription);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.mainSubscription.get() != AutoSubscriptionHelper.CANCELLED) {
            return false;
        }
        return true;
    }

    @Override // org.p3070a.AbstractC35210c
    public final void onComplete() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported && !isDisposed()) {
            this.mainSubscription.lazySet(AutoSubscriptionHelper.CANCELLED);
            AutoDisposableHelper.LIZ(this.scopeDisposable);
            AbstractC35210c<? super T> abstractC35210c = this.delegate;
            AtomicThrowable atomicThrowable = this.error;
            if (!PatchProxy.proxy(new Object[]{abstractC35210c, this, atomicThrowable}, null, C7L7.LIZ, true, 3).isSupported && getAndIncrement() == 0) {
                Throwable LIZ = atomicThrowable.LIZ();
                if (LIZ != null) {
                    abstractC35210c.onError(LIZ);
                } else {
                    abstractC35210c.onComplete();
                }
            }
        }
    }

    @Override // org.p3070a.AbstractC35210c
    public final void onError(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 7).isSupported && !isDisposed()) {
            this.mainSubscription.lazySet(AutoSubscriptionHelper.CANCELLED);
            AutoDisposableHelper.LIZ(this.scopeDisposable);
            AbstractC35210c<? super T> abstractC35210c = this.delegate;
            AtomicThrowable atomicThrowable = this.error;
            if (!PatchProxy.proxy(new Object[]{abstractC35210c, th, this, atomicThrowable}, null, C7L7.LIZ, true, 2).isSupported) {
                if (atomicThrowable.LIZ(th)) {
                    if (getAndIncrement() == 0) {
                        abstractC35210c.onError(atomicThrowable.LIZ());
                        return;
                    }
                    return;
                }
                C537207Jy.LIZ(th);
            }
        }
    }

    @Override // org.p3070a.AbstractC35210c
    public final void onNext(T t) {
        if (!PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 6).isSupported && !isDisposed()) {
            AbstractC35210c<? super T> abstractC35210c = this.delegate;
            AtomicThrowable atomicThrowable = this.error;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC35210c, t, this, atomicThrowable}, null, C7L7.LIZ, true, 1);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (get() != 0 || !compareAndSet(0, 1)) {
                return;
            } else {
                abstractC35210c.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
                Throwable LIZ = atomicThrowable.LIZ();
                if (LIZ != null) {
                    abstractC35210c.onError(LIZ);
                } else {
                    abstractC35210c.onComplete();
                }
            }
            this.mainSubscription.lazySet(AutoSubscriptionHelper.CANCELLED);
            AutoDisposableHelper.LIZ(this.scopeDisposable);
        }
    }

    @Override // p003X.C7LS, org.p3070a.AbstractC35210c
    public final void LIZ(AbstractC35211d abstractC35211d) {
        if (PatchProxy.proxy(new Object[]{abstractC35211d}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C7H2 c7h2 = new C7H2() { // from class: com.bytedance.android.live.core.utils.rxutils.autodispose.AutoDisposingSubscriberImpl.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(23991);
            }

            @Override // io.reactivex.AbstractC34963b
            public final void onComplete() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                    return;
                }
                AutoDisposingSubscriberImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
                AutoSubscriptionHelper.LIZ(AutoDisposingSubscriberImpl.this.mainSubscription);
            }

            @Override // io.reactivex.AbstractC34963b
            public final void onError(Throwable th) {
                if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                AutoDisposingSubscriberImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingSubscriberImpl.this.onError(th);
            }
        };
        if (C7HC.LIZ(this.scopeDisposable, c7h2, getClass())) {
            this.delegate.LIZ(this);
            this.scope.subscribe(c7h2);
            AtomicReference<AbstractC35211d> atomicReference = this.mainSubscription;
            Class<?> cls = getClass();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{atomicReference, abstractC35211d, cls}, null, C7HC.LIZ, true, 2);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else {
                C7HD.LIZ(abstractC35211d, "next is null");
                if (!atomicReference.compareAndSet(null, abstractC35211d)) {
                    abstractC35211d.cancel();
                    if (atomicReference.get() == AutoSubscriptionHelper.CANCELLED) {
                        return;
                    }
                    C7HC.LIZ(cls);
                    return;
                }
            }
            AtomicReference<AbstractC35211d> atomicReference2 = this.ref;
            AtomicLong atomicLong = this.requested;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{atomicReference2, atomicLong, abstractC35211d}, null, AutoSubscriptionHelper.changeQuickRedirect, true, 12);
            if (proxy2.isSupported) {
                ((Boolean) proxy2.result).booleanValue();
                return;
            }
            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{atomicReference2, abstractC35211d}, null, AutoSubscriptionHelper.changeQuickRedirect, true, 8);
            if (proxy3.isSupported) {
                if (!((Boolean) proxy3.result).booleanValue()) {
                    return;
                }
            } else {
                C7HD.LIZ(abstractC35211d, "s is null");
                if (!atomicReference2.compareAndSet(null, abstractC35211d)) {
                    abstractC35211d.cancel();
                    if (atomicReference2.get() == AutoSubscriptionHelper.CANCELLED || PatchProxy.proxy(new Object[0], null, AutoSubscriptionHelper.changeQuickRedirect, true, 4).isSupported) {
                        return;
                    }
                    C537207Jy.LIZ(new IllegalStateException("Subscription already set!"));
                    return;
                }
            }
            long andSet = atomicLong.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            abstractC35211d.request(andSet);
        }
    }

    @Override // org.p3070a.AbstractC35211d
    public final void request(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        AtomicReference<AbstractC35211d> atomicReference = this.ref;
        AtomicLong atomicLong = this.requested;
        if (!PatchProxy.proxy(new Object[]{atomicReference, atomicLong, new Long(j)}, null, AutoSubscriptionHelper.changeQuickRedirect, true, 13).isSupported) {
            AbstractC35211d abstractC35211d = atomicReference.get();
            if (abstractC35211d != null) {
                abstractC35211d.request(j);
                return;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, AutoSubscriptionHelper.changeQuickRedirect, true, 5);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (j <= 0) {
                C537207Jy.LIZ(new IllegalArgumentException("n > 0 required but it was " + j));
                return;
            }
            C7L2.LIZ(atomicLong, j);
            AbstractC35211d abstractC35211d2 = atomicReference.get();
            if (abstractC35211d2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    abstractC35211d2.request(andSet);
                }
            }
        }
    }

    public AutoDisposingSubscriberImpl(CompletableSource completableSource, AbstractC35210c<? super T> abstractC35210c) {
        this.scope = completableSource;
        this.delegate = abstractC35210c;
    }
}
