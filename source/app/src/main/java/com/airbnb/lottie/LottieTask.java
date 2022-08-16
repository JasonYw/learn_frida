package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import p003X.C115836Vio;
import p003X.C116971W2r;
import p003X.C145320ekm;
import p003X.C145328eku;

/* loaded from: classes13.dex */
public class LottieTask<T> {
    public static Executor EXECUTOR;
    public final Set<LottieListener<Throwable>> failureListeners;
    public final Handler handler;
    public volatile LottieResult<T> result;
    public final Set<LottieListener<T>> successListeners;
    public FutureTask<LottieResult<T>> task;
    public Thread taskObserver;

    public synchronized void notifyFailureListeners(Throwable th) {
        MethodCollector.m14708i(322);
        m20544x85a7e041(this, th);
        MethodCollector.m14707o(322);
    }

    public synchronized void notifySuccessListeners(Object obj) {
        MethodCollector.m14708i(320);
        m20543xc73509e8(this, obj);
        MethodCollector.m14707o(320);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(3962);
        EXECUTOR = C116971W2r.LIZLLL();
    }

    private void notifyListeners() {
        this.handler.post(new Runnable() { // from class: com.airbnb.lottie.LottieTask.1
            static {
                if (ReDexClinitStringAb.abTest >= 5) {
                    Covode.recordClassIndex(3963);
                } else {
                    Covode.recordClassIndex(3963);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (LottieTask.this.result != null) {
                    if (!C145328eku.LIZ && LottieTask.this.task != null && LottieTask.this.task.isCancelled()) {
                        return;
                    }
                    LottieResult<T> lottieResult = LottieTask.this.result;
                    if (lottieResult.getValue() != null) {
                        LottieTask.this.notifySuccessListeners(lottieResult.getValue());
                    } else {
                        LottieTask.this.notifyFailureListeners(lottieResult.getException());
                    }
                }
            }
        });
    }

    private boolean taskObserverAlive() {
        Thread thread = this.taskObserver;
        if (thread != null && thread.isAlive()) {
            return true;
        }
        return false;
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(3962);
        EXECUTOR = C116971W2r.LIZLLL();
    }

    private synchronized void startTaskObserverIfNeeded() {
        MethodCollector.m14708i(324);
        if (!taskObserverAlive() && this.result == null) {
            this.taskObserver = new Thread("LottieTaskObserver") { // from class: com.airbnb.lottie.LottieTask.2
                public boolean LIZIZ;

                static {
                    Covode.recordClassIndex(3964);
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    while (!isInterrupted() && !this.LIZIZ) {
                        if (LottieTask.this.task.isDone()) {
                            try {
                                LottieTask.this.setResult(LottieTask.this.task.get());
                            } catch (InterruptedException | ExecutionException e) {
                                LottieTask.this.setResult(new LottieResult<>(e));
                            }
                            this.LIZIZ = true;
                            LottieTask.this.stopTaskObserverIfNeeded();
                        }
                    }
                }
            };
            this.taskObserver.start();
            C0810L.debug("Starting TaskObserver thread");
            MethodCollector.m14707o(324);
            return;
        }
        MethodCollector.m14707o(324);
    }

    public synchronized void stopTaskObserverIfNeeded() {
        MethodCollector.m14708i(325);
        if (!taskObserverAlive()) {
            MethodCollector.m14707o(325);
            return;
        }
        if (this.successListeners.isEmpty() || this.result != null) {
            this.taskObserver.interrupt();
            this.taskObserver = null;
            C0810L.debug("Stopping TaskObserver thread");
        }
        MethodCollector.m14707o(325);
    }

    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        MethodCollector.m14708i(318);
        this.failureListeners.remove(lottieListener);
        if (!C145328eku.LIZ && this.task != null) {
            stopTaskObserverIfNeeded();
        }
        MethodCollector.m14707o(318);
        return this;
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        MethodCollector.m14708i(316);
        this.successListeners.remove(lottieListener);
        if (!C145328eku.LIZ && this.task != null) {
            stopTaskObserverIfNeeded();
        }
        MethodCollector.m14707o(316);
        return this;
    }

    public void setResult(LottieResult<T> lottieResult) {
        if (this.result == null) {
            this.result = lottieResult;
            notifyListeners();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        MethodCollector.m14708i(317);
        if (this.result != null && this.result.getException() != null) {
            lottieListener.onResult(this.result.getException());
        }
        this.failureListeners.add(lottieListener);
        if (!C145328eku.LIZ && this.task != null) {
            startTaskObserverIfNeeded();
        }
        MethodCollector.m14707o(317);
        return this;
    }

    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
        MethodCollector.m14708i(315);
        if (this.result != null && this.result.getValue() != null) {
            lottieListener.onResult(this.result.getValue());
        }
        this.successListeners.add(lottieListener);
        if (!C145328eku.LIZ && this.task != null) {
            startTaskObserverIfNeeded();
        }
        MethodCollector.m14707o(315);
        return this;
    }

    public synchronized void com_airbnb_lottie_LottieTask__notifyFailureListeners$___twin___(Throwable th) {
        MethodCollector.m14708i(323);
        ArrayList<LottieListener> arrayList = new ArrayList(this.failureListeners);
        if (arrayList.isEmpty()) {
            MethodCollector.m14707o(323);
            return;
        }
        for (LottieListener lottieListener : arrayList) {
            lottieListener.onResult(th);
        }
        MethodCollector.m14707o(323);
    }

    public synchronized void com_airbnb_lottie_LottieTask__notifySuccessListeners$___twin___(T t) {
        MethodCollector.m14708i(321);
        for (LottieListener lottieListener : new ArrayList(this.successListeners)) {
            lottieListener.onResult(t);
        }
        MethodCollector.m14707o(321);
    }

    /* renamed from: com_airbnb_lottie_LottieTask_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_notifyFailureListeners */
    public static void m20544x85a7e041(LottieTask lottieTask, Throwable th) {
        try {
            lottieTask.com_airbnb_lottie_LottieTask__notifyFailureListeners$___twin___(th);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com_airbnb_lottie_LottieTask_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_notifySuccessListeners */
    public static void m20543xc73509e8(LottieTask lottieTask, Object obj) {
        MethodCollector.m14708i(319);
        synchronized (lottieTask) {
            try {
                lottieTask.com_airbnb_lottie_LottieTask__notifySuccessListeners$___twin___(obj);
            } catch (Throwable th) {
                MethodCollector.m14707o(319);
                throw th;
            }
        }
        MethodCollector.m14707o(319);
    }

    public LottieTask(Callable<LottieResult<T>> callable, boolean z) {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.result = null;
        if (z) {
            try {
                setResult(callable.call());
            } catch (Throwable th) {
                setResult(new LottieResult<>(th));
            }
        } else if (C145328eku.LIZ) {
            if (C145328eku.LJIIIZ) {
                try {
                    EXECUTOR.execute(new C115836Vio(this, callable));
                    return;
                } catch (Throwable th2) {
                    if (!C145320ekm.LIZ) {
                        return;
                    }
                    throw th2;
                }
            }
            EXECUTOR.execute(new C115836Vio(this, callable));
        } else {
            this.task = new FutureTask<>(callable);
            EXECUTOR.execute(this.task);
            startTaskObserverIfNeeded();
        }
    }
}
