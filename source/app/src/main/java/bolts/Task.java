package bolts;

import bolts.C0608g;
import bolts.Task;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p003X.AbstractC142957e8d;
import p003X.C102462QWq;
import p003X.C142949e8V;
import p003X.C142950e8W;
import p003X.C142951e8X;
import p003X.C142952e8Y;
import p003X.C142953e8Z;
import p003X.C142954e8a;
import p003X.C142955e8b;
import p003X.C142956e8c;
import p003X.C520596hZ;
import p003X.C74709Fd1;
import p003X.RunnableC103501QpL;
import p003X.RunnableC103502QpM;
import p003X.RunnableC104025Qxn;
import p003X.RunnableC74069FIp;

/* loaded from: classes18.dex */
public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    public static final Executor IMMEDIATE_EXECUTOR;
    public static Task<?> TASK_CANCELLED;
    public static Task<Boolean> TASK_FALSE;
    public static Task<?> TASK_NULL;
    public static Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile AbstractC142957e8d unobservedExceptionHandler;
    public boolean cancelled;
    public boolean complete;
    public Exception error;
    public boolean errorHasBeenObserved;
    public TResult result;
    public C142953e8Z unobservedErrorNotifier;
    public final Object lock = new Object();
    public List<Continuation<TResult, Void>> continuations = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    public static AbstractC142957e8d getUnobservedExceptionHandler() {
        return unobservedExceptionHandler;
    }

    public static <TResult> Task<TResult>.C0604a create() {
        Task task = new Task();
        task.getClass();
        return new C0604a(task);
    }

    public Task() {
    }

    public TResult getResult() {
        TResult tresult;
        MethodCollector.m14708i(OpenAuthTask.f22015g);
        synchronized (this.lock) {
            try {
                tresult = this.result;
            } catch (Throwable th) {
                MethodCollector.m14707o(OpenAuthTask.f22015g);
                throw th;
            }
        }
        MethodCollector.m14707o(OpenAuthTask.f22015g);
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        MethodCollector.m14708i(120);
        synchronized (this.lock) {
            try {
                z = this.cancelled;
            } catch (Throwable th) {
                MethodCollector.m14707o(120);
                throw th;
            }
        }
        MethodCollector.m14707o(120);
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        MethodCollector.m14708i(119);
        synchronized (this.lock) {
            try {
                z = this.complete;
            } catch (Throwable th) {
                MethodCollector.m14707o(119);
                throw th;
            }
        }
        MethodCollector.m14707o(119);
        return z;
    }

    public Task<Void> makeVoid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWithTask((Continuation<TResult, Task<Void>>) new Continuation<TResult, Task<Void>>(this) { // from class: X.6I6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(2502);
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, bolts.Task<java.lang.Void>] */
            @Override // bolts.Continuation
            /* renamed from: then */
            public final /* synthetic */ Task<Void> mo29049then(Task task) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{task}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                return Task.forResult(null);
            }
        });
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(2486);
        BACKGROUND_EXECUTOR = C74709Fd1.LIZ();
        IMMEDIATE_EXECUTOR = C74709Fd1.LIZIZ.LIZJ;
        UI_THREAD_EXECUTOR = C520596hZ.LIZIZ.LIZJ;
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    public Exception getError() {
        Exception exc;
        MethodCollector.m14708i(123);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            Exception exc2 = (Exception) proxy.result;
            MethodCollector.m14707o(123);
            return exc2;
        }
        synchronized (this.lock) {
            try {
                if (this.error != null) {
                    this.errorHasBeenObserved = true;
                    if (this.unobservedErrorNotifier != null) {
                        this.unobservedErrorNotifier.LIZIZ = null;
                        this.unobservedErrorNotifier = null;
                    }
                }
                exc = this.error;
            } catch (Throwable th) {
                MethodCollector.m14707o(123);
                throw th;
            }
        }
        MethodCollector.m14707o(123);
        return exc;
    }

    public boolean isFaulted() {
        MethodCollector.m14708i(121);
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(121);
            return booleanValue;
        }
        synchronized (this.lock) {
            try {
                if (getError() != null) {
                    z = true;
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(121);
                throw th;
            }
        }
        MethodCollector.m14707o(121);
        return z;
    }

    public void waitForCompletion() {
        MethodCollector.m14708i(124);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            MethodCollector.m14707o(124);
            return;
        }
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(124);
                throw th;
            }
        }
        MethodCollector.m14707o(124);
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(2486);
        BACKGROUND_EXECUTOR = C74709Fd1.LIZ();
        IMMEDIATE_EXECUTOR = C74709Fd1.LIZIZ.LIZJ;
        UI_THREAD_EXECUTOR = C520596hZ.LIZIZ.LIZJ;
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    private void runContinuations() {
        MethodCollector.m14708i(128);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43).isSupported) {
            MethodCollector.m14707o(128);
            return;
        }
        synchronized (this.lock) {
            try {
                for (Continuation<TResult, Void> continuation : this.continuations) {
                    try {
                        try {
                            continuation.mo29049then(this);
                        } catch (RuntimeException e) {
                            MethodCollector.m14707o(128);
                            throw e;
                        }
                    } catch (Exception e2) {
                        RuntimeException runtimeException = new RuntimeException(e2);
                        MethodCollector.m14707o(128);
                        throw runtimeException;
                    }
                }
                this.continuations = null;
            } catch (Throwable th) {
                MethodCollector.m14707o(128);
                throw th;
            }
        }
        MethodCollector.m14707o(128);
    }

    public boolean trySetCancelled() {
        MethodCollector.m14708i(129);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(129);
            return booleanValue;
        }
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    MethodCollector.m14707o(129);
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                MethodCollector.m14707o(129);
                return true;
            } catch (Throwable th) {
                MethodCollector.m14707o(129);
                throw th;
            }
        }
    }

    /* renamed from: bolts.Task$a */
    /* loaded from: classes9.dex */
    public class C0604a extends C0608g<TResult> {
        static {
            Covode.recordClassIndex(2503);
        }

        public C0604a(Task task) {
        }
    }

    public static void setUnobservedExceptionHandler(AbstractC142957e8d abstractC142957e8d) {
        unobservedExceptionHandler = abstractC142957e8d;
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 27);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 31);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 35);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public Task(TResult tresult) {
        trySetResult(tresult);
    }

    public static Task<Void> delay(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return delay(j, C74709Fd1.LIZIZ(), null);
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{exc}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        C0608g c0608g = new C0608g();
        c0608g.LIZIZ(exc);
        return c0608g.LIZIZ;
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tresult}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        if (tresult == null) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            if (((Boolean) tresult).booleanValue()) {
                return (Task<TResult>) TASK_TRUE;
            }
            return (Task<TResult>) TASK_FALSE;
        }
        C0608g c0608g = new C0608g();
        c0608g.LIZIZ((C0608g) tresult);
        return c0608g.LIZIZ;
    }

    public static <TResult> Task<List<TResult>> whenAllResult(final Collection<? extends Task<TResult>> collection) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{collection}, null, changeQuickRedirect, true, 19);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return (Task<List<TResult>>) whenAll(collection).onSuccess((Continuation<Void, List<TResult>>) new Continuation<Void, List<TResult>>() { // from class: X.1MR
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(2491);
            }

            @Override // bolts.Continuation
            /* renamed from: then */
            public final /* synthetic */ Object mo29049then(Task<Void> task) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{task}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Task task2 : collection) {
                    arrayList.add(task2.getResult());
                }
                return arrayList;
            }
        });
    }

    public Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{collection}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        if (collection.size() == 0) {
            return forResult(null);
        }
        C0608g c0608g = new C0608g();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task<?> task : collection) {
            task.continueWith(new C102462QWq(obj, arrayList, atomicBoolean, atomicInteger, c0608g));
        }
        return (Task<TResult>) c0608g.LIZIZ;
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{collection}, null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        if (collection.size() == 0) {
            return forResult(null);
        }
        final C0608g c0608g = new C0608g();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task<?> task : collection) {
            task.continueWith(new Continuation<Object, Void>() { // from class: X.8NC
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(2490);
                }

                /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Void, java.lang.Object] */
                @Override // bolts.Continuation
                /* renamed from: then */
                public final /* synthetic */ Void mo29049then(Task<Object> task2) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{task2}, this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    if (atomicBoolean.compareAndSet(false, true)) {
                        c0608g.LIZIZ((C0608g) task2);
                        return null;
                    }
                    task2.getError();
                    return null;
                }
            });
        }
        return (Task<TResult>) c0608g.LIZIZ;
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{collection}, null, changeQuickRedirect, true, 17);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        if (collection.size() == 0) {
            return forResult(null);
        }
        C0608g c0608g = new C0608g();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task<TResult> task : collection) {
            task.continueWith(new C142952e8Y(atomicBoolean, c0608g));
        }
        return (Task<TResult>) c0608g.LIZIZ;
    }

    public boolean trySetError(Exception exc) {
        MethodCollector.m14708i(131);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 46);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(131);
            return booleanValue;
        }
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    MethodCollector.m14707o(131);
                    return false;
                }
                this.complete = true;
                this.error = exc;
                this.errorHasBeenObserved = false;
                this.lock.notifyAll();
                runContinuations();
                if (!this.errorHasBeenObserved && getUnobservedExceptionHandler() != null) {
                    this.unobservedErrorNotifier = new C142953e8Z(this);
                }
                MethodCollector.m14707o(131);
                return true;
            } catch (Throwable th) {
                MethodCollector.m14707o(131);
                throw th;
            }
        }
    }

    public boolean trySetResult(TResult tresult) {
        MethodCollector.m14708i(130);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tresult}, this, changeQuickRedirect, false, 45);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(130);
            return booleanValue;
        }
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    MethodCollector.m14707o(130);
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                MethodCollector.m14707o(130);
                return true;
            } catch (Throwable th) {
                MethodCollector.m14707o(130);
                throw th;
            }
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, c0605c}, null, changeQuickRedirect, true, 16);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return call(callable, IMMEDIATE_EXECUTOR, c0605c);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, c0605c}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return call(callable, BACKGROUND_EXECUTOR, c0605c);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, continuation}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, c0605c}, this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWith(continuation, IMMEDIATE_EXECUTOR, c0605c);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, c0605c}, this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, c0605c);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, c0605c}, this, changeQuickRedirect, false, 36);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, c0605c);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, c0605c}, this, changeQuickRedirect, false, 40);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, c0605c);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, executor}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return call(callable, executor, null);
    }

    public static Task<Void> delay(long j, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), c0605c}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return delay(j, C74709Fd1.LIZIZ(), c0605c);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWith(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor}, this, changeQuickRedirect, false, 29);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWithTask(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor}, this, changeQuickRedirect, false, 33);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return onSuccess(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor}, this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return onSuccessTask(continuation, executor, null);
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) {
        boolean isCompleted;
        MethodCollector.m14708i(C1399n.f22430f);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), timeUnit}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(C1399n.f22430f);
            return booleanValue;
        }
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(j));
                }
                isCompleted = isCompleted();
            } catch (Throwable th) {
                MethodCollector.m14707o(C1399n.f22430f);
                throw th;
            }
        }
        MethodCollector.m14707o(C1399n.f22430f);
        return isCompleted;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, continuation, c0605c}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, c0605c);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, executor, c0605c}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        C0608g c0608g = new C0608g();
        try {
            executor.execute(new RunnableC103501QpL(c0605c, c0608g, callable));
        } catch (Exception e) {
            c0608g.LIZIZ((Exception) new ExecutorException(e));
        }
        return c0608g.LIZIZ;
    }

    public static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), scheduledExecutorService, c0605c}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        if (c0605c != null && c0605c.LIZ()) {
            return cancelled();
        }
        if (j <= 0) {
            return forResult(null);
        }
        final C0608g c0608g = new C0608g();
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: bolts.Task.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(2487);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                C0608g.this.LIZ((C0608g) null);
            }
        }, j, TimeUnit.MILLISECONDS);
        if (c0605c != null) {
            c0605c.LIZ(new RunnableC74069FIp(schedule, c0608g));
        }
        return (Task<TResult>) c0608g.LIZIZ;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, continuation, executor}, this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWhile(callable, continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor, C0605c c0605c) {
        boolean isCompleted;
        MethodCollector.m14708i(126);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor, c0605c}, this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            Task<TContinuationResult> task = (Task) proxy.result;
            MethodCollector.m14707o(126);
            return task;
        }
        C0608g c0608g = new C0608g();
        synchronized (this.lock) {
            try {
                isCompleted = isCompleted();
                if (!isCompleted) {
                    this.continuations.add(new C142954e8a(this, c0608g, continuation, executor, c0605c));
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(126);
                throw th;
            }
        }
        if (isCompleted) {
            completeImmediately(c0608g, continuation, this, executor, c0605c);
        }
        Task task2 = (Task<TResult>) c0608g.LIZIZ;
        MethodCollector.m14707o(126);
        return task2;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, C0605c c0605c) {
        boolean isCompleted;
        MethodCollector.m14708i(127);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor, c0605c}, this, changeQuickRedirect, false, 30);
        if (proxy.isSupported) {
            Task<TContinuationResult> task = (Task) proxy.result;
            MethodCollector.m14707o(127);
            return task;
        }
        C0608g c0608g = new C0608g();
        synchronized (this.lock) {
            try {
                isCompleted = isCompleted();
                if (!isCompleted) {
                    this.continuations.add(new C142955e8b(this, c0608g, continuation, executor, c0605c));
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(127);
                throw th;
            }
        }
        if (isCompleted) {
            completeAfterTask(c0608g, continuation, this, executor, c0605c);
        }
        Task task2 = (Task<TResult>) c0608g.LIZIZ;
        MethodCollector.m14707o(127);
        return task2;
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor, c0605c}, this, changeQuickRedirect, false, 34);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWithTask(new C142950e8W(this, c0605c, continuation), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation, executor, c0605c}, this, changeQuickRedirect, false, 38);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        return continueWithTask(new C142951e8X(this, c0605c, continuation), executor);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.e8V, T] */
    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor, C0605c c0605c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{callable, continuation, executor, c0605c}, this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (Task) proxy.result;
        }
        C142956e8c c142956e8c = new C142956e8c();
        c142956e8c.LIZ = new C142949e8V(this, c0605c, callable, continuation, executor, c142956e8c);
        return makeVoid().continueWithTask((Continuation) c142956e8c.LIZ, executor);
    }

    public static <TContinuationResult, TResult> void completeAfterTask(C0608g<TContinuationResult> c0608g, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, C0605c c0605c) {
        if (PatchProxy.proxy(new Object[]{c0608g, continuation, task, executor, c0605c}, null, changeQuickRedirect, true, 42).isSupported) {
            return;
        }
        try {
            executor.execute(new RunnableC104025Qxn(c0605c, c0608g, continuation, task));
        } catch (Exception e) {
            c0608g.LIZIZ(new ExecutorException(e));
        }
    }

    public static <TContinuationResult, TResult> void completeImmediately(C0608g<TContinuationResult> c0608g, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, C0605c c0605c) {
        if (PatchProxy.proxy(new Object[]{c0608g, continuation, task, executor, c0605c}, null, changeQuickRedirect, true, 41).isSupported) {
            return;
        }
        try {
            executor.execute(new RunnableC103502QpM(c0605c, c0608g, continuation, task));
        } catch (Exception e) {
            c0608g.LIZIZ(new ExecutorException(e));
        }
    }
}
