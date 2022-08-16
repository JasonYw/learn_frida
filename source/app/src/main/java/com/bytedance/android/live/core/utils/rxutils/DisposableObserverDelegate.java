package com.bytedance.android.live.core.utils.rxutils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DisposableObserverDelegate<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Function0<Unit> doOnDispose;
    public final Observer<T> downstream;

    static {
        Covode.recordClassIndex(23974);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.downstream.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(th);
        this.downstream.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        this.downstream.onNext(t);
    }

    /* renamed from: com.bytedance.android.live.core.utils.rxutils.DisposableObserverDelegate$1 */
    /* loaded from: classes22.dex */
    public static final class C41501 extends Lambda implements Function0<Unit> {
        public static final C41501 INSTANCE = new C41501();

        static {
            Covode.recordClassIndex(23975);
        }

        public C41501() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* bridge */ /* synthetic */ Unit mo30099invoke() {
            return Unit.INSTANCE;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper disposableHelper;
        Disposable andSet;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported && get() != (disposableHelper = DisposableHelper.DISPOSED) && (andSet = getAndSet(disposableHelper)) != disposableHelper) {
            if (andSet != null) {
                andSet.dispose();
            }
            this.doOnDispose.mo30099invoke();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (get() != DisposableHelper.DISPOSED) {
            return false;
        }
        return true;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        if (!compareAndSet(null, disposable)) {
            disposable.dispose();
        } else {
            this.downstream.onSubscribe(disposable);
        }
    }

    public DisposableObserverDelegate(Observer<T> observer, Function0<Unit> function0) {
        C106862S5w.LIZ(observer, function0);
        this.downstream = observer;
        this.doOnDispose = function0;
    }

    public /* synthetic */ DisposableObserverDelegate(Observer observer, Function0 function0, int i) {
        this(observer, C41501.INSTANCE);
    }
}
