package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import p002O.C0002O;
import p003X.C144366eVM;
import p003X.C144369eVP;

/* loaded from: classes19.dex */
public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public int mActiveCount;
    public boolean mChangingActiveState;
    public volatile Object mData;
    public final Object mDataLock;
    public boolean mDispatchInvalidated;
    public boolean mDispatchingValue;
    public SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers;
    public volatile Object mPendingData;
    public final Runnable mPostValueRunnable;
    public int mVersion;

    public void onActive() {
    }

    public void onInactive() {
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes19.dex */
    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner LIZ;

        static {
            Covode.recordClassIndex(1369);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public void detachObserver() {
            this.LIZ.mo29786getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return this.LIZ.mo29786getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            if (this.LIZ == lifecycleOwner) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.LIZ.mo29786getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                activeStateChanged(shouldBeActive());
                state = currentState;
                currentState = this.LIZ.mo29786getLifecycle().getCurrentState();
            }
        }

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.LIZ = lifecycleOwner;
        }
    }

    static {
        Covode.recordClassIndex(1367);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean hasObservers() {
        if (this.mObservers.size() > 0) {
            return true;
        }
        return false;
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            static {
                Covode.recordClassIndex(1368);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
        this.mData = NOT_SET;
        this.mVersion = -1;
    }

    /* loaded from: classes19.dex */
    public abstract class ObserverWrapper {
        public boolean mActive;
        public int mLastVersion = -1;
        public final Observer<? super T> mObserver;

        static {
            Covode.recordClassIndex(1370);
        }

        public void detachObserver() {
        }

        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean shouldBeActive();

        public void activeStateChanged(boolean z) {
            int i;
            if (z == this.mActive) {
                return;
            }
            this.mActive = z;
            LiveData liveData = LiveData.this;
            if (this.mActive) {
                i = 1;
            } else {
                i = -1;
            }
            liveData.changeActiveCounter(i);
            if (this.mActive) {
                LiveData.this.dispatchingValue(this);
            }
        }

        public ObserverWrapper(Observer<? super T> observer) {
            this.mObserver = observer;
        }
    }

    public static void assertMainThread(String str) {
        if (C144366eVM.LIZ().LIZLLL()) {
            return;
        }
        throw new IllegalStateException(C0002O.m25085C("Cannot invoke ", str, " on a background thread"));
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (!z) {
            return;
        }
        C144366eVM.LIZ().LIZIZ(this.mPostValueRunnable);
    }

    public void removeObserver(Observer<? super T> observer) {
        assertMainThread("removeObserver");
        LiveData<T>.ObserverWrapper remove = this.mObservers.remove(observer);
        if (remove == null) {
            return;
        }
        remove.detachObserver();
        remove.activeStateChanged(false);
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    private void considerNotify(LiveData<T>.ObserverWrapper observerWrapper) {
        if (!observerWrapper.mActive) {
            return;
        }
        if (!observerWrapper.shouldBeActive()) {
            observerWrapper.activeStateChanged(false);
            return;
        }
        int i = observerWrapper.mLastVersion;
        int i2 = this.mVersion;
        if (i >= i2) {
            return;
        }
        observerWrapper.mLastVersion = i2;
        observerWrapper.mObserver.onChanged((Object) this.mData);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0028 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void changeActiveCounter(int r5) {
        /*
            r4 = this;
            int r0 = r4.mActiveCount
            int r5 = r5 + r0
            r4.mActiveCount = r5
            boolean r1 = r4.mChangingActiveState
            if (r1 == 0) goto La
            return
        La:
            r1 = 1
            r4.mChangingActiveState = r1
        Ld:
            r3 = 0
            int r1 = r4.mActiveCount     // Catch: java.lang.Throwable -> L35
            if (r0 == r1) goto L32
            if (r0 != 0) goto L19
            int r1 = r4.mActiveCount     // Catch: java.lang.Throwable -> L35
            if (r1 <= 0) goto L19
            goto L22
        L19:
            r2 = 0
            if (r0 <= 0) goto L23
            int r0 = r4.mActiveCount     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L23
            r1 = 1
            goto L24
        L22:
            r2 = 1
        L23:
            r1 = 0
        L24:
            int r0 = r4.mActiveCount     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L2c
            r4.onActive()     // Catch: java.lang.Throwable -> L35
            goto Ld
        L2c:
            if (r1 == 0) goto Ld
            r4.onInactive()     // Catch: java.lang.Throwable -> L35
            goto Ld
        L32:
            r4.mChangingActiveState = r3
            return
        L35:
            r0 = move-exception
            r4.mChangingActiveState = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LiveData.changeActiveCounter(int):void");
    }

    public void dispatchingValue(LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                considerNotify(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper>.C0220d iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    considerNotify((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observeForever(Observer<? super T> observer) {
        assertMainThread("observeForever");
        C144369eVP c144369eVP = new C144369eVP(this, observer);
        LiveData<T>.ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, c144369eVP);
        if (!(putIfAbsent instanceof LifecycleBoundObserver)) {
            if (putIfAbsent != null) {
                return;
            }
            c144369eVP.activeStateChanged(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper> next = it.next();
            if (next.getValue().isAttachedTo(lifecycleOwner)) {
                removeObserver(next.getKey());
            }
        }
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            static {
                Covode.recordClassIndex(1368);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
        this.mData = t;
        this.mVersion = 0;
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.mo29786getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
        if (putIfAbsent != null) {
            if (putIfAbsent.isAttachedTo(lifecycleOwner)) {
                return;
            }
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        lifecycleOwner.mo29786getLifecycle().addObserver(lifecycleBoundObserver);
    }
}
