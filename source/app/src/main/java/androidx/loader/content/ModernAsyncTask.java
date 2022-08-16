package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p003X.AbstractCallableC145643eq3;
import p003X.C145644eq4;
import p003X.HandlerC145642eq2;

/* loaded from: classes19.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final ThreadFactory LIZ = new ThreadFactory() { // from class: androidx.loader.content.ModernAsyncTask.1
        public final AtomicInteger LIZ = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(1431);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.LIZ.getAndIncrement());
        }
    };
    public static final BlockingQueue<Runnable> LIZIZ = new LinkedBlockingQueue(10);
    public static final Executor LIZJ;
    public static HandlerC145642eq2 LJII;
    public static volatile Executor LJIIIIZZ;

    /* renamed from: LJ */
    public volatile Status f20266LJ = Status.PENDING;
    public final AtomicBoolean LJFF = new AtomicBoolean();
    public final AtomicBoolean LJI = new AtomicBoolean();
    public final AbstractCallableC145643eq3<Params, Result> LJIIIZ = new AbstractCallableC145643eq3<Params, Result>() { // from class: androidx.loader.content.ModernAsyncTask.2
        static {
            Covode.recordClassIndex(1432);
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            ModernAsyncTask.this.LJI.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.LIZ((Object[]) this.LIZIZ);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    };
    public final FutureTask<Result> LIZLLL = new FutureTask<Result>(this.LJIIIZ) { // from class: androidx.loader.content.ModernAsyncTask.3
        static {
            Covode.recordClassIndex(1433);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                ModernAsyncTask.this.LIZJ(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.LIZJ(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    public abstract Result LIZ(Params... paramsArr);

    public void LIZ(Result result) {
    }

    public void LIZIZ(Result result) {
    }

    public final boolean LIZ() {
        return this.LJFF.get();
    }

    public static Handler LIZIZ() {
        HandlerC145642eq2 handlerC145642eq2;
        synchronized (ModernAsyncTask.class) {
            if (LJII == null) {
                LJII = new HandlerC145642eq2();
            }
            handlerC145642eq2 = LJII;
        }
        return handlerC145642eq2;
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$4 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C03314 {
        public static final /* synthetic */ int[] LIZ = new int[Status.values().length];

        static {
            Covode.recordClassIndex(1434);
            try {
                LIZ[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes19.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED;

        static {
            Covode.recordClassIndex(1435);
        }
    }

    static {
        Covode.recordClassIndex(1430);
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, LIZIZ, LIZ);
        LIZJ = pThreadPoolExecutor;
        LJIIIIZZ = pThreadPoolExecutor;
    }

    public final void LIZJ(Result result) {
        if (!this.LJI.get()) {
            LIZLLL(result);
        }
    }

    public final Result LIZLLL(Result result) {
        LIZIZ().obtainMessage(1, new C145644eq4(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: LJ */
    public final void m21137LJ(Result result) {
        if (LIZ()) {
            LIZIZ(result);
        } else {
            LIZ((ModernAsyncTask<Params, Progress, Result>) result);
        }
        this.f20266LJ = Status.FINISHED;
    }

    public final ModernAsyncTask<Params, Progress, Result> LIZ(Executor executor, Params... paramsArr) {
        if (this.f20266LJ != Status.PENDING) {
            int i = C03314.LIZ[this.f20266LJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f20266LJ = Status.RUNNING;
        this.LJIIIZ.LIZIZ = null;
        executor.execute(this.LIZLLL);
        return this;
    }
}
