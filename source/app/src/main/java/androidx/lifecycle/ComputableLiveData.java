package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p003X.C144366eVM;

/* loaded from: classes19.dex */
public abstract class ComputableLiveData<T> {
    public final AtomicBoolean mComputing;
    public final Executor mExecutor;
    public final AtomicBoolean mInvalid;
    public final Runnable mInvalidationRunnable;
    public final LiveData<T> mLiveData;
    public final Runnable mRefreshRunnable;

    static {
        Covode.recordClassIndex(1348);
    }

    public abstract T compute();

    public LiveData<T> getLiveData() {
        return this.mLiveData;
    }

    public ComputableLiveData() {
        this(C144366eVM.LIZJ());
    }

    public void invalidate() {
        C144366eVM.LIZ().LIZJ(this.mInvalidationRunnable);
    }

    public ComputableLiveData(Executor executor) {
        this.mInvalid = new AtomicBoolean(true);
        this.mComputing = new AtomicBoolean(false);
        this.mRefreshRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData.2
            static {
                Covode.recordClassIndex(1350);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                do {
                    if (ComputableLiveData.this.mComputing.compareAndSet(false, true)) {
                        Object obj = null;
                        boolean z = false;
                        while (ComputableLiveData.this.mInvalid.compareAndSet(true, false)) {
                            try {
                                obj = ComputableLiveData.this.compute();
                                z = true;
                            } finally {
                                ComputableLiveData.this.mComputing.set(false);
                            }
                        }
                        if (z) {
                            ComputableLiveData.this.mLiveData.postValue(obj);
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (ComputableLiveData.this.mInvalid.get());
            }
        };
        this.mInvalidationRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData.3
            static {
                Covode.recordClassIndex(1351);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean hasActiveObservers = ComputableLiveData.this.mLiveData.hasActiveObservers();
                if (ComputableLiveData.this.mInvalid.compareAndSet(false, true) && hasActiveObservers) {
                    ComputableLiveData.this.mExecutor.execute(ComputableLiveData.this.mRefreshRunnable);
                }
            }
        };
        this.mExecutor = executor;
        this.mLiveData = new LiveData<T>() { // from class: androidx.lifecycle.ComputableLiveData.1
            static {
                Covode.recordClassIndex(1349);
            }

            @Override // androidx.lifecycle.LiveData
            public final void onActive() {
                ComputableLiveData.this.mExecutor.execute(ComputableLiveData.this.mRefreshRunnable);
            }
        };
    }
}
