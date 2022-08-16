package androidx.core.util;

import com.bytedance.covode.number.Covode;
import p003X.T5W;

/* loaded from: classes10.dex */
public final class Pools {
    static {
        Covode.recordClassIndex(1050);
    }

    /* loaded from: classes10.dex */
    public static class SynchronizedPool<T> extends T5W<T> {
        public final Object mLock = new Object();

        static {
            Covode.recordClassIndex(1051);
        }

        @Override // p003X.T5W, p003X.T5X
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        public SynchronizedPool(int i) {
            super(i);
        }

        @Override // p003X.T5W, p003X.T5X
        public boolean release(T t) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(t);
            }
            return release;
        }
    }
}
