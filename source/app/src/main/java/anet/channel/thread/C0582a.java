package anet.channel.thread;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.thread.a */
/* loaded from: classes2.dex */
public class C0582a extends PThreadPoolExecutor {
    static {
        Covode.recordClassIndex(2353);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C0583a(callable);
    }

    /* renamed from: anet.channel.thread.a$a */
    /* loaded from: classes2.dex */
    public class C0583a<V> extends FutureTask<V> implements Comparable<C0583a<V>> {

        /* renamed from: b */
        public Object f20824b;

        static {
            Covode.recordClassIndex(2354);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C0583a<V> c0583a) {
            if (this == c0583a) {
                return 0;
            }
            if (c0583a == null) {
                return -1;
            }
            Object obj = this.f20824b;
            if (obj != null && c0583a.f20824b != null && obj.getClass().equals(c0583a.f20824b.getClass())) {
                Object obj2 = this.f20824b;
                if (obj2 instanceof Comparable) {
                    return ((Comparable) obj2).compareTo(c0583a.f20824b);
                }
            }
            return 0;
        }

        public C0583a(Callable<V> callable) {
            super(callable);
            this.f20824b = callable;
        }

        public C0583a(Runnable runnable, V v) {
            super(runnable, v);
            this.f20824b = runnable;
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C0583a(runnable, t);
    }

    public C0582a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }
}
