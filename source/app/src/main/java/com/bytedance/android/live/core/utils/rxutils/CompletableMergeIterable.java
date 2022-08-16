package com.bytedance.android.live.core.utils.rxutils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.AbstractC34963b;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p003X.C536617Hr;
import p003X.C537207Jy;
import p003X.QSH;

/* loaded from: classes23.dex */
public final class CompletableMergeIterable extends Completable {
    public static ChangeQuickRedirect LIZ;
    public final Iterable<? extends CompletableSource> LIZIZ;

    static {
        Covode.recordClassIndex(23972);
    }

    /* loaded from: classes23.dex */
    public static final class MergeCompletableObserver extends AtomicBoolean implements AbstractC34963b {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        public static final long serialVersionUID = -7730517613164279224L;
        public final AbstractC34963b downstream;
        public final CompositeDisposable set;
        public final AtomicInteger wip;

        static {
            Covode.recordClassIndex(23973);
        }

        @Override // io.reactivex.AbstractC34963b
        public final void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported && this.wip.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC34963b
        public final void onSubscribe(Disposable disposable) {
            if (PatchProxy.proxy(new Object[]{disposable}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            this.set.add(disposable);
        }

        @Override // io.reactivex.AbstractC34963b
        public final void onError(Throwable th) {
            if (PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            this.set.dispose();
            if (compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                C537207Jy.LIZ(th);
            }
        }

        public MergeCompletableObserver(AbstractC34963b abstractC34963b, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.downstream = abstractC34963b;
            this.set = compositeDisposable;
            this.wip = atomicInteger;
        }
    }

    public CompletableMergeIterable(Iterable<? extends CompletableSource> iterable) {
        this.LIZIZ = iterable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(AbstractC34963b abstractC34963b) {
        if (PatchProxy.proxy(new Object[]{abstractC34963b}, this, LIZ, false, 1).isSupported) {
            return;
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        abstractC34963b.onSubscribe(compositeDisposable);
        try {
            Iterator<? extends CompletableSource> it = this.LIZIZ.iterator();
            C536617Hr.LIZ(it, "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(abstractC34963b, compositeDisposable, atomicInteger);
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            CompletableSource next = it.next();
                            C536617Hr.LIZ(next, "The iterator returned a null CompletableSource");
                            CompletableSource completableSource = next;
                            if (compositeDisposable.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completableSource.subscribe(mergeCompletableObserver);
                        } catch (Throwable th) {
                            QSH.LIZIZ(th);
                            compositeDisposable.dispose();
                            mergeCompletableObserver.onError(th);
                            return;
                        }
                    } else {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                } catch (Throwable th2) {
                    QSH.LIZIZ(th2);
                    compositeDisposable.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            QSH.LIZIZ(th3);
            abstractC34963b.onError(th3);
        }
    }
}
